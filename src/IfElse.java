public class IfElse {
    public static void main(String[]args){

        int a =10;
        int b = 20;

        if (b>a){
            System.out.println("b is greater then a");
        }
        else
            System.out.println("a is greater then b");
        int c =40;
        int d =50;

        if(c==d){
            System.out.println(("c is equal to d"));
        }
        else
            System.out.println("c is not equal to d");

        // false and false is = false
        // false and true is = false
        //true and true is = true


        int a1 =400;
        int a2 =200;
        int a3 =300;

        if(a1 >a2 & a1>a3){
            System.out.println("a1 is the greatest");
        }
        else if(a2>a3){
            System.out.println("a2 is the greatest");
        }
        else
            System.out.println("a3 is the greatest");
        }
    }
