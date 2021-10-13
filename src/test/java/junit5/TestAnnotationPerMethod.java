package junit5;

import org.junit.jupiter.api.*;

@TestInstance ( TestInstance.Lifecycle.PER_METHOD )
public class TestAnnotationPerMethod {

    int i = 0; //This instance variable is not shared and an new instance variable will be created for each Test Method

    @BeforeAll
    public static void setUpFixture(){
        System.out.println ("Before All" );
    }

    @BeforeEach
    public  void setUpBeforeEach(){
        System.out.println ("Before Each" );
    }

    @Test
    public void helloWorld(){
        System.out.println ("Hello World " + ++i);
    }

    @Test
    public void helloCollections(){
        System.out.println ("Hello Collections " + ++i );
    }

    @AfterEach
    public void tearDownAfterEach(){
        System.out.println ("Tear Down After" );
    }

    @AfterAll
    public static void detory(){
        System.out.println ("After ALL" );
    }

}
