//associating a code to an product and displaying the price
import java.util.Locale;
public class Main3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5490;
		String gender = "F";
		
		double price1 = 2100.00;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:%n %s, which price is $ %.2f%n %s, which price is $ %.2f%n %nRecord: %d years old, code generator %d, gender: %s%n %nMeasure with eith decimal places: %.8f%n Rounded (three decimal places): %.3f%n US decimal point: %f",product1,price1,product2,price2,age,code,gender,measure,measure,measure);
	}

}
