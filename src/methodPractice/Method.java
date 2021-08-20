package methodPractice;

public class Method {
	
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Method a = new Method();
		a.setName("chanwoo");
		System.out.println(a.name);
		//==================================
		Method b = new Method();
		b.setName("Teemo");
		System.out.println(b.name);
	}

}
