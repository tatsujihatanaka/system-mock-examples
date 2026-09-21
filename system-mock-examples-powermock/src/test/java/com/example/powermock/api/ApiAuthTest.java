package com.example.powermock.api;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ApiAuth.class})
public class ApiAuthTest {

    @Test
    public void testGetToken() {
        // 1. System クラスをモック化対象として準備
        PowerMockito.mockStatic(System.class);

        // 2. System.getenv("ENV_MOCK_TEST") が呼ばれた際のモック値を定義
        PowerMockito.when(System.getenv("ENV_MOCK_TEST")).thenReturn("MOCKED_API_TOKEN");

        // 3. テスト対象のインスタンス化と実行
        ApiAuth apiAuth = new ApiAuth();
        String result = apiAuth.getToken();

        // 4. 検証（モック化した値が正しく返ってくるか）
        assertEquals("MOCKED_API_TOKEN", result);
    }
}