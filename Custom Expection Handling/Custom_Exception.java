package ExceptionHandling;

public class Custom_Exception {
    public static void main(String [] args){
        int nume[] = {20,25,14,55,35,70,85};
        int deno[] = {2,0,4,0,5};
        
        for(int i = 0; i<nume.length; i++)
        {
            try{        

                if(nume[i]%deno[i] == 0)    
                    throw new NonIntResultHandling(nume[i], deno[i]);   // Assign the Numbers into the parameters in NonIntResultHandling Java program
                    System.out.println(nume[i] + " / " +  deno[i] + " = " + nume[i]/deno[i]); // Outputs if == 0

            }
            catch(ArithmeticException ex){  
                System.out.println(" Can't divide by Zero ! ");
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(" No Matching Element Found ! ");
            }
            catch(NonIntResultHandling exe){
                System.out.println(exe);
            }
        }
    }
}
