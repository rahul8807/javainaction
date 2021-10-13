package junit5integrationtest.qa;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag ( "QA" )
public class QAIntegrationTest {

    @Test
    public static void qaIntegrationTest(){
        System.out.println ("QA Integration Test" );
    }

}
