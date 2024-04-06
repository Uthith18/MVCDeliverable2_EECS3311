package gui.randoopTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookRequestTest {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass8 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = requestType4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        java.lang.String str5 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass6 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass8 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass6 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("");
        java.lang.Class<?> wildcardClass8 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.getBookTitle();
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        java.lang.Class<?> wildcardClass12 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType9 = null;
        bookRequest2.setRequestType(requestType9);
        java.lang.Class<?> wildcardClass11 = bookRequest2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType11 = null;
        bookRequest2.setRequestType(requestType11);
        gui.RequestType requestType13 = null;
        bookRequest2.setRequestType(requestType13);
        java.lang.Class<?> wildcardClass15 = bookRequest2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("");
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass9 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType6 = null;
        gui.BookRequest bookRequest7 = new gui.BookRequest("", requestType6);
        bookRequest7.setBookTitle("");
        gui.RequestType requestType10 = null;
        bookRequest7.setRequestType(requestType10);
        gui.RequestType requestType12 = null;
        bookRequest7.setRequestType(requestType12);
        bookRequest7.setBookTitle("hi!");
        gui.RequestType requestType16 = bookRequest7.getRequestType();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) bookRequest7);
        gui.RequestType requestType18 = null;
        bookRequest7.setRequestType(requestType18);
        org.junit.Assert.assertNull(requestType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.toCSVString();
        java.lang.String str9 = bookRequest2.getBookTitle();
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = requestType10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!,null" + "'", str8, "hi!,null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(requestType10);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        bookRequest2.setBookTitle("hi!");
        java.lang.Class<?> wildcardClass7 = bookRequest2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass6 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = requestType6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertNull(requestType6);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType4 = null;
        gui.BookRequest bookRequest5 = new gui.BookRequest("", requestType4);
        bookRequest5.setBookTitle("");
        gui.RequestType requestType8 = null;
        bookRequest5.setRequestType(requestType8);
        java.lang.Class<?> wildcardClass10 = bookRequest5.getClass();
        boolean boolean11 = bookRequest2.equals((java.lang.Object) bookRequest5);
        java.lang.String str12 = bookRequest5.getBookTitle();
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType4 = null;
        gui.BookRequest bookRequest5 = new gui.BookRequest("", requestType4);
        bookRequest5.setBookTitle("");
        gui.RequestType requestType8 = null;
        bookRequest5.setRequestType(requestType8);
        java.lang.Class<?> wildcardClass10 = bookRequest5.getClass();
        boolean boolean11 = bookRequest2.equals((java.lang.Object) bookRequest5);
        bookRequest5.setBookTitle(",null");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        java.lang.Class<?> wildcardClass10 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("");
        java.lang.Class<?> wildcardClass9 = bookRequest2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.Object obj7 = null;
        boolean boolean8 = bookRequest2.equals(obj7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null");
        java.lang.Class<?> wildcardClass8 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("", requestType7);
        java.lang.String str9 = bookRequest8.toCSVString();
        java.lang.String str10 = bookRequest8.toCSVString();
        boolean boolean11 = bookRequest2.equals((java.lang.Object) bookRequest8);
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(requestType12);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        java.lang.Class<?> wildcardClass29 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        java.lang.String str9 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass10 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType11 = bookRequest2.getRequestType();
        java.lang.Class<?> wildcardClass12 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        bookRequest2.setBookTitle("hi!");
        java.lang.String str12 = bookRequest2.toCSVString();
        java.lang.String str13 = bookRequest2.getBookTitle();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!,null" + "'", str12, "hi!,null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        boolean boolean9 = bookRequest2.equals((java.lang.Object) (short) 0);
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle(",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(requestType12);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType11 = bookRequest2.getRequestType();
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        java.lang.Class<?> wildcardClass13 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertNull(requestType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType13 = null;
        bookRequest10.setRequestType(requestType13);
        bookRequest10.setBookTitle("hi!");
        gui.RequestType requestType18 = null;
        gui.BookRequest bookRequest19 = new gui.BookRequest("", requestType18);
        gui.RequestType requestType20 = null;
        bookRequest19.setRequestType(requestType20);
        gui.RequestType requestType22 = bookRequest19.getRequestType();
        bookRequest19.setBookTitle("hi!");
        bookRequest19.setBookTitle(",null");
        gui.RequestType requestType28 = null;
        gui.BookRequest bookRequest29 = new gui.BookRequest("", requestType28);
        bookRequest29.setBookTitle("");
        gui.RequestType requestType32 = null;
        bookRequest29.setRequestType(requestType32);
        java.lang.String str34 = bookRequest29.toCSVString();
        boolean boolean35 = bookRequest19.equals((java.lang.Object) str34);
        boolean boolean36 = bookRequest10.equals((java.lang.Object) str34);
        java.lang.String str37 = bookRequest10.getBookTitle();
        boolean boolean38 = bookRequest2.equals((java.lang.Object) bookRequest10);
        gui.RequestType requestType39 = null;
        bookRequest2.setRequestType(requestType39);
        java.lang.Class<?> wildcardClass41 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertNull(requestType22);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ",null" + "'", str34, ",null");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        boolean boolean6 = bookRequest2.equals((java.lang.Object) 10L);
        gui.RequestType requestType7 = bookRequest2.getRequestType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = requestType7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(requestType7);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType4 = null;
        gui.BookRequest bookRequest5 = new gui.BookRequest("", requestType4);
        bookRequest5.setBookTitle("");
        gui.RequestType requestType8 = null;
        bookRequest5.setRequestType(requestType8);
        java.lang.Class<?> wildcardClass10 = bookRequest5.getClass();
        boolean boolean11 = bookRequest2.equals((java.lang.Object) bookRequest5);
        java.lang.String str12 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass13 = bookRequest2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType6 = null;
        gui.BookRequest bookRequest7 = new gui.BookRequest("", requestType6);
        bookRequest7.setBookTitle("");
        gui.RequestType requestType10 = null;
        bookRequest7.setRequestType(requestType10);
        java.lang.String str12 = bookRequest7.toCSVString();
        boolean boolean14 = bookRequest7.equals((java.lang.Object) (short) 0);
        boolean boolean15 = bookRequest2.equals((java.lang.Object) boolean14);
        java.lang.String str16 = bookRequest2.toCSVString();
        gui.RequestType requestType17 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertNull(requestType17);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass8 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!");
        java.lang.Class<?> wildcardClass7 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        java.lang.String str10 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null,null,null");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        java.lang.String str9 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null,null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        java.lang.String str7 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertNull(requestType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("");
        java.lang.String str8 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType11 = null;
        bookRequest2.setRequestType(requestType11);
        java.lang.String str13 = bookRequest2.toCSVString();
        java.lang.String str14 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!,null,null" + "'", str13, "hi!,null,null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!,null,null" + "'", str14, "hi!,null,null");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!");
        java.lang.Class<?> wildcardClass8 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        java.lang.String str29 = bookRequest2.getBookTitle();
        gui.RequestType requestType30 = null;
        bookRequest2.setRequestType(requestType30);
        java.lang.String str32 = bookRequest2.toCSVString();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!,null" + "'", str32, "hi!,null");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        java.lang.String str6 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null,null");
        java.lang.Class<?> wildcardClass9 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle("");
        gui.RequestType requestType13 = bookRequest2.getRequestType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = requestType13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNull(requestType13);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        bookRequest13.setBookTitle("");
        gui.RequestType requestType16 = null;
        bookRequest13.setRequestType(requestType16);
        gui.RequestType requestType18 = null;
        bookRequest13.setRequestType(requestType18);
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = bookRequest2.getRequestType();
        gui.RequestType requestType22 = null;
        bookRequest2.setRequestType(requestType22);
        gui.RequestType requestType24 = bookRequest2.getRequestType();
        gui.RequestType requestType26 = null;
        gui.BookRequest bookRequest27 = new gui.BookRequest("", requestType26);
        gui.RequestType requestType28 = null;
        bookRequest27.setRequestType(requestType28);
        gui.RequestType requestType30 = bookRequest27.getRequestType();
        bookRequest27.setBookTitle("hi!");
        gui.RequestType requestType34 = null;
        gui.BookRequest bookRequest35 = new gui.BookRequest("", requestType34);
        bookRequest35.setBookTitle("");
        gui.RequestType requestType38 = null;
        bookRequest35.setRequestType(requestType38);
        bookRequest35.setBookTitle("hi!");
        gui.RequestType requestType43 = null;
        gui.BookRequest bookRequest44 = new gui.BookRequest("", requestType43);
        gui.RequestType requestType45 = null;
        bookRequest44.setRequestType(requestType45);
        gui.RequestType requestType47 = bookRequest44.getRequestType();
        bookRequest44.setBookTitle("hi!");
        bookRequest44.setBookTitle(",null");
        gui.RequestType requestType53 = null;
        gui.BookRequest bookRequest54 = new gui.BookRequest("", requestType53);
        bookRequest54.setBookTitle("");
        gui.RequestType requestType57 = null;
        bookRequest54.setRequestType(requestType57);
        java.lang.String str59 = bookRequest54.toCSVString();
        boolean boolean60 = bookRequest44.equals((java.lang.Object) str59);
        boolean boolean61 = bookRequest35.equals((java.lang.Object) str59);
        java.lang.String str62 = bookRequest35.getBookTitle();
        boolean boolean63 = bookRequest27.equals((java.lang.Object) bookRequest35);
        boolean boolean64 = bookRequest2.equals((java.lang.Object) bookRequest27);
        java.lang.Class<?> wildcardClass65 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertNull(requestType24);
        org.junit.Assert.assertNull(requestType30);
        org.junit.Assert.assertNull(requestType47);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + ",null" + "'", str59, ",null");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType13 = null;
        bookRequest10.setRequestType(requestType13);
        bookRequest10.setBookTitle("hi!");
        gui.RequestType requestType18 = null;
        gui.BookRequest bookRequest19 = new gui.BookRequest("", requestType18);
        gui.RequestType requestType20 = null;
        bookRequest19.setRequestType(requestType20);
        gui.RequestType requestType22 = bookRequest19.getRequestType();
        bookRequest19.setBookTitle("hi!");
        bookRequest19.setBookTitle(",null");
        gui.RequestType requestType28 = null;
        gui.BookRequest bookRequest29 = new gui.BookRequest("", requestType28);
        bookRequest29.setBookTitle("");
        gui.RequestType requestType32 = null;
        bookRequest29.setRequestType(requestType32);
        java.lang.String str34 = bookRequest29.toCSVString();
        boolean boolean35 = bookRequest19.equals((java.lang.Object) str34);
        boolean boolean36 = bookRequest10.equals((java.lang.Object) str34);
        java.lang.String str37 = bookRequest10.getBookTitle();
        boolean boolean38 = bookRequest2.equals((java.lang.Object) bookRequest10);
        java.lang.String str39 = bookRequest2.getBookTitle();
        gui.RequestType requestType40 = null;
        bookRequest2.setRequestType(requestType40);
        java.lang.Class<?> wildcardClass42 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertNull(requestType22);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ",null" + "'", str34, ",null");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType13 = null;
        bookRequest10.setRequestType(requestType13);
        bookRequest10.setBookTitle("hi!");
        boolean boolean17 = bookRequest2.equals((java.lang.Object) bookRequest10);
        gui.RequestType requestType18 = null;
        bookRequest2.setRequestType(requestType18);
        java.lang.String str20 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ",null,null" + "'", str20, ",null,null");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        bookRequest2.setBookTitle("");
        java.lang.Class<?> wildcardClass14 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        bookRequest13.setBookTitle("");
        gui.RequestType requestType16 = null;
        bookRequest13.setRequestType(requestType16);
        gui.RequestType requestType18 = null;
        bookRequest13.setRequestType(requestType18);
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = bookRequest2.getRequestType();
        gui.RequestType requestType22 = null;
        bookRequest2.setRequestType(requestType22);
        java.lang.Class<?> wildcardClass24 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("");
        java.lang.Class<?> wildcardClass6 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType4 = null;
        gui.BookRequest bookRequest5 = new gui.BookRequest("", requestType4);
        bookRequest5.setBookTitle("");
        gui.RequestType requestType8 = null;
        bookRequest5.setRequestType(requestType8);
        java.lang.Class<?> wildcardClass10 = bookRequest5.getClass();
        boolean boolean11 = bookRequest2.equals((java.lang.Object) bookRequest5);
        bookRequest5.setBookTitle("");
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.getBookTitle();
        java.lang.String str6 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass7 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        gui.BookRequest bookRequest9 = new gui.BookRequest("", requestType8);
        java.lang.String str10 = bookRequest9.getBookTitle();
        java.lang.String str11 = bookRequest9.toCSVString();
        boolean boolean12 = bookRequest2.equals((java.lang.Object) bookRequest9);
        gui.RequestType requestType13 = null;
        bookRequest2.setRequestType(requestType13);
        gui.RequestType requestType15 = null;
        bookRequest2.setRequestType(requestType15);
        java.lang.String str17 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!,null" + "'", str17, "hi!,null");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        java.lang.String str6 = bookRequest2.toCSVString();
        gui.RequestType requestType7 = bookRequest2.getRequestType();
        java.lang.Class<?> wildcardClass8 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertNull(requestType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        java.lang.Class<?> wildcardClass3 = bookRequest2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType11 = null;
        bookRequest2.setRequestType(requestType11);
        gui.RequestType requestType13 = null;
        bookRequest2.setRequestType(requestType13);
        java.lang.String str15 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass16 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!,null" + "'", str15, "hi!,null");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        gui.RequestType requestType8 = bookRequest2.getRequestType();
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertNull(requestType8);
        org.junit.Assert.assertNull(requestType9);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType4 = null;
        gui.BookRequest bookRequest5 = new gui.BookRequest("", requestType4);
        java.lang.String str6 = bookRequest5.toCSVString();
        java.lang.String str7 = bookRequest5.toCSVString();
        gui.RequestType requestType8 = bookRequest5.getRequestType();
        bookRequest5.setBookTitle("");
        java.lang.String str11 = bookRequest5.getBookTitle();
        bookRequest5.setBookTitle("hi!,null");
        boolean boolean14 = bookRequest2.equals((java.lang.Object) bookRequest5);
        bookRequest5.setBookTitle("hi!,null,null,null");
        bookRequest5.setBookTitle("hi!,null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertNull(requestType8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType30 = null;
        gui.BookRequest bookRequest31 = new gui.BookRequest("", requestType30);
        java.lang.String str32 = bookRequest31.getBookTitle();
        gui.RequestType requestType33 = null;
        bookRequest31.setRequestType(requestType33);
        java.lang.String str35 = bookRequest31.getBookTitle();
        boolean boolean36 = bookRequest2.equals((java.lang.Object) str35);
        gui.RequestType requestType37 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("");
        java.lang.String str40 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass41 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(requestType37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ",null" + "'", str40, ",null");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        bookRequest12.setBookTitle("");
        gui.RequestType requestType15 = null;
        bookRequest12.setRequestType(requestType15);
        java.lang.String str17 = bookRequest12.toCSVString();
        boolean boolean18 = bookRequest2.equals((java.lang.Object) str17);
        bookRequest2.setBookTitle(",null");
        java.lang.Class<?> wildcardClass21 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ",null" + "'", str17, ",null");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        bookRequest21.setBookTitle("hi!");
        boolean boolean28 = bookRequest13.equals((java.lang.Object) bookRequest21);
        boolean boolean29 = bookRequest2.equals((java.lang.Object) boolean28);
        gui.RequestType requestType31 = null;
        gui.BookRequest bookRequest32 = new gui.BookRequest("", requestType31);
        boolean boolean33 = bookRequest2.equals((java.lang.Object) "");
        java.lang.Class<?> wildcardClass34 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        boolean boolean8 = bookRequest2.equals((java.lang.Object) (-1.0d));
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass10 = bookRequest2.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        boolean boolean9 = bookRequest2.equals((java.lang.Object) (short) 0);
        bookRequest2.setBookTitle("hi!,null,null");
        java.lang.String str12 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!,null,null" + "'", str12, "hi!,null,null");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        java.lang.String str13 = bookRequest12.getBookTitle();
        java.lang.String str14 = bookRequest12.toCSVString();
        gui.RequestType requestType15 = null;
        bookRequest12.setRequestType(requestType15);
        gui.RequestType requestType17 = null;
        bookRequest12.setRequestType(requestType17);
        bookRequest12.setBookTitle("hi!");
        boolean boolean21 = bookRequest2.equals((java.lang.Object) bookRequest12);
        java.lang.Class<?> wildcardClass22 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        gui.RequestType requestType14 = null;
        bookRequest13.setRequestType(requestType14);
        java.lang.String str16 = bookRequest13.toCSVString();
        gui.RequestType requestType17 = null;
        bookRequest13.setRequestType(requestType17);
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        gui.RequestType requestType23 = null;
        bookRequest22.setRequestType(requestType23);
        gui.RequestType requestType25 = bookRequest22.getRequestType();
        java.lang.String str26 = bookRequest22.toCSVString();
        java.lang.Class<?> wildcardClass27 = bookRequest22.getClass();
        boolean boolean28 = bookRequest2.equals((java.lang.Object) bookRequest22);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(requestType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null,null");
        java.lang.String str12 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null,null,null" + "'", str12, ",null,null,null");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        java.lang.String str5 = bookRequest2.getBookTitle();
        java.lang.String str6 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass11 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        bookRequest13.setBookTitle("");
        gui.RequestType requestType16 = null;
        bookRequest13.setRequestType(requestType16);
        gui.RequestType requestType18 = null;
        bookRequest13.setRequestType(requestType18);
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = bookRequest2.getRequestType();
        gui.RequestType requestType22 = null;
        bookRequest2.setRequestType(requestType22);
        boolean boolean25 = bookRequest2.equals((java.lang.Object) 0);
        java.lang.Class<?> wildcardClass26 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        java.lang.String str13 = bookRequest12.getBookTitle();
        java.lang.String str14 = bookRequest12.toCSVString();
        gui.RequestType requestType15 = null;
        bookRequest12.setRequestType(requestType15);
        gui.RequestType requestType17 = null;
        bookRequest12.setRequestType(requestType17);
        bookRequest12.setBookTitle("hi!");
        boolean boolean21 = bookRequest2.equals((java.lang.Object) bookRequest12);
        java.lang.String str22 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass23 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!,null" + "'", str22, "hi!,null");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        java.lang.String str6 = bookRequest2.toCSVString();
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass9 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",null" + "'", str8, ",null");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        gui.RequestType requestType14 = null;
        bookRequest13.setRequestType(requestType14);
        java.lang.String str16 = bookRequest13.toCSVString();
        gui.RequestType requestType17 = null;
        bookRequest13.setRequestType(requestType17);
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        java.lang.String str23 = bookRequest22.getBookTitle();
        java.lang.String str24 = bookRequest22.getBookTitle();
        boolean boolean25 = bookRequest13.equals((java.lang.Object) str24);
        bookRequest13.setBookTitle(",null,null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle("");
        java.lang.String str13 = bookRequest2.toCSVString();
        java.lang.String str14 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",null" + "'", str13, ",null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        boolean boolean11 = bookRequest2.equals((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass12 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.toCSVString();
        java.lang.String str9 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",null" + "'", str8, ",null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        java.lang.String str6 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass7 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        gui.RequestType requestType14 = null;
        bookRequest13.setRequestType(requestType14);
        java.lang.String str16 = bookRequest13.toCSVString();
        gui.RequestType requestType17 = null;
        bookRequest13.setRequestType(requestType17);
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        java.lang.String str23 = bookRequest22.getBookTitle();
        java.lang.String str24 = bookRequest22.getBookTitle();
        boolean boolean25 = bookRequest13.equals((java.lang.Object) str24);
        java.lang.String str26 = bookRequest13.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        bookRequest21.setBookTitle("hi!");
        boolean boolean28 = bookRequest13.equals((java.lang.Object) bookRequest21);
        boolean boolean29 = bookRequest2.equals((java.lang.Object) boolean28);
        java.lang.Class<?> wildcardClass30 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        bookRequest2.setBookTitle(",null");
        java.lang.Class<?> wildcardClass14 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        boolean boolean10 = bookRequest2.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        bookRequest2.setBookTitle(",null");
        java.lang.Class<?> wildcardClass22 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        java.lang.String str10 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass11 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!,null" + "'", str10, "hi!,null");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        java.lang.String str13 = bookRequest12.getBookTitle();
        java.lang.String str14 = bookRequest12.toCSVString();
        gui.RequestType requestType15 = null;
        bookRequest12.setRequestType(requestType15);
        gui.RequestType requestType17 = null;
        bookRequest12.setRequestType(requestType17);
        bookRequest12.setBookTitle("hi!");
        boolean boolean21 = bookRequest2.equals((java.lang.Object) bookRequest12);
        gui.RequestType requestType22 = null;
        bookRequest2.setRequestType(requestType22);
        java.lang.Class<?> wildcardClass24 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        boolean boolean10 = bookRequest2.equals((java.lang.Object) 10.0d);
        java.lang.Class<?> wildcardClass11 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        bookRequest13.setBookTitle("");
        gui.RequestType requestType16 = null;
        bookRequest13.setRequestType(requestType16);
        gui.RequestType requestType18 = null;
        bookRequest13.setRequestType(requestType18);
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = bookRequest2.getRequestType();
        gui.RequestType requestType22 = null;
        bookRequest2.setRequestType(requestType22);
        java.lang.String str24 = bookRequest2.getBookTitle();
        java.lang.String str25 = bookRequest2.toCSVString();
        gui.RequestType requestType26 = null;
        bookRequest2.setRequestType(requestType26);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!,null" + "'", str25, "hi!,null");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        bookRequest2.setBookTitle(",null,null");
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.toCSVString();
        bookRequest14.setBookTitle("hi!");
        gui.RequestType requestType18 = null;
        bookRequest14.setRequestType(requestType18);
        java.lang.String str20 = bookRequest14.getBookTitle();
        java.lang.String str21 = bookRequest14.toCSVString();
        java.lang.String str22 = bookRequest14.getBookTitle();
        gui.RequestType requestType24 = null;
        gui.BookRequest bookRequest25 = new gui.BookRequest("", requestType24);
        bookRequest25.setBookTitle("");
        gui.RequestType requestType28 = null;
        bookRequest25.setRequestType(requestType28);
        gui.RequestType requestType30 = null;
        bookRequest25.setRequestType(requestType30);
        boolean boolean32 = bookRequest14.equals((java.lang.Object) bookRequest25);
        gui.RequestType requestType33 = bookRequest14.getRequestType();
        gui.RequestType requestType34 = null;
        bookRequest14.setRequestType(requestType34);
        gui.RequestType requestType36 = bookRequest14.getRequestType();
        boolean boolean37 = bookRequest2.equals((java.lang.Object) bookRequest14);
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType40 = null;
        bookRequest2.setRequestType(requestType40);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!,null" + "'", str21, "hi!,null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(requestType33);
        org.junit.Assert.assertNull(requestType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        gui.RequestType requestType11 = bookRequest2.getRequestType();
        java.lang.String str12 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass13 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertNull(requestType10);
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null,null" + "'", str12, ",null,null");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType30 = null;
        gui.BookRequest bookRequest31 = new gui.BookRequest("", requestType30);
        java.lang.String str32 = bookRequest31.getBookTitle();
        gui.RequestType requestType33 = null;
        bookRequest31.setRequestType(requestType33);
        java.lang.String str35 = bookRequest31.getBookTitle();
        boolean boolean36 = bookRequest2.equals((java.lang.Object) str35);
        bookRequest2.setBookTitle(",null,null");
        java.lang.String str39 = bookRequest2.getBookTitle();
        gui.RequestType requestType41 = null;
        gui.BookRequest bookRequest42 = new gui.BookRequest("", requestType41);
        java.lang.String str43 = bookRequest42.toCSVString();
        bookRequest42.setBookTitle("hi!");
        bookRequest42.setBookTitle(",null");
        gui.RequestType requestType48 = null;
        bookRequest42.setRequestType(requestType48);
        gui.RequestType requestType50 = null;
        bookRequest42.setRequestType(requestType50);
        boolean boolean52 = bookRequest2.equals((java.lang.Object) bookRequest42);
        java.lang.Class<?> wildcardClass53 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + ",null,null" + "'", str39, ",null,null");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + ",null" + "'", str43, ",null");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        gui.RequestType requestType11 = bookRequest2.getRequestType();
        java.lang.String str12 = bookRequest2.toCSVString();
        gui.RequestType requestType13 = null;
        bookRequest2.setRequestType(requestType13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertNull(requestType10);
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null,null" + "'", str12, ",null,null");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        bookRequest13.setBookTitle("");
        gui.RequestType requestType16 = null;
        bookRequest13.setRequestType(requestType16);
        gui.RequestType requestType18 = null;
        bookRequest13.setRequestType(requestType18);
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = bookRequest2.getRequestType();
        gui.RequestType requestType22 = null;
        bookRequest2.setRequestType(requestType22);
        gui.RequestType requestType24 = bookRequest2.getRequestType();
        gui.RequestType requestType26 = null;
        gui.BookRequest bookRequest27 = new gui.BookRequest("", requestType26);
        gui.RequestType requestType28 = null;
        bookRequest27.setRequestType(requestType28);
        gui.RequestType requestType30 = bookRequest27.getRequestType();
        bookRequest27.setBookTitle("hi!");
        gui.RequestType requestType34 = null;
        gui.BookRequest bookRequest35 = new gui.BookRequest("", requestType34);
        bookRequest35.setBookTitle("");
        gui.RequestType requestType38 = null;
        bookRequest35.setRequestType(requestType38);
        bookRequest35.setBookTitle("hi!");
        gui.RequestType requestType43 = null;
        gui.BookRequest bookRequest44 = new gui.BookRequest("", requestType43);
        gui.RequestType requestType45 = null;
        bookRequest44.setRequestType(requestType45);
        gui.RequestType requestType47 = bookRequest44.getRequestType();
        bookRequest44.setBookTitle("hi!");
        bookRequest44.setBookTitle(",null");
        gui.RequestType requestType53 = null;
        gui.BookRequest bookRequest54 = new gui.BookRequest("", requestType53);
        bookRequest54.setBookTitle("");
        gui.RequestType requestType57 = null;
        bookRequest54.setRequestType(requestType57);
        java.lang.String str59 = bookRequest54.toCSVString();
        boolean boolean60 = bookRequest44.equals((java.lang.Object) str59);
        boolean boolean61 = bookRequest35.equals((java.lang.Object) str59);
        java.lang.String str62 = bookRequest35.getBookTitle();
        boolean boolean63 = bookRequest27.equals((java.lang.Object) bookRequest35);
        boolean boolean64 = bookRequest2.equals((java.lang.Object) bookRequest27);
        gui.RequestType requestType66 = null;
        gui.BookRequest bookRequest67 = new gui.BookRequest("", requestType66);
        java.lang.String str68 = bookRequest67.getBookTitle();
        gui.RequestType requestType69 = bookRequest67.getRequestType();
        bookRequest67.setBookTitle("hi!");
        gui.RequestType requestType73 = null;
        gui.BookRequest bookRequest74 = new gui.BookRequest("", requestType73);
        java.lang.String str75 = bookRequest74.getBookTitle();
        java.lang.String str76 = bookRequest74.toCSVString();
        boolean boolean77 = bookRequest67.equals((java.lang.Object) bookRequest74);
        gui.RequestType requestType78 = null;
        bookRequest67.setRequestType(requestType78);
        gui.RequestType requestType80 = bookRequest67.getRequestType();
        boolean boolean81 = bookRequest27.equals((java.lang.Object) bookRequest67);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertNull(requestType24);
        org.junit.Assert.assertNull(requestType30);
        org.junit.Assert.assertNull(requestType47);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + ",null" + "'", str59, ",null");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNull(requestType69);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + ",null" + "'", str76, ",null");
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(requestType80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        java.lang.String str6 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass7 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        boolean boolean10 = bookRequest2.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType20 = null;
        bookRequest2.setRequestType(requestType20);
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType24 = null;
        bookRequest2.setRequestType(requestType24);
        java.lang.String str26 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass27 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!,null,null" + "'", str26, "hi!,null,null");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        java.lang.String str29 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null,null");
        java.lang.String str32 = bookRequest2.getBookTitle();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!,null,null" + "'", str32, "hi!,null,null");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType15 = null;
        gui.BookRequest bookRequest16 = new gui.BookRequest("", requestType15);
        java.lang.String str17 = bookRequest16.toCSVString();
        bookRequest16.setBookTitle("hi!");
        gui.RequestType requestType20 = null;
        bookRequest16.setRequestType(requestType20);
        java.lang.String str22 = bookRequest16.getBookTitle();
        java.lang.String str23 = bookRequest16.toCSVString();
        java.lang.String str24 = bookRequest16.getBookTitle();
        java.lang.String str25 = bookRequest16.getBookTitle();
        gui.RequestType requestType26 = null;
        bookRequest16.setRequestType(requestType26);
        java.lang.Class<?> wildcardClass28 = bookRequest16.getClass();
        boolean boolean29 = bookRequest2.equals((java.lang.Object) bookRequest16);
        java.lang.String str30 = bookRequest16.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ",null" + "'", str17, ",null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!,null" + "'", str23, "hi!,null");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!,null" + "'", str30, "hi!,null");
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        bookRequest2.setBookTitle(",null");
        java.lang.String str31 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass32 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ",null,null" + "'", str31, ",null,null");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        java.lang.String str5 = bookRequest2.getBookTitle();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        java.lang.String str10 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass11 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        bookRequest2.setBookTitle(",null,null");
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.toCSVString();
        bookRequest14.setBookTitle("hi!");
        gui.RequestType requestType18 = null;
        bookRequest14.setRequestType(requestType18);
        java.lang.String str20 = bookRequest14.getBookTitle();
        java.lang.String str21 = bookRequest14.toCSVString();
        java.lang.String str22 = bookRequest14.getBookTitle();
        gui.RequestType requestType24 = null;
        gui.BookRequest bookRequest25 = new gui.BookRequest("", requestType24);
        bookRequest25.setBookTitle("");
        gui.RequestType requestType28 = null;
        bookRequest25.setRequestType(requestType28);
        gui.RequestType requestType30 = null;
        bookRequest25.setRequestType(requestType30);
        boolean boolean32 = bookRequest14.equals((java.lang.Object) bookRequest25);
        gui.RequestType requestType33 = bookRequest14.getRequestType();
        gui.RequestType requestType34 = null;
        bookRequest14.setRequestType(requestType34);
        gui.RequestType requestType36 = bookRequest14.getRequestType();
        boolean boolean37 = bookRequest2.equals((java.lang.Object) bookRequest14);
        gui.RequestType requestType39 = null;
        gui.BookRequest bookRequest40 = new gui.BookRequest("", requestType39);
        bookRequest40.setBookTitle("");
        gui.RequestType requestType44 = null;
        gui.BookRequest bookRequest45 = new gui.BookRequest("", requestType44);
        bookRequest45.setBookTitle("");
        gui.RequestType requestType48 = null;
        bookRequest45.setRequestType(requestType48);
        gui.RequestType requestType50 = null;
        bookRequest45.setRequestType(requestType50);
        bookRequest45.setBookTitle("hi!");
        gui.RequestType requestType54 = bookRequest45.getRequestType();
        boolean boolean55 = bookRequest40.equals((java.lang.Object) bookRequest45);
        bookRequest40.setBookTitle("hi!,null");
        boolean boolean58 = bookRequest14.equals((java.lang.Object) "hi!,null");
        gui.RequestType requestType59 = bookRequest14.getRequestType();
        java.lang.Class<?> wildcardClass60 = bookRequest14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!,null" + "'", str21, "hi!,null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(requestType33);
        org.junit.Assert.assertNull(requestType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(requestType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(requestType59);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        boolean boolean9 = bookRequest2.equals((java.lang.Object) (short) 0);
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        gui.RequestType requestType14 = null;
        gui.BookRequest bookRequest15 = new gui.BookRequest("", requestType14);
        gui.RequestType requestType16 = null;
        bookRequest15.setRequestType(requestType16);
        java.lang.String str18 = bookRequest15.toCSVString();
        gui.RequestType requestType19 = null;
        bookRequest15.setRequestType(requestType19);
        java.lang.String str21 = bookRequest15.getBookTitle();
        boolean boolean23 = bookRequest15.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType25 = null;
        gui.BookRequest bookRequest26 = new gui.BookRequest("", requestType25);
        java.lang.String str27 = bookRequest26.toCSVString();
        bookRequest26.setBookTitle("hi!");
        bookRequest26.setBookTitle(",null");
        boolean boolean32 = bookRequest15.equals((java.lang.Object) bookRequest26);
        gui.RequestType requestType33 = null;
        bookRequest15.setRequestType(requestType33);
        bookRequest15.setBookTitle("hi!,null,null");
        java.lang.String str37 = bookRequest15.getBookTitle();
        boolean boolean38 = bookRequest2.equals((java.lang.Object) str37);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(requestType12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ",null" + "'", str18, ",null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ",null" + "'", str27, ",null");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!,null,null" + "'", str37, "hi!,null,null");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        gui.RequestType requestType14 = null;
        bookRequest13.setRequestType(requestType14);
        java.lang.String str16 = bookRequest13.toCSVString();
        gui.RequestType requestType17 = null;
        bookRequest13.setRequestType(requestType17);
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        java.lang.String str20 = bookRequest2.getBookTitle();
        java.lang.String str21 = bookRequest2.toCSVString();
        java.lang.String str22 = bookRequest2.toCSVString();
        gui.RequestType requestType23 = null;
        bookRequest2.setRequestType(requestType23);
        bookRequest2.setBookTitle(",null,null,null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!,null" + "'", str20, "hi!,null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!,null,null" + "'", str21, "hi!,null,null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!,null,null" + "'", str22, "hi!,null,null");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        java.lang.String str11 = bookRequest10.toCSVString();
        bookRequest10.setBookTitle("hi!");
        gui.RequestType requestType14 = null;
        bookRequest10.setRequestType(requestType14);
        java.lang.String str16 = bookRequest10.getBookTitle();
        java.lang.String str17 = bookRequest10.toCSVString();
        bookRequest10.setBookTitle("");
        boolean boolean20 = bookRequest2.equals((java.lang.Object) "");
        gui.RequestType requestType21 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertNull(requestType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!,null" + "'", str17, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(requestType21);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType30 = null;
        gui.BookRequest bookRequest31 = new gui.BookRequest("", requestType30);
        java.lang.String str32 = bookRequest31.getBookTitle();
        gui.RequestType requestType33 = null;
        bookRequest31.setRequestType(requestType33);
        java.lang.String str35 = bookRequest31.getBookTitle();
        boolean boolean36 = bookRequest2.equals((java.lang.Object) str35);
        gui.RequestType requestType37 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("");
        java.lang.String str40 = bookRequest2.getBookTitle();
        gui.RequestType requestType41 = bookRequest2.getRequestType();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(requestType37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(requestType41);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType4 = null;
        gui.BookRequest bookRequest5 = new gui.BookRequest("", requestType4);
        java.lang.String str6 = bookRequest5.toCSVString();
        bookRequest5.setBookTitle("hi!");
        gui.RequestType requestType9 = null;
        bookRequest5.setRequestType(requestType9);
        boolean boolean11 = bookRequest2.equals((java.lang.Object) requestType9);
        java.lang.Object obj12 = null;
        boolean boolean13 = bookRequest2.equals(obj12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        java.lang.String str29 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("");
        java.lang.String str32 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass33 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ",null" + "'", str32, ",null");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType11 = null;
        bookRequest2.setRequestType(requestType11);
        bookRequest2.setBookTitle("");
        java.lang.String str15 = bookRequest2.toCSVString();
        gui.RequestType requestType17 = null;
        gui.BookRequest bookRequest18 = new gui.BookRequest("", requestType17);
        bookRequest18.setBookTitle("");
        gui.RequestType requestType21 = null;
        bookRequest18.setRequestType(requestType21);
        gui.RequestType requestType23 = null;
        bookRequest18.setRequestType(requestType23);
        bookRequest18.setBookTitle("hi!");
        gui.RequestType requestType27 = null;
        bookRequest18.setRequestType(requestType27);
        bookRequest18.setBookTitle("");
        java.lang.Class<?> wildcardClass31 = bookRequest18.getClass();
        boolean boolean32 = bookRequest2.equals((java.lang.Object) bookRequest18);
        gui.RequestType requestType34 = null;
        gui.BookRequest bookRequest35 = new gui.BookRequest("", requestType34);
        bookRequest35.setBookTitle("");
        gui.RequestType requestType38 = null;
        bookRequest35.setRequestType(requestType38);
        java.lang.String str40 = bookRequest35.toCSVString();
        java.lang.String str41 = bookRequest35.getBookTitle();
        bookRequest35.setBookTitle("hi!,null");
        gui.RequestType requestType45 = null;
        gui.BookRequest bookRequest46 = new gui.BookRequest("", requestType45);
        gui.RequestType requestType47 = null;
        bookRequest46.setRequestType(requestType47);
        java.lang.String str49 = bookRequest46.toCSVString();
        gui.RequestType requestType50 = null;
        bookRequest46.setRequestType(requestType50);
        boolean boolean52 = bookRequest35.equals((java.lang.Object) bookRequest46);
        boolean boolean53 = bookRequest18.equals((java.lang.Object) boolean52);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ",null" + "'", str40, ",null");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + ",null" + "'", str49, ",null");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.toCSVString();
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        java.lang.String str12 = bookRequest11.toCSVString();
        bookRequest11.setBookTitle("hi!");
        gui.RequestType requestType15 = null;
        bookRequest11.setRequestType(requestType15);
        java.lang.String str17 = bookRequest11.toCSVString();
        boolean boolean18 = bookRequest2.equals((java.lang.Object) str17);
        java.lang.Class<?> wildcardClass19 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",null" + "'", str8, ",null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!,null" + "'", str17, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle("");
        java.lang.String str13 = bookRequest2.toCSVString();
        java.lang.String str14 = bookRequest2.toCSVString();
        gui.RequestType requestType15 = null;
        bookRequest2.setRequestType(requestType15);
        java.lang.String str17 = bookRequest2.toCSVString();
        java.lang.String str18 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",null" + "'", str13, ",null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ",null" + "'", str17, ",null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle(",null");
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass11 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null,null" + "'", str9, ",null,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        java.lang.Class<?> wildcardClass12 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.toCSVString();
        java.lang.String str6 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        gui.RequestType requestType9 = null;
        bookRequest2.setRequestType(requestType9);
        java.lang.Class<?> wildcardClass11 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        boolean boolean10 = bookRequest2.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        bookRequest13.setBookTitle(",null");
        bookRequest13.setBookTitle(",null");
        gui.RequestType requestType24 = bookRequest13.getRequestType();
        java.lang.Class<?> wildcardClass25 = bookRequest13.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(requestType24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        gui.RequestType requestType14 = null;
        bookRequest13.setRequestType(requestType14);
        java.lang.String str16 = bookRequest13.toCSVString();
        gui.RequestType requestType17 = null;
        bookRequest13.setRequestType(requestType17);
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        java.lang.String str20 = bookRequest2.getBookTitle();
        java.lang.String str21 = bookRequest2.toCSVString();
        java.lang.String str22 = bookRequest2.toCSVString();
        gui.RequestType requestType23 = null;
        bookRequest2.setRequestType(requestType23);
        java.lang.Class<?> wildcardClass25 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!,null" + "'", str20, "hi!,null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!,null,null" + "'", str21, "hi!,null,null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!,null,null" + "'", str22, "hi!,null,null");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType11 = null;
        bookRequest2.setRequestType(requestType11);
        java.lang.Class<?> wildcardClass13 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertNull(requestType6);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null");
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        java.lang.String str12 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null,null" + "'", str7, ",null,null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null,null" + "'", str12, ",null,null");
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType4 = null;
        gui.BookRequest bookRequest5 = new gui.BookRequest("", requestType4);
        java.lang.String str6 = bookRequest5.toCSVString();
        java.lang.String str7 = bookRequest5.toCSVString();
        gui.RequestType requestType8 = bookRequest5.getRequestType();
        bookRequest5.setBookTitle("");
        java.lang.String str11 = bookRequest5.getBookTitle();
        bookRequest5.setBookTitle("hi!,null");
        boolean boolean14 = bookRequest2.equals((java.lang.Object) bookRequest5);
        bookRequest2.setBookTitle("hi!,null,null");
        boolean boolean18 = bookRequest2.equals((java.lang.Object) (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertNull(requestType8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("");
        java.lang.String str7 = bookRequest2.toCSVString();
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        bookRequest2.setBookTitle(",null");
        bookRequest2.setBookTitle("hi!,null");
        java.lang.String str33 = bookRequest2.toCSVString();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!,null,null" + "'", str33, "hi!,null,null");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        bookRequest2.setBookTitle("hi!,null,null,null");
        org.junit.Assert.assertNull(requestType5);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass5 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass10 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        java.lang.String str11 = bookRequest10.toCSVString();
        bookRequest10.setBookTitle("hi!");
        gui.RequestType requestType14 = null;
        bookRequest10.setRequestType(requestType14);
        java.lang.String str16 = bookRequest10.toCSVString();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) str16);
        bookRequest2.setBookTitle(",null,null");
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        java.lang.String str23 = bookRequest22.toCSVString();
        bookRequest22.setBookTitle("hi!");
        gui.RequestType requestType26 = null;
        bookRequest22.setRequestType(requestType26);
        java.lang.String str28 = bookRequest22.getBookTitle();
        java.lang.String str29 = bookRequest22.toCSVString();
        gui.RequestType requestType31 = null;
        gui.BookRequest bookRequest32 = new gui.BookRequest("", requestType31);
        java.lang.String str33 = bookRequest32.getBookTitle();
        java.lang.String str34 = bookRequest32.toCSVString();
        gui.RequestType requestType35 = null;
        bookRequest32.setRequestType(requestType35);
        gui.RequestType requestType37 = null;
        bookRequest32.setRequestType(requestType37);
        bookRequest32.setBookTitle("hi!");
        boolean boolean41 = bookRequest22.equals((java.lang.Object) bookRequest32);
        gui.RequestType requestType43 = null;
        gui.BookRequest bookRequest44 = new gui.BookRequest("", requestType43);
        bookRequest44.setBookTitle("");
        gui.RequestType requestType47 = null;
        bookRequest44.setRequestType(requestType47);
        gui.RequestType requestType49 = null;
        bookRequest44.setRequestType(requestType49);
        bookRequest44.setBookTitle("hi!");
        boolean boolean53 = bookRequest32.equals((java.lang.Object) bookRequest44);
        gui.RequestType requestType54 = bookRequest32.getRequestType();
        boolean boolean55 = bookRequest2.equals((java.lang.Object) bookRequest32);
        java.lang.String str56 = bookRequest32.getBookTitle();
        gui.RequestType requestType57 = bookRequest32.getRequestType();
        java.lang.Class<?> wildcardClass58 = bookRequest32.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!,null" + "'", str16, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ",null" + "'", str23, ",null");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!,null" + "'", str29, "hi!,null");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ",null" + "'", str34, ",null");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(requestType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNull(requestType57);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        gui.RequestType requestType14 = null;
        bookRequest13.setRequestType(requestType14);
        java.lang.String str16 = bookRequest13.toCSVString();
        gui.RequestType requestType17 = null;
        bookRequest13.setRequestType(requestType17);
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        java.lang.String str20 = bookRequest2.getBookTitle();
        java.lang.String str21 = bookRequest2.toCSVString();
        gui.RequestType requestType22 = bookRequest2.getRequestType();
        gui.RequestType requestType24 = null;
        gui.BookRequest bookRequest25 = new gui.BookRequest("", requestType24);
        java.lang.String str26 = bookRequest25.getBookTitle();
        java.lang.String str27 = bookRequest25.toCSVString();
        gui.RequestType requestType28 = null;
        bookRequest25.setRequestType(requestType28);
        gui.RequestType requestType30 = null;
        bookRequest25.setRequestType(requestType30);
        bookRequest25.setBookTitle("hi!");
        bookRequest25.setBookTitle("");
        java.lang.String str36 = bookRequest25.toCSVString();
        gui.RequestType requestType38 = null;
        gui.BookRequest bookRequest39 = new gui.BookRequest("", requestType38);
        gui.RequestType requestType40 = null;
        bookRequest39.setRequestType(requestType40);
        java.lang.String str42 = bookRequest39.toCSVString();
        gui.RequestType requestType43 = null;
        bookRequest39.setRequestType(requestType43);
        java.lang.String str45 = bookRequest39.getBookTitle();
        boolean boolean47 = bookRequest39.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType49 = null;
        gui.BookRequest bookRequest50 = new gui.BookRequest("", requestType49);
        java.lang.String str51 = bookRequest50.toCSVString();
        bookRequest50.setBookTitle("hi!");
        bookRequest50.setBookTitle(",null");
        boolean boolean56 = bookRequest39.equals((java.lang.Object) bookRequest50);
        gui.RequestType requestType57 = null;
        bookRequest39.setRequestType(requestType57);
        boolean boolean59 = bookRequest25.equals((java.lang.Object) bookRequest39);
        boolean boolean60 = bookRequest2.equals((java.lang.Object) bookRequest25);
        java.lang.String str61 = bookRequest25.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!,null" + "'", str20, "hi!,null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!,null,null" + "'", str21, "hi!,null,null");
        org.junit.Assert.assertNull(requestType22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ",null" + "'", str27, ",null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ",null" + "'", str36, ",null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + ",null" + "'", str42, ",null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + ",null" + "'", str51, ",null");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + ",null" + "'", str61, ",null");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        bookRequest2.setBookTitle(",null");
        java.lang.Class<?> wildcardClass7 = bookRequest2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = requestType9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(requestType9);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType6 = null;
        gui.BookRequest bookRequest7 = new gui.BookRequest("", requestType6);
        bookRequest7.setBookTitle("");
        gui.RequestType requestType10 = null;
        bookRequest7.setRequestType(requestType10);
        gui.RequestType requestType12 = null;
        bookRequest7.setRequestType(requestType12);
        bookRequest7.setBookTitle("hi!");
        gui.RequestType requestType16 = bookRequest7.getRequestType();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) bookRequest7);
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType20 = bookRequest2.getRequestType();
        gui.RequestType requestType21 = null;
        bookRequest2.setRequestType(requestType21);
        bookRequest2.setBookTitle("hi!,null,null");
        org.junit.Assert.assertNull(requestType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(requestType20);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.getBookTitle();
        java.lang.String str16 = bookRequest14.getBookTitle();
        bookRequest14.setBookTitle(",null");
        gui.RequestType requestType19 = null;
        bookRequest14.setRequestType(requestType19);
        boolean boolean21 = bookRequest2.equals((java.lang.Object) requestType19);
        gui.RequestType requestType22 = null;
        bookRequest2.setRequestType(requestType22);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType26 = bookRequest2.getRequestType();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(requestType26);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null,null");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        java.lang.String str11 = bookRequest10.toCSVString();
        bookRequest10.setBookTitle("hi!");
        bookRequest10.setBookTitle(",null");
        gui.RequestType requestType17 = null;
        gui.BookRequest bookRequest18 = new gui.BookRequest("", requestType17);
        bookRequest18.setBookTitle("");
        gui.RequestType requestType21 = null;
        bookRequest18.setRequestType(requestType21);
        bookRequest18.setBookTitle("hi!");
        boolean boolean25 = bookRequest10.equals((java.lang.Object) bookRequest18);
        boolean boolean26 = bookRequest2.equals((java.lang.Object) bookRequest18);
        gui.RequestType requestType28 = null;
        gui.BookRequest bookRequest29 = new gui.BookRequest("", requestType28);
        bookRequest29.setBookTitle("");
        gui.RequestType requestType32 = null;
        bookRequest29.setRequestType(requestType32);
        gui.RequestType requestType34 = null;
        bookRequest29.setRequestType(requestType34);
        bookRequest29.setBookTitle("hi!");
        gui.RequestType requestType38 = null;
        bookRequest29.setRequestType(requestType38);
        java.lang.Class<?> wildcardClass40 = bookRequest29.getClass();
        boolean boolean41 = bookRequest18.equals((java.lang.Object) bookRequest29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        bookRequest13.setBookTitle("");
        gui.RequestType requestType16 = null;
        bookRequest13.setRequestType(requestType16);
        gui.RequestType requestType18 = null;
        bookRequest13.setRequestType(requestType18);
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = bookRequest2.getRequestType();
        gui.RequestType requestType22 = null;
        bookRequest2.setRequestType(requestType22);
        gui.RequestType requestType24 = bookRequest2.getRequestType();
        gui.RequestType requestType26 = null;
        gui.BookRequest bookRequest27 = new gui.BookRequest("", requestType26);
        gui.RequestType requestType28 = null;
        bookRequest27.setRequestType(requestType28);
        gui.RequestType requestType30 = bookRequest27.getRequestType();
        bookRequest27.setBookTitle("hi!");
        gui.RequestType requestType34 = null;
        gui.BookRequest bookRequest35 = new gui.BookRequest("", requestType34);
        bookRequest35.setBookTitle("");
        gui.RequestType requestType38 = null;
        bookRequest35.setRequestType(requestType38);
        bookRequest35.setBookTitle("hi!");
        gui.RequestType requestType43 = null;
        gui.BookRequest bookRequest44 = new gui.BookRequest("", requestType43);
        gui.RequestType requestType45 = null;
        bookRequest44.setRequestType(requestType45);
        gui.RequestType requestType47 = bookRequest44.getRequestType();
        bookRequest44.setBookTitle("hi!");
        bookRequest44.setBookTitle(",null");
        gui.RequestType requestType53 = null;
        gui.BookRequest bookRequest54 = new gui.BookRequest("", requestType53);
        bookRequest54.setBookTitle("");
        gui.RequestType requestType57 = null;
        bookRequest54.setRequestType(requestType57);
        java.lang.String str59 = bookRequest54.toCSVString();
        boolean boolean60 = bookRequest44.equals((java.lang.Object) str59);
        boolean boolean61 = bookRequest35.equals((java.lang.Object) str59);
        java.lang.String str62 = bookRequest35.getBookTitle();
        boolean boolean63 = bookRequest27.equals((java.lang.Object) bookRequest35);
        boolean boolean64 = bookRequest2.equals((java.lang.Object) bookRequest27);
        gui.RequestType requestType65 = bookRequest2.getRequestType();
        java.lang.Class<?> wildcardClass66 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertNull(requestType24);
        org.junit.Assert.assertNull(requestType30);
        org.junit.Assert.assertNull(requestType47);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + ",null" + "'", str59, ",null");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(requestType65);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType30 = null;
        gui.BookRequest bookRequest31 = new gui.BookRequest("", requestType30);
        java.lang.String str32 = bookRequest31.getBookTitle();
        gui.RequestType requestType33 = null;
        bookRequest31.setRequestType(requestType33);
        java.lang.String str35 = bookRequest31.getBookTitle();
        boolean boolean36 = bookRequest2.equals((java.lang.Object) str35);
        gui.RequestType requestType37 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("");
        java.lang.String str40 = bookRequest2.getBookTitle();
        java.lang.String str41 = bookRequest2.getBookTitle();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(requestType37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.getBookTitle();
        java.lang.String str6 = bookRequest2.getBookTitle();
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        bookRequest12.setBookTitle("");
        gui.RequestType requestType15 = null;
        bookRequest12.setRequestType(requestType15);
        java.lang.String str17 = bookRequest12.toCSVString();
        boolean boolean18 = bookRequest2.equals((java.lang.Object) str17);
        java.lang.String str19 = bookRequest2.toCSVString();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ",null" + "'", str17, ",null");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ",null,null" + "'", str19, ",null,null");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        bookRequest13.setBookTitle("");
        gui.RequestType requestType16 = null;
        bookRequest13.setRequestType(requestType16);
        gui.RequestType requestType18 = null;
        bookRequest13.setRequestType(requestType18);
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = bookRequest2.getRequestType();
        java.lang.String str22 = bookRequest2.getBookTitle();
        gui.RequestType requestType24 = null;
        gui.BookRequest bookRequest25 = new gui.BookRequest("", requestType24);
        gui.RequestType requestType26 = null;
        bookRequest25.setRequestType(requestType26);
        boolean boolean29 = bookRequest25.equals((java.lang.Object) 10L);
        gui.RequestType requestType30 = bookRequest25.getRequestType();
        boolean boolean31 = bookRequest2.equals((java.lang.Object) requestType30);
        java.lang.Class<?> wildcardClass32 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(requestType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!,null", requestType1);
        gui.RequestType requestType4 = null;
        gui.BookRequest bookRequest5 = new gui.BookRequest("", requestType4);
        bookRequest5.setBookTitle("");
        gui.RequestType requestType8 = null;
        bookRequest5.setRequestType(requestType8);
        bookRequest5.setBookTitle("hi!");
        java.lang.String str12 = bookRequest5.toCSVString();
        boolean boolean13 = bookRequest2.equals((java.lang.Object) str12);
        bookRequest2.setBookTitle(",null");
        java.lang.Class<?> wildcardClass16 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!,null" + "'", str12, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        gui.RequestType requestType14 = null;
        bookRequest13.setRequestType(requestType14);
        java.lang.String str16 = bookRequest13.toCSVString();
        gui.RequestType requestType17 = null;
        bookRequest13.setRequestType(requestType17);
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        java.lang.String str23 = bookRequest22.getBookTitle();
        java.lang.String str24 = bookRequest22.getBookTitle();
        boolean boolean25 = bookRequest13.equals((java.lang.Object) str24);
        gui.RequestType requestType26 = null;
        bookRequest13.setRequestType(requestType26);
        gui.RequestType requestType28 = null;
        bookRequest13.setRequestType(requestType28);
        java.lang.String str30 = bookRequest13.getBookTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null");
        java.lang.String str8 = bookRequest2.toCSVString();
        gui.RequestType requestType9 = null;
        bookRequest2.setRequestType(requestType9);
        bookRequest2.setBookTitle("hi!,null,null,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",null,null" + "'", str8, ",null,null");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.toCSVString();
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        bookRequest11.setBookTitle("");
        gui.RequestType requestType14 = null;
        bookRequest11.setRequestType(requestType14);
        gui.RequestType requestType16 = null;
        bookRequest11.setRequestType(requestType16);
        bookRequest11.setBookTitle("hi!");
        java.lang.Class<?> wildcardClass20 = bookRequest11.getClass();
        boolean boolean21 = bookRequest2.equals((java.lang.Object) bookRequest11);
        gui.RequestType requestType22 = null;
        bookRequest11.setRequestType(requestType22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",null" + "'", str8, ",null");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        gui.RequestType requestType14 = null;
        bookRequest13.setRequestType(requestType14);
        java.lang.String str16 = bookRequest13.toCSVString();
        gui.RequestType requestType17 = null;
        bookRequest13.setRequestType(requestType17);
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        java.lang.String str23 = bookRequest22.getBookTitle();
        java.lang.String str24 = bookRequest22.getBookTitle();
        boolean boolean25 = bookRequest13.equals((java.lang.Object) str24);
        gui.RequestType requestType26 = null;
        bookRequest13.setRequestType(requestType26);
        java.lang.String str28 = bookRequest13.toCSVString();
        java.lang.String str29 = bookRequest13.getBookTitle();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ",null" + "'", str28, ",null");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        bookRequest2.setBookTitle(",null");
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType33 = null;
        bookRequest2.setRequestType(requestType33);
        bookRequest2.setBookTitle(",null,null,null");
        gui.RequestType requestType38 = null;
        gui.BookRequest bookRequest39 = new gui.BookRequest("", requestType38);
        java.lang.String str40 = bookRequest39.toCSVString();
        bookRequest39.setBookTitle("hi!");
        gui.RequestType requestType43 = null;
        bookRequest39.setRequestType(requestType43);
        java.lang.String str45 = bookRequest39.getBookTitle();
        java.lang.String str46 = bookRequest39.getBookTitle();
        gui.RequestType requestType48 = null;
        gui.BookRequest bookRequest49 = new gui.BookRequest("", requestType48);
        gui.RequestType requestType50 = null;
        bookRequest49.setRequestType(requestType50);
        java.lang.String str52 = bookRequest49.toCSVString();
        gui.RequestType requestType53 = null;
        bookRequest49.setRequestType(requestType53);
        java.lang.String str55 = bookRequest49.getBookTitle();
        boolean boolean57 = bookRequest49.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType59 = null;
        gui.BookRequest bookRequest60 = new gui.BookRequest("", requestType59);
        java.lang.String str61 = bookRequest60.toCSVString();
        bookRequest60.setBookTitle("hi!");
        bookRequest60.setBookTitle(",null");
        boolean boolean66 = bookRequest49.equals((java.lang.Object) bookRequest60);
        bookRequest60.setBookTitle("hi!,null,null,null");
        boolean boolean69 = bookRequest39.equals((java.lang.Object) "hi!,null,null,null");
        boolean boolean70 = bookRequest2.equals((java.lang.Object) boolean69);
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ",null" + "'", str40, ",null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + ",null" + "'", str52, ",null");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + ",null" + "'", str61, ",null");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        java.lang.String str7 = bookRequest2.getBookTitle();
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertNull(requestType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        java.lang.Class<?> wildcardClass12 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        java.lang.String str4 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass5 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        gui.RequestType requestType8 = null;
        gui.BookRequest bookRequest9 = new gui.BookRequest("", requestType8);
        java.lang.String str10 = bookRequest9.getBookTitle();
        gui.RequestType requestType11 = bookRequest9.getRequestType();
        java.lang.String str12 = bookRequest9.toCSVString();
        gui.RequestType requestType13 = bookRequest9.getRequestType();
        java.lang.String str14 = bookRequest9.toCSVString();
        boolean boolean15 = bookRequest2.equals((java.lang.Object) bookRequest9);
        java.lang.Class<?> wildcardClass16 = bookRequest9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertNull(requestType6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
        org.junit.Assert.assertNull(requestType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("", requestType7);
        java.lang.String str9 = bookRequest8.toCSVString();
        java.lang.String str10 = bookRequest8.toCSVString();
        gui.RequestType requestType11 = bookRequest8.getRequestType();
        bookRequest8.setBookTitle("");
        gui.RequestType requestType14 = null;
        bookRequest8.setRequestType(requestType14);
        java.lang.String str16 = bookRequest8.getBookTitle();
        java.lang.Class<?> wildcardClass17 = bookRequest8.getClass();
        boolean boolean18 = bookRequest2.equals((java.lang.Object) wildcardClass17);
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        java.lang.String str22 = bookRequest21.getBookTitle();
        gui.RequestType requestType23 = null;
        bookRequest21.setRequestType(requestType23);
        java.lang.String str25 = bookRequest21.toCSVString();
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType28 = bookRequest2.getRequestType();
        gui.RequestType requestType29 = null;
        bookRequest2.setRequestType(requestType29);
        gui.RequestType requestType32 = null;
        gui.BookRequest bookRequest33 = new gui.BookRequest("hi!", requestType32);
        gui.RequestType requestType34 = bookRequest33.getRequestType();
        boolean boolean35 = bookRequest2.equals((java.lang.Object) requestType34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ",null" + "'", str25, ",null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(requestType28);
        org.junit.Assert.assertNull(requestType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        bookRequest12.setBookTitle("");
        gui.RequestType requestType15 = null;
        bookRequest12.setRequestType(requestType15);
        gui.RequestType requestType17 = null;
        bookRequest12.setRequestType(requestType17);
        bookRequest12.setBookTitle("hi!");
        gui.RequestType requestType21 = null;
        bookRequest12.setRequestType(requestType21);
        bookRequest12.setBookTitle("");
        java.lang.Class<?> wildcardClass25 = bookRequest12.getClass();
        boolean boolean26 = bookRequest2.equals((java.lang.Object) wildcardClass25);
        java.lang.String str27 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ",null" + "'", str27, ",null");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType13 = null;
        bookRequest10.setRequestType(requestType13);
        bookRequest10.setBookTitle("hi!");
        boolean boolean17 = bookRequest2.equals((java.lang.Object) bookRequest10);
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        bookRequest22.setBookTitle("");
        gui.RequestType requestType26 = null;
        gui.BookRequest bookRequest27 = new gui.BookRequest("", requestType26);
        bookRequest27.setBookTitle("");
        gui.RequestType requestType30 = null;
        bookRequest27.setRequestType(requestType30);
        gui.RequestType requestType32 = null;
        bookRequest27.setRequestType(requestType32);
        bookRequest27.setBookTitle("hi!");
        gui.RequestType requestType36 = bookRequest27.getRequestType();
        boolean boolean37 = bookRequest22.equals((java.lang.Object) bookRequest27);
        bookRequest22.setBookTitle("hi!,null");
        gui.RequestType requestType40 = bookRequest22.getRequestType();
        gui.RequestType requestType42 = null;
        gui.BookRequest bookRequest43 = new gui.BookRequest("hi!", requestType42);
        gui.RequestType requestType44 = bookRequest43.getRequestType();
        java.lang.Object obj45 = null;
        boolean boolean46 = bookRequest43.equals(obj45);
        gui.RequestType requestType47 = bookRequest43.getRequestType();
        java.lang.String str48 = bookRequest43.getBookTitle();
        java.lang.String str49 = bookRequest43.getBookTitle();
        boolean boolean50 = bookRequest22.equals((java.lang.Object) bookRequest43);
        bookRequest43.setBookTitle("hi!");
        boolean boolean53 = bookRequest2.equals((java.lang.Object) bookRequest43);
        bookRequest43.setBookTitle("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(requestType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(requestType40);
        org.junit.Assert.assertNull(requestType44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(requestType47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        java.lang.String str13 = bookRequest12.getBookTitle();
        java.lang.String str14 = bookRequest12.toCSVString();
        gui.RequestType requestType15 = null;
        bookRequest12.setRequestType(requestType15);
        gui.RequestType requestType17 = null;
        bookRequest12.setRequestType(requestType17);
        bookRequest12.setBookTitle("hi!");
        boolean boolean21 = bookRequest2.equals((java.lang.Object) bookRequest12);
        java.lang.String str22 = bookRequest2.toCSVString();
        gui.RequestType requestType23 = null;
        bookRequest2.setRequestType(requestType23);
        java.lang.String str25 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass26 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!,null" + "'", str22, "hi!,null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!,null" + "'", str25, "hi!,null");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType13 = null;
        bookRequest10.setRequestType(requestType13);
        bookRequest10.setBookTitle("hi!");
        boolean boolean17 = bookRequest2.equals((java.lang.Object) bookRequest10);
        bookRequest2.setBookTitle("hi!,null");
        java.lang.String str20 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!,null" + "'", str20, "hi!,null");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.getBookTitle();
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        bookRequest2.setBookTitle(",null,null,null,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        gui.BookRequest bookRequest9 = new gui.BookRequest("", requestType8);
        java.lang.String str10 = bookRequest9.getBookTitle();
        java.lang.String str11 = bookRequest9.toCSVString();
        boolean boolean12 = bookRequest2.equals((java.lang.Object) bookRequest9);
        gui.RequestType requestType13 = null;
        bookRequest2.setRequestType(requestType13);
        gui.RequestType requestType15 = null;
        bookRequest2.setRequestType(requestType15);
        gui.RequestType requestType17 = null;
        bookRequest2.setRequestType(requestType17);
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest(",null", requestType20);
        gui.RequestType requestType23 = null;
        gui.BookRequest bookRequest24 = new gui.BookRequest("", requestType23);
        java.lang.String str25 = bookRequest24.toCSVString();
        java.lang.String str26 = bookRequest24.toCSVString();
        gui.RequestType requestType27 = bookRequest24.getRequestType();
        bookRequest24.setBookTitle("");
        boolean boolean30 = bookRequest21.equals((java.lang.Object) "");
        gui.RequestType requestType31 = null;
        bookRequest21.setRequestType(requestType31);
        gui.RequestType requestType33 = null;
        bookRequest21.setRequestType(requestType33);
        boolean boolean35 = bookRequest2.equals((java.lang.Object) requestType33);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ",null" + "'", str25, ",null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertNull(requestType27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType6 = null;
        gui.BookRequest bookRequest7 = new gui.BookRequest("", requestType6);
        bookRequest7.setBookTitle("");
        gui.RequestType requestType10 = null;
        bookRequest7.setRequestType(requestType10);
        java.lang.String str12 = bookRequest7.toCSVString();
        boolean boolean14 = bookRequest7.equals((java.lang.Object) (short) 0);
        boolean boolean15 = bookRequest2.equals((java.lang.Object) boolean14);
        java.lang.String str16 = bookRequest2.toCSVString();
        java.lang.String str17 = bookRequest2.toCSVString();
        java.lang.String str18 = bookRequest2.toCSVString();
        java.lang.String str19 = bookRequest2.getBookTitle();
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        java.lang.String str23 = bookRequest22.getBookTitle();
        gui.RequestType requestType24 = null;
        bookRequest22.setRequestType(requestType24);
        gui.RequestType requestType27 = null;
        gui.BookRequest bookRequest28 = new gui.BookRequest("", requestType27);
        java.lang.String str29 = bookRequest28.toCSVString();
        java.lang.String str30 = bookRequest28.toCSVString();
        gui.RequestType requestType31 = bookRequest28.getRequestType();
        bookRequest28.setBookTitle("");
        gui.RequestType requestType34 = null;
        bookRequest28.setRequestType(requestType34);
        java.lang.String str36 = bookRequest28.getBookTitle();
        java.lang.Class<?> wildcardClass37 = bookRequest28.getClass();
        boolean boolean38 = bookRequest22.equals((java.lang.Object) wildcardClass37);
        gui.RequestType requestType40 = null;
        gui.BookRequest bookRequest41 = new gui.BookRequest("", requestType40);
        java.lang.String str42 = bookRequest41.getBookTitle();
        gui.RequestType requestType43 = null;
        bookRequest41.setRequestType(requestType43);
        java.lang.String str45 = bookRequest41.toCSVString();
        java.lang.String str46 = bookRequest41.toCSVString();
        boolean boolean47 = bookRequest22.equals((java.lang.Object) str46);
        gui.RequestType requestType48 = bookRequest22.getRequestType();
        gui.RequestType requestType49 = null;
        bookRequest22.setRequestType(requestType49);
        boolean boolean51 = bookRequest2.equals((java.lang.Object) bookRequest22);
        gui.RequestType requestType53 = null;
        gui.BookRequest bookRequest54 = new gui.BookRequest("", requestType53);
        java.lang.String str55 = bookRequest54.getBookTitle();
        gui.RequestType requestType56 = null;
        bookRequest54.setRequestType(requestType56);
        java.lang.String str58 = bookRequest54.getBookTitle();
        boolean boolean59 = bookRequest2.equals((java.lang.Object) str58);
        gui.RequestType requestType60 = null;
        bookRequest2.setRequestType(requestType60);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ",null" + "'", str17, ",null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ",null" + "'", str18, ",null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ",null" + "'", str29, ",null");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + ",null" + "'", str30, ",null");
        org.junit.Assert.assertNull(requestType31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + ",null" + "'", str45, ",null");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ",null" + "'", str46, ",null");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(requestType48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType30 = null;
        gui.BookRequest bookRequest31 = new gui.BookRequest("", requestType30);
        java.lang.String str32 = bookRequest31.getBookTitle();
        gui.RequestType requestType33 = null;
        bookRequest31.setRequestType(requestType33);
        java.lang.String str35 = bookRequest31.getBookTitle();
        boolean boolean36 = bookRequest2.equals((java.lang.Object) str35);
        gui.RequestType requestType37 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle(",null,null");
        java.lang.String str40 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass41 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(requestType37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ",null,null,null" + "'", str40, ",null,null,null");
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        java.lang.String str29 = bookRequest2.getBookTitle();
        gui.RequestType requestType31 = null;
        gui.BookRequest bookRequest32 = new gui.BookRequest("", requestType31);
        gui.RequestType requestType33 = null;
        bookRequest32.setRequestType(requestType33);
        gui.RequestType requestType35 = bookRequest32.getRequestType();
        bookRequest32.setBookTitle("hi!");
        bookRequest32.setBookTitle(",null");
        java.lang.String str40 = bookRequest32.getBookTitle();
        gui.RequestType requestType41 = null;
        bookRequest32.setRequestType(requestType41);
        boolean boolean43 = bookRequest2.equals((java.lang.Object) requestType41);
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(requestType35);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ",null" + "'", str40, ",null");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        bookRequest13.setBookTitle("");
        gui.RequestType requestType16 = null;
        bookRequest13.setRequestType(requestType16);
        gui.RequestType requestType18 = null;
        bookRequest13.setRequestType(requestType18);
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = bookRequest2.getRequestType();
        gui.RequestType requestType22 = null;
        bookRequest2.setRequestType(requestType22);
        java.lang.String str24 = bookRequest2.getBookTitle();
        java.lang.String str25 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.toCSVString();
        java.lang.String str9 = bookRequest2.getBookTitle();
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        java.lang.String str11 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass12 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!,null" + "'", str8, "hi!,null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(requestType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!,null" + "'", str11, "hi!,null");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("", requestType7);
        java.lang.String str9 = bookRequest8.toCSVString();
        java.lang.String str10 = bookRequest8.toCSVString();
        gui.RequestType requestType11 = bookRequest8.getRequestType();
        bookRequest8.setBookTitle("");
        gui.RequestType requestType14 = null;
        bookRequest8.setRequestType(requestType14);
        java.lang.String str16 = bookRequest8.getBookTitle();
        java.lang.Class<?> wildcardClass17 = bookRequest8.getClass();
        boolean boolean18 = bookRequest2.equals((java.lang.Object) wildcardClass17);
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        java.lang.String str22 = bookRequest21.getBookTitle();
        gui.RequestType requestType23 = null;
        bookRequest21.setRequestType(requestType23);
        java.lang.String str25 = bookRequest21.toCSVString();
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType29 = null;
        gui.BookRequest bookRequest30 = new gui.BookRequest("hi!,null", requestType29);
        gui.RequestType requestType32 = null;
        gui.BookRequest bookRequest33 = new gui.BookRequest("", requestType32);
        bookRequest33.setBookTitle("");
        gui.RequestType requestType36 = null;
        bookRequest33.setRequestType(requestType36);
        bookRequest33.setBookTitle("hi!");
        java.lang.String str40 = bookRequest33.toCSVString();
        boolean boolean41 = bookRequest30.equals((java.lang.Object) str40);
        boolean boolean42 = bookRequest2.equals((java.lang.Object) str40);
        bookRequest2.setBookTitle("hi!,null,null,null");
        java.lang.String str45 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ",null" + "'", str25, ",null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!,null" + "'", str40, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!,null,null,null" + "'", str45, "hi!,null,null,null");
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        java.lang.String str13 = bookRequest12.getBookTitle();
        java.lang.String str14 = bookRequest12.toCSVString();
        gui.RequestType requestType15 = null;
        bookRequest12.setRequestType(requestType15);
        gui.RequestType requestType17 = null;
        bookRequest12.setRequestType(requestType17);
        bookRequest12.setBookTitle("hi!");
        boolean boolean21 = bookRequest2.equals((java.lang.Object) bookRequest12);
        java.lang.String str22 = bookRequest2.toCSVString();
        gui.RequestType requestType23 = null;
        bookRequest2.setRequestType(requestType23);
        java.lang.String str25 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass26 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!,null" + "'", str22, "hi!,null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!,null");
        org.junit.Assert.assertNull(requestType5);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        boolean boolean10 = bookRequest2.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType20 = null;
        bookRequest2.setRequestType(requestType20);
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType24 = null;
        bookRequest2.setRequestType(requestType24);
        java.lang.String str26 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null,null,null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!,null,null" + "'", str26, "hi!,null,null");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType6 = null;
        gui.BookRequest bookRequest7 = new gui.BookRequest("", requestType6);
        bookRequest7.setBookTitle("");
        gui.RequestType requestType10 = null;
        bookRequest7.setRequestType(requestType10);
        java.lang.String str12 = bookRequest7.toCSVString();
        boolean boolean14 = bookRequest7.equals((java.lang.Object) (short) 0);
        boolean boolean15 = bookRequest2.equals((java.lang.Object) boolean14);
        java.lang.String str16 = bookRequest2.toCSVString();
        java.lang.String str17 = bookRequest2.toCSVString();
        java.lang.String str18 = bookRequest2.toCSVString();
        java.lang.String str19 = bookRequest2.getBookTitle();
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        java.lang.String str23 = bookRequest22.getBookTitle();
        gui.RequestType requestType24 = null;
        bookRequest22.setRequestType(requestType24);
        gui.RequestType requestType27 = null;
        gui.BookRequest bookRequest28 = new gui.BookRequest("", requestType27);
        java.lang.String str29 = bookRequest28.toCSVString();
        java.lang.String str30 = bookRequest28.toCSVString();
        gui.RequestType requestType31 = bookRequest28.getRequestType();
        bookRequest28.setBookTitle("");
        gui.RequestType requestType34 = null;
        bookRequest28.setRequestType(requestType34);
        java.lang.String str36 = bookRequest28.getBookTitle();
        java.lang.Class<?> wildcardClass37 = bookRequest28.getClass();
        boolean boolean38 = bookRequest22.equals((java.lang.Object) wildcardClass37);
        gui.RequestType requestType40 = null;
        gui.BookRequest bookRequest41 = new gui.BookRequest("", requestType40);
        java.lang.String str42 = bookRequest41.getBookTitle();
        gui.RequestType requestType43 = null;
        bookRequest41.setRequestType(requestType43);
        java.lang.String str45 = bookRequest41.toCSVString();
        java.lang.String str46 = bookRequest41.toCSVString();
        boolean boolean47 = bookRequest22.equals((java.lang.Object) str46);
        gui.RequestType requestType48 = bookRequest22.getRequestType();
        gui.RequestType requestType49 = null;
        bookRequest22.setRequestType(requestType49);
        boolean boolean51 = bookRequest2.equals((java.lang.Object) bookRequest22);
        gui.RequestType requestType52 = bookRequest2.getRequestType();
        gui.RequestType requestType54 = null;
        gui.BookRequest bookRequest55 = new gui.BookRequest("", requestType54);
        java.lang.String str56 = bookRequest55.getBookTitle();
        java.lang.String str57 = bookRequest55.toCSVString();
        gui.RequestType requestType58 = null;
        bookRequest55.setRequestType(requestType58);
        gui.RequestType requestType60 = null;
        bookRequest55.setRequestType(requestType60);
        java.lang.String str62 = bookRequest55.toCSVString();
        java.lang.String str63 = bookRequest55.toCSVString();
        bookRequest55.setBookTitle(",null");
        boolean boolean66 = bookRequest2.equals((java.lang.Object) ",null");
        java.lang.String str67 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ",null" + "'", str17, ",null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ",null" + "'", str18, ",null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ",null" + "'", str29, ",null");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + ",null" + "'", str30, ",null");
        org.junit.Assert.assertNull(requestType31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + ",null" + "'", str45, ",null");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ",null" + "'", str46, ",null");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(requestType48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(requestType52);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + ",null" + "'", str57, ",null");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + ",null" + "'", str62, ",null");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + ",null" + "'", str63, ",null");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + ",null" + "'", str67, ",null");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        java.lang.Class<?> wildcardClass6 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        java.lang.String str6 = bookRequest2.toCSVString();
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType13 = null;
        bookRequest10.setRequestType(requestType13);
        gui.RequestType requestType15 = null;
        bookRequest10.setRequestType(requestType15);
        bookRequest10.setBookTitle("hi!");
        java.lang.Class<?> wildcardClass19 = bookRequest10.getClass();
        boolean boolean20 = bookRequest2.equals((java.lang.Object) wildcardClass19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,null" + "'", str6, "hi!,null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!,null" + "'", str7, "hi!,null");
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        java.lang.String str11 = bookRequest10.toCSVString();
        bookRequest10.setBookTitle("hi!");
        gui.RequestType requestType14 = null;
        bookRequest10.setRequestType(requestType14);
        java.lang.String str16 = bookRequest10.toCSVString();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) str16);
        bookRequest2.setBookTitle(",null,null");
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        java.lang.String str23 = bookRequest22.toCSVString();
        bookRequest22.setBookTitle("hi!");
        gui.RequestType requestType26 = null;
        bookRequest22.setRequestType(requestType26);
        java.lang.String str28 = bookRequest22.getBookTitle();
        java.lang.String str29 = bookRequest22.toCSVString();
        gui.RequestType requestType31 = null;
        gui.BookRequest bookRequest32 = new gui.BookRequest("", requestType31);
        java.lang.String str33 = bookRequest32.getBookTitle();
        java.lang.String str34 = bookRequest32.toCSVString();
        gui.RequestType requestType35 = null;
        bookRequest32.setRequestType(requestType35);
        gui.RequestType requestType37 = null;
        bookRequest32.setRequestType(requestType37);
        bookRequest32.setBookTitle("hi!");
        boolean boolean41 = bookRequest22.equals((java.lang.Object) bookRequest32);
        gui.RequestType requestType43 = null;
        gui.BookRequest bookRequest44 = new gui.BookRequest("", requestType43);
        bookRequest44.setBookTitle("");
        gui.RequestType requestType47 = null;
        bookRequest44.setRequestType(requestType47);
        gui.RequestType requestType49 = null;
        bookRequest44.setRequestType(requestType49);
        bookRequest44.setBookTitle("hi!");
        boolean boolean53 = bookRequest32.equals((java.lang.Object) bookRequest44);
        gui.RequestType requestType54 = bookRequest32.getRequestType();
        boolean boolean55 = bookRequest2.equals((java.lang.Object) bookRequest32);
        java.lang.String str56 = bookRequest32.getBookTitle();
        gui.RequestType requestType57 = bookRequest32.getRequestType();
        gui.RequestType requestType59 = null;
        gui.BookRequest bookRequest60 = new gui.BookRequest("", requestType59);
        bookRequest60.setBookTitle("");
        gui.RequestType requestType63 = null;
        bookRequest60.setRequestType(requestType63);
        gui.RequestType requestType65 = null;
        bookRequest60.setRequestType(requestType65);
        bookRequest60.setBookTitle("hi!");
        gui.RequestType requestType70 = null;
        gui.BookRequest bookRequest71 = new gui.BookRequest("", requestType70);
        java.lang.String str72 = bookRequest71.toCSVString();
        bookRequest71.setBookTitle("hi!");
        bookRequest71.setBookTitle(",null");
        gui.RequestType requestType78 = null;
        gui.BookRequest bookRequest79 = new gui.BookRequest("", requestType78);
        bookRequest79.setBookTitle("");
        gui.RequestType requestType82 = null;
        bookRequest79.setRequestType(requestType82);
        bookRequest79.setBookTitle("hi!");
        boolean boolean86 = bookRequest71.equals((java.lang.Object) bookRequest79);
        boolean boolean87 = bookRequest60.equals((java.lang.Object) boolean86);
        gui.RequestType requestType89 = null;
        gui.BookRequest bookRequest90 = new gui.BookRequest("", requestType89);
        java.lang.String str91 = bookRequest90.getBookTitle();
        gui.RequestType requestType92 = bookRequest90.getRequestType();
        gui.RequestType requestType93 = null;
        bookRequest90.setRequestType(requestType93);
        java.lang.String str95 = bookRequest90.toCSVString();
        java.lang.String str96 = bookRequest90.toCSVString();
        boolean boolean97 = bookRequest60.equals((java.lang.Object) str96);
        boolean boolean98 = bookRequest32.equals((java.lang.Object) str96);
        gui.RequestType requestType99 = bookRequest32.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!,null" + "'", str16, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ",null" + "'", str23, ",null");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!,null" + "'", str29, "hi!,null");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ",null" + "'", str34, ",null");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(requestType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNull(requestType57);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + ",null" + "'", str72, ",null");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertNull(requestType92);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + ",null" + "'", str95, ",null");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + ",null" + "'", str96, ",null");
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNull(requestType99);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        java.lang.String str29 = bookRequest2.getBookTitle();
        java.lang.String str30 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass31 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        gui.RequestType requestType8 = bookRequest2.getRequestType();
        java.lang.String str9 = bookRequest2.getBookTitle();
        java.lang.String str10 = bookRequest2.getBookTitle();
        java.lang.String str11 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass12 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertNull(requestType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("", requestType7);
        java.lang.String str9 = bookRequest8.toCSVString();
        java.lang.String str10 = bookRequest8.toCSVString();
        boolean boolean11 = bookRequest2.equals((java.lang.Object) bookRequest8);
        bookRequest8.setBookTitle("hi!,null");
        bookRequest8.setBookTitle("hi!,null");
        bookRequest8.setBookTitle("hi!,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.getBookTitle();
        java.lang.String str16 = bookRequest14.getBookTitle();
        bookRequest14.setBookTitle(",null");
        gui.RequestType requestType19 = null;
        bookRequest14.setRequestType(requestType19);
        boolean boolean21 = bookRequest2.equals((java.lang.Object) requestType19);
        gui.RequestType requestType23 = null;
        gui.BookRequest bookRequest24 = new gui.BookRequest("", requestType23);
        java.lang.String str25 = bookRequest24.getBookTitle();
        gui.RequestType requestType26 = bookRequest24.getRequestType();
        gui.RequestType requestType28 = null;
        gui.BookRequest bookRequest29 = new gui.BookRequest("", requestType28);
        bookRequest29.setBookTitle("");
        gui.RequestType requestType32 = null;
        bookRequest29.setRequestType(requestType32);
        java.lang.String str34 = bookRequest29.toCSVString();
        boolean boolean36 = bookRequest29.equals((java.lang.Object) (short) 0);
        boolean boolean37 = bookRequest24.equals((java.lang.Object) boolean36);
        java.lang.String str38 = bookRequest24.toCSVString();
        boolean boolean39 = bookRequest2.equals((java.lang.Object) str38);
        gui.RequestType requestType40 = null;
        bookRequest2.setRequestType(requestType40);
        java.lang.Class<?> wildcardClass42 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(requestType26);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ",null" + "'", str34, ",null");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + ",null" + "'", str38, ",null");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null");
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        java.lang.Class<?> wildcardClass12 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null,null" + "'", str7, ",null,null");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.getBookTitle();
        java.lang.String str16 = bookRequest14.getBookTitle();
        bookRequest14.setBookTitle(",null");
        gui.RequestType requestType19 = null;
        bookRequest14.setRequestType(requestType19);
        boolean boolean21 = bookRequest2.equals((java.lang.Object) requestType19);
        java.lang.String str22 = bookRequest2.getBookTitle();
        java.lang.String str23 = bookRequest2.getBookTitle();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.toCSVString();
        java.lang.String str11 = bookRequest2.toCSVString();
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        java.lang.String str14 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass15 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        boolean boolean10 = bookRequest2.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        java.lang.Class<?> wildcardClass20 = bookRequest13.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        boolean boolean8 = bookRequest2.equals((java.lang.Object) (-1.0d));
        bookRequest2.setBookTitle("hi!,null,null,null");
        bookRequest2.setBookTitle(",null");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType6 = null;
        gui.BookRequest bookRequest7 = new gui.BookRequest("", requestType6);
        bookRequest7.setBookTitle("");
        gui.RequestType requestType10 = null;
        bookRequest7.setRequestType(requestType10);
        java.lang.String str12 = bookRequest7.toCSVString();
        boolean boolean14 = bookRequest7.equals((java.lang.Object) (short) 0);
        boolean boolean15 = bookRequest2.equals((java.lang.Object) boolean14);
        bookRequest2.setBookTitle("hi!,null");
        bookRequest2.setBookTitle("hi!,null");
        java.lang.String str20 = bookRequest2.toCSVString();
        gui.RequestType requestType21 = bookRequest2.getRequestType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = requestType21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!,null,null" + "'", str20, "hi!,null,null");
        org.junit.Assert.assertNull(requestType21);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        bookRequest12.setBookTitle("");
        gui.RequestType requestType15 = null;
        bookRequest12.setRequestType(requestType15);
        java.lang.String str17 = bookRequest12.toCSVString();
        boolean boolean18 = bookRequest2.equals((java.lang.Object) str17);
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType22 = null;
        gui.BookRequest bookRequest23 = new gui.BookRequest("", requestType22);
        bookRequest23.setBookTitle("");
        gui.RequestType requestType26 = null;
        bookRequest23.setRequestType(requestType26);
        gui.RequestType requestType28 = null;
        bookRequest23.setRequestType(requestType28);
        bookRequest23.setBookTitle("hi!");
        gui.RequestType requestType32 = null;
        bookRequest23.setRequestType(requestType32);
        gui.RequestType requestType34 = null;
        bookRequest23.setRequestType(requestType34);
        boolean boolean36 = bookRequest2.equals((java.lang.Object) requestType34);
        bookRequest2.setBookTitle("hi!");
        java.lang.String str39 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass40 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ",null" + "'", str17, ",null");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!,null" + "'", str39, "hi!,null");
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null,null");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        java.lang.String str11 = bookRequest10.toCSVString();
        bookRequest10.setBookTitle("hi!");
        bookRequest10.setBookTitle(",null");
        gui.RequestType requestType17 = null;
        gui.BookRequest bookRequest18 = new gui.BookRequest("", requestType17);
        bookRequest18.setBookTitle("");
        gui.RequestType requestType21 = null;
        bookRequest18.setRequestType(requestType21);
        bookRequest18.setBookTitle("hi!");
        boolean boolean25 = bookRequest10.equals((java.lang.Object) bookRequest18);
        boolean boolean26 = bookRequest2.equals((java.lang.Object) bookRequest18);
        gui.RequestType requestType27 = bookRequest18.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(requestType27);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        gui.BookRequest bookRequest9 = new gui.BookRequest("", requestType8);
        java.lang.String str10 = bookRequest9.getBookTitle();
        java.lang.String str11 = bookRequest9.toCSVString();
        boolean boolean12 = bookRequest2.equals((java.lang.Object) bookRequest9);
        gui.RequestType requestType13 = null;
        bookRequest2.setRequestType(requestType13);
        gui.RequestType requestType16 = null;
        gui.BookRequest bookRequest17 = new gui.BookRequest("", requestType16);
        gui.RequestType requestType18 = null;
        bookRequest17.setRequestType(requestType18);
        java.lang.String str20 = bookRequest17.getBookTitle();
        boolean boolean21 = bookRequest2.equals((java.lang.Object) str20);
        java.lang.String str22 = bookRequest2.getBookTitle();
        gui.RequestType requestType24 = null;
        gui.BookRequest bookRequest25 = new gui.BookRequest("", requestType24);
        java.lang.String str26 = bookRequest25.toCSVString();
        java.lang.String str27 = bookRequest25.toCSVString();
        gui.RequestType requestType28 = bookRequest25.getRequestType();
        gui.RequestType requestType29 = bookRequest25.getRequestType();
        boolean boolean30 = bookRequest2.equals((java.lang.Object) bookRequest25);
        java.lang.String str31 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass32 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ",null" + "'", str27, ",null");
        org.junit.Assert.assertNull(requestType28);
        org.junit.Assert.assertNull(requestType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        boolean boolean10 = bookRequest2.equals((java.lang.Object) 10.0d);
        java.lang.String str11 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!,null,null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        java.lang.Class<?> wildcardClass10 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        gui.RequestType requestType14 = null;
        bookRequest13.setRequestType(requestType14);
        java.lang.String str16 = bookRequest13.toCSVString();
        gui.RequestType requestType17 = null;
        bookRequest13.setRequestType(requestType17);
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        java.lang.String str23 = bookRequest22.getBookTitle();
        java.lang.String str24 = bookRequest22.getBookTitle();
        boolean boolean25 = bookRequest13.equals((java.lang.Object) str24);
        gui.RequestType requestType26 = null;
        bookRequest13.setRequestType(requestType26);
        java.lang.String str28 = bookRequest13.toCSVString();
        gui.RequestType requestType29 = null;
        bookRequest13.setRequestType(requestType29);
        java.lang.String str31 = bookRequest13.toCSVString();
        java.lang.Class<?> wildcardClass32 = bookRequest13.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ",null" + "'", str28, ",null");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ",null" + "'", str31, ",null");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        bookRequest2.setBookTitle(",null");
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType33 = null;
        bookRequest2.setRequestType(requestType33);
        bookRequest2.setBookTitle(",null,null,null");
        gui.RequestType requestType37 = bookRequest2.getRequestType();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(requestType37);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType11 = null;
        bookRequest2.setRequestType(requestType11);
        bookRequest2.setBookTitle("");
        java.lang.String str15 = bookRequest2.toCSVString();
        gui.RequestType requestType17 = null;
        gui.BookRequest bookRequest18 = new gui.BookRequest("", requestType17);
        bookRequest18.setBookTitle("");
        gui.RequestType requestType21 = null;
        bookRequest18.setRequestType(requestType21);
        gui.RequestType requestType23 = null;
        bookRequest18.setRequestType(requestType23);
        bookRequest18.setBookTitle("hi!");
        gui.RequestType requestType27 = null;
        bookRequest18.setRequestType(requestType27);
        bookRequest18.setBookTitle("");
        java.lang.Class<?> wildcardClass31 = bookRequest18.getClass();
        boolean boolean32 = bookRequest2.equals((java.lang.Object) bookRequest18);
        gui.RequestType requestType33 = bookRequest18.getRequestType();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(requestType33);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType13 = null;
        bookRequest10.setRequestType(requestType13);
        java.lang.String str15 = bookRequest10.toCSVString();
        boolean boolean17 = bookRequest10.equals((java.lang.Object) (short) 0);
        bookRequest10.setBookTitle("hi!,null,null");
        boolean boolean20 = bookRequest2.equals((java.lang.Object) "hi!,null,null");
        gui.RequestType requestType22 = null;
        gui.BookRequest bookRequest23 = new gui.BookRequest("", requestType22);
        java.lang.String str24 = bookRequest23.toCSVString();
        bookRequest23.setBookTitle("hi!");
        gui.RequestType requestType27 = null;
        bookRequest23.setRequestType(requestType27);
        java.lang.String str29 = bookRequest23.getBookTitle();
        java.lang.String str30 = bookRequest23.toCSVString();
        java.lang.String str31 = bookRequest23.getBookTitle();
        boolean boolean32 = bookRequest2.equals((java.lang.Object) bookRequest23);
        gui.RequestType requestType33 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ",null" + "'", str24, ",null");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!,null" + "'", str30, "hi!,null");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNull(requestType33);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.getBookTitle();
        java.lang.String str16 = bookRequest14.getBookTitle();
        bookRequest14.setBookTitle(",null");
        gui.RequestType requestType19 = null;
        bookRequest14.setRequestType(requestType19);
        boolean boolean21 = bookRequest2.equals((java.lang.Object) requestType19);
        boolean boolean23 = bookRequest2.equals((java.lang.Object) (short) 1);
        gui.RequestType requestType24 = bookRequest2.getRequestType();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(requestType24);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!,null", requestType1);
        gui.RequestType requestType4 = null;
        gui.BookRequest bookRequest5 = new gui.BookRequest("", requestType4);
        bookRequest5.setBookTitle("");
        gui.RequestType requestType8 = null;
        bookRequest5.setRequestType(requestType8);
        bookRequest5.setBookTitle("hi!");
        java.lang.String str12 = bookRequest5.toCSVString();
        boolean boolean13 = bookRequest2.equals((java.lang.Object) str12);
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType16 = bookRequest2.getRequestType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = requestType16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!,null" + "'", str12, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(requestType16);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",null" + "'", str8, ",null");
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.toCSVString();
        java.lang.String str9 = bookRequest2.getBookTitle();
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        java.lang.String str11 = bookRequest2.toCSVString();
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.getBookTitle();
        java.lang.String str16 = bookRequest14.getBookTitle();
        gui.RequestType requestType17 = bookRequest14.getRequestType();
        gui.RequestType requestType18 = null;
        bookRequest14.setRequestType(requestType18);
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!,null" + "'", str8, "hi!,null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(requestType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!,null" + "'", str11, "hi!,null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(requestType17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        bookRequest2.setBookTitle(",null,null");
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.toCSVString();
        bookRequest14.setBookTitle("hi!");
        gui.RequestType requestType18 = null;
        bookRequest14.setRequestType(requestType18);
        java.lang.String str20 = bookRequest14.getBookTitle();
        java.lang.String str21 = bookRequest14.toCSVString();
        java.lang.String str22 = bookRequest14.getBookTitle();
        gui.RequestType requestType24 = null;
        gui.BookRequest bookRequest25 = new gui.BookRequest("", requestType24);
        bookRequest25.setBookTitle("");
        gui.RequestType requestType28 = null;
        bookRequest25.setRequestType(requestType28);
        gui.RequestType requestType30 = null;
        bookRequest25.setRequestType(requestType30);
        boolean boolean32 = bookRequest14.equals((java.lang.Object) bookRequest25);
        gui.RequestType requestType33 = bookRequest14.getRequestType();
        gui.RequestType requestType34 = null;
        bookRequest14.setRequestType(requestType34);
        gui.RequestType requestType36 = bookRequest14.getRequestType();
        boolean boolean37 = bookRequest2.equals((java.lang.Object) bookRequest14);
        gui.RequestType requestType39 = null;
        gui.BookRequest bookRequest40 = new gui.BookRequest("", requestType39);
        bookRequest40.setBookTitle("");
        gui.RequestType requestType44 = null;
        gui.BookRequest bookRequest45 = new gui.BookRequest("", requestType44);
        bookRequest45.setBookTitle("");
        gui.RequestType requestType48 = null;
        bookRequest45.setRequestType(requestType48);
        gui.RequestType requestType50 = null;
        bookRequest45.setRequestType(requestType50);
        bookRequest45.setBookTitle("hi!");
        gui.RequestType requestType54 = bookRequest45.getRequestType();
        boolean boolean55 = bookRequest40.equals((java.lang.Object) bookRequest45);
        bookRequest40.setBookTitle("hi!,null");
        boolean boolean58 = bookRequest14.equals((java.lang.Object) "hi!,null");
        java.lang.Class<?> wildcardClass59 = bookRequest14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!,null" + "'", str21, "hi!,null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(requestType33);
        org.junit.Assert.assertNull(requestType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(requestType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        java.lang.String str6 = bookRequest2.toCSVString();
        java.lang.String str7 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null,null,null");
        bookRequest2.setBookTitle(",null,null,null,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.Class<?> wildcardClass8 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        boolean boolean11 = bookRequest2.equals((java.lang.Object) (-1L));
        java.lang.String str12 = bookRequest2.getBookTitle();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("");
        java.lang.String str8 = bookRequest2.getBookTitle();
        gui.RequestType requestType9 = null;
        bookRequest2.setRequestType(requestType9);
        gui.RequestType requestType11 = bookRequest2.getRequestType();
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        bookRequest2.setBookTitle("hi!,null,null");
        java.lang.Class<?> wildcardClass16 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        java.lang.String str13 = bookRequest2.getBookTitle();
        java.lang.String str14 = bookRequest2.toCSVString();
        gui.RequestType requestType15 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertNull(requestType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertNull(requestType15);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType6 = null;
        gui.BookRequest bookRequest7 = new gui.BookRequest("", requestType6);
        bookRequest7.setBookTitle("");
        gui.RequestType requestType10 = null;
        bookRequest7.setRequestType(requestType10);
        gui.RequestType requestType12 = null;
        bookRequest7.setRequestType(requestType12);
        bookRequest7.setBookTitle("hi!");
        gui.RequestType requestType16 = bookRequest7.getRequestType();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) bookRequest7);
        bookRequest2.setBookTitle("hi!,null");
        bookRequest2.setBookTitle(",null");
        bookRequest2.setBookTitle("hi!,null");
        java.lang.Class<?> wildcardClass24 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        java.lang.String str6 = bookRequest2.toCSVString();
        java.lang.String str7 = bookRequest2.getBookTitle();
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass9 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,null" + "'", str6, "hi!,null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType30 = null;
        gui.BookRequest bookRequest31 = new gui.BookRequest("", requestType30);
        java.lang.String str32 = bookRequest31.getBookTitle();
        gui.RequestType requestType33 = null;
        bookRequest31.setRequestType(requestType33);
        java.lang.String str35 = bookRequest31.getBookTitle();
        boolean boolean36 = bookRequest2.equals((java.lang.Object) str35);
        gui.RequestType requestType37 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("");
        java.lang.String str40 = bookRequest2.toCSVString();
        gui.RequestType requestType42 = null;
        gui.BookRequest bookRequest43 = new gui.BookRequest("", requestType42);
        java.lang.String str44 = bookRequest43.getBookTitle();
        gui.RequestType requestType45 = null;
        bookRequest43.setRequestType(requestType45);
        gui.RequestType requestType48 = null;
        gui.BookRequest bookRequest49 = new gui.BookRequest("", requestType48);
        java.lang.String str50 = bookRequest49.toCSVString();
        java.lang.String str51 = bookRequest49.toCSVString();
        boolean boolean52 = bookRequest43.equals((java.lang.Object) bookRequest49);
        gui.RequestType requestType53 = null;
        bookRequest43.setRequestType(requestType53);
        boolean boolean55 = bookRequest2.equals((java.lang.Object) requestType53);
        bookRequest2.setBookTitle("hi!,null");
        java.lang.Class<?> wildcardClass58 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(requestType37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ",null" + "'", str40, ",null");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + ",null" + "'", str50, ",null");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + ",null" + "'", str51, ",null");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType4 = null;
        gui.BookRequest bookRequest5 = new gui.BookRequest("", requestType4);
        java.lang.String str6 = bookRequest5.toCSVString();
        java.lang.String str7 = bookRequest5.toCSVString();
        gui.RequestType requestType8 = bookRequest5.getRequestType();
        bookRequest5.setBookTitle("");
        java.lang.String str11 = bookRequest5.getBookTitle();
        bookRequest5.setBookTitle("hi!,null");
        boolean boolean14 = bookRequest2.equals((java.lang.Object) bookRequest5);
        java.lang.Class<?> wildcardClass15 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertNull(requestType8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        gui.BookRequest bookRequest9 = new gui.BookRequest("", requestType8);
        java.lang.String str10 = bookRequest9.getBookTitle();
        java.lang.String str11 = bookRequest9.toCSVString();
        boolean boolean12 = bookRequest2.equals((java.lang.Object) bookRequest9);
        gui.RequestType requestType13 = null;
        bookRequest2.setRequestType(requestType13);
        gui.RequestType requestType16 = null;
        gui.BookRequest bookRequest17 = new gui.BookRequest("", requestType16);
        gui.RequestType requestType18 = null;
        bookRequest17.setRequestType(requestType18);
        java.lang.String str20 = bookRequest17.getBookTitle();
        boolean boolean21 = bookRequest2.equals((java.lang.Object) str20);
        java.lang.String str22 = bookRequest2.getBookTitle();
        gui.RequestType requestType24 = null;
        gui.BookRequest bookRequest25 = new gui.BookRequest("", requestType24);
        java.lang.String str26 = bookRequest25.toCSVString();
        java.lang.String str27 = bookRequest25.toCSVString();
        gui.RequestType requestType28 = bookRequest25.getRequestType();
        gui.RequestType requestType29 = bookRequest25.getRequestType();
        boolean boolean30 = bookRequest2.equals((java.lang.Object) bookRequest25);
        java.lang.String str31 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass32 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ",null" + "'", str27, ",null");
        org.junit.Assert.assertNull(requestType28);
        org.junit.Assert.assertNull(requestType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!,null" + "'", str31, "hi!,null");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        java.lang.String str13 = bookRequest12.getBookTitle();
        java.lang.String str14 = bookRequest12.toCSVString();
        gui.RequestType requestType15 = null;
        bookRequest12.setRequestType(requestType15);
        gui.RequestType requestType17 = null;
        bookRequest12.setRequestType(requestType17);
        bookRequest12.setBookTitle("hi!");
        boolean boolean21 = bookRequest2.equals((java.lang.Object) bookRequest12);
        java.lang.String str22 = bookRequest12.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType13 = null;
        bookRequest10.setRequestType(requestType13);
        bookRequest10.setBookTitle("hi!");
        boolean boolean17 = bookRequest2.equals((java.lang.Object) bookRequest10);
        java.lang.String str18 = bookRequest2.toCSVString();
        gui.RequestType requestType19 = bookRequest2.getRequestType();
        java.lang.String str20 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ",null,null" + "'", str18, ",null,null");
        org.junit.Assert.assertNull(requestType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ",null,null" + "'", str20, ",null,null");
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        java.lang.String str6 = bookRequest2.toCSVString();
        java.lang.String str7 = bookRequest2.getBookTitle();
        java.lang.String str8 = bookRequest2.getBookTitle();
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,null" + "'", str6, "hi!,null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(requestType9);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("", requestType7);
        java.lang.String str9 = bookRequest8.toCSVString();
        java.lang.String str10 = bookRequest8.toCSVString();
        gui.RequestType requestType11 = bookRequest8.getRequestType();
        bookRequest8.setBookTitle("");
        gui.RequestType requestType14 = null;
        bookRequest8.setRequestType(requestType14);
        java.lang.String str16 = bookRequest8.getBookTitle();
        java.lang.Class<?> wildcardClass17 = bookRequest8.getClass();
        boolean boolean18 = bookRequest2.equals((java.lang.Object) wildcardClass17);
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        java.lang.String str22 = bookRequest21.getBookTitle();
        gui.RequestType requestType23 = null;
        bookRequest21.setRequestType(requestType23);
        java.lang.String str25 = bookRequest21.toCSVString();
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType28 = bookRequest2.getRequestType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass29 = requestType28.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ",null" + "'", str25, ",null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(requestType28);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        gui.RequestType requestType14 = null;
        bookRequest13.setRequestType(requestType14);
        java.lang.String str16 = bookRequest13.toCSVString();
        gui.RequestType requestType17 = null;
        bookRequest13.setRequestType(requestType17);
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        java.lang.String str20 = bookRequest2.getBookTitle();
        java.lang.String str21 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass22 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!,null" + "'", str20, "hi!,null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!,null,null" + "'", str21, "hi!,null,null");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.getBookTitle();
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        gui.RequestType requestType13 = null;
        bookRequest12.setRequestType(requestType13);
        java.lang.String str15 = bookRequest12.toCSVString();
        gui.RequestType requestType16 = null;
        bookRequest12.setRequestType(requestType16);
        java.lang.String str18 = bookRequest12.getBookTitle();
        boolean boolean20 = bookRequest12.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType22 = null;
        gui.BookRequest bookRequest23 = new gui.BookRequest("", requestType22);
        java.lang.String str24 = bookRequest23.toCSVString();
        bookRequest23.setBookTitle("hi!");
        bookRequest23.setBookTitle(",null");
        boolean boolean29 = bookRequest12.equals((java.lang.Object) bookRequest23);
        bookRequest23.setBookTitle("hi!,null,null,null");
        boolean boolean32 = bookRequest2.equals((java.lang.Object) "hi!,null,null,null");
        gui.RequestType requestType33 = null;
        bookRequest2.setRequestType(requestType33);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ",null" + "'", str24, ",null");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("", requestType7);
        java.lang.String str9 = bookRequest8.toCSVString();
        java.lang.String str10 = bookRequest8.toCSVString();
        boolean boolean11 = bookRequest2.equals((java.lang.Object) bookRequest8);
        bookRequest8.setBookTitle("hi!,null");
        bookRequest8.setBookTitle("hi!,null");
        java.lang.Class<?> wildcardClass16 = bookRequest8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        java.lang.String str11 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!,null" + "'", str11, "hi!,null");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        java.lang.String str6 = bookRequest2.getBookTitle();
        java.lang.String str7 = bookRequest2.getBookTitle();
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("");
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        java.lang.String str14 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("", requestType7);
        gui.RequestType requestType9 = null;
        bookRequest8.setRequestType(requestType9);
        gui.RequestType requestType11 = bookRequest8.getRequestType();
        bookRequest8.setBookTitle("hi!");
        bookRequest8.setBookTitle(",null");
        bookRequest8.setBookTitle("hi!");
        boolean boolean18 = bookRequest2.equals((java.lang.Object) bookRequest8);
        bookRequest8.setBookTitle("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        java.lang.String str29 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType33 = null;
        gui.BookRequest bookRequest34 = new gui.BookRequest("", requestType33);
        java.lang.String str35 = bookRequest34.toCSVString();
        java.lang.String str36 = bookRequest34.toCSVString();
        gui.RequestType requestType37 = bookRequest34.getRequestType();
        bookRequest34.setBookTitle("");
        java.lang.String str40 = bookRequest34.getBookTitle();
        bookRequest34.setBookTitle("hi!,null");
        boolean boolean43 = bookRequest2.equals((java.lang.Object) bookRequest34);
        gui.RequestType requestType44 = bookRequest2.getRequestType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass45 = requestType44.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + ",null" + "'", str35, ",null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ",null" + "'", str36, ",null");
        org.junit.Assert.assertNull(requestType37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(requestType44);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType30 = null;
        gui.BookRequest bookRequest31 = new gui.BookRequest("", requestType30);
        java.lang.String str32 = bookRequest31.getBookTitle();
        gui.RequestType requestType33 = null;
        bookRequest31.setRequestType(requestType33);
        java.lang.String str35 = bookRequest31.getBookTitle();
        boolean boolean36 = bookRequest2.equals((java.lang.Object) str35);
        gui.RequestType requestType37 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle(",null,null");
        java.lang.String str40 = bookRequest2.toCSVString();
        java.lang.String str41 = bookRequest2.toCSVString();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(requestType37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ",null,null,null" + "'", str40, ",null,null,null");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + ",null,null,null" + "'", str41, ",null,null,null");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle(",null");
        java.lang.String str6 = bookRequest2.toCSVString();
        gui.RequestType requestType7 = bookRequest2.getRequestType();
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        java.lang.Class<?> wildcardClass11 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null,null" + "'", str6, ",null,null");
        org.junit.Assert.assertNull(requestType7);
        org.junit.Assert.assertNull(requestType10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.toCSVString();
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        bookRequest11.setBookTitle("");
        gui.RequestType requestType14 = null;
        bookRequest11.setRequestType(requestType14);
        gui.RequestType requestType16 = null;
        bookRequest11.setRequestType(requestType16);
        bookRequest11.setBookTitle("hi!");
        java.lang.Class<?> wildcardClass20 = bookRequest11.getClass();
        boolean boolean21 = bookRequest2.equals((java.lang.Object) bookRequest11);
        bookRequest11.setBookTitle("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",null" + "'", str8, ",null");
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        java.lang.String str10 = bookRequest2.getBookTitle();
        java.lang.Object obj11 = null;
        boolean boolean12 = bookRequest2.equals(obj11);
        bookRequest2.setBookTitle(",null,null,null,null");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        bookRequest13.setBookTitle("");
        gui.RequestType requestType16 = null;
        bookRequest13.setRequestType(requestType16);
        gui.RequestType requestType18 = null;
        bookRequest13.setRequestType(requestType18);
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = bookRequest2.getRequestType();
        java.lang.String str22 = bookRequest2.getBookTitle();
        java.lang.String str23 = bookRequest2.getBookTitle();
        gui.RequestType requestType24 = bookRequest2.getRequestType();
        gui.RequestType requestType25 = null;
        bookRequest2.setRequestType(requestType25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(requestType24);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType8 = null;
        gui.BookRequest bookRequest9 = new gui.BookRequest("", requestType8);
        java.lang.String str10 = bookRequest9.getBookTitle();
        java.lang.String str11 = bookRequest9.toCSVString();
        java.lang.String str12 = bookRequest9.toCSVString();
        bookRequest9.setBookTitle(",null");
        java.lang.String str15 = bookRequest9.toCSVString();
        gui.RequestType requestType16 = null;
        bookRequest9.setRequestType(requestType16);
        java.lang.Class<?> wildcardClass18 = bookRequest9.getClass();
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null,null" + "'", str15, ",null,null");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType6 = null;
        gui.BookRequest bookRequest7 = new gui.BookRequest("", requestType6);
        bookRequest7.setBookTitle("");
        gui.RequestType requestType10 = null;
        bookRequest7.setRequestType(requestType10);
        gui.RequestType requestType12 = null;
        bookRequest7.setRequestType(requestType12);
        bookRequest7.setBookTitle("hi!");
        gui.RequestType requestType16 = bookRequest7.getRequestType();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) bookRequest7);
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType20 = bookRequest2.getRequestType();
        gui.RequestType requestType22 = null;
        gui.BookRequest bookRequest23 = new gui.BookRequest("hi!", requestType22);
        gui.RequestType requestType24 = bookRequest23.getRequestType();
        java.lang.Object obj25 = null;
        boolean boolean26 = bookRequest23.equals(obj25);
        gui.RequestType requestType27 = bookRequest23.getRequestType();
        java.lang.String str28 = bookRequest23.getBookTitle();
        java.lang.String str29 = bookRequest23.getBookTitle();
        boolean boolean30 = bookRequest2.equals((java.lang.Object) bookRequest23);
        gui.RequestType requestType32 = null;
        gui.BookRequest bookRequest33 = new gui.BookRequest("", requestType32);
        gui.RequestType requestType34 = null;
        bookRequest33.setRequestType(requestType34);
        java.lang.String str36 = bookRequest33.toCSVString();
        gui.RequestType requestType37 = null;
        bookRequest33.setRequestType(requestType37);
        java.lang.String str39 = bookRequest33.getBookTitle();
        boolean boolean41 = bookRequest33.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType43 = null;
        gui.BookRequest bookRequest44 = new gui.BookRequest("", requestType43);
        java.lang.String str45 = bookRequest44.toCSVString();
        bookRequest44.setBookTitle("hi!");
        bookRequest44.setBookTitle(",null");
        boolean boolean50 = bookRequest33.equals((java.lang.Object) bookRequest44);
        gui.RequestType requestType51 = null;
        bookRequest33.setRequestType(requestType51);
        bookRequest33.setBookTitle("hi!,null,null");
        java.lang.String str55 = bookRequest33.toCSVString();
        boolean boolean56 = bookRequest2.equals((java.lang.Object) bookRequest33);
        gui.RequestType requestType57 = null;
        bookRequest2.setRequestType(requestType57);
        org.junit.Assert.assertNull(requestType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(requestType20);
        org.junit.Assert.assertNull(requestType24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(requestType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ",null" + "'", str36, ",null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + ",null" + "'", str45, ",null");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!,null,null,null" + "'", str55, "hi!,null,null,null");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType13 = null;
        bookRequest10.setRequestType(requestType13);
        bookRequest10.setBookTitle("hi!");
        gui.RequestType requestType18 = null;
        gui.BookRequest bookRequest19 = new gui.BookRequest("", requestType18);
        gui.RequestType requestType20 = null;
        bookRequest19.setRequestType(requestType20);
        gui.RequestType requestType22 = bookRequest19.getRequestType();
        bookRequest19.setBookTitle("hi!");
        bookRequest19.setBookTitle(",null");
        gui.RequestType requestType28 = null;
        gui.BookRequest bookRequest29 = new gui.BookRequest("", requestType28);
        bookRequest29.setBookTitle("");
        gui.RequestType requestType32 = null;
        bookRequest29.setRequestType(requestType32);
        java.lang.String str34 = bookRequest29.toCSVString();
        boolean boolean35 = bookRequest19.equals((java.lang.Object) str34);
        boolean boolean36 = bookRequest10.equals((java.lang.Object) str34);
        java.lang.String str37 = bookRequest10.getBookTitle();
        boolean boolean38 = bookRequest2.equals((java.lang.Object) bookRequest10);
        gui.RequestType requestType39 = null;
        bookRequest2.setRequestType(requestType39);
        java.lang.String str41 = bookRequest2.toCSVString();
        java.lang.String str42 = bookRequest2.toCSVString();
        java.lang.String str43 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass44 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertNull(requestType22);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ",null" + "'", str34, ",null");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!,null" + "'", str41, "hi!,null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!,null" + "'", str42, "hi!,null");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!,null" + "'", str43, "hi!,null");
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.getBookTitle();
        gui.RequestType requestType8 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!,null,null,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(requestType8);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        gui.BookRequest bookRequest9 = new gui.BookRequest("", requestType8);
        java.lang.String str10 = bookRequest9.getBookTitle();
        java.lang.String str11 = bookRequest9.toCSVString();
        boolean boolean12 = bookRequest2.equals((java.lang.Object) bookRequest9);
        gui.RequestType requestType13 = null;
        bookRequest9.setRequestType(requestType13);
        gui.RequestType requestType15 = bookRequest9.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(requestType15);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle("");
        java.lang.String str13 = bookRequest2.toCSVString();
        java.lang.String str14 = bookRequest2.toCSVString();
        gui.RequestType requestType15 = null;
        bookRequest2.setRequestType(requestType15);
        java.lang.String str17 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass18 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",null" + "'", str13, ",null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ",null" + "'", str17, ",null");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType13 = null;
        bookRequest10.setRequestType(requestType13);
        bookRequest10.setBookTitle("hi!");
        boolean boolean17 = bookRequest2.equals((java.lang.Object) bookRequest10);
        bookRequest10.setBookTitle("");
        java.lang.String str20 = bookRequest10.toCSVString();
        gui.RequestType requestType21 = bookRequest10.getRequestType();
        java.lang.Class<?> wildcardClass22 = bookRequest10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ",null" + "'", str20, ",null");
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.getBookTitle();
        java.lang.String str15 = bookRequest13.toCSVString();
        java.lang.String str16 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle(",null");
        java.lang.String str19 = bookRequest13.toCSVString();
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        java.lang.String str23 = bookRequest22.toCSVString();
        bookRequest22.setBookTitle("hi!");
        gui.RequestType requestType26 = null;
        bookRequest22.setRequestType(requestType26);
        java.lang.String str28 = bookRequest22.getBookTitle();
        java.lang.String str29 = bookRequest22.toCSVString();
        gui.RequestType requestType31 = null;
        gui.BookRequest bookRequest32 = new gui.BookRequest("", requestType31);
        java.lang.String str33 = bookRequest32.getBookTitle();
        java.lang.String str34 = bookRequest32.toCSVString();
        gui.RequestType requestType35 = null;
        bookRequest32.setRequestType(requestType35);
        gui.RequestType requestType37 = null;
        bookRequest32.setRequestType(requestType37);
        bookRequest32.setBookTitle("hi!");
        boolean boolean41 = bookRequest22.equals((java.lang.Object) bookRequest32);
        gui.RequestType requestType43 = null;
        gui.BookRequest bookRequest44 = new gui.BookRequest("", requestType43);
        bookRequest44.setBookTitle("");
        gui.RequestType requestType47 = null;
        bookRequest44.setRequestType(requestType47);
        gui.RequestType requestType49 = null;
        bookRequest44.setRequestType(requestType49);
        bookRequest44.setBookTitle("hi!");
        boolean boolean53 = bookRequest32.equals((java.lang.Object) bookRequest44);
        boolean boolean54 = bookRequest13.equals((java.lang.Object) bookRequest32);
        java.lang.String str55 = bookRequest32.toCSVString();
        boolean boolean56 = bookRequest2.equals((java.lang.Object) str55);
        java.lang.String str57 = bookRequest2.getBookTitle();
        java.lang.String str58 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ",null,null" + "'", str19, ",null,null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ",null" + "'", str23, ",null");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!,null" + "'", str29, "hi!,null");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ",null" + "'", str34, ",null");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!,null" + "'", str55, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertNull(requestType10);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("");
        gui.RequestType requestType8 = bookRequest2.getRequestType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = requestType8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertNull(requestType8);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        bookRequest2.setBookTitle(",null,null");
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        gui.RequestType requestType14 = null;
        bookRequest2.setRequestType(requestType14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType4 = null;
        gui.BookRequest bookRequest5 = new gui.BookRequest("", requestType4);
        java.lang.String str6 = bookRequest5.toCSVString();
        java.lang.String str7 = bookRequest5.toCSVString();
        gui.RequestType requestType8 = bookRequest5.getRequestType();
        bookRequest5.setBookTitle("");
        java.lang.String str11 = bookRequest5.getBookTitle();
        bookRequest5.setBookTitle("hi!,null");
        boolean boolean14 = bookRequest2.equals((java.lang.Object) bookRequest5);
        java.lang.String str15 = bookRequest5.toCSVString();
        java.lang.Class<?> wildcardClass16 = bookRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertNull(requestType8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!,null,null" + "'", str15, "hi!,null,null");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType13 = null;
        bookRequest10.setRequestType(requestType13);
        java.lang.String str15 = bookRequest10.toCSVString();
        boolean boolean17 = bookRequest10.equals((java.lang.Object) (short) 0);
        bookRequest10.setBookTitle("hi!,null,null");
        boolean boolean20 = bookRequest2.equals((java.lang.Object) "hi!,null,null");
        gui.RequestType requestType22 = null;
        gui.BookRequest bookRequest23 = new gui.BookRequest("", requestType22);
        java.lang.String str24 = bookRequest23.toCSVString();
        bookRequest23.setBookTitle("hi!");
        gui.RequestType requestType27 = null;
        bookRequest23.setRequestType(requestType27);
        java.lang.String str29 = bookRequest23.getBookTitle();
        java.lang.String str30 = bookRequest23.toCSVString();
        java.lang.String str31 = bookRequest23.getBookTitle();
        boolean boolean32 = bookRequest2.equals((java.lang.Object) bookRequest23);
        gui.RequestType requestType33 = null;
        bookRequest2.setRequestType(requestType33);
        gui.RequestType requestType35 = null;
        bookRequest2.setRequestType(requestType35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ",null" + "'", str24, ",null");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!,null" + "'", str30, "hi!,null");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("", requestType7);
        java.lang.String str9 = bookRequest8.toCSVString();
        java.lang.String str10 = bookRequest8.toCSVString();
        boolean boolean11 = bookRequest2.equals((java.lang.Object) bookRequest8);
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest2.getRequestType();
        gui.RequestType requestType15 = bookRequest2.getRequestType();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) (short) -1);
        bookRequest2.setBookTitle("hi!,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertNull(requestType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("", requestType7);
        java.lang.String str9 = bookRequest8.toCSVString();
        java.lang.String str10 = bookRequest8.toCSVString();
        boolean boolean11 = bookRequest2.equals((java.lang.Object) bookRequest8);
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest2.getRequestType();
        gui.RequestType requestType15 = bookRequest2.getRequestType();
        java.lang.String str16 = bookRequest2.getBookTitle();
        java.lang.Object obj17 = null;
        boolean boolean18 = bookRequest2.equals(obj17);
        gui.RequestType requestType19 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertNull(requestType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(requestType19);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        java.lang.String str6 = bookRequest2.toCSVString();
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("");
        java.lang.String str11 = bookRequest2.getBookTitle();
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        gui.RequestType requestType15 = null;
        bookRequest14.setRequestType(requestType15);
        gui.RequestType requestType17 = bookRequest14.getRequestType();
        bookRequest14.setBookTitle("hi!");
        gui.RequestType requestType20 = null;
        bookRequest14.setRequestType(requestType20);
        gui.RequestType requestType22 = null;
        bookRequest14.setRequestType(requestType22);
        gui.RequestType requestType25 = null;
        gui.BookRequest bookRequest26 = new gui.BookRequest("", requestType25);
        java.lang.String str27 = bookRequest26.getBookTitle();
        java.lang.String str28 = bookRequest26.getBookTitle();
        bookRequest26.setBookTitle(",null");
        gui.RequestType requestType31 = null;
        bookRequest26.setRequestType(requestType31);
        boolean boolean33 = bookRequest14.equals((java.lang.Object) requestType31);
        boolean boolean35 = bookRequest14.equals((java.lang.Object) (short) 1);
        gui.RequestType requestType37 = null;
        gui.BookRequest bookRequest38 = new gui.BookRequest("hi!,null", requestType37);
        gui.RequestType requestType40 = null;
        gui.BookRequest bookRequest41 = new gui.BookRequest("", requestType40);
        bookRequest41.setBookTitle("");
        gui.RequestType requestType44 = null;
        bookRequest41.setRequestType(requestType44);
        bookRequest41.setBookTitle("hi!");
        java.lang.String str48 = bookRequest41.toCSVString();
        boolean boolean49 = bookRequest38.equals((java.lang.Object) str48);
        boolean boolean50 = bookRequest14.equals((java.lang.Object) str48);
        java.lang.Class<?> wildcardClass51 = bookRequest14.getClass();
        boolean boolean52 = bookRequest2.equals((java.lang.Object) wildcardClass51);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",null" + "'", str8, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(requestType17);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!,null" + "'", str48, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        java.lang.String str13 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass14 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertNull(requestType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        java.lang.Object obj4 = null;
        boolean boolean5 = bookRequest2.equals(obj4);
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        java.lang.String str7 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null,null,null");
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(requestType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.getBookTitle();
        java.lang.String str16 = bookRequest14.getBookTitle();
        bookRequest14.setBookTitle(",null");
        gui.RequestType requestType19 = null;
        bookRequest14.setRequestType(requestType19);
        boolean boolean21 = bookRequest2.equals((java.lang.Object) requestType19);
        java.lang.String str22 = bookRequest2.toCSVString();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!,null" + "'", str22, "hi!,null");
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null,null" + "'", str7, ",null,null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",null" + "'", str8, ",null");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        boolean boolean10 = bookRequest2.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType20 = null;
        bookRequest2.setRequestType(requestType20);
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType24 = null;
        bookRequest2.setRequestType(requestType24);
        gui.RequestType requestType27 = null;
        gui.BookRequest bookRequest28 = new gui.BookRequest("", requestType27);
        java.lang.String str29 = bookRequest28.toCSVString();
        java.lang.String str30 = bookRequest28.toCSVString();
        gui.RequestType requestType31 = bookRequest28.getRequestType();
        bookRequest28.setBookTitle("");
        java.lang.String str34 = bookRequest28.getBookTitle();
        gui.RequestType requestType35 = null;
        bookRequest28.setRequestType(requestType35);
        gui.RequestType requestType37 = bookRequest28.getRequestType();
        gui.RequestType requestType38 = null;
        bookRequest28.setRequestType(requestType38);
        bookRequest28.setBookTitle("hi!,null,null");
        gui.RequestType requestType43 = null;
        gui.BookRequest bookRequest44 = new gui.BookRequest("", requestType43);
        java.lang.String str45 = bookRequest44.getBookTitle();
        java.lang.String str46 = bookRequest44.toCSVString();
        gui.RequestType requestType47 = null;
        bookRequest44.setRequestType(requestType47);
        gui.RequestType requestType49 = null;
        bookRequest44.setRequestType(requestType49);
        java.lang.String str51 = bookRequest44.toCSVString();
        java.lang.String str52 = bookRequest44.toCSVString();
        java.lang.String str53 = bookRequest44.toCSVString();
        gui.RequestType requestType54 = null;
        bookRequest44.setRequestType(requestType54);
        java.lang.String str56 = bookRequest44.getBookTitle();
        boolean boolean57 = bookRequest28.equals((java.lang.Object) bookRequest44);
        boolean boolean58 = bookRequest2.equals((java.lang.Object) bookRequest44);
        bookRequest44.setBookTitle(",null,null,null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ",null" + "'", str29, ",null");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + ",null" + "'", str30, ",null");
        org.junit.Assert.assertNull(requestType31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(requestType37);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ",null" + "'", str46, ",null");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + ",null" + "'", str51, ",null");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + ",null" + "'", str52, ",null");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + ",null" + "'", str53, ",null");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("", requestType7);
        java.lang.String str9 = bookRequest8.toCSVString();
        java.lang.String str10 = bookRequest8.toCSVString();
        boolean boolean11 = bookRequest2.equals((java.lang.Object) bookRequest8);
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest2.getRequestType();
        gui.RequestType requestType15 = bookRequest2.getRequestType();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) (short) -1);
        java.lang.String str18 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertNull(requestType15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ",null" + "'", str18, ",null");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType6 = null;
        gui.BookRequest bookRequest7 = new gui.BookRequest("", requestType6);
        bookRequest7.setBookTitle("");
        gui.RequestType requestType10 = null;
        bookRequest7.setRequestType(requestType10);
        bookRequest7.setBookTitle("hi!");
        gui.RequestType requestType15 = null;
        gui.BookRequest bookRequest16 = new gui.BookRequest("", requestType15);
        gui.RequestType requestType17 = null;
        bookRequest16.setRequestType(requestType17);
        gui.RequestType requestType19 = bookRequest16.getRequestType();
        bookRequest16.setBookTitle("hi!");
        bookRequest16.setBookTitle(",null");
        gui.RequestType requestType25 = null;
        gui.BookRequest bookRequest26 = new gui.BookRequest("", requestType25);
        bookRequest26.setBookTitle("");
        gui.RequestType requestType29 = null;
        bookRequest26.setRequestType(requestType29);
        java.lang.String str31 = bookRequest26.toCSVString();
        boolean boolean32 = bookRequest16.equals((java.lang.Object) str31);
        boolean boolean33 = bookRequest7.equals((java.lang.Object) str31);
        java.lang.String str34 = bookRequest7.getBookTitle();
        bookRequest7.setBookTitle("");
        gui.RequestType requestType37 = null;
        bookRequest7.setRequestType(requestType37);
        gui.RequestType requestType40 = null;
        gui.BookRequest bookRequest41 = new gui.BookRequest("", requestType40);
        gui.RequestType requestType42 = null;
        bookRequest41.setRequestType(requestType42);
        java.lang.String str44 = bookRequest41.toCSVString();
        gui.RequestType requestType45 = null;
        bookRequest41.setRequestType(requestType45);
        java.lang.String str47 = bookRequest41.getBookTitle();
        java.lang.Class<?> wildcardClass48 = bookRequest41.getClass();
        boolean boolean49 = bookRequest7.equals((java.lang.Object) wildcardClass48);
        boolean boolean50 = bookRequest2.equals((java.lang.Object) boolean49);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertNull(requestType19);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ",null" + "'", str31, ",null");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + ",null" + "'", str44, ",null");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        boolean boolean9 = bookRequest2.equals((java.lang.Object) (short) 0);
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        java.lang.String str13 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null,null,null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(requestType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!,null,null" + "'", str13, "hi!,null,null");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null");
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        gui.RequestType requestType13 = null;
        bookRequest2.setRequestType(requestType13);
        gui.RequestType requestType15 = bookRequest2.getRequestType();
        gui.RequestType requestType16 = null;
        bookRequest2.setRequestType(requestType16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null,null" + "'", str7, ",null,null");
        org.junit.Assert.assertNull(requestType12);
        org.junit.Assert.assertNull(requestType15);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.getBookTitle();
        java.lang.String str6 = bookRequest2.toCSVString();
        java.lang.String str7 = bookRequest2.getBookTitle();
        gui.RequestType requestType8 = bookRequest2.getRequestType();
        java.lang.String str9 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(requestType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null");
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass8 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null,null" + "'", str7, ",null,null");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        gui.RequestType requestType9 = null;
        bookRequest2.setRequestType(requestType9);
        java.lang.String str11 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        java.lang.String str15 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(requestType12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        java.lang.String str29 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType33 = null;
        gui.BookRequest bookRequest34 = new gui.BookRequest("", requestType33);
        java.lang.String str35 = bookRequest34.toCSVString();
        java.lang.String str36 = bookRequest34.toCSVString();
        gui.RequestType requestType37 = bookRequest34.getRequestType();
        bookRequest34.setBookTitle("");
        java.lang.String str40 = bookRequest34.getBookTitle();
        bookRequest34.setBookTitle("hi!,null");
        boolean boolean43 = bookRequest2.equals((java.lang.Object) bookRequest34);
        gui.RequestType requestType44 = bookRequest2.getRequestType();
        gui.RequestType requestType46 = null;
        gui.BookRequest bookRequest47 = new gui.BookRequest("", requestType46);
        java.lang.String str48 = bookRequest47.getBookTitle();
        gui.RequestType requestType49 = null;
        bookRequest47.setRequestType(requestType49);
        gui.RequestType requestType52 = null;
        gui.BookRequest bookRequest53 = new gui.BookRequest("", requestType52);
        java.lang.String str54 = bookRequest53.toCSVString();
        java.lang.String str55 = bookRequest53.toCSVString();
        gui.RequestType requestType56 = bookRequest53.getRequestType();
        bookRequest53.setBookTitle("");
        gui.RequestType requestType59 = null;
        bookRequest53.setRequestType(requestType59);
        java.lang.String str61 = bookRequest53.getBookTitle();
        java.lang.Class<?> wildcardClass62 = bookRequest53.getClass();
        boolean boolean63 = bookRequest47.equals((java.lang.Object) wildcardClass62);
        boolean boolean64 = bookRequest2.equals((java.lang.Object) wildcardClass62);
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + ",null" + "'", str35, ",null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ",null" + "'", str36, ",null");
        org.junit.Assert.assertNull(requestType37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(requestType44);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + ",null" + "'", str54, ",null");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + ",null" + "'", str55, ",null");
        org.junit.Assert.assertNull(requestType56);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType13 = null;
        bookRequest10.setRequestType(requestType13);
        bookRequest10.setBookTitle("hi!");
        gui.RequestType requestType18 = null;
        gui.BookRequest bookRequest19 = new gui.BookRequest("", requestType18);
        gui.RequestType requestType20 = null;
        bookRequest19.setRequestType(requestType20);
        gui.RequestType requestType22 = bookRequest19.getRequestType();
        bookRequest19.setBookTitle("hi!");
        bookRequest19.setBookTitle(",null");
        gui.RequestType requestType28 = null;
        gui.BookRequest bookRequest29 = new gui.BookRequest("", requestType28);
        bookRequest29.setBookTitle("");
        gui.RequestType requestType32 = null;
        bookRequest29.setRequestType(requestType32);
        java.lang.String str34 = bookRequest29.toCSVString();
        boolean boolean35 = bookRequest19.equals((java.lang.Object) str34);
        boolean boolean36 = bookRequest10.equals((java.lang.Object) str34);
        java.lang.String str37 = bookRequest10.getBookTitle();
        boolean boolean38 = bookRequest2.equals((java.lang.Object) bookRequest10);
        gui.RequestType requestType40 = null;
        gui.BookRequest bookRequest41 = new gui.BookRequest("", requestType40);
        bookRequest41.setBookTitle("");
        java.lang.String str44 = bookRequest41.toCSVString();
        boolean boolean45 = bookRequest10.equals((java.lang.Object) str44);
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertNull(requestType22);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ",null" + "'", str34, ",null");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + ",null" + "'", str44, ",null");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        java.lang.String str6 = bookRequest2.toCSVString();
        java.lang.String str7 = bookRequest2.getBookTitle();
        java.lang.String str8 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        bookRequest13.setBookTitle("");
        gui.RequestType requestType16 = null;
        bookRequest13.setRequestType(requestType16);
        gui.RequestType requestType18 = null;
        bookRequest13.setRequestType(requestType18);
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        java.lang.String str23 = bookRequest22.toCSVString();
        bookRequest22.setBookTitle("hi!");
        gui.RequestType requestType26 = null;
        bookRequest22.setRequestType(requestType26);
        java.lang.String str28 = bookRequest22.getBookTitle();
        java.lang.String str29 = bookRequest22.toCSVString();
        bookRequest22.setBookTitle("");
        java.lang.String str32 = bookRequest22.getBookTitle();
        boolean boolean33 = bookRequest13.equals((java.lang.Object) bookRequest22);
        java.lang.String str34 = bookRequest22.toCSVString();
        gui.RequestType requestType35 = bookRequest22.getRequestType();
        java.lang.String str36 = bookRequest22.toCSVString();
        boolean boolean37 = bookRequest2.equals((java.lang.Object) bookRequest22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,null" + "'", str6, "hi!,null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ",null" + "'", str23, ",null");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!,null" + "'", str29, "hi!,null");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ",null" + "'", str34, ",null");
        org.junit.Assert.assertNull(requestType35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ",null" + "'", str36, ",null");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        bookRequest2.setBookTitle(",null,null");
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.toCSVString();
        bookRequest14.setBookTitle("hi!");
        gui.RequestType requestType18 = null;
        bookRequest14.setRequestType(requestType18);
        java.lang.String str20 = bookRequest14.getBookTitle();
        java.lang.String str21 = bookRequest14.toCSVString();
        java.lang.String str22 = bookRequest14.getBookTitle();
        gui.RequestType requestType24 = null;
        gui.BookRequest bookRequest25 = new gui.BookRequest("", requestType24);
        bookRequest25.setBookTitle("");
        gui.RequestType requestType28 = null;
        bookRequest25.setRequestType(requestType28);
        gui.RequestType requestType30 = null;
        bookRequest25.setRequestType(requestType30);
        boolean boolean32 = bookRequest14.equals((java.lang.Object) bookRequest25);
        gui.RequestType requestType33 = bookRequest14.getRequestType();
        gui.RequestType requestType34 = null;
        bookRequest14.setRequestType(requestType34);
        gui.RequestType requestType36 = bookRequest14.getRequestType();
        boolean boolean37 = bookRequest2.equals((java.lang.Object) bookRequest14);
        bookRequest2.setBookTitle("hi!,null,null");
        java.lang.String str40 = bookRequest2.getBookTitle();
        gui.RequestType requestType41 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!,null" + "'", str21, "hi!,null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(requestType33);
        org.junit.Assert.assertNull(requestType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!,null,null" + "'", str40, "hi!,null,null");
        org.junit.Assert.assertNull(requestType41);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType11 = null;
        bookRequest2.setRequestType(requestType11);
        bookRequest2.setBookTitle("hi!");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.getBookTitle();
        java.lang.String str16 = bookRequest14.getBookTitle();
        gui.RequestType requestType17 = null;
        bookRequest14.setRequestType(requestType17);
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest14);
        java.lang.String str20 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass21 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!,null,null" + "'", str20, "hi!,null,null");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        gui.RequestType requestType14 = null;
        bookRequest13.setRequestType(requestType14);
        java.lang.String str16 = bookRequest13.toCSVString();
        gui.RequestType requestType17 = null;
        bookRequest13.setRequestType(requestType17);
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        java.lang.String str23 = bookRequest22.getBookTitle();
        java.lang.String str24 = bookRequest22.getBookTitle();
        boolean boolean25 = bookRequest13.equals((java.lang.Object) str24);
        gui.RequestType requestType26 = null;
        bookRequest13.setRequestType(requestType26);
        java.lang.String str28 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle(",null");
        gui.RequestType requestType32 = null;
        gui.BookRequest bookRequest33 = new gui.BookRequest("", requestType32);
        bookRequest33.setBookTitle("");
        gui.RequestType requestType36 = null;
        bookRequest33.setRequestType(requestType36);
        bookRequest33.setBookTitle("hi!");
        gui.RequestType requestType40 = null;
        bookRequest33.setRequestType(requestType40);
        gui.RequestType requestType42 = bookRequest33.getRequestType();
        boolean boolean43 = bookRequest13.equals((java.lang.Object) bookRequest33);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ",null" + "'", str28, ",null");
        org.junit.Assert.assertNull(requestType42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType6 = null;
        gui.BookRequest bookRequest7 = new gui.BookRequest("", requestType6);
        bookRequest7.setBookTitle("");
        gui.RequestType requestType10 = null;
        bookRequest7.setRequestType(requestType10);
        java.lang.String str12 = bookRequest7.toCSVString();
        boolean boolean14 = bookRequest7.equals((java.lang.Object) (short) 0);
        boolean boolean15 = bookRequest2.equals((java.lang.Object) boolean14);
        java.lang.String str16 = bookRequest2.toCSVString();
        java.lang.String str17 = bookRequest2.toCSVString();
        java.lang.String str18 = bookRequest2.toCSVString();
        java.lang.String str19 = bookRequest2.getBookTitle();
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        java.lang.String str23 = bookRequest22.getBookTitle();
        gui.RequestType requestType24 = null;
        bookRequest22.setRequestType(requestType24);
        gui.RequestType requestType27 = null;
        gui.BookRequest bookRequest28 = new gui.BookRequest("", requestType27);
        java.lang.String str29 = bookRequest28.toCSVString();
        java.lang.String str30 = bookRequest28.toCSVString();
        gui.RequestType requestType31 = bookRequest28.getRequestType();
        bookRequest28.setBookTitle("");
        gui.RequestType requestType34 = null;
        bookRequest28.setRequestType(requestType34);
        java.lang.String str36 = bookRequest28.getBookTitle();
        java.lang.Class<?> wildcardClass37 = bookRequest28.getClass();
        boolean boolean38 = bookRequest22.equals((java.lang.Object) wildcardClass37);
        gui.RequestType requestType40 = null;
        gui.BookRequest bookRequest41 = new gui.BookRequest("", requestType40);
        java.lang.String str42 = bookRequest41.getBookTitle();
        gui.RequestType requestType43 = null;
        bookRequest41.setRequestType(requestType43);
        java.lang.String str45 = bookRequest41.toCSVString();
        java.lang.String str46 = bookRequest41.toCSVString();
        boolean boolean47 = bookRequest22.equals((java.lang.Object) str46);
        gui.RequestType requestType48 = bookRequest22.getRequestType();
        gui.RequestType requestType49 = null;
        bookRequest22.setRequestType(requestType49);
        boolean boolean51 = bookRequest2.equals((java.lang.Object) bookRequest22);
        gui.RequestType requestType52 = bookRequest22.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ",null" + "'", str17, ",null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ",null" + "'", str18, ",null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ",null" + "'", str29, ",null");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + ",null" + "'", str30, ",null");
        org.junit.Assert.assertNull(requestType31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + ",null" + "'", str45, ",null");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ",null" + "'", str46, ",null");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(requestType48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(requestType52);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        java.lang.String str6 = bookRequest2.toCSVString();
        java.lang.String str7 = bookRequest2.getBookTitle();
        java.lang.String str8 = bookRequest2.getBookTitle();
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        java.lang.String str12 = bookRequest11.toCSVString();
        java.lang.String str13 = bookRequest11.toCSVString();
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("");
        java.lang.String str17 = bookRequest11.getBookTitle();
        gui.RequestType requestType18 = null;
        bookRequest11.setRequestType(requestType18);
        gui.RequestType requestType20 = bookRequest11.getRequestType();
        gui.RequestType requestType21 = null;
        bookRequest11.setRequestType(requestType21);
        boolean boolean23 = bookRequest2.equals((java.lang.Object) requestType21);
        java.lang.Class<?> wildcardClass24 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,null" + "'", str6, "hi!,null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",null" + "'", str13, ",null");
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(requestType20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType30 = null;
        gui.BookRequest bookRequest31 = new gui.BookRequest("", requestType30);
        java.lang.String str32 = bookRequest31.getBookTitle();
        gui.RequestType requestType33 = null;
        bookRequest31.setRequestType(requestType33);
        java.lang.String str35 = bookRequest31.getBookTitle();
        boolean boolean36 = bookRequest2.equals((java.lang.Object) str35);
        gui.RequestType requestType37 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle(",null,null");
        java.lang.String str40 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null,null,null");
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(requestType37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ",null,null" + "'", str40, ",null,null");
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        bookRequest2.setBookTitle("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNull(requestType5);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType30 = null;
        gui.BookRequest bookRequest31 = new gui.BookRequest("", requestType30);
        java.lang.String str32 = bookRequest31.getBookTitle();
        gui.RequestType requestType33 = null;
        bookRequest31.setRequestType(requestType33);
        java.lang.String str35 = bookRequest31.getBookTitle();
        boolean boolean36 = bookRequest2.equals((java.lang.Object) str35);
        bookRequest2.setBookTitle(",null,null");
        java.lang.String str39 = bookRequest2.getBookTitle();
        gui.RequestType requestType41 = null;
        gui.BookRequest bookRequest42 = new gui.BookRequest("", requestType41);
        java.lang.String str43 = bookRequest42.toCSVString();
        bookRequest42.setBookTitle("hi!");
        bookRequest42.setBookTitle(",null");
        gui.RequestType requestType48 = null;
        bookRequest42.setRequestType(requestType48);
        gui.RequestType requestType50 = null;
        bookRequest42.setRequestType(requestType50);
        boolean boolean52 = bookRequest2.equals((java.lang.Object) bookRequest42);
        java.lang.String str53 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass54 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + ",null,null" + "'", str39, ",null,null");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + ",null" + "'", str43, ",null");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + ",null,null,null" + "'", str53, ",null,null,null");
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("hi!", requestType7);
        gui.RequestType requestType9 = bookRequest8.getRequestType();
        gui.RequestType requestType10 = null;
        bookRequest8.setRequestType(requestType10);
        boolean boolean13 = bookRequest8.equals((java.lang.Object) 'a');
        java.lang.String str14 = bookRequest8.getBookTitle();
        gui.RequestType requestType15 = bookRequest8.getRequestType();
        bookRequest8.setBookTitle(",null,null,null");
        java.lang.String str18 = bookRequest8.toCSVString();
        bookRequest8.setBookTitle(",null");
        boolean boolean21 = bookRequest2.equals((java.lang.Object) bookRequest8);
        java.lang.Class<?> wildcardClass22 = bookRequest8.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(requestType15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ",null,null,null,null" + "'", str18, ",null,null,null,null");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null");
        java.lang.String str8 = bookRequest2.toCSVString();
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        java.lang.String str12 = bookRequest11.toCSVString();
        bookRequest11.setBookTitle("hi!");
        gui.RequestType requestType15 = null;
        bookRequest11.setRequestType(requestType15);
        java.lang.String str17 = bookRequest11.getBookTitle();
        java.lang.String str18 = bookRequest11.toCSVString();
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        java.lang.String str22 = bookRequest21.getBookTitle();
        java.lang.String str23 = bookRequest21.toCSVString();
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        gui.RequestType requestType26 = null;
        bookRequest21.setRequestType(requestType26);
        bookRequest21.setBookTitle("hi!");
        boolean boolean30 = bookRequest11.equals((java.lang.Object) bookRequest21);
        gui.RequestType requestType32 = null;
        gui.BookRequest bookRequest33 = new gui.BookRequest("", requestType32);
        bookRequest33.setBookTitle("");
        gui.RequestType requestType36 = null;
        bookRequest33.setRequestType(requestType36);
        gui.RequestType requestType38 = null;
        bookRequest33.setRequestType(requestType38);
        bookRequest33.setBookTitle("hi!");
        boolean boolean42 = bookRequest21.equals((java.lang.Object) bookRequest33);
        boolean boolean43 = bookRequest2.equals((java.lang.Object) bookRequest21);
        bookRequest21.setBookTitle(",null,null,null");
        bookRequest21.setBookTitle("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",null,null" + "'", str8, ",null,null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!,null" + "'", str18, "hi!,null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ",null" + "'", str23, ",null");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        boolean boolean9 = bookRequest2.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        java.lang.Class<?> wildcardClass12 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        boolean boolean9 = bookRequest2.equals((java.lang.Object) (short) 0);
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.getBookTitle();
        java.lang.String str16 = bookRequest14.toCSVString();
        java.lang.String str17 = bookRequest14.getBookTitle();
        java.lang.String str18 = bookRequest14.getBookTitle();
        gui.RequestType requestType19 = bookRequest14.getRequestType();
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest14);
        gui.RequestType requestType21 = bookRequest14.getRequestType();
        bookRequest14.setBookTitle(",null,null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(requestType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(requestType21);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        java.lang.String str11 = bookRequest10.getBookTitle();
        gui.RequestType requestType12 = null;
        bookRequest10.setRequestType(requestType12);
        java.lang.String str14 = bookRequest10.toCSVString();
        java.lang.String str15 = bookRequest10.getBookTitle();
        bookRequest10.setBookTitle("hi!,null,null,null");
        java.lang.Class<?> wildcardClass18 = bookRequest10.getClass();
        boolean boolean19 = bookRequest2.equals((java.lang.Object) wildcardClass18);
        gui.RequestType requestType20 = bookRequest2.getRequestType();
        java.lang.String str21 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertNull(requestType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(requestType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        boolean boolean6 = bookRequest2.equals((java.lang.Object) 10L);
        boolean boolean8 = bookRequest2.equals((java.lang.Object) 'a');
        java.lang.String str9 = bookRequest2.getBookTitle();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType11 = bookRequest2.getRequestType();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(requestType11);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType4 = null;
        gui.BookRequest bookRequest5 = new gui.BookRequest("", requestType4);
        java.lang.String str6 = bookRequest5.toCSVString();
        java.lang.String str7 = bookRequest5.toCSVString();
        gui.RequestType requestType8 = bookRequest5.getRequestType();
        bookRequest5.setBookTitle("");
        java.lang.String str11 = bookRequest5.getBookTitle();
        bookRequest5.setBookTitle("hi!,null");
        boolean boolean14 = bookRequest2.equals((java.lang.Object) bookRequest5);
        java.lang.String str15 = bookRequest5.getBookTitle();
        gui.RequestType requestType16 = bookRequest5.getRequestType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertNull(requestType8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!,null" + "'", str15, "hi!,null");
        org.junit.Assert.assertNull(requestType16);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        bookRequest2.setBookTitle("hi!,null,null");
        bookRequest2.setBookTitle("hi!");
        org.junit.Assert.assertNull(requestType5);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.Class<?> wildcardClass7 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        boolean boolean7 = bookRequest2.equals((java.lang.Object) 'a');
        java.lang.String str8 = bookRequest2.getBookTitle();
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        java.lang.Class<?> wildcardClass10 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        bookRequest2.setBookTitle("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        boolean boolean8 = bookRequest2.equals((java.lang.Object) (-1.0d));
        bookRequest2.setBookTitle("hi!,null,null,null");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        gui.RequestType requestType14 = null;
        bookRequest13.setRequestType(requestType14);
        boolean boolean17 = bookRequest13.equals((java.lang.Object) 10L);
        boolean boolean19 = bookRequest13.equals((java.lang.Object) 'a');
        java.lang.String str20 = bookRequest13.getBookTitle();
        java.lang.String str21 = bookRequest13.getBookTitle();
        java.lang.String str22 = bookRequest13.getBookTitle();
        boolean boolean23 = bookRequest2.equals((java.lang.Object) str22);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType13 = null;
        bookRequest10.setRequestType(requestType13);
        bookRequest10.setBookTitle("hi!");
        boolean boolean17 = bookRequest2.equals((java.lang.Object) bookRequest10);
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        bookRequest22.setBookTitle("");
        gui.RequestType requestType26 = null;
        gui.BookRequest bookRequest27 = new gui.BookRequest("", requestType26);
        bookRequest27.setBookTitle("");
        gui.RequestType requestType30 = null;
        bookRequest27.setRequestType(requestType30);
        gui.RequestType requestType32 = null;
        bookRequest27.setRequestType(requestType32);
        bookRequest27.setBookTitle("hi!");
        gui.RequestType requestType36 = bookRequest27.getRequestType();
        boolean boolean37 = bookRequest22.equals((java.lang.Object) bookRequest27);
        bookRequest22.setBookTitle("hi!,null");
        gui.RequestType requestType40 = bookRequest22.getRequestType();
        gui.RequestType requestType42 = null;
        gui.BookRequest bookRequest43 = new gui.BookRequest("hi!", requestType42);
        gui.RequestType requestType44 = bookRequest43.getRequestType();
        java.lang.Object obj45 = null;
        boolean boolean46 = bookRequest43.equals(obj45);
        gui.RequestType requestType47 = bookRequest43.getRequestType();
        java.lang.String str48 = bookRequest43.getBookTitle();
        java.lang.String str49 = bookRequest43.getBookTitle();
        boolean boolean50 = bookRequest22.equals((java.lang.Object) bookRequest43);
        bookRequest43.setBookTitle("hi!");
        boolean boolean53 = bookRequest2.equals((java.lang.Object) bookRequest43);
        gui.RequestType requestType55 = null;
        gui.BookRequest bookRequest56 = new gui.BookRequest("", requestType55);
        java.lang.String str57 = bookRequest56.getBookTitle();
        gui.RequestType requestType58 = bookRequest56.getRequestType();
        gui.RequestType requestType59 = null;
        bookRequest56.setRequestType(requestType59);
        java.lang.String str61 = bookRequest56.toCSVString();
        java.lang.String str62 = bookRequest56.toCSVString();
        boolean boolean63 = bookRequest43.equals((java.lang.Object) str62);
        bookRequest43.setBookTitle("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(requestType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(requestType40);
        org.junit.Assert.assertNull(requestType44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(requestType47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNull(requestType58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + ",null" + "'", str61, ",null");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + ",null" + "'", str62, ",null");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        boolean boolean7 = bookRequest2.equals((java.lang.Object) 'a');
        java.lang.String str8 = bookRequest2.getBookTitle();
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        java.lang.String str10 = bookRequest2.toCSVString();
        gui.RequestType requestType11 = bookRequest2.getRequestType();
        java.lang.String str12 = bookRequest2.getBookTitle();
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!,null" + "'", str10, "hi!,null");
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("");
        java.lang.String str8 = bookRequest2.getBookTitle();
        gui.RequestType requestType9 = null;
        bookRequest2.setRequestType(requestType9);
        gui.RequestType requestType11 = bookRequest2.getRequestType();
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        bookRequest2.setBookTitle("hi!,null,null");
        java.lang.String str16 = bookRequest2.getBookTitle();
        gui.RequestType requestType18 = null;
        gui.BookRequest bookRequest19 = new gui.BookRequest("", requestType18);
        java.lang.String str20 = bookRequest19.toCSVString();
        bookRequest19.setBookTitle("hi!");
        gui.RequestType requestType23 = null;
        bookRequest19.setRequestType(requestType23);
        java.lang.String str25 = bookRequest19.getBookTitle();
        java.lang.String str26 = bookRequest19.toCSVString();
        java.lang.String str27 = bookRequest19.getBookTitle();
        gui.RequestType requestType29 = null;
        gui.BookRequest bookRequest30 = new gui.BookRequest("", requestType29);
        bookRequest30.setBookTitle("");
        gui.RequestType requestType33 = null;
        bookRequest30.setRequestType(requestType33);
        gui.RequestType requestType35 = null;
        bookRequest30.setRequestType(requestType35);
        boolean boolean37 = bookRequest19.equals((java.lang.Object) bookRequest30);
        gui.RequestType requestType38 = bookRequest19.getRequestType();
        java.lang.Class<?> wildcardClass39 = bookRequest19.getClass();
        boolean boolean40 = bookRequest2.equals((java.lang.Object) wildcardClass39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!,null,null" + "'", str16, "hi!,null,null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ",null" + "'", str20, ",null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!,null" + "'", str26, "hi!,null");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(requestType38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        java.lang.String str6 = bookRequest2.getBookTitle();
        java.lang.String str7 = bookRequest2.getBookTitle();
        java.lang.String str8 = bookRequest2.getBookTitle();
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        java.lang.String str12 = bookRequest11.getBookTitle();
        gui.RequestType requestType13 = null;
        bookRequest11.setRequestType(requestType13);
        java.lang.String str15 = bookRequest11.toCSVString();
        java.lang.String str16 = bookRequest11.getBookTitle();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) str16);
        java.lang.String str18 = bookRequest2.toCSVString();
        java.lang.String str19 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ",null" + "'", str18, ",null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        java.lang.String str13 = bookRequest12.getBookTitle();
        java.lang.String str14 = bookRequest12.toCSVString();
        gui.RequestType requestType15 = null;
        bookRequest12.setRequestType(requestType15);
        gui.RequestType requestType17 = null;
        bookRequest12.setRequestType(requestType17);
        bookRequest12.setBookTitle("hi!");
        boolean boolean21 = bookRequest2.equals((java.lang.Object) bookRequest12);
        java.lang.String str22 = bookRequest12.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!,null" + "'", str22, "hi!,null");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType11 = null;
        bookRequest2.setRequestType(requestType11);
        gui.RequestType requestType13 = null;
        bookRequest2.setRequestType(requestType13);
        gui.RequestType requestType15 = bookRequest2.getRequestType();
        gui.RequestType requestType16 = null;
        bookRequest2.setRequestType(requestType16);
        org.junit.Assert.assertNull(requestType15);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        gui.BookRequest bookRequest9 = new gui.BookRequest("", requestType8);
        java.lang.String str10 = bookRequest9.getBookTitle();
        java.lang.String str11 = bookRequest9.toCSVString();
        boolean boolean12 = bookRequest2.equals((java.lang.Object) bookRequest9);
        gui.RequestType requestType13 = null;
        bookRequest2.setRequestType(requestType13);
        gui.RequestType requestType15 = null;
        bookRequest2.setRequestType(requestType15);
        gui.RequestType requestType17 = null;
        bookRequest2.setRequestType(requestType17);
        java.lang.Class<?> wildcardClass19 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!,null,null,null");
        java.lang.String str13 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass14 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertNull(requestType10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!,null,null,null" + "'", str13, "hi!,null,null,null");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        bookRequest12.setBookTitle("");
        gui.RequestType requestType15 = null;
        bookRequest12.setRequestType(requestType15);
        java.lang.String str17 = bookRequest12.toCSVString();
        java.lang.String str18 = bookRequest12.getBookTitle();
        bookRequest12.setBookTitle("hi!,null");
        gui.RequestType requestType22 = null;
        gui.BookRequest bookRequest23 = new gui.BookRequest("", requestType22);
        gui.RequestType requestType24 = null;
        bookRequest23.setRequestType(requestType24);
        java.lang.String str26 = bookRequest23.toCSVString();
        gui.RequestType requestType27 = null;
        bookRequest23.setRequestType(requestType27);
        boolean boolean29 = bookRequest12.equals((java.lang.Object) bookRequest23);
        boolean boolean30 = bookRequest2.equals((java.lang.Object) bookRequest23);
        gui.RequestType requestType31 = bookRequest23.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ",null" + "'", str17, ",null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(requestType31);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        bookRequest21.setBookTitle("hi!");
        boolean boolean28 = bookRequest13.equals((java.lang.Object) bookRequest21);
        boolean boolean29 = bookRequest2.equals((java.lang.Object) boolean28);
        gui.RequestType requestType31 = null;
        gui.BookRequest bookRequest32 = new gui.BookRequest("", requestType31);
        java.lang.String str33 = bookRequest32.getBookTitle();
        gui.RequestType requestType34 = bookRequest32.getRequestType();
        gui.RequestType requestType35 = null;
        bookRequest32.setRequestType(requestType35);
        java.lang.String str37 = bookRequest32.toCSVString();
        java.lang.String str38 = bookRequest32.toCSVString();
        boolean boolean39 = bookRequest2.equals((java.lang.Object) str38);
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType42 = bookRequest2.getRequestType();
        java.lang.Class<?> wildcardClass43 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(requestType34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ",null" + "'", str37, ",null");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + ",null" + "'", str38, ",null");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(requestType42);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        bookRequest2.setBookTitle("");
        java.lang.Class<?> wildcardClass10 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        boolean boolean10 = bookRequest2.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        bookRequest13.setBookTitle(",null");
        bookRequest13.setBookTitle(",null");
        gui.RequestType requestType24 = null;
        bookRequest13.setRequestType(requestType24);
        java.lang.Class<?> wildcardClass26 = bookRequest13.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        java.lang.String str6 = bookRequest2.toCSVString();
        gui.RequestType requestType8 = null;
        gui.BookRequest bookRequest9 = new gui.BookRequest("hi!", requestType8);
        gui.RequestType requestType10 = bookRequest9.getRequestType();
        bookRequest9.setBookTitle(",null");
        gui.RequestType requestType13 = null;
        bookRequest9.setRequestType(requestType13);
        boolean boolean15 = bookRequest2.equals((java.lang.Object) requestType13);
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertNull(requestType10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!,null,null", requestType1);
        java.lang.Class<?> wildcardClass3 = bookRequest2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType30 = null;
        gui.BookRequest bookRequest31 = new gui.BookRequest("", requestType30);
        java.lang.String str32 = bookRequest31.getBookTitle();
        gui.RequestType requestType33 = null;
        bookRequest31.setRequestType(requestType33);
        java.lang.String str35 = bookRequest31.getBookTitle();
        boolean boolean36 = bookRequest2.equals((java.lang.Object) str35);
        gui.RequestType requestType37 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("");
        java.lang.String str40 = bookRequest2.toCSVString();
        gui.RequestType requestType42 = null;
        gui.BookRequest bookRequest43 = new gui.BookRequest("", requestType42);
        java.lang.String str44 = bookRequest43.getBookTitle();
        gui.RequestType requestType45 = null;
        bookRequest43.setRequestType(requestType45);
        gui.RequestType requestType48 = null;
        gui.BookRequest bookRequest49 = new gui.BookRequest("", requestType48);
        java.lang.String str50 = bookRequest49.toCSVString();
        java.lang.String str51 = bookRequest49.toCSVString();
        boolean boolean52 = bookRequest43.equals((java.lang.Object) bookRequest49);
        gui.RequestType requestType53 = null;
        bookRequest43.setRequestType(requestType53);
        boolean boolean55 = bookRequest2.equals((java.lang.Object) requestType53);
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType59 = null;
        gui.BookRequest bookRequest60 = new gui.BookRequest("hi!,null", requestType59);
        gui.RequestType requestType62 = null;
        gui.BookRequest bookRequest63 = new gui.BookRequest("", requestType62);
        bookRequest63.setBookTitle("");
        gui.RequestType requestType66 = null;
        bookRequest63.setRequestType(requestType66);
        bookRequest63.setBookTitle("hi!");
        java.lang.String str70 = bookRequest63.toCSVString();
        boolean boolean71 = bookRequest60.equals((java.lang.Object) str70);
        bookRequest60.setBookTitle(",null");
        boolean boolean74 = bookRequest2.equals((java.lang.Object) bookRequest60);
        java.lang.String str75 = bookRequest60.getBookTitle();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(requestType37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ",null" + "'", str40, ",null");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + ",null" + "'", str50, ",null");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + ",null" + "'", str51, ",null");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!,null" + "'", str70, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + ",null" + "'", str75, ",null");
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        boolean boolean10 = bookRequest2.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType20 = null;
        bookRequest2.setRequestType(requestType20);
        java.lang.String str22 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        java.lang.String str6 = bookRequest2.toCSVString();
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass8 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        java.lang.String str10 = bookRequest2.toCSVString();
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.getBookTitle();
        java.lang.String str15 = bookRequest13.toCSVString();
        gui.RequestType requestType16 = null;
        bookRequest13.setRequestType(requestType16);
        gui.RequestType requestType18 = null;
        bookRequest13.setRequestType(requestType18);
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        gui.RequestType requestType24 = null;
        gui.BookRequest bookRequest25 = new gui.BookRequest("", requestType24);
        java.lang.String str26 = bookRequest25.toCSVString();
        bookRequest25.setBookTitle("hi!");
        gui.RequestType requestType29 = null;
        bookRequest25.setRequestType(requestType29);
        boolean boolean31 = bookRequest22.equals((java.lang.Object) requestType29);
        java.lang.Class<?> wildcardClass32 = bookRequest22.getClass();
        boolean boolean33 = bookRequest13.equals((java.lang.Object) wildcardClass32);
        boolean boolean34 = bookRequest2.equals((java.lang.Object) wildcardClass32);
        gui.RequestType requestType35 = null;
        bookRequest2.setRequestType(requestType35);
        java.lang.String str37 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType30 = null;
        gui.BookRequest bookRequest31 = new gui.BookRequest("", requestType30);
        java.lang.String str32 = bookRequest31.getBookTitle();
        gui.RequestType requestType33 = null;
        bookRequest31.setRequestType(requestType33);
        java.lang.String str35 = bookRequest31.getBookTitle();
        boolean boolean36 = bookRequest2.equals((java.lang.Object) str35);
        java.lang.String str37 = bookRequest2.toCSVString();
        java.lang.String str38 = bookRequest2.toCSVString();
        java.lang.String str39 = bookRequest2.getBookTitle();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!,null" + "'", str37, "hi!,null");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!,null" + "'", str38, "hi!,null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType4 = null;
        gui.BookRequest bookRequest5 = new gui.BookRequest("", requestType4);
        java.lang.String str6 = bookRequest5.toCSVString();
        java.lang.String str7 = bookRequest5.toCSVString();
        gui.RequestType requestType8 = bookRequest5.getRequestType();
        bookRequest5.setBookTitle("");
        java.lang.String str11 = bookRequest5.getBookTitle();
        bookRequest5.setBookTitle("hi!,null");
        boolean boolean14 = bookRequest2.equals((java.lang.Object) bookRequest5);
        java.lang.String str15 = bookRequest5.toCSVString();
        gui.RequestType requestType16 = null;
        bookRequest5.setRequestType(requestType16);
        bookRequest5.setBookTitle("hi!,null,null,null,null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertNull(requestType8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!,null,null" + "'", str15, "hi!,null,null");
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.getBookTitle();
        java.lang.String str16 = bookRequest14.getBookTitle();
        bookRequest14.setBookTitle(",null");
        gui.RequestType requestType19 = null;
        bookRequest14.setRequestType(requestType19);
        boolean boolean21 = bookRequest2.equals((java.lang.Object) requestType19);
        java.lang.String str22 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType27 = null;
        bookRequest2.setRequestType(requestType27);
        java.lang.Class<?> wildcardClass29 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle("");
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType9 = null;
        bookRequest2.setRequestType(requestType9);
        gui.RequestType requestType11 = bookRequest2.getRequestType();
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        gui.RequestType requestType14 = null;
        bookRequest2.setRequestType(requestType14);
        org.junit.Assert.assertNull(requestType11);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType13 = null;
        bookRequest10.setRequestType(requestType13);
        bookRequest10.setBookTitle("hi!");
        gui.RequestType requestType18 = null;
        gui.BookRequest bookRequest19 = new gui.BookRequest("", requestType18);
        gui.RequestType requestType20 = null;
        bookRequest19.setRequestType(requestType20);
        gui.RequestType requestType22 = bookRequest19.getRequestType();
        bookRequest19.setBookTitle("hi!");
        bookRequest19.setBookTitle(",null");
        gui.RequestType requestType28 = null;
        gui.BookRequest bookRequest29 = new gui.BookRequest("", requestType28);
        bookRequest29.setBookTitle("");
        gui.RequestType requestType32 = null;
        bookRequest29.setRequestType(requestType32);
        java.lang.String str34 = bookRequest29.toCSVString();
        boolean boolean35 = bookRequest19.equals((java.lang.Object) str34);
        boolean boolean36 = bookRequest10.equals((java.lang.Object) str34);
        java.lang.String str37 = bookRequest10.getBookTitle();
        boolean boolean38 = bookRequest2.equals((java.lang.Object) bookRequest10);
        java.lang.String str39 = bookRequest10.toCSVString();
        boolean boolean41 = bookRequest10.equals((java.lang.Object) 'a');
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertNull(requestType22);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ",null" + "'", str34, ",null");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!,null" + "'", str39, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.toCSVString();
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("hi!,null,null,null", requestType10);
        java.lang.Class<?> wildcardClass12 = bookRequest11.getClass();
        boolean boolean13 = bookRequest2.equals((java.lang.Object) wildcardClass12);
        gui.RequestType requestType14 = null;
        bookRequest2.setRequestType(requestType14);
        bookRequest2.setBookTitle("hi!,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!,null" + "'", str8, "hi!,null");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        java.lang.String str6 = bookRequest2.toCSVString();
        java.lang.String str7 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null,null,null");
        bookRequest2.setBookTitle("hi!,null,null,null");
        java.lang.Class<?> wildcardClass12 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType6 = null;
        gui.BookRequest bookRequest7 = new gui.BookRequest("", requestType6);
        bookRequest7.setBookTitle("");
        gui.RequestType requestType10 = null;
        bookRequest7.setRequestType(requestType10);
        java.lang.String str12 = bookRequest7.toCSVString();
        boolean boolean14 = bookRequest7.equals((java.lang.Object) (short) 0);
        boolean boolean15 = bookRequest2.equals((java.lang.Object) boolean14);
        bookRequest2.setBookTitle("hi!,null");
        bookRequest2.setBookTitle("hi!,null");
        java.lang.String str20 = bookRequest2.toCSVString();
        gui.RequestType requestType21 = bookRequest2.getRequestType();
        java.lang.String str22 = bookRequest2.getBookTitle();
        java.lang.String str23 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!,null,null" + "'", str20, "hi!,null,null");
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!,null" + "'", str22, "hi!,null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!,null" + "'", str23, "hi!,null");
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        boolean boolean7 = bookRequest2.equals((java.lang.Object) 'a');
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("hi!", requestType11);
        gui.RequestType requestType14 = null;
        gui.BookRequest bookRequest15 = new gui.BookRequest("", requestType14);
        java.lang.String str16 = bookRequest15.toCSVString();
        java.lang.String str17 = bookRequest15.toCSVString();
        gui.RequestType requestType18 = bookRequest15.getRequestType();
        bookRequest15.setBookTitle("");
        java.lang.String str21 = bookRequest15.getBookTitle();
        bookRequest15.setBookTitle("hi!,null");
        boolean boolean24 = bookRequest12.equals((java.lang.Object) bookRequest15);
        bookRequest12.setBookTitle("hi!,null,null");
        boolean boolean27 = bookRequest2.equals((java.lang.Object) "hi!,null,null");
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ",null" + "'", str17, ",null");
        org.junit.Assert.assertNull(requestType18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("");
        java.lang.String str17 = bookRequest13.toCSVString();
        boolean boolean18 = bookRequest2.equals((java.lang.Object) str17);
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ",null" + "'", str17, ",null");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null");
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType14 = null;
        gui.BookRequest bookRequest15 = new gui.BookRequest("", requestType14);
        bookRequest15.setBookTitle("");
        gui.RequestType requestType18 = null;
        bookRequest15.setRequestType(requestType18);
        gui.RequestType requestType20 = null;
        bookRequest15.setRequestType(requestType20);
        bookRequest15.setBookTitle("hi!");
        gui.RequestType requestType24 = bookRequest15.getRequestType();
        boolean boolean25 = bookRequest10.equals((java.lang.Object) bookRequest15);
        bookRequest10.setBookTitle("hi!,null");
        bookRequest10.setBookTitle(",null");
        boolean boolean30 = bookRequest2.equals((java.lang.Object) bookRequest10);
        java.lang.Class<?> wildcardClass31 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null,null" + "'", str7, ",null,null");
        org.junit.Assert.assertNull(requestType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest(",null,null,null", requestType1);
        java.lang.Class<?> wildcardClass3 = bookRequest2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        java.lang.String str11 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertNull(requestType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType6 = null;
        gui.BookRequest bookRequest7 = new gui.BookRequest("", requestType6);
        bookRequest7.setBookTitle("");
        gui.RequestType requestType10 = null;
        bookRequest7.setRequestType(requestType10);
        gui.RequestType requestType12 = null;
        bookRequest7.setRequestType(requestType12);
        bookRequest7.setBookTitle("hi!");
        gui.RequestType requestType16 = bookRequest7.getRequestType();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) bookRequest7);
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType20 = bookRequest2.getRequestType();
        gui.RequestType requestType22 = null;
        gui.BookRequest bookRequest23 = new gui.BookRequest("hi!", requestType22);
        gui.RequestType requestType24 = bookRequest23.getRequestType();
        java.lang.Object obj25 = null;
        boolean boolean26 = bookRequest23.equals(obj25);
        gui.RequestType requestType27 = bookRequest23.getRequestType();
        java.lang.String str28 = bookRequest23.getBookTitle();
        java.lang.String str29 = bookRequest23.getBookTitle();
        boolean boolean30 = bookRequest2.equals((java.lang.Object) bookRequest23);
        bookRequest23.setBookTitle("hi!");
        bookRequest23.setBookTitle(",null");
        java.lang.String str35 = bookRequest23.toCSVString();
        java.lang.Class<?> wildcardClass36 = bookRequest23.getClass();
        org.junit.Assert.assertNull(requestType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(requestType20);
        org.junit.Assert.assertNull(requestType24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(requestType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + ",null,null" + "'", str35, ",null,null");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType6 = null;
        gui.BookRequest bookRequest7 = new gui.BookRequest("", requestType6);
        bookRequest7.setBookTitle("");
        gui.RequestType requestType10 = null;
        bookRequest7.setRequestType(requestType10);
        gui.RequestType requestType12 = null;
        bookRequest7.setRequestType(requestType12);
        bookRequest7.setBookTitle("hi!");
        gui.RequestType requestType16 = bookRequest7.getRequestType();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) bookRequest7);
        gui.RequestType requestType18 = bookRequest7.getRequestType();
        java.lang.Class<?> wildcardClass19 = bookRequest7.getClass();
        org.junit.Assert.assertNull(requestType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(requestType18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        boolean boolean7 = bookRequest2.equals((java.lang.Object) 'a');
        java.lang.String str8 = bookRequest2.getBookTitle();
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle(",null,null,null");
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.getBookTitle();
        java.lang.String str16 = bookRequest14.getBookTitle();
        java.lang.Class<?> wildcardClass17 = bookRequest14.getClass();
        boolean boolean18 = bookRequest2.equals((java.lang.Object) bookRequest14);
        bookRequest14.setBookTitle(",null,null,null,null");
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        java.lang.String str11 = bookRequest10.toCSVString();
        bookRequest10.setBookTitle("hi!");
        gui.RequestType requestType14 = null;
        bookRequest10.setRequestType(requestType14);
        java.lang.String str16 = bookRequest10.getBookTitle();
        java.lang.String str17 = bookRequest10.toCSVString();
        bookRequest10.setBookTitle("");
        boolean boolean20 = bookRequest2.equals((java.lang.Object) "");
        java.lang.String str21 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertNull(requestType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!,null" + "'", str17, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ",null" + "'", str21, ",null");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        java.lang.String str13 = bookRequest12.getBookTitle();
        java.lang.String str14 = bookRequest12.getBookTitle();
        boolean boolean15 = bookRequest2.equals((java.lang.Object) bookRequest12);
        java.lang.String str16 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        bookRequest13.setBookTitle("");
        gui.RequestType requestType16 = null;
        bookRequest13.setRequestType(requestType16);
        gui.RequestType requestType18 = null;
        bookRequest13.setRequestType(requestType18);
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest13);
        bookRequest13.setBookTitle("hi!,null,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        java.lang.String str6 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        bookRequest11.setBookTitle("");
        gui.RequestType requestType14 = null;
        bookRequest11.setRequestType(requestType14);
        java.lang.String str16 = bookRequest11.toCSVString();
        java.lang.String str17 = bookRequest11.getBookTitle();
        bookRequest11.setBookTitle("hi!,null");
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        gui.RequestType requestType23 = null;
        bookRequest22.setRequestType(requestType23);
        java.lang.String str25 = bookRequest22.toCSVString();
        gui.RequestType requestType26 = null;
        bookRequest22.setRequestType(requestType26);
        boolean boolean28 = bookRequest11.equals((java.lang.Object) bookRequest22);
        java.lang.String str29 = bookRequest11.getBookTitle();
        java.lang.String str30 = bookRequest11.toCSVString();
        gui.RequestType requestType31 = bookRequest11.getRequestType();
        gui.RequestType requestType33 = null;
        gui.BookRequest bookRequest34 = new gui.BookRequest("", requestType33);
        java.lang.String str35 = bookRequest34.getBookTitle();
        java.lang.String str36 = bookRequest34.toCSVString();
        gui.RequestType requestType37 = null;
        bookRequest34.setRequestType(requestType37);
        gui.RequestType requestType39 = null;
        bookRequest34.setRequestType(requestType39);
        bookRequest34.setBookTitle("hi!");
        bookRequest34.setBookTitle("");
        java.lang.String str45 = bookRequest34.toCSVString();
        gui.RequestType requestType47 = null;
        gui.BookRequest bookRequest48 = new gui.BookRequest("", requestType47);
        gui.RequestType requestType49 = null;
        bookRequest48.setRequestType(requestType49);
        java.lang.String str51 = bookRequest48.toCSVString();
        gui.RequestType requestType52 = null;
        bookRequest48.setRequestType(requestType52);
        java.lang.String str54 = bookRequest48.getBookTitle();
        boolean boolean56 = bookRequest48.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType58 = null;
        gui.BookRequest bookRequest59 = new gui.BookRequest("", requestType58);
        java.lang.String str60 = bookRequest59.toCSVString();
        bookRequest59.setBookTitle("hi!");
        bookRequest59.setBookTitle(",null");
        boolean boolean65 = bookRequest48.equals((java.lang.Object) bookRequest59);
        gui.RequestType requestType66 = null;
        bookRequest48.setRequestType(requestType66);
        boolean boolean68 = bookRequest34.equals((java.lang.Object) bookRequest48);
        boolean boolean69 = bookRequest11.equals((java.lang.Object) bookRequest34);
        boolean boolean70 = bookRequest2.equals((java.lang.Object) bookRequest34);
        java.lang.String str71 = bookRequest2.toCSVString();
        gui.RequestType requestType72 = null;
        bookRequest2.setRequestType(requestType72);
        gui.RequestType requestType75 = null;
        gui.BookRequest bookRequest76 = new gui.BookRequest(",null", requestType75);
        java.lang.String str77 = bookRequest76.toCSVString();
        boolean boolean78 = bookRequest2.equals((java.lang.Object) str77);
        java.lang.String str79 = bookRequest2.toCSVString();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ",null" + "'", str25, ",null");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!,null" + "'", str29, "hi!,null");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!,null,null" + "'", str30, "hi!,null,null");
        org.junit.Assert.assertNull(requestType31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ",null" + "'", str36, ",null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + ",null" + "'", str45, ",null");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + ",null" + "'", str51, ",null");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + ",null" + "'", str60, ",null");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + ",null" + "'", str71, ",null");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + ",null,null" + "'", str77, ",null,null");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + ",null" + "'", str79, ",null");
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        gui.RequestType requestType14 = null;
        bookRequest13.setRequestType(requestType14);
        java.lang.String str16 = bookRequest13.toCSVString();
        gui.RequestType requestType17 = null;
        bookRequest13.setRequestType(requestType17);
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        java.lang.String str20 = bookRequest2.getBookTitle();
        java.lang.String str21 = bookRequest2.toCSVString();
        gui.RequestType requestType22 = bookRequest2.getRequestType();
        gui.RequestType requestType24 = null;
        gui.BookRequest bookRequest25 = new gui.BookRequest("", requestType24);
        java.lang.String str26 = bookRequest25.getBookTitle();
        java.lang.String str27 = bookRequest25.toCSVString();
        gui.RequestType requestType28 = null;
        bookRequest25.setRequestType(requestType28);
        gui.RequestType requestType30 = null;
        bookRequest25.setRequestType(requestType30);
        bookRequest25.setBookTitle("hi!");
        bookRequest25.setBookTitle("");
        java.lang.String str36 = bookRequest25.toCSVString();
        gui.RequestType requestType38 = null;
        gui.BookRequest bookRequest39 = new gui.BookRequest("", requestType38);
        gui.RequestType requestType40 = null;
        bookRequest39.setRequestType(requestType40);
        java.lang.String str42 = bookRequest39.toCSVString();
        gui.RequestType requestType43 = null;
        bookRequest39.setRequestType(requestType43);
        java.lang.String str45 = bookRequest39.getBookTitle();
        boolean boolean47 = bookRequest39.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType49 = null;
        gui.BookRequest bookRequest50 = new gui.BookRequest("", requestType49);
        java.lang.String str51 = bookRequest50.toCSVString();
        bookRequest50.setBookTitle("hi!");
        bookRequest50.setBookTitle(",null");
        boolean boolean56 = bookRequest39.equals((java.lang.Object) bookRequest50);
        gui.RequestType requestType57 = null;
        bookRequest39.setRequestType(requestType57);
        boolean boolean59 = bookRequest25.equals((java.lang.Object) bookRequest39);
        boolean boolean60 = bookRequest2.equals((java.lang.Object) bookRequest25);
        java.lang.Class<?> wildcardClass61 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!,null" + "'", str20, "hi!,null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!,null,null" + "'", str21, "hi!,null,null");
        org.junit.Assert.assertNull(requestType22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ",null" + "'", str27, ",null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ",null" + "'", str36, ",null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + ",null" + "'", str42, ",null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + ",null" + "'", str51, ",null");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType11 = null;
        bookRequest2.setRequestType(requestType11);
        bookRequest2.setBookTitle("");
        java.lang.String str15 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("");
        bookRequest2.setBookTitle(",null");
        bookRequest2.setBookTitle(",null,null");
        gui.RequestType requestType22 = bookRequest2.getRequestType();
        java.lang.Class<?> wildcardClass23 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertNull(requestType22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.toCSVString();
        java.lang.String str11 = bookRequest2.toCSVString();
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        gui.RequestType requestType14 = null;
        bookRequest2.setRequestType(requestType14);
        java.lang.Class<?> wildcardClass16 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType11 = null;
        bookRequest2.setRequestType(requestType11);
        bookRequest2.setBookTitle("hi!,null,null,null,null");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        java.lang.Object obj4 = null;
        boolean boolean5 = bookRequest2.equals(obj4);
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        java.lang.String str7 = bookRequest2.getBookTitle();
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        java.lang.String str10 = bookRequest2.toCSVString();
        gui.RequestType requestType11 = bookRequest2.getRequestType();
        java.lang.String str12 = bookRequest2.getBookTitle();
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(requestType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!,null" + "'", str10, "hi!,null");
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertNull(requestType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType14 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertNull(requestType14);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle(",null,null,null,null");
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertNull(requestType6);
        org.junit.Assert.assertNull(requestType9);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        java.lang.String str6 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        bookRequest11.setBookTitle("");
        gui.RequestType requestType14 = null;
        bookRequest11.setRequestType(requestType14);
        java.lang.String str16 = bookRequest11.toCSVString();
        java.lang.String str17 = bookRequest11.getBookTitle();
        bookRequest11.setBookTitle("hi!,null");
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        gui.RequestType requestType23 = null;
        bookRequest22.setRequestType(requestType23);
        java.lang.String str25 = bookRequest22.toCSVString();
        gui.RequestType requestType26 = null;
        bookRequest22.setRequestType(requestType26);
        boolean boolean28 = bookRequest11.equals((java.lang.Object) bookRequest22);
        java.lang.String str29 = bookRequest11.getBookTitle();
        java.lang.String str30 = bookRequest11.toCSVString();
        gui.RequestType requestType31 = bookRequest11.getRequestType();
        gui.RequestType requestType33 = null;
        gui.BookRequest bookRequest34 = new gui.BookRequest("", requestType33);
        java.lang.String str35 = bookRequest34.getBookTitle();
        java.lang.String str36 = bookRequest34.toCSVString();
        gui.RequestType requestType37 = null;
        bookRequest34.setRequestType(requestType37);
        gui.RequestType requestType39 = null;
        bookRequest34.setRequestType(requestType39);
        bookRequest34.setBookTitle("hi!");
        bookRequest34.setBookTitle("");
        java.lang.String str45 = bookRequest34.toCSVString();
        gui.RequestType requestType47 = null;
        gui.BookRequest bookRequest48 = new gui.BookRequest("", requestType47);
        gui.RequestType requestType49 = null;
        bookRequest48.setRequestType(requestType49);
        java.lang.String str51 = bookRequest48.toCSVString();
        gui.RequestType requestType52 = null;
        bookRequest48.setRequestType(requestType52);
        java.lang.String str54 = bookRequest48.getBookTitle();
        boolean boolean56 = bookRequest48.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType58 = null;
        gui.BookRequest bookRequest59 = new gui.BookRequest("", requestType58);
        java.lang.String str60 = bookRequest59.toCSVString();
        bookRequest59.setBookTitle("hi!");
        bookRequest59.setBookTitle(",null");
        boolean boolean65 = bookRequest48.equals((java.lang.Object) bookRequest59);
        gui.RequestType requestType66 = null;
        bookRequest48.setRequestType(requestType66);
        boolean boolean68 = bookRequest34.equals((java.lang.Object) bookRequest48);
        boolean boolean69 = bookRequest11.equals((java.lang.Object) bookRequest34);
        boolean boolean70 = bookRequest2.equals((java.lang.Object) bookRequest34);
        bookRequest34.setBookTitle("hi!");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ",null" + "'", str25, ",null");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!,null" + "'", str29, "hi!,null");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!,null,null" + "'", str30, "hi!,null,null");
        org.junit.Assert.assertNull(requestType31);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ",null" + "'", str36, ",null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + ",null" + "'", str45, ",null");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + ",null" + "'", str51, ",null");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + ",null" + "'", str60, ",null");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        java.lang.Object obj4 = null;
        boolean boolean5 = bookRequest2.equals(obj4);
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        java.lang.String str7 = bookRequest2.getBookTitle();
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        java.lang.String str11 = bookRequest2.toCSVString();
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(requestType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(requestType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!,null" + "'", str11, "hi!,null");
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        java.lang.String str5 = bookRequest2.toCSVString();
        java.lang.String str6 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        java.lang.String str12 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!,null");
        java.lang.Class<?> wildcardClass15 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        java.lang.String str6 = bookRequest2.getBookTitle();
        gui.RequestType requestType8 = null;
        gui.BookRequest bookRequest9 = new gui.BookRequest("", requestType8);
        java.lang.String str10 = bookRequest9.toCSVString();
        java.lang.String str11 = bookRequest9.toCSVString();
        gui.RequestType requestType12 = bookRequest9.getRequestType();
        bookRequest9.setBookTitle("");
        java.lang.String str15 = bookRequest9.getBookTitle();
        bookRequest9.setBookTitle("hi!,null");
        gui.RequestType requestType18 = null;
        bookRequest9.setRequestType(requestType18);
        java.lang.String str20 = bookRequest9.toCSVString();
        boolean boolean21 = bookRequest2.equals((java.lang.Object) bookRequest9);
        gui.RequestType requestType23 = null;
        gui.BookRequest bookRequest24 = new gui.BookRequest("hi!", requestType23);
        gui.RequestType requestType26 = null;
        gui.BookRequest bookRequest27 = new gui.BookRequest("", requestType26);
        java.lang.String str28 = bookRequest27.toCSVString();
        java.lang.String str29 = bookRequest27.toCSVString();
        gui.RequestType requestType30 = bookRequest27.getRequestType();
        bookRequest27.setBookTitle("");
        java.lang.String str33 = bookRequest27.getBookTitle();
        bookRequest27.setBookTitle("hi!,null");
        boolean boolean36 = bookRequest24.equals((java.lang.Object) bookRequest27);
        java.lang.String str37 = bookRequest27.getBookTitle();
        java.lang.String str38 = bookRequest27.getBookTitle();
        boolean boolean39 = bookRequest9.equals((java.lang.Object) bookRequest27);
        bookRequest9.setBookTitle("");
        java.lang.String str42 = bookRequest9.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertNull(requestType12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!,null,null" + "'", str20, "hi!,null,null");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ",null" + "'", str28, ",null");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ",null" + "'", str29, ",null");
        org.junit.Assert.assertNull(requestType30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!,null" + "'", str37, "hi!,null");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!,null" + "'", str38, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        boolean boolean10 = bookRequest2.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType20 = null;
        bookRequest2.setRequestType(requestType20);
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType24 = null;
        bookRequest2.setRequestType(requestType24);
        gui.RequestType requestType26 = bookRequest2.getRequestType();
        java.lang.Class<?> wildcardClass27 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(requestType26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle(",null");
        java.lang.String str6 = bookRequest2.toCSVString();
        gui.RequestType requestType7 = bookRequest2.getRequestType();
        java.lang.Class<?> wildcardClass8 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null,null" + "'", str6, ",null,null");
        org.junit.Assert.assertNull(requestType7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null");
        java.lang.String str8 = bookRequest2.toCSVString();
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        java.lang.String str12 = bookRequest11.toCSVString();
        bookRequest11.setBookTitle("hi!");
        gui.RequestType requestType15 = null;
        bookRequest11.setRequestType(requestType15);
        java.lang.String str17 = bookRequest11.getBookTitle();
        java.lang.String str18 = bookRequest11.toCSVString();
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        java.lang.String str22 = bookRequest21.getBookTitle();
        java.lang.String str23 = bookRequest21.toCSVString();
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        gui.RequestType requestType26 = null;
        bookRequest21.setRequestType(requestType26);
        bookRequest21.setBookTitle("hi!");
        boolean boolean30 = bookRequest11.equals((java.lang.Object) bookRequest21);
        gui.RequestType requestType32 = null;
        gui.BookRequest bookRequest33 = new gui.BookRequest("", requestType32);
        bookRequest33.setBookTitle("");
        gui.RequestType requestType36 = null;
        bookRequest33.setRequestType(requestType36);
        gui.RequestType requestType38 = null;
        bookRequest33.setRequestType(requestType38);
        bookRequest33.setBookTitle("hi!");
        boolean boolean42 = bookRequest21.equals((java.lang.Object) bookRequest33);
        boolean boolean43 = bookRequest2.equals((java.lang.Object) bookRequest21);
        java.lang.String str44 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",null,null" + "'", str8, ",null,null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!,null" + "'", str18, "hi!,null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ",null" + "'", str23, ",null");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + ",null" + "'", str44, ",null");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null");
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        gui.RequestType requestType14 = null;
        gui.BookRequest bookRequest15 = new gui.BookRequest("", requestType14);
        java.lang.String str16 = bookRequest15.getBookTitle();
        gui.RequestType requestType17 = null;
        bookRequest15.setRequestType(requestType17);
        java.lang.String str19 = bookRequest15.toCSVString();
        java.lang.String str20 = bookRequest15.toCSVString();
        gui.RequestType requestType21 = bookRequest15.getRequestType();
        gui.RequestType requestType22 = null;
        bookRequest15.setRequestType(requestType22);
        boolean boolean24 = bookRequest2.equals((java.lang.Object) requestType22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null,null" + "'", str7, ",null,null");
        org.junit.Assert.assertNull(requestType12);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ",null" + "'", str19, ",null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ",null" + "'", str20, ",null");
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        boolean boolean7 = bookRequest2.equals((java.lang.Object) 'a');
        java.lang.String str8 = bookRequest2.getBookTitle();
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle(",null,null,null");
        java.lang.String str12 = bookRequest2.toCSVString();
        gui.RequestType requestType13 = bookRequest2.getRequestType();
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null,null,null,null" + "'", str12, ",null,null,null,null");
        org.junit.Assert.assertNull(requestType13);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        gui.BookRequest bookRequest9 = new gui.BookRequest("", requestType8);
        java.lang.String str10 = bookRequest9.getBookTitle();
        java.lang.String str11 = bookRequest9.toCSVString();
        boolean boolean12 = bookRequest2.equals((java.lang.Object) bookRequest9);
        gui.RequestType requestType13 = null;
        bookRequest9.setRequestType(requestType13);
        bookRequest9.setBookTitle("hi!");
        gui.RequestType requestType17 = null;
        bookRequest9.setRequestType(requestType17);
        java.lang.String str19 = bookRequest9.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!,null" + "'", str19, "hi!,null");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        bookRequest13.setBookTitle("");
        gui.RequestType requestType16 = null;
        bookRequest13.setRequestType(requestType16);
        gui.RequestType requestType18 = null;
        bookRequest13.setRequestType(requestType18);
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = bookRequest2.getRequestType();
        gui.RequestType requestType22 = null;
        bookRequest2.setRequestType(requestType22);
        gui.RequestType requestType24 = bookRequest2.getRequestType();
        java.lang.String str25 = bookRequest2.getBookTitle();
        java.lang.String str26 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertNull(requestType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType13 = null;
        bookRequest10.setRequestType(requestType13);
        bookRequest10.setBookTitle("hi!");
        boolean boolean17 = bookRequest2.equals((java.lang.Object) bookRequest10);
        java.lang.Class<?> wildcardClass18 = bookRequest10.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType6 = null;
        gui.BookRequest bookRequest7 = new gui.BookRequest("", requestType6);
        bookRequest7.setBookTitle("");
        gui.RequestType requestType10 = null;
        bookRequest7.setRequestType(requestType10);
        java.lang.String str12 = bookRequest7.toCSVString();
        boolean boolean14 = bookRequest7.equals((java.lang.Object) (short) 0);
        boolean boolean15 = bookRequest2.equals((java.lang.Object) boolean14);
        java.lang.String str16 = bookRequest2.toCSVString();
        java.lang.String str17 = bookRequest2.toCSVString();
        java.lang.String str18 = bookRequest2.toCSVString();
        java.lang.String str19 = bookRequest2.getBookTitle();
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        java.lang.String str23 = bookRequest22.getBookTitle();
        gui.RequestType requestType24 = null;
        bookRequest22.setRequestType(requestType24);
        gui.RequestType requestType27 = null;
        gui.BookRequest bookRequest28 = new gui.BookRequest("", requestType27);
        java.lang.String str29 = bookRequest28.toCSVString();
        java.lang.String str30 = bookRequest28.toCSVString();
        gui.RequestType requestType31 = bookRequest28.getRequestType();
        bookRequest28.setBookTitle("");
        gui.RequestType requestType34 = null;
        bookRequest28.setRequestType(requestType34);
        java.lang.String str36 = bookRequest28.getBookTitle();
        java.lang.Class<?> wildcardClass37 = bookRequest28.getClass();
        boolean boolean38 = bookRequest22.equals((java.lang.Object) wildcardClass37);
        gui.RequestType requestType40 = null;
        gui.BookRequest bookRequest41 = new gui.BookRequest("", requestType40);
        java.lang.String str42 = bookRequest41.getBookTitle();
        gui.RequestType requestType43 = null;
        bookRequest41.setRequestType(requestType43);
        java.lang.String str45 = bookRequest41.toCSVString();
        java.lang.String str46 = bookRequest41.toCSVString();
        boolean boolean47 = bookRequest22.equals((java.lang.Object) str46);
        gui.RequestType requestType48 = bookRequest22.getRequestType();
        gui.RequestType requestType49 = null;
        bookRequest22.setRequestType(requestType49);
        boolean boolean51 = bookRequest2.equals((java.lang.Object) bookRequest22);
        java.lang.String str52 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ",null" + "'", str17, ",null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ",null" + "'", str18, ",null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ",null" + "'", str29, ",null");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + ",null" + "'", str30, ",null");
        org.junit.Assert.assertNull(requestType31);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + ",null" + "'", str45, ",null");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + ",null" + "'", str46, ",null");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(requestType48);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + ",null" + "'", str52, ",null");
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null");
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType8 = bookRequest2.getRequestType();
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        java.lang.String str10 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass11 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null,null" + "'", str7, ",null,null");
        org.junit.Assert.assertNull(requestType8);
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("", requestType7);
        java.lang.String str9 = bookRequest8.toCSVString();
        java.lang.String str10 = bookRequest8.toCSVString();
        boolean boolean11 = bookRequest2.equals((java.lang.Object) bookRequest8);
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(requestType14);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null");
        java.lang.String str8 = bookRequest2.toCSVString();
        gui.RequestType requestType9 = null;
        bookRequest2.setRequestType(requestType9);
        java.lang.String str11 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",null,null" + "'", str8, ",null,null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        bookRequest13.setBookTitle("");
        gui.RequestType requestType16 = null;
        bookRequest13.setRequestType(requestType16);
        gui.RequestType requestType18 = null;
        bookRequest13.setRequestType(requestType18);
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = bookRequest2.getRequestType();
        gui.RequestType requestType22 = null;
        bookRequest2.setRequestType(requestType22);
        boolean boolean25 = bookRequest2.equals((java.lang.Object) 0);
        bookRequest2.setBookTitle(",null,null,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        java.lang.String str7 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        bookRequest13.setBookTitle("");
        gui.RequestType requestType16 = null;
        bookRequest13.setRequestType(requestType16);
        gui.RequestType requestType18 = null;
        bookRequest13.setRequestType(requestType18);
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = bookRequest2.getRequestType();
        gui.RequestType requestType22 = null;
        bookRequest2.setRequestType(requestType22);
        bookRequest2.setBookTitle(",null,null");
        java.lang.String str26 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null,null" + "'", str26, ",null,null");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("", requestType7);
        java.lang.String str9 = bookRequest8.toCSVString();
        java.lang.String str10 = bookRequest8.toCSVString();
        boolean boolean11 = bookRequest2.equals((java.lang.Object) bookRequest8);
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest2.getRequestType();
        gui.RequestType requestType15 = bookRequest2.getRequestType();
        java.lang.String str16 = bookRequest2.getBookTitle();
        java.lang.Object obj17 = null;
        boolean boolean18 = bookRequest2.equals(obj17);
        gui.RequestType requestType19 = null;
        bookRequest2.setRequestType(requestType19);
        java.lang.Class<?> wildcardClass21 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertNull(requestType15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest(",null", requestType1);
        gui.RequestType requestType4 = null;
        gui.BookRequest bookRequest5 = new gui.BookRequest("", requestType4);
        java.lang.String str6 = bookRequest5.toCSVString();
        java.lang.String str7 = bookRequest5.toCSVString();
        gui.RequestType requestType8 = bookRequest5.getRequestType();
        bookRequest5.setBookTitle("");
        boolean boolean11 = bookRequest2.equals((java.lang.Object) "");
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        gui.RequestType requestType13 = null;
        bookRequest2.setRequestType(requestType13);
        java.lang.String str15 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertNull(requestType8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(requestType12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null,null" + "'", str15, ",null,null");
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        java.lang.String str6 = bookRequest2.getBookTitle();
        gui.RequestType requestType8 = null;
        gui.BookRequest bookRequest9 = new gui.BookRequest("", requestType8);
        java.lang.String str10 = bookRequest9.toCSVString();
        java.lang.String str11 = bookRequest9.toCSVString();
        gui.RequestType requestType12 = bookRequest9.getRequestType();
        bookRequest9.setBookTitle("");
        java.lang.String str15 = bookRequest9.getBookTitle();
        bookRequest9.setBookTitle("hi!,null");
        gui.RequestType requestType18 = null;
        bookRequest9.setRequestType(requestType18);
        java.lang.String str20 = bookRequest9.toCSVString();
        boolean boolean21 = bookRequest2.equals((java.lang.Object) bookRequest9);
        gui.RequestType requestType23 = null;
        gui.BookRequest bookRequest24 = new gui.BookRequest("hi!", requestType23);
        gui.RequestType requestType26 = null;
        gui.BookRequest bookRequest27 = new gui.BookRequest("", requestType26);
        java.lang.String str28 = bookRequest27.toCSVString();
        java.lang.String str29 = bookRequest27.toCSVString();
        gui.RequestType requestType30 = bookRequest27.getRequestType();
        bookRequest27.setBookTitle("");
        java.lang.String str33 = bookRequest27.getBookTitle();
        bookRequest27.setBookTitle("hi!,null");
        boolean boolean36 = bookRequest24.equals((java.lang.Object) bookRequest27);
        java.lang.String str37 = bookRequest27.getBookTitle();
        java.lang.String str38 = bookRequest27.getBookTitle();
        boolean boolean39 = bookRequest9.equals((java.lang.Object) bookRequest27);
        bookRequest9.setBookTitle("");
        java.lang.Class<?> wildcardClass42 = bookRequest9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertNull(requestType12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!,null,null" + "'", str20, "hi!,null,null");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ",null" + "'", str28, ",null");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ",null" + "'", str29, ",null");
        org.junit.Assert.assertNull(requestType30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!,null" + "'", str37, "hi!,null");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!,null" + "'", str38, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        gui.BookRequest bookRequest9 = new gui.BookRequest("", requestType8);
        java.lang.String str10 = bookRequest9.getBookTitle();
        java.lang.String str11 = bookRequest9.toCSVString();
        boolean boolean12 = bookRequest2.equals((java.lang.Object) bookRequest9);
        java.lang.String str13 = bookRequest9.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",null" + "'", str13, ",null");
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType4 = null;
        gui.BookRequest bookRequest5 = new gui.BookRequest("", requestType4);
        bookRequest5.setBookTitle("");
        gui.RequestType requestType8 = null;
        bookRequest5.setRequestType(requestType8);
        java.lang.Class<?> wildcardClass10 = bookRequest5.getClass();
        boolean boolean11 = bookRequest2.equals((java.lang.Object) bookRequest5);
        java.lang.String str12 = bookRequest2.getBookTitle();
        java.lang.String str13 = bookRequest2.toCSVString();
        java.lang.String str14 = bookRequest2.getBookTitle();
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",null" + "'", str13, ",null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        java.lang.String str29 = bookRequest2.getBookTitle();
        java.lang.String str30 = bookRequest2.toCSVString();
        java.lang.String str31 = bookRequest2.getBookTitle();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!,null" + "'", str30, "hi!,null");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        boolean boolean9 = bookRequest2.equals((java.lang.Object) (short) 0);
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        java.lang.String str13 = bookRequest2.getBookTitle();
        gui.RequestType requestType14 = bookRequest2.getRequestType();
        gui.RequestType requestType15 = null;
        bookRequest2.setRequestType(requestType15);
        bookRequest2.setBookTitle(",null,null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(requestType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!,null,null" + "'", str13, "hi!,null,null");
        org.junit.Assert.assertNull(requestType14);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        boolean boolean10 = bookRequest2.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType22 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(requestType22);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!,null,null,null,null", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!,null,null,null,null" + "'", str3, "hi!,null,null,null,null");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.getBookTitle();
        java.lang.String str6 = bookRequest2.getBookTitle();
        gui.RequestType requestType7 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("");
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType11 = null;
        bookRequest2.setRequestType(requestType11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(requestType7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null");
        java.lang.String str8 = bookRequest2.toCSVString();
        gui.RequestType requestType9 = null;
        bookRequest2.setRequestType(requestType9);
        bookRequest2.setBookTitle(",null,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",null,null" + "'", str8, ",null,null");
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("", requestType7);
        java.lang.String str9 = bookRequest8.toCSVString();
        java.lang.String str10 = bookRequest8.toCSVString();
        gui.RequestType requestType11 = bookRequest8.getRequestType();
        bookRequest8.setBookTitle("");
        gui.RequestType requestType14 = null;
        bookRequest8.setRequestType(requestType14);
        java.lang.String str16 = bookRequest8.getBookTitle();
        java.lang.Class<?> wildcardClass17 = bookRequest8.getClass();
        boolean boolean18 = bookRequest2.equals((java.lang.Object) wildcardClass17);
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        java.lang.String str22 = bookRequest21.getBookTitle();
        gui.RequestType requestType23 = null;
        bookRequest21.setRequestType(requestType23);
        java.lang.String str25 = bookRequest21.toCSVString();
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType28 = bookRequest2.getRequestType();
        java.lang.Object obj29 = null;
        boolean boolean30 = bookRequest2.equals(obj29);
        bookRequest2.setBookTitle("hi!,null,null");
        java.lang.String str33 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ",null" + "'", str25, ",null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(requestType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!,null,null,null" + "'", str33, "hi!,null,null,null");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        java.lang.Class<?> wildcardClass10 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        java.lang.Object obj4 = null;
        boolean boolean5 = bookRequest2.equals(obj4);
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("");
        java.lang.String str9 = bookRequest2.toCSVString();
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(requestType6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!,null");
        java.lang.String str12 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass13 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!,null,null" + "'", str12, "hi!,null,null");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        bookRequest13.setBookTitle("");
        gui.RequestType requestType16 = null;
        bookRequest13.setRequestType(requestType16);
        gui.RequestType requestType18 = null;
        bookRequest13.setRequestType(requestType18);
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = bookRequest2.getRequestType();
        gui.RequestType requestType22 = null;
        bookRequest2.setRequestType(requestType22);
        bookRequest2.setBookTitle(",null,null");
        java.lang.Class<?> wildcardClass26 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        bookRequest2.setBookTitle(",null,null");
        java.lang.String str12 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass13 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null,null" + "'", str12, ",null,null");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        java.lang.String str6 = bookRequest2.getBookTitle();
        gui.RequestType requestType8 = null;
        gui.BookRequest bookRequest9 = new gui.BookRequest("", requestType8);
        java.lang.String str10 = bookRequest9.toCSVString();
        java.lang.String str11 = bookRequest9.toCSVString();
        gui.RequestType requestType12 = bookRequest9.getRequestType();
        bookRequest9.setBookTitle("");
        java.lang.String str15 = bookRequest9.getBookTitle();
        bookRequest9.setBookTitle("hi!,null");
        gui.RequestType requestType18 = null;
        bookRequest9.setRequestType(requestType18);
        java.lang.String str20 = bookRequest9.toCSVString();
        boolean boolean21 = bookRequest2.equals((java.lang.Object) bookRequest9);
        gui.RequestType requestType23 = null;
        gui.BookRequest bookRequest24 = new gui.BookRequest("hi!", requestType23);
        gui.RequestType requestType26 = null;
        gui.BookRequest bookRequest27 = new gui.BookRequest("", requestType26);
        java.lang.String str28 = bookRequest27.toCSVString();
        java.lang.String str29 = bookRequest27.toCSVString();
        gui.RequestType requestType30 = bookRequest27.getRequestType();
        bookRequest27.setBookTitle("");
        java.lang.String str33 = bookRequest27.getBookTitle();
        bookRequest27.setBookTitle("hi!,null");
        boolean boolean36 = bookRequest24.equals((java.lang.Object) bookRequest27);
        java.lang.String str37 = bookRequest27.getBookTitle();
        java.lang.String str38 = bookRequest27.getBookTitle();
        boolean boolean39 = bookRequest9.equals((java.lang.Object) bookRequest27);
        java.lang.Class<?> wildcardClass40 = bookRequest9.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertNull(requestType12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!,null,null" + "'", str20, "hi!,null,null");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ",null" + "'", str28, ",null");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ",null" + "'", str29, ",null");
        org.junit.Assert.assertNull(requestType30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!,null" + "'", str37, "hi!,null");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!,null" + "'", str38, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        java.lang.String str11 = bookRequest10.getBookTitle();
        gui.RequestType requestType12 = null;
        bookRequest10.setRequestType(requestType12);
        java.lang.String str14 = bookRequest10.toCSVString();
        java.lang.String str15 = bookRequest10.getBookTitle();
        bookRequest10.setBookTitle("hi!,null,null,null");
        java.lang.Class<?> wildcardClass18 = bookRequest10.getClass();
        boolean boolean19 = bookRequest2.equals((java.lang.Object) wildcardClass18);
        bookRequest2.setBookTitle("hi!,null,null,null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertNull(requestType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType13 = null;
        bookRequest10.setRequestType(requestType13);
        bookRequest10.setBookTitle("hi!");
        boolean boolean17 = bookRequest2.equals((java.lang.Object) bookRequest10);
        java.lang.String str18 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass19 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ",null,null" + "'", str18, ",null,null");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        java.lang.Class<?> wildcardClass12 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass8 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertNull(requestType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.getBookTitle();
        java.lang.String str6 = bookRequest2.getBookTitle();
        gui.RequestType requestType7 = bookRequest2.getRequestType();
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.getBookTitle();
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        bookRequest12.setBookTitle("");
        java.lang.String str15 = bookRequest12.toCSVString();
        gui.RequestType requestType16 = bookRequest12.getRequestType();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) requestType16);
        gui.RequestType requestType18 = bookRequest2.getRequestType();
        java.lang.String str19 = bookRequest2.toCSVString();
        java.lang.String str20 = bookRequest2.toCSVString();
        gui.RequestType requestType21 = bookRequest2.getRequestType();
        gui.RequestType requestType23 = null;
        gui.BookRequest bookRequest24 = new gui.BookRequest("", requestType23);
        gui.RequestType requestType25 = null;
        bookRequest24.setRequestType(requestType25);
        java.lang.String str27 = bookRequest24.toCSVString();
        gui.RequestType requestType28 = null;
        bookRequest24.setRequestType(requestType28);
        java.lang.String str30 = bookRequest24.getBookTitle();
        boolean boolean32 = bookRequest24.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType34 = null;
        gui.BookRequest bookRequest35 = new gui.BookRequest("", requestType34);
        java.lang.String str36 = bookRequest35.toCSVString();
        bookRequest35.setBookTitle("hi!");
        bookRequest35.setBookTitle(",null");
        boolean boolean41 = bookRequest24.equals((java.lang.Object) bookRequest35);
        gui.RequestType requestType42 = null;
        bookRequest24.setRequestType(requestType42);
        bookRequest24.setBookTitle("hi!,null,null");
        java.lang.String str46 = bookRequest24.getBookTitle();
        boolean boolean47 = bookRequest2.equals((java.lang.Object) bookRequest24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(requestType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertNull(requestType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(requestType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ",null" + "'", str19, ",null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ",null" + "'", str20, ",null");
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ",null" + "'", str27, ",null");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ",null" + "'", str36, ",null");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!,null,null" + "'", str46, "hi!,null,null");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null");
        java.lang.String str8 = bookRequest2.toCSVString();
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        java.lang.String str12 = bookRequest11.toCSVString();
        bookRequest11.setBookTitle("hi!");
        gui.RequestType requestType15 = null;
        bookRequest11.setRequestType(requestType15);
        java.lang.String str17 = bookRequest11.getBookTitle();
        java.lang.String str18 = bookRequest11.toCSVString();
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        java.lang.String str22 = bookRequest21.getBookTitle();
        java.lang.String str23 = bookRequest21.toCSVString();
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        gui.RequestType requestType26 = null;
        bookRequest21.setRequestType(requestType26);
        bookRequest21.setBookTitle("hi!");
        boolean boolean30 = bookRequest11.equals((java.lang.Object) bookRequest21);
        gui.RequestType requestType32 = null;
        gui.BookRequest bookRequest33 = new gui.BookRequest("", requestType32);
        bookRequest33.setBookTitle("");
        gui.RequestType requestType36 = null;
        bookRequest33.setRequestType(requestType36);
        gui.RequestType requestType38 = null;
        bookRequest33.setRequestType(requestType38);
        bookRequest33.setBookTitle("hi!");
        boolean boolean42 = bookRequest21.equals((java.lang.Object) bookRequest33);
        boolean boolean43 = bookRequest2.equals((java.lang.Object) bookRequest21);
        java.lang.String str44 = bookRequest21.toCSVString();
        java.lang.String str45 = bookRequest21.toCSVString();
        java.lang.String str46 = bookRequest21.getBookTitle();
        gui.RequestType requestType47 = null;
        bookRequest21.setRequestType(requestType47);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",null,null" + "'", str8, ",null,null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!,null" + "'", str18, "hi!,null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ",null" + "'", str23, ",null");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!,null" + "'", str44, "hi!,null");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!,null" + "'", str45, "hi!,null");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        boolean boolean6 = bookRequest2.equals((java.lang.Object) 10L);
        java.lang.String str7 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.toCSVString();
        bookRequest14.setBookTitle("hi!");
        gui.RequestType requestType18 = null;
        bookRequest14.setRequestType(requestType18);
        java.lang.String str20 = bookRequest14.getBookTitle();
        gui.RequestType requestType22 = null;
        gui.BookRequest bookRequest23 = new gui.BookRequest("", requestType22);
        gui.RequestType requestType24 = null;
        bookRequest23.setRequestType(requestType24);
        boolean boolean27 = bookRequest23.equals((java.lang.Object) 10L);
        boolean boolean29 = bookRequest23.equals((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass30 = bookRequest23.getClass();
        boolean boolean31 = bookRequest14.equals((java.lang.Object) wildcardClass30);
        gui.RequestType requestType33 = null;
        gui.BookRequest bookRequest34 = new gui.BookRequest("", requestType33);
        java.lang.String str35 = bookRequest34.getBookTitle();
        gui.RequestType requestType36 = bookRequest34.getRequestType();
        java.lang.String str37 = bookRequest34.toCSVString();
        gui.RequestType requestType38 = bookRequest34.getRequestType();
        java.lang.String str39 = bookRequest34.toCSVString();
        gui.RequestType requestType41 = null;
        gui.BookRequest bookRequest42 = new gui.BookRequest("", requestType41);
        java.lang.String str43 = bookRequest42.toCSVString();
        bookRequest42.setBookTitle("hi!");
        gui.RequestType requestType46 = null;
        bookRequest42.setRequestType(requestType46);
        java.lang.String str48 = bookRequest42.getBookTitle();
        java.lang.String str49 = bookRequest42.toCSVString();
        bookRequest42.setBookTitle("");
        boolean boolean52 = bookRequest34.equals((java.lang.Object) "");
        boolean boolean53 = bookRequest14.equals((java.lang.Object) boolean52);
        boolean boolean54 = bookRequest2.equals((java.lang.Object) bookRequest14);
        java.lang.String str55 = bookRequest2.toCSVString();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(requestType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ",null" + "'", str37, ",null");
        org.junit.Assert.assertNull(requestType38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + ",null" + "'", str39, ",null");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + ",null" + "'", str43, ",null");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!,null" + "'", str49, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + ",null,null" + "'", str55, ",null,null");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle("");
        java.lang.String str13 = bookRequest2.toCSVString();
        java.lang.String str14 = bookRequest2.toCSVString();
        gui.RequestType requestType15 = null;
        bookRequest2.setRequestType(requestType15);
        gui.RequestType requestType17 = null;
        bookRequest2.setRequestType(requestType17);
        java.lang.String str19 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",null" + "'", str13, ",null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ",null" + "'", str19, ",null");
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("", requestType7);
        java.lang.String str9 = bookRequest8.toCSVString();
        java.lang.String str10 = bookRequest8.toCSVString();
        boolean boolean11 = bookRequest2.equals((java.lang.Object) bookRequest8);
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest2.getRequestType();
        gui.RequestType requestType15 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!,null,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertNull(requestType15);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType6 = null;
        gui.BookRequest bookRequest7 = new gui.BookRequest("", requestType6);
        bookRequest7.setBookTitle("");
        gui.RequestType requestType10 = null;
        bookRequest7.setRequestType(requestType10);
        gui.RequestType requestType12 = null;
        bookRequest7.setRequestType(requestType12);
        bookRequest7.setBookTitle("hi!");
        gui.RequestType requestType16 = bookRequest7.getRequestType();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) bookRequest7);
        java.lang.Class<?> wildcardClass18 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        boolean boolean7 = bookRequest2.equals((java.lang.Object) 'a');
        java.lang.String str8 = bookRequest2.getBookTitle();
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle(",null,null,null");
        java.lang.String str12 = bookRequest2.toCSVString();
        gui.RequestType requestType14 = null;
        gui.BookRequest bookRequest15 = new gui.BookRequest("", requestType14);
        java.lang.String str16 = bookRequest15.getBookTitle();
        java.lang.String str17 = bookRequest15.toCSVString();
        java.lang.String str18 = bookRequest15.getBookTitle();
        java.lang.String str19 = bookRequest15.getBookTitle();
        gui.RequestType requestType20 = bookRequest15.getRequestType();
        java.lang.String str21 = bookRequest15.getBookTitle();
        java.lang.String str22 = bookRequest15.getBookTitle();
        gui.RequestType requestType24 = null;
        gui.BookRequest bookRequest25 = new gui.BookRequest("", requestType24);
        bookRequest25.setBookTitle("");
        java.lang.String str28 = bookRequest25.toCSVString();
        gui.RequestType requestType29 = bookRequest25.getRequestType();
        boolean boolean30 = bookRequest15.equals((java.lang.Object) requestType29);
        gui.RequestType requestType31 = bookRequest15.getRequestType();
        boolean boolean32 = bookRequest2.equals((java.lang.Object) requestType31);
        java.lang.String str33 = bookRequest2.getBookTitle();
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null,null,null,null" + "'", str12, ",null,null,null,null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ",null" + "'", str17, ",null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(requestType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ",null" + "'", str28, ",null");
        org.junit.Assert.assertNull(requestType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(requestType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + ",null,null,null" + "'", str33, ",null,null,null");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        java.lang.Class<?> wildcardClass6 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("", requestType7);
        java.lang.String str9 = bookRequest8.toCSVString();
        java.lang.String str10 = bookRequest8.toCSVString();
        gui.RequestType requestType11 = bookRequest8.getRequestType();
        bookRequest8.setBookTitle("");
        gui.RequestType requestType14 = null;
        bookRequest8.setRequestType(requestType14);
        java.lang.String str16 = bookRequest8.getBookTitle();
        java.lang.Class<?> wildcardClass17 = bookRequest8.getClass();
        boolean boolean18 = bookRequest2.equals((java.lang.Object) wildcardClass17);
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        java.lang.String str22 = bookRequest21.getBookTitle();
        gui.RequestType requestType23 = null;
        bookRequest21.setRequestType(requestType23);
        java.lang.String str25 = bookRequest21.toCSVString();
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType28 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!,null");
        bookRequest2.setBookTitle("hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ",null" + "'", str25, ",null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(requestType28);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        java.lang.Class<?> wildcardClass14 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!,null", requestType1);
        gui.RequestType requestType4 = null;
        gui.BookRequest bookRequest5 = new gui.BookRequest("", requestType4);
        bookRequest5.setBookTitle("");
        gui.RequestType requestType8 = null;
        bookRequest5.setRequestType(requestType8);
        bookRequest5.setBookTitle("hi!");
        java.lang.String str12 = bookRequest5.toCSVString();
        boolean boolean13 = bookRequest2.equals((java.lang.Object) str12);
        bookRequest2.setBookTitle(",null");
        java.lang.String str16 = bookRequest2.toCSVString();
        gui.RequestType requestType17 = null;
        bookRequest2.setRequestType(requestType17);
        bookRequest2.setBookTitle("hi!,null,null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!,null" + "'", str12, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null,null" + "'", str16, ",null,null");
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.getBookTitle();
        java.lang.String str15 = bookRequest13.toCSVString();
        java.lang.String str16 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle(",null");
        java.lang.String str19 = bookRequest13.toCSVString();
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        java.lang.String str23 = bookRequest22.toCSVString();
        bookRequest22.setBookTitle("hi!");
        gui.RequestType requestType26 = null;
        bookRequest22.setRequestType(requestType26);
        java.lang.String str28 = bookRequest22.getBookTitle();
        java.lang.String str29 = bookRequest22.toCSVString();
        gui.RequestType requestType31 = null;
        gui.BookRequest bookRequest32 = new gui.BookRequest("", requestType31);
        java.lang.String str33 = bookRequest32.getBookTitle();
        java.lang.String str34 = bookRequest32.toCSVString();
        gui.RequestType requestType35 = null;
        bookRequest32.setRequestType(requestType35);
        gui.RequestType requestType37 = null;
        bookRequest32.setRequestType(requestType37);
        bookRequest32.setBookTitle("hi!");
        boolean boolean41 = bookRequest22.equals((java.lang.Object) bookRequest32);
        gui.RequestType requestType43 = null;
        gui.BookRequest bookRequest44 = new gui.BookRequest("", requestType43);
        bookRequest44.setBookTitle("");
        gui.RequestType requestType47 = null;
        bookRequest44.setRequestType(requestType47);
        gui.RequestType requestType49 = null;
        bookRequest44.setRequestType(requestType49);
        bookRequest44.setBookTitle("hi!");
        boolean boolean53 = bookRequest32.equals((java.lang.Object) bookRequest44);
        boolean boolean54 = bookRequest13.equals((java.lang.Object) bookRequest32);
        java.lang.String str55 = bookRequest32.toCSVString();
        boolean boolean56 = bookRequest2.equals((java.lang.Object) str55);
        java.lang.String str57 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass58 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ",null,null" + "'", str19, ",null,null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ",null" + "'", str23, ",null");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!,null" + "'", str29, "hi!,null");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ",null" + "'", str34, ",null");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!,null" + "'", str55, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        boolean boolean10 = bookRequest2.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType20 = null;
        bookRequest2.setRequestType(requestType20);
        bookRequest2.setBookTitle("hi!,null,null");
        java.lang.String str24 = bookRequest2.toCSVString();
        gui.RequestType requestType25 = null;
        bookRequest2.setRequestType(requestType25);
        gui.RequestType requestType27 = bookRequest2.getRequestType();
        java.lang.String str28 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!,null,null,null" + "'", str24, "hi!,null,null,null");
        org.junit.Assert.assertNull(requestType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!,null,null,null" + "'", str28, "hi!,null,null,null");
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null,null");
        bookRequest2.setBookTitle("");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        java.lang.String str11 = bookRequest10.toCSVString();
        bookRequest10.setBookTitle("hi!");
        gui.RequestType requestType14 = null;
        bookRequest10.setRequestType(requestType14);
        java.lang.String str16 = bookRequest10.toCSVString();
        java.lang.String str17 = bookRequest10.getBookTitle();
        gui.RequestType requestType18 = bookRequest10.getRequestType();
        java.lang.String str19 = bookRequest10.toCSVString();
        bookRequest10.setBookTitle("");
        boolean boolean22 = bookRequest2.equals((java.lang.Object) "");
        java.lang.Class<?> wildcardClass23 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!,null" + "'", str16, "hi!,null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(requestType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!,null" + "'", str19, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        boolean boolean9 = bookRequest2.equals((java.lang.Object) (short) 0);
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.getBookTitle();
        java.lang.String str16 = bookRequest14.toCSVString();
        java.lang.String str17 = bookRequest14.getBookTitle();
        java.lang.String str18 = bookRequest14.getBookTitle();
        gui.RequestType requestType19 = bookRequest14.getRequestType();
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest14);
        gui.RequestType requestType21 = bookRequest14.getRequestType();
        gui.RequestType requestType22 = bookRequest14.getRequestType();
        bookRequest14.setBookTitle(",null,null,null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(requestType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertNull(requestType22);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType6 = null;
        gui.BookRequest bookRequest7 = new gui.BookRequest("", requestType6);
        bookRequest7.setBookTitle("");
        gui.RequestType requestType10 = null;
        bookRequest7.setRequestType(requestType10);
        gui.RequestType requestType12 = null;
        bookRequest7.setRequestType(requestType12);
        bookRequest7.setBookTitle("hi!");
        gui.RequestType requestType16 = bookRequest7.getRequestType();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) bookRequest7);
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType20 = bookRequest2.getRequestType();
        gui.RequestType requestType21 = null;
        bookRequest2.setRequestType(requestType21);
        java.lang.Class<?> wildcardClass23 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(requestType20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        java.lang.String str6 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null,null");
        java.lang.String str9 = bookRequest2.getBookTitle();
        java.lang.String str10 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null,null" + "'", str9, ",null,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null,null,null" + "'", str10, ",null,null,null");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType11 = null;
        bookRequest2.setRequestType(requestType11);
        bookRequest2.setBookTitle("");
        java.lang.String str15 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("");
        java.lang.String str18 = bookRequest2.toCSVString();
        gui.RequestType requestType19 = bookRequest2.getRequestType();
        java.lang.String str20 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ",null" + "'", str18, ",null");
        org.junit.Assert.assertNull(requestType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("", requestType7);
        java.lang.String str9 = bookRequest8.toCSVString();
        java.lang.String str10 = bookRequest8.toCSVString();
        gui.RequestType requestType11 = bookRequest8.getRequestType();
        bookRequest8.setBookTitle("");
        gui.RequestType requestType14 = null;
        bookRequest8.setRequestType(requestType14);
        java.lang.String str16 = bookRequest8.getBookTitle();
        java.lang.Class<?> wildcardClass17 = bookRequest8.getClass();
        boolean boolean18 = bookRequest2.equals((java.lang.Object) wildcardClass17);
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        java.lang.String str22 = bookRequest21.getBookTitle();
        gui.RequestType requestType23 = null;
        bookRequest21.setRequestType(requestType23);
        java.lang.String str25 = bookRequest21.toCSVString();
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType28 = bookRequest2.getRequestType();
        java.lang.Object obj29 = null;
        boolean boolean30 = bookRequest2.equals(obj29);
        bookRequest2.setBookTitle("hi!,null,null");
        java.lang.Class<?> wildcardClass33 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ",null" + "'", str25, ",null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(requestType28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        boolean boolean9 = bookRequest2.equals((java.lang.Object) (short) 0);
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = requestType12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(requestType12);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType30 = null;
        gui.BookRequest bookRequest31 = new gui.BookRequest("", requestType30);
        java.lang.String str32 = bookRequest31.getBookTitle();
        gui.RequestType requestType33 = null;
        bookRequest31.setRequestType(requestType33);
        java.lang.String str35 = bookRequest31.getBookTitle();
        boolean boolean36 = bookRequest2.equals((java.lang.Object) str35);
        gui.RequestType requestType37 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("");
        java.lang.String str40 = bookRequest2.toCSVString();
        gui.RequestType requestType42 = null;
        gui.BookRequest bookRequest43 = new gui.BookRequest("", requestType42);
        java.lang.String str44 = bookRequest43.getBookTitle();
        gui.RequestType requestType45 = null;
        bookRequest43.setRequestType(requestType45);
        gui.RequestType requestType48 = null;
        gui.BookRequest bookRequest49 = new gui.BookRequest("", requestType48);
        java.lang.String str50 = bookRequest49.toCSVString();
        java.lang.String str51 = bookRequest49.toCSVString();
        boolean boolean52 = bookRequest43.equals((java.lang.Object) bookRequest49);
        gui.RequestType requestType53 = null;
        bookRequest43.setRequestType(requestType53);
        boolean boolean55 = bookRequest2.equals((java.lang.Object) requestType53);
        bookRequest2.setBookTitle("hi!,null");
        java.lang.String str58 = bookRequest2.toCSVString();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(requestType37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ",null" + "'", str40, ",null");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + ",null" + "'", str50, ",null");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + ",null" + "'", str51, ",null");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!,null,null" + "'", str58, "hi!,null,null");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType6 = null;
        gui.BookRequest bookRequest7 = new gui.BookRequest("", requestType6);
        bookRequest7.setBookTitle("");
        gui.RequestType requestType10 = null;
        bookRequest7.setRequestType(requestType10);
        gui.RequestType requestType12 = null;
        bookRequest7.setRequestType(requestType12);
        bookRequest7.setBookTitle("hi!");
        gui.RequestType requestType16 = bookRequest7.getRequestType();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) bookRequest7);
        java.lang.String str18 = bookRequest7.toCSVString();
        org.junit.Assert.assertNull(requestType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!,null" + "'", str18, "hi!,null");
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.Class<?> wildcardClass3 = bookRequest2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.toCSVString();
        java.lang.String str11 = bookRequest2.toCSVString();
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        bookRequest2.setBookTitle(",null,null");
        java.lang.String str16 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null,null" + "'", str16, ",null,null");
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType13 = null;
        bookRequest10.setRequestType(requestType13);
        bookRequest10.setBookTitle("hi!");
        boolean boolean17 = bookRequest2.equals((java.lang.Object) bookRequest10);
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        bookRequest22.setBookTitle("");
        gui.RequestType requestType26 = null;
        gui.BookRequest bookRequest27 = new gui.BookRequest("", requestType26);
        bookRequest27.setBookTitle("");
        gui.RequestType requestType30 = null;
        bookRequest27.setRequestType(requestType30);
        gui.RequestType requestType32 = null;
        bookRequest27.setRequestType(requestType32);
        bookRequest27.setBookTitle("hi!");
        gui.RequestType requestType36 = bookRequest27.getRequestType();
        boolean boolean37 = bookRequest22.equals((java.lang.Object) bookRequest27);
        bookRequest22.setBookTitle("hi!,null");
        gui.RequestType requestType40 = bookRequest22.getRequestType();
        gui.RequestType requestType42 = null;
        gui.BookRequest bookRequest43 = new gui.BookRequest("hi!", requestType42);
        gui.RequestType requestType44 = bookRequest43.getRequestType();
        java.lang.Object obj45 = null;
        boolean boolean46 = bookRequest43.equals(obj45);
        gui.RequestType requestType47 = bookRequest43.getRequestType();
        java.lang.String str48 = bookRequest43.getBookTitle();
        java.lang.String str49 = bookRequest43.getBookTitle();
        boolean boolean50 = bookRequest22.equals((java.lang.Object) bookRequest43);
        bookRequest43.setBookTitle("hi!");
        boolean boolean53 = bookRequest2.equals((java.lang.Object) bookRequest43);
        gui.RequestType requestType55 = null;
        gui.BookRequest bookRequest56 = new gui.BookRequest("", requestType55);
        java.lang.String str57 = bookRequest56.getBookTitle();
        gui.RequestType requestType58 = bookRequest56.getRequestType();
        gui.RequestType requestType59 = null;
        bookRequest56.setRequestType(requestType59);
        java.lang.String str61 = bookRequest56.toCSVString();
        java.lang.String str62 = bookRequest56.toCSVString();
        boolean boolean63 = bookRequest43.equals((java.lang.Object) str62);
        bookRequest43.setBookTitle("hi!,null,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(requestType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(requestType40);
        org.junit.Assert.assertNull(requestType44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(requestType47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNull(requestType58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + ",null" + "'", str61, ",null");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + ",null" + "'", str62, ",null");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        bookRequest21.setBookTitle("hi!");
        boolean boolean28 = bookRequest13.equals((java.lang.Object) bookRequest21);
        boolean boolean29 = bookRequest2.equals((java.lang.Object) boolean28);
        gui.RequestType requestType31 = null;
        gui.BookRequest bookRequest32 = new gui.BookRequest("", requestType31);
        java.lang.String str33 = bookRequest32.getBookTitle();
        gui.RequestType requestType34 = bookRequest32.getRequestType();
        gui.RequestType requestType35 = null;
        bookRequest32.setRequestType(requestType35);
        java.lang.String str37 = bookRequest32.toCSVString();
        java.lang.String str38 = bookRequest32.toCSVString();
        boolean boolean39 = bookRequest2.equals((java.lang.Object) str38);
        bookRequest2.setBookTitle("hi!,null,null");
        java.lang.String str42 = bookRequest2.getBookTitle();
        gui.RequestType requestType43 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(requestType34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ",null" + "'", str37, ",null");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + ",null" + "'", str38, ",null");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!,null,null" + "'", str42, "hi!,null,null");
        org.junit.Assert.assertNull(requestType43);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.getBookTitle();
        java.lang.String str6 = bookRequest2.getBookTitle();
        gui.RequestType requestType7 = bookRequest2.getRequestType();
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.getBookTitle();
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        bookRequest12.setBookTitle("");
        java.lang.String str15 = bookRequest12.toCSVString();
        gui.RequestType requestType16 = bookRequest12.getRequestType();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) requestType16);
        java.lang.String str18 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(requestType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertNull(requestType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        java.lang.String str12 = bookRequest11.toCSVString();
        bookRequest11.setBookTitle("hi!");
        gui.RequestType requestType15 = null;
        bookRequest11.setRequestType(requestType15);
        java.lang.String str17 = bookRequest11.getBookTitle();
        java.lang.String str18 = bookRequest11.toCSVString();
        bookRequest11.setBookTitle("");
        java.lang.String str21 = bookRequest11.getBookTitle();
        boolean boolean22 = bookRequest2.equals((java.lang.Object) bookRequest11);
        java.lang.String str23 = bookRequest2.toCSVString();
        gui.RequestType requestType24 = null;
        bookRequest2.setRequestType(requestType24);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!,null" + "'", str18, "hi!,null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ",null" + "'", str23, ",null");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType6 = null;
        gui.BookRequest bookRequest7 = new gui.BookRequest("", requestType6);
        bookRequest7.setBookTitle("");
        gui.RequestType requestType10 = null;
        bookRequest7.setRequestType(requestType10);
        gui.RequestType requestType12 = null;
        bookRequest7.setRequestType(requestType12);
        bookRequest7.setBookTitle("hi!");
        gui.RequestType requestType16 = bookRequest7.getRequestType();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) bookRequest7);
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType20 = bookRequest2.getRequestType();
        gui.RequestType requestType22 = null;
        gui.BookRequest bookRequest23 = new gui.BookRequest("hi!", requestType22);
        gui.RequestType requestType24 = bookRequest23.getRequestType();
        java.lang.Object obj25 = null;
        boolean boolean26 = bookRequest23.equals(obj25);
        gui.RequestType requestType27 = bookRequest23.getRequestType();
        java.lang.String str28 = bookRequest23.getBookTitle();
        java.lang.String str29 = bookRequest23.getBookTitle();
        boolean boolean30 = bookRequest2.equals((java.lang.Object) bookRequest23);
        gui.RequestType requestType32 = null;
        gui.BookRequest bookRequest33 = new gui.BookRequest("", requestType32);
        gui.RequestType requestType34 = null;
        bookRequest33.setRequestType(requestType34);
        java.lang.String str36 = bookRequest33.toCSVString();
        gui.RequestType requestType37 = null;
        bookRequest33.setRequestType(requestType37);
        java.lang.String str39 = bookRequest33.getBookTitle();
        boolean boolean41 = bookRequest33.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType43 = null;
        gui.BookRequest bookRequest44 = new gui.BookRequest("", requestType43);
        java.lang.String str45 = bookRequest44.toCSVString();
        bookRequest44.setBookTitle("hi!");
        bookRequest44.setBookTitle(",null");
        boolean boolean50 = bookRequest33.equals((java.lang.Object) bookRequest44);
        gui.RequestType requestType51 = null;
        bookRequest33.setRequestType(requestType51);
        bookRequest33.setBookTitle("hi!,null,null");
        java.lang.String str55 = bookRequest33.toCSVString();
        boolean boolean56 = bookRequest2.equals((java.lang.Object) bookRequest33);
        gui.RequestType requestType58 = null;
        gui.BookRequest bookRequest59 = new gui.BookRequest("", requestType58);
        java.lang.String str60 = bookRequest59.toCSVString();
        bookRequest59.setBookTitle("hi!");
        gui.RequestType requestType63 = null;
        bookRequest59.setRequestType(requestType63);
        java.lang.String str65 = bookRequest59.getBookTitle();
        java.lang.String str66 = bookRequest59.toCSVString();
        bookRequest59.setBookTitle("");
        boolean boolean69 = bookRequest2.equals((java.lang.Object) "");
        org.junit.Assert.assertNull(requestType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(requestType20);
        org.junit.Assert.assertNull(requestType24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(requestType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ",null" + "'", str36, ",null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + ",null" + "'", str45, ",null");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!,null,null,null" + "'", str55, "hi!,null,null,null");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + ",null" + "'", str60, ",null");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!,null" + "'", str66, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        boolean boolean7 = bookRequest2.equals((java.lang.Object) 'a');
        bookRequest2.setBookTitle(",null");
        bookRequest2.setBookTitle("hi!,null,null,null");
        java.lang.String str12 = bookRequest2.getBookTitle();
        gui.RequestType requestType13 = null;
        bookRequest2.setRequestType(requestType13);
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!,null,null,null" + "'", str12, "hi!,null,null,null");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.getBookTitle();
        gui.RequestType requestType8 = bookRequest2.getRequestType();
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(requestType8);
        org.junit.Assert.assertNull(requestType9);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        java.lang.String str10 = bookRequest2.getBookTitle();
        java.lang.String str11 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        gui.RequestType requestType13 = null;
        bookRequest2.setRequestType(requestType13);
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(requestType12);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        bookRequest13.setBookTitle("");
        gui.RequestType requestType16 = null;
        bookRequest13.setRequestType(requestType16);
        gui.RequestType requestType18 = null;
        bookRequest13.setRequestType(requestType18);
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = bookRequest2.getRequestType();
        gui.RequestType requestType22 = null;
        bookRequest2.setRequestType(requestType22);
        gui.RequestType requestType24 = bookRequest2.getRequestType();
        gui.RequestType requestType26 = null;
        gui.BookRequest bookRequest27 = new gui.BookRequest("", requestType26);
        gui.RequestType requestType28 = null;
        bookRequest27.setRequestType(requestType28);
        gui.RequestType requestType30 = bookRequest27.getRequestType();
        bookRequest27.setBookTitle("hi!");
        gui.RequestType requestType34 = null;
        gui.BookRequest bookRequest35 = new gui.BookRequest("", requestType34);
        bookRequest35.setBookTitle("");
        gui.RequestType requestType38 = null;
        bookRequest35.setRequestType(requestType38);
        bookRequest35.setBookTitle("hi!");
        gui.RequestType requestType43 = null;
        gui.BookRequest bookRequest44 = new gui.BookRequest("", requestType43);
        gui.RequestType requestType45 = null;
        bookRequest44.setRequestType(requestType45);
        gui.RequestType requestType47 = bookRequest44.getRequestType();
        bookRequest44.setBookTitle("hi!");
        bookRequest44.setBookTitle(",null");
        gui.RequestType requestType53 = null;
        gui.BookRequest bookRequest54 = new gui.BookRequest("", requestType53);
        bookRequest54.setBookTitle("");
        gui.RequestType requestType57 = null;
        bookRequest54.setRequestType(requestType57);
        java.lang.String str59 = bookRequest54.toCSVString();
        boolean boolean60 = bookRequest44.equals((java.lang.Object) str59);
        boolean boolean61 = bookRequest35.equals((java.lang.Object) str59);
        java.lang.String str62 = bookRequest35.getBookTitle();
        boolean boolean63 = bookRequest27.equals((java.lang.Object) bookRequest35);
        boolean boolean64 = bookRequest2.equals((java.lang.Object) bookRequest27);
        gui.RequestType requestType65 = bookRequest2.getRequestType();
        java.lang.String str66 = bookRequest2.getBookTitle();
        gui.RequestType requestType67 = null;
        bookRequest2.setRequestType(requestType67);
        java.lang.String str69 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertNull(requestType24);
        org.junit.Assert.assertNull(requestType30);
        org.junit.Assert.assertNull(requestType47);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + ",null" + "'", str59, ",null");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(requestType65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null");
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType8 = bookRequest2.getRequestType();
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        java.lang.String str10 = bookRequest2.toCSVString();
        gui.RequestType requestType11 = null;
        bookRequest2.setRequestType(requestType11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null,null" + "'", str7, ",null,null");
        org.junit.Assert.assertNull(requestType8);
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null,null" + "'", str10, ",null,null");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        boolean boolean10 = bookRequest2.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        bookRequest13.setBookTitle(",null");
        bookRequest13.setBookTitle(",null");
        gui.RequestType requestType24 = null;
        bookRequest13.setRequestType(requestType24);
        gui.RequestType requestType27 = null;
        gui.BookRequest bookRequest28 = new gui.BookRequest("", requestType27);
        java.lang.String str29 = bookRequest28.toCSVString();
        bookRequest28.setBookTitle("hi!");
        gui.RequestType requestType32 = null;
        bookRequest28.setRequestType(requestType32);
        java.lang.String str34 = bookRequest28.getBookTitle();
        java.lang.String str35 = bookRequest28.toCSVString();
        java.lang.String str36 = bookRequest28.getBookTitle();
        gui.RequestType requestType38 = null;
        gui.BookRequest bookRequest39 = new gui.BookRequest("", requestType38);
        bookRequest39.setBookTitle("");
        gui.RequestType requestType42 = null;
        bookRequest39.setRequestType(requestType42);
        gui.RequestType requestType44 = null;
        bookRequest39.setRequestType(requestType44);
        boolean boolean46 = bookRequest28.equals((java.lang.Object) bookRequest39);
        gui.RequestType requestType47 = bookRequest28.getRequestType();
        java.lang.String str48 = bookRequest28.getBookTitle();
        gui.RequestType requestType50 = null;
        gui.BookRequest bookRequest51 = new gui.BookRequest("", requestType50);
        gui.RequestType requestType52 = null;
        bookRequest51.setRequestType(requestType52);
        boolean boolean55 = bookRequest51.equals((java.lang.Object) 10L);
        gui.RequestType requestType56 = bookRequest51.getRequestType();
        boolean boolean57 = bookRequest28.equals((java.lang.Object) requestType56);
        gui.RequestType requestType58 = null;
        bookRequest28.setRequestType(requestType58);
        gui.RequestType requestType60 = null;
        bookRequest28.setRequestType(requestType60);
        gui.RequestType requestType62 = bookRequest28.getRequestType();
        boolean boolean63 = bookRequest13.equals((java.lang.Object) requestType62);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ",null" + "'", str29, ",null");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!,null" + "'", str35, "hi!,null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(requestType47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(requestType56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(requestType62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertNull(requestType6);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        gui.RequestType requestType11 = bookRequest2.getRequestType();
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertNull(requestType10);
        org.junit.Assert.assertNull(requestType11);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        boolean boolean8 = bookRequest2.equals((java.lang.Object) (-1.0d));
        bookRequest2.setBookTitle("hi!,null,null,null");
        java.lang.String str11 = bookRequest2.toCSVString();
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.toCSVString();
        java.lang.String str16 = bookRequest14.toCSVString();
        gui.RequestType requestType17 = bookRequest14.getRequestType();
        bookRequest14.setBookTitle("");
        java.lang.String str20 = bookRequest14.getBookTitle();
        gui.RequestType requestType21 = null;
        bookRequest14.setRequestType(requestType21);
        gui.RequestType requestType23 = bookRequest14.getRequestType();
        gui.RequestType requestType24 = null;
        bookRequest14.setRequestType(requestType24);
        gui.RequestType requestType27 = null;
        gui.BookRequest bookRequest28 = new gui.BookRequest("", requestType27);
        java.lang.String str29 = bookRequest28.getBookTitle();
        java.lang.String str30 = bookRequest28.toCSVString();
        gui.RequestType requestType31 = null;
        bookRequest28.setRequestType(requestType31);
        gui.RequestType requestType33 = null;
        bookRequest28.setRequestType(requestType33);
        bookRequest28.setBookTitle("hi!");
        bookRequest28.setBookTitle("");
        java.lang.String str39 = bookRequest28.toCSVString();
        java.lang.Class<?> wildcardClass40 = bookRequest28.getClass();
        boolean boolean41 = bookRequest14.equals((java.lang.Object) bookRequest28);
        boolean boolean42 = bookRequest2.equals((java.lang.Object) boolean41);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!,null,null,null,null" + "'", str11, "hi!,null,null,null,null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertNull(requestType17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(requestType23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + ",null" + "'", str30, ",null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + ",null" + "'", str39, ",null");
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        java.lang.String str12 = bookRequest2.getBookTitle();
        gui.RequestType requestType14 = null;
        gui.BookRequest bookRequest15 = new gui.BookRequest("", requestType14);
        gui.RequestType requestType16 = null;
        bookRequest15.setRequestType(requestType16);
        java.lang.String str18 = bookRequest15.toCSVString();
        gui.RequestType requestType19 = null;
        bookRequest15.setRequestType(requestType19);
        java.lang.String str21 = bookRequest15.getBookTitle();
        boolean boolean23 = bookRequest15.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType25 = null;
        gui.BookRequest bookRequest26 = new gui.BookRequest("", requestType25);
        java.lang.String str27 = bookRequest26.toCSVString();
        bookRequest26.setBookTitle("hi!");
        bookRequest26.setBookTitle(",null");
        boolean boolean32 = bookRequest15.equals((java.lang.Object) bookRequest26);
        gui.RequestType requestType33 = null;
        bookRequest15.setRequestType(requestType33);
        bookRequest15.setBookTitle("hi!,null,null");
        gui.RequestType requestType37 = null;
        bookRequest15.setRequestType(requestType37);
        gui.RequestType requestType39 = bookRequest15.getRequestType();
        boolean boolean40 = bookRequest2.equals((java.lang.Object) requestType39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ",null" + "'", str18, ",null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ",null" + "'", str27, ",null");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(requestType39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        java.lang.String str13 = bookRequest12.getBookTitle();
        gui.RequestType requestType14 = bookRequest12.getRequestType();
        gui.RequestType requestType16 = null;
        gui.BookRequest bookRequest17 = new gui.BookRequest("", requestType16);
        bookRequest17.setBookTitle("");
        gui.RequestType requestType20 = null;
        bookRequest17.setRequestType(requestType20);
        java.lang.String str22 = bookRequest17.toCSVString();
        boolean boolean24 = bookRequest17.equals((java.lang.Object) (short) 0);
        boolean boolean25 = bookRequest12.equals((java.lang.Object) boolean24);
        bookRequest12.setBookTitle("hi!,null");
        bookRequest12.setBookTitle("hi!,null");
        bookRequest12.setBookTitle(",null,null,null");
        boolean boolean32 = bookRequest2.equals((java.lang.Object) bookRequest12);
        gui.RequestType requestType33 = bookRequest2.getRequestType();
        gui.RequestType requestType34 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ",null" + "'", str22, ",null");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(requestType33);
        org.junit.Assert.assertNull(requestType34);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle(",null,null");
        bookRequest2.setBookTitle("");
        java.lang.Class<?> wildcardClass11 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        java.lang.String str11 = bookRequest10.toCSVString();
        bookRequest10.setBookTitle("hi!");
        gui.RequestType requestType14 = null;
        bookRequest10.setRequestType(requestType14);
        java.lang.String str16 = bookRequest10.toCSVString();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) str16);
        java.lang.Class<?> wildcardClass18 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!,null" + "'", str16, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        boolean boolean10 = bookRequest2.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType20 = null;
        bookRequest2.setRequestType(requestType20);
        bookRequest2.setBookTitle("hi!,null,null");
        bookRequest2.setBookTitle("hi!,null");
        java.lang.String str26 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!,null,null" + "'", str26, "hi!,null,null");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        java.lang.String str11 = bookRequest10.toCSVString();
        bookRequest10.setBookTitle("hi!");
        gui.RequestType requestType14 = null;
        bookRequest10.setRequestType(requestType14);
        java.lang.String str16 = bookRequest10.toCSVString();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) str16);
        bookRequest2.setBookTitle(",null,null");
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        java.lang.String str23 = bookRequest22.toCSVString();
        bookRequest22.setBookTitle("hi!");
        gui.RequestType requestType26 = null;
        bookRequest22.setRequestType(requestType26);
        java.lang.String str28 = bookRequest22.getBookTitle();
        java.lang.String str29 = bookRequest22.toCSVString();
        gui.RequestType requestType31 = null;
        gui.BookRequest bookRequest32 = new gui.BookRequest("", requestType31);
        java.lang.String str33 = bookRequest32.getBookTitle();
        java.lang.String str34 = bookRequest32.toCSVString();
        gui.RequestType requestType35 = null;
        bookRequest32.setRequestType(requestType35);
        gui.RequestType requestType37 = null;
        bookRequest32.setRequestType(requestType37);
        bookRequest32.setBookTitle("hi!");
        boolean boolean41 = bookRequest22.equals((java.lang.Object) bookRequest32);
        gui.RequestType requestType43 = null;
        gui.BookRequest bookRequest44 = new gui.BookRequest("", requestType43);
        bookRequest44.setBookTitle("");
        gui.RequestType requestType47 = null;
        bookRequest44.setRequestType(requestType47);
        gui.RequestType requestType49 = null;
        bookRequest44.setRequestType(requestType49);
        bookRequest44.setBookTitle("hi!");
        boolean boolean53 = bookRequest32.equals((java.lang.Object) bookRequest44);
        gui.RequestType requestType54 = bookRequest32.getRequestType();
        boolean boolean55 = bookRequest2.equals((java.lang.Object) bookRequest32);
        gui.RequestType requestType56 = null;
        bookRequest32.setRequestType(requestType56);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!,null" + "'", str16, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ",null" + "'", str23, ",null");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!,null" + "'", str29, "hi!,null");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ",null" + "'", str34, ",null");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(requestType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        gui.RequestType requestType9 = null;
        bookRequest2.setRequestType(requestType9);
        java.lang.String str11 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        gui.RequestType requestType13 = bookRequest2.getRequestType();
        gui.RequestType requestType14 = null;
        bookRequest2.setRequestType(requestType14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(requestType12);
        org.junit.Assert.assertNull(requestType13);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle(",null,null");
        java.lang.String str9 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null,null" + "'", str9, ",null,null");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType30 = null;
        gui.BookRequest bookRequest31 = new gui.BookRequest("", requestType30);
        java.lang.String str32 = bookRequest31.getBookTitle();
        gui.RequestType requestType33 = null;
        bookRequest31.setRequestType(requestType33);
        java.lang.String str35 = bookRequest31.getBookTitle();
        boolean boolean36 = bookRequest2.equals((java.lang.Object) str35);
        gui.RequestType requestType37 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle(",null,null");
        java.lang.String str40 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null,null");
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(requestType37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ",null,null" + "'", str40, ",null,null");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null");
        java.lang.String str8 = bookRequest2.toCSVString();
        gui.RequestType requestType9 = null;
        bookRequest2.setRequestType(requestType9);
        bookRequest2.setBookTitle("hi!,null,null");
        boolean boolean14 = bookRequest2.equals((java.lang.Object) ",null,null,null,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",null,null" + "'", str8, ",null,null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        java.lang.String str6 = bookRequest2.getBookTitle();
        java.lang.String str7 = bookRequest2.getBookTitle();
        java.lang.String str8 = bookRequest2.getBookTitle();
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        java.lang.String str12 = bookRequest11.getBookTitle();
        gui.RequestType requestType13 = null;
        bookRequest11.setRequestType(requestType13);
        java.lang.String str15 = bookRequest11.toCSVString();
        java.lang.String str16 = bookRequest11.getBookTitle();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) str16);
        java.lang.String str18 = bookRequest2.getBookTitle();
        gui.RequestType requestType19 = bookRequest2.getRequestType();
        java.lang.String str20 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass21 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(requestType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        java.lang.String str29 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null,null");
        java.lang.String str32 = bookRequest2.toCSVString();
        gui.RequestType requestType33 = null;
        bookRequest2.setRequestType(requestType33);
        java.lang.String str35 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass36 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!,null,null,null" + "'", str32, "hi!,null,null,null");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!,null,null,null" + "'", str35, "hi!,null,null,null");
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        boolean boolean9 = bookRequest2.equals((java.lang.Object) (short) 0);
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        gui.RequestType requestType11 = null;
        bookRequest2.setRequestType(requestType11);
        gui.RequestType requestType13 = null;
        bookRequest2.setRequestType(requestType13);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(requestType10);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("");
        java.lang.String str12 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass13 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest(",null,null,null,null", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null,null,null,null,null" + "'", str3, ",null,null,null,null,null");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType4 = null;
        gui.BookRequest bookRequest5 = new gui.BookRequest("", requestType4);
        java.lang.String str6 = bookRequest5.toCSVString();
        java.lang.String str7 = bookRequest5.toCSVString();
        gui.RequestType requestType8 = bookRequest5.getRequestType();
        bookRequest5.setBookTitle("");
        java.lang.String str11 = bookRequest5.getBookTitle();
        bookRequest5.setBookTitle("hi!,null");
        boolean boolean14 = bookRequest2.equals((java.lang.Object) bookRequest5);
        java.lang.String str15 = bookRequest2.getBookTitle();
        gui.RequestType requestType16 = null;
        bookRequest2.setRequestType(requestType16);
        bookRequest2.setBookTitle("hi!,null,null,null,null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertNull(requestType8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null");
        java.lang.Class<?> wildcardClass7 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        java.lang.String str6 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!,null,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,null" + "'", str6, "hi!,null");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType30 = null;
        gui.BookRequest bookRequest31 = new gui.BookRequest("", requestType30);
        java.lang.String str32 = bookRequest31.getBookTitle();
        gui.RequestType requestType33 = null;
        bookRequest31.setRequestType(requestType33);
        java.lang.String str35 = bookRequest31.getBookTitle();
        boolean boolean36 = bookRequest2.equals((java.lang.Object) str35);
        bookRequest2.setBookTitle(",null,null");
        java.lang.String str39 = bookRequest2.getBookTitle();
        gui.RequestType requestType41 = null;
        gui.BookRequest bookRequest42 = new gui.BookRequest("", requestType41);
        java.lang.String str43 = bookRequest42.toCSVString();
        bookRequest42.setBookTitle("hi!");
        bookRequest42.setBookTitle(",null");
        gui.RequestType requestType48 = null;
        bookRequest42.setRequestType(requestType48);
        gui.RequestType requestType50 = null;
        bookRequest42.setRequestType(requestType50);
        boolean boolean52 = bookRequest2.equals((java.lang.Object) bookRequest42);
        java.lang.String str53 = bookRequest42.toCSVString();
        gui.RequestType requestType54 = bookRequest42.getRequestType();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + ",null,null" + "'", str39, ",null,null");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + ",null" + "'", str43, ",null");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + ",null,null" + "'", str53, ",null,null");
        org.junit.Assert.assertNull(requestType54);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        gui.RequestType requestType14 = null;
        bookRequest13.setRequestType(requestType14);
        java.lang.String str16 = bookRequest13.toCSVString();
        gui.RequestType requestType17 = null;
        bookRequest13.setRequestType(requestType17);
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        java.lang.String str20 = bookRequest2.getBookTitle();
        java.lang.String str21 = bookRequest2.toCSVString();
        java.lang.String str22 = bookRequest2.toCSVString();
        java.lang.String str23 = bookRequest2.getBookTitle();
        gui.RequestType requestType25 = null;
        gui.BookRequest bookRequest26 = new gui.BookRequest("", requestType25);
        java.lang.String str27 = bookRequest26.getBookTitle();
        java.lang.String str28 = bookRequest26.toCSVString();
        java.lang.String str29 = bookRequest26.getBookTitle();
        java.lang.String str30 = bookRequest26.getBookTitle();
        gui.RequestType requestType31 = bookRequest26.getRequestType();
        java.lang.String str32 = bookRequest26.getBookTitle();
        java.lang.String str33 = bookRequest26.getBookTitle();
        gui.RequestType requestType35 = null;
        gui.BookRequest bookRequest36 = new gui.BookRequest("", requestType35);
        bookRequest36.setBookTitle("");
        java.lang.String str39 = bookRequest36.toCSVString();
        gui.RequestType requestType40 = bookRequest36.getRequestType();
        boolean boolean41 = bookRequest26.equals((java.lang.Object) requestType40);
        java.lang.Class<?> wildcardClass42 = bookRequest26.getClass();
        boolean boolean43 = bookRequest2.equals((java.lang.Object) bookRequest26);
        gui.RequestType requestType44 = null;
        bookRequest2.setRequestType(requestType44);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!,null" + "'", str20, "hi!,null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!,null,null" + "'", str21, "hi!,null,null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!,null,null" + "'", str22, "hi!,null,null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!,null" + "'", str23, "hi!,null");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ",null" + "'", str28, ",null");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(requestType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + ",null" + "'", str39, ",null");
        org.junit.Assert.assertNull(requestType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        bookRequest13.setBookTitle("");
        gui.RequestType requestType16 = null;
        bookRequest13.setRequestType(requestType16);
        gui.RequestType requestType18 = null;
        bookRequest13.setRequestType(requestType18);
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = bookRequest2.getRequestType();
        gui.RequestType requestType22 = null;
        bookRequest2.setRequestType(requestType22);
        gui.RequestType requestType24 = bookRequest2.getRequestType();
        java.lang.String str25 = bookRequest2.getBookTitle();
        java.lang.String str26 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertNull(requestType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!,null" + "'", str26, "hi!,null");
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.toCSVString();
        java.lang.String str9 = bookRequest2.getBookTitle();
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        java.lang.String str11 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("");
        java.lang.String str14 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!,null" + "'", str8, "hi!,null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(requestType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!,null" + "'", str11, "hi!,null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        boolean boolean15 = bookRequest11.equals((java.lang.Object) 10L);
        boolean boolean17 = bookRequest11.equals((java.lang.Object) 'a');
        java.lang.Class<?> wildcardClass18 = bookRequest11.getClass();
        boolean boolean19 = bookRequest2.equals((java.lang.Object) wildcardClass18);
        java.lang.Class<?> wildcardClass20 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        gui.BookRequest bookRequest6 = new gui.BookRequest("", requestType5);
        java.lang.String str7 = bookRequest6.getBookTitle();
        boolean boolean8 = bookRequest2.equals((java.lang.Object) bookRequest6);
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        gui.RequestType requestType11 = bookRequest2.getRequestType();
        java.lang.String str12 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass13 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertNull(requestType10);
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        java.lang.String str11 = bookRequest2.getBookTitle();
        java.lang.String str12 = bookRequest2.toCSVString();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertNull(requestType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!,null" + "'", str12, "hi!,null");
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        boolean boolean9 = bookRequest2.equals((java.lang.Object) (short) 0);
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        java.lang.String str13 = bookRequest2.getBookTitle();
        gui.RequestType requestType15 = null;
        gui.BookRequest bookRequest16 = new gui.BookRequest("", requestType15);
        gui.RequestType requestType17 = null;
        bookRequest16.setRequestType(requestType17);
        gui.RequestType requestType19 = bookRequest16.getRequestType();
        gui.RequestType requestType20 = null;
        bookRequest16.setRequestType(requestType20);
        boolean boolean22 = bookRequest2.equals((java.lang.Object) requestType20);
        java.lang.Class<?> wildcardClass23 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(requestType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!,null,null" + "'", str13, "hi!,null,null");
        org.junit.Assert.assertNull(requestType19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        java.lang.String str13 = bookRequest12.toCSVString();
        gui.RequestType requestType15 = null;
        gui.BookRequest bookRequest16 = new gui.BookRequest("", requestType15);
        java.lang.String str17 = bookRequest16.getBookTitle();
        boolean boolean18 = bookRequest12.equals((java.lang.Object) bookRequest16);
        gui.RequestType requestType19 = bookRequest12.getRequestType();
        boolean boolean20 = bookRequest2.equals((java.lang.Object) requestType19);
        bookRequest2.setBookTitle(",null");
        java.lang.String str23 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",null" + "'", str13, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(requestType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ",null" + "'", str23, ",null");
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        bookRequest2.setBookTitle("hi!,null,null,null,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("hi!", requestType7);
        gui.RequestType requestType9 = bookRequest8.getRequestType();
        gui.RequestType requestType10 = null;
        bookRequest8.setRequestType(requestType10);
        boolean boolean13 = bookRequest8.equals((java.lang.Object) 'a');
        java.lang.String str14 = bookRequest8.getBookTitle();
        gui.RequestType requestType15 = bookRequest8.getRequestType();
        bookRequest8.setBookTitle(",null,null,null");
        java.lang.String str18 = bookRequest8.toCSVString();
        bookRequest8.setBookTitle(",null");
        boolean boolean21 = bookRequest2.equals((java.lang.Object) bookRequest8);
        gui.RequestType requestType22 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(requestType15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ",null,null,null,null" + "'", str18, ",null,null,null,null");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(requestType22);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.getBookTitle();
        java.lang.String str6 = bookRequest2.getBookTitle();
        gui.RequestType requestType8 = null;
        gui.BookRequest bookRequest9 = new gui.BookRequest("hi!", requestType8);
        gui.RequestType requestType10 = bookRequest9.getRequestType();
        bookRequest9.setBookTitle(",null");
        java.lang.String str13 = bookRequest9.toCSVString();
        gui.RequestType requestType15 = null;
        gui.BookRequest bookRequest16 = new gui.BookRequest("", requestType15);
        java.lang.String str17 = bookRequest16.toCSVString();
        bookRequest16.setBookTitle("hi!");
        bookRequest16.setBookTitle(",null");
        boolean boolean22 = bookRequest9.equals((java.lang.Object) bookRequest16);
        boolean boolean23 = bookRequest2.equals((java.lang.Object) boolean22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(requestType10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",null,null" + "'", str13, ",null,null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ",null" + "'", str17, ",null");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        java.lang.String str13 = bookRequest2.getBookTitle();
        java.lang.String str14 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass15 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertNull(requestType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        bookRequest2.setBookTitle(",null,null");
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(requestType12);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        java.lang.String str10 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass11 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.getBookTitle();
        java.lang.String str6 = bookRequest2.getBookTitle();
        gui.RequestType requestType7 = bookRequest2.getRequestType();
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.getBookTitle();
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        bookRequest12.setBookTitle("");
        java.lang.String str15 = bookRequest12.toCSVString();
        gui.RequestType requestType16 = bookRequest12.getRequestType();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) requestType16);
        gui.RequestType requestType18 = bookRequest2.getRequestType();
        java.lang.String str19 = bookRequest2.toCSVString();
        java.lang.String str20 = bookRequest2.toCSVString();
        java.lang.String str21 = bookRequest2.toCSVString();
        java.lang.String str22 = bookRequest2.getBookTitle();
        gui.RequestType requestType23 = null;
        bookRequest2.setRequestType(requestType23);
        gui.RequestType requestType25 = null;
        bookRequest2.setRequestType(requestType25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(requestType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertNull(requestType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(requestType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ",null" + "'", str19, ",null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + ",null" + "'", str20, ",null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ",null" + "'", str21, ",null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        bookRequest2.setBookTitle(",null,null");
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.toCSVString();
        bookRequest14.setBookTitle("hi!");
        gui.RequestType requestType18 = null;
        bookRequest14.setRequestType(requestType18);
        java.lang.String str20 = bookRequest14.getBookTitle();
        java.lang.String str21 = bookRequest14.toCSVString();
        java.lang.String str22 = bookRequest14.getBookTitle();
        gui.RequestType requestType24 = null;
        gui.BookRequest bookRequest25 = new gui.BookRequest("", requestType24);
        bookRequest25.setBookTitle("");
        gui.RequestType requestType28 = null;
        bookRequest25.setRequestType(requestType28);
        gui.RequestType requestType30 = null;
        bookRequest25.setRequestType(requestType30);
        boolean boolean32 = bookRequest14.equals((java.lang.Object) bookRequest25);
        gui.RequestType requestType33 = bookRequest14.getRequestType();
        gui.RequestType requestType34 = null;
        bookRequest14.setRequestType(requestType34);
        gui.RequestType requestType36 = bookRequest14.getRequestType();
        boolean boolean37 = bookRequest2.equals((java.lang.Object) bookRequest14);
        gui.RequestType requestType39 = null;
        gui.BookRequest bookRequest40 = new gui.BookRequest("", requestType39);
        bookRequest40.setBookTitle("");
        gui.RequestType requestType44 = null;
        gui.BookRequest bookRequest45 = new gui.BookRequest("", requestType44);
        bookRequest45.setBookTitle("");
        gui.RequestType requestType48 = null;
        bookRequest45.setRequestType(requestType48);
        gui.RequestType requestType50 = null;
        bookRequest45.setRequestType(requestType50);
        bookRequest45.setBookTitle("hi!");
        gui.RequestType requestType54 = bookRequest45.getRequestType();
        boolean boolean55 = bookRequest40.equals((java.lang.Object) bookRequest45);
        bookRequest40.setBookTitle("hi!,null");
        boolean boolean58 = bookRequest14.equals((java.lang.Object) "hi!,null");
        gui.RequestType requestType59 = null;
        bookRequest14.setRequestType(requestType59);
        gui.RequestType requestType61 = null;
        bookRequest14.setRequestType(requestType61);
        gui.RequestType requestType64 = null;
        gui.BookRequest bookRequest65 = new gui.BookRequest("", requestType64);
        gui.RequestType requestType66 = null;
        bookRequest65.setRequestType(requestType66);
        java.lang.String str68 = bookRequest65.toCSVString();
        gui.RequestType requestType69 = null;
        bookRequest65.setRequestType(requestType69);
        java.lang.String str71 = bookRequest65.getBookTitle();
        boolean boolean73 = bookRequest65.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType75 = null;
        gui.BookRequest bookRequest76 = new gui.BookRequest("", requestType75);
        java.lang.String str77 = bookRequest76.toCSVString();
        bookRequest76.setBookTitle("hi!");
        bookRequest76.setBookTitle(",null");
        boolean boolean82 = bookRequest65.equals((java.lang.Object) bookRequest76);
        java.lang.String str83 = bookRequest76.getBookTitle();
        java.lang.Class<?> wildcardClass84 = bookRequest76.getClass();
        boolean boolean85 = bookRequest14.equals((java.lang.Object) wildcardClass84);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!,null" + "'", str21, "hi!,null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(requestType33);
        org.junit.Assert.assertNull(requestType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(requestType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + ",null" + "'", str68, ",null");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + ",null" + "'", str77, ",null");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + ",null" + "'", str83, ",null");
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        java.lang.String str6 = bookRequest2.getBookTitle();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        bookRequest21.setBookTitle("hi!");
        boolean boolean28 = bookRequest13.equals((java.lang.Object) bookRequest21);
        boolean boolean29 = bookRequest2.equals((java.lang.Object) boolean28);
        gui.RequestType requestType31 = null;
        gui.BookRequest bookRequest32 = new gui.BookRequest("", requestType31);
        java.lang.String str33 = bookRequest32.getBookTitle();
        gui.RequestType requestType34 = bookRequest32.getRequestType();
        gui.RequestType requestType35 = null;
        bookRequest32.setRequestType(requestType35);
        java.lang.String str37 = bookRequest32.toCSVString();
        java.lang.String str38 = bookRequest32.toCSVString();
        boolean boolean39 = bookRequest2.equals((java.lang.Object) str38);
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType42 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle(",null");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(requestType34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ",null" + "'", str37, ",null");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + ",null" + "'", str38, ",null");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(requestType42);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        boolean boolean10 = bookRequest2.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        bookRequest13.setBookTitle("hi!,null,null,null");
        gui.RequestType requestType22 = bookRequest13.getRequestType();
        java.lang.Class<?> wildcardClass23 = bookRequest13.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(requestType22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        boolean boolean6 = bookRequest2.equals((java.lang.Object) 10L);
        gui.RequestType requestType7 = bookRequest2.getRequestType();
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        java.lang.String str11 = bookRequest10.toCSVString();
        bookRequest10.setBookTitle("hi!");
        gui.RequestType requestType14 = null;
        bookRequest10.setRequestType(requestType14);
        java.lang.String str16 = bookRequest10.getBookTitle();
        java.lang.String str17 = bookRequest10.toCSVString();
        java.lang.String str18 = bookRequest10.getBookTitle();
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        gui.RequestType requestType26 = null;
        bookRequest21.setRequestType(requestType26);
        boolean boolean28 = bookRequest10.equals((java.lang.Object) bookRequest21);
        boolean boolean29 = bookRequest2.equals((java.lang.Object) boolean28);
        java.lang.Class<?> wildcardClass30 = bookRequest2.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(requestType7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!,null" + "'", str17, "hi!,null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        gui.BookRequest bookRequest9 = new gui.BookRequest("", requestType8);
        java.lang.String str10 = bookRequest9.getBookTitle();
        java.lang.String str11 = bookRequest9.toCSVString();
        boolean boolean12 = bookRequest2.equals((java.lang.Object) bookRequest9);
        gui.RequestType requestType14 = null;
        gui.BookRequest bookRequest15 = new gui.BookRequest("", requestType14);
        java.lang.String str16 = bookRequest15.getBookTitle();
        java.lang.String str17 = bookRequest15.toCSVString();
        gui.RequestType requestType18 = null;
        bookRequest15.setRequestType(requestType18);
        gui.RequestType requestType20 = null;
        bookRequest15.setRequestType(requestType20);
        java.lang.String str22 = bookRequest15.toCSVString();
        gui.RequestType requestType23 = null;
        bookRequest15.setRequestType(requestType23);
        java.lang.String str25 = bookRequest15.getBookTitle();
        boolean boolean26 = bookRequest9.equals((java.lang.Object) bookRequest15);
        gui.RequestType requestType27 = null;
        bookRequest15.setRequestType(requestType27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ",null" + "'", str17, ",null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ",null" + "'", str22, ",null");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType8 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertNull(requestType8);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        java.lang.String str12 = bookRequest2.toCSVString();
        java.lang.String str13 = bookRequest2.toCSVString();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null,null" + "'", str12, ",null,null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",null,null" + "'", str13, ",null,null");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType13 = null;
        bookRequest10.setRequestType(requestType13);
        bookRequest10.setBookTitle("hi!");
        gui.RequestType requestType18 = null;
        gui.BookRequest bookRequest19 = new gui.BookRequest("", requestType18);
        gui.RequestType requestType20 = null;
        bookRequest19.setRequestType(requestType20);
        gui.RequestType requestType22 = bookRequest19.getRequestType();
        bookRequest19.setBookTitle("hi!");
        bookRequest19.setBookTitle(",null");
        gui.RequestType requestType28 = null;
        gui.BookRequest bookRequest29 = new gui.BookRequest("", requestType28);
        bookRequest29.setBookTitle("");
        gui.RequestType requestType32 = null;
        bookRequest29.setRequestType(requestType32);
        java.lang.String str34 = bookRequest29.toCSVString();
        boolean boolean35 = bookRequest19.equals((java.lang.Object) str34);
        boolean boolean36 = bookRequest10.equals((java.lang.Object) str34);
        java.lang.String str37 = bookRequest10.getBookTitle();
        boolean boolean38 = bookRequest2.equals((java.lang.Object) bookRequest10);
        java.lang.String str39 = bookRequest10.toCSVString();
        gui.RequestType requestType41 = null;
        gui.BookRequest bookRequest42 = new gui.BookRequest("", requestType41);
        java.lang.String str43 = bookRequest42.getBookTitle();
        gui.RequestType requestType44 = null;
        bookRequest42.setRequestType(requestType44);
        gui.RequestType requestType47 = null;
        gui.BookRequest bookRequest48 = new gui.BookRequest("", requestType47);
        java.lang.String str49 = bookRequest48.toCSVString();
        java.lang.String str50 = bookRequest48.toCSVString();
        boolean boolean51 = bookRequest42.equals((java.lang.Object) bookRequest48);
        gui.RequestType requestType52 = null;
        bookRequest42.setRequestType(requestType52);
        gui.RequestType requestType54 = bookRequest42.getRequestType();
        gui.RequestType requestType55 = bookRequest42.getRequestType();
        bookRequest42.setBookTitle("hi!");
        boolean boolean58 = bookRequest10.equals((java.lang.Object) "hi!");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertNull(requestType22);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ",null" + "'", str34, ",null");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!,null" + "'", str39, "hi!,null");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + ",null" + "'", str49, ",null");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + ",null" + "'", str50, ",null");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(requestType54);
        org.junit.Assert.assertNull(requestType55);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType9 = null;
        bookRequest2.setRequestType(requestType9);
        gui.RequestType requestType11 = bookRequest2.getRequestType();
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        bookRequest2.setBookTitle(",null,null,null");
        org.junit.Assert.assertNull(requestType11);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        gui.RequestType requestType17 = null;
        bookRequest13.setRequestType(requestType17);
        java.lang.String str19 = bookRequest13.toCSVString();
        java.lang.String str20 = bookRequest13.getBookTitle();
        gui.RequestType requestType21 = bookRequest13.getRequestType();
        java.lang.String str22 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("");
        boolean boolean25 = bookRequest2.equals((java.lang.Object) "");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!,null" + "'", str19, "hi!,null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!,null" + "'", str22, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null");
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        bookRequest14.setBookTitle("");
        gui.RequestType requestType17 = null;
        bookRequest14.setRequestType(requestType17);
        gui.RequestType requestType19 = null;
        bookRequest14.setRequestType(requestType19);
        bookRequest14.setBookTitle("hi!");
        gui.RequestType requestType23 = bookRequest14.getRequestType();
        gui.RequestType requestType24 = bookRequest14.getRequestType();
        gui.RequestType requestType26 = null;
        gui.BookRequest bookRequest27 = new gui.BookRequest("", requestType26);
        java.lang.String str28 = bookRequest27.toCSVString();
        bookRequest27.setBookTitle("hi!");
        gui.RequestType requestType31 = null;
        bookRequest27.setRequestType(requestType31);
        java.lang.String str33 = bookRequest27.getBookTitle();
        java.lang.String str34 = bookRequest27.toCSVString();
        java.lang.String str35 = bookRequest27.getBookTitle();
        gui.RequestType requestType37 = null;
        gui.BookRequest bookRequest38 = new gui.BookRequest("", requestType37);
        bookRequest38.setBookTitle("");
        gui.RequestType requestType41 = null;
        bookRequest38.setRequestType(requestType41);
        gui.RequestType requestType43 = null;
        bookRequest38.setRequestType(requestType43);
        boolean boolean45 = bookRequest27.equals((java.lang.Object) bookRequest38);
        gui.RequestType requestType46 = bookRequest27.getRequestType();
        gui.RequestType requestType47 = null;
        bookRequest27.setRequestType(requestType47);
        gui.RequestType requestType49 = bookRequest27.getRequestType();
        java.lang.String str50 = bookRequest27.getBookTitle();
        boolean boolean51 = bookRequest14.equals((java.lang.Object) bookRequest27);
        boolean boolean52 = bookRequest2.equals((java.lang.Object) bookRequest14);
        bookRequest2.setBookTitle("hi!,null,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null,null" + "'", str7, ",null,null");
        org.junit.Assert.assertNull(requestType23);
        org.junit.Assert.assertNull(requestType24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ",null" + "'", str28, ",null");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!,null" + "'", str34, "hi!,null");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(requestType46);
        org.junit.Assert.assertNull(requestType49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        boolean boolean9 = bookRequest2.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType13 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(requestType10);
        org.junit.Assert.assertNull(requestType13);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        gui.RequestType requestType9 = null;
        bookRequest2.setRequestType(requestType9);
        gui.RequestType requestType11 = null;
        bookRequest2.setRequestType(requestType11);
        java.lang.String str13 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",null" + "'", str13, ",null");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        bookRequest2.setBookTitle(",null,null");
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertNull(requestType12);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType13 = null;
        bookRequest10.setRequestType(requestType13);
        bookRequest10.setBookTitle("hi!");
        boolean boolean17 = bookRequest2.equals((java.lang.Object) bookRequest10);
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        bookRequest22.setBookTitle("");
        gui.RequestType requestType26 = null;
        gui.BookRequest bookRequest27 = new gui.BookRequest("", requestType26);
        bookRequest27.setBookTitle("");
        gui.RequestType requestType30 = null;
        bookRequest27.setRequestType(requestType30);
        gui.RequestType requestType32 = null;
        bookRequest27.setRequestType(requestType32);
        bookRequest27.setBookTitle("hi!");
        gui.RequestType requestType36 = bookRequest27.getRequestType();
        boolean boolean37 = bookRequest22.equals((java.lang.Object) bookRequest27);
        bookRequest22.setBookTitle("hi!,null");
        gui.RequestType requestType40 = bookRequest22.getRequestType();
        gui.RequestType requestType42 = null;
        gui.BookRequest bookRequest43 = new gui.BookRequest("hi!", requestType42);
        gui.RequestType requestType44 = bookRequest43.getRequestType();
        java.lang.Object obj45 = null;
        boolean boolean46 = bookRequest43.equals(obj45);
        gui.RequestType requestType47 = bookRequest43.getRequestType();
        java.lang.String str48 = bookRequest43.getBookTitle();
        java.lang.String str49 = bookRequest43.getBookTitle();
        boolean boolean50 = bookRequest22.equals((java.lang.Object) bookRequest43);
        bookRequest43.setBookTitle("hi!");
        boolean boolean53 = bookRequest2.equals((java.lang.Object) bookRequest43);
        gui.RequestType requestType54 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(requestType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(requestType40);
        org.junit.Assert.assertNull(requestType44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(requestType47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(requestType54);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("");
        java.lang.String str8 = bookRequest2.getBookTitle();
        gui.RequestType requestType9 = null;
        bookRequest2.setRequestType(requestType9);
        gui.RequestType requestType11 = bookRequest2.getRequestType();
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        bookRequest2.setBookTitle("hi!,null,null");
        java.lang.String str16 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null,null");
        java.lang.String str19 = bookRequest2.toCSVString();
        java.lang.String str20 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!,null,null" + "'", str16, "hi!,null,null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!,null,null,null" + "'", str19, "hi!,null,null,null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!,null,null,null" + "'", str20, "hi!,null,null,null");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.getBookTitle();
        java.lang.String str11 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null,null,null,null,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        java.lang.String str11 = bookRequest10.getBookTitle();
        gui.RequestType requestType12 = null;
        bookRequest10.setRequestType(requestType12);
        java.lang.String str14 = bookRequest10.toCSVString();
        java.lang.String str15 = bookRequest10.getBookTitle();
        bookRequest10.setBookTitle("hi!,null,null,null");
        java.lang.Class<?> wildcardClass18 = bookRequest10.getClass();
        boolean boolean19 = bookRequest2.equals((java.lang.Object) wildcardClass18);
        gui.RequestType requestType20 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle(",null,null");
        gui.RequestType requestType23 = bookRequest2.getRequestType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = requestType23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertNull(requestType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(requestType20);
        org.junit.Assert.assertNull(requestType23);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null,null");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        java.lang.String str11 = bookRequest10.toCSVString();
        bookRequest10.setBookTitle("hi!");
        bookRequest10.setBookTitle(",null");
        gui.RequestType requestType17 = null;
        gui.BookRequest bookRequest18 = new gui.BookRequest("", requestType17);
        bookRequest18.setBookTitle("");
        gui.RequestType requestType21 = null;
        bookRequest18.setRequestType(requestType21);
        bookRequest18.setBookTitle("hi!");
        boolean boolean25 = bookRequest10.equals((java.lang.Object) bookRequest18);
        boolean boolean26 = bookRequest2.equals((java.lang.Object) bookRequest18);
        java.lang.String str27 = bookRequest2.getBookTitle();
        gui.RequestType requestType28 = bookRequest2.getRequestType();
        gui.RequestType requestType29 = null;
        bookRequest2.setRequestType(requestType29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ",null,null" + "'", str27, ",null,null");
        org.junit.Assert.assertNull(requestType28);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null");
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        java.lang.Class<?> wildcardClass13 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null,null" + "'", str7, ",null,null");
        org.junit.Assert.assertNull(requestType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType11 = bookRequest2.getRequestType();
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.getBookTitle();
        java.lang.String str16 = bookRequest14.toCSVString();
        gui.RequestType requestType17 = null;
        bookRequest14.setRequestType(requestType17);
        gui.RequestType requestType19 = null;
        bookRequest14.setRequestType(requestType19);
        java.lang.String str21 = bookRequest14.toCSVString();
        boolean boolean22 = bookRequest2.equals((java.lang.Object) bookRequest14);
        bookRequest14.setBookTitle(",null,null");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ",null" + "'", str21, ",null");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        java.lang.String str29 = bookRequest2.getBookTitle();
        gui.RequestType requestType30 = null;
        bookRequest2.setRequestType(requestType30);
        gui.RequestType requestType32 = null;
        bookRequest2.setRequestType(requestType32);
        bookRequest2.setBookTitle("hi!,null,null,null");
        gui.RequestType requestType36 = bookRequest2.getRequestType();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(requestType36);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        gui.RequestType requestType11 = bookRequest2.getRequestType();
        java.lang.Class<?> wildcardClass12 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertNull(requestType10);
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        bookRequest2.setBookTitle(",null");
        java.lang.String str31 = bookRequest2.toCSVString();
        gui.RequestType requestType33 = null;
        gui.BookRequest bookRequest34 = new gui.BookRequest("", requestType33);
        bookRequest34.setBookTitle("");
        gui.RequestType requestType37 = null;
        bookRequest34.setRequestType(requestType37);
        java.lang.String str39 = bookRequest34.toCSVString();
        java.lang.String str40 = bookRequest34.getBookTitle();
        bookRequest34.setBookTitle("hi!,null");
        gui.RequestType requestType44 = null;
        gui.BookRequest bookRequest45 = new gui.BookRequest("", requestType44);
        gui.RequestType requestType46 = null;
        bookRequest45.setRequestType(requestType46);
        java.lang.String str48 = bookRequest45.toCSVString();
        gui.RequestType requestType49 = null;
        bookRequest45.setRequestType(requestType49);
        boolean boolean51 = bookRequest34.equals((java.lang.Object) bookRequest45);
        gui.RequestType requestType53 = null;
        gui.BookRequest bookRequest54 = new gui.BookRequest("", requestType53);
        java.lang.String str55 = bookRequest54.getBookTitle();
        java.lang.String str56 = bookRequest54.getBookTitle();
        boolean boolean57 = bookRequest45.equals((java.lang.Object) str56);
        gui.RequestType requestType58 = null;
        bookRequest45.setRequestType(requestType58);
        gui.RequestType requestType60 = null;
        bookRequest45.setRequestType(requestType60);
        gui.RequestType requestType62 = null;
        bookRequest45.setRequestType(requestType62);
        boolean boolean64 = bookRequest2.equals((java.lang.Object) requestType62);
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ",null,null" + "'", str31, ",null,null");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + ",null" + "'", str39, ",null");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + ",null" + "'", str48, ",null");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null");
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType14 = null;
        gui.BookRequest bookRequest15 = new gui.BookRequest("", requestType14);
        bookRequest15.setBookTitle("");
        gui.RequestType requestType18 = null;
        bookRequest15.setRequestType(requestType18);
        gui.RequestType requestType20 = null;
        bookRequest15.setRequestType(requestType20);
        bookRequest15.setBookTitle("hi!");
        gui.RequestType requestType24 = bookRequest15.getRequestType();
        boolean boolean25 = bookRequest10.equals((java.lang.Object) bookRequest15);
        bookRequest10.setBookTitle("hi!,null");
        bookRequest10.setBookTitle(",null");
        boolean boolean30 = bookRequest2.equals((java.lang.Object) bookRequest10);
        java.lang.String str31 = bookRequest2.getBookTitle();
        java.lang.String str32 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null,null" + "'", str7, ",null,null");
        org.junit.Assert.assertNull(requestType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + ",null" + "'", str31, ",null");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ",null,null" + "'", str32, ",null,null");
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle(",null");
        java.lang.String str9 = bookRequest2.getBookTitle();
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        gui.RequestType requestType13 = null;
        bookRequest12.setRequestType(requestType13);
        java.lang.String str15 = bookRequest12.toCSVString();
        gui.RequestType requestType16 = null;
        bookRequest12.setRequestType(requestType16);
        java.lang.String str18 = bookRequest12.getBookTitle();
        boolean boolean20 = bookRequest12.equals((java.lang.Object) 10.0d);
        java.lang.String str21 = bookRequest12.getBookTitle();
        boolean boolean22 = bookRequest2.equals((java.lang.Object) str21);
        gui.RequestType requestType23 = null;
        bookRequest2.setRequestType(requestType23);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        boolean boolean10 = bookRequest2.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType20 = null;
        bookRequest2.setRequestType(requestType20);
        bookRequest2.setBookTitle("hi!,null,null");
        java.lang.String str24 = bookRequest2.toCSVString();
        gui.RequestType requestType25 = null;
        bookRequest2.setRequestType(requestType25);
        gui.RequestType requestType27 = bookRequest2.getRequestType();
        java.lang.Class<?> wildcardClass28 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!,null,null,null" + "'", str24, "hi!,null,null,null");
        org.junit.Assert.assertNull(requestType27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        gui.BookRequest bookRequest6 = new gui.BookRequest("", requestType5);
        java.lang.String str7 = bookRequest6.getBookTitle();
        boolean boolean8 = bookRequest2.equals((java.lang.Object) bookRequest6);
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        gui.RequestType requestType11 = bookRequest2.getRequestType();
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest2.getRequestType();
        gui.RequestType requestType15 = null;
        bookRequest2.setRequestType(requestType15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertNull(requestType10);
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertNull(requestType14);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        gui.BookRequest bookRequest6 = new gui.BookRequest("", requestType5);
        java.lang.String str7 = bookRequest6.getBookTitle();
        boolean boolean8 = bookRequest2.equals((java.lang.Object) bookRequest6);
        gui.RequestType requestType9 = null;
        bookRequest6.setRequestType(requestType9);
        gui.RequestType requestType11 = null;
        bookRequest6.setRequestType(requestType11);
        gui.RequestType requestType13 = null;
        bookRequest6.setRequestType(requestType13);
        java.lang.String str15 = bookRequest6.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        java.lang.String str13 = bookRequest12.getBookTitle();
        java.lang.String str14 = bookRequest12.toCSVString();
        gui.RequestType requestType15 = null;
        bookRequest12.setRequestType(requestType15);
        gui.RequestType requestType17 = null;
        bookRequest12.setRequestType(requestType17);
        bookRequest12.setBookTitle("hi!");
        boolean boolean21 = bookRequest2.equals((java.lang.Object) bookRequest12);
        java.lang.String str22 = bookRequest2.toCSVString();
        gui.RequestType requestType23 = null;
        bookRequest2.setRequestType(requestType23);
        gui.RequestType requestType25 = null;
        bookRequest2.setRequestType(requestType25);
        bookRequest2.setBookTitle(",null,null");
        java.lang.String str29 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass30 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!,null" + "'", str22, "hi!,null");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + ",null,null" + "'", str29, ",null,null");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        boolean boolean10 = bookRequest2.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        java.lang.String str14 = bookRequest13.toCSVString();
        bookRequest13.setBookTitle("hi!");
        bookRequest13.setBookTitle(",null");
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        bookRequest13.setBookTitle(",null");
        bookRequest13.setBookTitle(",null");
        gui.RequestType requestType24 = bookRequest13.getRequestType();
        java.lang.String str25 = bookRequest13.toCSVString();
        java.lang.Class<?> wildcardClass26 = bookRequest13.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(requestType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ",null,null" + "'", str25, ",null,null");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("", requestType7);
        java.lang.String str9 = bookRequest8.toCSVString();
        java.lang.String str10 = bookRequest8.toCSVString();
        gui.RequestType requestType11 = bookRequest8.getRequestType();
        bookRequest8.setBookTitle("");
        gui.RequestType requestType14 = null;
        bookRequest8.setRequestType(requestType14);
        java.lang.String str16 = bookRequest8.getBookTitle();
        java.lang.Class<?> wildcardClass17 = bookRequest8.getClass();
        boolean boolean18 = bookRequest2.equals((java.lang.Object) wildcardClass17);
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        java.lang.String str22 = bookRequest21.getBookTitle();
        gui.RequestType requestType23 = null;
        bookRequest21.setRequestType(requestType23);
        java.lang.String str25 = bookRequest21.toCSVString();
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType29 = null;
        gui.BookRequest bookRequest30 = new gui.BookRequest("hi!,null", requestType29);
        gui.RequestType requestType32 = null;
        gui.BookRequest bookRequest33 = new gui.BookRequest("", requestType32);
        bookRequest33.setBookTitle("");
        gui.RequestType requestType36 = null;
        bookRequest33.setRequestType(requestType36);
        bookRequest33.setBookTitle("hi!");
        java.lang.String str40 = bookRequest33.toCSVString();
        boolean boolean41 = bookRequest30.equals((java.lang.Object) str40);
        boolean boolean42 = bookRequest2.equals((java.lang.Object) str40);
        bookRequest2.setBookTitle("hi!,null,null,null");
        java.lang.Class<?> wildcardClass45 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ",null" + "'", str25, ",null");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!,null" + "'", str40, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        boolean boolean7 = bookRequest2.equals((java.lang.Object) 'a');
        bookRequest2.setBookTitle(",null");
        boolean boolean11 = bookRequest2.equals((java.lang.Object) 10L);
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        bookRequest14.setBookTitle("");
        gui.RequestType requestType17 = null;
        bookRequest14.setRequestType(requestType17);
        java.lang.String str19 = bookRequest14.toCSVString();
        java.lang.String str20 = bookRequest14.getBookTitle();
        java.lang.Class<?> wildcardClass21 = bookRequest14.getClass();
        boolean boolean22 = bookRequest2.equals((java.lang.Object) wildcardClass21);
        java.lang.String str23 = bookRequest2.getBookTitle();
        java.lang.String str24 = bookRequest2.getBookTitle();
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ",null" + "'", str19, ",null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ",null" + "'", str23, ",null");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ",null" + "'", str24, ",null");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        java.lang.Object obj8 = null;
        boolean boolean9 = bookRequest2.equals(obj8);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        java.lang.String str14 = bookRequest2.getBookTitle();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        java.lang.String str29 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null,null");
        java.lang.String str32 = bookRequest2.toCSVString();
        gui.RequestType requestType33 = null;
        bookRequest2.setRequestType(requestType33);
        java.lang.String str35 = bookRequest2.toCSVString();
        java.lang.String str36 = bookRequest2.toCSVString();
        gui.RequestType requestType37 = null;
        bookRequest2.setRequestType(requestType37);
        bookRequest2.setBookTitle(",null,null,null,null,null");
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!,null,null,null" + "'", str32, "hi!,null,null,null");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!,null,null,null" + "'", str35, "hi!,null,null,null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!,null,null,null" + "'", str36, "hi!,null,null,null");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest(",null,null,null,null,null", requestType1);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType6 = null;
        gui.BookRequest bookRequest7 = new gui.BookRequest("", requestType6);
        bookRequest7.setBookTitle("");
        gui.RequestType requestType10 = null;
        bookRequest7.setRequestType(requestType10);
        java.lang.String str12 = bookRequest7.toCSVString();
        boolean boolean14 = bookRequest7.equals((java.lang.Object) (short) 0);
        boolean boolean15 = bookRequest2.equals((java.lang.Object) boolean14);
        bookRequest2.setBookTitle("hi!,null");
        bookRequest2.setBookTitle("hi!,null");
        bookRequest2.setBookTitle("hi!");
        java.lang.String str22 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!,null" + "'", str22, "hi!,null");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        bookRequest2.setBookTitle(",null,null");
        java.lang.String str12 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null,null,null" + "'", str12, ",null,null,null");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!,null");
        java.lang.String str9 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("");
        java.lang.String str12 = bookRequest2.getBookTitle();
        gui.RequestType requestType13 = null;
        bookRequest2.setRequestType(requestType13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null,null" + "'", str9, "hi!,null,null");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        java.lang.String str29 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType33 = null;
        gui.BookRequest bookRequest34 = new gui.BookRequest("", requestType33);
        java.lang.String str35 = bookRequest34.toCSVString();
        java.lang.String str36 = bookRequest34.toCSVString();
        gui.RequestType requestType37 = bookRequest34.getRequestType();
        bookRequest34.setBookTitle("");
        java.lang.String str40 = bookRequest34.getBookTitle();
        bookRequest34.setBookTitle("hi!,null");
        boolean boolean43 = bookRequest2.equals((java.lang.Object) bookRequest34);
        gui.RequestType requestType44 = bookRequest2.getRequestType();
        gui.RequestType requestType45 = bookRequest2.getRequestType();
        java.lang.String str46 = bookRequest2.getBookTitle();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + ",null" + "'", str35, ",null");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ",null" + "'", str36, ",null");
        org.junit.Assert.assertNull(requestType37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(requestType44);
        org.junit.Assert.assertNull(requestType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!,null,null" + "'", str46, "hi!,null,null");
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.getBookTitle();
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        java.lang.String str13 = bookRequest12.getBookTitle();
        java.lang.String str14 = bookRequest12.toCSVString();
        gui.RequestType requestType15 = null;
        bookRequest12.setRequestType(requestType15);
        gui.RequestType requestType17 = null;
        bookRequest12.setRequestType(requestType17);
        bookRequest12.setBookTitle("hi!");
        boolean boolean21 = bookRequest2.equals((java.lang.Object) bookRequest12);
        java.lang.String str22 = bookRequest2.toCSVString();
        gui.RequestType requestType23 = null;
        bookRequest2.setRequestType(requestType23);
        gui.RequestType requestType26 = null;
        gui.BookRequest bookRequest27 = new gui.BookRequest("", requestType26);
        java.lang.String str28 = bookRequest27.getBookTitle();
        gui.RequestType requestType29 = bookRequest27.getRequestType();
        bookRequest27.setBookTitle("hi!");
        gui.RequestType requestType33 = null;
        gui.BookRequest bookRequest34 = new gui.BookRequest("", requestType33);
        java.lang.String str35 = bookRequest34.getBookTitle();
        java.lang.String str36 = bookRequest34.toCSVString();
        boolean boolean37 = bookRequest27.equals((java.lang.Object) bookRequest34);
        gui.RequestType requestType38 = null;
        bookRequest27.setRequestType(requestType38);
        gui.RequestType requestType41 = null;
        gui.BookRequest bookRequest42 = new gui.BookRequest("", requestType41);
        gui.RequestType requestType43 = null;
        bookRequest42.setRequestType(requestType43);
        java.lang.String str45 = bookRequest42.getBookTitle();
        boolean boolean46 = bookRequest27.equals((java.lang.Object) str45);
        java.lang.String str47 = bookRequest27.getBookTitle();
        gui.RequestType requestType49 = null;
        gui.BookRequest bookRequest50 = new gui.BookRequest("", requestType49);
        java.lang.String str51 = bookRequest50.toCSVString();
        java.lang.String str52 = bookRequest50.toCSVString();
        gui.RequestType requestType53 = bookRequest50.getRequestType();
        gui.RequestType requestType54 = bookRequest50.getRequestType();
        boolean boolean55 = bookRequest27.equals((java.lang.Object) bookRequest50);
        java.lang.String str56 = bookRequest27.toCSVString();
        boolean boolean57 = bookRequest2.equals((java.lang.Object) str56);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!,null" + "'", str22, "hi!,null");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(requestType29);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ",null" + "'", str36, ",null");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + ",null" + "'", str51, ",null");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + ",null" + "'", str52, ",null");
        org.junit.Assert.assertNull(requestType53);
        org.junit.Assert.assertNull(requestType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!,null" + "'", str56, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null");
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        gui.RequestType requestType13 = null;
        bookRequest2.setRequestType(requestType13);
        gui.RequestType requestType15 = null;
        bookRequest2.setRequestType(requestType15);
        gui.RequestType requestType18 = null;
        gui.BookRequest bookRequest19 = new gui.BookRequest("", requestType18);
        java.lang.String str20 = bookRequest19.getBookTitle();
        java.lang.String str21 = bookRequest19.getBookTitle();
        bookRequest19.setBookTitle(",null");
        java.lang.String str24 = bookRequest19.toCSVString();
        gui.RequestType requestType25 = bookRequest19.getRequestType();
        boolean boolean26 = bookRequest2.equals((java.lang.Object) bookRequest19);
        java.lang.Class<?> wildcardClass27 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null,null" + "'", str7, ",null,null");
        org.junit.Assert.assertNull(requestType12);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + ",null,null" + "'", str24, ",null,null");
        org.junit.Assert.assertNull(requestType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.toCSVString();
        java.lang.String str11 = bookRequest2.toCSVString();
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        bookRequest2.setBookTitle(",null,null");
        java.lang.String str16 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null,null,null" + "'", str16, ",null,null,null");
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        bookRequest2.setBookTitle(",null,null");
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.toCSVString();
        bookRequest14.setBookTitle("hi!");
        gui.RequestType requestType18 = null;
        bookRequest14.setRequestType(requestType18);
        java.lang.String str20 = bookRequest14.getBookTitle();
        java.lang.String str21 = bookRequest14.toCSVString();
        java.lang.String str22 = bookRequest14.getBookTitle();
        gui.RequestType requestType24 = null;
        gui.BookRequest bookRequest25 = new gui.BookRequest("", requestType24);
        bookRequest25.setBookTitle("");
        gui.RequestType requestType28 = null;
        bookRequest25.setRequestType(requestType28);
        gui.RequestType requestType30 = null;
        bookRequest25.setRequestType(requestType30);
        boolean boolean32 = bookRequest14.equals((java.lang.Object) bookRequest25);
        gui.RequestType requestType33 = bookRequest14.getRequestType();
        gui.RequestType requestType34 = null;
        bookRequest14.setRequestType(requestType34);
        gui.RequestType requestType36 = bookRequest14.getRequestType();
        boolean boolean37 = bookRequest2.equals((java.lang.Object) bookRequest14);
        gui.RequestType requestType39 = null;
        gui.BookRequest bookRequest40 = new gui.BookRequest("", requestType39);
        bookRequest40.setBookTitle("");
        gui.RequestType requestType44 = null;
        gui.BookRequest bookRequest45 = new gui.BookRequest("", requestType44);
        bookRequest45.setBookTitle("");
        gui.RequestType requestType48 = null;
        bookRequest45.setRequestType(requestType48);
        gui.RequestType requestType50 = null;
        bookRequest45.setRequestType(requestType50);
        bookRequest45.setBookTitle("hi!");
        gui.RequestType requestType54 = bookRequest45.getRequestType();
        boolean boolean55 = bookRequest40.equals((java.lang.Object) bookRequest45);
        bookRequest40.setBookTitle("hi!,null");
        boolean boolean58 = bookRequest14.equals((java.lang.Object) "hi!,null");
        gui.RequestType requestType59 = bookRequest14.getRequestType();
        gui.RequestType requestType61 = null;
        gui.BookRequest bookRequest62 = new gui.BookRequest("", requestType61);
        gui.RequestType requestType63 = null;
        bookRequest62.setRequestType(requestType63);
        gui.RequestType requestType65 = bookRequest62.getRequestType();
        bookRequest62.setBookTitle("hi!");
        java.lang.Object obj68 = null;
        boolean boolean69 = bookRequest62.equals(obj68);
        gui.RequestType requestType70 = null;
        bookRequest62.setRequestType(requestType70);
        boolean boolean72 = bookRequest14.equals((java.lang.Object) requestType70);
        java.lang.Class<?> wildcardClass73 = bookRequest14.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!,null" + "'", str21, "hi!,null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(requestType33);
        org.junit.Assert.assertNull(requestType36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(requestType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(requestType59);
        org.junit.Assert.assertNull(requestType65);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        boolean boolean7 = bookRequest2.equals((java.lang.Object) 'a');
        java.lang.String str8 = bookRequest2.getBookTitle();
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle(",null,null,null");
        java.lang.String str12 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null");
        bookRequest2.setBookTitle("");
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null,null,null,null" + "'", str12, ",null,null,null,null");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        bookRequest2.setBookTitle(",null,null,null,null");
        java.lang.String str8 = bookRequest2.toCSVString();
        java.lang.String str9 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",null,null,null,null,null" + "'", str8, ",null,null,null,null,null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null,null,null,null,null" + "'", str9, ",null,null,null,null,null");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        gui.BookRequest bookRequest9 = new gui.BookRequest("", requestType8);
        java.lang.String str10 = bookRequest9.getBookTitle();
        java.lang.String str11 = bookRequest9.toCSVString();
        boolean boolean12 = bookRequest2.equals((java.lang.Object) bookRequest9);
        gui.RequestType requestType13 = null;
        bookRequest9.setRequestType(requestType13);
        gui.RequestType requestType15 = null;
        bookRequest9.setRequestType(requestType15);
        java.lang.String str17 = bookRequest9.toCSVString();
        gui.RequestType requestType19 = null;
        gui.BookRequest bookRequest20 = new gui.BookRequest("", requestType19);
        java.lang.String str21 = bookRequest20.toCSVString();
        boolean boolean22 = bookRequest9.equals((java.lang.Object) str21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ",null" + "'", str17, ",null");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + ",null" + "'", str21, ",null");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        java.lang.String str6 = bookRequest2.toCSVString();
        java.lang.String str7 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass8 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType12 = null;
        gui.BookRequest bookRequest13 = new gui.BookRequest("", requestType12);
        gui.RequestType requestType14 = null;
        bookRequest13.setRequestType(requestType14);
        java.lang.String str16 = bookRequest13.toCSVString();
        gui.RequestType requestType17 = null;
        bookRequest13.setRequestType(requestType17);
        boolean boolean19 = bookRequest2.equals((java.lang.Object) bookRequest13);
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        java.lang.String str23 = bookRequest22.getBookTitle();
        java.lang.String str24 = bookRequest22.getBookTitle();
        boolean boolean25 = bookRequest13.equals((java.lang.Object) str24);
        gui.RequestType requestType26 = null;
        bookRequest13.setRequestType(requestType26);
        gui.RequestType requestType28 = bookRequest13.getRequestType();
        gui.RequestType requestType29 = bookRequest13.getRequestType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass30 = requestType29.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(requestType28);
        org.junit.Assert.assertNull(requestType29);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        java.lang.String str9 = bookRequest2.toCSVString();
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = requestType12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertNull(requestType12);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        java.lang.String str5 = bookRequest2.toCSVString();
        java.lang.String str6 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        bookRequest11.setBookTitle("");
        gui.RequestType requestType14 = null;
        bookRequest11.setRequestType(requestType14);
        java.lang.String str16 = bookRequest11.toCSVString();
        boolean boolean18 = bookRequest11.equals((java.lang.Object) (short) 0);
        bookRequest11.setBookTitle("hi!,null,null");
        java.lang.Class<?> wildcardClass21 = bookRequest11.getClass();
        boolean boolean22 = bookRequest2.equals((java.lang.Object) bookRequest11);
        java.lang.String str23 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!,null,null" + "'", str23, "hi!,null,null");
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType4 = null;
        gui.BookRequest bookRequest5 = new gui.BookRequest("", requestType4);
        java.lang.String str6 = bookRequest5.toCSVString();
        java.lang.String str7 = bookRequest5.toCSVString();
        gui.RequestType requestType8 = bookRequest5.getRequestType();
        bookRequest5.setBookTitle("");
        java.lang.String str11 = bookRequest5.getBookTitle();
        bookRequest5.setBookTitle("hi!,null");
        boolean boolean14 = bookRequest2.equals((java.lang.Object) bookRequest5);
        java.lang.String str15 = bookRequest5.toCSVString();
        bookRequest5.setBookTitle(",null,null,null");
        java.lang.Class<?> wildcardClass18 = bookRequest5.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertNull(requestType8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!,null,null" + "'", str15, "hi!,null,null");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType30 = null;
        gui.BookRequest bookRequest31 = new gui.BookRequest("", requestType30);
        java.lang.String str32 = bookRequest31.getBookTitle();
        gui.RequestType requestType33 = null;
        bookRequest31.setRequestType(requestType33);
        java.lang.String str35 = bookRequest31.getBookTitle();
        boolean boolean36 = bookRequest2.equals((java.lang.Object) str35);
        gui.RequestType requestType37 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle(",null,null");
        java.lang.String str40 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null,null,null");
        java.lang.Class<?> wildcardClass43 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(requestType37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ",null,null,null" + "'", str40, ",null,null,null");
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!,null");
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        java.lang.String str13 = bookRequest12.getBookTitle();
        gui.RequestType requestType14 = bookRequest12.getRequestType();
        gui.RequestType requestType16 = null;
        gui.BookRequest bookRequest17 = new gui.BookRequest("", requestType16);
        bookRequest17.setBookTitle("");
        gui.RequestType requestType20 = null;
        bookRequest17.setRequestType(requestType20);
        java.lang.String str22 = bookRequest17.toCSVString();
        boolean boolean24 = bookRequest17.equals((java.lang.Object) (short) 0);
        boolean boolean25 = bookRequest12.equals((java.lang.Object) boolean24);
        bookRequest12.setBookTitle("hi!,null");
        bookRequest12.setBookTitle("hi!,null");
        bookRequest12.setBookTitle(",null,null,null");
        boolean boolean32 = bookRequest2.equals((java.lang.Object) bookRequest12);
        java.lang.String str33 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + ",null" + "'", str22, ",null");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!,null" + "'", str33, "hi!,null");
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        java.lang.String str6 = bookRequest2.getBookTitle();
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("hi!", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        boolean boolean7 = bookRequest2.equals((java.lang.Object) 'a');
        bookRequest2.setBookTitle(",null");
        boolean boolean11 = bookRequest2.equals((java.lang.Object) 10L);
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        bookRequest14.setBookTitle("");
        gui.RequestType requestType17 = null;
        bookRequest14.setRequestType(requestType17);
        java.lang.String str19 = bookRequest14.toCSVString();
        java.lang.String str20 = bookRequest14.getBookTitle();
        java.lang.Class<?> wildcardClass21 = bookRequest14.getClass();
        boolean boolean22 = bookRequest2.equals((java.lang.Object) wildcardClass21);
        gui.RequestType requestType23 = null;
        bookRequest2.setRequestType(requestType23);
        bookRequest2.setBookTitle("hi!,null,null,null");
        org.junit.Assert.assertNull(requestType3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ",null" + "'", str19, ",null");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        gui.BookRequest bookRequest6 = new gui.BookRequest("", requestType5);
        java.lang.String str7 = bookRequest6.getBookTitle();
        boolean boolean8 = bookRequest2.equals((java.lang.Object) bookRequest6);
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        gui.RequestType requestType11 = bookRequest2.getRequestType();
        gui.RequestType requestType12 = null;
        bookRequest2.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest2.getRequestType();
        java.lang.Class<?> wildcardClass15 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertNull(requestType10);
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        java.lang.String str6 = bookRequest2.toCSVString();
        java.lang.String str7 = bookRequest2.getBookTitle();
        java.lang.String str8 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null,null");
        bookRequest2.setBookTitle(",null,null");
        java.lang.String str13 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!,null" + "'", str6, "hi!,null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",null,null,null" + "'", str13, ",null,null,null");
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        java.lang.String str6 = bookRequest2.toCSVString();
        gui.RequestType requestType7 = bookRequest2.getRequestType();
        java.lang.String str8 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertNull(requestType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("", requestType7);
        gui.RequestType requestType9 = null;
        bookRequest8.setRequestType(requestType9);
        gui.RequestType requestType11 = bookRequest8.getRequestType();
        bookRequest8.setBookTitle("hi!");
        bookRequest8.setBookTitle(",null");
        bookRequest8.setBookTitle("hi!");
        boolean boolean18 = bookRequest2.equals((java.lang.Object) bookRequest8);
        gui.RequestType requestType19 = null;
        bookRequest2.setRequestType(requestType19);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.toCSVString();
        gui.RequestType requestType6 = bookRequest2.getRequestType();
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        java.lang.String str11 = bookRequest10.toCSVString();
        bookRequest10.setBookTitle("hi!");
        gui.RequestType requestType14 = null;
        bookRequest10.setRequestType(requestType14);
        java.lang.String str16 = bookRequest10.getBookTitle();
        java.lang.String str17 = bookRequest10.toCSVString();
        bookRequest10.setBookTitle("");
        boolean boolean20 = bookRequest2.equals((java.lang.Object) "");
        java.lang.Class<?> wildcardClass21 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertNull(requestType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!,null" + "'", str17, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        gui.RequestType requestType9 = null;
        bookRequest2.setRequestType(requestType9);
        java.lang.String str11 = bookRequest2.getBookTitle();
        java.lang.String str12 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.toCSVString();
        java.lang.String str11 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!,null" + "'", str10, "hi!,null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!,null" + "'", str11, "hi!,null");
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.toCSVString();
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("hi!,null,null,null", requestType10);
        java.lang.Class<?> wildcardClass12 = bookRequest11.getClass();
        boolean boolean13 = bookRequest2.equals((java.lang.Object) wildcardClass12);
        gui.RequestType requestType14 = null;
        bookRequest2.setRequestType(requestType14);
        java.lang.String str16 = bookRequest2.toCSVString();
        gui.RequestType requestType17 = bookRequest2.getRequestType();
        java.lang.String str18 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!,null" + "'", str8, "hi!,null");
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!,null" + "'", str16, "hi!,null");
        org.junit.Assert.assertNull(requestType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        java.lang.String str6 = bookRequest2.toCSVString();
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        java.lang.String str13 = bookRequest12.getBookTitle();
        gui.RequestType requestType14 = bookRequest12.getRequestType();
        gui.RequestType requestType15 = null;
        bookRequest12.setRequestType(requestType15);
        java.lang.String str17 = bookRequest12.toCSVString();
        gui.RequestType requestType18 = null;
        bookRequest12.setRequestType(requestType18);
        bookRequest12.setBookTitle("hi!,null,null,null");
        boolean boolean22 = bookRequest2.equals((java.lang.Object) "hi!,null,null,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + ",null" + "'", str17, ",null");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        boolean boolean9 = bookRequest2.equals((java.lang.Object) (short) 0);
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.getBookTitle();
        java.lang.String str16 = bookRequest14.toCSVString();
        java.lang.String str17 = bookRequest14.getBookTitle();
        java.lang.String str18 = bookRequest14.getBookTitle();
        gui.RequestType requestType19 = bookRequest14.getRequestType();
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest14);
        gui.RequestType requestType22 = null;
        gui.BookRequest bookRequest23 = new gui.BookRequest("", requestType22);
        bookRequest23.setBookTitle("");
        gui.RequestType requestType26 = null;
        bookRequest23.setRequestType(requestType26);
        gui.RequestType requestType28 = null;
        bookRequest23.setRequestType(requestType28);
        bookRequest23.setBookTitle("hi!");
        gui.RequestType requestType33 = null;
        gui.BookRequest bookRequest34 = new gui.BookRequest("", requestType33);
        java.lang.String str35 = bookRequest34.toCSVString();
        bookRequest34.setBookTitle("hi!");
        bookRequest34.setBookTitle(",null");
        gui.RequestType requestType41 = null;
        gui.BookRequest bookRequest42 = new gui.BookRequest("", requestType41);
        bookRequest42.setBookTitle("");
        gui.RequestType requestType45 = null;
        bookRequest42.setRequestType(requestType45);
        bookRequest42.setBookTitle("hi!");
        boolean boolean49 = bookRequest34.equals((java.lang.Object) bookRequest42);
        boolean boolean50 = bookRequest23.equals((java.lang.Object) boolean49);
        gui.RequestType requestType52 = null;
        gui.BookRequest bookRequest53 = new gui.BookRequest("", requestType52);
        java.lang.String str54 = bookRequest53.getBookTitle();
        gui.RequestType requestType55 = bookRequest53.getRequestType();
        gui.RequestType requestType56 = null;
        bookRequest53.setRequestType(requestType56);
        java.lang.String str58 = bookRequest53.toCSVString();
        java.lang.String str59 = bookRequest53.toCSVString();
        boolean boolean60 = bookRequest23.equals((java.lang.Object) str59);
        bookRequest23.setBookTitle("hi!,null,null");
        gui.RequestType requestType63 = bookRequest23.getRequestType();
        boolean boolean64 = bookRequest14.equals((java.lang.Object) bookRequest23);
        gui.RequestType requestType65 = null;
        bookRequest23.setRequestType(requestType65);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(requestType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + ",null" + "'", str35, ",null");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(requestType55);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + ",null" + "'", str58, ",null");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + ",null" + "'", str59, ",null");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(requestType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType10 = null;
        gui.BookRequest bookRequest11 = new gui.BookRequest("", requestType10);
        gui.RequestType requestType12 = null;
        bookRequest11.setRequestType(requestType12);
        gui.RequestType requestType14 = bookRequest11.getRequestType();
        bookRequest11.setBookTitle("hi!");
        bookRequest11.setBookTitle(",null");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        java.lang.String str26 = bookRequest21.toCSVString();
        boolean boolean27 = bookRequest11.equals((java.lang.Object) str26);
        boolean boolean28 = bookRequest2.equals((java.lang.Object) str26);
        gui.RequestType requestType30 = null;
        gui.BookRequest bookRequest31 = new gui.BookRequest("", requestType30);
        java.lang.String str32 = bookRequest31.getBookTitle();
        gui.RequestType requestType33 = null;
        bookRequest31.setRequestType(requestType33);
        java.lang.String str35 = bookRequest31.getBookTitle();
        boolean boolean36 = bookRequest2.equals((java.lang.Object) str35);
        gui.RequestType requestType37 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle(",null,null");
        java.lang.String str40 = bookRequest2.toCSVString();
        gui.RequestType requestType41 = null;
        bookRequest2.setRequestType(requestType41);
        gui.RequestType requestType43 = null;
        bookRequest2.setRequestType(requestType43);
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(requestType37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + ",null,null,null" + "'", str40, ",null,null,null");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        java.lang.String str11 = bookRequest10.toCSVString();
        bookRequest10.setBookTitle("hi!");
        gui.RequestType requestType14 = null;
        bookRequest10.setRequestType(requestType14);
        java.lang.String str16 = bookRequest10.toCSVString();
        boolean boolean17 = bookRequest2.equals((java.lang.Object) str16);
        bookRequest2.setBookTitle(",null,null");
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        java.lang.String str23 = bookRequest22.toCSVString();
        bookRequest22.setBookTitle("hi!");
        gui.RequestType requestType26 = null;
        bookRequest22.setRequestType(requestType26);
        java.lang.String str28 = bookRequest22.getBookTitle();
        java.lang.String str29 = bookRequest22.toCSVString();
        gui.RequestType requestType31 = null;
        gui.BookRequest bookRequest32 = new gui.BookRequest("", requestType31);
        java.lang.String str33 = bookRequest32.getBookTitle();
        java.lang.String str34 = bookRequest32.toCSVString();
        gui.RequestType requestType35 = null;
        bookRequest32.setRequestType(requestType35);
        gui.RequestType requestType37 = null;
        bookRequest32.setRequestType(requestType37);
        bookRequest32.setBookTitle("hi!");
        boolean boolean41 = bookRequest22.equals((java.lang.Object) bookRequest32);
        gui.RequestType requestType43 = null;
        gui.BookRequest bookRequest44 = new gui.BookRequest("", requestType43);
        bookRequest44.setBookTitle("");
        gui.RequestType requestType47 = null;
        bookRequest44.setRequestType(requestType47);
        gui.RequestType requestType49 = null;
        bookRequest44.setRequestType(requestType49);
        bookRequest44.setBookTitle("hi!");
        boolean boolean53 = bookRequest32.equals((java.lang.Object) bookRequest44);
        gui.RequestType requestType54 = bookRequest32.getRequestType();
        boolean boolean55 = bookRequest2.equals((java.lang.Object) bookRequest32);
        java.lang.String str56 = bookRequest32.getBookTitle();
        gui.RequestType requestType57 = bookRequest32.getRequestType();
        bookRequest32.setBookTitle(",null,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!,null" + "'", str16, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ",null" + "'", str23, ",null");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!,null" + "'", str29, "hi!,null");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ",null" + "'", str34, ",null");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNull(requestType54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNull(requestType57);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle("hi!,null");
        java.lang.String str9 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("");
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        java.lang.Class<?> wildcardClass13 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null,null" + "'", str9, "hi!,null,null");
        org.junit.Assert.assertNull(requestType12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = bookRequest2.getRequestType();
        java.lang.String str5 = bookRequest2.toCSVString();
        java.lang.String str6 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle("hi!,null,null,null,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle("");
        java.lang.String str13 = bookRequest2.toCSVString();
        gui.RequestType requestType15 = null;
        gui.BookRequest bookRequest16 = new gui.BookRequest("", requestType15);
        gui.RequestType requestType17 = null;
        bookRequest16.setRequestType(requestType17);
        java.lang.String str19 = bookRequest16.toCSVString();
        gui.RequestType requestType20 = null;
        bookRequest16.setRequestType(requestType20);
        java.lang.String str22 = bookRequest16.getBookTitle();
        boolean boolean24 = bookRequest16.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType26 = null;
        gui.BookRequest bookRequest27 = new gui.BookRequest("", requestType26);
        java.lang.String str28 = bookRequest27.toCSVString();
        bookRequest27.setBookTitle("hi!");
        bookRequest27.setBookTitle(",null");
        boolean boolean33 = bookRequest16.equals((java.lang.Object) bookRequest27);
        gui.RequestType requestType34 = null;
        bookRequest16.setRequestType(requestType34);
        boolean boolean36 = bookRequest2.equals((java.lang.Object) bookRequest16);
        gui.RequestType requestType37 = null;
        bookRequest2.setRequestType(requestType37);
        java.lang.Class<?> wildcardClass39 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + ",null" + "'", str13, ",null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ",null" + "'", str19, ",null");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ",null" + "'", str28, ",null");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }
}

