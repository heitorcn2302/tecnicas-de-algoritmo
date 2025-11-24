import java.util.Scanner;

public class exercico5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


        final int TAM = 10;
        int a[] = new int[TAM];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < TAM; i++) {
            System.out.print("A[" + i + "]: ");
            a[i] = in.nextInt();
        }

        for (int i = 0; i < TAM; i++) {
            System.out.print("Divisores de " + a[i] + ": ");

            for (int d = 1; d <= a[i]; d++) {
                if (a[i] % d == 0) System.out.print(d + " ");
            }
            System.out.println();
        }

    
    }
}
