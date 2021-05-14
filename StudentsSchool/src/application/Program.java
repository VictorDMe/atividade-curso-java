package application;

import entities.Students;
import entities.Turma;
import entities.TurmaMedio;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.print("Quantos estudantes serão digitados? ");
        int quant = read.nextInt();
        System.out.println();

        List<Students> students = new ArrayList<>();

        for (int i = 0; i < quant; i++) {
            System.out.println("Dados do " + (i + 1) + "° aluno: ");
            read.nextLine();
            System.out.print("Nome do aluno: ");
            String nome = read.nextLine();
            System.out.print("Matricula: ");
            int matricula = read.nextInt();
            System.out.print("Idade: ");
            int idade = read.nextInt();
            System.out.print("Turma: ");
            char turma = read.next().toUpperCase().charAt(0);
            System.out.print("Ano: ");
            int ano = read.nextInt();
            System.out.print("Estudante do ensino médio (s / n): ");
            char option = read.next().toLowerCase().charAt(0);

            if (option == 's')
                students.add(new Students(matricula, idade, nome, new TurmaMedio(ano, turma)));
            else if (option == 'n')
                students.add(new Students(matricula, idade, nome, new Turma(ano, turma)));

            System.out.println();
        }
        System.out.println();
        System.out.println("Alunos digitados: \n");
        for (Students stu : students) {
            System.out.println(stu.toString());
        }

        read.close();
    }
}