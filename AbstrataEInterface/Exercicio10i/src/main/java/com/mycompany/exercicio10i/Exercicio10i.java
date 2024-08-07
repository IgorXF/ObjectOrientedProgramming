/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio10i;

import classes.Alimento;
import classes.Eletronico;
import classes.Roupa;
import interfaces.Produto;

/**
 *
 * @author igorxf
 */
public class Exercicio10i {

    public static void main(String[] args) {
        Produto eletronico = new Eletronico(1000.00); 
        Produto roupa = new Roupa(200.00);
        Produto alimento = new Alimento(50.00);

        exibirDesconto(eletronico);
        exibirDesconto(roupa);
        exibirDesconto(alimento);
    }

    public static void exibirDesconto(Produto produto) {
        double desconto = produto.calculaDesconto();
        System.out.println("Desconto: R$ " + desconto);
    }
}
