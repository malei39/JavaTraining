package cn.itcast;
/*
 * 
 * ��Ŀ�����������������Ƕ������ɴ��⣺ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��60�����µ���C��ʾ��
 */

public class GradeLoop {
    public static void main(String[] args) {
        int n = 50;
       // char result;
       // result = (grade>=90?'A': (grade>60))?'B':'C';
        //result = (grade<60?'C':(grade>60) )?'B':'C';
        String str = (n>=90)?"A":((n>60)?"B":"C");
        String str2 = (n<60)?"C":((n>=90)?"A":"B");
        System.out.println(str);
        System.out.println(str2);
        //System.out.println(result);

}
}
