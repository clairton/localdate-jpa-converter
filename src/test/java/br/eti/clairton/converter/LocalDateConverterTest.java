package br.eti.clairton.converter;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.Before;
import org.junit.Test;

public class LocalDateConverterTest {
	private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
	private final EntityManager em = emf.createEntityManager();
	private final Foo foo = new Foo();

	@Before
	public void init(){		
		em.getTransaction().begin();
		em.persist(foo);
		em.flush();
		em.getTransaction().commit();
	}
	
	@Test
	public void testConvertToDatabaseColumn() {
		assertNotNull(foo.getLocalDate());
	}
	
	@Test
	public void testConvertToEntityAttribute(){
		assertNotNull(em.find(Foo.class, foo.getId()).getLocalDate());
	}
}
