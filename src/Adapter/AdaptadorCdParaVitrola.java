package Adapter;

import Adapter.Interfaces.ICd;
import Adapter.Interfaces.IVitrola;

public class AdaptadorCdParaVitrola implements IVitrola {
    private final ICd cd;

    public AdaptadorCdParaVitrola(ICd cdDisk){
        this.cd = cdDisk;
    }

    @Override
    public void lerMidiaDeDisco() {
        System.out.println("Adaptador utilizado -> Pode colocar o cd na vitrola");
        cd.colocarCd();
        System.out.println("Lendo CD");
    }
}
