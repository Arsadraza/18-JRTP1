package in.arsad.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import in.arsad.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Serializable> {

}
