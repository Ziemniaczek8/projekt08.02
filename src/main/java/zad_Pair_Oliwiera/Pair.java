package zad_Pair_Oliwiera;

public class Pair<F,S> {


    /*
    Napisz klasę Pair, która będzie przyjmować dwa typy generyczne:
* typ first
* typ second

Zaimplementuj metody:
* first() -> która zwróci nam wartość first
* second() -> która zwróci nam wartość second
     */

    private final F first;
    private final S second;

    public Pair(F first,  S second) {
        this.first = first;
        this.second = second;
    }

    public F first() {
        return first;
    }

    public S second() {
        return second;
    }
}
