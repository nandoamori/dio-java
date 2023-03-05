package heranca;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p2.setNome("Kelly");
        p3.setNome("Eliana");
        p4.setNome("Elias");

        p1.setIdade(17);
        p2.setCurso("Informática");
        p3.setSalario(1500.00);
        p4.setSetor("Estoque");



        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
