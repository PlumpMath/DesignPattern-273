// Demo the use of Composite to recursively break down an object hierarchy, 
// objects which can hold a list of other objects or other lists

// You have a class called Contact which is an address book contact
// it should have a name member (string) and a toString function which returns that name

// Create a class called ContactGroup which is a list of contacts
// A contact group can contain many Contacts and also other ContactGroups
// It also has a name, and a toString method which gives a string containing all names included in the group ( recursively )

// Create a class called AddressBook
// In Address book create a ContactGroup named "all"
// Add regular Contacts to the contact group "all", and also add another ContactGroup to it
// Call toString() on "all" to see that all contacts are recursively printed

package Composite;

public class Example {
	public static void main(String[] args) {
		demoUseOfComposite();
	}
	
	public static void demoUseOfComposite() {
		AddressBook addressBook = new AddressBook();
		addressBook.createContactList();
	}
}