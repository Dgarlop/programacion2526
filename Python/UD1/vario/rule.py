import tkinter as tk
import random
from tkinter import messagebox

# Números y colores típicos de una ruleta
ruleta = [
    ('0', 'green'),
    ('32', 'red'), ('15', 'black'), ('19', 'red'), ('4', 'black'),
    ('21', 'red'), ('2', 'black'), ('25', 'red'), ('17', 'black'),
    ('34', 'red'), ('6', 'black'), ('27', 'red'), ('13', 'black'),
    ('36', 'red'), ('11', 'black'), ('30', 'red'), ('8', 'black'),
    ('23', 'red'), ('10', 'black'), ('5', 'red'), ('24', 'black'),
    ('16', 'red'), ('33', 'black'), ('1', 'red'), ('20', 'black'),
    ('14', 'red'), ('31', 'black'), ('9', 'red'), ('22', 'black'),
    ('18', 'red'), ('29', 'black'), ('7', 'red'), ('28', 'black'),
    ('12', 'red'), ('35', 'black'), ('3', 'red'), ('26', 'black')
]

class RuletaApp:
    def __init__(self, root):
        self.root = root
        self.root.title("🎰 Ruleta de Apuestas con Animación")

        # Entrada de apuesta
        tk.Label(root, text="Apuesta a un número (0 - 36):", font=("Helvetica", 12)).pack(pady=5)
        self.entrada_apuesta = tk.Entry(root, font=("Helvetica", 14), justify="center")
        self.entrada_apuesta.pack(pady=5)

        # Botón para girar
        self.boton_girar = tk.Button(root, text="🎡 Girar Ruleta", command=self.iniciar_giro,
                                     font=("Helvetica", 14), bg="green", fg="white")
        self.boton_girar.pack(pady=10)

        # Resultado
        self.resultado = tk.Label(root, text="", font=("Helvetica", 16))
        self.resultado.pack(pady=20)

        # Canvas visual
        self.canvas = tk.Canvas(root, width=300, height=300)
        self.canvas.pack()
        self.circulo = self.canvas.create_oval(50, 50, 250, 250, fill="lightgray")
        self.numero_actual = self.canvas.create_text(150, 150, text="", font=("Helvetica", 36))

        # Variables para animación
        self.contador_animacion = 0
        self.animacion_max = 30
        self.numero_final = None
        self.color_final = None
        self.apuesta = None

    def iniciar_giro(self):
        apuesta = self.entrada_apuesta.get()

        if not apuesta.isdigit() or not (0 <= int(apuesta) <= 36):
            messagebox.showerror("Error", "Ingresa un número válido entre 0 y 36.")
            return

        self.apuesta = str(int(apuesta))  # Eliminar ceros a la izquierda
        self.numero_final, self.color_final = random.choice(ruleta)
        self.contador_animacion = 0
        self.boton_girar.config(state="disabled")
        self.resultado.config(text="")
        self.animar_giro()

    def animar_giro(self):
        if self.contador_animacion < self.animacion_max:
            numero, color = random.choice(ruleta)
            self.canvas.itemconfig(self.circulo, fill=color)
            self.canvas.itemconfig(self.numero_actual, text=numero, fill="white" if color != "white" else "black")
            self.contador_animacion += 1

            # Efecto de frenado: más lento hacia el final
            delay = int(50 + self.contador_animacion * 5)
            self.root.after(delay, self.animar_giro)
        else:
            # Mostrar resultado final
            self.canvas.itemconfig(self.circulo, fill=self.color_final)
            self.canvas.itemconfig(self.numero_actual, text=self.numero_final,
                                   fill="white" if self.color_final != "white" else "black")

            if self.apuesta == self.numero_final:
                texto = f"🎉 ¡Ganaste! Salió el {self.numero_final} ({self.color_final})"
                color_texto = "green"
            else:
                texto = f"❌ Perdiste. Salió el {self.numero_final} ({self.color_final})"
                color_texto = "red"

            self.resultado.config(text=texto, fg=color_texto)
            self.boton_girar.config(state="normal")

# Ejecutar app
root = tk.Tk()
app = RuletaApp(root)
root.mainloop()
