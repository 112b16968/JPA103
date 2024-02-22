import java.util.Scanner;

public class JPA103 {
    public static void main(String[] args) {
        System.out.println("Please input:");
        Scanner a =  new Scanner(System.in);
        //讀取整行
        String b = a.nextLine();
        //分割空格並且放入陣列裡面
        String[] nums = b.split("\\s+");
        double total = 0;
        for (int i=0;i<nums.length;i++){
            //將字串轉成浮點數
            double numbers = Double.parseDouble(nums[i]);
            total += numbers;
        }
        double average = total/nums.length;
        System.out.printf("Average: %.2f%n",average);

    
    }
    
}

