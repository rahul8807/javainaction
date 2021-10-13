package junit5integrationtest;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludePackages;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;
import org.junit.jupiter.api.Test;

@RunWith (JUnitPlatform.class)
@SelectPackages ( "junit5integrationtest" )
@IncludePackages ( "junit5integrationtest.qa" )
public class JunitRunnerQA {
}

//If you run this class directly from the intellij you will get an exception  No tests found for given includes: [junit5integrationtest.JunitRunnerQA](filter.includeTestsMatching)
//Ignore this and just execute  run all test from IDE
