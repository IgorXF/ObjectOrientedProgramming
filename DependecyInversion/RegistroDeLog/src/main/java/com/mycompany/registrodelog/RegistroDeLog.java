/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrodelog;

import classesConcretas.ArquivoLogStorage;
import classesConcretas.ConsoleLogStorage;
import interfaces.ILogStorage;
import java.util.Scanner;

/**
 *
 * @author igorxf
 */
public class RegistroDeLog {

    public static void main(String[] args) {
        ILogStorage logArquivo = new ArquivoLogStorage();
        ILogStorage logConsole = new ConsoleLogStorage();
        
        logArquivo.armazenar("Hear me roar.");
        logConsole.armazenar("Dracarys");
        //armazenaLogs();
    }
    
    /**static void armazenaLogs(){
        ILogStorage log;
        String mensagem = " ";
        int a;
        Scanner ler = new Scanner(System.in);
        System.out.println("Você deseja armazenar no console (aperte 1) ou no arquivo (aperte 2)?");
        a = ler.nextInt();
        ler.nextLine();
         if(a == 2){
            log = new ArquivoLogStorage();
            System.out.println("Digite sua mensagem: ");
            mensagem = ler.nextLine();
            log.armazenar(mensagem);
         } else if(a == 1){
            log = new ConsoleLogStorage();
            System.out.println("Digite sua mensagem: ");
            mensagem = ler.nextLine();
            log.armazenar(mensagem);
         }
    }
    * */
}
