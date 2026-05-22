package chain.sistemAprobare;

public interface AprobareHandler {
    void setNext(AprobareHandler next);
    void aprobaCerere(double suma);
}
