
public class Vault {
	int code = 123456;
	
	public Vault(int Code){
		this.code = Code;
	}
	
	
	public boolean tryCode(int num) {
		if (num == code) {
			return true;
		}
		return false;
	}
	
	public int getCode (){
		return code;
	}
	
}
