package JY.Domain;

public class User {
	private Integer user_id;
	private String user_email;
	private String user_name;
	private String user_address;
	private String user_password;
	private String user_phone;
	
	//Íâ¼ü
	private ShoppingCart user_cart;

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_email=" + user_email + ", user_name=" + user_name
				+ ", user_address=" + user_address + ", user_password=" + user_password + ", user_phone=" + user_phone
				+ ", user_cart=" + user_cart + "]";
	}
	public ShoppingCart getUser_cart() {
		return user_cart;
	}
	public void setUser_cart(ShoppingCart user_cart) {
		this.user_cart = user_cart;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public String getUser_email() {
		return user_email;
	}
	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_address() {
		return user_address;
	}
	public void setUser_address(String user_address) {
		this.user_address = user_address;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_phone() {
		return user_phone;
	}
	public void setUser_phone(String user_phone) {
		this.user_phone = user_phone;
	}
	

}
