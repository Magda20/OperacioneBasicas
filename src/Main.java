
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float suma = sumar (1.0f, 2.0f,3.0f);
		System.out.println(suma);
		float resta = restar (4.0f, 5.0f);
	}

	public static  float sumar (float num1, float num2, float num3) {
		return num1 + num2+ num3;
	}
	public static  float restar (float num1, float num2) {
		return num1 -num2;
}
}
