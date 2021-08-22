package ReactiveStreams;

import java.util.concurrent.Flow.*;

public class NotaFiscalSubscriber implements Subscriber<NotaFiscal>{

    private Subscription subscription;

    @Override
    public void onSubscribe(Subscription subscription) {
        System.out.println("");
        this.subscription = subscription;
        this.subscription.request(1);
    }

    @Override
    public void onNext(NotaFiscal item) {

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }
}
