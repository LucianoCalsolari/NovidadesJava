import java.util.List;
import java.util.Map;
import java.util.Set;

public class FabricaDeCollections {
    //Novidade do Java 9  - Factory Method para Collection
    public static void main(String[] args) {
        List<String> nomes = List.of("primeiro", "segundo");
        //coleção imutavel

        Set.of("terceiro");
        Map.of("nome", "Joao");


    }
}
