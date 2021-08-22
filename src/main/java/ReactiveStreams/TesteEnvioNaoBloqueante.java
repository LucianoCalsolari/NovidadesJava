package ReactiveStreams;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

public class TesteEnvioNaoBloqueante {

    public static void main(String[] args) {
        NotaFiscal primeiraNotaFiscal = new  NotaFiscal("First", 199.99, LocalDate.now());
        NotaFiscal segundaNotaFiscal = new  NotaFiscal("Second", 299.99, LocalDate.now());
        NotaFiscal terceiraNotaFiscal = new  NotaFiscal("Third", 399.99, LocalDate.now());
        SubmissionPublisher<NotaFiscal> publisher = new SubmissionPublisher<>();
        NotaFiscalSubscriber subscriber = new NotaFiscalSubscriber();
        publisher.subscribe(subscriber);
        publisher.submit(primeiraNotaFiscal);
        publisher.submit(segundaNotaFiscal);
        publisher.submit(terceiraNotaFiscal);
        System.out.println("Voce ira receber a nota fiscal no seu email");

        Scanner scan = new Scanner(System.in);
        scan.nextLine();
        scan.close();
        publisher.close();
    }
}
