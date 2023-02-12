package Ejercicio3;

class Coche {
    int numPuertas;

    void aumentarNumPuertas() {
        numPuertas++;
    }
}

public class Cocheto {
    public static void main(String[] args) {
        Coche miCoche = new Coche();
        miCoche.numPuertas = 4;
        System.out.println("El número de puertas original es: " + miCoche.numPuertas);
        miCoche.aumentarNumPuertas();
        System.out.println("El número de puertas después de agregar una es: " + miCoche.numPuertas);
    }
}
