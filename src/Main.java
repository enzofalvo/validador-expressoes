import domain.ValidacoesExpressoes;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws Exception {
        ValidacoesExpressoes validacaoArquivo = new ValidacoesExpressoes();
        validacaoArquivo.validar("src/utils/Entrada.txt");
        validacaoArquivo.validar("src/utils/Entrada2.txt");
        validacaoArquivo.validar("src/utils/Entrada3.txt");
    }
}
