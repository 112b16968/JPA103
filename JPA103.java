import java.util.Scanner;

public class JPA103 {
    public static void main(String[] args) {
        System.out.println("Please input:");
        Scanner a =  new Scanner(System.in);
        //讀取整行
        String b = a.nextLine();
        String[] nums = b.split("\\s+");
        double total = 0;
        for (int i=0;i<nums.length;i++){
            double numbers = Double.parseDouble(nums[i]);
            total += numbers;
        }
        double average = total/nums.length;
        System.out.printf("Average: %.2f%n",average);

    }
    
}
