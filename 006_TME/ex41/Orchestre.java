/**
 * @author Baptiste Audugé
 */

public class Orchestre {
  final static int max = 10;
  private Instrument[] instruments;
  private int nbInstruments;

  public Orchestre() {
    instruments = new Instrument[max];
    nbInstruments = 0;
  }

  public void ajouterInstrument(Instrument instrument) {
    if (nbInstruments < max)
      instruments[nbInstruments++] = instrument;
  }

  public void jouer() {
    for (int i = 0; i < nbInstruments; i++)
      instruments[i].jouer();
  }
}
