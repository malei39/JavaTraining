
class Manager extends Employee{
	private double bonus;

	
	public double getBonus() {
		return (this.bonus); 
	}

	public void setBonus(double bonus) {
		this.bonus = bonus; 
	}
	
	public static void toSay(){
		System.out.println("this is a manager to say function");
	}
	
	public void display(){//必须覆写抽象类中的抽象方法
		System.out.println("rewrite the father's function");
	}
	
}
