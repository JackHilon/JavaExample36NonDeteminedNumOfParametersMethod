
package javaexample36nondeteminednumofparametersmethod;


public class JavaExample36NonDeteminedNumOfParametersMethod {

    
    public static void main(String[] args) {
        
       int a=3;
       int b=7;
       int c=1435;
        MyPrint(a);
        System.out.println("---");
        MyPrint(a,b);
        System.out.println("---");
        MyPrint(a,b,c);
        System.out.println("---");
        System.out.println();
        System.out.println();
        
        int[] myArray=MyVector(a,b);
        ZeroArray(myArray);
        MyPrint(a,b,c);
        System.out.println("===");
        System.out.println();
        System.out.println();
        
        int[] myNewArray=IncrementArrayWithKInteger(11, a,b,c);
        PrintIntArray(myNewArray);
        System.out.println("---");
        MyPrint(a,b,c);
        
        
    }
    
    private static void MyPrint(int... numbers)
    {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("*"+numbers[i]);
        }
    }
    
    private static void ZeroArray(int[] vector)
    {
        for (int i = 0; i < vector.length; i++) {
            vector[i]=0;
        }
    }
    
    private static int[] MyVector(int... numbers)
    {
        int[] res=numbers;
        return res;
    }
    
    private static int[] IncrementArrayWithKInteger(int k, int... numbers)
    {
        int[] res=new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]=numbers[i]+k;
            res[i]=numbers[i];
        }
        return res;
    }
    
    private static void PrintIntArray(int[] a)
    {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    
}
