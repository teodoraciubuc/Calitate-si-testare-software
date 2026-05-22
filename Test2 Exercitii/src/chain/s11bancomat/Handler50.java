package chain.s11bancomat;

public class Handler50 extends AbstractBancomat{
    @Override
    public void retragere(int suma) {
        int nrBancnote = suma / 50;
        int rest = suma % 50;

        if (nrBancnote > 0) {
            System.out.println(nrBancnote + " bancnote de 50");
        }

        if (rest == 0) {
            return;
        }else if(nextHandler!=null){
            nextHandler.retragere(rest);
        }else{
            throw new RetragereException("nu merge");
        }

    }
}
