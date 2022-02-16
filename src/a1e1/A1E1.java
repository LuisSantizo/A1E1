import java.util.Scanner;

public class A1E1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //definir variables 
        int PrimerNumero;
        int SegundoNumero;
        int Suma;
        
        //pedir los numeros
        System.out.println("Ingrese el primer numero:");
        PrimerNumero = scanner.nextInt();
        System.out.println("Ingrese el segundo numero:");
        SegundoNumero = scanner.nextInt();
        
        //hacer la suma 
        Suma = PrimerNumero + SegundoNumero;
        
        System.out.println("El resultado de la suma de los dos numeros es: " + Suma);
    }

}
