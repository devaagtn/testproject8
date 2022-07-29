 class Ghg{
	String colour;
	Ghg(String colour){
		this.colour = colour;
	}
	void eat (String name) {
		System.out.println(name + "is eating");
	}
	void show(String name) {
		System.out.println(name + "is of" +colour+ "colour");
	}
}
 class Fgh extends Ghg{

	Fgh(String colour) {
		super(colour);
		// TODO Auto-generated constructor stub
	}
	 
 }
public class Abexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
