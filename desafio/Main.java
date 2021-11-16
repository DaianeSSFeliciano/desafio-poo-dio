package desafio02;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();

        curso.setTitulo("Curso Java");
        curso.setDescricao("descricao curso java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setData(LocalDate.now());

        System.out.println(curso2);
        System.out.println(mentoria);

    }
}
