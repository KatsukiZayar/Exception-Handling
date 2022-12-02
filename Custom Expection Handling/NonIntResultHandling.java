package ExceptionHandling;

public class NonIntResultHandling extends Exception { // public class (Custom Name ) extends + Exception
    int a , b;
    public NonIntResultHandling(int i , int j){ // assigning a and b to int i and j Constructor
        a = i;
        b = j;
    }
    public String toString(){   // Return Constructor
        return a + "/" + b + " is not a Integer";
    }
}
