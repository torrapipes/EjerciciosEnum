import org.junit.Test;
import severity.DefectUtil;
import severity.Severity;

import static junit.framework.TestCase.assertEquals;

public class TestDefectUtil {

    @Test
    public void testGetProjectedTurnAroundDays(){

        assertEquals(7, DefectUtil.getProjectedTurnaroundDays(Severity.HIGH));

    }
}
