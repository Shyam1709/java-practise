import java.io.*;
class Serialize implements Serializable
{
    String name;
   transient int rid;
    static String contact;
    Serialize(String n, int r, String c)
    {
    this.name = n;
    this.rid = r;
    this.contact = c;
    }
}

class Test
{
    public static void main(String[] args)
    {
        try
        {
            Serialize si = new Serialize("Abhi", 104, "110044");
            FileOutputStream fos = new FileOutputStream("student.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(si);
            oos.close();
            fos.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}