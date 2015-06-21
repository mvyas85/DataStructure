package root;

public class Contacts{
	private String name;
	private int phone;
	
	public Contacts(String name, int phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}
	public int getPhone() {
		return phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
    public String toString(){
    	return name;
    }
	
}
