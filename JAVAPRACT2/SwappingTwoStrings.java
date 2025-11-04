public class SwappingTwoStrings {
    public static void main(String[] args) {
        
        String a = "Vinod";
        String b = "Kayara";

        System.out.println("before swapping a is:"+a);
        System.out.println("Before swapping b is:"+b);
         

        a=a+b;
        // System.out.println(b);

        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println("After swapping a is : "+a);
        System.out.println("After Swapping b is :"+b);

        
        

    }
    
}
