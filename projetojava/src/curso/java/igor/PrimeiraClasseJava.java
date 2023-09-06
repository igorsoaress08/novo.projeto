package curso.java.igor;

public class PrimeiraClasseJava {

	public static void main(String[] args) {

		int num = 0;

		while (num <= 100) {

			System.out.println("Numero:" + num);
			num++;
			if (num == 10) {
				System.out.println("Encontrei o numero" + " "+ num +", amém, " +
			"não aguentava mais contar");
				break;
			}
		}

	}
}
