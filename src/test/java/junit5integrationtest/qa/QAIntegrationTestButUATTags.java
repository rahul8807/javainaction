package junit5integrationtest.qa;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag ( "UAT" )
public class QAIntegrationTestButUATTags {

    @Test
    public void qaIntegrationTest(){
        System.out.println ("QA Integration Test" );
    }

}
