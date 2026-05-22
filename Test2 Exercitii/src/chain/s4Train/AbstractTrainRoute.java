package chain.s4Train;

public interface AbstractTrainRoute {
    void setNext(AbstractTrainRoute next);
    void preluare(int km);
}
