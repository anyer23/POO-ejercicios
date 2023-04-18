/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

/**
 *
 * @author monte
 */
public class ElemtentoCuenta {
    private String nombre;
    private int numeroCuenta;
    private int vencimiento;
    private int cantidadCuenta;
    private int NIP;

    public ElemtentoCuenta() {
    }

    public ElemtentoCuenta(String nombre, int numeroCuenta, int vencimiento, int NIP) {
        this.nombre = nombre;
        this.numeroCuenta = numeroCuenta;
        this.vencimiento = vencimiento;
        this.NIP = NIP;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public int getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(int vencimiento) {
        this.vencimiento = vencimiento;
    }

    public int getCantidadCuenta() {
        return cantidadCuenta;
    }

    public void setCantidadCuenta(int cantidadCuenta) {
        this.cantidadCuenta = cantidadCuenta;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }
    
    
    
}
