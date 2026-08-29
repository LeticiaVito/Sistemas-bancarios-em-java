/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemasbancarios;

/**
 *
 * @author 26174738
 */


public class ContaPoupanca extends ContaBancaria {

    private double taxaRendimento;

    // Construtor vazio
    public ContaPoupanca() {
        super();
        taxaRendimento = 0;
    }

    // Construtor com parâmetros
    public ContaPoupanca(
            int numero,
            String titular,
            double taxaRendimento) {

        super(numero, titular);
        this.taxaRendimento = taxaRendimento;
    }

    // Getter da taxa
    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    // Setter da taxa
    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    // Aplicar rendimento
    public void aplicarRendimento() {

        double rendimento =
                getSaldo() * taxaRendimento / 100;

        depositar(rendimento);
    }
}
