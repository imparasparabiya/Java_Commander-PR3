public class Calculator {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 5;
        Integer ch = 1;
        System.out.println("Press 1 for Sum");
        System.out.println("Press 2 for Sub");
        System.out.println("Press 3 for Multi");
        System.out.println("Press 4 for Divison");
        System.out.println("Press 5 for Modiauls");

        switch (ch) {
            case 1:
                System.out.println("Sum of " + a + "+" + b + " = " + (a + b));
                break;
            case 2:
                System.out.println("Sub of " + a + "-" + b + " = " + (a - b));
                break;
            case 3:
                System.out.println("Multi of " + a + "* " + b + "= " + (a * b));
                break;
            case 4:
                System.out.println("Divison of " + a + "/" + b + " = " + (a / b));
                break;
            case 5:
                System.out.println("Modiauls of " + a + " % " + b + "=" + (a % b));
                break;

            default:
                System.out.println("Plz Press Right Key");
                break;
        }
    }
}
