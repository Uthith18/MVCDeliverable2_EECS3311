package gui.randoopTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RT {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        gui.RequestType requestType0 = gui.RequestType.COURSE;
        org.junit.Assert.assertTrue("'" + requestType0 + "' != '" + gui.RequestType.COURSE + "'", requestType0.equals(gui.RequestType.COURSE));
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        gui.RequestType requestType0 = gui.RequestType.SELF_IMPROVEMENT;
        org.junit.Assert.assertTrue("'" + requestType0 + "' != '" + gui.RequestType.SELF_IMPROVEMENT + "'", requestType0.equals(gui.RequestType.SELF_IMPROVEMENT));
    }
}

