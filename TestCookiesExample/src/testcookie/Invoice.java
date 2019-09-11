package testcookie;

import java.util.ArrayList;

public class Invoice {
	public static String generateInvoice(ArrayList<Product> al) {
		StringBuffer sb = new StringBuffer();
		sb.append(String.format("%s %s %s<br>", "Produt Name","Quantity","Price"));
		double total = 0;
		for(Product p:al) {
			double price = p.getPrice();
			int qty = p.getQuantity();
			total = total + qty*price;
			sb.append(String.format("%s  &nbsp &nbsp %s  &nbsp &nbsp %s<br>", p.getProductName(),qty,price));
		}
		sb.append(String.format("%s &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp : %s", "Total",total));
		FirstServlet.al.clear();
		return String.valueOf(sb);
		
	}
}
