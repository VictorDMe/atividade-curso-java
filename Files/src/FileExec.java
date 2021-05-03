import java.io.*;
import java.util.Locale;
import java.util.Scanner;

public class FileExec {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner read = new Scanner(System.in);

        System.out.print("Digite o caminho do arquivo: ");
        String path = read.nextLine();
        File file = new File(path);

        try (BufferedReader bf = new BufferedReader(new FileReader(path))) {

            boolean sucessoCriarPasta = new File(file.getParent() + "\\out").mkdir();
            
            if (sucessoCriarPasta) {
                System.out.println("Sucesso ao criar a pasta! \nCaminho: " + file.getParent() + "\\out");
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file.getParent() + "\\out\\summary.csv"))) {

                String linha = bf.readLine();

                //Ler cada linha do arquivo produtos.csv e adicionar no summary.csv
                while (linha != null) {
                    String[] produtos = linha.split(",");
                    bw.write("Nome do produto: " + produtos[0] + "\n" +
                            "Preço unitário: " + produtos[1] + "\n" +
                            "Total em estoque: " + produtos[2] + "\n" +
                            "Custo total: $ " + Double.parseDouble(produtos[1]) * Double.parseDouble(produtos[2]) +
                            "\n");
                    bw.newLine();
                    linha = bf.readLine();
                }
                bw.write("Obrigado por usar! ");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
