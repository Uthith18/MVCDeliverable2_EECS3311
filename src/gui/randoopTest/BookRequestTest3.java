package gui.randoopTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BookRequestTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        java.lang.String str6 = bookRequest2.toCSVString();
        gui.RequestType requestType7 = bookRequest2.getRequestType();
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        java.lang.String str11 = bookRequest10.getBookTitle();
        gui.RequestType requestType12 = null;
        bookRequest10.setRequestType(requestType12);
        java.lang.String str14 = bookRequest10.getBookTitle();
        java.lang.String str15 = bookRequest10.getBookTitle();
        java.lang.String str16 = bookRequest10.getBookTitle();
        java.lang.String str17 = bookRequest10.getBookTitle();
        boolean boolean18 = bookRequest2.equals((java.lang.Object) bookRequest10);
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        gui.RequestType requestType22 = null;
        bookRequest21.setRequestType(requestType22);
        boolean boolean25 = bookRequest21.equals((java.lang.Object) 10L);
        java.lang.String str26 = bookRequest21.getBookTitle();
        bookRequest21.setBookTitle(",null");
        boolean boolean29 = bookRequest2.equals((java.lang.Object) ",null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertNull(requestType7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        java.lang.String str25 = bookRequest2.toCSVString();
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ",null" + "'", str25, ",null");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        boolean boolean9 = bookRequest2.equals((java.lang.Object) (short) 0);
        bookRequest2.setBookTitle("hi!,null,null");
        gui.RequestType requestType12 = bookRequest2.getRequestType();
        gui.RequestType requestType13 = null;
        bookRequest2.setRequestType(requestType13);
        gui.RequestType requestType15 = null;
        bookRequest2.setRequestType(requestType15);
        java.lang.String str17 = bookRequest2.toCSVString();
        gui.RequestType requestType18 = null;
        bookRequest2.setRequestType(requestType18);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(requestType12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!,null,null,null" + "'", str17, "hi!,null,null,null");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest(",null,null,null,null,null,null", requestType1);
        gui.RequestType requestType3 = bookRequest2.getRequestType();
        org.junit.Assert.assertNull(requestType3);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
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
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        bookRequest21.setBookTitle("");
        gui.RequestType requestType24 = null;
        bookRequest21.setRequestType(requestType24);
        gui.RequestType requestType26 = null;
        bookRequest21.setRequestType(requestType26);
        bookRequest21.setBookTitle("hi!");
        gui.RequestType requestType30 = null;
        bookRequest21.setRequestType(requestType30);
        gui.RequestType requestType32 = null;
        bookRequest21.setRequestType(requestType32);
        bookRequest21.setBookTitle("hi!,null,null,null");
        java.lang.Class<?> wildcardClass36 = bookRequest21.getClass();
        boolean boolean37 = bookRequest2.equals((java.lang.Object) wildcardClass36);
        java.lang.String str38 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + ",null" + "'", str18, ",null");
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + ",null" + "'", str38, ",null");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
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
        java.lang.String str18 = bookRequest5.getBookTitle();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertNull(requestType8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!,null,null" + "'", str15, "hi!,null,null");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!,null" + "'", str18, "hi!,null");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        gui.RequestType requestType5 = null;
        gui.BookRequest bookRequest6 = new gui.BookRequest("", requestType5);
        java.lang.String str7 = bookRequest6.getBookTitle();
        boolean boolean8 = bookRequest2.equals((java.lang.Object) bookRequest6);
        bookRequest6.setBookTitle("hi!,null,null,null,null");
        gui.RequestType requestType11 = null;
        bookRequest6.setRequestType(requestType11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
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
        bookRequest2.setBookTitle("hi!,null,null,null");
        gui.RequestType requestType18 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle(",null,null,null,null,null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + ",null" + "'", str6, ",null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertNull(requestType8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(requestType18);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        java.lang.String str33 = bookRequest2.toCSVString();
        gui.RequestType requestType35 = null;
        gui.BookRequest bookRequest36 = new gui.BookRequest("", requestType35);
        java.lang.String str37 = bookRequest36.toCSVString();
        bookRequest36.setBookTitle("hi!");
        gui.RequestType requestType40 = null;
        bookRequest36.setRequestType(requestType40);
        java.lang.String str42 = bookRequest36.getBookTitle();
        java.lang.String str43 = bookRequest36.toCSVString();
        java.lang.String str44 = bookRequest36.getBookTitle();
        gui.RequestType requestType46 = null;
        gui.BookRequest bookRequest47 = new gui.BookRequest("", requestType46);
        bookRequest47.setBookTitle("");
        gui.RequestType requestType50 = null;
        bookRequest47.setRequestType(requestType50);
        gui.RequestType requestType52 = null;
        bookRequest47.setRequestType(requestType52);
        boolean boolean54 = bookRequest36.equals((java.lang.Object) bookRequest47);
        gui.RequestType requestType55 = bookRequest36.getRequestType();
        java.lang.String str56 = bookRequest36.getBookTitle();
        java.lang.String str57 = bookRequest36.toCSVString();
        bookRequest36.setBookTitle("hi!,null,null,null");
        java.lang.String str60 = bookRequest36.toCSVString();
        boolean boolean61 = bookRequest2.equals((java.lang.Object) str60);
        gui.RequestType requestType62 = null;
        bookRequest2.setRequestType(requestType62);
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!,null,null,null" + "'", str32, "hi!,null,null,null");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!,null,null,null" + "'", str33, "hi!,null,null,null");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ",null" + "'", str37, ",null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!,null" + "'", str43, "hi!,null");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(requestType55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!,null" + "'", str57, "hi!,null");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!,null,null,null,null" + "'", str60, "hi!,null,null,null,null");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        java.lang.String str8 = bookRequest2.toCSVString();
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!,null" + "'", str8, "hi!,null");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertNull(requestType10);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        bookRequest2.setBookTitle("hi!");
        java.lang.String str7 = bookRequest2.getBookTitle();
        gui.RequestType requestType8 = bookRequest2.getRequestType();
        java.lang.String str9 = bookRequest2.getBookTitle();
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(requestType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        boolean boolean9 = bookRequest2.equals((java.lang.Object) 10.0d);
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        java.lang.String str12 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
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
        bookRequest22.setBookTitle("");
        java.lang.String str25 = bookRequest22.toCSVString();
        gui.RequestType requestType26 = bookRequest22.getRequestType();
        java.lang.String str27 = bookRequest22.toCSVString();
        gui.RequestType requestType29 = null;
        gui.BookRequest bookRequest30 = new gui.BookRequest("", requestType29);
        java.lang.String str31 = bookRequest30.getBookTitle();
        gui.RequestType requestType32 = null;
        bookRequest30.setRequestType(requestType32);
        java.lang.String str34 = bookRequest30.toCSVString();
        java.lang.String str35 = bookRequest30.getBookTitle();
        bookRequest30.setBookTitle("hi!,null,null,null");
        java.lang.Class<?> wildcardClass38 = bookRequest30.getClass();
        boolean boolean39 = bookRequest22.equals((java.lang.Object) wildcardClass38);
        gui.RequestType requestType40 = bookRequest22.getRequestType();
        bookRequest22.setBookTitle(",null,null");
        boolean boolean43 = bookRequest2.equals((java.lang.Object) ",null,null");
        gui.RequestType requestType44 = bookRequest2.getRequestType();
        java.lang.String str45 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null,null,null,null,null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + ",null" + "'", str25, ",null");
        org.junit.Assert.assertNull(requestType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ",null" + "'", str27, ",null");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + ",null" + "'", str34, ",null");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(requestType40);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(requestType44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!,null" + "'", str45, "hi!,null");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!");
        java.lang.String str11 = bookRequest2.getBookTitle();
        java.lang.String str12 = bookRequest2.getBookTitle();
        gui.RequestType requestType13 = null;
        bookRequest2.setRequestType(requestType13);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
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
        gui.RequestType requestType71 = bookRequest2.getRequestType();
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
        org.junit.Assert.assertNull(requestType71);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        gui.RequestType requestType3 = null;
        bookRequest2.setRequestType(requestType3);
        gui.RequestType requestType5 = bookRequest2.getRequestType();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType10 = bookRequest2.getRequestType();
        java.lang.String str11 = bookRequest2.toCSVString();
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        java.lang.String str15 = bookRequest14.getBookTitle();
        java.lang.String str16 = bookRequest14.toCSVString();
        gui.RequestType requestType17 = null;
        bookRequest14.setRequestType(requestType17);
        gui.RequestType requestType19 = null;
        bookRequest14.setRequestType(requestType19);
        bookRequest14.setBookTitle(",null");
        java.lang.String str23 = bookRequest14.toCSVString();
        boolean boolean24 = bookRequest2.equals((java.lang.Object) str23);
        java.lang.String str25 = bookRequest2.getBookTitle();
        java.lang.Class<?> wildcardClass26 = bookRequest2.getClass();
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertNull(requestType10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!,null" + "'", str11, "hi!,null");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + ",null" + "'", str16, ",null");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ",null,null" + "'", str23, ",null,null");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null");
        java.lang.String str8 = bookRequest2.toCSVString();
        java.lang.String str9 = bookRequest2.getBookTitle();
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        gui.RequestType requestType13 = null;
        bookRequest12.setRequestType(requestType13);
        gui.RequestType requestType15 = bookRequest12.getRequestType();
        bookRequest12.setBookTitle("hi!");
        gui.RequestType requestType18 = null;
        bookRequest12.setRequestType(requestType18);
        gui.RequestType requestType20 = bookRequest12.getRequestType();
        gui.RequestType requestType22 = null;
        gui.BookRequest bookRequest23 = new gui.BookRequest("", requestType22);
        bookRequest23.setBookTitle("");
        gui.RequestType requestType26 = null;
        bookRequest23.setRequestType(requestType26);
        java.lang.String str28 = bookRequest23.toCSVString();
        java.lang.String str29 = bookRequest23.getBookTitle();
        bookRequest23.setBookTitle("hi!,null");
        gui.RequestType requestType33 = null;
        gui.BookRequest bookRequest34 = new gui.BookRequest("", requestType33);
        gui.RequestType requestType35 = null;
        bookRequest34.setRequestType(requestType35);
        java.lang.String str37 = bookRequest34.toCSVString();
        gui.RequestType requestType38 = null;
        bookRequest34.setRequestType(requestType38);
        boolean boolean40 = bookRequest23.equals((java.lang.Object) bookRequest34);
        java.lang.String str41 = bookRequest23.getBookTitle();
        java.lang.String str42 = bookRequest23.toCSVString();
        gui.RequestType requestType43 = bookRequest23.getRequestType();
        gui.RequestType requestType45 = null;
        gui.BookRequest bookRequest46 = new gui.BookRequest("", requestType45);
        bookRequest46.setBookTitle("");
        gui.RequestType requestType49 = null;
        bookRequest46.setRequestType(requestType49);
        java.lang.String str51 = bookRequest46.toCSVString();
        boolean boolean53 = bookRequest46.equals((java.lang.Object) (short) 0);
        bookRequest46.setBookTitle("hi!,null,null");
        gui.RequestType requestType57 = null;
        gui.BookRequest bookRequest58 = new gui.BookRequest("", requestType57);
        java.lang.String str59 = bookRequest58.getBookTitle();
        java.lang.String str60 = bookRequest58.toCSVString();
        java.lang.String str61 = bookRequest58.getBookTitle();
        java.lang.String str62 = bookRequest58.getBookTitle();
        gui.RequestType requestType63 = bookRequest58.getRequestType();
        boolean boolean64 = bookRequest46.equals((java.lang.Object) bookRequest58);
        gui.RequestType requestType65 = bookRequest58.getRequestType();
        gui.RequestType requestType67 = null;
        gui.BookRequest bookRequest68 = new gui.BookRequest("", requestType67);
        java.lang.String str69 = bookRequest68.getBookTitle();
        gui.RequestType requestType70 = bookRequest68.getRequestType();
        bookRequest68.setBookTitle("hi!");
        gui.RequestType requestType74 = null;
        gui.BookRequest bookRequest75 = new gui.BookRequest("", requestType74);
        java.lang.String str76 = bookRequest75.getBookTitle();
        java.lang.String str77 = bookRequest75.toCSVString();
        boolean boolean78 = bookRequest68.equals((java.lang.Object) bookRequest75);
        gui.RequestType requestType79 = null;
        bookRequest68.setRequestType(requestType79);
        gui.RequestType requestType81 = bookRequest68.getRequestType();
        boolean boolean82 = bookRequest58.equals((java.lang.Object) bookRequest68);
        boolean boolean83 = bookRequest23.equals((java.lang.Object) bookRequest68);
        boolean boolean84 = bookRequest12.equals((java.lang.Object) boolean83);
        boolean boolean85 = bookRequest2.equals((java.lang.Object) boolean84);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",null,null" + "'", str8, ",null,null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertNull(requestType15);
        org.junit.Assert.assertNull(requestType20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ",null" + "'", str28, ",null");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ",null" + "'", str37, ",null");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!,null" + "'", str41, "hi!,null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!,null,null" + "'", str42, "hi!,null,null");
        org.junit.Assert.assertNull(requestType43);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + ",null" + "'", str51, ",null");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + ",null" + "'", str60, ",null");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNull(requestType63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(requestType65);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNull(requestType70);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + ",null" + "'", str77, ",null");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNull(requestType81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.getBookTitle();
        java.lang.String str6 = bookRequest2.getBookTitle();
        gui.RequestType requestType7 = bookRequest2.getRequestType();
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        bookRequest12.setBookTitle("");
        gui.RequestType requestType15 = null;
        bookRequest12.setRequestType(requestType15);
        bookRequest12.setBookTitle("hi!");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        gui.RequestType requestType22 = null;
        bookRequest21.setRequestType(requestType22);
        gui.RequestType requestType24 = bookRequest21.getRequestType();
        bookRequest21.setBookTitle("hi!");
        bookRequest21.setBookTitle(",null");
        gui.RequestType requestType30 = null;
        gui.BookRequest bookRequest31 = new gui.BookRequest("", requestType30);
        bookRequest31.setBookTitle("");
        gui.RequestType requestType34 = null;
        bookRequest31.setRequestType(requestType34);
        java.lang.String str36 = bookRequest31.toCSVString();
        boolean boolean37 = bookRequest21.equals((java.lang.Object) str36);
        boolean boolean38 = bookRequest12.equals((java.lang.Object) str36);
        bookRequest12.setBookTitle(",null");
        java.lang.String str41 = bookRequest12.toCSVString();
        gui.RequestType requestType43 = null;
        gui.BookRequest bookRequest44 = new gui.BookRequest("", requestType43);
        gui.RequestType requestType45 = null;
        bookRequest44.setRequestType(requestType45);
        boolean boolean48 = bookRequest44.equals((java.lang.Object) 10L);
        boolean boolean50 = bookRequest44.equals((java.lang.Object) 'a');
        gui.RequestType requestType51 = null;
        bookRequest44.setRequestType(requestType51);
        boolean boolean53 = bookRequest12.equals((java.lang.Object) bookRequest44);
        boolean boolean54 = bookRequest2.equals((java.lang.Object) bookRequest12);
        java.lang.String str55 = bookRequest12.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(requestType7);
        org.junit.Assert.assertNull(requestType24);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ",null" + "'", str36, ",null");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + ",null,null" + "'", str41, ",null,null");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + ",null,null" + "'", str55, ",null,null");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
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
        java.lang.String str12 = bookRequest8.toCSVString();
        gui.RequestType requestType13 = bookRequest8.getRequestType();
        java.lang.String str14 = bookRequest8.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
        org.junit.Assert.assertNull(requestType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        gui.RequestType requestType40 = bookRequest2.getRequestType();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(requestType37);
        org.junit.Assert.assertNull(requestType40);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
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
        java.lang.String str33 = bookRequest2.toCSVString();
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + ",null" + "'", str26, ",null");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + ",null" + "'", str32, ",null");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + ",null" + "'", str33, ",null");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass23 = requestType22.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(requestType22);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        java.lang.String str23 = bookRequest2.toCSVString();
        java.lang.String str24 = bookRequest2.getBookTitle();
        gui.RequestType requestType25 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!,null" + "'", str23, "hi!,null");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(requestType25);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        java.lang.String str12 = bookRequest2.toCSVString();
        gui.RequestType requestType13 = null;
        bookRequest2.setRequestType(requestType13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertNull(requestType5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + ",null" + "'", str12, ",null");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        java.lang.String str22 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null,null,null,null,null,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!,null" + "'", str22, "hi!,null");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        bookRequest2.setBookTitle("hi!");
        java.lang.Class<?> wildcardClass18 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(requestType14);
        org.junit.Assert.assertNull(requestType15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        bookRequest2.setBookTitle("hi!,null,null,null");
        java.lang.String str11 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!,null,null,null" + "'", str11, "hi!,null,null,null");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        bookRequest2.setBookTitle(",null,null");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("hi!", requestType9);
        gui.RequestType requestType11 = bookRequest10.getRequestType();
        bookRequest10.setBookTitle(",null");
        java.lang.String str14 = bookRequest10.toCSVString();
        gui.RequestType requestType15 = bookRequest10.getRequestType();
        gui.RequestType requestType16 = null;
        bookRequest10.setRequestType(requestType16);
        boolean boolean18 = bookRequest2.equals((java.lang.Object) bookRequest10);
        java.lang.String str19 = bookRequest10.toCSVString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null,null" + "'", str14, ",null,null");
        org.junit.Assert.assertNull(requestType15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + ",null,null" + "'", str19, ",null,null");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        java.lang.String str20 = bookRequest10.getBookTitle();
        gui.RequestType requestType22 = null;
        gui.BookRequest bookRequest23 = new gui.BookRequest("", requestType22);
        bookRequest23.setBookTitle("");
        gui.RequestType requestType26 = null;
        bookRequest23.setRequestType(requestType26);
        bookRequest23.setBookTitle("hi!");
        gui.RequestType requestType31 = null;
        gui.BookRequest bookRequest32 = new gui.BookRequest("", requestType31);
        gui.RequestType requestType33 = null;
        bookRequest32.setRequestType(requestType33);
        gui.RequestType requestType35 = bookRequest32.getRequestType();
        bookRequest32.setBookTitle("hi!");
        bookRequest32.setBookTitle(",null");
        gui.RequestType requestType41 = null;
        gui.BookRequest bookRequest42 = new gui.BookRequest("", requestType41);
        bookRequest42.setBookTitle("");
        gui.RequestType requestType45 = null;
        bookRequest42.setRequestType(requestType45);
        java.lang.String str47 = bookRequest42.toCSVString();
        boolean boolean48 = bookRequest32.equals((java.lang.Object) str47);
        boolean boolean49 = bookRequest23.equals((java.lang.Object) str47);
        java.lang.String str50 = bookRequest23.getBookTitle();
        gui.RequestType requestType51 = null;
        bookRequest23.setRequestType(requestType51);
        java.lang.Class<?> wildcardClass53 = bookRequest23.getClass();
        boolean boolean54 = bookRequest10.equals((java.lang.Object) wildcardClass53);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(requestType35);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + ",null" + "'", str47, ",null");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        gui.RequestType requestType13 = null;
        gui.BookRequest bookRequest14 = new gui.BookRequest("", requestType13);
        bookRequest14.setBookTitle("");
        gui.RequestType requestType17 = null;
        bookRequest14.setRequestType(requestType17);
        bookRequest14.setBookTitle(",null");
        gui.RequestType requestType22 = null;
        gui.BookRequest bookRequest23 = new gui.BookRequest("", requestType22);
        bookRequest23.setBookTitle("");
        gui.RequestType requestType26 = null;
        bookRequest23.setRequestType(requestType26);
        java.lang.String str28 = bookRequest23.toCSVString();
        boolean boolean30 = bookRequest23.equals((java.lang.Object) (short) 0);
        boolean boolean31 = bookRequest14.equals((java.lang.Object) boolean30);
        gui.RequestType requestType32 = bookRequest14.getRequestType();
        java.lang.String str33 = bookRequest14.toCSVString();
        boolean boolean34 = bookRequest2.equals((java.lang.Object) bookRequest14);
        gui.RequestType requestType35 = null;
        bookRequest2.setRequestType(requestType35);
        java.lang.String str37 = bookRequest2.getBookTitle();
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + ",null" + "'", str28, ",null");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(requestType32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + ",null,null" + "'", str33, ",null,null");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + ",null" + "'", str37, ",null");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        gui.RequestType requestType23 = null;
        gui.BookRequest bookRequest24 = new gui.BookRequest("", requestType23);
        bookRequest24.setBookTitle("");
        gui.RequestType requestType27 = null;
        bookRequest24.setRequestType(requestType27);
        gui.RequestType requestType29 = null;
        bookRequest24.setRequestType(requestType29);
        bookRequest24.setBookTitle("hi!");
        boolean boolean33 = bookRequest12.equals((java.lang.Object) bookRequest24);
        java.lang.Class<?> wildcardClass34 = bookRequest12.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!,null" + "'", str9, "hi!,null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.getBookTitle();
        java.lang.String str6 = bookRequest2.getBookTitle();
        gui.RequestType requestType7 = bookRequest2.getRequestType();
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        bookRequest12.setBookTitle("");
        gui.RequestType requestType15 = null;
        bookRequest12.setRequestType(requestType15);
        bookRequest12.setBookTitle("hi!");
        gui.RequestType requestType20 = null;
        gui.BookRequest bookRequest21 = new gui.BookRequest("", requestType20);
        gui.RequestType requestType22 = null;
        bookRequest21.setRequestType(requestType22);
        gui.RequestType requestType24 = bookRequest21.getRequestType();
        bookRequest21.setBookTitle("hi!");
        bookRequest21.setBookTitle(",null");
        gui.RequestType requestType30 = null;
        gui.BookRequest bookRequest31 = new gui.BookRequest("", requestType30);
        bookRequest31.setBookTitle("");
        gui.RequestType requestType34 = null;
        bookRequest31.setRequestType(requestType34);
        java.lang.String str36 = bookRequest31.toCSVString();
        boolean boolean37 = bookRequest21.equals((java.lang.Object) str36);
        boolean boolean38 = bookRequest12.equals((java.lang.Object) str36);
        bookRequest12.setBookTitle(",null");
        java.lang.String str41 = bookRequest12.toCSVString();
        gui.RequestType requestType43 = null;
        gui.BookRequest bookRequest44 = new gui.BookRequest("", requestType43);
        gui.RequestType requestType45 = null;
        bookRequest44.setRequestType(requestType45);
        boolean boolean48 = bookRequest44.equals((java.lang.Object) 10L);
        boolean boolean50 = bookRequest44.equals((java.lang.Object) 'a');
        gui.RequestType requestType51 = null;
        bookRequest44.setRequestType(requestType51);
        boolean boolean53 = bookRequest12.equals((java.lang.Object) bookRequest44);
        boolean boolean54 = bookRequest2.equals((java.lang.Object) bookRequest12);
        gui.RequestType requestType55 = bookRequest2.getRequestType();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(requestType7);
        org.junit.Assert.assertNull(requestType24);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ",null" + "'", str36, ",null");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + ",null,null" + "'", str41, ",null,null");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(requestType55);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        bookRequest2.setBookTitle(",null");
        gui.RequestType requestType8 = bookRequest2.getRequestType();
        java.lang.String str9 = bookRequest2.toCSVString();
        java.lang.String str10 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertNull(requestType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null,null" + "'", str9, ",null,null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("hi!", requestType21);
        gui.RequestType requestType23 = bookRequest22.getRequestType();
        gui.RequestType requestType24 = null;
        bookRequest22.setRequestType(requestType24);
        boolean boolean27 = bookRequest22.equals((java.lang.Object) 'a');
        bookRequest22.setBookTitle(",null");
        boolean boolean31 = bookRequest22.equals((java.lang.Object) 10L);
        gui.RequestType requestType33 = null;
        gui.BookRequest bookRequest34 = new gui.BookRequest("", requestType33);
        bookRequest34.setBookTitle("");
        gui.RequestType requestType37 = null;
        bookRequest34.setRequestType(requestType37);
        java.lang.String str39 = bookRequest34.toCSVString();
        java.lang.String str40 = bookRequest34.getBookTitle();
        java.lang.Class<?> wildcardClass41 = bookRequest34.getClass();
        boolean boolean42 = bookRequest22.equals((java.lang.Object) wildcardClass41);
        boolean boolean43 = bookRequest13.equals((java.lang.Object) bookRequest22);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(requestType23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + ",null" + "'", str39, ",null");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        gui.RequestType requestType7 = null;
        bookRequest2.setRequestType(requestType7);
        java.lang.String str9 = bookRequest2.getBookTitle();
        gui.RequestType requestType10 = null;
        bookRequest2.setRequestType(requestType10);
        java.lang.String str12 = bookRequest2.getBookTitle();
        java.lang.String str13 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle(",null");
        java.lang.String str8 = bookRequest2.toCSVString();
        java.lang.String str9 = bookRequest2.getBookTitle();
        java.lang.String str10 = bookRequest2.getBookTitle();
        gui.RequestType requestType11 = null;
        bookRequest2.setRequestType(requestType11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + ",null,null" + "'", str8, ",null,null");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
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
        gui.RequestType requestType25 = bookRequest13.getRequestType();
        gui.RequestType requestType26 = bookRequest13.getRequestType();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + ",null" + "'", str5, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + ",null" + "'", str14, ",null");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(requestType24);
        org.junit.Assert.assertNull(requestType25);
        org.junit.Assert.assertNull(requestType26);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        java.lang.String str4 = bookRequest2.toCSVString();
        java.lang.String str5 = bookRequest2.getBookTitle();
        gui.RequestType requestType7 = null;
        gui.BookRequest bookRequest8 = new gui.BookRequest("", requestType7);
        gui.RequestType requestType9 = null;
        bookRequest8.setRequestType(requestType9);
        gui.RequestType requestType11 = bookRequest8.getRequestType();
        bookRequest8.setBookTitle("hi!");
        gui.RequestType requestType14 = null;
        bookRequest8.setRequestType(requestType14);
        gui.RequestType requestType16 = null;
        bookRequest8.setRequestType(requestType16);
        gui.RequestType requestType19 = null;
        gui.BookRequest bookRequest20 = new gui.BookRequest("", requestType19);
        java.lang.String str21 = bookRequest20.getBookTitle();
        java.lang.String str22 = bookRequest20.getBookTitle();
        bookRequest20.setBookTitle(",null");
        gui.RequestType requestType25 = null;
        bookRequest20.setRequestType(requestType25);
        boolean boolean27 = bookRequest8.equals((java.lang.Object) requestType25);
        boolean boolean29 = bookRequest8.equals((java.lang.Object) (short) 1);
        boolean boolean30 = bookRequest2.equals((java.lang.Object) bookRequest8);
        bookRequest8.setBookTitle(",null,null,null");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + ",null" + "'", str4, ",null");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(requestType11);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
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
        gui.RequestType requestType14 = null;
        bookRequest8.setRequestType(requestType14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + ",null" + "'", str9, ",null");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + ",null" + "'", str10, ",null");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
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
        gui.RequestType requestType19 = bookRequest7.getRequestType();
        gui.RequestType requestType20 = bookRequest7.getRequestType();
        org.junit.Assert.assertNull(requestType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(requestType18);
        org.junit.Assert.assertNull(requestType19);
        org.junit.Assert.assertNull(requestType20);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        bookRequest2.setBookTitle("");
        gui.RequestType requestType5 = null;
        bookRequest2.setRequestType(requestType5);
        java.lang.String str7 = bookRequest2.toCSVString();
        java.lang.String str8 = bookRequest2.getBookTitle();
        gui.RequestType requestType9 = bookRequest2.getRequestType();
        java.lang.String str10 = bookRequest2.getBookTitle();
        java.lang.String str11 = bookRequest2.toCSVString();
        java.lang.Class<?> wildcardClass12 = bookRequest2.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(requestType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + ",null" + "'", str11, ",null");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
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
        bookRequest2.setBookTitle(",null,null,null,null");
        gui.RequestType requestType17 = null;
        gui.BookRequest bookRequest18 = new gui.BookRequest("", requestType17);
        java.lang.String str19 = bookRequest18.getBookTitle();
        java.lang.String str20 = bookRequest18.getBookTitle();
        gui.RequestType requestType21 = bookRequest18.getRequestType();
        gui.RequestType requestType22 = null;
        bookRequest18.setRequestType(requestType22);
        gui.RequestType requestType24 = bookRequest18.getRequestType();
        java.lang.String str25 = bookRequest18.getBookTitle();
        boolean boolean26 = bookRequest2.equals((java.lang.Object) bookRequest18);
        java.lang.String str27 = bookRequest2.toCSVString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!,null" + "'", str12, "hi!,null");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(requestType21);
        org.junit.Assert.assertNull(requestType24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + ",null,null,null,null,null" + "'", str27, ",null,null,null,null,null");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
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
        java.lang.String str23 = bookRequest2.getBookTitle();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + ",null" + "'", str15, ",null");
        org.junit.Assert.assertNull(requestType22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ",null,null" + "'", str23, ",null,null");
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.getBookTitle();
        gui.RequestType requestType4 = null;
        bookRequest2.setRequestType(requestType4);
        java.lang.String str6 = bookRequest2.getBookTitle();
        java.lang.String str7 = bookRequest2.toCSVString();
        gui.RequestType requestType9 = null;
        gui.BookRequest bookRequest10 = new gui.BookRequest("", requestType9);
        bookRequest10.setBookTitle("");
        gui.RequestType requestType13 = null;
        bookRequest10.setRequestType(requestType13);
        gui.RequestType requestType15 = null;
        bookRequest10.setRequestType(requestType15);
        bookRequest10.setBookTitle("hi!");
        java.lang.String str19 = bookRequest10.getBookTitle();
        boolean boolean20 = bookRequest2.equals((java.lang.Object) bookRequest10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + ",null" + "'", str7, ",null");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        gui.RequestType requestType1 = null;
        gui.BookRequest bookRequest2 = new gui.BookRequest("", requestType1);
        java.lang.String str3 = bookRequest2.toCSVString();
        bookRequest2.setBookTitle("hi!");
        gui.RequestType requestType6 = null;
        bookRequest2.setRequestType(requestType6);
        gui.RequestType requestType8 = null;
        bookRequest2.setRequestType(requestType8);
        gui.RequestType requestType11 = null;
        gui.BookRequest bookRequest12 = new gui.BookRequest("", requestType11);
        java.lang.String str13 = bookRequest12.getBookTitle();
        java.lang.String str14 = bookRequest12.getBookTitle();
        bookRequest12.setBookTitle("hi!");
        gui.RequestType requestType17 = null;
        bookRequest12.setRequestType(requestType17);
        gui.RequestType requestType19 = bookRequest12.getRequestType();
        gui.RequestType requestType21 = null;
        gui.BookRequest bookRequest22 = new gui.BookRequest("", requestType21);
        java.lang.String str23 = bookRequest22.toCSVString();
        gui.RequestType requestType25 = null;
        gui.BookRequest bookRequest26 = new gui.BookRequest("", requestType25);
        java.lang.String str27 = bookRequest26.getBookTitle();
        boolean boolean28 = bookRequest22.equals((java.lang.Object) bookRequest26);
        gui.RequestType requestType29 = bookRequest22.getRequestType();
        boolean boolean30 = bookRequest12.equals((java.lang.Object) requestType29);
        java.lang.String str31 = bookRequest12.getBookTitle();
        boolean boolean32 = bookRequest2.equals((java.lang.Object) bookRequest12);
        gui.RequestType requestType34 = null;
        gui.BookRequest bookRequest35 = new gui.BookRequest("", requestType34);
        java.lang.String str36 = bookRequest35.toCSVString();
        bookRequest35.setBookTitle("hi!");
        gui.RequestType requestType39 = null;
        bookRequest35.setRequestType(requestType39);
        java.lang.String str41 = bookRequest35.toCSVString();
        java.lang.String str42 = bookRequest35.getBookTitle();
        java.lang.Class<?> wildcardClass43 = bookRequest35.getClass();
        boolean boolean44 = bookRequest2.equals((java.lang.Object) wildcardClass43);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ",null" + "'", str3, ",null");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(requestType19);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + ",null" + "'", str23, ",null");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(requestType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + ",null" + "'", str36, ",null");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!,null" + "'", str41, "hi!,null");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }
}

