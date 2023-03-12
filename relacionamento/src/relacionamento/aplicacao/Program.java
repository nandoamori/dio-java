package relacionamento.aplicacao;

import relacionamento.entities.Contato;
import relacionamento.entities.Endereco;
import relacionamento.entities.Telefone;

public class Program {
    public static void main(String[] args) {
        Contato contato = new Contato();
        contato.setNome("Fernando");

        Endereco end = new Endereco("Um", 2, "Três", "Suzano", "SP", "08666666");
        Telefone tel = new Telefone("Celular", 11, 999999999);
        Telefone tel2 = new Telefone("Casa", 11, 88888888);
        Telefone[] telefones = new Telefone[2]; 
        telefones[0] = tel;
        telefones[1] = tel2;

        contato.setEndereco(end);
        contato.setTelefones(telefones);

        System.out.println(contato.getNome());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + " " + t.getNumero());

            }
        }
    }


}
