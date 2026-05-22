package chain.s11bancomat;

import javax.print.DocFlavor;

public class Handler10 extends AbstractBancomat {
    @Override
    public void retragere(int suma) {
        int nrBancnote = suma / 10;
        int rest = suma % 10;

        if (nrBancnote > 0) {
            System.out.println(nrBancnote + " bancnote de 10");
        }

        if (rest == 0) {
            return;
        }

        throw new RetragereException("Suma nu poate fi retrasă.");
    }
}

