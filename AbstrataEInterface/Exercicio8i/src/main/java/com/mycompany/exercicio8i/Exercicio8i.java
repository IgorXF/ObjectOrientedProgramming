/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio8i;

import classes.Carro;
import classes.Moto;
import interfaces.Veiculo;

/**
 *
 * @author igorxf
 */
public class Exercicio8i {

    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        
        System.out.println("Testando Carro:");
        carro.entrarEstacionamento();
        carro.sairEstacionamento();
        
        System.out.println("Testando Moto:");
        moto.entrarEstacionamento();
        moto.sairEstacionamento();
    }
}
