package principal;
import java.util.Scanner;

public class Funcionarios {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome1;
		char sexo1;
		int idade1;
		float salario1;
		
		String nome2;
		char sexo2;
		int idade2;
		float salario2;
		System.out.print("Nome: ");
		nome1 = sc.nextLine();
		System.out.print("Idade: ");
		idade1 = sc.nextInt(); sc.nextLine();
		System.out.print("Sexo: ");
		sexo1 = sc.nextLine().charAt(0);
		System.out.print("Salario: ");
		salario1 = sc.nextFloat(); sc.nextLine();
	
		
		System.out.print("Nome: ");
		nome2 = sc.nextLine();
		System.out.print("Idade: ");
		idade2 = sc.nextInt(); sc.nextLine();
		System.out.print("Sexo: ");
		sexo2 = sc.nextLine().charAt(0);
		System.out.print("Salario: ");
		salario2 = sc.nextFloat(); sc.nextLine();
		
		sc.close();
		
		System.out.println("Funcionarios: ");
		System.out.println(""+nome1+", "+idade1+" anos, sexo: "+sexo1+", com salario de: "+salario1);
		System.out.println(""+nome2+", "+idade2+" anos, sexo: "+sexo2+", com salario de: "+salario2);
	}
}

