import java.util.*;
class ForEac
{
  public static void main(String[] args)
  {
    LinkedList< String> ls = new LinkedList< String>();
    ls.add("a");
    ls.add("b");
    ls.add("c");
    ls.add("d");
    for(String str : ls)
    {
      System.out.print(str+" ");
    }
  }
}