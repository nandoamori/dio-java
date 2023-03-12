package exercicio;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Agenda agenda = new Agenda();

        int opcao = 1;
        while (opcao != 3) {

            opcao = obterOpcaoMenu(sc);
            if (opcao == 1) {
                consultarContato(sc, agenda);
            } else if (opcao == 2) {
                adicionarContato(sc, agenda);
            }
        }
    }

    public static void adicionarContato(Scanner sc, Agenda agenda) {

        try {
            System.out.println("Criando contato. Entre com as informações: ");
            String nome = lerInformacao(sc, "Nome: ");
            String telefone = lerInformacao(sc, "Telefone: ");
            String email = lerInformacao(sc, "Email: ");

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setTelefone(telefone);
            contato.setEmail(email);

            System.out.println("Contato a ser criado: ");
            System.out.println(contato);
            agenda.addContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void consultarContato(Scanner sc, Agenda agenda) {
        String nomeContato = lerInformacao(sc, "Entre com o nome do contato a ser pesquisado: ");
        try {
            if (agenda.consultaContatoPorNome(nomeContato) >= 0) {
                System.out.println("Contato existe.");
            }
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
            System.out.println("Contatos da agenda: ");
            System.out.println(agenda);
        }

    }

    public static String lerInformacao(Scanner sc, String msg) {
        System.out.println(msg);
        String entrada = sc.nextLine();
        return entrada;
    }

    public static int obterOpcaoMenu(Scanner sc) {
        boolean entradaValida = false;
        int opcao = 3;
        while (!entradaValida) {
            System.out.println("Digite a opção desejada: ");
            System.out.println("1: Consultar contato");
            System.out.println("2: Adicionar contato");
            System.out.println("3: Sair");

            try {
                String entrada = sc.nextLine();
                opcao = Integer.parseInt(entrada);
                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;
                } else {
                    throw new Exception("Entrada inválida.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida.");
            }

        }
        return opcao;
    }
}
