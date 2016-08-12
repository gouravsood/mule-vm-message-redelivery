package au.com.myexception;

public class RedeliveryException  extends java.lang.Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2091082875892142944L;

	/**
	 * 
	 * @param message
	 */
	public RedeliveryException(String message) {
		super(message);
	}

}
