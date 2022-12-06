import java.io.*;
class FilehandlingEx{
  public static void main(String args[]){
    try{
	FileReader fin = new FileReader("test1.txt");
	FileWriter fout = new FileWriter("copy1.txt");
	int i;
	while((i=fin.read()) != -1){
	   fout.write(i);
          }
    fin.close();
    fout.close();
    }
    catch(IOException e){
        System.out.println(e.getMessage());
    }
  }
}

/*output
 if test1.txt does not exit 
 test1.txt(No such file or directory)
 
 test1.txt
 Hello World !
 
 copy1.text
 Hello World !
