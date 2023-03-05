package arvoreHeranca;

public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor();
       p1.setNome("Juscislalva");
       p1.setEspecialidade("Gestão de TI");
       p1.setSalario(1045.50);
       p1.setIdade(47);
       p1.setSexo("F");
       System.out.println(p1.toString());
       p1.fazerAniver();
       
       Tecnico t1 = new Tecnico();
       t1.setNome("Glausciley");
       t1.setIdade(33);
       t1.setSexo("M");
       System.out.println(t1.toString());
       t1.praticar();
    }
}
