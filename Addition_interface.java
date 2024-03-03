package Abstract;
interface Logindetails
{
   void login();
   void logout();
}
public class Addition_interface implements Logindetails {
	
	

	public static void main(String[] args) {
		Addition_interface a1=new Addition_interface();
		a1.login();
		a1.logout();
	}

	public void login() {
		System.out.println("this is Login logic");
		
	}

	
	public void logout() {
		System.out.println("this is Logout logic");
		
	}

}
