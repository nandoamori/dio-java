package equalsHashCode.oneDigitalInnovation;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        List<Carros> listaCarros = new ArrayList<>();

        listaCarros.add(new Carros("Ford"));
        listaCarros.add(new Carros("Chevrolet"));
        
        System.out.println(listaCarros.contains(new Carros("Ford")));
        System.out.println(new Carros("Ford").hashCode());
    
    }
}
