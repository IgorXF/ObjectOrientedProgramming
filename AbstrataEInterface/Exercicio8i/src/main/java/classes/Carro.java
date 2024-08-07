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
public class Carro implements Veiculo {
    @Override
    public void entrarEstacionamento() {
        System.out.println("Carro entrou no estacionamento.");
    }
    @Override
    public void sairEstacionamento() {
        System.out.println("Carro saiu do estacionamento.");
    }
}
