package gr.dkateros.demo.jee7.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

import gr.dkateros.demo.jee7.util.Identified;

/**
 * Demo entity.
 */
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
	
	//trivial types
	
	String string;
	Integer integerValue;
	Boolean booleanValue;
	
	//more interesting types
	
	@NotNull
	@Column(precision=19, scale =2)
	BigDecimal bdValue;
	
	@NotNull
	LocalDate localDate;
	
	@NotNull
	LocalDateTime localDateTime;
	
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

	public Integer getIntegerValue() {
		return integerValue;
	}

	public void setIntegerValue(Integer integerValue) {
		this.integerValue = integerValue;
	}

	public Boolean getBooleanValue() {
		return booleanValue;
	}

	public void setBooleanValue(Boolean booleanValue) {
		this.booleanValue = booleanValue;
	}

	public BigDecimal getBdValue() {
		return bdValue;
	}

	public void setBdValue(BigDecimal bdValue) {
		this.bdValue = bdValue;
	}

	public LocalDate getLocalDate() {
		return localDate;
	}

	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

}
