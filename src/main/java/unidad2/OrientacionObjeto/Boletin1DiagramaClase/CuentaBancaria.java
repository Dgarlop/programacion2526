package unidad2.OrientacionObjeto.Boletin1DiagramaClase;

import java.util.Scanner;

public class CuentaBancaria {
    private String numeroCuenta;
    private Double saldo;
    private String titular;
    private Persona autorizado;

    public CuentaBancaria(String numeroCuenta, Double saldo, String titular, Persona autorizado) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
        this.autorizado = autorizado;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Persona getAutorizado() {
        return autorizado;
    }

    public void setAutorizado(Persona autorizado) {
        this.autorizado = autorizado;
    }

    public void IngresarDinero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica cuanto dinero quieres ingresar");
        int cantidad =  sc.nextInt();
        if (cantidad>0){
            saldo = saldo + cantidad;
            System.out.println(saldo);
        }

    }
    public void RetirarDinero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica cuanto dinero quieres retirar");
        int cantidad =  sc.nextInt();
        if (cantidad>0 && saldo>=cantidad){
            saldo = saldo - cantidad;
            System.out.println(saldo);
        }
    }

    public void EleminarAutorizado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el dni del autorizado quieres eleminar");
        String eleminar = sc.next();
        if (autorizado.getDni().equals(eleminar)){
            autorizado.setDni(" ");
            System.out.println("autorizado eleminado");
        }
        else{
            System.out.println("DNI no correcto");
        }
    }

    public void ValidarAutorizado(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el dni del autorizado a validar");
        String eleminar = sc.next();
        if (autorizado.getDni().equals(eleminar)){
            System.out.println("Valdiacion correcta");
            System.out.println(autorizado.toString());
        }
        else{
            System.out.println("DNI no correcto");
        }
    }
}
