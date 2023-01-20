public class IfStatement {
    public static void main(String[] args) {
        int number = 10;

        //Switch is am alternative to if-Statements
        switch(number){

            case 3:
                System.out.println("Three");
                break;
            case 43:
                System.out.println("Forty three");
                break;
            case 10:
                System.out.println("Ten!");
                break;
            default:
                System.out.println("Found something else!");
        }
    }

}
