#set($symbol_pound='#')
#set($symbol_dollar='$')
#set($symbol_escape='\')

package ${package}.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sadad.persistence.entity.AbstractPersistableEntity;

@Entity
@Table(name = "SAMPLE")
public class SampleEntity extends AbstractPersistableEntity<Long> {

	// private static final String SEQUENCE_NAME = "SAMPLE_SEQ";

	private Long id;
	private String sampleField;

	@Override
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// @SequenceGenerator(name = SEQUENCE_NAME, sequenceName = SEQUENCE_NAME,
	// allocationSize = 100)
	public Long getId() {
		return id;
	}

	@Override
	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "FIELD_NAME")
	public String getSampleField() {
		return sampleField;
	}

	public void setSampleField(String sampleField) {
		this.sampleField = sampleField;
	}

}
