package ReactiveStreams;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SubmissionPublisher;

public class TesteEnvioNaoBloqueante {

    public static void main(String[] args) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        NotaFiscal primeiraNotaFiscal = new NotaFiscal("Joao", 399.99, LocalDate.now());
        SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<>();
        NotaFiscalWSClient nfwsc = new NotaFiscalWSClient();
        publisher.consume(nfwsc::enviar);
        publisher.consume(data -> {
            System.out.println("Outra thread: " + Thread.currentThread().getName());
        });
        publisher.consume(data -> {
            System.out.println("Outra thread: " + Thread.currentThread().getName());
        });
        publisher.submit(primeiraNotaFiscal);
        System.out.println("Voce ira receber a nota fiscal no seu email");
        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        scan.close();
        publisher.close();
    }
}
