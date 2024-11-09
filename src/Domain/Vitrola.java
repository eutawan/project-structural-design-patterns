package Domain;

import Interfaces.IDiscoDeVinil;
import Interfaces.IVitrola;

public class Vitrola implements IVitrola {
    private final IDiscoDeVinil vinil;

    public Vitrola (IDiscoDeVinil discoDeVinil) {
        this.vinil = discoDeVinil;
    }
    @Override
    public void lerMidiaDeDisco() {
        vinil.colocarDiscoDeVinil();
        System.out.println("Lendo disco de vinil");
    }
}
