package kodlamaio.hrms.fakeMernis;

import org.springframework.stereotype.Component;

@Component
public class FakeMernisManager {
	public boolean isTrue(String identificationNumber) {
		if(identificationNumber.length()<11) {
			return false;
		}
		return true;
	}

}
