public class ReverseArray {
    public static void main(String[] args) {
        // array to be reversed
        int a[] = {1,2,3,4,5,6,7};

        // create a new array of the same size as the one to be resized
        int [] b = new int [a.length];

        int j = a.length;
        for (int i = 0; i < a.length; i++) {
            b[j - 1] = a[i];
            j = j - 1;
        }

        // print out the reversed array
        for (int i=0; i<b.length; i++){
            System.out.print(b[i] + ", ");
        }

    }
}
