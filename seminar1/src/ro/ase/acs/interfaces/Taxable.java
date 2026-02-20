package ro.ase.acs.interfaces;

public interface Taxable {
    float compute();

    default boolean isTaxable() {
        return true;
    }
}
