package in.arsad.service;

import java.util.List;

import in.arsad.bindings.ContactForm;

public interface ContactService {
	public String saveContact(ContactForm form);

	public List<ContactForm> viewContacts();

	public ContactForm editContact(Integer contactId);

	public List<ContactForm> deleteContact(Integer contactId);

}
