import java.util.Scanner;

public class POO2 {

	public static void main(String[] args) {
		int nota, nota2, promedio = 0;
		 
		Scanner guarda = new Scanner(System.in);
		System.out.print("Escriba la primera nota: ");
             nota = guarda.nextInt();
             
        System.out.print("Escriba la segunda nota: ");
        nota2 = guarda.nextInt();
        
        promedio = nota + nota2;
       /* if (promedio >= 7) 
        {
        	System.out.println("EL estudiante aprobó la asignatura. ");
        }
        else if(promedio >= 5 && promedio < 7)
        {
        	System.out.println("El estudiante tiene derecho a un supletorio. ");
        }
        else
        {
        	System.out.println("El estudiante reprobó la asignatura. ");
        } */
        
        switch(promedio)
        {
        case 0,1,2,3,4: 
        System.out.println("REPROBÓ" );
        break;
        case 5,6:
        	System.out.println("Tiene derecho a un supletorio.");
        break;
        default:
        	System.out.println("APROBÓ");
        	break;
        }
	}
}

