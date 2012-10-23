
public abstract class Employee {

    public Employee() { //虽然不能实例化，但是也必须要有构造器，因为子类需要调用
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
    
    public abstract void display();// 此方法必须被子类覆写
    
    public void empSay(){//父类中的非抽象方法可以不用覆写
    	System.out.println("this is the employee to say function");
    }
    
}