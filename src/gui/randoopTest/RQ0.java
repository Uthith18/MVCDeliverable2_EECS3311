package gui.randoopTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RQ0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = bookRequest3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        java.lang.Class<?> wildcardClass1 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass10 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.lang.Class<?> wildcardClass5 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = bookRequest1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass7 = bookRequestSet6.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.lang.Class<?> wildcardClass3 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass11 = bookRequestSet10.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest7 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest7);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest8 = requestQueue0.processNextRequest();
        java.lang.Class<?> wildcardClass9 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet4 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet4);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.lang.Class<?> wildcardClass8 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        java.lang.Class<?> wildcardClass8 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet5 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass6 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNull(bookRequest4);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.lang.Class<?> wildcardClass7 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
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
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
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
        org.junit.Assert.assertNotNull(bookRequestSet10);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass9 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest8 = requestQueue0.processNextRequest();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = bookRequest8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest8);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.lang.Class<?> wildcardClass9 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
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
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet5 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass4 = bookRequestSet3.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass9 = bookRequestSet8.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.lang.Class<?> wildcardClass10 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.lang.Class<?> wildcardClass9 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.lang.Class<?> wildcardClass12 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass9 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        java.lang.Class<?> wildcardClass12 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
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
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet7 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass8 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass7 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.lang.Class<?> wildcardClass17 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet7 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet7);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass7 = bookRequestSet6.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass14 = bookRequestSet13.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = bookRequest4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest7 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass9 = bookRequestSet8.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.lang.Class<?> wildcardClass16 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest17 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.lang.Class<?> wildcardClass9 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet15);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = bookRequest11.getClass();
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
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest18 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet13);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet4 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass5 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        java.lang.Class<?> wildcardClass13 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet4 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass5 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.lang.Class<?> wildcardClass13 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.lang.Class<?> wildcardClass15 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet11 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass12 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.lang.Class<?> wildcardClass7 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet11 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass12 = bookRequestSet11.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass13 = bookRequestSet12.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet19 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNotNull(bookRequestSet19);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet11 = requestQueue0.loadRequestsFromCSV("hi!");
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
        org.junit.Assert.assertNotNull(bookRequestSet11);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.lang.Class<?> wildcardClass7 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
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
        gui.BookRequest bookRequest18 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet17);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass9 = bookRequestSet8.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest8 = requestQueue0.processNextRequest();
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
        org.junit.Assert.assertNull(bookRequest8);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.lang.Class<?> wildcardClass6 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNull(bookRequest9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNull(bookRequest13);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet7 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass10 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet7);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass10 = bookRequestSet9.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        java.lang.Class<?> wildcardClass5 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass11 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
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
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest17 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest17);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest14 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNull(bookRequest14);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.lang.Class<?> wildcardClass9 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.lang.Class<?> wildcardClass14 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.lang.Class<?> wildcardClass7 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.lang.Class<?> wildcardClass14 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNull(bookRequest4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
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
        java.lang.Class<?> wildcardClass19 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNull(bookRequest16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass11 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.lang.Class<?> wildcardClass6 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.lang.Class<?> wildcardClass17 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass13 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass11 = bookRequestSet10.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass16 = bookRequestSet15.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet17 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest18 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest13);
        org.junit.Assert.assertNotNull(bookRequestSet15);
        org.junit.Assert.assertNotNull(bookRequestSet17);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet11 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet11);
        org.junit.Assert.assertNotNull(bookRequestSet13);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.lang.Class<?> wildcardClass8 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNotNull(bookRequestSet15);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("");
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
        org.junit.Assert.assertNotNull(bookRequestSet15);
        org.junit.Assert.assertNull(bookRequest16);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet5 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass6 = bookRequestSet5.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest6 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest7 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNull(bookRequest7);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = bookRequest13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest13);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet16 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet16);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest14 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest14);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.lang.Class<?> wildcardClass10 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.lang.Class<?> wildcardClass16 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet18 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(bookRequestSet18);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
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
        requestQueue0.refreshAndSaveToCSV("");
        java.lang.Class<?> wildcardClass21 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNull(bookRequest16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet16 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet18 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNotNull(bookRequestSet16);
        org.junit.Assert.assertNotNull(bookRequestSet18);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet14 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass15 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass10 = bookRequestSet9.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest18 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
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
        org.junit.Assert.assertNull(bookRequest10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest2 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet20 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass21 = bookRequestSet20.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(bookRequestSet20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet5 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass6 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet18 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest19 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(bookRequestSet18);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet11 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass12 = bookRequestSet11.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNotNull(bookRequestSet11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest8 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest6 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        java.lang.Class<?> wildcardClass9 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest12 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass11 = bookRequestSet10.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
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
        java.util.Set<gui.BookRequest> bookRequestSet19 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest20 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet17);
        org.junit.Assert.assertNotNull(bookRequestSet19);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.lang.Class<?> wildcardClass9 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet19 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass20 = bookRequestSet19.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet5 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass6 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest22 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet13);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass9 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest14 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNull(bookRequest14);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.lang.Class<?> wildcardClass15 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass13 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet4 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet4);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest6 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        java.lang.Class<?> wildcardClass9 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest5 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest6 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest5);
        org.junit.Assert.assertNull(bookRequest6);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet15);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet4 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.lang.Class<?> wildcardClass11 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest7 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest7);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet6);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet17 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet17);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest20 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet15);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest12 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest12);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        java.lang.Class<?> wildcardClass10 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet7 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.lang.Class<?> wildcardClass12 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
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
        gui.BookRequest bookRequest17 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(bookRequestSet16);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.lang.Class<?> wildcardClass19 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.lang.Class<?> wildcardClass16 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet16 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet20 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest21 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNotNull(bookRequestSet16);
        org.junit.Assert.assertNotNull(bookRequestSet20);
        org.junit.Assert.assertNull(bookRequest21);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest13);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.lang.Class<?> wildcardClass13 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet5 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass6 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNotNull(bookRequestSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet4 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet4);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet11 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet11);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest14 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNull(bookRequest14);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.lang.Class<?> wildcardClass8 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
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
        gui.BookRequest bookRequest17 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNull(bookRequest14);
        org.junit.Assert.assertNull(bookRequest17);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet7 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet7);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNotNull(bookRequestSet13);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest10);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet14 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet14);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.lang.Class<?> wildcardClass7 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass13 = bookRequestSet12.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNotNull(bookRequestSet13);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest13);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet4 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass5 = bookRequestSet4.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet7 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet7);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet16 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet20 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNotNull(bookRequestSet16);
        org.junit.Assert.assertNotNull(bookRequestSet20);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet21 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet23 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass24 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNotNull(bookRequestSet21);
        org.junit.Assert.assertNotNull(bookRequestSet23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest18 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNull(bookRequest18);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest12 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet14 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNull(bookRequest12);
        org.junit.Assert.assertNotNull(bookRequestSet14);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.lang.Class<?> wildcardClass18 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest18 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNull(bookRequest18);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        java.lang.Class<?> wildcardClass15 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet20 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(bookRequestSet20);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest5 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNull(bookRequest5);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNull(bookRequest13);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest8 = requestQueue0.processNextRequest();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = bookRequest8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest8);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.lang.Class<?> wildcardClass18 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.lang.Class<?> wildcardClass17 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest7 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass14 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest7);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet14 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(bookRequestSet14);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest7 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest8 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNull(bookRequest7);
        org.junit.Assert.assertNull(bookRequest8);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet7 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet7);
        org.junit.Assert.assertNotNull(bookRequestSet9);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
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
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(bookRequestSet16);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet13);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest12 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNull(bookRequest12);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest15 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest15);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = bookRequest9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet17 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass18 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet15);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet13);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest20 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNull(bookRequest20);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest14 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNull(bookRequest13);
        org.junit.Assert.assertNull(bookRequest14);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass7 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.lang.Class<?> wildcardClass10 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet21 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest22 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNotNull(bookRequestSet21);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet6);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass11 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest7 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest7);
        org.junit.Assert.assertNull(bookRequest10);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest18 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest5 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNull(bookRequest5);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass9 = bookRequestSet8.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
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
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNull(bookRequest16);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
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
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest12 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest12);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet18 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(bookRequestSet18);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest8 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest8);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest8 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest8);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass13 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest5 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest5);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest13);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet7 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest12 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet7);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest12);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        java.lang.Class<?> wildcardClass10 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
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
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        java.lang.Class<?> wildcardClass10 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest15 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest15);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet17 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNotNull(bookRequestSet17);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet11 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest12 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet11);
        org.junit.Assert.assertNull(bookRequest12);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
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
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNull(bookRequest16);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet21 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNotNull(bookRequestSet21);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNotNull(bookRequestSet15);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet7 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet7);
        org.junit.Assert.assertNotNull(bookRequestSet9);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
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
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet17 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest18 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.lang.Class<?> wildcardClass21 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet17);
        org.junit.Assert.assertNull(bookRequest18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet12);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
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
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet17);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass13 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
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
        java.util.Set<gui.BookRequest> bookRequestSet18 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass19 = bookRequestSet18.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNull(bookRequest16);
        org.junit.Assert.assertNotNull(bookRequestSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest15 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNull(bookRequest15);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet16 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet16);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.lang.Class<?> wildcardClass12 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet12);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet5 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass6 = bookRequestSet5.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest16 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet18 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest19 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNull(bookRequest16);
        org.junit.Assert.assertNotNull(bookRequestSet18);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNull(bookRequest9);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet16 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(bookRequestSet16);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = bookRequest11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest16 = requestQueue0.processNextRequest();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = bookRequest16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet15);
        org.junit.Assert.assertNull(bookRequest16);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet14 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet14);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest8 = requestQueue0.processNextRequest();
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
        org.junit.Assert.assertNull(bookRequest8);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest16 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNotNull(bookRequestSet15);
        org.junit.Assert.assertNull(bookRequest16);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNotNull(bookRequestSet13);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet21 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass22 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNotNull(bookRequestSet21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
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
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.lang.Class<?> wildcardClass9 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest14 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNull(bookRequest14);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNull(bookRequest13);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest6 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest6);
        org.junit.Assert.assertNotNull(bookRequestSet12);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest5 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNull(bookRequest5);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNull(bookRequest13);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest12 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNull(bookRequest12);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest15 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNull(bookRequest15);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet7 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest8 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet7);
        org.junit.Assert.assertNull(bookRequest8);
        org.junit.Assert.assertNull(bookRequest9);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass16 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNotNull(bookRequestSet15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
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
        gui.BookRequest bookRequest19 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNull(bookRequest16);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
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
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNull(bookRequest16);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest6 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest7 = requestQueue0.processNextRequest();
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
        org.junit.Assert.assertNull(bookRequest6);
        org.junit.Assert.assertNull(bookRequest7);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet17 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest18 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest21 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet17);
        org.junit.Assert.assertNull(bookRequest18);
        org.junit.Assert.assertNull(bookRequest21);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
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
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNull(bookRequest16);
        org.junit.Assert.assertNotNull(bookRequestSet18);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
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
        gui.BookRequest bookRequest19 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNull(bookRequest16);
        org.junit.Assert.assertNull(bookRequest19);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest5 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet19 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass20 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNotNull(bookRequestSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet11 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest12 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet17 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet11);
        org.junit.Assert.assertNull(bookRequest12);
        org.junit.Assert.assertNull(bookRequest13);
        org.junit.Assert.assertNotNull(bookRequestSet17);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet17 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNull(bookRequest13);
        org.junit.Assert.assertNotNull(bookRequestSet15);
        org.junit.Assert.assertNotNull(bookRequestSet17);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest5 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
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
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNull(bookRequest5);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet15);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.lang.Class<?> wildcardClass16 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest6 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest6);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet17 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest18 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet17);
        org.junit.Assert.assertNull(bookRequest18);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest5 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest5);
        org.junit.Assert.assertNotNull(bookRequestSet9);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNull(bookRequest13);
        org.junit.Assert.assertNotNull(bookRequestSet15);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.lang.Class<?> wildcardClass8 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest11 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest5 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest8 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest5);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet11 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet11);
        org.junit.Assert.assertNotNull(bookRequestSet13);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet16 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest17 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(bookRequestSet16);
        org.junit.Assert.assertNull(bookRequest17);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet14 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(bookRequestSet14);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet13);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet16 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet16);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet14 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet14);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet5 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNotNull(bookRequestSet5);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNull(bookRequest10);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest14 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNull(bookRequest14);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet12);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet7 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest8 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet7);
        org.junit.Assert.assertNull(bookRequest8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNull(bookRequest10);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
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
        java.util.Set<gui.BookRequest> bookRequestSet19 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass20 = bookRequestSet19.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet17);
        org.junit.Assert.assertNotNull(bookRequestSet19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest20 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNull(bookRequest13);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNull(bookRequest13);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest7 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest7);
        org.junit.Assert.assertNotNull(bookRequestSet13);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNotNull(bookRequestSet13);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
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
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest21 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest21);
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
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet11 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest14 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet11);
        org.junit.Assert.assertNull(bookRequest14);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet11 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet11);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet7 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest8 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass14 = bookRequestSet13.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet7);
        org.junit.Assert.assertNull(bookRequest8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest5 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet11 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest5);
        org.junit.Assert.assertNotNull(bookRequestSet11);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet5 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest6 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet5);
        org.junit.Assert.assertNull(bookRequest6);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest6 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest7 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest8 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest9 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest6);
        org.junit.Assert.assertNull(bookRequest7);
        org.junit.Assert.assertNull(bookRequest8);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet4 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet4);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet5 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNotNull(bookRequestSet5);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest6 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest7 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest6);
        org.junit.Assert.assertNull(bookRequest7);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.lang.Class<?> wildcardClass15 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.lang.Class<?> wildcardClass13 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest7 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNull(bookRequest7);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.lang.Class<?> wildcardClass13 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet11 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest14 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNotNull(bookRequestSet11);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNull(bookRequest14);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest15 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest15);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest16 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet18 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass19 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNull(bookRequest16);
        org.junit.Assert.assertNotNull(bookRequestSet18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNull(bookRequest9);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest7 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest5 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest5);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass13 = bookRequestSet12.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet7 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest12 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet7);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest12);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass11 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet21 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet23 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNotNull(bookRequestSet21);
        org.junit.Assert.assertNotNull(bookRequestSet23);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
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
        gui.BookRequest bookRequest18 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet17);
        org.junit.Assert.assertNull(bookRequest18);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest6 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet14 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass15 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest6);
        org.junit.Assert.assertNotNull(bookRequestSet14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest10);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNotNull(bookRequestSet15);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest7 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest14 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest17 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest7);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNull(bookRequest14);
        org.junit.Assert.assertNull(bookRequest17);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet18 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet20 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(bookRequestSet18);
        org.junit.Assert.assertNotNull(bookRequestSet20);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNotNull(bookRequestSet12);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest18 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNotNull(bookRequestSet15);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest6 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest6);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest7 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.lang.Class<?> wildcardClass10 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNull(bookRequest7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest14 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet14 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(bookRequestSet14);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet14 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet16 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(bookRequestSet14);
        org.junit.Assert.assertNotNull(bookRequestSet16);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet14 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet14);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet21 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet15);
        org.junit.Assert.assertNotNull(bookRequestSet21);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest6 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest6);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest5 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest5);
        org.junit.Assert.assertNotNull(bookRequestSet9);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet19 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNotNull(bookRequestSet19);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNull(bookRequest9);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest15 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest15);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest18 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet15);
        org.junit.Assert.assertNull(bookRequest18);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest21 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest17 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet19 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest17);
        org.junit.Assert.assertNotNull(bookRequestSet19);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet5 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet7 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet5);
        org.junit.Assert.assertNotNull(bookRequestSet7);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.lang.Class<?> wildcardClass9 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest15 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNull(bookRequest15);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet17 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest18 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNotNull(bookRequestSet17);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest13 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
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
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest24 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet17);
        org.junit.Assert.assertNull(bookRequest24);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest5 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest6 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNull(bookRequest5);
        org.junit.Assert.assertNull(bookRequest6);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.lang.Class<?> wildcardClass13 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNull(bookRequest10);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet4 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet4);
        org.junit.Assert.assertNotNull(bookRequestSet6);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet14 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet14);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest5 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest5);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest14 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet16 = requestQueue0.loadRequestsFromCSV("hi!");
        java.lang.Class<?> wildcardClass17 = bookRequestSet16.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest14);
        org.junit.Assert.assertNotNull(bookRequestSet16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet5 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest6 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet5);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest10);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet7 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest8 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet7);
        org.junit.Assert.assertNull(bookRequest8);
        org.junit.Assert.assertNull(bookRequest9);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
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
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest21 = requestQueue0.processNextRequest();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = bookRequest21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNull(bookRequest16);
        org.junit.Assert.assertNull(bookRequest21);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
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
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
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
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNull(bookRequest16);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest11);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet4 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet4);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet11 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet11);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
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
        java.util.Set<gui.BookRequest> bookRequestSet22 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNull(bookRequest16);
        org.junit.Assert.assertNotNull(bookRequestSet18);
        org.junit.Assert.assertNotNull(bookRequestSet22);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest13);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet18 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest19 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(bookRequestSet18);
        org.junit.Assert.assertNull(bookRequest19);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest6 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet14 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest15 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest6);
        org.junit.Assert.assertNotNull(bookRequestSet14);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest15 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet17 = requestQueue0.loadRequestsFromCSV("");
        java.lang.Class<?> wildcardClass18 = bookRequestSet17.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest15);
        org.junit.Assert.assertNotNull(bookRequestSet17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest18 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet15);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet17 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet19 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest20 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest13);
        org.junit.Assert.assertNotNull(bookRequestSet15);
        org.junit.Assert.assertNotNull(bookRequestSet17);
        org.junit.Assert.assertNotNull(bookRequestSet19);
        org.junit.Assert.assertNull(bookRequest20);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest13);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet16 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet18 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest19 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(bookRequestSet16);
        org.junit.Assert.assertNotNull(bookRequestSet18);
        org.junit.Assert.assertNull(bookRequest19);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest16 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNull(bookRequest13);
        org.junit.Assert.assertNotNull(bookRequestSet15);
        org.junit.Assert.assertNull(bookRequest16);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet6 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet6);
        org.junit.Assert.assertNull(bookRequest13);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet10 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest15 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet10);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNull(bookRequest15);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
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
        java.lang.Class<?> wildcardClass17 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNull(bookRequest16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
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
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest15);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest8 = requestQueue0.processNextRequest();
        java.lang.Class<?> wildcardClass9 = requestQueue0.getClass();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        gui.BookRequest bookRequest7 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest7);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest12 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest12);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet16 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNotNull(bookRequestSet16);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest13 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest13);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet12 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet14 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(bookRequestSet14);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest16 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet18 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNull(bookRequest16);
        org.junit.Assert.assertNotNull(bookRequestSet18);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest16 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet21 = requestQueue0.loadRequestsFromCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet23 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
        org.junit.Assert.assertNotNull(bookRequestSet15);
        org.junit.Assert.assertNotNull(bookRequestSet21);
        org.junit.Assert.assertNotNull(bookRequestSet23);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet3 = requestQueue0.loadRequestsFromCSV("hi!");
        gui.BookRequest bookRequest4 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet8 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest9 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest10 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest1);
        org.junit.Assert.assertNotNull(bookRequestSet3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet8);
        org.junit.Assert.assertNull(bookRequest9);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        gui.BookRequest bookRequest1 = null;
        // The following exception was thrown during execution in test generation
        try {
            requestQueue0.addRequest(bookRequest1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestQueue0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet14 = requestQueue0.loadRequestsFromCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNotNull(bookRequestSet14);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        requestQueue0.refreshAndSaveToCSV("hi!");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet19 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest20 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNotNull(bookRequestSet15);
        org.junit.Assert.assertNotNull(bookRequestSet19);
        org.junit.Assert.assertNull(bookRequest20);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
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
        java.util.Set<gui.BookRequest> bookRequestSet18 = requestQueue0.loadRequestsFromCSV("");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNull(bookRequest4);
        org.junit.Assert.assertNotNull(bookRequestSet12);
        org.junit.Assert.assertNotNull(bookRequestSet16);
        org.junit.Assert.assertNotNull(bookRequestSet18);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        requestQueue0.saveRequestsToCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        requestQueue0.saveRequestsToCSV("");
        gui.BookRequest bookRequest16 = requestQueue0.processNextRequest();
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNull(bookRequest16);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        gui.RequestQueue requestQueue0 = gui.RequestQueue.getInstance();
        requestQueue0.refreshAndSaveToCSV("");
        gui.BookRequest bookRequest3 = requestQueue0.processNextRequest();
        requestQueue0.refreshAndSaveToCSV("hi!");
        requestQueue0.refreshAndSaveToCSV("hi!");
        java.util.Set<gui.BookRequest> bookRequestSet9 = requestQueue0.loadRequestsFromCSV("");
        gui.BookRequest bookRequest10 = requestQueue0.processNextRequest();
        gui.BookRequest bookRequest11 = requestQueue0.processNextRequest();
        java.util.Set<gui.BookRequest> bookRequestSet13 = requestQueue0.loadRequestsFromCSV("");
        java.util.Set<gui.BookRequest> bookRequestSet15 = requestQueue0.loadRequestsFromCSV("hi!");
        requestQueue0.saveRequestsToCSV("hi!");
        org.junit.Assert.assertNotNull(requestQueue0);
        org.junit.Assert.assertNull(bookRequest3);
        org.junit.Assert.assertNotNull(bookRequestSet9);
        org.junit.Assert.assertNull(bookRequest10);
        org.junit.Assert.assertNull(bookRequest11);
        org.junit.Assert.assertNotNull(bookRequestSet13);
        org.junit.Assert.assertNotNull(bookRequestSet15);
    }
}

