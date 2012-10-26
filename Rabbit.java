import java.util.Scanner;

public class Rabbit {

    /**
     * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
     * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？ 
                程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21.... 
                
                输入月份，获得这个月兔子的对数。

     */
    public static void main(String[] args) {
        while (true) {
            System.out.println("请输入月份：");
            Scanner sc = new Scanner(System.in);
            int month = sc.nextInt();
            System.out.println(rabbitAmount(month));
            //sc.close();
        }
    }
    
    public static int rabbitAmount(int m) { 
        
        //用递归方法
        int sum =0;     // 开始兔子总数为0
        if (m==0 || m ==1)  //第0天兔子总数为0，第1天兔子总数为1
            sum = m;
        
        if (m-1>=1) //从第二天开始递归
        {
        sum = rabbitAmount(m-1) + rabbitAmount(m-2);   //当月兔子总数就是上个月和上上个月兔子总数的和
        }
        return sum;
    }

}
