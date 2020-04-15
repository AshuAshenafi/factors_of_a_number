/*
This program diplay all the factor of a number.
 */
public class FactorOfNumber {
    public static void main(String[] args) {
        int num = 50;
        for(int i = 1; i <= num/2; i++){
            if(num % i == 0){
                System.out.print(i);
                if(i != num/2){
                    System.out.print(", ");
                }
                else{
                    System.out.print(".");
                }
            }

        }
    }
}
