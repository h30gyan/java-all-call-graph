package test.run_by_code;

import com.adrninistrator.jacg.find_stack.FindCallStackTrace;
import org.junit.Test;

/**
 * @author adrninistrator
 * @date 2022/4/20
 * @description:
 */
public class TestRBCFindCallStackTrace4er extends TestRunByCodeBase {
    @Test
    public void test() {
        new FindCallStackTrace().find(false, configureWrapper);
    }
}