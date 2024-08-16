/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversormoedas;

import classes.ConversorMoedaDolar;
import classes.ConversorMoedaReal;
import classes.ServicoFinanceiro;
import interfaces.IConversorMoeda;

/**
 *
 * @author igorxf
 */
public class ConversorMoedas {

    public static void main(String[] args) {
       IConversorMoeda converteReal = new ConversorMoedaReal();
       IConversorMoeda converteDolar = new ConversorMoedaDolar();
       
       ServicoFinanceiro sReal = new ServicoFinanceiro(converteReal);
       ServicoFinanceiro sDolar = new ServicoFinanceiro(converteDolar);
       
       sReal.realizarTransacao(8000.0);
       sDolar.realizarTransacao(359.0);
    }
}
