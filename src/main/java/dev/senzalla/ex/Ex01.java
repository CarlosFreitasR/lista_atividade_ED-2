package dev.senzalla.ex;

import java.util.Scanner;

public class Ex01 {
    public void calcularFatorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatorial: ");
        int num = scanner.nextInt();
        System.out.printf("O fatorial de %d é %d", num, fatorial(num));
    }

    private int fatorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fatorial(num - 1);
    }
}
