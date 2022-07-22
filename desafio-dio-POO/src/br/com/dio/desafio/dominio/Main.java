package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java 1");
		curso1.setDescricao("Descrição curso Java 1");
		curso1.setCargaHoraria(8);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("Curso Java 2");
		curso2.setDescricao("Descrição curso Java 2");
		curso2.setCargaHoraria(4);
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java 1");
		mentoria.setDescricao("Descrição da mentoria Java 1");
		mentoria.setData(LocalDate.now());
		
		/*System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(mentoria);*/
		
		Bootcamp bootcamp =new Bootcamp();
		bootcamp.setNome("Bootcamp Java Developer");
		bootcamp.setDescricao("Descrição Bootcamp Java Developer");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev devPamela = new Dev();
		devPamela.setNome("Pamela");
		devPamela.inscreverBootcamp(bootcamp);
		System.out.println("\nConteúdos Inscritos, Pamela: " + devPamela.getConteudosInscritos());
		devPamela.progredir();
		devPamela.progredir();
		System.out.println("\nConteúdos Inscritos, Pamela: " + devPamela.getConteudosInscritos());
		System.out.println("\nConteúdos Concluídos, Pamela: " + devPamela.getConteudosConcluidos());
		System.out.println("XP: " +devPamela.calcularTotalXp());
		
		System.out.println("\n----------------------------------------\n");
		
		Dev devPatrick = new Dev();
		devPatrick.setNome("Patrick");
		devPatrick.inscreverBootcamp(bootcamp);
		System.out.println("\nConteúdos Inscritos, Patrick: " + devPatrick.getConteudosInscritos());
		devPatrick.progredir();
		devPatrick.progredir();
		devPatrick.progredir();
		System.out.println("\nConteúdos Inscritos, Patrick: " + devPatrick.getConteudosInscritos());
		System.out.println("\nConteúdos Concluídos, Patrick: " + devPatrick.getConteudosConcluidos());
		System.out.println("XP: " +devPatrick.calcularTotalXp());

	}

}
