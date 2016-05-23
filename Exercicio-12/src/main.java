
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
     * 12 - Ordenar um vetor de 100 numeros inteiros gerados aleatoriamente
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Tamanho do vetor que será criado: ");
        int tam = in.nextInt();
        in.nextLine();
        
        int[] vetor = new int[tam];
        geraVetor(vetor);
        System.out.println("Aqui está o seu vetor de "+tam+" posições gerado aleatoriamente");
        imprimeVetor(vetor);        
        ordenaVetorCrescente(vetor);
        System.out.println("");
        System.out.println("Aqui está o vetor de "+tam+" posições ordenado de forma crescente");
        imprimeVetor(vetor);
        ordenaVetorDecrescente(vetor);
        System.out.println("");
        System.out.println("Aqui está o vetor de "+tam+" posições ordenado de forma decrescente");
        imprimeVetor(vetor);
    }

    private static void geraVetor(int[] vetor) {
        int aleatorio;
        for (int i = 0; i < vetor.length; i++) {
            aleatorio = (int) (Math.random() * 100);
            vetor[i] = aleatorio;

        }
    }

    private static void imprimeVetor(int[] vetor) {
        System.out.print("{");
        for (int i = 0; i < vetor.length-1; i++) {  
            System.out.print(+vetor[i] +",");
            
        }
        System.out.print(vetor[vetor.length-1]);
        System.out.print("}");
        System.out.println("");
        
    }

    private static void ordenaVetorCrescente(int[] vetor) {
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] < vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;

                }

            }

        }
    }

    private static void ordenaVetorDecrescente(int[] vetor) {
        int aux;
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;

                }

            }
        }

    }
}
