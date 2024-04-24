public class Main {
    public static void main(String[] args) {

        double operacion;
        double inversion = 1000;
        double interes = 0.05;
        System.out.println("Año -------- Monto");
        for (int anio  = 1; anio <= 10; anio++) {
            operacion = inversion * Math.pow(1 + interes, anio);
            double roundedOperacion = Math.round(operacion * 100.0) / 100.0;
            System.out.printf("%d           %.2f\n", anio, roundedOperacion);

        }
    }
}