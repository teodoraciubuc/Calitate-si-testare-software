package strategy.s11Bancomat;

public class BacnoteMici implements IClient{
    @Override
    public int[] getBancnoteAcceptate() {
        System.out.println("s au ales bacnote mici");
        return new int[]{20,10};
    }
}
