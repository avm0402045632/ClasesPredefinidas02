import java.util.Scanner;
import java.util.Scanner;
public class Main {


    public static void main(String[] args) {


        double sueldo = 0;
        int categoria;

        System.out.println("Ingrese el tipo de categoria que desea calcular el sueldo");
        Scanner teclado = new Scanner(System.in);
        categoria = teclado.nextInt();

        if (categoria == 1) {
            sueldo = 15890 + (15890 * 0.10);
        } else {
            if (categoria == 2) {
                sueldo = 25630.89;
            } else {
                if (categoria == 3) {
                    sueldo = 35560.20 - (35560.20 * 0.11);
                } else {
                    System.out.println("Denbe ingresar un mumero de categoria válido");
                }
            }
        }
        if (categoria == 1 || categoria == 2 ||categoria == 3){

            System.out.println("El total del sueldo para la categoria seleccionada" + categoria + "es iguala a: " + sueldo);
        }
    }

}
