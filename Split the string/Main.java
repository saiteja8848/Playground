import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main{
    public static void main(String args[]){
          Scanner s=new Scanner(System.in);
           String str=s.nextLine();
         Pattern pat=Pattern.compile("(or|and|,| )");
       String arg[]=pat.split(str);
      for(String v:arg)
        System.out.println(v);
    }
}