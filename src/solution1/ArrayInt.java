package solution1;

/**
 * Tableau de taille fixe de int.
 */
public class ArrayInt {

  protected int[] arr;

  public ArrayInt(int nb) {
    arr = new int[nb];
  }

  public int size() {
    return arr.length;
  }

  public int get(int i) {
    return arr[i];
  }

  public void set(int i, int val) {
    arr[i] = val;
  }

}
