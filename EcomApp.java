import java.util.*;


class User
{
	String userName;
	long phNo;
	int userId;
	
	//constructor
	User(String userName, long phNo, int userId)
	{
		this.userName = userName;
		this.phNo = phNo;
		this.userId = userId;
	}
	
	//this is used for displaying the details from above
	void userDetails()
	{
		System.out.println(" \t\tUser Details:");
		System.out.println("\nuser Name is: " + userName);
		System.out.println("user Phone number is: " + phNo);
		System.out.println("user Id is: " + userId);
	}
}


class Product
{
	String productName;
	double productPrice;
	
	//constructor 
	Product(String productName, double productPrice)
	{
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	void productDetails()
	{
		System.out.println("\n\t\tProduct Details:");
		System.out.println("\nProduct Name is: " + productName);
		System.out.println("Product Price is: " + productPrice);
	}
}


interface Payment
{
	String pay(double amount);
}

class Upi implements Payment
{
	@Override
	public String pay(double amount)
	{
		return "payment done by UPI";
	}
}

class Card implements Payment
{
	@Override
		public String pay(double amount)
	{
		return "Payment done by Card";
	}
}

class Cash implements Payment
{
	@Override
		public String pay(double amount)
	{
		return "Payment done by Cash";
	}
}


class EcomApp 
{
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		User user1 = new User("Tom Holland", 1234567890, 24);
		user1.userDetails();
		
		Product prod1 = new Product("Asus TUF Gaming", 75000.0);
		prod1.productDetails();
		
		System.out.print("Enter your payment method: ");
		String paymentMethod = scan.next();
		
		Payment payment = null;
		
		if(paymentMethod.toLowerCase().equals("upi"))
		{
			payment = new Upi();
		}
		else if(paymentMethod.toLowerCase().equals("card"))
		{
			payment = new Card();	
		}
		else if(paymentMethod.toLowerCase().equals("cash"))
		{
			payment = new Cash();
		}
		else
		{
			System.out.println("Enter the valid payment method...");
		}
		
		System.out.println(payment.pay(prod1.productPrice));
	}
}
