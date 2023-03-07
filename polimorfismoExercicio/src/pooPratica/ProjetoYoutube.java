package pooPratica;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video [] v = new Video[3];

        v[0] = new Video("Aula POO 1");
        v[1] = new Video("Aula POO 2");
        v[2] = new Video("Aula POO 3");

        Gafanhoto g [] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Clotilde", 35, "F", "cloBaby");
        g[1] = new Gafanhoto("Ozzy", 7, "M", "fedozin");

        Visualizacao vis[] = new Visualizacao[5];

        vis[0] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());

        vis[1] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar(95.0f);
        System.out.println(vis[1].toString());


        
    }
}
