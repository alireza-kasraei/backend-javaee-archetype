#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )

package ${package}.model;


import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.sadad.persistence.entity.AbstractPersistableEntity;

@Entity
@Table(name = "SAMPLE")
public class SampleEntity extends AbstractPersistableEntity<Long> {

	//private static final String SEQUENCE_NAME = "SAMPLE_SEQ";

	private Long id;
	//other properties

	@Override
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQUENCE_NAME)
	//@SequenceGenerator(name = SEQUENCE_NAME, sequenceName = SEQUENCE_NAME, allocationSize = 100)
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}
	
	//other accessor methods
	


}
