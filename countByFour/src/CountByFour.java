
public class CountByFour {

    
    public static void main(String[] args) {
        // Counts of 4 from 4 - 200. 
        // Every multiple of 40 is displayed on a new line.
        
        System.out.println("Counting by four report");
        
        int num = 0;
        for (int i = 1; num < 200; i++){
            num = i * 4;
            System.out.print(num + " ");
            if (num % 40 == 0){
                System.out.println();
            }
        }
        System.out.println("End of report");
        
    }
    
}
