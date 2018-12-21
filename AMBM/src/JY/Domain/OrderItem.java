package JY.Domain;

public class OrderItem {
	private Integer orderItem_id;
	private Double orderItem_total;
	private Integer orderItem_num;
	
	//Íâ¼ü
	private Goods orderItem_goods;

	@Override
	public String toString() {
		return "OrderItem [orderItem_id=" + orderItem_id + ", orderItem_total=" + orderItem_total + ", orderItem_num="
				+ orderItem_num + ", orderItem_goods=" + orderItem_goods + "]";
	}

	public Integer getOrderItem_id() {
		return orderItem_id;
	}

	public void setOrderItem_id(Integer orderItem_id) {
		this.orderItem_id = orderItem_id;
	}

	public Double getOrderItem_total() {
		return orderItem_total;
	}

	public void setOrderItem_total(Double orderItem_total) {
		this.orderItem_total = orderItem_total;
	}

	public Integer getOrderItem_num() {
		return orderItem_num;
	}

	public void setOrderItem_num(Integer orderItem_num) {
		this.orderItem_num = orderItem_num;
	}

	public Goods getOrderItem_goods() {
		return orderItem_goods;
	}

	public void setOrderItem_goods(Goods orderItem_goods) {
		this.orderItem_goods = orderItem_goods;
	}
	
	
	
	

}
