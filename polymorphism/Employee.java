
public abstract class Employee {

    public Employee() { //��Ȼ����ʵ����������Ҳ����Ҫ�й���������Ϊ������Ҫ����
    	System.out.println("dfdf");
    }
    
    private String name;
    private String sex;
    private int age;
    
    public void setName(String name){
    	this.name = name;
    }
    public String getName(){
    	return this.name;
    }
    public void setSex(String sex){
    	this.sex = sex;
    }
    public String getSex(){
    	return this.sex;
    }
    public void setAge(int age){
    	this.age = age;
    }
    public int getAge(){
    	return age;
    }
    
    public abstract void display();// �˷������뱻���าд
    
    public void empSay(){//�����еķǳ��󷽷����Բ��ø�д
    	System.out.println("this is the employee to say function");
    }
    
}