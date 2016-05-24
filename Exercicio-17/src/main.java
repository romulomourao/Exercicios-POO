
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author romulo
 */
public class main {

    /**
     *
     * 17 - Leia um número decimal (até 3 dígitos) e escreva o seu equivalente
     * em numeração romana
     */
    public static void main(String[] args) {
        LerNumero();

    }

    private static void LerNumero() {
        Scanner in = new Scanner(System.in);
        boolean rodando = true;
        while (rodando) {
            System.out.print("Digite o numero: ");
            int num = in.nextInt();
            in.nextLine();
            if (num < 1) {
                rodando = false;
                break;
            }
            converteParaRomano(num);
            System.out.println("---------------");

        }

    }

    private static void converteParaRomano(int num) {
        int copiaNum = num;
        String resp = "";
        int parteInteira = 0;
        String[] romanos = new String[]{"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int[] inteiros = new int[]{1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        for (int i = inteiros.length - 1; i >= 0; i--) {
            parteInteira = num / inteiros[i];
            if(parteInteira!=0){
                num %= inteiros[i];
            while (parteInteira > 0) {
                resp += romanos[i];
                parteInteira--;
            }
            }
            

        }
        System.out.println(copiaNum + " em Romanos é: " + resp);
    }

}
