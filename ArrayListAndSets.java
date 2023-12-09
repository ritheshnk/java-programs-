import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PracticeMan {

   public static void main(String[] args){
       ArrayList l= new ArrayList();

       l.add(10);
       l.add(20);
       l.add(30);
       l.add(40);
       System.out.println(l);
       Iterator i =l.listIterator();
       while(i.hasNext()){
           System.out.println(i.next());
       }

       //Set doesnt allow you to print duplicate values
       //Set s=new HashSet(); used to store any value string int but if u specify int like down only int is needed
       Set<Integer> s=new HashSet();
       s.add(1);
       s.add(2);
       s.add(3);
       s.add(2);
       s.add(4);
       s.add(5);
       System.out.print(s);
       Iterator x=s.iterator();
       while(x.hasNext()){
           System.out.println(x.next());
       }
       System.out.print(s);
   }


}
