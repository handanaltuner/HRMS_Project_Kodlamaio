package kodlamaio.hrms.core.utilies.results;

public class SuccessResult extends Result{

	public SuccessResult(Boolean success) {
		super(success);
		// TODO Auto-generated constructor stub
	}
	
	public SuccessResult(Boolean success,String message) {
		super(true,message);
		// TODO Auto-generated constructor stub
	}

}
