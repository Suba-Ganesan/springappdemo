package com.samples.SpringCoreDI;

public class ShoppingCart {
	private Item itemobj; //obj ref of item class

	public Item getItemobj() {
		return itemobj;
	}

	public void setItemobj(Item itemobj) {
		this.itemobj = itemobj;
	}

	@Override
	public String toString() {
		return "ShoppingCart [itemobj=" + itemobj + "]";
	}

	

}
