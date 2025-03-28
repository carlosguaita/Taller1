import Models.Estudiante;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Estudiante est1 = new Estudiante();
        est1.setNombre("Juan");
        est1.setEdad(20);
        est1.setNotas(8.5, 9.0, 7.5);

        System.out.println("Nombre: " + est1.getNombre());
        System.out.println("Edad: " + est1.getEdad());
        double notas[] = est1.getNotas();
        System.out.println("Nota1: " + notas[0] + " Nota2: " + notas[1] + " Nota3: " + notas[2]);





    }
}