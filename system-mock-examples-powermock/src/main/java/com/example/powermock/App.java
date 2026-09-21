package com.example.powermock;

import com.example.powermock.api.ApiAuth;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApiAuth apiAuth = new ApiAuth();
        String result = apiAuth.getToken();

    	System.out.println( "Hello World! + " + result );
    }
}
