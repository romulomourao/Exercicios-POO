
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author romulo
 */
public class Agenda {

    private java.util.List<Contato> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void addContato(Contato novo) {
        this.contatos.add(novo);
    }

    public void removerContato(Contato novo) {
        String nomeRemovido = novo.getNome();
        this.contatos.remove(novo);
        System.out.println(nomeRemovido+" foi removido");
    }

    public Contato procuraContato(int id) {
        for (int i = 0; i < contatos.size(); i++) {
            if (id == contatos.get(i).getId()) {
                return contatos.get(i);
            }
        }
        return null;
    }

    public void listarContatos() {
        String alinhamento = "| %-4d | %-19s | %-10s | %n";
        System.out.println("+--ID--|----------NOME-------+----TEL.----+");
        int contatoId;
        String contatoNome, contatoTel;
        for (int i = 0; i < this.contatos.size(); i++) {
            contatoId = this.contatos.get(i).getId();
            contatoNome = this.contatos.get(i).getNome();
            contatoTel = this.contatos.get(i).getTelefone();
            System.out.format(alinhamento,contatoId,contatoNome,contatoTel);
        }
        System.out.println("+-----------------------------------------+");
    }

}
