import java.util.Scanner;
public class ProgramaHola{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Hola, cula es tu nombre?: ");
            String nombre = in.nextLine();
        
        System.out.println("Hombre "+ nombre + ", que tal!");

        System.out.print("Dime tu edad:");
            int edad = in.nextInt();
    
        System.out.println("Tienes "+ edad + " años");

        in.close();
    }
}