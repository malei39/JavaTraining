package cn.itcast;
/*
 * 
 * 题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
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
