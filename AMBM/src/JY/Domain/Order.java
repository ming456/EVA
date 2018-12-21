package JY.Domain;

import java.util.Date;
import java.util.Set;

public class Order {
	private Integer order_id;
	private Date order_date;
	private Double order_total;
	private String order_description;
	private Integer order_status;
	
	//Íâ¼ü
	private Set<OrderItem> order_items;
	private User order_user;
	
	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", order_date=" + order_date + ", order_total=" + order_total
				+ ", order_description=" + order_description + ", order_status=" + order_status + ", order_items="
				+ order_items + ", order_user=" + order_user + "]";
	}
	public Integer getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Integer order_id) {
		this.order_id = order_id;
	}
	public Date getOrder_date() {
		return order_date;
	}
	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	public Double getOrder_total() {
		return order_total;
	}
	public void setOrder_total(Double order_total) {
		this.order_total = order_total;
	}
	public String getOrder_description() {
		return order_description;
	}
	public void setOrder_description(String order_description) {
		this.order_description = order_description;
	}
	public Integer getOrder_status() {
		return order_status;
	}
	public void setOrder_status(Integer order_status) {
		this.order_status = order_status;
	}
	public Set<OrderItem> getOrder_items() {
		return order_items;
	}
	public void setOrder_items(Set<OrderItem> order_items) {
		this.order_items = order_items;
	}
	public User getOrder_user() {
		return order_user;
	}
	public void setOrder_user(User order_user) {
		this.order_user = order_user;
	}

	
}
