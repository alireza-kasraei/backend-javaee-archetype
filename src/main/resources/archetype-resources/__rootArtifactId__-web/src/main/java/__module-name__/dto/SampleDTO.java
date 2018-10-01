package ${package}.${module-name}.dto;

import lombok.Data;

@Data
public class SampleDTO {

	// it should be immutable class with final properties
	private long id;
	private String sampleField;

}
