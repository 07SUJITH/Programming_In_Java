// display the number of oocurences of the element in the araray
public class Program18 {
    public static void main(String[] args) {
        int[] numbers= {1,1,3,3,3,3,3,6,6,8};
        int searchElement=3;
        System.out.println(numberOfOccurences(numbers,searchElement));
        
    }

    private static int numberOfOccurences(int[] numbers,int searchElement){
        int count=0;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==searchElement){
                count++;
            }
        }
        return count;
    }
}
