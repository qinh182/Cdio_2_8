/**
 * 
 */
package com.cdio.planx.exception;

/**
 * @author Administrator
 *
 */
public class CdioException extends RuntimeException {

	/**
	 * 
	 */
	public CdioException() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 */
	public CdioException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cause
	 */
	public CdioException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 */
	public CdioException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public CdioException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
