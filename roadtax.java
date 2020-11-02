
 class RoadTax {

	public static void main(String[] args) 
	{
		int VechiclePrice =90000;
		String State ="KA";
		
		switch (State) {
		case "KA":
			double TaxAmount = VechiclePrice * 0.18;
			 double TotalAmount = TaxAmount+VechiclePrice;
			 System.out.println(TotalAmount);
			 break;
		case "MH":
			 double TaxAmount1 = VechiclePrice * 0.11;
			 double TotalAmount1 = TaxAmount1+VechiclePrice;
			 System.out.println(TotalAmount1);
			 break;
		case "AP":
			double TaxAmount2 = VechiclePrice * 0.9;
			 double TotalAmount2 = TaxAmount2+VechiclePrice;
			 System.out.println(TotalAmount2);
			 break;


		default:
			System.out.println("invalid city");
			break;
		}
	} 
}
	
