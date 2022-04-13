import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//https://www.javatpoint.com/java-map
public class ExampleMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String, Integer> hm = new HashMap<String, Integer>();
        // using put() method
        for(int i=0;i<n;i++) {
            String name=in.nextLine();
            int phone=in.nextInt();
            // Inserting pairs in above Map
            hm.put(name, phone);
            in.nextLine();
        }
        while(in.hasNext()) {
            String s=in.nextLine();
            if(hm.get(s)!= null) System.out.println(s + "="+ hm.get(s));
            else System.out.println("Not found");
        }
    }
}
