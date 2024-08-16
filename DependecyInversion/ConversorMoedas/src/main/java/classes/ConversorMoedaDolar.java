/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import interfaces.IConversorMoeda;

/**
 *
 * @author igorxf
 */
public class  ConversorMoedaDolar implements IConversorMoeda{
    
    @Override
    public void converterParaReal(double dolar) {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                                                                                              ");
        System.out.println("Convertendo para Real... ");
        System.out.println("US$" +dolar+ " em Reais é: R$" +  dolar * 5.47);
        System.out.println("                                                                                              ");
        System.out.println("------------------------------------------------------------------------------");
    }

    @Override
    public void converterParaDolar(double real) {
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("                                                                                              ");
        System.out.println("Convertendo para Dolar...");
        System.out.println("R$"+real+ "em Dolares é: US$" + real / 5.47);
        System.out.println("                                                                                              ");
        System.out.println("------------------------------------------------------------------------------");
    }
}
