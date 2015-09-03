package br.eti.clairton.converter;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Foo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private LocalDate localDate = LocalDate.now();

	public LocalDate getLocalDate() {
		return localDate;
	}

	public Integer getId() {
		return id;
	}
}
