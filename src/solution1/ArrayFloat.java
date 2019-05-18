package solution1;

/**
 * Tableau de taille fixe de float.
 */
public class ArrayFloat {

  protected float[] arr;

  public ArrayFloat(int nb) {
    arr = new float[nb];
  }

  public int size() {
    return arr.length;
  }

  public float get(int i) {
    return arr[i];
  }

  public void set(int i, float val) {
    arr[i] = val;
  }

}
