package junit5integrationtest.uat;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag ( "UAT" )
public class UATIntegrationTest {

    @Test
    public void uatIntegrationTest(){
        System.out.println ("UAT Integration Test" );
    }
}
