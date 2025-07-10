public class Pair<T, U> {

    private T first;
    private U second;

    public Pair(T first, U second){
        this.first = first;
        this.second = second;
    }

    public T getFirst(){
        return first;
    }

    public U getSecond(){
        return second;
    }

    //Generic method to compare two pairs
    public static <T, U> boolean compare(Pair<T,U> p1, Pair<T, U> p2){
        return p1.getFirst().equals(p2.getFirst()) && p1.getSecond().equals(p2.getSecond());

    }

    @Override
    public String toString( ){
        return "("+first+ " , "+second+ ")";
    }



}