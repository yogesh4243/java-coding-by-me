package break_in_java_code;

public class break_in_loop {
    public static void main(String[] args) {


        for (
                int i = 1;
                i <= 10; i++) {
            if (i == 5) {
                break;     // loop stops when i becomes 5
            }
            System.out.println(i);//output: 1
            //2
            //3
            //4

        }
    }
}
