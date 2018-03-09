import java.io.*;
class BuffRead
{
 public static void main(String[] args) throws IOException
 {
  String text;
  InputStreamReader isr = new InputStreamReader(System.in);
  BufferedReader br = new BufferedReader(isr);
  text = br.readLine();        
  System.out.println(text);
 }
}