import java.util.Scanner;

public class SciCalculator {
    Scanner myScanner = new Scanner(System.in);
    private Double total = 0.0;
    private Double result = 0.0;
    private int num_calc = 0;
    private int sum_calc = 0;
    private int avg_calc;




    private void run_calculator() {
        System.out.println(
                "Current Result: " + result + "\n" +
                "Calculator Menu \n" +
                "---------------\n" +
                "0. Exit Program\n" +
                "1. Addition\n" +
                "2. Subtraction\n" +
                "3. Multiplication\n" +
                "4. Division\n" +
                "5. Exponentiation\n" +
                "6. Logarithm\n" +
                "7. Display Average\n"
        );
        userSelection();
    }
    private void userSelection() {
        System.out.println("Enter Menu Selection: ");
        int option = myScanner.nextInt();
        performOperation(option);
    }

    public void performOperation(int option) {
        if (option==0) {
            System.out.println("Thanks for using this calculator. Goodbye!");
            System.exit(0);
        }
        else if (option==7)
        {
            if (num_calc > 0) {
                System.out.println("Sum of calculations: " + total);
                System.out.println("Number of calculations: " + num_calc);
                double avg_calc = total / num_calc;
                String str = String.format("%1.2f", avg_calc);
                System.out.println("Average of calculations:" + str);
                userSelection();
            } else {
                System.out.println("Error: No calculations yet to average!");
                userSelection();
            }
        }
        else if (option >= 0  && option <= 6){
            System.out.println("Enter first operand:");

            Double first_operand = myScanner.nextDouble();

            System.out.println("Enter second operand:");

            Double second_operand = myScanner.nextDouble();


            switch (option) {
                case 1:
                    result = first_operand + second_operand;
                    total += result;
                    num_calc++;
                    break;
                case 2:
                    result = first_operand - second_operand;
                    total += result;
                    num_calc++;
                    break;
                case 3:
                    result = first_operand * second_operand;
                    total += result;
                    num_calc++;
                    break;
                case 4:
                    result = first_operand / second_operand;
                    total += result;
                    num_calc++;
                    break;
                case 5:
                    result = Math.pow(first_operand, second_operand);
                    total += result;
                    num_calc++;
                    break;
                case 6:
                    result = Math.log(second_operand) / Math.log(first_operand);
                    total += result;
                    num_calc++;
                    break;
                default:
                    System.out.println("Error: Invalid selection!");
                    userSelection();

            }

        }
        else {
            System.out.println("Error: Invalid selection!");
            userSelection();
        }
        }

    public static void main(String[] args) {
        SciCalculator calculator = new SciCalculator();
        while (true) {
            calculator.run_calculator();
        }
    }
    }

