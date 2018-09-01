
public class VaultTest {
	public static void main(String[] args) {
		Vault vault = new Vault(2345);
		JamesBond jb = new JamesBond();
		System.out.println(jb.findCode(vault));
	}
	
	
}
