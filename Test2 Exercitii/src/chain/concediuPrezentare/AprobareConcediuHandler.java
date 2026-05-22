package chain.concediuPrezentare;

public abstract class AprobareConcediuHandler {
    protected AprobareConcediuHandler next;

    public void setNext(AprobareConcediuHandler next) {
        this.next = next;
    }

    public abstract void aproba(int zile);
}