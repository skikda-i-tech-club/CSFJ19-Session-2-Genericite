package solution2;

public class Main {

  public static void main(String[] args) {

    ArrayObject array = new ArrayObject(10);
    array.set(0, 5);
    array.set(1, "Hello world");
    array.set(2, new Exception());
    for (int i = 0; i < array.size(); i++) {
      System.out.println(array.get(i));
//      if (array.get(i) != null) {
//        System.out.println(array.get(i).getClass());
//      } else {
//        System.out.println("null");
//      }
    }

    // String str = (String) array.get(0);

    // Cette classe résout le problème rencontré dans la solution 1, mais
    // possède aussi un défaut de typage. On a plus aucune information sur le
    // type réel des éléments du tableau lors de la compilation. Lors de
    // l'éxecution le type est présent (l'opérateur instanceof, la méthode
    // getClass()) mais son utilisation compliquera beaucoup le code.
  }
}
