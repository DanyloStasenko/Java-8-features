package theory;

public class Theory {

    public static void main(String[] args) {
        // todo: Example 1. Plain old Java code. Using an anonymous inner class to associate behavior with a button click
        /*
        Button button = new Button();
                button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("button clicked");
            }
        });
        */

        // todo: Example 2. Java 8 feature. Using a lambda expression to associate behavior with a button click
        /*
        button.addActionListener(event -> System.out.println("button clicked"));
        */

        // todo: Example 3. Java 8 feature. Different ways of writing lambda expressions
        /*
        Runnable noArguments = () -> System.out.println("Hello World");
        ActionListener oneArgument = event -> System.out.println("button clicked");
        Runnable multiStatement = () -> {
            System.out.print("Hello");
            System.out.println(" World");
        };
        BinaryOperator<Long> add = (x, y) -> x + y;
        BinaryOperator<Long> addExplicit = (Long x, Long y) -> x + y;
        */

        // todo: Example 4. Java 8 feature. Important functional interfaces in Java
        // Interface name       Arguments   Returns     Example
        // Predicate<T>         T           boolean     Has this album been released yet?
        // Consumer<T>          T           void        Printing out a value
        // Function<T,R>        T           R           Get the name from an Artist object
        // Supplier<T>          None        T           A factory method
        // UnaryOperator<T>     T           T           Logical not (!)
        // BinaryOperator<T>    (T, T)      T           Multiplying two numbers (*)
    }
}
