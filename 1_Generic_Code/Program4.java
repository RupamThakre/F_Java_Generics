
class Pair<K, V>{

    private K first;
    private V second;

    public Pair(K first, V second){
        this.first = first;
        this.second = second;
    }

    public K getFirst(){
        return first;
    }

    public V getSecond(){
        return second;
    }

    public static <K,V> boolean compare(Pair p1, Pair p2){
        return p1.getFirst().equals(p2.getFirst())&&p2.getSecond().equals(p2.getSecond());
    }
}


class Main {
    public static void main(String[] args) {

        Pair<Integer, String> p1 = new Pair<>(1,"Ram");
        Pair<Integer, String> p2 = new Pair<>(1,"Ram");
        Pair<Integer, String> p3 = new Pair<>(2, "Shyam");

        System.out.println("P1-P2 : "+Pair.compare(p1,p2));
        System.out.println("P1-P3 : "+Pair.compare(p1,p3));

    }
}