package comm;

public class Ecommerce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User obj=new User();
		obj.Regsitration(1,"Sam");
		Book obj1=new Book();
		obj1.display_book_info("John", "Sam",150);
		Payment obj2=new Payment();
		obj2.amount(150);
		Order obj3=new Order();
		obj3.placeorder("John",150);
		Cart obj4= new Cart();
		obj4.items_in_cart("John");
		
		

	}

}
