import java.util.Scanner;
public class TallerClase {
private static Scanner Leer = new Scanner(System.in);
	public static void main(String[] args) {
		//Ejercicio1();
		//Ejercicio2();
        //Ejercicio3();
		//Ejercicio4();
		//Ejercicio5();
		//Ejercicio6();
		//Ejercicio7();
		//Ejercicio8();
		//Ejercicio9();
		//Ejercicio10();
		//Ejercicio11();
		//Ejercicio12();
		Ejercicio13();
	}
static void Ejercicio1() {
double NumA = 89, NumB = 323;

System.out.print("Variable Nro 1: " + NumA + " y Variable Nro 2: " + NumB + "\n" +
		         NumA + " + " + NumB +" = " + (NumA+NumB) + "\n" +  
		         NumA + " - " + NumB + " = " + (NumA-NumB) + "\n" +
		         NumA + " * " + NumB + " = " + (NumA*NumB) + "\n" +
		         NumA + " / " + NumB + " = " + (NumA/NumB));
}
static void Ejercicio2() {
System.out.print("Ingrese la cantidad pesos que quiere convertir a dolares: ");	
double peso = Leer.nextDouble();
double dolar = peso / 3895;
System.out.println(peso + " Pesos, son: " + dolar + " Dolares.");
}
static void Ejercicio3() {
	System.out.print("Ingrese el valor de la factura: ");
	double factura = Leer.nextDouble();
	double Iva = (factura*0.19);
	System.out.print("Base sin IVA: " + factura + "\n" +
	                 "IVA: " + Iva + "\n" +
			         "Valor Total: " + (factura+Iva));
}
static void Ejercicio4() {
	System.out.print("Ingrese un Número: ");
	int num = Leer.nextInt();
	
	switch (num) {
	case 1: {
		System.out.println("Lunes!");
	}
	break;
	case 2:{
		System.out.println("Martes!!");
	}break;
    case 3: {
	System.out.println("Miercoles!!!");
    }break;
    case 4:{
	System.out.println("Jueves!!!!");
    }break;
    case 5: {
	System.out.println("Viernes!!!!!");
    }break;
    case 6:{
	System.out.println("Sabado!!!!!!");
    }break;
    case 7: {
	System.out.println("Viernes!!!!!!!");
    }break;
    default:{
    	System.out.println("Día inexistente D:");
    }break;
    }	
}
static void Ejercicio5() {
	System.out.print("Ingrese 3 números: ");
	int[] num = new int[3];
	
	for(int i = 0; i <= 2; i++) {
	int nums = Leer.nextInt();
	num[i] = nums;		
	}
	System.out.println("Desordenados... \n1. " + num[0] + "\n2. " + num[1] + "\n3. " + num[2] + "\nOrdenados...");
	
	if(num[0] >= num[1] && num[1] >= num[2])
		System.out.println("1. " + num[0] + "\n2. " + num[1] + "\n3. " + num[2]);
	
	else if(num[1] >= num[0] && num[0] >= num[2])
		System.out.println("1. " + num[1] + "\n2. " + num[0] + "\n3. " + num[2]);
	
	else if(num[2] >= num[1] && num[1] >= num[0])
		System.out.println("1. " + num[2] + "\n2. " + num[1] + "\n3. " + num[0]);
	
	else if(num[0] >= num[2] && num[2] >= num[1])
		System.out.println("1. " + num[0] + "\n2. " + num[2] + "\n3. " + num[1]);
	
	else if(num[1] >= num[2] && num[2] >= num[0])
		System.out.println("1. " + num[1] + "\n2. " + num[2] + "\n3. " + num[0]);
	
	else if(num[2] >= num[0] && num[0] >= num[1])
		System.out.println("1. " + num[2] + "\n2. " + num[0] + "\n3. " + num[1]);
}
static void Ejercicio6() { 
	System.out.print("Ingrese un número: ");
	int num = Leer.nextInt();
	
	if (num >= 10 && num <100) {
		num /= 10;
		System.out.println("El primer dijito del número es: " + num);
	}
	else if (num >= 100 && num <1000) {
		num /= 100;
		System.out.println("El primer dijito del número es: " + num);
	}
	else if (num >= 1000 && num <10000) {
		num /= 1000;
		System.out.println("El primer dijito del número es: " + num);
	}
	else if (num >= 10000 && num <100000) {
		num /= 10000;
		System.out.println("El primer dijito del número es: " + num);
	}
	else
		System.out.println("El número ingresado esta fuera de rango.");
}
static void Ejercicio7() {
	int num = 0;
	System.out.println("Múltiplos de 8 de 0 a 100 = ");
	while(num < 100) {
		if(num % 8 == 0 ) 
			System.out.print(num + "  ");
	num++;	
	}
}
static void Ejercicio8() {
int contador = 0; 
double suma = 0, num = 0;
do {
	System.out.print("Ingrese un número: ");
	num = Leer.nextInt();
	if(num > 0) {
	suma += num;
	contador++;
	}
}while(num > 0);
if(contador > 1)
System.out.println("El promedio de los números "+ contador +  " ingresados es: " + (suma/contador));
else
	System.out.println("Número ingresado: " + suma);
}
static void Ejercicio9() {
int[] num = new int [10];
	
	System.out.print("Ingrese 10 valores a evaluar: ");
	
	int contadorP = 0, contadorN = 0;
	for(int i = 0; i<= 9; i++)
	{
		int nums = Leer.nextInt();
		num[i] = nums;
	
		if(num[i] < 0) 
		 contadorN++;
		else if(num[i] >= 0) 
			contadorP++;
	}
	System.out.println("La cantidad de números positivos es: " + contadorP);
	System.out.println("La cantidad de números negativos es: " + contadorN);
}
static void Ejercicio10() {
	System.out.print("Ingrese un número: ");
    int numeroNiveles = Leer.nextInt();
    int numeroPosiciones = numeroNiveles * 2 -1;
    int posInicial = numeroNiveles;
    int posFinal = numeroNiveles;
    
    for (int i = 0; i < numeroNiveles; i++) {
      int contador = 1;
      String resultado = "";
      
      for (int j=0; j <= numeroPosiciones; j++) {
        if ((j < posInicial) || (j > posFinal)) {
          resultado += " ";
        } else {
          if (j < numeroNiveles) {
            resultado += contador;
            contador++;
          } else {
            resultado += contador;
            contador--;
          }
        }    
      }
      System.out.println(resultado);
      posFinal++;
      posInicial--;
    }
}
static void Ejercicio11() {	
	System.out.print("Escriba una palabra: ");
	String caracteres = Leer.next().toUpperCase();
	char[] Carac = new char[caracteres.length()]; 
	if(caracteres.length() < 10) {
		System.out.println("Palabra desglosada en el arreglo: ");
	for(int i = 0; i < caracteres.length(); i++)
	{
		Carac[i] = caracteres.charAt(i);	
	}
	for(char c : Carac) {
		System.out.println(c);
	}
	}
	else
		System.out.println("Limite superado para el arreglo. ");

}
static void Ejercicio12() {
System.out.print("Ingrese 10 números: ");	
int[] num = new int [10];
	for(int i = 0; i < 10; i++)
	{
		num[i] = Leer.nextInt();
	}
	System.out.println("Números al reves: " );
int j = 9;
while(j >= 0) {
	System.out.println(num[j]);
j--;
}
}
static void Ejercicio13() {
int[] num = new int [8];
	
	System.out.print("Ingrese 8 valores a evaluar: ");
	
	for(int i = 0; i<= 7; i++)
	{
		int nums = Leer.nextInt();
		num[i] = nums;
	}
	System.out.println("Clasificación: ");
	for(int i = 0; i<= 7; i++) {
	if(num[i] % 2 == 0) 
		 System.out.println(num[i] + " Par");
		else 
			System.out.println(num[i] + " Impar");
	}
}
}
