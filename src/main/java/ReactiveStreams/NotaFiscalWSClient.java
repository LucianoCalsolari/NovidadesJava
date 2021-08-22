package ReactiveStreams;

public class NotaFiscalWSClient {
    public void enviar(NotaFiscal nf) {

        try {
            Thread.sleep(5000);
            System.out.println("Emitindo nota fiscal");
            System.out.format("Nota fiscal emitida %nEm nome de %s %nNa data de %s %n",
                    nf.getNome(), nf.getData());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
