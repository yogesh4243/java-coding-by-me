package break_in_java_code;
public class SwitchCaseBreakExample {
    public static void main(String[] args) {

        int day = 2;

        switch(day) {
            case 1:
                System.out.println("tuesday");
                break;   // Stops execution and exits switch
            case 2:
                System.out.println("wednesday");
                break;   // Stops execution and exits switch
            default:
                System.out.println("Invalid");
        }
    }
}

