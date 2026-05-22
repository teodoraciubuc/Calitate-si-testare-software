package chain.s11bancomat;

public class Handler20 extends AbstractBancomat{
    @Override
    public void retragere(int suma) {
        int nrBancnote = suma / 20;
        int rest = suma % 20;

        if (nrBancnote > 0) {
            System.out.println(nrBancnote + " bancnote de 20");
        }

        if (rest == 0) {
            return;
        }else if(nextHandler!=null){
            nextHandler.retragere(rest);
        }else{
         throw new RetragereException("nu7 merge");
        }
    }
}
