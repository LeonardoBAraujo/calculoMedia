import java.util.Scanner;

public class TesteMedias {

	public static void main(String[] args) {

		double nota1 = 10;
		double nota2 = 10;
		double media = (nota1 + nota2) / 2;

		Scanner leitor = new Scanner(System.in);

		System.out.println("Digite a nota 1:");

		nota1 = leitor.nextInt();

		System.out.println("Digite nota 2:");

		nota2 = leitor.nextInt();

		media = (nota1 + nota2) / 2;

		if (media >= 6 && media <= 10) {

		
			if (media == 10) {

		System.out.println("Você está aprovado com nota máxima:" + media);

			}else {
				
				System.out.println("Você está aprovado com média:" + media);
			}

		} else {

			System.out.println("Você está de recuperação com media:" + media);
		}

	}

}
