package Models;

import java.util.Scanner;

public class SistemaNotas {

    Materia[] materias = new Materia[5];
    Estudiante[] estudiantes = new Estudiante[10];
    int contMaterias = 0, contEstudiantes = 0;

    public SistemaNotas() {
    }

    void crearMateria(){
        if(contMaterias<5) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese nombre de la materia: ");
            String nombre = sc.next();
            System.out.print("Ingrese el codigo de la materia: ");
            String codigo = sc.next();
            System.out.print("Ingrese creditos de la materia: ");
            int creditos = sc.nextInt();
            Materia materia = new Materia(nombre, creditos, codigo);
            materias[contMaterias] = materia;
            contMaterias++;
        }else {
            System.out.println("No puede ingresar mas materias");
        }
    }

    void crearEstudiante(){
        if (contEstudiantes<10){
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese el nombre del estudiante: ");
            String nombre = sc.next();
            System.out.print("Ingrese edad del estudiantes: ");
            int edad = sc.nextInt();
            System.out.print("Ingrese la nota 1: ");
            double nota1 = sc.nextDouble();
            System.out.print("Ingrese la nota 2: ");
            double nota2 = sc.nextDouble();
            System.out.print("Ingrese la nota 3: ");
            double nota3 = sc.nextDouble();
            Estudiante estudiante = new Estudiante(nombre, edad, nota1, nota2, nota3);
            estudiantes[contEstudiantes] = estudiante;
            contEstudiantes++;
        }else{
            System.out.println("No puede ingresar mas estudiantes");
        }
    }







}
