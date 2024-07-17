/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heranca1;

import classes.Eletronico;
import classes.Movel;
import classes.Perecivel;

/**
 *
 * @author igorxf
 */
public class Heranca1 {

    public static void main(String[] args) {
        Eletronico cell = new Eletronico();
        Perecivel manga = new Perecivel();
        Movel cama = new Movel();
        cell.preencher();
        manga.preencher();
        cama.preencher();
        cell.imprimir();
        manga.imprimir();
        cama.imprimir();
    }
}
