package cn.itcast;

public class PrimeNumber {

    /**
     * ��Ŀ���ж�101-200֮���ж��ٸ����������������������
     */
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i < 200; i++) {
            for (int j = 2; j <= Math.round(Math.sqrt(i)); j++) {
                if (i%j==0) 
                    break;
                else if (j == Math.round(Math.sqrt(i))) {
                    count++;
                    System.out.println(count + ":" + i);
                    
                }
            }
        }
    }
}
