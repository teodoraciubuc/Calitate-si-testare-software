package chain.s11bancomat;

public abstract class AbstractBancomat {
    protected AbstractBancomat nextHandler;
    public void setNext(AbstractBancomat nextHandler){
        this.nextHandler=nextHandler;
    };
    public abstract void retragere(int suma);
}
