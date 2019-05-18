package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {

  public static void main(String[] args) {
//    testArrayList();
//    testHashSet();
    testHashMap();
  }

  public static void testArrayList() {
    ArrayList<Integer> list = new ArrayList<Integer>();
    System.out.println("size : " + list.size());

    list.add(-1);
    System.out.println("add(-1)");
    list.add(100);
    System.out.println("add(100)");

    System.out.println("size : " + list.size());

    System.out.println("0 : " + list.get(0));
    System.out.println("1 : " + list.get(1));

    list.set(0, 60);
    System.out.println("set(0, 60)");
    System.out.println("0 : " + list.get(0));

    list.remove((Object) 60);
    System.out.println("remove(60)");
    System.out.println("0 : " + list.get(0));
  }

  public static void testHashSet() {
    HashSet<Integer> set = new HashSet<Integer>();

    set.add(10);
    set.add(60);
    System.out.println(set.size());

    set.add(60);
    System.out.println(set.size());

    set.remove(60);
    System.out.println(set.size());
  }

  public static void testHashMap() {
    HashMap<String, Integer> note = new HashMap<>();
    note.put("Etudiant1", 10);
    note.put("Etudiant2", 16);
    note.put("Etudiant1", 18);

    System.out.println(note.get("Etudiant1"));

    note.remove("Etudiant1");

    System.out.println(note.get("Etudiant1"));
  }

}
