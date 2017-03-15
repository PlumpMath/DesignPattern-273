package Composite;

class AddressBook { // client
	public void createContactList () {
		Contact bill = new Contact("bill");
		Contact bob = new Contact("bob");
		Contact alice = new Contact("alice");
		
		ContactGroup overUsed = new ContactGroup("overused");
		overUsed.addMember( bob );
		overUsed.addMember( alice );

		ContactGroup all = new ContactGroup("all");
		all.addMember( bill );
		all.addMember( overUsed );

		System.out.print( "Printing all contacts\n" );
		System.out.print( all.toString() );
	}
}