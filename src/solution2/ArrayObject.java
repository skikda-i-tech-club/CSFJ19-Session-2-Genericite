package solution2;

/**
 * Tableau de taille fixe de Object (tout).
 */
public class ArrayObject {

  protected Object[] arr;

  public ArrayObject(int nb) {
    arr = new Object[nb];
  }

  public int size() {
    return arr.length;
  }

  public Object get(int i) {
    return arr[i];
  }

  public void set(int i, Object val) {
    arr[i] = val;
  }

}
