package domain;

public class ValidacoesExpressoes {
    Leitura leitura = new Leitura();

    public void validar(String caminhoArquivo) throws Exception {
        try {
            lerArquivo(caminhoArquivo);
            lerNovaLinha();
            while (temLinhasParaLer()) {
                lerNovaLinha();
                validoOuInvalido();
            }
        } catch (Exception e) {
            throw new Exception("O programa não estava preparado para ler essa expressão!");
        }
    }

    private boolean temLinhasParaLer() {
        return leitura.temLinhasParaLer();
    }

    private void lerNovaLinha() {
        leitura.lerNovaLinha();
    }

    private void validoOuInvalido() throws Exception {
        if(expressaoEstaCorreta()) {
            System.out.println("Válida");
        }
        else {
            System.out.println("Inválida");
        }
    }

    private boolean expressaoEstaCorreta() throws Exception {
        ValidacaoRegex validacaoRegex = new ValidacaoRegex();
        return validacaoRegex.validar(leitura.getLinhaAtual());
    }

    private void lerArquivo(String caminhoArquivo) {
        leitura.lerArquivo(caminhoArquivo);
    }
}
