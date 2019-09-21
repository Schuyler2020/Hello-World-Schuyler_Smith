import java.util.Scanner;

public class Smith_P2 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int choice;
        System.out.print("Press 1 for pounds or 2 for kilograms: ");
        choice= scnr.nextInt();
        
        if (choice ==1 )
        { 
        	pounds(scnr);
        }
        else 
        {
        	kilo(scnr);
        }
        

    }

    public static double pounds(Scanner scnr) {
    	double weight, height;
        System.out.print("weight (in pounds)? ");
        weight=scnr.nextDouble();
        System.out.print("height (in inches)? ");
        height=scnr.nextDouble();


        return bmiPounds(height, weight);
    }

    public static double bmiPounds(double height, double weight) {
    	double Pbmi =(weight * 703 / height / height);
    	
    	report(Pbmi);
        return Pbmi;
    }

    public static void report(double bmi) {
        System.out.printf("BMI = %f\n",bmi);
        if (bmi < 18.5) {
            System.out.println("underweight");
        } else if (bmi < 25) {
            System.out.println("normal");
        } else if (bmi < 30) {
            System.out.println("overweight");
        } else {
            System.out.println("obese");
        }
    }
    
    
    public static double kilo(Scanner scnr) {
    	double kiloWeight, heightMeter;
        System.out.print("weight (in kilograms)? ");
        kiloWeight=scnr.nextDouble();
        System.out.print("height (in meters)? ");
        heightMeter=scnr.nextDouble();


        return bmiKilos(heightMeter, kiloWeight);
    }
    
    public static double bmiKilos(double heightMeter, double weightKilos) {
    	double kBMI= (weightKilos / (heightMeter*heightMeter));
    	report(kBMI);
        return kBMI;
    }
}