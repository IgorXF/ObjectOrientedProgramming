/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio2p;

import abstracts.MeioPagamento;
import classes.Boleto;
import classes.CartaoCredito;
import classes.CartaoDebito;
import java.util.Scanner;

/**
 *
 * @author igorxf
 */
public class Exercicio2p {

    public static void main(String[] args) {
        MeioPagamento cartaoCredito = new CartaoCredito();
        MeioPagamento cartaoDebito = new CartaoDebito();
        MeioPagamento boleto = new Boleto();
        
        pagar(cartaoCredito);
        pagar(cartaoDebito);
        pagar(boleto);
    }
    
    static void pagar(MeioPagamento m){
        double valor = 0.0;
        Scanner ler = new Scanner(System.in);
        System.out.println("Valor do pagamento: ");
        if (ler.hasNextDouble()) {
            valor = ler.nextDouble();
        } else {
            System.out.println("Valor inválido.");
            return;
        }
        m.efetuarPagamento(valor);
    }
}
