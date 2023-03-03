package exercicioPoo;

public class Main {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[3];
        Livro l[] = new Livro[3];


        p[0] = new Pessoa("Ana", 21, "Feminino");
        p[1] = new Pessoa("Carlos", 43, "Masculino");
        p[2] = new Pessoa("Maria", 20, "Feminino");

        l[0] = new Livro("Aprendendo java", "José Silva", 390, 0, false, p[0]);
        l[1] = new Livro("Estrutura de dados", "Loiane", 200, 0, false, p[1]);

        System.out.println(l[0].detalhes());
    }
}
