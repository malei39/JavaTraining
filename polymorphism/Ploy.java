
public class Ploy {
    
    public static void main(String[] args) {
    	
    	// Employee emp = new Employee(); 抽象类不能实例化
    	Manager m = new Manager();
    	m.toSay();
    	m.empSay();
    	Manager.toSay();
    }
}
