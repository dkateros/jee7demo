package gr.dkateros.demo.jee7.util.java8;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * JEE7 included JPA 2.1 does not include support for Java8 date API.
 * Database columns of type TIMESTAMP are normally converted as {@link Timestamp} instances.
 * This handles the conversion to corresponding entity properties typed as {@link LocalDateTime}.
 */
@Converter(autoApply=true)
public class LocalDateTimeConverter implements AttributeConverter<LocalDateTime, Timestamp> {

	@Override
	public Timestamp convertToDatabaseColumn(LocalDateTime attribute) {
		if(attribute==null) return null;
		return Timestamp.valueOf(attribute);
	}

	@Override
	public LocalDateTime convertToEntityAttribute(Timestamp dbData) {
		if(dbData==null) return null;
		return dbData.toLocalDateTime();
	}

}
