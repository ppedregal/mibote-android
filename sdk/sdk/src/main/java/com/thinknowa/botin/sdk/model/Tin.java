package com.thinknowa.botin.sdk.model;

/**
 * Created by ppedregal on 18/11/15.
 */
public class Tin {

    private String id;
    private String name;
    private String type;
    private Amount amount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }
    
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Tin [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}
    
}
