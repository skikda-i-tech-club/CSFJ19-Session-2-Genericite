package solution3;

public class Main {

  public static void main(String[] args) {
    // Création d'un tableau de Integer (Classe enveloppe de int).
    Array<Integer> array = new Array<Integer>(10);
    array.set(0, 5);
    array.set(9, 20);
    for (int i = 0; i < array.size(); i++) {
      System.out.println(array.get(i));
    }

    // Création d'un tableau de String.
    Array<String> strs = new Array<String>(10);
    strs.set(0, "Hello");
    strs.set(9, "World");
    for (int i = 0; i < strs.size(); i++) {
      System.out.println(strs.get(i));
    }

    // Cette solution résout tout les problèmes vus précedemment (Une seule
    // classe, qui s'adapte au type (générique)).
    // La généricité a été ajouté avec Java 5, avant ça les programmeurs
    // utilisaient la première ou la deuxième solution.
  }
}
