
import java.util.ArrayList;
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
     * 20 - Fazer um programa de agenda telefonica, com as classes Contato e
     * Agenda
     */
    final static int NOVO_CONTATO = 0;
    final static int REMOVER_CONTATO = 1;
    final static int LISTAR_CONTATOS = 2;
    final static int SAIR = 3;
    //Variavel que servirá de ID ao ser incrementada toda vez que um contato for adicionado
    static int id = 0;

    public static void main(String[] args) {
        //O programa funciona supondo que só existe uma unica agenda
        Agenda agenda = new Agenda();
        while (true) {
            menu(agenda);
        }

    }

    private static void menu(Agenda agenda) {
        Scanner in = new Scanner(System.in);
        String alinhamento = "| %-19s |%n";
        System.out.println("\n");
        System.out.println("+--------MENU---------+");
        System.out.format(alinhamento, "0 - Novo Contato");
        System.out.format(alinhamento, "1 - Remover Contato");
        System.out.format(alinhamento, "2 - Listar Contatos");
        System.out.format(alinhamento, "3 - Sair");
        System.out.println("+_____________________+");
        System.out.println("");

        //Guarda a opção escolhida pelo usuário
        System.out.print("> ");
        int option = in.nextInt();
        in.nextLine();

        switch (option) {

            case NOVO_CONTATO:
                //adiciona o contato criado na agenda
                novoContato(agenda, in);
                break;
            case REMOVER_CONTATO:
                removerContato(agenda, in);
                break;
            case LISTAR_CONTATOS:
               agenda.listarContatos();
                break;
            case SAIR:
                System.exit(0);
            default:
                System.out.println("Opçao invalida");

        }

    }

    private static void listarContatos(Agenda agenda) {
        agenda.listarContatos();

    }

    private static void removerContato(Agenda agenda, Scanner in) {
        
        int contatoId;
        System.out.println("+-----------REMOVER CONTATO-----------");
        System.out.println("|           remova pelo id           |");
        System.out.print("|ID: ");
        contatoId = in.nextInt();
        in.nextLine();
        Contato temp = agenda.procuraContato(contatoId);
        if (temp == null) {
            System.out.println("Contato não encontrado");
            return;
        }
        agenda.removerContato(temp);
        System.out.println("");
        agenda.listarContatos();

    }

    private static void novoContato(Agenda agenda, Scanner in) {
        
        Contato novo;
        String nome, telefone;
        System.out.println("+----------------NOVO CONTATO-------------+");
        System.out.println("|Digite o nome:");
        nome = in.nextLine();
        System.out.println("|Digite o telefone:");
        telefone = in.nextLine();
        System.out.println("+-----------------------------------------+");
        id++;
        novo = new Contato(nome, telefone, id);
        agenda.addContato(novo);
        System.out.println("INSERIDO COM SUCESSO!\n");
        agenda.listarContatos();
        

    }

}
