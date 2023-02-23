// read a line of integers , find sum and average of numbers

import java.io.*;

public class FileReader2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("number.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = br.readLine();
            String numbers[] = line.split(" ");
            int length = numbers.length;
            int sum = 0;
            double avg = 0;
            for (String element : numbers) {
                System.out.println(element);
                sum = sum + Integer.parseInt(element);
            }
            avg = (double) sum / length;
            System.out.println("sum :" + sum);
            System.out.println("average :" + avg);

            br.close();
            fr.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

}
