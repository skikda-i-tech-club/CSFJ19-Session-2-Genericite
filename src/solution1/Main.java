package solution1;

public class Main {

  public static void main(String[] args) {
    // Création d'un tableau de int.
    ArrayInt array = new ArrayInt(10);
    array.set(0, 5);
    array.set(9, 20);
    for (int i = 0; i < array.size(); i++) {
      System.out.println(array.get(i));
    }

    // Création d'un tableau de String.
    ArrayString strs = new ArrayString(10);
    strs.set(0, "Hello");
    strs.set(9, "World");
    for (int i = 0; i < strs.size(); i++) {
      System.out.println(strs.get(i));
    }

    // L'inconvénient avec cette solution est le fait de devoir créer une classe
    // ArrayX pour chaque type X.
  }

}
