# Junit

### JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage

### Junit Platform
foundation for launching testing frameworks on the JVM.

### Test Fixture
When there are multiple test cases in a JUnit class, there could be a common object or objects used by all the test cases.
A **test fixture** is an environment used to consistently test.
A **software test fixture** sets up a system for the software testing **process by initializing it**, thereby satisfying any preconditions the system may have.
#### @BeforeClass - Junit 4, is used on a static function, to work with static members of the class.
#### @BeforeAll - Junit5, can be used both on static and instance method 




### @TestInstance
By default, both JUnit 4 and 5 create a **new instance** of the test class before running each test method.
@TestInstance is a **type-level** annotation
used to configure the **lifecycle** of test instances
**PER_METHOD** default










@Test

Denotes that a method is a test method. Unlike JUnit 4’s @Test annotation, this annotation does not declare any attributes, since test extensions in JUnit Jupiter operate based on their own dedicated annotations. Such methods are inherited unless they are overridden.

@ParameterizedTest

Denotes that a method is a parameterized test. Such methods are inherited unless they are overridden.

@RepeatedTest

Denotes that a method is a test template for a repeated test. Such methods are inherited unless they are overridden.

@TestFactory

Denotes that a method is a test factory for dynamic tests. Such methods are inherited unless they are overridden.

@TestTemplate

Denotes that a method is a template for test cases designed to be invoked multiple times depending on the number of invocation contexts returned by the registered providers. Such methods are inherited unless they are overridden.

@TestClassOrder

Used to configure the test class execution order for @Nested test classes in the annotated test class. Such annotations are inherited.

@TestMethodOrder

Used to configure the test method execution order for the annotated test class; similar to JUnit 4’s @FixMethodOrder. Such annotations are inherited.

@TestInstance

Used to configure the test instance lifecycle for the annotated test class. Such annotations are inherited.

@DisplayName

Declares a custom display name for the test class or test method. Such annotations are not inherited.

@DisplayNameGeneration

Declares a custom display name generator for the test class. Such annotations are inherited.

@BeforeEach

Denotes that the annotated method should be executed before each @Test, @RepeatedTest, @ParameterizedTest, or @TestFactory method in the current class; analogous to JUnit 4’s @Before. Such methods are inherited unless they are overridden.

@AfterEach

Denotes that the annotated method should be executed after each @Test, @RepeatedTest, @ParameterizedTest, or @TestFactory method in the current class; analogous to JUnit 4’s @After. Such methods are inherited unless they are overridden.

@BeforeAll

Denotes that the annotated method should be executed before all @Test, @RepeatedTest, @ParameterizedTest, and @TestFactory methods in the current class; analogous to JUnit 4’s @BeforeClass. Such methods are inherited (unless they are hidden or overridden) and must be static (unless the "per-class" test instance lifecycle is used).

@AfterAll

Denotes that the annotated method should be executed after all @Test, @RepeatedTest, @ParameterizedTest, and @TestFactory methods in the current class; analogous to JUnit 4’s @AfterClass. Such methods are inherited (unless they are hidden or overridden) and must be static (unless the "per-class" test instance lifecycle is used).

@Nested

Denotes that the annotated class is a non-static nested test class. @BeforeAll and @AfterAll methods cannot be used directly in a @Nested test class unless the "per-class" test instance lifecycle is used. Such annotations are not inherited.

@Tag

Used to declare tags for filtering tests, either at the class or method level; analogous to test groups in TestNG or Categories in JUnit 4. Such annotations are inherited at the class level but not at the method level.

@Disabled

Used to disable a test class or test method; analogous to JUnit 4’s @Ignore. Such annotations are not inherited.

@Timeout

Used to fail a test, test factory, test template, or lifecycle method if its execution exceeds a given duration. Such annotations are inherited.

@ExtendWith

Used to register extensions declaratively. Such annotations are inherited.

@RegisterExtension

Used to register extensions programmatically via fields. Such fields are inherited unless they are shadowed.

@TempDir

Used to supply a temporary directory via field injection or parameter injection in a lifecycle method or test method; located in the org.junit.jupiter.api.io package.


