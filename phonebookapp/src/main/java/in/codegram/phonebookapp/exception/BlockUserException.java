package in.codegram.phonebookapp.exception;

public class BlockUserException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This will create BlockUserException object without error message
	 */
	public BlockUserException() {
		super();
	}
	
	/**
	 * This will create BlockUserException object with error message
	 */
	public BlockUserException(String errMsg) {
		super(errMsg);
	}

}
