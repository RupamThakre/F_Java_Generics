/*
 * ? - represent unknown type
 *
 * 3 Main use cases
 *
 * 1. Unknown types - List<?> list
 * 2. Upper bound - List<? extends Number>
 * 3. Lower bound - List<? super Integer>
 * */
public class WildCardOperator {
    public static void main(String[] args) {
        //UseCase-01 : Unknown Types
        public void printList(List<?> list) {
            for (Object elem : list) {
                System.out.println(elem);
            }
        }

        //UseCase-02: Upper Bounded Wildcard: <? extends T>
        public void process(List<? extends Number> list) {
            for (Number n : list) {
                System.out.println(n.doubleValue());
            }
        }

        //UseCase03: Lower Bounded Wildcard: <? super T>
        public void addNumbers(List<? super Integer> list) {
            list.add(42);  // OK
        }
    }
}