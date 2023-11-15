package dev.senzalla;

import dev.senzalla.ex.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<ListMenu> listMenus = List.of(ListMenu.values());
        int opcao = 0;
        while (opcao >= 0 && opcao < listMenus.size()) {
            System.out.println("##############################################");
            System.out.println("********* Escolha a Atividade a Testar *********");
            for (ListMenu listMenu : listMenus) {
                System.out.println(listMenu.getOpcao());
            }
            opcao = scanner.nextInt() - 1;
            if (opcao >= 0 && opcao < listMenus.size()) {
                System.out.printf("\n\nVocê escolheu a opção %s\n\n", listMenus.get(opcao).getOpcao());
            }
            new Main().irAtividade(opcao);
            System.out.println("\n\n\n\n\n");
        }
        System.out.println("******************* Adeus ********************");
        System.out.println("##############################################");


    }

    private void irAtividade(int opcao) {
        switch (opcao) {
            case 0 -> new Ex01().calcularFatorial();
            case 1 -> new Ex02().construirMatriz();
            case 2 -> new Ex03().buscaBinaria();
            case 3 -> new Ex04().arvoreBinaria();
            case 4 -> new Ex05().ordeneFuncao();
            case 5 -> new Ex06().tempoExecucao();
            case 6 -> new Ex07().tempoExecucao();
            case 7 -> new Ex08().bubbleSort();
            case 8 -> new Ex09().mergeSort();
        }
    }
}