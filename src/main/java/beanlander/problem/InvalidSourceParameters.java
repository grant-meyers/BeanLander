package beanlander.problem;

public class InvalidSourceParameters extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7170561191894142592L;

	public InvalidSourceParameters() {
		super();
	}
	
	public InvalidSourceParameters(String details) {
		super(details);
	}
}
