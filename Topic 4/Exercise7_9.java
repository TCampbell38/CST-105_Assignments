import java.util.Scanner;

public class Exercise7_9 {
    public static void main(String[] args) {

        double[] numbers = new double[10];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 10 different numbers.");
        
        for (int i = 0; i < numbers.length; i++ ){

            numbers[i] = input.nextDouble();
            
        }
        
        min(numbers);
    }
            public static double min(double[] numbers){

                  double min = numbers[9];

                 for(int i=0;i<numbers.length;i++){

                    if(numbers[i] < min){

                      min = numbers[i];

                      System.out.println(min);

                    }
                  }
                  return min;
                }
}