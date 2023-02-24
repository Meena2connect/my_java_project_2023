package day11;

public class Program01 {
	
	private String mobileModel;
	private String mobileColor;
	private double mobileprice;
	
	

	public static void main(String[] args) {
		 Program01 mobile = new Program01();
		 mobile.mobileColor="Red";
		 mobile.mobileprice=40000;
		 mobile.mobileModel="iphone11";
		 
		
		
		  
		  
          System.out.println("Mobile");
          System.out.println("model: " + mobile.mobileModel);
          System.out.println("colour: " +mobile.mobileColor );
          System.out.println("price: "+mobile.mobileprice);
	}
}
