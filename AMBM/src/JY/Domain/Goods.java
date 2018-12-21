package JY.Domain;

public class Goods {
	private Integer good_id;
	private String good_name;
	private String good_description;
	private Double good_price;
	private Boolean good_hot;
	private Boolean good_new;
	private Boolean good_size;
	private String good_image;
	private String good_model;
	
	public Integer getGood_id() {
		return good_id;
	}
	public void setGood_id(Integer good_id) {
		this.good_id = good_id;
	}
	public String getGood_name() {
		return good_name;
	}
	public void setGood_name(String good_name) {
		this.good_name = good_name;
	}
	public String getGood_description() {
		return good_description;
	}
	public void setGood_description(String good_description) {
		this.good_description = good_description;
	}
	public Double getGood_price() {
		return good_price;
	}
	public void setGood_price(Double good_price) {
		this.good_price = good_price;
	}
	public Boolean getGood_hot() {
		return good_hot;
	}
	public void setGood_hot(Boolean good_hot) {
		this.good_hot = good_hot;
	}
	public Boolean getGood_new() {
		return good_new;
	}
	public void setGood_new(Boolean good_new) {
		this.good_new = good_new;
	}
	public Boolean getGood_size() {
		return good_size;
	}
	public void setGood_size(Boolean good_size) {
		this.good_size = good_size;
	}
	public String getGood_image() {
		return good_image;
	}
	public void setGood_image(String good_image) {
		this.good_image = good_image;
	}
	public String getGood_model() {
		return good_model;
	}
	public void setGood_model(String good_model) {
		this.good_model = good_model;
	}
	@Override
	public String toString() {
		return "Goods [good_id=" + good_id + ", good_name=" + good_name + ", good_description=" + good_description
				+ ", good_price=" + good_price + ", good_hot=" + good_hot + ", good_new=" + good_new + ", good_size="
				+ good_size + ", good_image=" + good_image + ", good_model=" + good_model + "]";
	}
	

}
