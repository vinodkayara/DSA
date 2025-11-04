

public class RevString {
    public static void main(String[] args) {
        String str ="VinodKayara";

        String rev="";

        int len=str.length();

        for(int i=len-1;i>=0;i--){
            rev=rev+str.charAt(i);

        }
        System.out.println(rev);
    
    
    
        //string buffer 
StringBuffer sf= new StringBuffer(str);
System.out.println(sf.reverse());

}
}