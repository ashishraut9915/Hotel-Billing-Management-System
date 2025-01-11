package Hotel;

public class HotelBillingManagmentSystem {

	public static void main(String[] args) {
		
		int paneerchilliqty= 1;
		int paneerchillirate= 250;
		int paneerchilliamount= paneerchilliqty * paneerchillirate;
		
		int paneermasalaqty= 1;
		int paneermasalarate= 250;
		int paneermasalaamount= paneermasalaqty * paneermasalarate;
		
		int butternanqty= 6;
		int butternanrate= 60;
		int butternanamount= butternanqty * butternanrate;
		
		int dalkhichadiqty= 1;
		int dalkhichadirate= 200;
		int dalkhichadiamount= dalkhichadiqty * dalkhichadirate;
		
		int totalBill= paneerchilliamount + paneermasalaamount + butternanamount + dalkhichadiamount;
		
		double sgstAmount= totalBill * 2.50/100;
		double cgstAmount= totalBill * 2.50/100;
	
		double TotalBillAmount= totalBill + sgstAmount + cgstAmount;
		
		System.out.println("\t\t\t\t\t\t...............THE PURE VEG HOTEL...............");
		
		System.out.println();
		System.out.println("\t\t\t\t NAME OF ITEM  QTY RATE  AMOUNT");
		System.out.println("\t\t\t\t paneerchilli  " +paneerchilliqty+"   "+paneerchillirate+"   "+paneerchilliamount);
		
		System.out.println("\t\t\t\t paneermasala  " +paneermasalaqty+"   "+paneermasalarate+"   "+paneermasalaamount);
		
		System.out.println("\t\t\t\t butternan     " +butternanqty+   "   "+butternanrate+   "   "+butternanamount);

		System.out.println("\t\t\t\t dalkhichadi   " +dalkhichadiqty+ "   "+dalkhichadirate+"    "+dalkhichadiamount);
		
		System.out.println("........................................................................................");
		
		System.out.println("                                           totalAmount: "  +totalBill);
		System.out.println("                                          sgst:2.50" +"  " +sgstAmount);
		System.out.println("                                          cgst:2.50" +"  "+cgstAmount);
		System.out.println("..........................................................................");
		System.out.println("                                          TotalAmount:"   +TotalBillAmount);
		
		
		System.out.println("..............................Thank you....................................");
		
		
		
		
		
	}

}
