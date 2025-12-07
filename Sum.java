public class Sum {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Error: You must provide at least one number.");
            System.out.println("Usage: java Sum <num1> <num2> ...");
            return;
        }

        double sum = 0;

        for (String arg : args) {
            try {
                double number = Double.parseDouble(arg);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Error: '" + arg + "' is not a valid number.");
                return;
            }
        }

        System.out.println("Sum = " + sum);
    }
}

