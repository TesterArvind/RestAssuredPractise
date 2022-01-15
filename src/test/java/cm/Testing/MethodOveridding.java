package cm.Testing;

public class MethodOveridding {
	
	public  void run() {
		
		System.out.println("running on ground");
	}
	
	
	static class Man extends MethodOveridding{
		
		public void run() {
			
			System.out.println("running on floor");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			MethodOveridding m = new Man();
			m.run();

		}
		
	}



}
