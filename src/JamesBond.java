
public class JamesBond {
	
	public JamesBond(){
	
	}
	
	public int findCode(Vault vault){
		for (int i = 1; i < 1000000; i++) {
			System.out.println(i);
			if (vault.tryCode(i)) {
				return i;
			}
		}
		return -1;
	}
	
	
}
