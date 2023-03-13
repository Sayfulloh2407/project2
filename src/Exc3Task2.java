import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exc3Task2 {
    public static void main(String[] args) throws IOException  {



            float weight, hight, result;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("The program calculates your BMI Using your Hight(cm) and Weight(kg)");
            System.out.println("Enter your Weight in KG (and press Enter): ");
            weight= Float.parseFloat(br.readLine());
            System.out.println("Enter your Hight in CM (and press Enter): ");
            hight= Float.parseFloat(br.readLine())/100;

            result= (float) (weight/(Math.pow(hight, 2)));

            System.out.printf("You Hight is:"+"%2.2f", hight);
            System.out.printf(" and Weight is: "+"%2.2f", weight);
            System.out.println(); //blank Line
            System.out.printf("Your BMI =" +"%2.2f, \n", result);

            if(result<16){
                    System.out.printf("You are Starvation!");
            }
            else if(result>16 && result<16.99){
                    System.out.printf("You are emaciation!");
            }

    }
}
