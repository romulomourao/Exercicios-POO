
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
     * 15 - calcule a média de um aluno de acordo com o critério definido
     */
    public static void main(String[] args) {
        calculaMedia();
    }

    private static void calculaMedia() {
        Scanner in = new Scanner (System.in);
        String nome;
        double nota1, nota2, notaTrab, media;
        System.out.print("Nome do Aluno: ");
        nome = in.nextLine();
        System.out.print("Nota P1: ");
        nota1 = in.nextDouble();
        
        System.out.print("Nota P2: ");
        nota2 = in.nextDouble();
        
        System.out.print("Nota Trabalho: ");
        notaTrab = in.nextDouble();
        
        media = ((nota1*2)+(nota2*2)+(notaTrab))/5;
        
        System.out.println("A média final do aluno "+nome.toUpperCase()+" é: "+media);
        verificaSituacao(nome, media);
    }


    private static void verificaSituacao(String nome, double media) {
        String situacao = "APROVADO";
        if(media<4){
            situacao = "REPROVADO";
        }else if(media < 6){
            situacao = "VS";
        }
        
        System.out.println("A situação de "+nome.toUpperCase()+" é: "+situacao);
    }
    
}
