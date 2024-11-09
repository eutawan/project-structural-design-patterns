import Adapter.AdaptadorCdParaVitrola;
import Domain.Cd;
import Domain.DiscoDeVinil;
import Domain.Vitrola;
import Interfaces.ICd;
import Interfaces.IDiscoDeVinil;
import Interfaces.IVitrola;

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