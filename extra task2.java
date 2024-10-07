import java.util.Scanner;
public class lol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]nums = new int[3];
        System.out.println("Введите три числа для поиска минимального");
        for(int i = 0; i < 3; ++i){
            nums[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < 3;++i){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("Min: "+min);
    }
}
