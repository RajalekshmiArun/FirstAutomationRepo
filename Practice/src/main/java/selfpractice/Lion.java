package selfpractice;

public class Lion extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lion l=new Lion();
		l.sound();
		

	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Roar");
	}

}
