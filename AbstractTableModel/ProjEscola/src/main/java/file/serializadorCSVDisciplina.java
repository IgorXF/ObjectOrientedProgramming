/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package file;


import classe.Aluno;
import classe.Disciplina;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author  igorxf
 */
public class serializadorCSVDisciplina {
     public String toCSV(List<Disciplina> disciplinas) {
        String csv = "Nome; ProfM; Semestre; Horario, Alunos\n";
        for (Disciplina disc: disciplinas) {
            csv += disc.getNome()+ ";"
                    + disc.getProfM()+ ";"
                    + disc.getSemestre()+ ";"
                    + disc.getHorario()+ ";"
                    + disc.getAlunos()+ ";\n";

        }
        return csv;
    }

    public List <Disciplina> fromCSV(String data) {
        List <Disciplina> disciplinas = new ArrayList<>();

     String[] linhas = data.split("\n");
    for (int i = 1; i < linhas.length; i++) {
        String[] partes = linhas[i].split(";");
        if (partes.length >= 5) {
            List<Aluno> alunos = new ArrayList<>();
            if (partes[4] != null && !partes[4].isEmpty()) {
                String[] alunosDados = partes[4].split(",");
                for (String alunoDados : alunosDados) {
                    String[] dados = alunoDados.split("-"); // supondo que os dados sejam separados por um "-"
                    if (dados.length == 5) { // Ajuste conforme necessário
                        Aluno aluno = new Aluno(dados[0], dados[1], dados[2], dados[3], dados[4]);
                        alunos.add(aluno);
                    }
                }
            }

            Disciplina disc = new Disciplina(
                partes[0],
                partes[1], 
                partes[2], 
                partes[3],
                alunos
            );
                disciplinas.add(disc);
            }
        }
        return disciplinas;
    }
    
}
