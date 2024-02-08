package zad_Pair;

public class Pair <first, second> { // tutaj <F, S>

    private first numer; // bylo zrobic typ F i nazwac pole first : private F first
    private second slowo;

    public Pair(first numer, second slowo) {
        this.numer = numer;
        this.slowo = slowo;
    }

    public second getSlowo() {
        return this.slowo;
    }

    public first getnumer() {
        return this.numer;
    }
}
