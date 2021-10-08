package temp;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class main {

	public static void main(String[] args) {
		PrintWriter test = null;
		try {
			test = new PrintWriter("test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int amount = 10;
		
		for(int i = 0; i < amount; i++) {
			test.println(item[i].description);
			test.printf("%d %f %d\n", item[i].sku, item[i].price, item[i].quantity);
		}
		test.println("description");
		test.printf("%d %f %d", 43, 23.3, 40);
		
		test.close();
	}

}
