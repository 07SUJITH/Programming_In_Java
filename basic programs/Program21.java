//print sum of each row in a 2d array
public class Program21 {
    public static void main(String[] args) {
        int[][] numbers = {
            {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        sumOfrows(numbers);
        sumOfEachColumn(numbers);
    }

    private static void sumOfrows(int[][] numbers) {
      
        for (int i = 0; i < numbers.length; i++) {
              int sum = 0;
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];
            }
            System.out.println("sumo of row " + (i+1) + " : "+ sum);
    }
    }
    private static void sumOfEachColumn(int[][] numbers) {
        System.out.println();
      
       {   
            for (int j = 0; j <4; j++) {
                
               int sum = 0;
                for (int i = 0; i < 4; i++) 
                sum += numbers[i][j];
                System.out.println("sumo of column " + (j+1) + " : "+ sum);
            }
      
    }
    }
}
