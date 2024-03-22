package oo.composicao.muitospramuitos;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    String nome;
    List<Aluno> alunos = new ArrayList<>();

    void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.cursos.add(this);
    }

    Curso(String nome) {
        this.nome = nome;
    }

    StringBuilder alunosMatriculados() {
        StringBuilder texto = new StringBuilder();

        if (alunos.isEmpty()) {
            texto.append("Sem cursos matriculados");
        } else {
            for (int i = 0; i < alunos.size(); i++) {
                texto.append(alunos.get(i).nome);
                if (i < alunos.size() - 2) {
                    texto.append(", ");
                } else if (i < alunos.size() - 1) {
                    texto.append(" e ");
                } else {
                    texto.append(".");
                }
            }
        }
        return texto;
    }
}
