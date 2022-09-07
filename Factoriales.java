import java.util.Scanner;

public class Factoriales {
public static void main(String[] args)	{
	double resultado = 0;
	Scanner scanner = new Scanner(System.in);
	System.out.print("Escriba un número: ");
	int digit = scanner.nextInt();
	
	if(digit > 0)
	{
		resultado = FactorialCalculate(digit);
		System.out.println("El factorial del número " + digit + " es " + resultado);
	}
	else
	{
		System.out.println("Número inválido");
	}
}
public static int FactorialCalculate(int num)
{
if(num == 0)
{
	return 1;
}
else
{
	return(num * FactorialCalculate(num -1));
}
}

}
