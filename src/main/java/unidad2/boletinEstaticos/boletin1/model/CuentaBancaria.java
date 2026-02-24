package unidad2.boletinEstaticos.boletin1.model;

import java.time.LocalDate;

public class CuentaBancaria {
    private double saldo;
    private LocalDate apertura;
    private int identificador;
    private static int incremento; //cada vez que se cree una cuenta se debe de incrementar
    private String iban;
    private Cliente titular;
    private String autorizado; // puede ser null

    public CuentaBancaria(double saldo, LocalDate apertura, String iban, Cliente titular) {
        this.saldo = saldo;
        this.apertura = apertura;
        this.iban = iban;
        incremento = incremento + 1;
        this.titular = titular;
        this.identificador = incremento;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getApertura() {
        return apertura;
    }

    public void setApertura(LocalDate apertura) {
        this.apertura = apertura;
    }

    public static int getIncremento() {
        return incremento;
    }

    public static void setIncremento(int incremento) {
        CuentaBancaria.incremento = incremento;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public String getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(String autorizado) {
        this.autorizado = autorizado;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                ", apertura=" + apertura +
                ", iban='" + iban + '\'' +
                ", titular=" + titular.getNombre() +
                ", autorizado='" + autorizado + '\'' +
                ", identificador=" + identificador +
                '}';
    }
}
