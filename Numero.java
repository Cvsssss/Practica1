	import java.util.Scanner;

	public class Numero {
		public static void main(String[] args) {
			System.out.println("\tContador de Dígitos");
			Scanner sc = new Scanner(System.in);
			int k=0;
			System.out.print("Dime el numero del que quieras saber cuantos digitos tiene: ");
			int num=sc.nextInt();
			
			while(num>0 || num<0){
				num=num/10;
				k=k+1;
			}
			System.out.print("Tu numero tiene "+k+" digitos");
			
		}
	}