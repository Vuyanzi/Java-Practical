# Java Questions


#### Write a function to detect if two strings are anagrams
```
import java.util.Arrays;  
public class Anagram {  
    static boolean areAnagram(String firstString, String secondString){  
        // convert the strings to character arrays  
  char[] str1 = firstString.toCharArray();  
 char[] str2 = secondString.toCharArray();  
  
  // if the string lengths are not the same then definitely not anagram  
  if(str1.length != str2.length){  
            return false;  
  }  
  
        // Sort both strings. Once sorted, the characters in both strings will have the same order  
  Arrays.sort(str1);  
  Arrays.sort(str2);  
  
  // Compare sorted strings  
  for (int i = 0; i < str1.length; i++) {  
            if (str1[i] != str2[i]) {  
                return false;  
  }  
        }  
  
        return true;  
  }  
  
    public static void main(String [] args){  
        String a = "abcd";  
  String b = "dcab";  
  
 if(areAnagram(a, b)){  
            System.out.println("The two strings are anagram");  
  } else{  
            System.out.println("The two strings are not anagram");  
  }  
    }  
  
}
```

#### Recursive function

```
public class RecursiveMethod {  
    static int factorial(int n){  
        if (n == 0)  
            return 1;  
 else return(n * factorial(n-1));  
  }  
    public static void main(String args[]){  
        int number=4;  
 int fact = factorial(number);  
  System.out.println("Factorial of "+number+" is: "+fact);  
  }  
}
```

#### Web application contains thousands of users who communicate with the database simultaneously. How is that achieved? Do they every time go through Connect Db - Fetch result - Close Connection ? Or there is some other way. Use illustrations to explain your answers.

 There’s another way called **pooling**. In connection pooling, after a connection is created, it is placed in the pool and it is used over again so that a new connection does not have to be established. If all the connections are being used, a new connection is made and is added to the pool.

#### Demonstrate how to reverse an array(values at the end of the array are shifted to the front where the array remains to be in a sorted order).

```
public class ReverseArray {  
    public static void main(String[] args) {  
        // array to be reversed  
  int a[] = {1,2,3,4,5,6,7};  
  
  // create a new array of the same size as the one to be resized  
  int [] b = new int [a.length];  
 // insert each element in the array a into array b from the back 
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
```
##### Output
```
7, 6, 5, 4, 3, 2, 1,
```

#### Given a sorted array of integers, write a function to remove any duplicates (e.g. 1,2,3,3,3,4,4,5 would go to 1,2,3,4,5).

```
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
            System.out.println(array[i]);  
  }  
    }  
  
}
```
##### Output:
```
1, 2, 3, 4, 5, 6, 7, 8, 7, 8,
```


#### Given a positive integer N, calculate the sum of all prime numbers between 1 and N(inclusive), provide code sample for this solution, provide comments where applicable and describe all your actions.

```
public class PrimeNumberSum {  
    // Method to check if the number given is a prime number  
  static boolean isPrime(int numberToCheck)  
    {  
        if(numberToCheck == 1) {  
            return false;  
  }  
        for (int i = 2; i*i <= numberToCheck; i++) {  
            if (numberToCheck % i == 0) {  
                return false;  
  }  
        }  
        return true;  
  }  
    // Method to iterate from 1 to j  
 // For each iteration if the number is prime, sum its value  static int primeNumbersSum(int j)  
    {  
        int sum = 0;  
 for (int i = j; i >= 1; i--) {  
  
            // Check for prime  
  boolean prime = isPrime(i);  
 if (prime) {  
  
                // Sum the prime number  
  sum = sum + i;  
  }  
        }  
        return sum;  
  }  
  
    public static void main(String[] args) {  
        int sum = primeNumbersSum(50);  
  System.out.println("The sum of prime numbers in 50 is " + sum);  
  }  
  
}
```
##### Output:
```
The sum of prime numbers in 50 is 328
```

#### With the help of code snippets, distinguish between String, StringBuilder, and StringBuffer.

> **String** is immutable. Therefore making a change to it simply creates  new object.
``` 
// Declare a String a, and try to concatenate it with another String.
String a = “My name is ”;
a = a + “Doe”;
// Try printing a
System.out.println(a);
// The output will be “My name is ”
```
> **StringBuilder** on the hand is mutable therefore its value can be changed.
```
StringBuilder a = “My name is “;
a.append(“Doe”);
// The value of a changes
System.out.println(a);
//The output will be “My name is Doe”
```
> **StringBuffer** is same as **StringBuilder** except that it is thread safe. That is, multiple threads can use it without any issue.

#### Write a program to find the missing number in a collection in Java; that is, in an array 1-100 numbers are stored, one number is missing how do you find it?

```
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
```

#### Difference between a linked list and array data structure and demonstrate how you would find middle element of a linked list in a single pass.

>1. An array is the data structure that contains a collection of similar type data elements whereas the Linked list is considered as non-primitive data structure contains a collection of unordered linked elements known as nodes.  
>2. In the array the elements belong to indexes, i.e., if you want to get into the fourth element you have to write the variable name with its index or location within the square bracket.  
In a linked list though, you have to start from the head and work your way through until you get to the fourth element.
>3. Arrays are of fixed size. In contrast, Linked lists are dynamic and flexible and can expand and contract its size.


#### One of the Object Oriented Programming principles is Inheritance. Demonstrate the following, and provide a test routine for your objects.
 

 1. How a mountain bicycle can inherit from a general class Bicycle.
 2. Patient can inherit from Person. 
 3. A bird can inherit from an Animal class
#### Bicycle and Mountain Bike
```
public class Bicycle {  
    private String name;  
 private int wheels;  
 private int pedals;  
 private int breaks;  
  
 public Bicycle(String name, int wheels, int pedals, int breaks) {  
        this.name = name;  
 this.wheels = wheels;  
 this.pedals = pedals;  
 this.breaks = breaks;  
  }  
      
}
```
```
public class MountainBike extends Bicycle {  
    private int gear;  
  
 public MountainBike(String name, int wheels, int pedals, int breaks, int gear) {  
        super(name, 2, 2, 2);  
 this.gear = gear;  
  }  
  
}
```

```
public class Main {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle("bike", 2, 2, 2);
		MountainBike bike2 = new MountainBike("Mbike", 2, 2, 2, 3);       
    }
}
```

#### Patient and Person
```
public class Person {  
    private int legs;  
 private int head;  
 private int hands;  
  
 public Person(int legs, int head, int hands) {  
        this.legs = legs;  
 this.head = head;  
 this.hands = hands;  
  }  
}
```
```
public class Patient extends Person {  
    private String sickeness;  
  
 public Patient(int legs, int head, int hands, String sickeness) {  
        super(legs, head, hands);  
 this.sickeness = sickeness;  
  }  
}
```
#### Bird and Animal
```
public class Animal {  
    private int eyes;  
 private int legs;  
 private int teeth;  
 private int tail;  
 private String coat;  
  
 public Animal(int eyes, int legs, int teeth, int tail, String coat) {  
        this.eyes = eyes;  
 this.legs = legs;  
 this.teeth = teeth;  
 this.tail = tail;  
 this.coat = coat;  
  }  
  
}
```
```
public class Bird extends Animal {  
 private int wings;  
  
 public Bird(int eyes, int legs, int teeth, int tail, String coat, int wings) {  
        super(eyes, legs, teeth, tail, coat);  
 this.wings = wings;  
  }  
}
```
