import Models.Estudiante;
import Models.Materia;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los datos del estudiante:");
        System.out.print("Nombre: ");
        String nombre = sc.next();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        System.out.print("Nota1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Nota3: ");
        double nota3 = sc.nextDouble();

        Estudiante est1 = new Estudiante(nombre,edad,nota1,nota2,nota3);


        System.out.println("Ingrese los datos de la materia:");
        System.out.print("Nombre de la materia: ");
        String nombreMateria = sc.next();
        System.out.print("Creditos: ");
        int creditos = sc.nextInt();
        System.out.print("Codigo: ");
        String codigo = sc.next();

        Materia mt1 = new Materia(nombre,creditos,codigo);






    }
}