import java.util.Arrays;

public class MissingNumber {
    // method takes in two parameters, the array of the numbers and the maximum value in those numbers
    static int findMissingNumber(int [] numbers, int max){

        // sort the numbers
        Arrays.sort(numbers);
        // from 1 to the maximum value, check if the value exists
        for(int i=0; i<max; i++){
            if(numbers[i] != i+1){
                return i + 1;
            }
        }
        // return 0 if all numbers are present
        return 0;
    }

    public static void main(String[] args) {
       int numbers[] = {1,2,3,4,5,7,8,9,10};
       int missingNumber = findMissingNumber(numbers, 10);

        System.out.println("Missing number is " + missingNumber);
    }

}
