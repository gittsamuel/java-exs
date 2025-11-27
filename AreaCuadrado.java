import java.util.Scanner;
public class AreaCuadrado{
    public static void main(String[] args){
        Scanner ed = new Scanner(System.in);

        System.out.println("Ingrese el lado del cuadrado: ");
        double lado = ed.nextDouble();

        System.out.println("EL área es: "+Areas.computearea(lado,0));
        
        ed.close();
    }
}