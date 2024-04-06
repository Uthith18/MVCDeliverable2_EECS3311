package gui.randoopTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        int int18 = item7.getItemId();
        item7.setLocation("hi!");
        item7.setName("");
        int int23 = item7.getCopiesAvailable();
        item7.setItemId((int) (byte) 1);
        java.lang.String str26 = item7.getName();
        item7.setGenre("hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        java.lang.String str29 = item7.getGenre();
        java.lang.String str30 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35" + "'", str29, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " () - Copies: 100" + "'", str30, " () - Copies: 100");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setItemId((int) (byte) 10);
        item7.setItemId(100);
        item7.setName("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getName();
        java.lang.Class<?> wildcardClass15 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!" + "'", str14, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        int int10 = item7.getCopiesAvailable();
        java.lang.String str11 = item7.getLocation();
        java.lang.String str12 = item7.getName();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str14 = item7.getLocation();
        item7.setLocation("-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setItemId((int) (byte) 1);
        java.lang.String str19 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str19, "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setCopiesAvailable(0);
        java.lang.String str18 = item7.getAuthor();
        int int19 = item7.getCopiesAvailable();
        java.lang.String str20 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.toString();
        item7.setItemId((int) 'a');
        item7.setAuthor("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str20 = item7.getLocation();
        item7.setName("");
        item7.setCopiesAvailable(32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        int int12 = item7.getCopiesAvailable();
        java.lang.String str13 = item7.toString();
        item7.setGenre("-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! () - Copies: 1" + "'", str13, "hi! () - Copies: 1");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.getLocation();
        java.lang.String str20 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str19, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        int int9 = item7.getItemId();
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setLocation("");
        item7.setCopiesAvailable((int) (byte) 10);
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        java.lang.String str13 = item7.getName();
        item7.setType("");
        item7.setGenre("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi! () - Copies: 100");
        item7.setAuthor("hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        java.lang.String str18 = item7.toString();
        item7.setGenre("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str21 = item7.getType();
        java.lang.String str22 = item7.toCsvString();
        java.lang.String str23 = item7.getLocation();
        int int24 = item7.getItemId();
        java.lang.String str25 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!" + "'", str22, "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str25, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        item7.setItemId(0);
        item7.setCopiesAvailable((int) (byte) 10);
        item7.setAuthor(" (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getName();
        item7.setCopiesAvailable((int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getLocation();
        item7.setCopiesAvailable((int) (short) 10);
        java.lang.String str11 = item7.getType();
        item7.setName("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        java.lang.String str14 = item7.getLocation();
        java.lang.String str15 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        java.lang.String str9 = item7.getLocation();
        java.lang.String str10 = item7.getType();
        int int11 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        int int12 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("hi! () - Copies: 1");
        int int19 = item7.getCopiesAvailable();
        java.lang.String str20 = item7.getType();
        java.lang.String str21 = item7.getAuthor();
        item7.setItemId((int) (byte) 1);
        item7.setGenre("-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!");
        int int26 = item7.getItemId();
        java.lang.String str27 = item7.getAuthor();
        java.lang.Class<?> wildcardClass28 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getName();
        item7.setCopiesAvailable((int) (byte) -1);
        java.lang.String str18 = item7.getType();
        java.lang.String str19 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,-1,hi! () - Copies: 1,hi!" + "'", str19, "-1,,hi!,,-1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        int int18 = item7.getCopiesAvailable();
        java.lang.String str19 = item7.getGenre();
        java.lang.String str20 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setType("hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.String str20 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi!,hi! (hi! () - Copies: 1 (hi!) - Copies: 0) - Copies: 1" + "'", str20, "-1,,hi!,,1,hi!,hi! (hi! () - Copies: 1 (hi!) - Copies: 0) - Copies: 1");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        java.lang.Class<?> wildcardClass15 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        item7.setCopiesAvailable((int) '#');
        item7.setAuthor("-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        gui.Item item7 = new gui.Item(32, "-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "", "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1", 0, "", "-1,hi!,35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,hi!,hi!");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("");
        java.lang.String str15 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str18 = item7.getName();
        int int19 = item7.getItemId();
        item7.setItemId(0);
        int int22 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        gui.Item item7 = new gui.Item((int) (byte) -1, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi! () - Copies: 1", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", 100, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str8 = item7.getLocation();
        java.lang.String str9 = item7.toCsvString();
        java.lang.String str10 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1," + "'", str8, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str9, "-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.getName();
        item7.setCopiesAvailable((-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setAuthor("hi! () - Copies: -1");
        java.lang.String str13 = item7.getType();
        item7.setItemId(35);
        item7.setLocation("-1,,hi!,,1,hi!,");
        java.lang.String str18 = item7.getGenre();
        java.lang.String str19 = item7.getType();
        item7.setCopiesAvailable((int) (short) 100);
        java.lang.String str22 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!," + "'", str22, "-1,,hi!,,1,hi!,");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        gui.Item item7 = new gui.Item((int) '4', "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!", "32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,", "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100", (int) (byte) 100, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "-1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
        java.lang.String str8 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100" + "'", str8, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.toCsvString();
        java.lang.String str16 = item7.toCsvString();
        java.lang.String str17 = item7.getType();
        item7.setName("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str20 = item7.toString();
        item7.setCopiesAvailable((int) 'a');
        int int23 = item7.getCopiesAvailable();
        item7.setLocation("-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str15, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str16, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getAuthor();
        item7.setLocation("1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        item7.setType("32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        item7.setAuthor("hi! () - Copies: 100");
        int int15 = item7.getItemId();
        item7.setName("hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        int int12 = item7.getCopiesAvailable();
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setLocation("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (byte) 10);
        int int19 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        item7.setLocation("hi!");
        java.lang.String str12 = item7.toString();
        item7.setItemId((int) (short) 0);
        java.lang.String str15 = item7.getType();
        java.lang.String str16 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        gui.Item item7 = new gui.Item(100, "hi! () - Copies: 1 (hi!) - Copies: 0", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", (int) (byte) 0, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getCopiesAvailable();
        item7.setType("32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 52");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getCopiesAvailable();
        java.lang.String str18 = item7.toCsvString();
        item7.setCopiesAvailable(1);
        item7.setItemId((int) (byte) 10);
        java.lang.String str23 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        java.lang.String str17 = item7.getLocation();
        java.lang.Class<?> wildcardClass18 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        item7.setLocation("hi!");
        item7.setGenre("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        int int19 = item7.getCopiesAvailable();
        item7.setName("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setGenre("");
        item7.setCopiesAvailable((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        gui.Item item7 = new gui.Item((int) (short) -1, "0,,hi!,,32,hi!,hi! (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 32", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", " () - Copies: 10", 0, "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str8, "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        item7.setCopiesAvailable((int) (byte) -1);
        item7.setAuthor("hi! () - Copies: 1");
        item7.setItemId((int) (byte) 100);
        item7.setCopiesAvailable((int) '4');
        item7.setName("0,hi! () - Copies: 1,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("");
        item7.setCopiesAvailable((int) (short) 1);
        item7.setGenre("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        item7.setName("0,hi! () - Copies: 1,hi!,,1,hi!,hi!");
        java.lang.String str21 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        item7.setGenre("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        int int10 = item7.getItemId();
        java.lang.String str11 = item7.getName();
        int int12 = item7.getCopiesAvailable();
        java.lang.Class<?> wildcardClass13 = item7.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int13 = item7.getItemId();
        item7.setType("-1,,hi!,hi!,100,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        gui.Item item7 = new gui.Item((int) (short) -1, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "hi! () - Copies: 1", "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", (int) (short) 1, "0,,hi!,,1,hi!,hi!", "hi!");
        item7.setName(" () - Copies: -1");
        java.lang.String str10 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str10, "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        gui.Item item7 = new gui.Item((int) (byte) 10, "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,0,,hi!,,1,hi!,hi!,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!", (int) (byte) 1, "hi! () - Copies: 35", "hi!");
        java.lang.String str8 = item7.getType();
        int int9 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str8, "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        item7.setItemId((int) (short) 1);
        item7.setAuthor(" () - Copies: 100");
        item7.setName("-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setType("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setItemId((int) (byte) 10);
        java.lang.String str10 = item7.getType();
        item7.setCopiesAvailable((int) (short) 1);
        item7.setCopiesAvailable((int) '4');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: -1" + "'", str10, "hi! () - Copies: -1");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setGenre("");
        item7.setGenre("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1");
        java.lang.String str14 = item7.toString();
        item7.setItemId((int) (short) 1);
        item7.setType("10,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        gui.Item item7 = new gui.Item(100, "hi! () - Copies: 1 (hi!) - Copies: 0", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", (int) (byte) 0, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getName();
        item7.setAuthor("1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        java.lang.String str19 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! (hi!) - Copies: 1" + "'", str19, "hi! (hi!) - Copies: 1");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.toString();
        java.lang.String str19 = item7.toString();
        int int20 = item7.getItemId();
        item7.setItemId((int) (short) 100);
        item7.setLocation("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str18, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str19, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setAuthor("hi!");
        java.lang.String str14 = item7.getAuthor();
        int int15 = item7.getItemId();
        int int16 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toString();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getGenre();
        java.lang.Class<?> wildcardClass18 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getName();
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int19 = item7.getCopiesAvailable();
        item7.setType("32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        java.lang.String str22 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("hi! () - Copies: 1");
        int int19 = item7.getCopiesAvailable();
        java.lang.String str20 = item7.getName();
        java.lang.String str21 = item7.toCsvString();
        java.lang.Class<?> wildcardClass22 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str21, "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        gui.Item item7 = new gui.Item(1, "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 52", (int) 'a', "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getName();
        java.lang.String str17 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        gui.Item item7 = new gui.Item(0, "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "0,,hi!,,32,hi!,hi! (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 32", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi! () - Copies: 35", 52, "hi! () - Copies: -1 (hi! () - Copies: -1) - Copies: 100", "0,,hi!,,1,hi!, () - Copies: 10");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        int int9 = item7.getItemId();
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setLocation("");
        item7.setGenre("-1,,,hi!,100,hi!,hi! () - Copies: 1");
        java.lang.String str16 = item7.getLocation();
        java.lang.Class<?> wildcardClass17 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        item7.setCopiesAvailable((int) (byte) -1);
        int int18 = item7.getCopiesAvailable();
        item7.setType("-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setName("-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        item7.setCopiesAvailable((-1));
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getLocation();
        java.lang.String str15 = item7.toString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: -1" + "'", str15, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: -1");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        item7.setLocation("hi!");
        item7.setType("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str19 = item7.getType();
        int int20 = item7.getItemId();
        item7.setAuthor("1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!,1,-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!");
        item7.setName("-1,,hi!,,52,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str19, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        int int11 = item7.getCopiesAvailable();
        int int12 = item7.getCopiesAvailable();
        java.lang.String str13 = item7.getGenre();
        java.lang.Class<?> wildcardClass14 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        gui.Item item7 = new gui.Item((int) '4', "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35", "-1,,hi!,,1,hi!,hi!", (int) (byte) 10, "-1,,,,1,-1,,hi!,,1,hi!,hi!,", "hi!");
        java.lang.String str8 = item7.toString();
        java.lang.String str9 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10" + "'", str8, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "52,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,hi!,10,-1,,,,1,-1,,hi!,,1,hi!,hi!,,hi!" + "'", str9, "52,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,hi!,10,-1,,,,1,-1,,hi!,,1,hi!,hi!,,hi!");
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        int int18 = item7.getItemId();
        item7.setLocation("hi!");
        item7.setName("");
        java.lang.String str23 = item7.getType();
        java.lang.String str24 = item7.toCsvString();
        int int25 = item7.getCopiesAvailable();
        item7.setAuthor(" () - Copies: 100");
        item7.setItemId(0);
        int int30 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str24, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setLocation("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setGenre("-1,,hi!,,-1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        gui.Item item7 = new gui.Item((int) (byte) 10, "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", "hi!", "-1,,hi!,,35,hi!,", 1, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "");
        int int8 = item7.getCopiesAvailable();
        item7.setGenre("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getAuthor();
        item7.setType("hi! () - Copies: 1");
        java.lang.String str14 = item7.getName();
        int int15 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int15 = item7.getItemId();
        item7.setLocation("10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.toString();
        java.lang.String str19 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 1" + "'", str18, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str19, "-1,,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        int int18 = item7.getItemId();
        item7.setLocation("hi!");
        item7.setName("");
        int int23 = item7.getCopiesAvailable();
        java.lang.String str24 = item7.getType();
        java.lang.String str25 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! () - Copies: 1" + "'", str25, "hi! () - Copies: 1");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        int int14 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.toString();
        item7.setType("-1,,hi!,-1,,hi!,,1,hi!,hi!,100,hi!,hi! () - Copies: 1");
        item7.setAuthor("-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int23 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        gui.Item item7 = new gui.Item((int) (short) 100, "100,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,35,hi!,,52,hi! () - Copies: 100, (hi!) - Copies: 1", "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!", "0,,hi!,,32,hi!,hi! (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 32", (int) (short) -1, "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! () - Copies: 1");
        java.lang.String str20 = item7.toCsvString();
        java.lang.String str21 = item7.getType();
        java.lang.String str22 = item7.getName();
        item7.setName("");
        java.lang.Class<?> wildcardClass25 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        java.lang.String str14 = item7.getLocation();
        int int15 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) (byte) 1);
        item7.setAuthor("0,hi! () - Copies: 1,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        gui.Item item7 = new gui.Item((int) 'a', "0,,hi!,hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0,1,hi!,-1,,hi!,,1,hi!,hi!", " () - Copies: 10", "", (int) (short) -1, "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        item7.setAuthor("1,hi! () - Copies: 1,-1,,hi!,,100,hi!,hi! () - Copies: 1,hi! () - Copies: -1,32,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        gui.Item item7 = new gui.Item((int) (short) 1, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "", (int) (short) 1, "0,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        java.lang.String str9 = item7.toString();
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1" + "'", str9, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,1,0,,hi!,,1,hi!,hi!," + "'", str10, "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,1,0,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        java.lang.String str17 = item7.getName();
        item7.setItemId((int) (byte) 100);
        java.lang.String str20 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "100,hi!,hi!,,1,hi!,hi!" + "'", str20, "100,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        java.lang.String str8 = item7.getAuthor();
        int int9 = item7.getItemId();
        java.lang.String str10 = item7.getName();
        item7.setItemId((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        gui.Item item7 = new gui.Item(10, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100", "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 32, " () - Copies: 10", "-1,hi!,hi!,,1,hi!,hi!");
        int int8 = item7.getCopiesAvailable();
        item7.setAuthor("0,,hi!,,32,hi!,hi!");
        item7.setCopiesAvailable((int) (short) 0);
        int int13 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        int int9 = item7.getCopiesAvailable();
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getAuthor();
        item7.setAuthor("1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " () - Copies: 100" + "'", str14, " () - Copies: 100");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        gui.Item item7 = new gui.Item(1, "hi! () - Copies: 1", "-1,,hi!,,100,hi!,hi! () - Copies: 1", "hi! () - Copies: -1", (int) ' ', "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "hi! () - Copies: -1");
        item7.setType("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getGenre();
        item7.setCopiesAvailable((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: -1" + "'", str10, "hi! () - Copies: -1");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) 1);
        item7.setAuthor("0,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str18 = item7.getName();
        java.lang.String str19 = item7.getLocation();
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str22 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str22, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getName();
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setName("-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str21 = item7.getLocation();
        item7.setType("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,1,0,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        java.lang.String str10 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setLocation("hi! () - Copies: -1");
        java.lang.Class<?> wildcardClass18 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getAuthor();
        java.lang.String str17 = item7.toString();
        java.lang.String str18 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        java.lang.String str8 = item7.getAuthor();
        java.lang.String str9 = item7.getName();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setCopiesAvailable(1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        int int9 = item7.getItemId();
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setItemId((int) (byte) 100);
        int int14 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        gui.Item item7 = new gui.Item(100, "hi! () - Copies: 1 (hi!) - Copies: 0", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,", (int) (short) 10, "hi! () - Copies: 1 (hi!) - Copies: 0", "0,,hi!,,32,hi!,hi!");
        java.lang.String str8 = item7.toCsvString();
        java.lang.String str9 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100,hi! () - Copies: 1 (hi!) - Copies: 0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,10,hi! () - Copies: 1 (hi!) - Copies: 0,0,,hi!,,32,hi!,hi!" + "'", str8, "100,hi! () - Copies: 1 (hi!) - Copies: 0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,10,hi! () - Copies: 1 (hi!) - Copies: 0,0,,hi!,,32,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str9, "hi! () - Copies: 1 (hi!) - Copies: 0");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getLocation();
        item7.setCopiesAvailable(100);
        item7.setType("-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
        java.lang.String str21 = item7.getType();
        int int22 = item7.getCopiesAvailable();
        item7.setName("-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!" + "'", str21, "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        item7.setItemId((int) (short) 1);
        int int19 = item7.getCopiesAvailable();
        item7.setType("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        java.lang.String str22 = item7.getGenre();
        java.lang.String str23 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) 1);
        item7.setAuthor("0,,hi!,,1,hi!,hi!");
        java.lang.String str24 = item7.getType();
        java.lang.Class<?> wildcardClass25 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getGenre();
        item7.setGenre("-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str20 = item7.getLocation();
        java.lang.String str21 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,-1,hi!,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str21, "-1,,hi!,,-1,hi!,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        item7.setCopiesAvailable((int) (byte) -1);
        int int18 = item7.getCopiesAvailable();
        item7.setName("");
        java.lang.String str21 = item7.toString();
        item7.setGenre("35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor(" (hi!) - Copies: 1");
        java.lang.String str26 = item7.toString();
        java.lang.String str27 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " () - Copies: -1" + "'", str21, " () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " () - Copies: -1" + "'", str26, " () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        item7.setName("");
        item7.setLocation("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str21 = item7.toString();
        java.lang.String str22 = item7.getName();
        java.lang.String str23 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " (hi!) - Copies: 1" + "'", str21, " (hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (byte) 100);
        int int21 = item7.getCopiesAvailable();
        java.lang.String str22 = item7.getGenre();
        item7.setType("-1,,hi!,,1,0,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,,hi!,,1,hi!,", (-1), "", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) '#');
        item7.setName("100,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,35,hi!,,52,hi! () - Copies: 100, (hi!) - Copies: 1");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        item7.setCopiesAvailable((int) (byte) -1);
        int int18 = item7.getCopiesAvailable();
        item7.setName("");
        java.lang.String str21 = item7.toString();
        item7.setCopiesAvailable((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " () - Copies: -1" + "'", str21, " () - Copies: -1");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        item7.setCopiesAvailable((int) '4');
        item7.setType("1,hi! () - Copies: 32,,,100,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str10 = item7.getType();
        item7.setType("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setCopiesAvailable(35);
        item7.setAuthor("-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,35,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setGenre("");
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.toCsvString();
        java.lang.String str14 = item7.getType();
        item7.setLocation("hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10");
        java.lang.String str17 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!," + "'", str12, "-1,,hi!,,1,hi!,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,hi!," + "'", str13, "-1,,hi!,,1,hi!,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10" + "'", str17, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getName();
        item7.setAuthor("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.getName();
        item7.setName("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        int int19 = item7.getCopiesAvailable();
        java.lang.String str20 = item7.toCsvString();
        item7.setItemId(1);
        int int23 = item7.getItemId();
        item7.setGenre("-1,,hi!,,35,hi!,hi!");
        java.lang.String str26 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! () - Copies: 1" + "'", str26, "hi! () - Copies: 1");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        gui.Item item7 = new gui.Item((int) '4', "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!", "52,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,hi!,10,-1,,,,1,-1,,hi!,,1,hi!,hi!,,hi!", "-1,,hi!,,-1,hi!,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (short) 1, "hi! () - Copies: -1 (hi! () - Copies: -1) - Copies: 100", "-1,,hi!,,-1, () - Copies: 100,-1,,hi!,,1,hi!,hi! () - Copies: 100");
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) 1);
        java.lang.String str22 = item7.getAuthor();
        java.lang.String str23 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        java.lang.String str8 = item7.getAuthor();
        java.lang.String str9 = item7.getName();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str12 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        int int16 = item7.getCopiesAvailable();
        item7.setAuthor("hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        int int18 = item7.getItemId();
        item7.setLocation("hi!");
        item7.setName("");
        java.lang.String str23 = item7.getType();
        java.lang.String str24 = item7.toCsvString();
        int int25 = item7.getCopiesAvailable();
        item7.setItemId(97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str24, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getName();
        java.lang.String str17 = item7.toCsvString();
        item7.setType("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        int int18 = item7.getItemId();
        item7.setLocation("hi!");
        int int21 = item7.getCopiesAvailable();
        item7.setGenre("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        java.lang.String str24 = item7.getGenre();
        item7.setItemId((int) 'a');
        java.lang.String str27 = item7.getType();
        item7.setLocation("-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.Class<?> wildcardClass30 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!" + "'", str24, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.getName();
        int int10 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        item7.setName("");
        item7.setLocation("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setItemId((int) (short) 100);
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str25 = item7.getAuthor();
        java.lang.String str26 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! () - Copies: 1" + "'", str25, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "100,hi!,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,hi! () - Copies: 1,hi!" + "'", str26, "100,hi!,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        item7.setLocation("hi!");
        item7.setGenre("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (short) 10);
        java.lang.String str21 = item7.getLocation();
        item7.setLocation("-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32");
        item7.setItemId((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("hi! () - Copies: 1");
        int int19 = item7.getCopiesAvailable();
        java.lang.String str20 = item7.getType();
        java.lang.String str21 = item7.toString();
        item7.setAuthor("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str24 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 1" + "'", str21, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        gui.Item item7 = new gui.Item(0, "hi! () - Copies: -1", "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", (int) (short) -1, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,", "0,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.toString();
        java.lang.String str9 = item7.getLocation();
        item7.setName("-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
        java.lang.Class<?> wildcardClass12 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, (hi! () - Copies: -1) - Copies: -1" + "'", str8, "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, (hi! () - Copies: -1) - Copies: -1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!" + "'", str9, "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        gui.Item item7 = new gui.Item((int) (short) 10, "hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 52", "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35", "0,,hi!,,1,hi!,hi! () - Copies: 32", (int) 'a', "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi! () - Copies: 35", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str15 = item7.toString();
        item7.setName("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int18 = item7.getCopiesAvailable();
        java.lang.String str19 = item7.toString();
        java.lang.Class<?> wildcardClass20 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35" + "'", str15, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35" + "'", str19, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        item7.setName("");
        item7.setLocation("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str21 = item7.toString();
        item7.setGenre("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 1");
        java.lang.String str24 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " (hi!) - Copies: 1" + "'", str21, " (hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 1" + "'", str24, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 1");
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        java.lang.String str17 = item7.getName();
        java.lang.String str18 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        gui.Item item7 = new gui.Item((int) (byte) 0, "32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,", "35,hi!,hi!,,1,hi!,hi!", "hi! () - Copies: 100", (int) ' ', " () - Copies: 10", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.toCsvString();
        int int9 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str8, "0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        gui.Item item7 = new gui.Item((-1), "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", (int) '4', " () - Copies: -1", "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setCopiesAvailable((int) (short) 1);
        item7.setCopiesAvailable((int) (short) 0);
        item7.setCopiesAvailable(10);
        item7.setCopiesAvailable((int) (short) -1);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        gui.Item item7 = new gui.Item((int) (byte) 10, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0", "", "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!", (-1), "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!", "0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getAuthor();
        java.lang.String str9 = item7.getLocation();
        java.lang.String str10 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!" + "'", str8, "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str9, "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId(0);
        java.lang.String str14 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getType();
        item7.setType("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!");
        java.lang.String str15 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!" + "'", str15, "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str15 = item7.toString();
        item7.setName("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int18 = item7.getCopiesAvailable();
        item7.setAuthor("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35" + "'", str15, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setLocation("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setType(" () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        gui.Item item7 = new gui.Item((int) '#', "", "0,hi! () - Copies: -1,hi!,,1,hi!,hi!", "0,hi! () - Copies: -1,hi!,,1,hi!,hi!", (int) (short) -1, "", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.toString();
        int int16 = item7.getItemId();
        item7.setType("0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        int int19 = item7.getCopiesAvailable();
        java.lang.Class<?> wildcardClass20 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        gui.Item item7 = new gui.Item((int) (short) -1, "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1", "-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!", 10, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!");
        item7.setLocation("hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        java.lang.String str18 = item7.getAuthor();
        java.lang.String str19 = item7.toString();
        int int20 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 32" + "'", str19, "hi! () - Copies: 32");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        java.lang.String str18 = item7.getAuthor();
        java.lang.String str19 = item7.toCsvString();
        item7.setItemId((-1));
        int int22 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0,,hi!,,32,hi!,hi!" + "'", str19, "0,,hi!,,32,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '#');
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) ' ');
        int int14 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '#');
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setName("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.toString();
        java.lang.Class<?> wildcardClass15 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi! () - Copies: 35" + "'", str14, "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi! () - Copies: 35");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        java.lang.String str18 = item7.toString();
        item7.setGenre("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str21 = item7.getType();
        java.lang.String str22 = item7.toCsvString();
        java.lang.String str23 = item7.getType();
        item7.setCopiesAvailable(35);
        java.lang.Class<?> wildcardClass26 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!" + "'", str22, "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str23, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str14 = item7.getLocation();
        item7.setLocation("-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setItemId((int) (byte) 1);
        java.lang.String str19 = item7.toString();
        int int20 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 1" + "'", str19, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setName("0,,hi!,,1,hi!,hi!");
        int int14 = item7.getItemId();
        item7.setType("hi! () - Copies: -1");
        java.lang.String str17 = item7.getGenre();
        java.lang.String str18 = item7.getGenre();
        item7.setGenre(" (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
        item7.setCopiesAvailable(10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str16 = item7.toString();
        item7.setGenre("");
        int int19 = item7.getItemId();
        item7.setType("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        java.lang.String str22 = item7.getName();
        java.lang.String str23 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("0,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        int int22 = item7.getCopiesAvailable();
        int int23 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setAuthor("1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        java.lang.String str17 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str17, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str16 = item7.toString();
        java.lang.String str17 = item7.getType();
        item7.setGenre("hi! () - Copies: 1");
        java.lang.String str20 = item7.getType();
        int int21 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setName("hi! () - Copies: 1");
        java.lang.String str18 = item7.toCsvString();
        item7.setCopiesAvailable(35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1" + "'", str18, "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        int int19 = item7.getItemId();
        java.lang.String str20 = item7.getAuthor();
        java.lang.String str21 = item7.toCsvString();
        item7.setName("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,100,hi!,hi! () - Copies: 1");
        java.lang.String str13 = item7.toCsvString();
        item7.setAuthor("-1,,-1,,hi!,,1,hi!,hi!,,52,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1," + "'", str13, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getName();
        item7.setLocation("1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        java.lang.String str19 = item7.getLocation();
        item7.setGenre("1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,," + "'", str19, "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setLocation(" () - Copies: 10");
        int int10 = item7.getItemId();
        item7.setItemId((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setName("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str15 = item7.getGenre();
        int int16 = item7.getItemId();
        java.lang.String str17 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setName("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        item7.setGenre("100,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,35,hi!,,52,hi! () - Copies: 100, (hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toCsvString();
        int int12 = item7.getCopiesAvailable();
        java.lang.String str13 = item7.getType();
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1");
        item7.setLocation("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getName();
        int int16 = item7.getCopiesAvailable();
        java.lang.String str17 = item7.toString();
        item7.setType("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setItemId((-1));
        java.lang.String str22 = item7.getLocation();
        item7.setName("32,,hi!,,35,52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        java.lang.String str14 = item7.getGenre();
        int int15 = item7.getItemId();
        java.lang.String str16 = item7.toString();
        java.lang.String str17 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) 1);
        java.lang.String str22 = item7.getAuthor();
        java.lang.String str23 = item7.getGenre();
        item7.setLocation("0,,hi!,,1,hi!,hi!");
        item7.setName("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        int int28 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! () - Copies: 1" + "'", str23, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setItemId(10);
        item7.setAuthor("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        item7.setLocation("-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setAuthor("-1,,hi!,,35,hi!,hi!");
        java.lang.String str17 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,,hi!,,1,hi!,");
        item7.setItemId(10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        java.lang.String str17 = item7.getLocation();
        item7.setName("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.getGenre();
        java.lang.String str17 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        int int12 = item7.getItemId();
        java.lang.String str13 = item7.getAuthor();
        java.lang.String str14 = item7.getAuthor();
        java.lang.Class<?> wildcardClass15 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setGenre("hi! () - Copies: 35");
        item7.setItemId((int) (short) 10);
        item7.setCopiesAvailable((int) (byte) 1);
        java.lang.String str19 = item7.toCsvString();
        java.lang.String str20 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10,,hi!,,1,hi!,hi! () - Copies: 35" + "'", str19, "10,,hi!,,1,hi!,hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setAuthor("hi!");
        java.lang.String str14 = item7.getAuthor();
        int int15 = item7.getItemId();
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
        java.lang.String str18 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 1" + "'", str18, "hi! () - Copies: 1");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        item7.setItemId((int) ' ');
        java.lang.String str17 = item7.getType();
        java.lang.String str18 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (hi!) - Copies: 1" + "'", str18, "hi! (hi!) - Copies: 1");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setCopiesAvailable(0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.getGenre();
        java.lang.String str17 = item7.getAuthor();
        java.lang.String str18 = item7.getName();
        java.lang.String str19 = item7.toString();
        item7.setType("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, (hi! () - Copies: -1) - Copies: -1");
        java.lang.String str22 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 1" + "'", str19, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, (hi! () - Copies: -1) - Copies: -1,hi!,,1,hi!,hi!" + "'", str22, "-1,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, (hi! () - Copies: -1) - Copies: -1,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        gui.Item item7 = new gui.Item((int) '#', "", "0,hi! () - Copies: -1,hi!,,1,hi!,hi!", "0,hi! () - Copies: -1,hi!,,1,hi!,hi!", (int) (short) -1, "", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        int int8 = item7.getItemId();
        item7.setGenre("-1,,hi!,,1,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        gui.Item item7 = new gui.Item((int) (byte) 10, "1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!,1,-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!", "-1,,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32) - Copies: 97", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!", (int) (byte) 0, "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 1", "10,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!,35,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        gui.Item item7 = new gui.Item((int) (short) 100, " () - Copies: 10", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", "1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", (int) (byte) 100, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str10 = item7.getType();
        java.lang.String str11 = item7.toCsvString();
        item7.setCopiesAvailable((-1));
        java.lang.String str14 = item7.getAuthor();
        java.lang.String str15 = item7.getType();
        java.lang.Class<?> wildcardClass16 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,52,hi!," + "'", str11, "-1,,hi!,,52,hi!,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str15 = item7.toString();
        item7.setName("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int18 = item7.getCopiesAvailable();
        java.lang.String str19 = item7.getType();
        item7.setType("hi! () - Copies: -1");
        item7.setCopiesAvailable((int) (byte) 1);
        item7.setAuthor("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35" + "'", str15, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str19, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setItemId(10);
        item7.setGenre("-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        int int15 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        gui.Item item7 = new gui.Item(1, "hi! () - Copies: 1", "-1,,hi!,,100,hi!,hi! () - Copies: 1", "hi! () - Copies: -1", (int) ' ', "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "hi! () - Copies: -1");
        java.lang.String str8 = item7.toString();
        item7.setLocation("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        java.lang.String str11 = item7.getGenre();
        int int12 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32" + "'", str8, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: -1" + "'", str11, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        gui.Item item7 = new gui.Item(10, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1", (int) ' ', "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "");
        item7.setLocation("");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str10, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        gui.Item item7 = new gui.Item(10, "32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,52,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,", "", "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", (int) '#', "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        item7.setItemId((int) (short) 1);
        item7.setAuthor(" () - Copies: 100");
        item7.setName("-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,100,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setAuthor("hi! () - Copies: -1");
        java.lang.String str13 = item7.getType();
        item7.setItemId(35);
        item7.setLocation("-1,,hi!,,1,hi!,");
        java.lang.String str18 = item7.getGenre();
        java.lang.String str19 = item7.getType();
        int int20 = item7.getItemId();
        java.lang.String str21 = item7.toString();
        java.lang.String str22 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 1" + "'", str21, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 1" + "'", str22, "hi! () - Copies: 1");
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        gui.Item item7 = new gui.Item(0, "-1,,hi!,,-1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,", "32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!", "1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", 10, "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1", "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setLocation("hi! () - Copies: 32");
        item7.setAuthor("0,,hi!,,1,hi!, () - Copies: 10");
        java.lang.String str12 = item7.getType();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,-1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1," + "'", str12, "-1,,hi!,,-1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        gui.Item item7 = new gui.Item((-1), "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!", (int) (short) 0, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        int int8 = item7.getCopiesAvailable();
        item7.setName("-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str11 = item7.toCsvString();
        java.lang.String str12 = item7.getLocation();
        java.lang.String str13 = item7.getType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str11, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str12, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str13, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        gui.Item item7 = new gui.Item((int) (byte) 100, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", " () - Copies: 100", "", (int) 'a', "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        item7.setCopiesAvailable(10);
        item7.setName("hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str14 = item7.getLocation();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        item7.setLocation("hi!");
        item7.setGenre("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        int int19 = item7.getCopiesAvailable();
        item7.setCopiesAvailable(52);
        int int22 = item7.getItemId();
        item7.setLocation("hi! () - Copies: -1 (hi! () - Copies: -1) - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str16 = item7.toString();
        java.lang.String str17 = item7.getLocation();
        java.lang.String str18 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setLocation("hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getName();
        java.lang.String str17 = item7.getLocation();
        item7.setGenre("hi! () - Copies: 35");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str22 = item7.getGenre();
        item7.setLocation("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setName("hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        gui.Item item7 = new gui.Item(1, "hi! () - Copies: 1", "-1,,hi!,,100,hi!,hi! () - Copies: 1", "hi! () - Copies: -1", (int) ' ', "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "hi! () - Copies: -1");
        java.lang.String str8 = item7.toString();
        item7.setType("-1,hi!,hi!,,1,hi!,hi!");
        int int11 = item7.getItemId();
        item7.setGenre("-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,35,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32" + "'", str8, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.toString();
        item7.setName("hi!");
        java.lang.String str18 = item7.getAuthor();
        java.lang.Class<?> wildcardClass19 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        java.lang.String str18 = item7.toString();
        item7.setGenre("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str21 = item7.getLocation();
        java.lang.String str22 = item7.getLocation();
        java.lang.String str23 = item7.getGenre();
        item7.setGenre("100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (byte) 1);
        int int28 = item7.getItemId();
        item7.setAuthor("-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
        item7.setLocation("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setGenre("");
        item7.setName("");
        java.lang.String str37 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str23, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        gui.Item item7 = new gui.Item((int) '4', "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "", (int) (byte) -1, "hi! () - Copies: 1 (hi!) - Copies: 0", "hi! () - Copies: 1 (hi!) - Copies: 0");
        item7.setName("hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        item7.setItemId(0);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        gui.Item item7 = new gui.Item((int) '4', "32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0", "-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!", (int) (byte) 100, "0,hi! () - Copies: -1,hi!,,1,hi!,hi!", "hi!");
        item7.setCopiesAvailable(1);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getGenre();
        java.lang.String str18 = item7.getLocation();
        int int19 = item7.getCopiesAvailable();
        item7.setAuthor(" () - Copies: 100");
        item7.setGenre("-1,,hi!,,1,hi!,hi! () - Copies: 100");
        java.lang.String str24 = item7.getAuthor();
        item7.setGenre("100,hi!,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " () - Copies: 100" + "'", str24, " () - Copies: 100");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.toString();
        item7.setItemId((int) 'a');
        java.lang.String str18 = item7.getGenre();
        java.lang.String str19 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        item7.setLocation("hi!");
        java.lang.String str12 = item7.toString();
        item7.setAuthor("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.getGenre();
        java.lang.String str17 = item7.getAuthor();
        java.lang.String str18 = item7.getName();
        java.lang.String str19 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str19, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setType("1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        item7.setGenre("-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toString();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getGenre();
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 35,");
        java.lang.String str20 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 35," + "'", str20, "-1,,hi!,,1,hi! () - Copies: 35,");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId(32);
        item7.setType("-1,,hi!,-1,,hi!,,1,hi!,hi!,100,hi!,hi! () - Copies: 1");
        java.lang.String str21 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        gui.Item item7 = new gui.Item(1, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,", "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,-1,,hi!,,1,hi!,hi! () - Copies: 100", "32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,", 10, " (hi!) - Copies: 1", "0,,hi!,,32,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.toString();
        int int16 = item7.getItemId();
        item7.setCopiesAvailable((int) (short) 10);
        item7.setCopiesAvailable((int) (byte) 100);
        java.lang.String str21 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        int int16 = item7.getItemId();
        java.lang.String str17 = item7.getType();
        item7.setType("97,,-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        gui.Item item7 = new gui.Item((int) 'a', "hi! () - Copies: 35", "hi!", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (short) -1, "hi! () - Copies: 1", "hi! () - Copies: 1");
        java.lang.String str8 = item7.getAuthor();
        item7.setAuthor("10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        java.lang.String str11 = item7.getLocation();
        item7.setCopiesAvailable(32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str11, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.getLocation();
        int int16 = item7.getItemId();
        java.lang.String str17 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        gui.Item item7 = new gui.Item((int) (short) 0, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi!", "-1,,hi!,,1,hi!,hi!", (int) (short) 100, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getLocation();
        java.lang.String str9 = item7.toCsvString();
        int int10 = item7.getCopiesAvailable();
        item7.setName("hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.String str13 = item7.getName();
        item7.setType("0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!" + "'", str9, "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str13, "hi! () - Copies: 1 (hi!) - Copies: 0");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setType("-1,hi!,hi!,,1,hi!,hi!");
        int int19 = item7.getItemId();
        java.lang.String str20 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int20 = item7.getItemId();
        java.lang.String str21 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 100" + "'", str21, "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 100");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setName("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str15 = item7.getName();
        item7.setItemId(0);
        item7.setCopiesAvailable((int) '#');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str15, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        gui.Item item7 = new gui.Item(35, " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10", "-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", "hi!", (int) (short) 1, "0,hi! () - Copies: -1,hi!,,1,hi!,hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
        item7.setCopiesAvailable(100);
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getLocation();
        item7.setType("1,hi! () - Copies: 1,-1,,hi!,,100,hi!,hi! () - Copies: 1,hi! () - Copies: -1,32,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi! () - Copies: -1");
        item7.setLocation("32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,97,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str10, "-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getCopiesAvailable();
        item7.setName("");
        java.lang.String str20 = item7.toCsvString();
        item7.setType("-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
        java.lang.String str23 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,,,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        java.lang.String str14 = item7.getGenre();
        item7.setLocation("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!, (-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        item7.setAuthor("hi! () - Copies: 100");
        java.lang.String str15 = item7.getName();
        item7.setType("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setName("-1,,hi!,,-1, () - Copies: 100,-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        int int19 = item7.getItemId();
        item7.setCopiesAvailable(10);
        java.lang.String str22 = item7.getAuthor();
        java.lang.String str23 = item7.getType();
        int int24 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        gui.Item item7 = new gui.Item((int) (byte) 100, " () - Copies: 1", "-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1", (int) (byte) 10, " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10", "52,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,10,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getName();
        item7.setItemId((int) (short) 0);
        item7.setType("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.toCsvString();
        java.lang.String str16 = item7.toCsvString();
        java.lang.String str17 = item7.getType();
        item7.setName("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str20 = item7.toString();
        java.lang.String str21 = item7.getLocation();
        java.lang.String str22 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str15, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str16, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str22, "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.toString();
        item7.setItemId((int) 'a');
        java.lang.String str18 = item7.getType();
        java.lang.String str19 = item7.getAuthor();
        item7.setGenre("-1,,hi!,hi!,10,hi!,hi!");
        item7.setCopiesAvailable(10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        int int17 = item7.getItemId();
        int int18 = item7.getItemId();
        int int19 = item7.getCopiesAvailable();
        java.lang.String str20 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        item7.setCopiesAvailable((int) (byte) -1);
        int int18 = item7.getCopiesAvailable();
        java.lang.String str19 = item7.getAuthor();
        item7.setName("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        int int9 = item7.getCopiesAvailable();
        item7.setLocation("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        item7.setLocation("1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,,,100,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        item7.setLocation("hi!");
        java.lang.String str12 = item7.toString();
        item7.setItemId((int) (short) 0);
        item7.setType("-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.Class<?> wildcardClass17 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        int int9 = item7.getCopiesAvailable();
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getAuthor();
        java.lang.String str12 = item7.toString();
        item7.setType("1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " () - Copies: 100" + "'", str12, " () - Copies: 100");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        java.lang.String str9 = item7.toString();
        item7.setCopiesAvailable((int) 'a');
        java.lang.String str12 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " () - Copies: 10" + "'", str9, " () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setAuthor("hi!");
        java.lang.String str14 = item7.getAuthor();
        java.lang.String str15 = item7.toCsvString();
        int int16 = item7.getItemId();
        java.lang.String str17 = item7.getName();
        java.lang.String str18 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str15, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setItemId(10);
        item7.setAuthor("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        item7.setLocation("-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setAuthor("-1,,hi!,,35,hi!,hi!");
        java.lang.String str17 = item7.toString();
        item7.setCopiesAvailable((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " () - Copies: 10" + "'", str17, " () - Copies: 10");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        int int12 = item7.getCopiesAvailable();
        java.lang.String str13 = item7.toString();
        java.lang.String str14 = item7.toString();
        item7.setGenre("hi! () - Copies: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! () - Copies: 1" + "'", str13, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        java.lang.String str14 = item7.getLocation();
        int int15 = item7.getItemId();
        item7.setCopiesAvailable(10);
        java.lang.String str18 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 10" + "'", str18, "hi! () - Copies: 10");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.getName();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        int int17 = item7.getCopiesAvailable();
        int int18 = item7.getCopiesAvailable();
        int int19 = item7.getCopiesAvailable();
        java.lang.Class<?> wildcardClass20 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        int int16 = item7.getItemId();
        java.lang.String str17 = item7.toCsvString();
        item7.setCopiesAvailable(32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        java.lang.String str18 = item7.toString();
        item7.setGenre("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str21 = item7.getLocation();
        java.lang.String str22 = item7.getLocation();
        java.lang.String str23 = item7.getGenre();
        int int24 = item7.getCopiesAvailable();
        item7.setGenre("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str23, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        item7.setCopiesAvailable((int) (byte) -1);
        int int18 = item7.getCopiesAvailable();
        item7.setType("-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setName("-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32");
        item7.setItemId(100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        item7.setType("1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        item7.setType("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!, (-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setGenre("hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str10 = item7.getType();
        java.lang.String str11 = item7.toCsvString();
        item7.setCopiesAvailable((-1));
        java.lang.String str14 = item7.getType();
        item7.setAuthor("hi! () - Copies: -1 (hi! () - Copies: -1) - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,52,hi!," + "'", str11, "-1,,hi!,,52,hi!,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! () - Copies: 1");
        java.lang.String str20 = item7.toCsvString();
        java.lang.String str21 = item7.getType();
        java.lang.String str22 = item7.getGenre();
        int int23 = item7.getItemId();
        item7.setLocation("-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
        int int26 = item7.getItemId();
        java.lang.String str27 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 1" + "'", str22, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.getLocation();
        item7.setCopiesAvailable(1);
        item7.setGenre("-1,hi!,hi!,,1,hi!,hi!");
        int int24 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str19, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getGenre();
        java.lang.String str17 = item7.toCsvString();
        java.lang.String str18 = item7.toString();
        item7.setCopiesAvailable(1);
        java.lang.String str21 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str17, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 1" + "'", str18, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '#');
        java.lang.String str10 = item7.getLocation();
        item7.setGenre("hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        java.lang.Class<?> wildcardClass13 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        java.lang.String str18 = item7.getLocation();
        int int19 = item7.getItemId();
        java.lang.String str20 = item7.toCsvString();
        item7.setLocation("-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str23 = item7.getName();
        item7.setCopiesAvailable((int) ' ');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1" + "'", str20, "-1,,hi!,,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setName("hi!");
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.getName();
        item7.setAuthor("-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
        java.lang.String str18 = item7.getLocation();
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,,0,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        gui.Item item7 = new gui.Item((int) ' ', "hi! () - Copies: 35", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", (int) 'a', "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str10 = item7.getLocation();
        item7.setName("-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1");
        java.lang.String str13 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str10, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str13, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        gui.Item item7 = new gui.Item(32, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "hi! () - Copies: 1", "hi! () - Copies: 35", (int) (byte) 0, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getType();
        java.lang.String str9 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str8, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str9, "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        gui.Item item7 = new gui.Item((int) (short) 100, "hi! (0,,hi!,,1,hi!,hi!) - Copies: 1", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: -1", "", (int) '4', "hi! () - Copies: 10", "-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) 1);
        item7.setType("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        item7.setLocation("hi! () - Copies: -1");
        item7.setType("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setType("32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,97,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        item7.setType("1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        item7.setCopiesAvailable(32);
        item7.setName("hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        java.lang.String str13 = item7.getName();
        item7.setAuthor("32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,");
        item7.setType(" (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
        item7.setName("32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getLocation();
        java.lang.String str15 = item7.getGenre();
        int int16 = item7.getCopiesAvailable();
        item7.setItemId((int) ' ');
        item7.setItemId((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        java.lang.String str13 = item7.toCsvString();
        java.lang.String str14 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str13, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", (int) (short) 10, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "");
        item7.setCopiesAvailable(0);
        java.lang.String str10 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", "-1,hi! () - Copies: 1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!", 0, " (hi!) - Copies: 1", "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setItemId((int) (byte) 10);
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.getType();
        item7.setLocation("0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: -1 (hi! () - Copies: -1) - Copies: 100" + "'", str10, "hi! () - Copies: -1 (hi! () - Copies: -1) - Copies: 100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: -1" + "'", str11, "hi! () - Copies: -1");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        int int9 = item7.getCopiesAvailable();
        java.lang.String str10 = item7.getName();
        item7.setType("-1,,hi! () - Copies: 100,32, () - Copies: -1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi! () - Copies: 1 (hi!) - Copies: 35,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        int int15 = item7.getCopiesAvailable();
        int int16 = item7.getCopiesAvailable();
        java.lang.String str17 = item7.getName();
        java.lang.String str18 = item7.toString();
        item7.setCopiesAvailable(0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 0" + "'", str18, "hi! () - Copies: 0");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setAuthor("hi! () - Copies: -1");
        java.lang.String str13 = item7.getType();
        item7.setItemId(35);
        int int16 = item7.getItemId();
        java.lang.String str17 = item7.toCsvString();
        item7.setName(" () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "35,,hi!,,1,hi! () - Copies: -1,hi!" + "'", str17, "35,,hi!,,1,hi! () - Copies: -1,hi!");
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        item7.setItemId(35);
        java.lang.String str19 = item7.getAuthor();
        java.lang.String str20 = item7.getGenre();
        item7.setGenre("35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str18 = item7.getName();
        java.lang.String str19 = item7.getLocation();
        int int20 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) 1);
        item7.setCopiesAvailable((int) (short) -1);
        item7.setAuthor("1,,,,100,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setLocation("0,,hi!,hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setName("0,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.toCsvString();
        item7.setGenre("1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        item7.setLocation("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.getGenre();
        item7.setItemId(0);
        java.lang.String str22 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str14, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,," + "'", str19, "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        gui.Item item7 = new gui.Item((int) (short) 1, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "", "hi! () - Copies: 1", 0, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId(0);
        java.lang.String str10 = item7.getGenre();
        item7.setAuthor("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str10, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setItemId(100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        int int10 = item7.getCopiesAvailable();
        java.lang.String str11 = item7.toCsvString();
        item7.setAuthor("hi! () - Copies: 35");
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getType();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str11, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.getGenre();
        java.lang.String str17 = item7.toCsvString();
        java.lang.String str18 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        item7.setName("");
        item7.setLocation("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setName("35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.Class<?> wildcardClass23 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getName();
        int int17 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) '4');
        java.lang.Class<?> wildcardClass20 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        int int18 = item7.getItemId();
        item7.setLocation("hi!");
        int int21 = item7.getCopiesAvailable();
        item7.setGenre("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        java.lang.String str24 = item7.getGenre();
        item7.setItemId((int) 'a');
        java.lang.String str27 = item7.getType();
        item7.setLocation("-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int30 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!" + "'", str24, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 97 + "'", int30 == 97);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        gui.Item item7 = new gui.Item(10, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1", (int) ' ', "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "");
        item7.setLocation("");
        java.lang.String str10 = item7.getName();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        item7.setName("-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str10, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        gui.Item item7 = new gui.Item(100, "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", " () - Copies: 100", "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", 100, "", "-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.toCsvString();
        java.lang.String str9 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!, () - Copies: 100,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,100,,-1,hi!,hi!,,1,hi!,hi!" + "'", str8, "100,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!, () - Copies: 100,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,100,,-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str9, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setGenre("hi! () - Copies: 35");
        item7.setItemId((int) (short) 10);
        item7.setName("-1,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, (hi! () - Copies: -1) - Copies: -1,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str18 = item7.getName();
        int int19 = item7.getItemId();
        item7.setCopiesAvailable((int) (byte) 100);
        java.lang.String str22 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) 1);
        item7.setType("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        item7.setLocation("hi! () - Copies: -1");
        java.lang.String str26 = item7.toString();
        java.lang.String str27 = item7.getLocation();
        java.lang.String str28 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1" + "'", str26, "hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi! () - Copies: -1" + "'", str27, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        item7.setName("");
        java.lang.String str19 = item7.getGenre();
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId(0);
        item7.setLocation("");
        java.lang.String str16 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str16, "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setItemId((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        item7.setAuthor("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getItemId();
        int int18 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setName("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.Class<?> wildcardClass13 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setCopiesAvailable((int) ' ');
        item7.setCopiesAvailable((int) (short) 0);
        item7.setType("32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.Class<?> wildcardClass10 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setLocation("0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        item7.setAuthor("10,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,,35,hi!,hi!");
        java.lang.String str17 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,,35,hi!,hi!" + "'", str17, "10,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,,35,hi!,hi!");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        java.lang.String str18 = item7.toString();
        item7.setGenre("-1,hi!,hi!,,1,hi!,hi!");
        item7.setLocation(" () - Copies: -1");
        item7.setType("32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        int int18 = item7.getItemId();
        item7.setLocation("hi!");
        int int21 = item7.getCopiesAvailable();
        java.lang.String str22 = item7.getAuthor();
        java.lang.String str23 = item7.getGenre();
        item7.setAuthor(" () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! () - Copies: 1" + "'", str23, "hi! () - Copies: 1");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        gui.Item item7 = new gui.Item((int) (byte) -1, "-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,1,hi! () - Copies: 1,hi!", "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,0,hi! () - Copies: -1,hi!,,1,hi!,hi!", (int) 'a', "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi! (hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100) - Copies: 32");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setType("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setGenre("32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0");
        item7.setLocation("97,,-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str13 = item7.getAuthor();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str13, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str15, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str16, "-1,,hi!,,1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        gui.Item item7 = new gui.Item(100, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "", "hi! () - Copies: 1", (int) (byte) -1, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        int int8 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.toString();
        item7.setLocation("hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getName();
        item7.setLocation("1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        java.lang.String str19 = item7.getLocation();
        java.lang.String str20 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,," + "'", str19, "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        item7.setName("");
        java.lang.String str19 = item7.getLocation();
        java.lang.Class<?> wildcardClass20 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str14 = item7.getLocation();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getLocation();
        java.lang.String str18 = item7.toString();
        item7.setName("-1,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, (hi! () - Copies: -1) - Copies: -1,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str18, "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setAuthor("hi! () - Copies: -1");
        java.lang.String str13 = item7.getType();
        item7.setItemId(35);
        item7.setLocation("-1,,hi!,,1,hi!,");
        java.lang.String str18 = item7.getGenre();
        java.lang.String str19 = item7.getType();
        int int20 = item7.getItemId();
        java.lang.String str21 = item7.toString();
        item7.setAuthor("0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 1" + "'", str21, "hi! () - Copies: 1");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        item7.setItemId((int) (short) 1);
        java.lang.String str19 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1,,hi!,,32,hi!,hi!" + "'", str19, "1,,hi!,,32,hi!,hi!");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        gui.Item item7 = new gui.Item(1, "", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1,,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1", 1, "1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!");
        item7.setCopiesAvailable(10);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str16 = item7.toString();
        java.lang.String str17 = item7.getType();
        item7.setGenre("hi! () - Copies: 1");
        java.lang.String str20 = item7.getType();
        item7.setName("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        java.lang.String str23 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! () - Copies: 1" + "'", str23, "hi! () - Copies: 1");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        gui.Item item7 = new gui.Item((int) (byte) 10, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!", "32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0", (int) (byte) -1, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,,hi!,,-1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        item7.setName("-1,,hi!,,1,hi! () - Copies: -1,hi!");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        item7.setName("");
        java.lang.String str19 = item7.getLocation();
        item7.setName("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        int int22 = item7.getItemId();
        java.lang.String str23 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setName("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!" + "'", str14, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        java.lang.String str8 = item7.getAuthor();
        java.lang.String str9 = item7.getName();
        java.lang.String str10 = item7.toString();
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! (hi! () - Copies: 1) - Copies: 10" + "'", str10, "hi! (hi! () - Copies: 1) - Copies: 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! () - Copies: 1" + "'", str13, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        java.lang.String str8 = item7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! (hi! () - Copies: 1) - Copies: 10" + "'", str8, "hi! (hi! () - Copies: 1) - Copies: 10");
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        java.lang.String str8 = item7.getAuthor();
        int int9 = item7.getItemId();
        item7.setName("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1");
        java.lang.String str12 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str8, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1" + "'", str12, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1");
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        gui.Item item7 = new gui.Item(32, "10,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!,35,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!", "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10", "hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0", 0, "32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,52,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,", "10,,hi!,,1,hi!,hi! () - Copies: 35");
        item7.setItemId((int) (byte) 100);
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        item7.setName("");
        item7.setLocation("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setName("35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setCopiesAvailable((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        item7.setName("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setItemId(35);
        java.lang.String str20 = item7.toString();
        item7.setType("hi!");
        item7.setType("10,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        int int25 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 1" + "'", str20, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        gui.Item item7 = new gui.Item((int) '4', "52,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,10,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 1 (hi!) - Copies: 0", "-1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", "-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) '#', "-1,,hi!,hi!,10,hi!,hi!", "-1,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, (hi! () - Copies: -1) - Copies: -1,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        gui.Item item7 = new gui.Item((int) (byte) -1, "-1,hi!,35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,hi!,hi!", "", "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,hi! () - Copies: 1,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!", (int) (byte) -1, "-1,,,,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setItemId(32);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        item7.setLocation("hi!");
        java.lang.String str12 = item7.getLocation();
        item7.setLocation("hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        item7.setGenre("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        int int10 = item7.getItemId();
        java.lang.String str11 = item7.getName();
        int int12 = item7.getCopiesAvailable();
        int int13 = item7.getCopiesAvailable();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) 1);
        item7.setItemId((int) ' ');
        item7.setLocation("-1,,hi!,,1,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        java.lang.String str18 = item7.getLocation();
        int int19 = item7.getItemId();
        item7.setType("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str22 = item7.toString();
        java.lang.String str23 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100" + "'", str22, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str23, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        java.lang.String str18 = item7.toString();
        item7.setGenre("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str21 = item7.getLocation();
        java.lang.String str22 = item7.getLocation();
        java.lang.String str23 = item7.getGenre();
        item7.setGenre("100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (byte) 1);
        item7.setItemId(52);
        item7.setGenre("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, (hi! () - Copies: -1) - Copies: -1");
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,,0,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str23, "-1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        java.lang.String str18 = item7.getAuthor();
        java.lang.String str19 = item7.toString();
        java.lang.String str20 = item7.getLocation();
        java.lang.String str21 = item7.toString();
        item7.setType("hi! () - Copies: 10");
        item7.setType("0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 32" + "'", str19, "hi! () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 32" + "'", str21, "hi! () - Copies: 32");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        java.lang.String str10 = item7.getGenre();
        item7.setLocation("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setItemId((int) (short) 100);
        java.lang.String str15 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100,hi!,hi! () - Copies: 1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str15, "100,hi!,hi! () - Copies: 1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) 1);
        item7.setType("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        item7.setLocation("hi! () - Copies: -1");
        java.lang.String str26 = item7.getGenre();
        item7.setItemId((int) (byte) 10);
        java.lang.String str29 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! () - Copies: 1" + "'", str26, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1" + "'", str29, "hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1");
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int15 = item7.getItemId();
        item7.setLocation("10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.toString();
        java.lang.String str19 = item7.getName();
        item7.setName("-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 1" + "'", str18, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        java.lang.String str11 = item7.getGenre();
        int int12 = item7.getCopiesAvailable();
        java.lang.String str13 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        java.lang.String str18 = item7.toString();
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setName("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
        java.lang.String str25 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 32" + "'", str18, "hi! () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, () - Copies: 32" + "'", str25, "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, () - Copies: 32");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setName(" () - Copies: -1");
        item7.setLocation("-1,,hi!,hi!,100,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getLocation();
        java.lang.String str12 = item7.toString();
        item7.setCopiesAvailable(0);
        item7.setGenre("-1,,,hi!,100,hi!,hi! () - Copies: 1");
        item7.setName("35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!");
        item7.setType("1,hi! () - Copies: 1,-1,,hi!,,100,hi!,hi! () - Copies: 1,hi! () - Copies: -1,32,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        gui.Item item7 = new gui.Item((int) '4', "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "", "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", (int) '4', "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        java.lang.String str8 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str8, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.getLocation();
        item7.setItemId((int) (byte) 100);
        java.lang.String str20 = item7.getType();
        java.lang.String str21 = item7.getGenre();
        item7.setType("-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 1" + "'", str21, "hi! () - Copies: 1");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.toString();
        java.lang.Class<?> wildcardClass16 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        int int9 = item7.getCopiesAvailable();
        item7.setLocation("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.getGenre();
        java.lang.String str14 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str12 = item7.toCsvString();
        item7.setCopiesAvailable(0);
        item7.setGenre("0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) '#');
        java.lang.String str19 = item7.getAuthor();
        item7.setCopiesAvailable((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str19, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        item7.setName("");
        item7.setLocation("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setName("35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int23 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        gui.Item item7 = new gui.Item(10, "-1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", "1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,hi!,,1,hi! () - Copies: -1,hi!", 97, "-1,,hi!,,100,hi!,hi! () - Copies: 1", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getName();
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int19 = item7.getCopiesAvailable();
        item7.setType("32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        item7.setName("52,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,hi!,10,-1,,,,1,-1,,hi!,,1,hi!,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        item7.setName("");
        item7.setLocation("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str21 = item7.getType();
        item7.setType("");
        java.lang.String str24 = item7.getGenre();
        item7.setType("-1,,,hi!,100,hi!,hi! () - Copies: 1");
        item7.setType("-1,,hi!,,1,hi! () - Copies: 35,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.getLocation();
        java.lang.String str19 = item7.getLocation();
        item7.setCopiesAvailable((-1));
        java.lang.String str22 = item7.toString();
        item7.setCopiesAvailable((int) 'a');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1" + "'", str22, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        gui.Item item7 = new gui.Item((int) (byte) 10, "-1,,hi! () - Copies: 100,32, () - Copies: -1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi! () - Copies: 1 (hi!) - Copies: 35,1,hi!,hi!", "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,,,1,-1,,hi!,,1,hi!,hi!,", (int) (byte) 0, "-1,,hi!,,-1,hi! () - Copies: 1,hi!", "");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,,hi!,,1,hi!,");
        int int18 = item7.getCopiesAvailable();
        item7.setAuthor("hi! () - Copies: 1 (hi!) - Copies: 35");
        item7.setGenre("-1,,hi!,,-1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        gui.Item item7 = new gui.Item((int) (byte) 0, "32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,", "35,hi!,hi!,,1,hi!,hi!", "hi! () - Copies: 100", (int) ' ', " () - Copies: 10", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.toCsvString();
        item7.setCopiesAvailable(1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str8, "0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        java.lang.String str12 = item7.toCsvString();
        int int13 = item7.getItemId();
        item7.setName("32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getName();
        item7.setCopiesAvailable(52);
        item7.setCopiesAvailable(52);
        java.lang.String str21 = item7.getGenre();
        java.lang.String str22 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str16, "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str22, "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.getType();
        int int10 = item7.getCopiesAvailable();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
        java.lang.String str13 = item7.getGenre();
        java.lang.Class<?> wildcardClass14 = item7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str13, "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        item7.setAuthor("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getLocation();
        java.lang.String str18 = item7.getAuthor();
        java.lang.Class<?> wildcardClass19 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str18, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        item7.setItemId((int) (short) 1);
        int int19 = item7.getCopiesAvailable();
        java.lang.String str20 = item7.getGenre();
        int int21 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        java.lang.String str18 = item7.toString();
        item7.setGenre("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str21 = item7.getType();
        java.lang.String str22 = item7.getGenre();
        item7.setName("35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str25 = item7.toString();
        item7.setType("-1,hi!,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1) - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str22, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str25, "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        int int18 = item7.getItemId();
        item7.setLocation("hi!");
        item7.setName("");
        int int23 = item7.getCopiesAvailable();
        java.lang.String str24 = item7.getAuthor();
        java.lang.String str25 = item7.getLocation();
        item7.setName("10,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,,35,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setType("-1,hi!,hi!,,1,hi!,hi!");
        item7.setName("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setCopiesAvailable(1);
        item7.setLocation("-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) (short) 10);
        java.lang.String str27 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getLocation();
        item7.setType("hi! () - Copies: 1");
        item7.setCopiesAvailable(35);
        item7.setName("32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi! (hi! () - Copies: 1) - Copies: 35" + "'", str16, "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi! (hi! () - Copies: 1) - Copies: 35");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        gui.Item item7 = new gui.Item((-1), "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!", (int) (short) 0, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        int int8 = item7.getCopiesAvailable();
        item7.setName("-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int11 = item7.getCopiesAvailable();
        java.lang.String str12 = item7.toCsvString();
        item7.setLocation("hi! () - Copies: 1 (hi!) - Copies: 35");
        java.lang.String str15 = item7.getGenre();
        java.lang.String str16 = item7.getLocation();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str15, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 35" + "'", str16, "hi! () - Copies: 1 (hi!) - Copies: 35");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        item7.setAuthor("32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,97,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.getGenre();
        item7.setName("-1,hi!,hi!,,1,hi!,hi!");
        item7.setItemId(0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        int int9 = item7.getItemId();
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setLocation("");
        item7.setCopiesAvailable((int) (byte) 10);
        item7.setCopiesAvailable((int) '4');
        item7.setItemId((int) (byte) 100);
        item7.setItemId((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId(1);
        java.lang.String str16 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        item7.setName("");
        item7.setName("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setGenre("0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        java.lang.String str24 = item7.toString();
        java.lang.String str25 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str24, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", (int) (short) 10, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "");
        item7.setCopiesAvailable(0);
        java.lang.String str10 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10,-1,,hi!,,1,hi! () - Copies: 1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!," + "'", str10, "10,-1,,hi!,,1,hi! () - Copies: 1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! () - Copies: 1");
        java.lang.String str20 = item7.toCsvString();
        java.lang.String str21 = item7.getType();
        java.lang.String str22 = item7.getName();
        item7.setAuthor("-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str25 = item7.getGenre();
        item7.setAuthor("hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1");
        item7.setType("-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! () - Copies: 1" + "'", str25, "hi! () - Copies: 1");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        gui.Item item7 = new gui.Item(1, "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 1", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!", "0,,hi!,,1,hi!, () - Copies: 10", (int) (byte) 10, "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,35,hi!,hi! () - Copies: 1", "-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        item7.setAuthor("0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        int int13 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        gui.Item item7 = new gui.Item((int) (short) 100, "-1,,hi!,,100,hi!,hi! () - Copies: 1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,100,hi!,-1,,hi!,,1,hi!,hi!", "-1,,hi!,-1,,hi!,,1,hi!,hi!,100,hi!,hi! () - Copies: 1", (int) (byte) 100, "-1,,hi!,,-1,hi! () - Copies: 1,hi!", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.getAuthor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (byte) 100);
        int int21 = item7.getCopiesAvailable();
        java.lang.String str22 = item7.getType();
        java.lang.String str23 = item7.toString();
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! () - Copies: 100" + "'", str23, "hi! () - Copies: 100");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getCopiesAvailable();
        java.lang.String str18 = item7.toCsvString();
        item7.setCopiesAvailable(1);
        item7.setName("hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        java.lang.String str17 = item7.getAuthor();
        item7.setAuthor("hi! (0,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '#');
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) ' ');
        java.lang.String str14 = item7.getType();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (byte) -1);
        item7.setCopiesAvailable((int) (byte) -1);
        java.lang.String str22 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setLocation("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.Class<?> wildcardClass10 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi!,hi! () - Copies: 100");
        item7.setGenre("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str15 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        gui.Item item7 = new gui.Item(1, "hi! () - Copies: 1", "-1,,hi!,,100,hi!,hi! () - Copies: 1", "hi! () - Copies: -1", (int) ' ', "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "hi! () - Copies: -1");
        java.lang.String str8 = item7.toString();
        java.lang.String str9 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32" + "'", str8, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        java.lang.String str14 = item7.getLocation();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setGenre("hi! () - Copies: 35");
        item7.setItemId((int) (short) 10);
        item7.setLocation("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int19 = item7.getCopiesAvailable();
        item7.setItemId(32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        int int15 = item7.getCopiesAvailable();
        int int16 = item7.getCopiesAvailable();
        java.lang.String str17 = item7.getLocation();
        item7.setLocation("");
        java.lang.Class<?> wildcardClass20 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.getGenre();
        java.lang.String str17 = item7.getAuthor();
        java.lang.String str18 = item7.getName();
        java.lang.String str19 = item7.toString();
        item7.setType("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, (hi! () - Copies: -1) - Copies: -1");
        item7.setGenre("-1,,hi!,,35,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 1" + "'", str19, "hi! () - Copies: 1");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int18 = item7.getItemId();
        item7.setType("-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str21 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str21, "-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        gui.Item item7 = new gui.Item(52, "1,hi! () - Copies: 32,,,100,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 1", "-1,hi!,35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,hi!,hi!", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", (int) (byte) 10, "-1,,hi!,,100,hi!,hi! () - Copies: 1", "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        gui.Item item7 = new gui.Item(52, "-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! () - Copies: -1 (hi! () - Copies: -1) - Copies: 100", "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", 52, "hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1", "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str8 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str8, "-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.toString();
        java.lang.String str16 = item7.getGenre();
        item7.setLocation("hi! () - Copies: 35");
        java.lang.Class<?> wildcardClass19 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        java.lang.String str10 = item7.getGenre();
        item7.setLocation("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setItemId((int) (short) 100);
        item7.setCopiesAvailable((int) (byte) 100);
        java.lang.String str17 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        item7.setLocation("0,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str22 = item7.getGenre();
        java.lang.String str23 = item7.toString();
        java.lang.String str24 = item7.toCsvString();
        java.lang.String str25 = item7.getGenre();
        java.lang.String str26 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str22, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! () - Copies: 32" + "'", str23, "hi! () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0,,hi!,0,,hi!,,1,hi!,hi!,32,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str24, "0,,hi!,0,,hi!,,1,hi!,hi!,32,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str25, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str26, "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getName();
        item7.setAuthor("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setType("32,,,,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '#');
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str12 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        gui.Item item7 = new gui.Item((int) (byte) -1, "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!", 35, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "0,,hi!,,32,hi!,hi!");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setCopiesAvailable(100);
        java.lang.Class<?> wildcardClass16 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        item7.setName("");
        java.lang.String str19 = item7.getLocation();
        item7.setName("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setType("-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,");
        item7.setGenre("97,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getLocation();
        item7.setCopiesAvailable(100);
        item7.setType("-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
        java.lang.String str21 = item7.getType();
        int int22 = item7.getCopiesAvailable();
        int int23 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!" + "'", str21, "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        java.lang.String str18 = item7.getAuthor();
        int int19 = item7.getItemId();
        item7.setCopiesAvailable((int) 'a');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        int int18 = item7.getCopiesAvailable();
        java.lang.String str19 = item7.getGenre();
        item7.setName("-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
        java.lang.String str22 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        gui.Item item7 = new gui.Item((int) (short) -1, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!", 0, "-1,,hi!,,1,hi!,hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) (short) -1);
        int int10 = item7.getCopiesAvailable();
        item7.setGenre("35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int13 = item7.getCopiesAvailable();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setName("-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int15 = item7.getItemId();
        item7.setLocation("10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.toString();
        java.lang.String str19 = item7.getName();
        item7.setLocation("hi! (hi! () - Copies: 1) - Copies: 10");
        java.lang.String str22 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 1" + "'", str18, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        gui.Item item7 = new gui.Item((int) (byte) -1, " () - Copies: -1", "-1,,hi!,,1,hi!,hi!", "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", (-1), "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getAuthor();
        java.lang.String str9 = item7.getName();
        int int10 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str8, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str9, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getGenre();
        item7.setCopiesAvailable((-1));
        java.lang.String str19 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi!,hi!,-1,hi!,hi! () - Copies: 1" + "'", str19, "-1,,hi!,-1,,hi!,,1,hi!,hi!,-1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        item7.setLocation("hi!");
        java.lang.String str12 = item7.toString();
        java.lang.String str13 = item7.getLocation();
        java.lang.String str14 = item7.getName();
        item7.setItemId((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        int int16 = item7.getCopiesAvailable();
        item7.setItemId(0);
        item7.setLocation("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str21 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str13 = item7.getLocation();
        java.lang.String str14 = item7.getAuthor();
        java.lang.String str15 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str15, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        gui.Item item7 = new gui.Item((int) (short) 10, "hi! () - Copies: 1", "-1,,hi!,,52,hi!,", "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", (int) (byte) 0, "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,,hi!,100,hi!,hi! () - Copies: 1");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        java.lang.String str18 = item7.getAuthor();
        int int19 = item7.getItemId();
        java.lang.String str20 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.toString();
        java.lang.String str19 = item7.getGenre();
        item7.setItemId(32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        gui.Item item7 = new gui.Item((-1), "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!", (int) (short) 0, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        int int8 = item7.getCopiesAvailable();
        java.lang.String str9 = item7.getLocation();
        item7.setLocation("-1,,hi!,,-1, () - Copies: 100,-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str9, "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        item7.setItemId((int) (short) 1);
        int int19 = item7.getCopiesAvailable();
        item7.setType("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        java.lang.String str22 = item7.getLocation();
        item7.setLocation("35,,hi!,,1,hi! () - Copies: -1,hi!");
        java.lang.String str25 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        gui.Item item7 = new gui.Item(0, "1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1", "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", (int) '4', "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.getType();
        item7.setName(" () - Copies: 100");
        item7.setType("0,,hi!,,32,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
        java.lang.String str18 = item7.toCsvString();
        item7.setLocation("");
        item7.setGenre("-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getName();
        int int16 = item7.getCopiesAvailable();
        java.lang.String str17 = item7.toString();
        item7.setType("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str20 = item7.getAuthor();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
        java.lang.String str23 = item7.getName();
        item7.setLocation("-1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! () - Copies: 1" + "'", str20, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str23, "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        gui.Item item7 = new gui.Item((int) (short) 10, "0,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", "10,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,1,hi!,hi! () - Copies: 100", (int) (byte) 1, "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", " (hi!) - Copies: 1");
        java.lang.String str8 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str8, "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        gui.Item item7 = new gui.Item(10, "32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0", "", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!", 97, "-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        java.lang.String str8 = item7.getAuthor();
        java.lang.String str9 = item7.getName();
        java.lang.String str10 = item7.toString();
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str13 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! (hi! () - Copies: 1) - Copies: 10" + "'", str10, "hi! (hi! () - Copies: 1) - Copies: 10");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,hi! () - Copies: 1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str13, "-1,hi! () - Copies: 1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        int int9 = item7.getCopiesAvailable();
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getAuthor();
        item7.setType("-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
        java.lang.String str17 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,,100,-1,,hi!,,1,hi!,hi!," + "'", str17, "1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,,100,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str18 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!" + "'", str18, "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getGenre();
        java.lang.String str14 = item7.getType();
        item7.setCopiesAvailable(10);
        java.lang.Class<?> wildcardClass17 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        item7.setItemId((int) (short) 1);
        int int19 = item7.getCopiesAvailable();
        item7.setGenre("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str22 = item7.toCsvString();
        item7.setType("-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi! (hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100) - Copies: 32");
        item7.setName("-1,,hi!,,32,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str22, "1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!", 35, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        item7.setCopiesAvailable((int) (short) 0);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        gui.Item item7 = new gui.Item(97, "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,97,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,", "", 97, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", "1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,,,100,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        gui.Item item7 = new gui.Item((int) (short) 1, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "", "hi! () - Copies: 1", 0, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId(0);
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        item7.setName("0,,hi!,,32,hi!,hi!");
        java.lang.String str14 = item7.toString();
        item7.setAuthor("32, () - Copies: -1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi! () - Copies: 1 (hi!) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,32,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0" + "'", str14, "0,,hi!,,32,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        gui.Item item7 = new gui.Item((int) '4', "35,hi!,hi!,,1,hi!,hi!", "0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", 32, "-1,hi!,hi!,,1,hi!,hi!", "-1,,hi!,,35,hi!,");
        java.lang.String str8 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35,hi!,hi!,,1,hi!,hi!" + "'", str8, "35,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setItemId(10);
        java.lang.String str18 = item7.toCsvString();
        java.lang.String str19 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!" + "'", str18, "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getCopiesAvailable();
        java.lang.String str9 = item7.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! (hi! () - Copies: 1) - Copies: 10" + "'", str9, "hi! (hi! () - Copies: 1) - Copies: 10");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        item7.setLocation("hi!");
        item7.setCopiesAvailable((int) (short) 10);
        java.lang.String str19 = item7.getLocation();
        java.lang.String str20 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.toString();
        java.lang.String str16 = item7.getGenre();
        item7.setLocation("hi! () - Copies: 35");
        java.lang.String str19 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.toString();
        item7.setType("1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setName(" () - Copies: -1");
        int int16 = item7.getItemId();
        java.lang.String str17 = item7.toCsvString();
        java.lang.String str18 = item7.getLocation();
        item7.setItemId(52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setType("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str14 = item7.getName();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) 1);
        item7.setType("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        int int24 = item7.getCopiesAvailable();
        java.lang.String str25 = item7.getAuthor();
        item7.setGenre("100,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        item7.setName("");
        item7.setLocation("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setItemId((int) (short) 100);
        java.lang.String str23 = item7.getGenre();
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: -1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setName("0,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.toCsvString();
        item7.setGenre("1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        item7.setType("0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str14, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        gui.Item item7 = new gui.Item((int) (byte) 1, "hi! () - Copies: 0", " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52", (int) ' ', "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1", "hi! () - Copies: -1");
        item7.setGenre("hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0");
        java.lang.String str10 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10" + "'", str10, " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setAuthor("hi!");
        item7.setType("hi!");
        item7.setItemId(0);
        java.lang.String str18 = item7.getName();
        item7.setItemId((int) (short) 100);
        item7.setGenre("-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32");
        java.lang.String str23 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32" + "'", str23, "-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        item7.setLocation("0,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str22 = item7.getGenre();
        java.lang.String str23 = item7.toString();
        java.lang.String str24 = item7.toCsvString();
        int int25 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str22, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! () - Copies: 32" + "'", str23, "hi! () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0,,hi!,0,,hi!,,1,hi!,hi!,32,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str24, "0,,hi!,0,,hi!,,1,hi!,hi!,32,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        gui.Item item7 = new gui.Item(32, "hi! () - Copies: 1", "-1,,hi!,,100,hi!,hi! () - Copies: 1", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", (int) (short) 10, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str8, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        item7.setGenre("hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        gui.Item item7 = new gui.Item((int) '4', "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35", "-1,hi!,hi!,,1,hi!,hi!", "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", (int) (byte) 10, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.String str8 = item7.getLocation();
        item7.setGenre("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str11 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!" + "'", str8, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str11, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setCopiesAvailable(0);
        java.lang.String str12 = item7.toString();
        java.lang.String str13 = item7.toString();
        java.lang.String str14 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str12, "hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str13, "hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", (int) (short) 10, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "");
        java.lang.String str8 = item7.getGenre();
        item7.setItemId(32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", (int) (short) 10, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "");
        item7.setCopiesAvailable(0);
        item7.setGenre("hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setItemId((int) (byte) 10);
        java.lang.String str10 = item7.getType();
        item7.setItemId((int) ' ');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: -1" + "'", str10, "hi! () - Copies: -1");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        int int9 = item7.getCopiesAvailable();
        item7.setLocation("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        item7.setLocation("52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!");
        java.lang.String str14 = item7.getLocation();
        item7.setType("0,,hi!,hi! () - Copies: 35,32,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!" + "'", str14, "52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!");
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.toString();
        java.lang.String str16 = item7.getType();
        item7.setType("-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.getLocation();
        java.lang.Class<?> wildcardClass20 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str20 = item7.getType();
        item7.setGenre("hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("0,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        int int22 = item7.getCopiesAvailable();
        java.lang.String str23 = item7.toCsvString();
        java.lang.String str24 = item7.getType();
        item7.setItemId((int) (short) 10);
        java.lang.Class<?> wildcardClass27 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str23, "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        gui.Item item7 = new gui.Item(1, "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!", "hi!", "", 52, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        gui.Item item7 = new gui.Item((-1), "-1,,hi!,,52,hi!,", "hi! (hi! () - Copies: 1) - Copies: 10", "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!", 32, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setType("1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str14 = item7.getLocation();
        item7.setLocation("-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setItemId((int) (byte) 1);
        java.lang.String str19 = item7.toString();
        item7.setGenre("10,-1,,hi!,,1,hi! () - Copies: 1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 1" + "'", str19, "hi! () - Copies: 1");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        item7.setName("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!");
        item7.setCopiesAvailable((int) '#');
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        gui.Item item7 = new gui.Item(100, "", "-1,,,,1,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,35,hi!,", 52, "hi! () - Copies: 100", " (hi!) - Copies: 1");
        java.lang.String str8 = item7.getName();
        item7.setType("-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) ' ');
        int int13 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str8, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! () - Copies: 1");
        java.lang.String str20 = item7.toCsvString();
        java.lang.String str21 = item7.getType();
        java.lang.String str22 = item7.getName();
        item7.setAuthor("-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str25 = item7.getGenre();
        item7.setAuthor("hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1");
        java.lang.String str28 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! () - Copies: 1" + "'", str25, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1" + "'", str28, "hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        gui.Item item7 = new gui.Item(52, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1", "0,,hi!,,1,hi!,hi!", (int) (byte) 100, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", " () - Copies: 10");
        java.lang.String str8 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!" + "'", str8, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        java.lang.String str17 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str20 = item7.toCsvString();
        java.lang.String str21 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,,35,hi!,hi!" + "'", str20, "10,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,,35,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.getType();
        int int10 = item7.getCopiesAvailable();
        item7.setAuthor("");
        java.lang.Class<?> wildcardClass13 = item7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        java.lang.String str17 = item7.getAuthor();
        int int18 = item7.getItemId();
        int int19 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getName();
        java.lang.Class<?> wildcardClass17 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        item7.setItemId(1);
        java.lang.String str18 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        int int19 = item7.getCopiesAvailable();
        java.lang.String str20 = item7.toCsvString();
        item7.setItemId(1);
        java.lang.String str23 = item7.toCsvString();
        item7.setType("0,,hi!,,1,hi!,hi! () - Copies: 32");
        item7.setItemId((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str23, "1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getAuthor();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi! () - Copies: 100,32, () - Copies: -1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi! () - Copies: 1 (hi!) - Copies: 35,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        gui.Item item7 = new gui.Item(10, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100", "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 32, " () - Copies: 10", "-1,hi!,hi!,,1,hi!,hi!");
        int int8 = item7.getCopiesAvailable();
        item7.setAuthor("0,,hi!,,32,hi!,hi!");
        java.lang.String str11 = item7.toString();
        java.lang.String str12 = item7.getGenre();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi! (hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100) - Copies: 32" + "'", str11, "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi! (hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100) - Copies: 32");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str12, "-1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setType("-1,hi!,hi!,,1,hi!,hi!");
        item7.setItemId(0);
        item7.setAuthor("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        int int15 = item7.getCopiesAvailable();
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getAuthor();
        java.lang.String str18 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str16, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str17, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str18, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.getGenre();
        java.lang.String str17 = item7.getAuthor();
        java.lang.String str18 = item7.getName();
        java.lang.String str19 = item7.toString();
        item7.setType("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, (hi! () - Copies: -1) - Copies: -1");
        int int22 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 1" + "'", str19, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setName("hi!");
        int int14 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getName();
        item7.setCopiesAvailable((int) (byte) -1);
        item7.setCopiesAvailable(100);
        item7.setType("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        int int22 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! () - Copies: 1");
        java.lang.String str20 = item7.toString();
        item7.setAuthor("0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str20, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        item7.setCopiesAvailable((-1));
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        gui.Item item7 = new gui.Item(100, "hi! () - Copies: 1 (hi!) - Copies: 0", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", (int) (byte) 0, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getCopiesAvailable();
        item7.setAuthor("hi! () - Copies: 32");
        item7.setName("32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str13 = item7.getAuthor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! () - Copies: 32" + "'", str13, "hi! () - Copies: 32");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.toString();
        java.lang.String str12 = item7.getAuthor();
        java.lang.String str13 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " () - Copies: 10" + "'", str11, " () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! () - Copies: 1" + "'", str13, "hi! () - Copies: 1");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        java.lang.String str18 = item7.getAuthor();
        item7.setLocation("hi! () - Copies: 35");
        java.lang.String str21 = item7.getType();
        int int22 = item7.getItemId();
        java.lang.String str23 = item7.toCsvString();
        java.lang.String str24 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0,,hi!,hi! () - Copies: 35,32,hi!,hi!" + "'", str23, "0,,hi!,hi! () - Copies: 35,32,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! () - Copies: 32" + "'", str24, "hi! () - Copies: 32");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setItemId((int) (byte) 1);
        int int13 = item7.getCopiesAvailable();
        int int14 = item7.getCopiesAvailable();
        item7.setLocation("hi! () - Copies: 100");
        java.lang.String str17 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str16 = item7.toString();
        java.lang.String str17 = item7.getType();
        item7.setGenre("hi! () - Copies: 1");
        item7.setGenre("");
        java.lang.String str22 = item7.getType();
        item7.setName(" () - Copies: 100");
        java.lang.String str25 = item7.getGenre();
        item7.setItemId((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getLocation();
        item7.setGenre("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.toCsvString();
        java.lang.String str19 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        gui.Item item7 = new gui.Item((int) (short) 0, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi!", "-1,,hi!,,1,hi!,hi!", (int) (short) 100, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.toCsvString();
        item7.setName("hi! () - Copies: 100");
        java.lang.String str13 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!" + "'", str10, "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str13, "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str16 = item7.toString();
        java.lang.String str17 = item7.getType();
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str20 = item7.getAuthor();
        java.lang.String str21 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str20, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        java.lang.String str17 = item7.getName();
        item7.setName("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        item7.setLocation("-1,,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
        int int24 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        int int18 = item7.getItemId();
        item7.setLocation("hi!");
        item7.setName("");
        int int23 = item7.getCopiesAvailable();
        item7.setItemId((int) (byte) 1);
        java.lang.String str26 = item7.getName();
        item7.setGenre("hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        item7.setType(" () - Copies: 100");
        java.lang.String str31 = item7.getLocation();
        item7.setGenre("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        gui.Item item7 = new gui.Item((int) (short) 100, "1,hi! () - Copies: 32,,,100,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 1", "32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,1,-1,,hi!,,1,hi!,hi! () - Copies: 100,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (byte) 10, "hi! (hi! () - Copies: 1) - Copies: 32", "1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,,100,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.getLocation();
        item7.setCopiesAvailable(1);
        item7.setCopiesAvailable((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str19, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        item7.setGenre("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setName("10,,hi!,,1,hi!,hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        gui.Item item7 = new gui.Item((int) (short) -1, "", "", "-1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,0,,hi!,,1,hi!,hi!,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", "-1,,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        java.lang.String str13 = item7.getName();
        java.lang.String str14 = item7.toString();
        item7.setItemId((-1));
        int int17 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 35" + "'", str14, "hi! () - Copies: 35");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.getName();
        item7.setName("-1,,hi!,,-1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        item7.setLocation("-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.toCsvString();
        item7.setLocation("35,-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32,-1,,hi!,,1,hi!,hi!,,97,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
        int int18 = item7.getCopiesAvailable();
        item7.setAuthor("32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str21 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        item7.setName("");
        item7.setLocation("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str21 = item7.getType();
        item7.setGenre("hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35");
        java.lang.String str24 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getLocation();
        item7.setCopiesAvailable((int) (short) 10);
        java.lang.String str11 = item7.getType();
        item7.setName("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        java.lang.String str14 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        gui.Item item7 = new gui.Item(32, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "hi! () - Copies: 1", "hi! () - Copies: 35", (int) (byte) 0, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getLocation();
        item7.setCopiesAvailable((int) '4');
        java.lang.String str11 = item7.getGenre();
        int int12 = item7.getItemId();
        java.lang.String str13 = item7.getLocation();
        java.lang.String str14 = item7.getLocation();
        item7.setItemId((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 35" + "'", str8, "hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! () - Copies: 35" + "'", str13, "hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 35" + "'", str14, "hi! () - Copies: 35");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setName("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str15 = item7.getName();
        item7.setItemId(0);
        item7.setItemId((int) (byte) 1);
        item7.setItemId(0);
        item7.setCopiesAvailable((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str15, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        int int11 = item7.getCopiesAvailable();
        int int12 = item7.getCopiesAvailable();
        java.lang.String str13 = item7.getGenre();
        int int14 = item7.getItemId();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        item7.setName("");
        item7.setName("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str22 = item7.getLocation();
        int int23 = item7.getItemId();
        item7.setCopiesAvailable(97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        item7.setLocation("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getAuthor();
        int int18 = item7.getItemId();
        int int19 = item7.getCopiesAvailable();
        item7.setLocation("35,-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32,-1,,hi!,,1,hi!,hi!,,97,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getLocation();
        item7.setType("hi! () - Copies: 1");
        java.lang.String str12 = item7.getLocation();
        java.lang.String str13 = item7.getName();
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        gui.Item item7 = new gui.Item((int) (short) 10, "", "hi! () - Copies: 0", "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, () - Copies: 32", 97, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10", "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        int int19 = item7.getCopiesAvailable();
        java.lang.String str20 = item7.toString();
        item7.setGenre("-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! () - Copies: 1" + "'", str20, "hi! () - Copies: 1");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        gui.Item item7 = new gui.Item(1, "hi! () - Copies: 1", "-1,,hi!,,100,hi!,hi! () - Copies: 1", "hi! () - Copies: -1", (int) ' ', "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "hi! () - Copies: -1");
        java.lang.String str8 = item7.toString();
        java.lang.String str9 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32" + "'", str8, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: -1" + "'", str9, "hi! () - Copies: -1");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        gui.Item item7 = new gui.Item((int) (byte) 10, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0", "", "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!", (-1), "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!", "0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " (hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0) - Copies: -1" + "'", str8, " (hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0) - Copies: -1");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str18 = item7.getName();
        java.lang.String str19 = item7.getName();
        item7.setName("0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.getType();
        int int10 = item7.getCopiesAvailable();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.toCsvString();
        item7.setType("10,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setLocation("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,hi! () - Copies: 1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!" + "'", str12, "-1,hi! () - Copies: 1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.toCsvString();
        java.lang.String str16 = item7.toCsvString();
        java.lang.String str17 = item7.getType();
        item7.setName("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str20 = item7.toString();
        item7.setCopiesAvailable((int) 'a');
        item7.setCopiesAvailable((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str15, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str16, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str16 = item7.toString();
        item7.setGenre("");
        int int19 = item7.getItemId();
        item7.setType("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        item7.setLocation("hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.toCsvString();
        int int13 = item7.getCopiesAvailable();
        int int14 = item7.getItemId();
        java.lang.String str15 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str15, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        java.lang.String str9 = item7.toString();
        item7.setCopiesAvailable((int) 'a');
        java.lang.String str12 = item7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " () - Copies: 10" + "'", str9, " () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " () - Copies: 97" + "'", str12, " () - Copies: 97");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        item7.setLocation("hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str14 = item7.getLocation();
        java.lang.String str15 = item7.getType();
        item7.setAuthor("0,,hi!,,1,hi!,hi! () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str14, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,,hi!,,1,hi!,");
        int int18 = item7.getCopiesAvailable();
        item7.setName("32,,hi!,,35,52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getGenre();
        java.lang.String str17 = item7.toCsvString();
        java.lang.String str18 = item7.toString();
        java.lang.String str19 = item7.getName();
        int int20 = item7.getItemId();
        java.lang.String str21 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str17, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 1" + "'", str18, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        item7.setLocation("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("-1,,hi!,,100,hi!,hi! () - Copies: 1");
        item7.setLocation("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,hi!,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! () - Copies: 1");
        java.lang.String str20 = item7.toCsvString();
        java.lang.String str21 = item7.getType();
        java.lang.String str22 = item7.getName();
        int int23 = item7.getCopiesAvailable();
        java.lang.String str24 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        gui.Item item7 = new gui.Item((int) (byte) 0, "", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", (int) '4', "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        java.lang.String str8 = item7.getGenre();
        java.lang.String str9 = item7.getName();
        item7.setName("-1,,hi!,,1,hi! () - Copies: -1,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100" + "'", str8, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str9, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        item7.setLocation("");
        item7.setName("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        int int20 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.getLocation();
        item7.setType("");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!", "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 52, "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi! () - Copies: 35", "-1,,hi!,,-1,hi!,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        gui.Item item7 = new gui.Item((int) (short) 0, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi!", "-1,,hi!,,1,hi!,hi!", (int) (short) 100, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.toCsvString();
        item7.setLocation("hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.String str13 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!" + "'", str10, "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str13, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        gui.Item item7 = new gui.Item((int) '#', "-1,,hi!,,1,hi! () - Copies: 1,hi!", "", " () - Copies: 100", (int) (byte) 100, "hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setCopiesAvailable((-1));
        item7.setLocation("hi! (hi!) - Copies: 1");
        java.lang.String str12 = item7.getLocation();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! (hi!) - Copies: 1" + "'", str12, "hi! (hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str13, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getCopiesAvailable();
        item7.setName("");
        item7.setLocation("hi! () - Copies: 1 () - Copies: 100");
        item7.setAuthor(" () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        gui.Item item7 = new gui.Item((int) (byte) 10, "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,0,,hi!,,1,hi!,hi!,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!", (int) (byte) 1, "hi! () - Copies: 35", "hi!");
        java.lang.String str8 = item7.getType();
        java.lang.String str9 = item7.toString();
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable(35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str8, "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1" + "'", str9, "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,0,,hi!,,1,hi!,hi!,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,0,,hi!,,1,hi!,hi!,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) 1);
        item7.setType("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        item7.setLocation("hi! () - Copies: -1");
        java.lang.String str26 = item7.getGenre();
        java.lang.String str27 = item7.toCsvString();
        item7.setName("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setName("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        java.lang.String str32 = item7.getName();
        java.lang.Class<?> wildcardClass33 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! () - Copies: 1" + "'", str26, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1" + "'", str27, "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!," + "'", str32, "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        org.junit.Assert.assertNotNull(wildcardClass33);
    }
}

