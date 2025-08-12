
/*
* Program1 : Write a generic class that stores a pair of values of any type,
* and a method to compare two pairs for equality.
* */


class Program1 {
    public static void main(String[] args) {

        Pair<Integer, String> pair1 = new Pair<>(1, "Java");
        Pair<Integer, String> pair2 = new Pair<>(1, "Java");
        Pair<Integer, String> pair3 = new Pair<>(2, "Python");

        System.out.println("pair1 equals pair2: "+Pair.compare(pair1,pair2));
        System.out.println("pair1 equals pair3: "+Pair.compare(pair1, pair3));
    }
}