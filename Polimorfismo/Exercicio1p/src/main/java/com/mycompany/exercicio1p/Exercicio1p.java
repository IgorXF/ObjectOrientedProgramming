/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio1p;

import classes.Guerreiro;
import classes.Mago;
import interfaces.Atacante;

/**
 *
 * @author igorxf
 */
public class Exercicio1p {

    public static void main(String[] args) {
        Atacante srArthur = new Guerreiro();
        Atacante merlin = new Mago();
        
        atacarInimigo(srArthur, merlin);
    }
    
    static void atacarInimigo(Atacante a, Atacante b){
        a.atacar();
        b.atacar();
    }
}
