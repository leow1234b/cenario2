package br.edu.up;
import java.text.DecimalFormat;


import br.edu.up.modelos.Ponto;

public class programa {
     public static void main(String[] args) {
        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto(2, 5);

        System.out.println("Distância entre ponto1 e ponto2: " + formatarDistancia(ponto1.calcularDistancia(ponto2)));

        Ponto ponto3 = new Ponto(7, 2);
        System.out.println("Distância entre ponto2 e (7, 2): " + formatarDistancia(ponto2.calcularDistancia(ponto3)));

        ponto1.setX(10);
        ponto1.setY(3);
        System.out.println("Novas coordenadas do ponto1: " + ponto1);
    }

    private static String formatarDistancia(double distancia) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(distancia);
    }
}

