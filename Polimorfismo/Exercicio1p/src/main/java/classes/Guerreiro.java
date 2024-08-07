/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.Atacante;

/**
 *
 * @author igorxf
 */
public class Guerreiro implements Atacante {
    @Override
    public void atacar() {
        System.out.println("Chuva de aço!");
    }
}
