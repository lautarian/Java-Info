import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Ingrese Calificacion");
        Scanner scan = new Scanner (System.in);
        int calificacion = scan.nextInt(); 
        scan.close();
        if (calificacion > 92) {
            System.out.println("Excelente");

        }
        else if (calificacion > 85) {
            System.out.println("Sobresaliente");

        }
        else if (calificacion > 75) {
            System.out.println("Distinguido");

        }
        else if (calificacion > 60) {
            System.out.println("Bueno");

        }
        else if (calificacion > 0) {
            System.out.println("Desaprobado");

        }
    }
    
}
