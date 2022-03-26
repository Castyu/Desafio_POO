package DIO;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescrição("descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Js");
        curso2.setDescrição("descrição curso Js");
        curso2.setCargaHoraria(2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("mentoria Java");
        mentoria1.setDescrição("descrição mentoria Java");
        mentoria1.setData(LocalDate.now());




        Bootcamp bootcamp  = new Bootcamp();
        bootcamp.setNome("Bootcamp Java" );
        bootcamp.setDescrição("descrição");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devCaio = new Dev();
        devCaio.setNome("Caio");
        devCaio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos" + devCaio.getConteudosInscritos());
        devCaio.progredir();
        System.out.println("Conteudos concluidos" + devCaio.getConteudosConcluidos());
        System.out.println("Conteudos inscritos" + devCaio.getConteudosInscritos());
        System.out.println("xp" + devCaio.calcularXp());





    }
}
