public class RemoveDuplicates {
    // Function to remove duplicate elements
    static int removeDuplicates(int arr[])
    {
        // Return 0, if array is empty or contains a single element
        if (arr.length==0 || arr.length==1){
        return 0;
        }

        // To store index of next unique element
        int j = 0;

        // for each element of the array, check to see if the next element is a  duplicate
        for (int i=0; i < arr.length -1; i++){
            if (arr[i] != arr[i+1]) {
                arr[j++] = arr[i];
            }
        }
        arr[j++] = arr[arr.length-1];
        return 0;
    }

    public static void main(String[] args) {
        int array[] = {1,1,2,3,4,5,6,7,7,8};
        removeDuplicates(array);
        // print out the reversed array
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + ", ");
        }
    }

}
