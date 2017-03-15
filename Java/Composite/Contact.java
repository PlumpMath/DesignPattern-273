package Composite;

class Contact implements AddressBookObject {
	private String name;
	
	public Contact( String nameIn ) {
		name = nameIn;
	}
	
	public String toString() {
		return getName();
	}
	
	public String getName() {
		return name;
	}
}