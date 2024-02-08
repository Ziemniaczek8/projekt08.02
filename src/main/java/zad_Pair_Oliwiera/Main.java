package zad_Pair_Oliwiera;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        Pair<Random, String> pair = new Pair<>(new Random(),"pies"); // Random zainicjowany w konstr. jako argument
        System.out.println(pair.first().nextInt(120));
        System.out.println(pair.second());
        ///////

    }


}
