package solution3;

/**
 * Tableau de taille fixe de T (type générique).
 */
public class Array<T> {

  protected T[] arr;

  // si nb < 0 on peut lever une (checked) Exception.
  public Array(int nb) {
    arr = (T[]) new Object[nb];
  }

  public int size() {
    return arr.length;
  }

  public T get(int i) {
    return arr[i];
  }

  public void set(int i, T val) {
    arr[i] = val;
  }

}
