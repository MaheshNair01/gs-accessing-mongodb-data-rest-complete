package hello;

import org.springframework.data.annotation.Id;

public class Order {

	@Id private String id;

	private String itemName;

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
}
