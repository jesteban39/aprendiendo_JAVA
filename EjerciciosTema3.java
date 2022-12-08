public class EjerciciosTema3 {
    public static void main(String[] args){
        int valor = sumar(1,2,3);
        System.out.println(valor);

        Coche miCoche = new Coche();
        int puertas = miCoche.addPuerta();
        System.out.println(puertas);

    }

    public static int sumar(int val1, int val2, int val3){
        return val1 + val2 + val3;
    }
}

class Coche {

    private int puertas = 4;
    public int addPuerta() {
        this.puertas++;
        return this.puertas;
    }
}
