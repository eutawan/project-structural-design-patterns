package Adapter.Domain;

import Adapter.Interfaces.ICd;

public class Cd implements ICd {
    @Override
    public void colocarCd() {
        System.out.println("Colocando Cd para ser lido");
    }
}
