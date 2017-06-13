package gr.dkateros.demo.jee7.util.java8;

import java.sql.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoField;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * JEE7 included JPA 2.1 does not include support for Java8 date API.
 * Database columns of type DATE are normally converted as {@link Date} instances.
 * This handles the conversion to corresponding entity properties typed as {@link LocalDate}.
 */
@Converter(autoApply=true)
public class LocalDateConverter implements AttributeConverter<LocalDate, Date> {

	@Override
	public Date convertToDatabaseColumn(LocalDate attribute) {
		long epochDays = attribute.getLong(ChronoField.EPOCH_DAY);
		return new Date(epochDays*24*60*60*1000);
	}

	@Override
	public LocalDate convertToEntityAttribute(Date dbData) {
		return dbData.toLocalDate();
	}

}
