import java.io.*;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class iotest {


    private static void io1() {
        OutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(".io/text.txt");
            outputStream.write('a');
            outputStream.write('b');
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void io2() {
        try {
            InputStream inputStream = new FileInputStream(".io/text.txt");
            System.out.println((char) inputStream.read());
            System.out.println((char) inputStream.read());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void io3(){
        try (InputStream inputStream = new FileInputStream(".io/text.txt")){
            Reader reader = new FileReader(".io/text.txt");
            Reader reader1 = new InputStreamReader(inputStream);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void io6(){
        try(Socket socket = new Socket("hencoder.com" , 80);
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ){
            writer.write("GET / HTTP/1.1\n" + "Host:www.example.com\n\n");
            writer.flush();
            String message;
            while ( (message = reader.readLine()) != null ) {
                System.out.println(message);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        try{
            RandomAccessFile file = new RandomAccessFile("./io/text.ext" , "r");
            FileChannel channel = file.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            channel.read(byteBuffer);

            System.out.println(Charset.defaultCharset().decode(byteBuffer));
            byteBuffer.clear();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
