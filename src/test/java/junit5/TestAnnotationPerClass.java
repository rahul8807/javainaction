package junit5;

import org.junit.jupiter.api.*;

@TestInstance ( TestInstance.Lifecycle.PER_CLASS ) // Could be useful in the test cases where order could be used
@TestMethodOrder (MethodOrderer.OrderAnnotation.class) //Order execution
public class TestAnnotationPerClass {

    int i = 0; //This instance variable will be shared and will be incremented,

    @BeforeAll
    public  void setUpFixture(){
        System.out.println ("Before All" );
    }

    @BeforeEach
    public  void setUpBeforeEach(){
        System.out.println ("Before Each" );
    }

    @Test
    @Order ( 2 ) //Order 2 will allways be executed 2nd
    public void helloWorld(){
        System.out.println ("Hello World "+ ++i );
    }

    @Test
    @Order ( 1 ) //Order 1 will allways be executed 1st
    public void helloCollections(){
        System.out.println ("Hello Collections "+ ++i );
    }

    @AfterEach
    public void tearDownAfterEach(){
        System.out.println ("Tear Down After" );
    }

    @AfterAll
    public void detory(){
        System.out.println ("After ALL" );
    }

}
