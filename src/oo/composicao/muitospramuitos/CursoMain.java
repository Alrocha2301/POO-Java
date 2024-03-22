package oo.composicao.muitospramuitos;

public class CursoMain {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Java");
        Curso curso2 = new Curso("Angular");
        Curso curso3 = new Curso("React");
        Curso curso4 = new Curso("Python");
        Curso curso5 = new Curso("C#");

        Aluno aluno1 = new Aluno("Alexandre");
        var aluno2 = new Aluno("Aline");
        var aluno3 = new Aluno("Anny");

        aluno1.adicionarCurso(curso1);
        aluno1.adicionarCurso(curso2);
        aluno1.adicionarCurso(curso3);
        aluno1.adicionarCurso(curso4);
        aluno1.adicionarCurso(curso2);
        aluno1.adicionarCurso(curso5);

        aluno3.adicionarCurso(curso1);

        curso3.adicionarAluno(aluno2);

        aluno2.adicionarCurso(curso1);

        //System.out.printf("Alunos do curso de %s: %s", curso1.nome, curso1.alunosMatriculados());
        //System.out.printf("\nCursos de %s: %s", aluno1.nome, aluno1.cursosMatriculados());

        System.out.println(aluno1.apresentacao());

    }
}
