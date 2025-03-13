                // RECURSIONS 
                
// print numbers from n to 1 (descending order)


public class recursionsBasics{
public static void printdescen(int n){
    if(n==1){                  // final base case
        System.out.print(n);
        return;
    }
System.out.print(n+ " ");
printdescen(n-1);   // calling to inner functions
}

    public static void main (String args[]){
        int n= 10;
        printdescen(n);
    }
}


// print numbers from 1 to n (increasing order)

public class recursionBasics{
    public static void printincre(int n ){
        if (n==1){ // final base case
            System.out.print(n);
            return;
        }
        printincre(n-1);  // inner function call
        System.out.print(" "+n);
    }
    public static void main (String args[]){
        int n = 15;
        printincre(n);
    }
} 


 // print factorial of numbers 


  public class recursionBasics{
public static int fact(int n){
if (n== 0 ){   // base case : 0!= 1
    return 1;
}
int fnm1= fact(n-1);    // calling to function to calculte factorial of n-1
int fn= n*(fnm1);
return fn;
}
    public static void main(String[] args) {
        int n = 5;
        System.out.print(fact(n));
    }
 }


 // print sum of first n natural numbers

  public class recursionBasics{
public static int sum(int n){
    if (n==1){
        return 1;
    }
int fnm1= sum(n-1);
int sum= n+(fnm1);
return sum;
}

    public static void main(String[] args) {
        int n = 10;
        System.out.print(sum(n));
    }
 }


 // print Nth fibonacci number

 public class recursionsBasics{
public static int fibo(int n){
if (n==0 || n==1){       // base cases 0 and 1 because we need last two numbers to get our new fib no.
    return n;
}
    int fnm1= fibo(n-1);
    int fnm2= fibo(n-2);
    int fibo= (fnm1)+(fnm2);
    return fibo;
 }
public static void main(String[] args) {
   int n= 5;
    System.out.print(fibo(n));
}
 }


 // check whether the array is sorted or not

 public class recursionsBasics{
    public static boolean issorted(int arr[], int i){
if (i== arr.length-1){
    return true;
}
if(arr[i]>arr[i+1]){
    return false;
}
return issorted(arr, i+1);
    }
    public static void main(String [] args){
int arr[]= {1,2,3,4,5};
System.out.print(issorted(arr, 0));

    }
 }


 // Write a functions to find the first occurence of element in array (basically find the key and return it's index)
 //approach - compare with self and then look forward


 public class recursionsBasics{
    public static int firstoccurence(int arr[], int key, int i){
        if(i == arr.length){ // base case
            return-1;
        }
        if(arr[i] == key){
            return i;
        }
        return firstoccurence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]={1,2,34,5,6,7,8,20};
        System.out.print(firstoccurence(arr, 20, 0));
    }
 }


 // Write a function to find last occurence of element in aaray (basicall find the key and return it's index)
 // approach - look forward and then compare with selt

public class recursionsBasics{
    public static int lastoccurence(int arr[], int key , int i){
if (i == arr.length){  // base case
    return -1;
}
int isfound= lastoccurence(arr, key, i+1);
if(isfound == -1 && arr[i] == key){
    return i;
}
return isfound;
    }
    public static void main(String[] args) {
        int arr []= {1,33,4,88,90,33,88};
        System.out.print(lastoccurence(arr,33,0));
    }
}
 
 
