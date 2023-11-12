package com.hiphopman.backend.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CRUDEndUserService {


	// DataTest
	 interface TestCreateData {
		String email = "hiphopton@yahoo.com";
		String password = "z3RG37hUwpuun$4U";
		String name = "Kritsana J.";
		String email_Query = "hiphopton@hotmail.com";
	}

	interface SocialTestCreateData {
		String facebook = "hiphopman_facebook";
		String line = "hiphopman_line";
		String instagram = "hiphopman_instagram";
		String tiktok = "hiphopman_tiktok";
	}

	interface AddressTestCreateData {

		String line1 = "335/66";
		String line2 = "Muang";
		String zipcode = "63000";

	}

	interface AddressTestCreateData2 {

		String line1 = "456/7";
		String line2 = "Muang";
		String zipcode = "37001";

	}

	interface TestUpdateData {
		String name = "Rapeepon B.";
	}
}
