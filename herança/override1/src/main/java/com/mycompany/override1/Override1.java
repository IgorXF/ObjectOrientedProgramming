/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.override1;

import classes.Eletronico;
import classes.Movel;
import classes.Perecivel;

/**
 *
 * @author igorxf
 */
public class Override1 {

    public static void main(String[] args) {
        Eletronico eletronico = new Eletronico(450.0, 1, "Notebook Gamer", 5000.0, 7000.0, true);
        Movel movel = new Movel("Madeira Maciça", 2, "Cadeira Escritório", 300, 450, true);
        Perecivel perecivel = new Perecivel(7, 3, "Queijo", 10, 15, true);

        eletronico.imprimir();
        System.out.println("Desconto: " + eletronico.calcularDesconto() 
        + ", Custo Adicional: " + eletronico.calcularCustoAdicional() + "\n");

        movel.imprimir();
        System.out.println("Custo Adicional: " + movel.calcularCustoAdicional() + "\n");

        perecivel.imprimir();
        System.out.println("Estoque: " + perecivel.verificarEstoque() 
        + ", Custo Adicional: " + perecivel.calcularCustoAdicional());
    }
}
