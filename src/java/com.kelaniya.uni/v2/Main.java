package v2;

public class Main {
    public static void main(String[] args){

        //make sure to validate the arguments before using..

       if(args.length==0) {
           System.out.println("Please provide the operation as an argument");
           return;
       }
       System.out.println(args[0]);

    }
}
