
import java.security.KeyStore;
import java.util.HashMap;
import java.util.HashSet;
import javax.swing.RowFilter;

public class DUplicate {
     public static void main(String[] args) {
         String name[]={"java","c","python","java"};

         for(int i=0;i<name.length;i++){
            for(int j=i+1; j<name.length;j++){
                if(name[i].equals(name[j])){
                    System.out.println("The duplicate elements is:"+name[i]);
                }
            }
         }
         //2.using HAsh set
          HashSet<String> store = new HashSet<>();
          for(String names : name ){
            if(store.add(names)==false){
                System.out.println("The duplicate elements is:"+names);

            }

          }

          //3.using HAsh Map

        //   HashMap<String,Integer> storeMap= new HashMap<String,Integer>();
        //   for(String names: name ){
        //     Integer count= storeMap.get(names);

        //     if(count==null){
        //         storeMap.put(names,1);

        //     }
        //     else{
        //         storeMap.put(names,++count);
        //     }

        //   }

        //   HashSet<Entry<String,Integer>> entrySet=storeMap.entrySet();
        //   for(Entry<String,Integer> entry : entrySet){
        //     if(entry.getValue()>1){
        //         System.out.println("duplicate element is:: "+entry.getKey());
        //     }
        //   }


     }
    
}
