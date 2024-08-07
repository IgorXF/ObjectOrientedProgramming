/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import abstratas.Produtop;
import interfaces.Produto;

/**
 *
 * @author igorxf
 */
public class Eletronico extends Produtop implements Produto {

    public Eletronico(double preco) {
        super(preco);
    }


    @Override
    public double calculaDesconto() {
        return super.preco * 0.10;
    }
}
