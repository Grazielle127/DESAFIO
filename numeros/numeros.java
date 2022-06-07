package numeros;

public class numeros {


        public static void main(String[] args) {
            String lista = "Número digitados: ";
            int op, numero;
            boolean continuar = true;
            Scanner sc = new Scanner(System.in);
            do {
                System.out.println("Entre com numero: ");
                numero = sc.nextInt();
    
                if (numero <= 0) {
                    continuar = false;
                    System.out.println("Programa finalizado");
                } else {
                    System.out.printf("");
                    lista += +numero;
                }
            } while (continuar);
            System.out.println(" " +lista);
        }
    }
    

