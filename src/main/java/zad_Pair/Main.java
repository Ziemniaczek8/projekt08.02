package zad_Pair;

public class Main {

    /* Napisz klasę Pair, która będzie przyjmować dwa typy generyczne:
* typ first
* typ second

Zaimplementuj metody:
* first() -> która zwróci nam wartość first
* second() -> która zwróci nam wartość second */

    public static void main(String[] args) {

        Pair<Integer, String> objekt1 = new Pair<Integer, String>(2, "Slowo"); // jesli to samo po prawej stronie to raczej nie poszemy. pomijamy

        System.out.println(objekt1.getSlowo());
        System.out.println(objekt1.getnumer());

    }
}
