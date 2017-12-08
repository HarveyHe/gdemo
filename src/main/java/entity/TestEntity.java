package entity;






public class TestEntity {
	/**
	 * 是否失败
	 */
	private Boolean error;
	/**
	 * 返回信息
	 */
	private String message;
	/**
	 * 返回对象
	 */
	private Object result; 
	
	
	public TestEntity() {
		super();
	}
	public TestEntity(Boolean error, String message, Object result) {
		super();
		this.error = error;
		this.message = message;
		this.result = result;
	}
	public Boolean getError() {
		return error;
	}
	public void setError(Boolean error) {
		this.error = error;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
}
	

