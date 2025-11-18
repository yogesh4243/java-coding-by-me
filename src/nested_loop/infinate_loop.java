package nested_loop;

public class infinate_loop {
    public static void main(String[] args) {

        for (int j = 1; j <= 5; ) {   // j++ is missing → infinite loop
            System.out.println("Value of j: " + j);
            // No j++ inside → j never changes → infinite loop
            //Process finished with exit code 130
            //output:Value of j: 1
            //Value of j: 1
            //Value of j: 1
            //Value of j: 1
            //Value of j: 1
            //Value of j: 1
            //Since j always stays 1, the condition j <= 5 is always true, causing an infinite loop.

        }
    }
}
