package com.example;

import org.junit.Test;
import org.mockito.Mockito;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class MyServiceTest {
    
    @Test
    public void testExternalApi() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        
        when(mockApi.getData()).thenReturn("Mock Data");
        
        MyService service = new MyService(mockApi);
        String result = service.fetchData();
        
        assertEquals("Mock Data", result);
    }

    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        
        service.fetchData();
        
        verify(mockApi).getData();
    }

    @Test(expected = RuntimeException.class)
    public void testApiThrowsException() {
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);
        
        when(mockApi.getData()).thenThrow(new RuntimeException("API Server is down!"));
        
        MyService service = new MyService(mockApi);
        
        service.fetchData(); 
    }
}