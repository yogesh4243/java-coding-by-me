package nested_loop;

public class nested_loop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {        // Outer Loop
            for (int j = 1; j <= 2; j++) {    // Inner Loop
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
