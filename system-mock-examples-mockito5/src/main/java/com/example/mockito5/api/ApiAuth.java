package com.example.mockito5.api;

public class ApiAuth {
	String ENV_NAME = "ENV_MOCK_TEST";

	public String getToken() {
		return System.getenv(ENV_NAME);
	}
}

