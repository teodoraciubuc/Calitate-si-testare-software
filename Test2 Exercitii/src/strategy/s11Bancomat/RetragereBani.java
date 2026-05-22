package strategy.s11Bancomat;

public class RetragereBani {
    private IClient iclient;

    public void setIclient(IClient iclient) {
        this.iclient = iclient;
    }
    public void retragere(){
        if(iclient==null){
            return;
        }
        int[] bancnoteAcceptate =iclient.getBancnoteAcceptate();
        System.out.println("a avut loc retragereea");
        System.out.println("Bancnote acceptate:");
        for (int bancnota : bancnoteAcceptate) {
            System.out.println(bancnota + " lei");
        }
    }
}
