import java.io.*;
class FilehandlingEx{
    public static void main(String args[]){
        FileReader reader =null;
        FileWriter writer =null;
        try{
            reader = new FileReader("D:\\inputfile.txt");
            writer =new FileWriter("D:\\outputfile.txt");
            int i;
            while((i=reader.read())!=-1){
                writer.write(i);
            }
            // play of UNICODE
            // writer.write(65) it will write A in the outputfile.txt
            // if end of the file reach then read() method return -1
            // FileWriter object write character by character
            System.out.println("file copied successfully");
        }catch(IOException e){
            System.out.println("An error occurred while copying data");
        }
        finally{
            try{
                reader.close();
                writer.close();
            }
            catch(IOException e){
                System.out.println("An error occurred while closing the files");
            }

        }
    }
}