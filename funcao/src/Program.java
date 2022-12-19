import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe 3 numeros:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = funcaoMaior(a, b, c);
		
		mostrarResultado(maior);
		
		sc.close();
	}
	/*FUN��O CRIADA PRA RETORNAR O MAIOR DENTRE 3 NUMEROS INTEIROS
	 * Essa primeira fun��o retorna um valor.
	 * � sempre nescessario come�ar a fun��o com public static
	 * depois voc� informa o tipo de fun��o no coso int
	 * depois o nome da fun�ao
	 * e entre () as variaveis da fun��o, n�o precisa usar as mesmas
	 * por fim criar a var de retorno no caso aux
	 * pra retornar no fim da fun��o return aux; */
	public static int funcaoMaior(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		}
		else if (y > z) {
			aux =y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	/*FUN�AO CRIADA DE EXEMPLO DE COMO EXIBIR RETORNO DA FUN��O
	 * Essa fun��o recebe um valor mas...
	 * N�o retorna nada apenas exibe uma mensssagem
	 * por isso no tipo de fun��o colocasse void significado = vazio
	 * resultado � a mesma variavel aux*/
	public static void mostrarResultado(int resultado) { 
		System.out.println("Maior = " + resultado);
	}

}