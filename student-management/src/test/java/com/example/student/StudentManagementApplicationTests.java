// package com.example.student;

// import junit.framework.Test;
// import junit.framework.TestCase;
// import junit.framework.TestSuite;

// /**
//  * Unit test for simple App.
//  */
// public class AppTest 
//     extends TestCase
// {
//     /**
//      * Create the test case
//      *
//      * @param testName name of the test case
//      */
//     public AppTest( String testName )
//     {
//         super( testName );
//     }

//     /**
//      * @return the suite of tests being tested
//      */
//     public static Test suite()
//     {
//         return new TestSuite( AppTest.class );
//     }

//     /**
//      * Rigourous Test :-)
//      */
//     public void testApp()
//     {
//         assertTrue( true );
//     }
// }
package com.example.student;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StudentManagementApplicationTests {

    @Test
    void contextLoads() {
        // Basic context load test
    }
}

