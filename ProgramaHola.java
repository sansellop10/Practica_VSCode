import java.util.Scanner;
public class ProgramaHola{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Hola, cula es tu nombre?: ");
            String nombre = in.nextLine();
        
        nom(nombre);

        System.out.print("Dime tu edad: ");
            int edad = in.nextInt();
    
        ed(edad);

        in.close();
    }//cierre main

    static void nom(String nombre){
        System.out.println("Hombre "+nombre+ " , que tal estas!");

    }
    static void ed(int nombre){
        System.out.println("Tienes "+nombre+" años");

    }

}//cierre class