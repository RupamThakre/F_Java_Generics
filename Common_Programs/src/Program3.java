/*
* Create a class Box which is able to take any kind of types
* */
public class Program3 {
   public static void main(String... args) {
       Box<Integer> box = new Box<>(1);
       System.out.println(box.getValue());

       Box<String> boxString = new Box<>("Apple");
       System.out.println(boxString.getValue());
   }
}

/*
* In short terms - generics allows you to write code
* that can work with any object type while ensuring
* type safety at compile time
* */

