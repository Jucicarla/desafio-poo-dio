package br.com.dio.desafio.dominio;


import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        //encapsulamento
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("Conteudo basico de Java");
        mentoria.setData(LocalDate.now());

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        //intanciar
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamo Java DEveloper");
        bootcamp.setDescricao("Descrição bootcamo Java Dev");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devJucicarla = new Dev();
        devJucicarla.setNome("Jucicarla");
        devJucicarla.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Jucicarla:"+ devJucicarla.getConteudosInscritos());
        devJucicarla.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Jucicarla"+ devJucicarla.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Jucicarla:"+ devJucicarla.getConteudoConcluidos());
        System.out.println("XP: "+ devJucicarla.calcularTotalXp());

        System.out.println("---------");

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Lucas:"+ devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Lucas:"+ devLucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Lucas:"+ devJucicarla.getConteudoConcluidos());
        System.out.println("XP: "+ devLucas.calcularTotalXp());

    }


}
