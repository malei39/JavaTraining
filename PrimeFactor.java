package cn.itcast;

/*
 * 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。        
 */

public class PrimeFactor {
    public static void main(String[] args) {
        int number = 999;
        showFactors(number);

    }

    public static void showFactors(int number) {
        int i;  //定义一个函数的变量，为在for循环之后继续使用它的值

        for (i = 2; i <= Math.sqrt(number); i++) {  //i从2开始，检查这个数中是否有从2到其平方根中的因数
            if (number % i == 0) {    //如果能整除从2开始的一个因数，就打印这个因数，此时这个因数一定是质数，因为已经
                System.out.println(i);
                showFactors(number / i); //找到这个质因数之后，寻找被整除之后的数所含的质因数
                break;// 在一次循环后找到了质因数，此次循环结束。
            }
        }
        
        //打印最后一个质因数，这个时候这个质因数已经没有因数，所以i++之后的值会大于它的平方根
        if (i > Math.sqrt(number)) {
            System.out.println(number);
        }
    }
}
