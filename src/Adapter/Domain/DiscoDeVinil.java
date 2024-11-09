package Adapter.Domain;

import Adapter.Interfaces.IDiscoDeVinil;

public class DiscoDeVinil implements IDiscoDeVinil {
    @Override
    public void colocarDiscoDeVinil() {
        System.out.println("Colocando Disco de vinil para ser lido");
    }
}
