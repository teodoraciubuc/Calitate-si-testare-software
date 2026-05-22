package chain.s4Train;

public class InterRegioHandler implements AbstractTrainRoute{
    protected AbstractTrainRoute next;
    @Override
    public void setNext(AbstractTrainRoute next) {
        this.next=next;
    }

    @Override
    public void preluare(int km) {
        if (km < 500) {
            System.out.println("Trenul inter-regio a fost preluat de al doilea mecanic");
        } else if (next != null) {
            next.preluare(km);
        }
    }
}
