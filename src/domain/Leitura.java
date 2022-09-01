package domain;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Leitura {
    Scanner scanner;
    String linhaAtual[];

    public void lerArquivo(String caminhoArquivo) {
        try {
            scanner = new Scanner(new FileReader(caminhoArquivo));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String[] lerNovaLinha() {
        linhaAtual = scanner.nextLine().split("[^(]", -1);
        return linhaAtual;
    }

    public boolean temLinhasParaLer() {
        return scanner.hasNextLine();
    }

    public void imprimePalavras() {
        String camposLinha[] = lerNovaLinha();

        for (int i = 0; i < camposLinha.length; i++) {
            System.out.println(camposLinha[i]);
        }
    }

    public String[] getLinhaAtual() {
        if(linhaAtual == null) {
            return lerNovaLinha();
        }
        return linhaAtual;
    }
}
