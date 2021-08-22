public class SwitchExpression {
    //Novidade do Java 14 - Switch Expressions
    public static void main(String[] args) {
        String nome = "Joao";
        switch (nome) {
            case "Renata" -> System.out.println("acertou: " + nome);
            case "Joao" -> System.out.println("acertou: " + nome);
            default -> System.out.println("Nenhum nome encontrado");
        }
    }
}
