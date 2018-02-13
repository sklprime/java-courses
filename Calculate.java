public class Calculate {
	
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		float firstFloat = Float.valueOf(arg[2]);
		float secondFloat = Float.valueOf(arg[3]);
		int summ = first + second;
		System.out.println("Sum = " + summ);
		float summFloat = firstFloat + secondFloat;
		System.out.println("Sum = " + summFloat);
	}
	
}