package in.codegram.phonebookapp.dao;

import java.util.List;

import in.codegram.phonebookapp.domain.Contact;

public interface ContactDAO {
	public void save(Contact contact);
	public void update(Contact contact);
	public void delete(Contact contact);
	public void delete(Integer contactId);
	public Contact findById(Integer contactId);
	public List<Contact> findAll();
	public List<Contact> findByProperty(String propName,Object propValue);

}
