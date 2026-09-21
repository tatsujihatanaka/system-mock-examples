package com.example.mockito5.api;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import uk.org.webcompere.systemstubs.environment.EnvironmentVariables;
import uk.org.webcompere.systemstubs.jupiter.SystemStubsExtension;

@ExtendWith(SystemStubsExtension.class)
class ApiAuthTest {

    @Test
    void testGetToken(EnvironmentVariables env) throws Exception {
        // テスト中のみ有効な環境変数を設定
        env.set("ENV_MOCK_TEST", "MOCKED_API_TOKEN");

        ApiAuth apiAuth = new ApiAuth();
        String result = apiAuth.getToken();

        assertEquals("MOCKED_API_TOKEN", result);
    }
}
