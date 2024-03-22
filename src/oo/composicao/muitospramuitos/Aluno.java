package oo.composicao.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    String nome;
    List<Curso> cursos = new ArrayList<>();

    void adicionarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            this.cursos.add(curso);
            curso.alunos.add(this);
        }
    }

    Aluno(String nome) {
        this.nome = nome;
    }

    public StringBuilder cursosMatriculados() {
        StringBuilder texto = new StringBuilder();

        if (cursos.isEmpty()) {
            texto.append("Sem cursos matriculados");
        } else {
            for (int i = 0; i < cursos.size(); i++) {
                texto.append(cursos.get(i).nome);
                if (i < cursos.size() - 2) {
                    texto.append(", ");
                } else if (i < cursos.size() - 1) {
                    texto.append(" e ");
                } else {
                    texto.append(".");
                }
            }
        }

        return texto;
    }

    StringBuilder apresentacao() {
        StringBuilder texto = new StringBuilder();
        texto.append(String.format("Sou %s e estou matriculado nos cursos: ", this.nome));
        texto.append(this.cursosMatriculados());

        return texto;
    }
}


