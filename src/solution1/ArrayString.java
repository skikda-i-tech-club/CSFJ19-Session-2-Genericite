package solution1;

/**
 * Tableau de taille fixe de String.
 */
public class ArrayString {

  protected String[] arr;

  public ArrayString(int nb) {
    arr = new String[nb];
  }

  public int size() {
    return arr.length;
  }

  public String get(int i) {
    return arr[i];
  }

  public void set(int i, String val) {
    arr[i] = val;
  }

}
