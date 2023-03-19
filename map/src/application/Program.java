package application;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Program {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário com carros e relacione modelos e seus respectivos consumos.");

        Map<String, Double> carrosPopulares = new HashMap<String, Double>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }
        };
        System.out.println(carrosPopulares.toString());
        System.out.println("------------------------------------");

        System.out.println("Substituta o consumo do gol por 15.2km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("------------------------------------");

        System.out.println("Confira se o modelo Tucson esyá no dicionário: " + carrosPopulares.containsKey("tucson"));

        System.out.println("------------------------------------");

        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("------------------------------------");

        System.out.println("Exbiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("------------------------------------");

        System.out.println("Exviba o consumo dos carros: ");
        Collection<Double> consumo = carrosPopulares.values();
        System.out.println(consumo);

        System.out.println("------------------------------------");

        System.out.println("Exiba o modelo mais econômico: ");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEconomico = "";
        for (Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEconomico = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEconomico + " " + consumoMaisEficiente);
            }
        }

        System.out.println("------------------------------------");
        System.out.println("Exiba o modelo menos econômico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEconomico = "";
        for (Entry<String, Double> entry : carrosPopulares.entrySet()) {
            if (entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEconomico = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEconomico + " " + consumoMenosEficiente);

            }
        }
        System.out.println("------------------------------------");

        System.out.println("Exiba a soma dos consumos: ");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0.0;
        while (iterator.hasNext()) {
            soma += iterator.next();
        }
        System.out.println("Soma dos consumos: " + soma);
        System.out.println("------------------------------------");

        System.out.println("Exiba a média dos consumos: " + (soma / carrosPopulares.size()));
        System.out.println("------------------------------------");

        System.out.println("Remova os modelos com consumo igual a 15.6");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while (iterator1.hasNext()) {
            if (iterator1.next().equals(15.6)) {
                iterator1.remove();
            }
        }
        System.out.println(carrosPopulares);
        System.out.println("------------------------------------");

        System.out.println("Exiba os modelos na ordem em que foram informados: ");
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {
            {
                put("gol", 14.4);
                put("uno", 15.6);
                put("mobi", 16.1);
                put("hb20", 14.5);
                put("kwid", 15.6);
            }
        };
        System.out.println(carrosPopulares1);
        System.out.println("------------------------------------");

        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2);
        System.out.println("------------------------------------");
        System.out.println("Apague o dicionário de carros e confira se está vazio: ");
        carrosPopulares.clear();
        System.out.println("Está vazio? " + carrosPopulares.isEmpty());

    }
    

}