/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemasbancarios;

/**
 *
 * @author 26174738
 */


import javax.swing.JOptionPane;

public class Sistemasbancarios {

    public static void main(String[] args) {

        int opcao;

        do {

            String menu =
                    "=== SISTEMA BANCÁRIO ===\n\n"
                    + "1 - Conta Corrente\n"
                    + "2 - Conta Poupança\n"
                    + "0 - Sair";

            String entrada = JOptionPane.showInputDialog(menu);

            // Se apertar Cancelar
            if (entrada == null) {
                opcao = 0;
            } else {
                opcao = Integer.parseInt(entrada);
            }

            switch (opcao) {

                case 1:
                    criarContaCorrente();
                    break;

                case 2:
                    criarContaPoupanca();
                    break;

                case 0:
                    JOptionPane.showMessageDialog(
                            null,
                            "Sistema encerrado."
                    );
                    break;

                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opção inválida!"
                    );
            }

        } while (opcao != 0);
    }

    // ==========================================
    // CONTA CORRENTE
    // ==========================================

    public static void criarContaCorrente() {

        String entradaNumero = JOptionPane.showInputDialog(
                "Digite o número da conta:"
        );

        if (entradaNumero == null) {
            return;
        }

        int numero = Integer.parseInt(entradaNumero);

        String titular = JOptionPane.showInputDialog(
                "Digite o nome do titular:"
        );

        if (titular == null) {
            return;
        }

        String entradaLimite = JOptionPane.showInputDialog(
                "Digite o limite da conta:"
        );

        if (entradaLimite == null) {
            return;
        }

        double limite = Double.parseDouble(entradaLimite);

        ContaCorrente conta =
                new ContaCorrente(numero, titular, limite);

        int opcao;

        do {

            String menu =
                    "=== CONTA CORRENTE ===\n\n"
                    + "1 - Consultar saldo\n"
                    + "2 - Depositar\n"
                    + "3 - Sacar\n"
                    + "4 - Consultar limite\n"
                    + "0 - Sair";

            String entrada = JOptionPane.showInputDialog(menu);

            if (entrada == null) {
                opcao = 0;
            } else {
                opcao = Integer.parseInt(entrada);
            }

            switch (opcao) {

                case 1:

                    JOptionPane.showMessageDialog(
                            null,
                            "Titular: " + conta.getTitular()
                            + "\nNúmero: " + conta.getNumero()
                            + "\nSaldo: R$ "
                            + String.format(
                                    "%.2f",
                                    conta.getSaldo()
                            )
                    );

                    break;

                case 2:

                    String entradaDeposito =
                            JOptionPane.showInputDialog(
                                    "Digite o valor do depósito:"
                            );

                    if (entradaDeposito == null) {
                        break;
                    }

                    double deposito =
                            Double.parseDouble(entradaDeposito);

                    if (deposito > 0) {

                        conta.depositar(deposito);

                        JOptionPane.showMessageDialog(
                                null,
                                "Depósito realizado com sucesso!"
                        );

                    } else {

                        JOptionPane.showMessageDialog(
                                null,
                                "O valor deve ser maior que zero!"
                        );
                    }

                    break;

                case 3:

                    String entradaSaque =
                            JOptionPane.showInputDialog(
                                    "Digite o valor do saque:"
                            );

                    if (entradaSaque == null) {
                        break;
                    }

                    double saque =
                            Double.parseDouble(entradaSaque);

                    if (conta.sacar(saque)) {

                        JOptionPane.showMessageDialog(
                                null,
                                "Saque realizado com sucesso!"
                        );

                    } else {

                        JOptionPane.showMessageDialog(
                                null,
                                "Saque não permitido!"
                        );
                    }

                    break;

                case 4:

                    JOptionPane.showMessageDialog(
                            null,
                            "Limite disponível: R$ "
                            + String.format(
                                    "%.2f",
                                    conta.getLimite()
                            )
                    );

                    break;

                case 0:
                    break;

                default:

                    JOptionPane.showMessageDialog(
                            null,
                            "Opção inválida!"
                    );
            }

        } while (opcao != 0);
    }

    // ==========================================
    // CONTA POUPANÇA
    // ==========================================

    public static void criarContaPoupanca() {

        String entradaNumero = JOptionPane.showInputDialog(
                "Digite o número da conta:"
        );

        if (entradaNumero == null) {
            return;
        }

        int numero = Integer.parseInt(entradaNumero);

        String titular = JOptionPane.showInputDialog(
                "Digite o nome do titular:"
        );

        if (titular == null) {
            return;
        }

        String entradaTaxa = JOptionPane.showInputDialog(
                "Digite a taxa de rendimento (%):"
        );

        if (entradaTaxa == null) {
            return;
        }

        double taxaRendimento =
                Double.parseDouble(entradaTaxa);

        ContaPoupanca conta =
                new ContaPoupanca(
                        numero,
                        titular,
                        taxaRendimento
                );

        int opcao;

        do {

            String menu =
                    "=== CONTA POUPANÇA ===\n\n"
                    + "1 - Consultar saldo\n"
                    + "2 - Depositar\n"
                    + "3 - Sacar\n"
                    + "4 - Aplicar rendimento\n"
                    + "0 - Sair";

            String entrada = JOptionPane.showInputDialog(menu);

            if (entrada == null) {
                opcao = 0;
            } else {
                opcao = Integer.parseInt(entrada);
            }

            switch (opcao) {

                case 1:

                    JOptionPane.showMessageDialog(
                            null,
                            "Titular: " + conta.getTitular()
                            + "\nNúmero: " + conta.getNumero()
                            + "\nSaldo: R$ "
                            + String.format(
                                    "%.2f",
                                    conta.getSaldo()
                            )
                    );

                    break;

                case 2:

                    String entradaDeposito =
                            JOptionPane.showInputDialog(
                                    "Digite o valor do depósito:"
                            );

                    if (entradaDeposito == null) {
                        break;
                    }

                    double deposito =
                            Double.parseDouble(entradaDeposito);

                    if (deposito > 0) {

                        conta.depositar(deposito);

                        JOptionPane.showMessageDialog(
                                null,
                                "Depósito realizado com sucesso!"
                        );

                    } else {

                        JOptionPane.showMessageDialog(
                                null,
                                "O valor deve ser maior que zero!"
                        );
                    }

                    break;

                case 3:

                    String entradaSaque =
                            JOptionPane.showInputDialog(
                                    "Digite o valor do saque:"
                            );

                    if (entradaSaque == null) {
                        break;
                    }

                    double saque =
                            Double.parseDouble(entradaSaque);

                    if (conta.sacar(saque)) {

                        JOptionPane.showMessageDialog(
                                null,
                                "Saque realizado com sucesso!"
                        );

                    } else {

                        JOptionPane.showMessageDialog(
                                null,
                                "Saque não permitido!"
                        );
                    }

                    break;

                case 4:

                    conta.aplicarRendimento();

                    JOptionPane.showMessageDialog(
                            null,
                            "Rendimento aplicado!\n"
                            + "Novo saldo: R$ "
                            + String.format(
                                    "%.2f",
                                    conta.getSaldo()
                            )
                    );

                    break;

                case 0:
                    break;

                default:

                    JOptionPane.showMessageDialog(
                            null,
                            "Opção inválida!"
                    );
            }

        } while (opcao != 0);
    }
}