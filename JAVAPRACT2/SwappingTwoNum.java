public class SwappingTwoNum {
    public static void main(String args[]){
        int x=10;
        int y=5;

        // //1.using third variable 
        int t=0;
        t=x;
        x=y;
        y=t;

        System.out.println(x);
        System.out.println(y);

        //2.without using third variable 

        x=x+y;//15
        y=x-y;//10
        x=x-y;//5

        System.out.println(x);
        System.out.println(y);

        //3
        x=x*y;
        y=x/y;
        x=x/y;

        System.out.println(x);
        System.out.println(y);

        //
        x=x^y;
        y=x^y;
        x=x^y;
        System.out.println(x);
        System.out.println(y);

    }
    
}
