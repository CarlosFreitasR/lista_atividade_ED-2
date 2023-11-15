package dev.senzalla;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ListMenu {
    RECURSIVIDADE("1 - Calcular o fatorial de um número usando recursividade."),
    MATRIZ("2 - Construa uma matriz de 2 linhas e 3 colunas."),
    BUSCA_BINARIA("3 - Responda: Sobre Busca Binaria"),
    ARVORE("4 - Responda: Sobre Arvore Binaria"),
    ORDENE_FUNCAO("5 - Ordene as funções a seguir pela ordem de complexidade"),
    TEMPO_EXECUCAO("6 - Analise seu tempo usando a notação “big-Oh”."),
    TEMPO_EXECUCAO2("7 - Analise seu tempo usando a notação “big-Oh”."),
    BUBBLE_SORT("8 - Demostre o passo a passo do Bubble Sort."),
    MERGE_SORT("8 - Demostre o passo a passo do Merge Sort."),
    ;
    private final String opcao;
}