package cn.itcast;

/*
 * ��Ŀ����һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5��        
 */

public class PrimeFactor {
    public static void main(String[] args) {
        int number = 999;
        showFactors(number);

    }

    public static void showFactors(int number) {
        int i;  //����һ�������ı�����Ϊ��forѭ��֮�����ʹ������ֵ

        for (i = 2; i <= Math.sqrt(number); i++) {  //i��2��ʼ�������������Ƿ��д�2����ƽ�����е�����
            if (number % i == 0) {    //�����������2��ʼ��һ���������ʹ�ӡ�����������ʱ�������һ������������Ϊ�Ѿ�
                System.out.println(i);
                showFactors(number / i); //�ҵ����������֮��Ѱ�ұ�����֮�����������������
                break;// ��һ��ѭ�����ҵ������������˴�ѭ��������
            }
        }
        
        //��ӡ���һ�������������ʱ������������Ѿ�û������������i++֮���ֵ���������ƽ����
        if (i > Math.sqrt(number)) {
            System.out.println(number);
        }
    }
}
