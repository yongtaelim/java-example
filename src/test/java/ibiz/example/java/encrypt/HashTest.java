package ibiz.example.java.encrypt;

import static org.assertj.core.api.Assertions.assertThat;

import java.security.NoSuchAlgorithmException;

import org.junit.Before;
import org.junit.Test;

public class HashTest {

	private Hash hash;
	
	@Before
	public void setUp() {
		this.hash = new Hash();
	}
	
	@Test
	public void sha256Test() throws NoSuchAlgorithmException {
		String msg = "dev-peer0.peerorg1.testnet.com-test1-1.0";
		String sha256 = hash.sha256(msg);
		assertThat(sha256).isEqualTo("c2bfda8edefc4872e66a9a2c7fecd14702b6429bd3a2e68be06f1964cdea2099");
	}
}
