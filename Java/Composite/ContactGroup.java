package Composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class ContactGroup implements AddressBookObject {
	private String name;
	private List<AddressBookObject> members;
	
	public ContactGroup(String nameIn) {
		name = nameIn;
		members = null;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		Iterator<AddressBookObject> it = members.iterator();
		while (it.hasNext()) {
			sb.append(it.next().toString());
			sb.append(" ");
		}
		
		return sb.toString();
	}

	public void addMember(AddressBookObject member) {
		if (member == null)
			return;
		else if (members == null) 
			members = new ArrayList<AddressBookObject>();
		
		members.add(member);
	}
}