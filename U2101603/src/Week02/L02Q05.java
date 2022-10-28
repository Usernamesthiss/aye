package Week02;

/**
 *
 * @author User
 */
//generate a random number 0 to 1000
        import java.util.Random;
public class L02Q05 {
    public static void main(String[] args) {

        System.out.println("1 Random Number Generator");

        // random
        int max= 10_000;
        int num;
        Random rand= new Random();

        num= rand.nextInt(max+1) ; //0 to 1000 inclusive

        System.out.print("The random number generated= ");
        System.out.print(num);

        //find sum of digits
        int sum=0;
        int number= num;

        while (num>0){
            sum+= num%10;
            num/= 10;
        }

        System.out.println("\nSum of all digits: "+ sum);



    }

}
