import java.util.Scanner;
public class Areas{
    public static void main(String[] args){
        Scanner ed = new Scanner(System.in);

        System.out.println("Que área quieres calcular: ");
        System.out.println("\n1.-Cuadrado\n2.-Circulo\n" + //
                        "3.-Triangulo\n4.-Pentagono\n5.-Hexagono");
         
        int op = ed.nextInt();
        switch (op) {
            case 1:
                System.out.println("Ingrese el lado del circulo: ");
                double l = ed.nextDouble();
                System.out.println("El área es: "+AreaCuadrado.computearea(l));
                break;
            case 2:
                System.out.println("Ingrese el radio: ");
                double r = ed.nextDouble();
                System.out.println("El área es: "+AreaCirculo.computearea(r));
                break;
            case 3:
                System.out.println("Ingrese la altura: ");
                double h = ed.nextDouble();
                System.out.println("Ingrese la base: ");
                double b = ed.nextDouble();
                System.out.println("El área es: "+AreaTriangulo.computearea(h, b));
                break;
            case 4:
                System.out.println("Ingrese el perimetro: ");
                double p = ed.nextDouble();
                System.out.println("Ingrese la apotema ");
                double a = ed.nextDouble();
                System.out.println("El área es: "+AreaPentagono.computearea(p, a));
                break;
            case 5:
                System.out.println("Ingrese el perimetro: ");
                 p = ed.nextDouble();
                System.out.println("Ingrese la apotema ");
                 a = ed.nextDouble();
                System.out.println("El área es: "+AreaHexagono.computearea(p, a));
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        ed.close();
    }
}