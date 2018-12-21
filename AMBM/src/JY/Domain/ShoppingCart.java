package JY.Domain;

import java.util.Set;

public class ShoppingCart {
	private Integer cart_id;
	private Double cart_total;
	
	//Íâ¼ü
	private Set<OrderItem> cart_item;

	@Override
	public String toString() {
		return "ShoppingCart [cart_id=" + cart_id + ", cart_total=" + cart_total + ", cart_item=" + cart_item + "]";
	}

	public Integer getCart_id() {
		return cart_id;
	}

	public void setCart_id(Integer cart_id) {
		this.cart_id = cart_id;
	}

	public Double getCart_total() {
		return cart_total;
	}

	public void setCart_total(Double cart_total) {
		this.cart_total = cart_total;
	}

	public Set<OrderItem> getCart_item() {
		return cart_item;
	}

	public void setCart_item(Set<OrderItem> cart_item) {
		this.cart_item = cart_item;
	}
	
}
