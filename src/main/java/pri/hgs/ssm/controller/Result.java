package pri.hgs.ssm.controller;

public class Result {
	private int stateCode;
    private String message;
    public Result() {
        super();
    }
    public Result(int stateCode, String message) {
        super();
        this.stateCode = stateCode;
        this.message = message;
    }
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Result [stateCode=" + stateCode + ", message=" + message + "]";
	}
}
