package gui.randoopTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RQ1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest5 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest5);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet14 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet14);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest10);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet16 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest17 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(bookRequestSet16);
        org.junit.Assert.assertNull(bookRequest17);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest15 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest16 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest15);
        org.junit.Assert.assertNull(bookRequest16);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet16 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(bookRequestSet16);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNotNull(bookRequestSet12);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest16 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet18 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest21 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNull(bookRequest16);
        org.junit.Assert.assertNotNull(bookRequestSet18);
        org.junit.Assert.assertNull(bookRequest21);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.lang.Class<?> wildcardClass17 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest16 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNotNull(bookRequestSet15);
        org.junit.Assert.assertNull(bookRequest16);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest16 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet24 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNull(bookRequest16);
        org.junit.Assert.assertNotNull(bookRequestSet24);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet5 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNotNull(bookRequestSet5);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet7 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest8 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet7);
        org.junit.Assert.assertNull(bookRequest8);
        org.junit.Assert.assertNull(bookRequest9);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest16 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest17 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet15);
        org.junit.Assert.assertNull(bookRequest16);
        org.junit.Assert.assertNull(bookRequest17);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.lang.Class<?> wildcardClass13 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest6 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest6);
        org.junit.Assert.assertNull(bookRequest9);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNotNull(bookRequestSet12);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        java.lang.Class<?> wildcardClass14 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest17 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNull(bookRequest17);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest7 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest7);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest6 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest6);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest6 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest6);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest15 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNull(bookRequest15);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest16 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest17 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNull(bookRequest16);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet17 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet19 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet21 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNotNull(bookRequestSet15);
        org.junit.Assert.assertNotNull(bookRequestSet17);
        org.junit.Assert.assertNotNull(bookRequestSet19);
        org.junit.Assert.assertNotNull(bookRequestSet21);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest15 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest16 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest15);
        org.junit.Assert.assertNull(bookRequest16);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest17 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest17);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.lang.Class<?> wildcardClass13 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet11 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet11);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet7 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet7);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest6 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet14 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest6);
        org.junit.Assert.assertNotNull(bookRequestSet14);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest14 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet18 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest19 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNull(bookRequest14);
        org.junit.Assert.assertNotNull(bookRequestSet18);
        org.junit.Assert.assertNull(bookRequest19);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet11 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass12 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.lang.Class<?> wildcardClass11 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = bookRequest10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest10);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest15 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNull(bookRequest15);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet17 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass18 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.lang.Class<?> wildcardClass17 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest5 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        java.lang.Class<?> wildcardClass8 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass10 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNotNull(bookRequestSet15);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet16 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(bookRequestSet16);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet19 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet15);
        org.junit.Assert.assertNotNull(bookRequestSet19);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet14 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(bookRequestSet14);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }
}

