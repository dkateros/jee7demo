package gr.dkateros.demo.jee7.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import gr.dkateros.demo.jee7.util.Identified;

@Entity
@NamedQueries({
	@NamedQuery(name=Demo.LIST_ALL, query="SELECT OBJECT(d) FROM Demo d"),
})
public class Demo implements Identified {
	
	public static final String LIST_ALL = "allDemos";
	
	@Id
	@SequenceGenerator(name="demo_seq", sequenceName="demo_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="demo_seq")
    Long id;
	
	@NotNull
	String string;
	
	@NotNull
	LocalDate localDate;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

}
