package vjezba11_1;

public class RandomInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] random = new int[100];
		for(int i = 0; i < random.length; i++){
			random[i] = (int)(Math.random() * (100 + 1));
			System.out.println(random[i]);
		}
	
		
	}

}
