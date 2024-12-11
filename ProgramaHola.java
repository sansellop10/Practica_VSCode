import java.util.Scanner;
public class ProgramaHola{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Hola, cula es tu nombre?: ");
            String nombre = in.nextLine();
        
        System.out.println("Hola "+ nombre + " !");

        in.close();
    }
}