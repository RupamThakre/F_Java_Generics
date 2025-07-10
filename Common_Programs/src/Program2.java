import java.util.ArrayList;

public class Program2 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);
        list.add(3.14);
        System.out.println(list);
//        String str = (String) list.get(0);
//        String str1 = (String) list.get(1);
    }
}
/*
* 3 Major issue
* 1. No Type Safety
* 2. Manual casting
* 3. No Compile Time checking
* */


