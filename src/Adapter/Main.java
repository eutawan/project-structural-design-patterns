package Adapter;

import Adapter.Domain.Cd;
import Adapter.Domain.DiscoDeVinil;
import Adapter.Domain.Vitrola;
import Adapter.Interfaces.ICd;
import Adapter.Interfaces.IDiscoDeVinil;
import Adapter.Interfaces.IVitrola;

public class Main {
    public static void main(String[] args) {
        ICd zezoPortiguar = new Cd();
        IDiscoDeVinil calcinhaPreta = new DiscoDeVinil();

        AdaptadorCdParaVitrola adaptador = new AdaptadorCdParaVitrola(zezoPortiguar);
        adaptador.lerMidiaDeDisco();

        System.out.println();

        IVitrola vitrola = new Vitrola(calcinhaPreta);
        vitrola.lerMidiaDeDisco();
    }
}