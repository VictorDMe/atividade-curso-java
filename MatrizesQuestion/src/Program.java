import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int linha, coluna, numero, positionL = 0, positionC = 0;
        boolean haveNumber = false;

        System.out.print("Quant. de linhas: ");
        linha = read.nextInt();
        System.out.print("Quant. de colunas: ");
        coluna = read.nextInt();

        int[][] matriz = new int[linha][coluna];

        System.out.println();

        //Lendo a matriz Linha x coluna.
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = read.nextInt();
            }
        }
        System.out.println();
        System.out.print("Find number: ");
        numero = read.nextInt();
        System.out.println();


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == numero) {
                    System.out.printf("Position: %d,%d%n", i + 1, j + 1);
                    positionL = i;
                    positionC = j;
                    haveNumber = true;

                    //Verificação se existe elemento à esquerda do número encontrado
                    if ((positionC - 1) >= 0) {
                        System.out.printf("Left: %d%n", matriz[positionL][positionC - 1]);
                    }

                    //Verificação se existe elemento à direita do número encontrado
                    if ((positionC + 1) <= coluna - 1) {
                        System.out.printf("Right: %d%n", matriz[positionL][positionC + 1]);
                    }

                    //Verificação se existe elemento à acima do número encontrado
                    if ((positionL - 1) >= 0) {
                        System.out.printf("Up: %d%n", matriz[positionL - 1][positionC]);
                    }

                    //Verificação se existe elemento a baixo do número encontrado
                    if ((positionL + 1) <= linha - 1) {
                        System.out.printf("Down: %d%n", matriz[positionL + 1][positionC]);
                    }
                    System.out.println();
                }
            }
        }

        if (!haveNumber) System.out.println("This number does exist in matriz");

        read.close();

    }
}
