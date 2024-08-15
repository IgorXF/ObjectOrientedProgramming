/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesConcretas;

import Interface.ILogStorage;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author 14626232639
 */
public class ArquivoLogStorage implements ILogStorage{
    
    @Override
    public void armazenar(String mensagem){
        String nomeArquivo = "Arquivo";
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nomeArquivo))) {
            escritor.write(mensagem);
            System.out.println("Mensagem salvo com sucesso no arquivo: " + nomeArquivo);
        } catch (IOException e) {
            System.err.println("Mensagem ao salvar o texto no arquivo: " + e.getMessage());
        }
    }
}
