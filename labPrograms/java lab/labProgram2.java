
/*
 Java program that reads from a file, writes to another file, and displays the number of sentences, words, and characters:
*/
import java.io.*;
import java.util.StringTokenizer;

//File copy statistics
public class labProgram2 {
    public static void main(String[] args) {

        BufferedReader reader = null;
        BufferedWriter writer = null;
        FileReader fr = null;
        FileWriter fw = null;
        int sentenceCount = 0;
        int wordCount = 0;
        int charCount = 0;
        try {
            fr = new FileReader("input555.txt");
            fw = new FileWriter("output555.txt");
            reader = new BufferedReader(fr);
            writer = new BufferedWriter(fw);
            String line = reader.readLine();

            while (line != null) {
                sentenceCount++;
                StringTokenizer tokenizer = new StringTokenizer(line, " ");
                wordCount += tokenizer.countTokens();
                charCount += line.length();
                writer.write(line);
                writer.newLine();
                line = reader.readLine();
            }

        } catch (IOException e) {
            System.err.println("Error in reading/writing files: " + e.getMessage());
        } finally {
            try {
                reader.close();
                writer.close();
                fr.close();
                fw.close();
            } catch (IOException e) {
                System.err.println("Error closing files: " + e.getMessage());
            }
        }

        System.out.println("Number of sentences: " + sentenceCount);
        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of characters: " + charCount);
    }
}

/*
 * ALGORITHM
 * 
 * 1]Start the program
 * 2]Declare the BufferedReader, BufferedWriter, FileReader and FileWriter
 * variables as null
 * 3]Initialize the int variables sentenceCount, wordCount and charCount to 0
 * 4]insie the try block
 * 4.1] create object of FileReader fr with constructor argument input.txt ,
 * and create object of FileWriter fw with constructor argument output.txt
 * 4.2] create an object of BufferedReader "reader" by passing fr as constructor
 * argument
 * create an object of BufferedWriter "writer" by passing fw as constructor
 * argument
 * 4.3] crate string variable "line"
 * line = reader.readLine()
 * 4.4] WHILE(line != null) do the following
 * 4.4.1]sentenceCount = sentanceCount + 1
 * 4.4.2]create an object of StringTokenizer "tokenizer" ,passing two arguments
 * string "line" and delimiter " "(whitespace)
 * 4.4.3]wordCount = wordCount + tokenizer.countTokens();
 * 4.4.4]charCount = line.length()
 * 4.4.5]writer.write();
 * 4.4.6]writer.newLine();
 * 4.4.7]line = reader.readLine()
 * 
 * 5]if an exception occur in step 4 (4.1 to 4.4.7) which throw an IOException
 * object and catch
 * block catch it
 * 5.1] display the error message using e.getMessage()
 * 6] inside finally block
 * 6.1]inside try block
 * close the BufferedReader, BufferedWriter, FileReader, and FileWriter
 * variables
 * 6.2] if an en exception occured in 6.1 then it catch by the catch block
 * display the error message
 * 
 * 7] Print the number of sentences, words, and characters to the console
 * 
 * 8] End the program.
 */