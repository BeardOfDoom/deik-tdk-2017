package hu.david.veres.graph.response;

import lombok.*;

import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class FileUploadResponse {

	private boolean error;
	private Map<String, String> errors;
	private int index;
	private String name;

}
