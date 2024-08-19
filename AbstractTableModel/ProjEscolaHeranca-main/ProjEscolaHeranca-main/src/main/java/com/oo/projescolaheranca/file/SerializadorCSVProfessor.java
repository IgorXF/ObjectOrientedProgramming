package com.oo.projescolaheranca.file;

/**
 *
 * @author igorxf
 */

import com.oo.projescolaheranca.classes.Professor;
import java.util.ArrayList;
import java.util.List;

public class SerializadorCSVProfessor {

    // Serializa a lista de professores para uma String no formato CSV
    public String toCSV(List<Professor> professores) {
        String csv = "CPF;Nome;Sexo;Idade;\n";
        for (Professor professor : professores) {
            csv += professor.getCpf() + ";"
                    + professor.getNome() + ";"
                    + professor.getSexo() + ";"
                    + professor.getIdade() + ";\n";
        }
        return csv;
    }

    // Deserializa uma String no formato CSV para uma lista de professores
    public List<Professor> fromCSV(String data) {
        List<Professor> professores = new ArrayList<>();

        String[] linhas = data.split("\n");
        // Ignora o cabeçalho
        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(";");
            if (partes.length >= 4) {
                Professor professor = new Professor();
                professor.setCpf(partes[0]);
                professor.setNome(partes[1]);
                professor.setSexo(partes[2].charAt(0)); // Assume que sexo é armazenado como um char
                professor.setIdade(Integer.parseInt(partes[3]));

                // Após montar um professor, adiciono na lista
                professores.add(professor);
            }
        }
        return professores;
    }
}
