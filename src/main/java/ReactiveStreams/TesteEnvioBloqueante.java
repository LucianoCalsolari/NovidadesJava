package ReactiveStreams;

import java.time.LocalDate;
import java.util.List;

public class TesteEnvioBloqueante {

    public static void main(String[] args) {
        List<NotaFiscal> notasFiscais = List.of(new NotaFiscal("Joao", 399.99, LocalDate.now()),
                new NotaFiscal("Joao", 399.99, LocalDate.now()),
                new NotaFiscal("Joao", 399.99, LocalDate.now()));

        NotaFiscalWSClient nfwsc = new NotaFiscalWSClient();

        notasFiscais.forEach(nf -> {
            nfwsc.enviar(nf);
            System.out.println("Parabens pela compra");
        });
    }
}
