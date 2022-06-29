
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        LoopFunEncryptTest.class,
        LoopFunFactorialTest.class,
        LoopsFunAcronymTest.class,
        MathUtilitiesAddTest.class,
        MathUtilitiesHalfTest.class,
        MathUtilitiesIsOddTest.class,
        MathUtilitiesSquareTest.class,
        StringUtilsConcatenateTest.class,
        StringUtilsGetLastWordTest.class,
        StringUtilsGetMiddleCharacterTest.class,
        StringUtilsRemoveCharacterTest.class,
        StringUtilsReturnInputTest.class,
        StringUtilsReverseTest.class,
})

public class TestSuite {
}
