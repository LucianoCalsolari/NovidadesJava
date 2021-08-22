import java.util.HashMap;

public class InferenciaVariavel {
    //Novidade do Java 10  - Inferencia de variavel
    public static void main(String[] args) {
        //HashMap<String, String> cpfPorNomes = new HashMap<>();
        var cpfPorNomes = new HashMap<String, String>();
        //O var só poderá ser utilizado no contexto de métodos em variáveis locais
        cpfPorNomes.put("Joao", "04813189");

        System.out.println(cpfPorNomes);
    }
}
