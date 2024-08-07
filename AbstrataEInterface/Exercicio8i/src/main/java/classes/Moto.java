/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.Veiculo;

/**
 *
 * @author igorxf
 */
public class Moto implements Veiculo {
    @Override
    public void entrarEstacionamento() {
        System.out.println("Moto entrou no estacionamento.");
    }

    @Override
    public void sairEstacionamento() {
        System.out.println("Moto saiu do estacionamento.");
    }
}

