import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user for weight and height
        System.out.print("Enter your weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter your height in inches: ");
        double height = input.nextDouble();
        // Calculate BMI
        double bmi = (weight * 703) / Math.pow(height, 2);
        // Determine weight category
        String range;
        if (bmi < 18.5) {
            range = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 25){
            range = "Optimal weight";
        } else {
            range = "Overweight";
        }
        // Display results
        System.out.printf("Your BMI is %.2f\n", bmi);
        System.out.println("That BMI is " + range);
        input.close();
        }
        }
    }
}