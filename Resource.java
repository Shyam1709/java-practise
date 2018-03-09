import java.io.*;
class Test
{
public static void main(String[] args)
{
try(BufferedReader br=new BufferedReader(new FileReader("d:\\myfile.txt")))
{
String str;
while((str=br.readLine())!=null)
{
System.out.println(str);
}
}
}}