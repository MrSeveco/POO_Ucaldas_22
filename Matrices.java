import java.util.Random;
import java.util.Scanner;
public class Matrices {
static Scanner Guardar = new Scanner(System.in);
	public static void main(String[] args) 
	{
		 PrimerEjercicioM();
	}
public static void PrimerEjercicioM() 
{
	int[][] numale = new int[20][10];
	Random ale = new Random();
	for(int i = 0; i < 10; i++) 
	{
	for	(int j = 0; j < 20; j++)
	{
		numale[j][i] = ale.nextInt(10, 100);
		System.out.print(numale[j][i] + "|");
	}
	System.out.println("");
	}	
}

}
