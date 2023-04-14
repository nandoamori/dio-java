package aplicacao;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Fernando";
        nome.concat("Amorim");
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("Fernando");
        sb.append(" Ribeiro").append(" Amorim");
        System.out.println(sb);
        sb.reverse();
        sb.reverse();
        sb.delete(0,3);
        System.out.println(sb);
    }
}
