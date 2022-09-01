package domain;

public class ValidacaoRegex extends Validacao {

    @Override
    public boolean validar(String linha[]) {
        return linha[0].matches("(^[(][TF][)]$)|(^[(]{1}[[0-9a-z]+][)]{1}$)|([(\\\\a-z]{1})");
    }
}
