import java.nio.*;
import java.nio.channels.*;
import java.util.concurrent.*; 
import java.nio.file.*;
import java.io.IOException;
class AsyncFile{
	public static void main(String args[]) throws IOException{
		Path path = Paths.get("data.txt");
AsynchronousFileChannel fileChannel=AsynchronousFileChannel.open(path, StandardOpenOption.READ);
ByteBuffer buffer = ByteBuffer.allocate(1024);
long position = 0;
Future<Integer> operation = fileChannel.read(buffer, position);
while(!operation.isDone());
buffer.flip();
byte[] data = new byte[buffer.limit()];
buffer.get(data);
System.out.println(new String(data));
buffer.clear();
	}
}