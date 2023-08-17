package clase_1;

    public class NumeroFlotanteGraniel {
        public static void main(String[] args) {
            int num1 = 10;
            float num2 = 0.5f;
            int sumEnteros = num1 + (int)num2;
            float sumDecimales = num1 + num2;
            System.out.println("La suma de enteros es: " + sumEnteros);
            System.out.println("La suma con decimales es: " + sumDecimales);
        }
    }
