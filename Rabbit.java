import java.util.Scanner;

public class Rabbit {

    /**
     * ��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�
     * С���ӳ����������º�ÿ��������һ�����ӣ��������Ӷ���������ÿ���µ����Ӷ���Ϊ���٣� 
                ��������� ���ӵĹ���Ϊ����1,1,2,3,5,8,13,21.... 
                
                �����·ݣ������������ӵĶ�����

     */
    public static void main(String[] args) {
        while (true) {
            System.out.println("�������·ݣ�");
            Scanner sc = new Scanner(System.in);
            int month = sc.nextInt();
            System.out.println(rabbitAmount(month));
            //sc.close();
        }
    }
    
    public static int rabbitAmount(int m) { 
        
        //�õݹ鷽��
        int sum =0;     // ��ʼ��������Ϊ0
        if (m==0 || m ==1)  //��0����������Ϊ0����1����������Ϊ1
            sum = m;
        
        if (m-1>=1) //�ӵڶ��쿪ʼ�ݹ�
        {
        sum = rabbitAmount(m-1) + rabbitAmount(m-2);   //�����������������ϸ��º����ϸ������������ĺ�
        }
        return sum;
    }

}
