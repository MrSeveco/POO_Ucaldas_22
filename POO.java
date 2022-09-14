import java.util.Scanner;

public class POO {

	public static void main(String[] args) {
		double nota, nota2, promedio = 0;
		Scanner guarda = new Scanner(System.in);
		System.out.print("Escriba la primera nota: ");
             nota = guarda.nextDouble();
             
        System.out.print("Escriba la segunda nota: ");
        nota2 = guarda.nextDouble();
        
        promedio = nota + nota2;
        if (promedio >= 7) 
        {
        	System.out.println("EL estudiante pasó la asignatura. ");
        }
        else
        {
        	System.out.println("El estudiante reprobo la asignatura. ");
        }
	}

}
