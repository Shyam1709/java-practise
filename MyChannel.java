import java.nio.*;
import java.nio.channels.FileChannel;
import java.io.*;
import java.io.IOException;  
import java.nio.ByteBuffer;  
import java.nio.channels.ReadableByteChannel;  
import java.nio.channels.WritableByteChannel;  
 public class MyChannel {  
    public static void main(String args[]) throws IOException {  
    RandomAccessFile aFile = new RandomAccessFile("data.txt", "rw");
    FileChannel inChannel = aFile.getChannel();
    ByteBuffer buf = ByteBuffer.allocate(48);
    int bytesRead = inChannel.read(buf);
    while (bytesRead != -1) {
      System.out.println("Read " + bytesRead);
      buf.flip();

      while(buf.hasRemaining()){
          System.out.print((char) buf.get());
      }
      buf.clear();
      bytesRead = inChannel.read(buf);
    }
    aFile.close();
    }  
}  