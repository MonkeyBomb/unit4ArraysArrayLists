import java.util.ArrayList;
public class ArrayListPractice
{
   public static void main(String[] args)
   {
       ArrayList<String> words = new ArrayList<String>();
       
       words.add("test");
       words.add("like");
       words.add("like");
       words.add("cookie");
       words.add("monster");
       System.out.println(words);
       
       for(int i = words.size() - 1; i >= 0; i--)
       {
           String word = words.get(i);
           if(word.equals("like"))
           {
               words.remove(i);
           }
       }
       System.out.println(words);
   }    
   
}
