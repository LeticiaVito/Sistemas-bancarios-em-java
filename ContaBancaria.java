/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemasbancarios;

/**
 *
 * @author 26174738
 */
public class ContaBancaria {

    private int numero;
    private String titular;
    private double saldo;

    // Construtor vazio
    public ContaBancaria() {
        saldo = 0;
    }

    // Construtor com parâmetros
    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        saldo = 0;
    }

    // Getter do número
    public int getNumero() {
        return numero;
    }

    // Setter do número
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Getter do titular
    public String getTitular() {
        return titular;
    }

    // Setter do titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Getter do saldo
    public double getSaldo() {
        return saldo;
    }

    // Depositar
    public void depositar(double valor) {

        if (valor > 0) {
            saldo += valor;
        }
    }

    // Sacar
    public boolean sacar(double valor) {

        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        }

        return false;
    }
}