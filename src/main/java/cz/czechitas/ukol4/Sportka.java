package cz.czechitas.ukol4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Třída pro losování Sportky.  a
 */
public class Sportka {
  private final List<Integer> osudi = new ArrayList<>();

  public Sportka() {
    //TODO naplnit osudí čísly 1 až 49.
    for (int i = 0; i < 49; i++) {
      osudi.add(i + 1);
    }
  }

  /**
   * Zamíchá osudí.
   *
   * @see Collections#shuffle(List)
   */
  public void zamichat() {
    //TODO zamíchat osudí
    Collections.shuffle(osudi);
  }

  /**
   * Vrátí seznam s 6 vylosovanými čísly.
   *
   * @return Seznam vylosovaných čísel.
   *
   * @see List#subList(int, int)
   */
  public List<Integer> vylosovanaCisla() {
    List<Integer> vylosovanaCisla = new ArrayList<>(6);
    for (int i = 0; i < 6; i++) {
      vylosovanaCisla.add(osudi.get(i));
    }
    return vylosovanaCisla;
  }

  /**
   * Vrátí sedmé vylosované číslo (dodatkové číslo)
   *
   * @return Dodatkové číslo.
   */
  public Integer dodatkoveCislo() {
    return osudi.get(6);
  }
}
