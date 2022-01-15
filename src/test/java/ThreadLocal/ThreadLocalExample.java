package ThreadLocal;

public class ThreadLocalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThreadLocal thread = new ThreadLocal();
		thread.set("Legending");
		String name = (String) thread.get();
        System.out.println(name);
        thread.remove();
        System.out.println((String) thread.get());
	}

}
