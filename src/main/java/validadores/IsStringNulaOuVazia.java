package validadores;

public class IsStringNulaOuVazia {

    public static boolean isStringNulaOuVazia( String value ) {
        return (value == null || value.trim().equals(""));
    }
}
