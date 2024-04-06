package gui.randoopTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getLocation();
        java.lang.String str15 = item7.getGenre();
        java.lang.Class<?> wildcardClass16 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.toString();
        item7.setAuthor("52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str21 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str18, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        gui.Item item7 = new gui.Item((int) (byte) 1, "-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32", "hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0", 52, "", "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str8 = item7.getType();
        java.lang.String str9 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str8, "-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1,-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32,hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0,52,,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str9, "1,-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32,hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0,52,,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        item7.setAuthor("0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        java.lang.String str13 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        gui.Item item7 = new gui.Item((int) (byte) 0, "", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", (int) '4', "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        java.lang.String str8 = item7.getType();
        item7.setItemId(35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getLocation();
        item7.setGenre("-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str11 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str11, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setGenre("");
        item7.setGenre("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1");
        java.lang.Class<?> wildcardClass14 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        int int18 = item7.getItemId();
        java.lang.String str19 = item7.getName();
        item7.setType("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str22 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,hi!,,100,hi!,hi! () - Copies: 1" + "'", str22, "-1,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,hi!,,100,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setCopiesAvailable(35);
        java.lang.String str15 = item7.getGenre();
        item7.setType("-1,,hi!,hi!,10,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        item7.setType("32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str23 = item7.getType();
        java.lang.String str24 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!" + "'", str23, "32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,hi!,,32,hi!,hi!" + "'", str24, "1,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,hi!,,32,hi!,hi!");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str20 = item7.getLocation();
        java.lang.String str21 = item7.getName();
        item7.setType("-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!) - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! (hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.getGenre();
        item7.setGenre("");
        item7.setCopiesAvailable(1);
        item7.setItemId((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! () - Copies: 1", (int) (short) 1, "hi! () - Copies: 1", "-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.toCsvString();
        item7.setGenre("1,,hi!,,1,-1,,hi!,,1,hi!,hi!, (hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!" + "'", str8, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int20 = item7.getItemId();
        item7.setGenre("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        gui.Item item7 = new gui.Item(32, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "hi! () - Copies: 1", "hi! () - Copies: 35", (int) (byte) 0, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getLocation();
        item7.setCopiesAvailable((int) '4');
        java.lang.String str11 = item7.getGenre();
        item7.setType("0,,hi!,,32,hi!,hi!");
        item7.setCopiesAvailable((int) (short) 0);
        int int16 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 35" + "'", str8, "hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setGenre("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: -1");
        java.lang.String str15 = item7.getType();
        item7.setCopiesAvailable((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setCopiesAvailable((-1));
        item7.setName("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        java.lang.String str22 = item7.getType();
        item7.setLocation("hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        item7.setLocation("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str23 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! () - Copies: 1" + "'", str20, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! () - Copies: 1" + "'", str23, "hi! () - Copies: 1");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        item7.setLocation("hi!");
        item7.setType("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str19 = item7.getType();
        int int20 = item7.getCopiesAvailable();
        item7.setItemId(100);
        java.lang.String str23 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str19, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        int int20 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getName();
        int int17 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) ' ');
        java.lang.String str20 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.toCsvString();
        item7.setLocation("-1,,hi!,,52,hi!,");
        java.lang.String str16 = item7.getAuthor();
        java.lang.String str17 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str13, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        java.lang.String str23 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        gui.Item item7 = new gui.Item(52, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 1", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 1", "32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!", (int) (short) 10, "-1,,hi!,-1,,hi!,,1,hi!,hi!,100,hi!,hi! () - Copies: 1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (byte) 1);
        java.lang.String str10 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!" + "'", str10, "32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        item7.setLocation("");
        item7.setName("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str20 = item7.getLocation();
        item7.setLocation("32, () - Copies: -1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi! () - Copies: 1 (hi!) - Copies: 35");
        java.lang.String str23 = item7.getType();
        java.lang.String str24 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setName("hi! () - Copies: 1");
        int int18 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) '#');
        item7.setItemId(97);
        item7.setAuthor("-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setItemId(0);
        item7.setName("hi! () - Copies: 1 (hi!) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        gui.Item item7 = new gui.Item(52, "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1", "-1,,hi!,,-1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,", "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1", (int) (byte) -1, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,32,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("hi! (hi! () - Copies: 1) - Copies: 32");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str10 = item7.getLocation();
        int int11 = item7.getCopiesAvailable();
        java.lang.String str12 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        item7.setGenre("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setItemId((int) (short) 1);
        java.lang.String str12 = item7.getName();
        item7.setGenre(" () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setName("0,,hi!,,1,hi!,hi!");
        int int14 = item7.getItemId();
        item7.setType("hi! () - Copies: -1");
        item7.setCopiesAvailable((-1));
        java.lang.String str19 = item7.toString();
        item7.setAuthor("hi! () - Copies: -1 (hi! () - Copies: -1) - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0,,hi!,,1,hi!,hi! (hi! () - Copies: -1) - Copies: -1" + "'", str19, "0,,hi!,,1,hi!,hi! (hi! () - Copies: -1) - Copies: -1");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        gui.Item item7 = new gui.Item((int) (short) 100, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: -1", "0,,hi!,,32,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 0", (int) (short) 100, "-1,,hi!,,1,hi!,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1", "-1,,hi!,,1,hi! () - Copies: -1,hi!");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getAuthor();
        java.lang.String str17 = item7.getGenre();
        java.lang.String str18 = item7.toCsvString();
        java.lang.Class<?> wildcardClass19 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str16, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,-1,hi!,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,hi!,,1,-1,hi!,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setItemId((int) (byte) 1);
        java.lang.String str13 = item7.getName();
        java.lang.String str14 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.toString();
        java.lang.String str16 = item7.getGenre();
        java.lang.String str17 = item7.getName();
        java.lang.String str18 = item7.getName();
        item7.setCopiesAvailable((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        item7.setGenre("-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) '4');
        java.lang.String str13 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str13, "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setCopiesAvailable((-1));
        java.lang.String str20 = item7.getLocation();
        java.lang.Class<?> wildcardClass21 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str12 = item7.getType();
        java.lang.String str13 = item7.toString();
        item7.setCopiesAvailable((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! () - Copies: 1" + "'", str13, "hi! () - Copies: 1");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        item7.setItemId((int) (byte) 1);
        java.lang.String str24 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        int int21 = item7.getItemId();
        java.lang.String str22 = item7.getName();
        item7.setItemId((-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str16 = item7.toString();
        item7.setGenre("");
        int int19 = item7.getItemId();
        java.lang.String str20 = item7.getLocation();
        java.lang.String str21 = item7.getLocation();
        java.lang.String str22 = item7.toString();
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setType("-1,,hi!,-1,,hi!,,1,hi!,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: -1" + "'", str22, "hi! () - Copies: -1");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        java.lang.String str20 = item7.toCsvString();
        java.lang.Class<?> wildcardClass21 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 32" + "'", str19, "hi! () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0,,hi!,,32,hi!,hi!" + "'", str20, "0,,hi!,,32,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        item7.setLocation("35,,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!");
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
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        gui.Item item7 = new gui.Item((int) (short) 1, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "", (int) (short) 1, "0,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        java.lang.String str9 = item7.toString();
        java.lang.String str10 = item7.toCsvString();
        java.lang.String str11 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1" + "'", str9, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,1,0,,hi!,,1,hi!,hi!," + "'", str10, "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,1,0,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
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
        item7.setName("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        item7.setGenre("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        int int10 = item7.getItemId();
        item7.setGenre("-1,,hi!,,-1, () - Copies: 100,-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        gui.Item item7 = new gui.Item((int) (byte) 10, "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", "hi!", "-1,,hi!,,35,hi!,", 1, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "");
        item7.setItemId(32);
        int int10 = item7.getItemId();
        java.lang.String str11 = item7.getLocation();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,35,hi!," + "'", str11, "-1,,hi!,,35,hi!,");
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.toCsvString();
        item7.setAuthor("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        item7.setAuthor("-1,,hi!,,1,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        gui.Item item7 = new gui.Item((int) (byte) 100, "100,-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32,hi!,-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32,100,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! (32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,) - Copies: -1", "97,,hi!,,1,hi!,hi!", (int) 'a', "1,hi! () - Copies: 32,,,100,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 1", "0,,hi!,,1,hi!,hi! (hi! () - Copies: -1) - Copies: -1");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        gui.Item item7 = new gui.Item((int) ' ', "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!", "32,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!", (int) (byte) 1, "1,,hi!,,1,hi!,hi!", "1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100");
        java.lang.String str8 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        gui.Item item7 = new gui.Item((int) 'a', "35,-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32,-1,,hi!,,1,hi!,hi!,,97,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "10,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", 0, "-1,,hi!,hi!,0,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "100,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!, () - Copies: 100,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,100,,-1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        java.lang.String str20 = item7.getAuthor();
        item7.setType("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (byte) 10);
        java.lang.String str25 = item7.getName();
        java.lang.String str26 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str25, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,");
        java.lang.String str20 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        item7.setCopiesAvailable((int) (byte) 10);
        int int23 = item7.getCopiesAvailable();
        java.lang.String str24 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! () - Copies: 10" + "'", str24, "hi! () - Copies: 10");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        gui.Item item7 = new gui.Item((int) (short) 0, "-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,hi!,,35,hi!,", (int) (byte) 100, "hi! () - Copies: 1 (hi!) - Copies: 0", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        java.lang.String str8 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str8, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getName();
        int int16 = item7.getCopiesAvailable();
        item7.setItemId(32);
        item7.setName(" () - Copies: 1");
        item7.setLocation("32,,hi!,,35,52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,");
        java.lang.String str23 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getType();
        item7.setAuthor("hi! () - Copies: -1");
        java.lang.String str14 = item7.getAuthor();
        java.lang.Class<?> wildcardClass15 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: -1" + "'", str14, "hi! () - Copies: -1");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,hi!,,1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!", "100,hi!,hi! () - Copies: 1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32", 0, "-1,,hi!,hi!,10,hi!,hi!", "hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35");
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        java.lang.String str11 = item7.toCsvString();
        int int12 = item7.getCopiesAvailable();
        java.lang.String str13 = item7.getLocation();
        item7.setAuthor("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getLocation();
        item7.setAuthor("0,,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.toCsvString();
        java.lang.String str20 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        int int23 = item7.getCopiesAvailable();
        item7.setType("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,1,0,,hi!,,1,hi!,hi!,");
        item7.setGenre("10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!" + "'", str19, "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.toCsvString();
        int int13 = item7.getCopiesAvailable();
        item7.setAuthor("");
        java.lang.Class<?> wildcardClass16 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        java.lang.String str8 = item7.getAuthor();
        int int9 = item7.getItemId();
        java.lang.String str10 = item7.toString();
        item7.setAuthor("1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        item7.setAuthor("-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! (hi! () - Copies: 1) - Copies: 10" + "'", str10, "hi! (hi! () - Copies: 1) - Copies: 10");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str20 = item7.getType();
        item7.setType("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        item7.setLocation("-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("");
        java.lang.String str15 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        gui.Item item7 = new gui.Item((-1), "-1,,hi!,,52,hi!,", "hi! (hi! () - Copies: 1) - Copies: 10", "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!", 32, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setType("1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        java.lang.String str10 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!" + "'", str10, "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!");
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        item7.setGenre("hi! () - Copies: -1 (hi! () - Copies: -1) - Copies: 100");
        int int24 = item7.getCopiesAvailable();
        java.lang.String str25 = item7.getAuthor();
        java.lang.String str26 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!" + "'", str26, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        java.lang.String str24 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! () - Copies: 1" + "'", str23, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,,hi!,hi!,100,hi!,hi! () - Copies: 1" + "'", str24, "-1,,hi!,hi!,100,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        gui.Item item7 = new gui.Item(32, "100,hi!,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,hi! () - Copies: 1,hi!", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,hi!,hi!,,1,hi!,hi!) - Copies: 1", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (short) 100, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "hi! () - Copies: 100");
        item7.setGenre("");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        gui.Item item7 = new gui.Item(100, "-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1", "1,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,,32, () - Copies: 100,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!", (int) 'a', "-1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!", "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getAuthor();
        item7.setType("hi! () - Copies: 1");
        item7.setAuthor("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        item7.setGenre("-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str18, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        gui.Item item7 = new gui.Item((int) (byte) 100, "hi! () - Copies: 32", "97,,hi!,,1,hi!,hi!", " () - Copies: 1", (int) (short) 100, "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,35,hi!,hi! () - Copies: 1", "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        item7.setCopiesAvailable(35);
        java.lang.String str11 = item7.getGenre();
        item7.setCopiesAvailable(1);
        item7.setLocation("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setType("-1,,hi!,,1,hi!,hi! () - Copies: 100");
        item7.setCopiesAvailable((int) (short) 100);
        java.lang.String str20 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "32,-1,,hi!,,1,hi!,hi! () - Copies: 100,,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,100,-1,,hi!,,1,hi!,hi!," + "'", str20, "32,-1,,hi!,,1,hi!,hi! () - Copies: 100,,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,100,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setType("-1,hi!,hi!,,1,hi!,hi!");
        item7.setName("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str21 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str21, "-1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        gui.Item item7 = new gui.Item((int) (short) 100, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "", "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1", (int) (short) 0, "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setGenre("-1,,hi!,,1,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,hi!");
        int int10 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        gui.Item item7 = new gui.Item((-1), "1,,hi!,,32,hi!,hi!", "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!", "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!", 100, "-1,,hi!,,1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "1,,,,100,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("hi! () - Copies: 35");
        java.lang.String str10 = item7.getAuthor();
        int int11 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 35" + "'", str10, "hi! () - Copies: 35");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        gui.Item item7 = new gui.Item((int) (short) -1, "1,hi!,hi! () - Copies: 1,,0,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10", "", 0, "-1,,hi!,,1,hi!,hi! (hi! () - Copies: 1) - Copies: 10", "-1,,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        item7.setCopiesAvailable((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str23, "1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        gui.Item item7 = new gui.Item((int) ' ', "hi! () - Copies: 35", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", (int) 'a', "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str10 = item7.getLocation();
        item7.setLocation("-1,hi! () - Copies: 1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!");
        item7.setCopiesAvailable((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str10, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        int int8 = item7.getCopiesAvailable();
        item7.setAuthor("-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setType("-1,,,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setCopiesAvailable((int) '#');
        int int10 = item7.getCopiesAvailable();
        java.lang.Class<?> wildcardClass11 = item7.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getLocation();
        int int18 = item7.getItemId();
        java.lang.String str19 = item7.getName();
        item7.setGenre("-1,,hi!,,100,hi!,hi! () - Copies: 1");
        item7.setAuthor("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, (hi! () - Copies: -1) - Copies: -1");
        java.lang.String str24 = item7.toString();
        item7.setItemId((int) (short) 100);
        item7.setAuthor("0,,hi!,,1,hi!, () - Copies: 10");
        item7.setGenre("hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! () - Copies: 1" + "'", str24, "hi! () - Copies: 1");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) '4');
        item7.setName("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str22 = item7.getAuthor();
        item7.setCopiesAvailable(10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        gui.Item item7 = new gui.Item(35, " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10", "-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", "hi!", (int) (short) 1, "0,hi! () - Copies: -1,hi!,,1,hi!,hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
        int int8 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str12 = item7.toCsvString();
        item7.setCopiesAvailable(0);
        item7.setItemId((int) (short) 1);
        item7.setAuthor("-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable(100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        gui.Item item7 = new gui.Item((int) (byte) -1, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi! () - Copies: 1", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", 100, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setName("-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
        item7.setType("hi! () - Copies: 1 () - Copies: 100");
        java.lang.String str12 = item7.toCsvString();
        java.lang.Class<?> wildcardClass13 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,hi! () - Copies: 1 () - Copies: 100,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str12, "-1,hi! () - Copies: 1 () - Copies: 100,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getName();
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.toString();
        java.lang.String str14 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!" + "'", str12, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " () - Copies: 10" + "'", str13, " () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.getLocation();
        java.lang.String str20 = item7.getAuthor();
        java.lang.String str21 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str19, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 1" + "'", str21, "hi! () - Copies: 1");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.toCsvString();
        java.lang.String str16 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str15, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.getGenre();
        item7.setAuthor("-1,,hi!,,35,hi!,hi!");
        java.lang.Class<?> wildcardClass20 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.toCsvString();
        java.lang.String str16 = item7.toCsvString();
        item7.setLocation("-1,,hi!,,1,hi!,");
        java.lang.String str19 = item7.getName();
        item7.setCopiesAvailable((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str15, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str16, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        gui.Item item7 = new gui.Item((int) (short) 0, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi!", "-1,,hi!,,1,hi!,hi!", (int) (short) 100, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!");
        item7.setType("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        int int10 = item7.getItemId();
        item7.setAuthor("-1,,,hi!,100,hi!,hi! () - Copies: 1");
        int int13 = item7.getCopiesAvailable();
        item7.setGenre(" (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setItemId((int) (byte) 10);
        java.lang.String str10 = item7.getType();
        item7.setLocation("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str13 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: -1" + "'", str10, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! () - Copies: -1 (hi! () - Copies: -1) - Copies: 100" + "'", str13, "hi! () - Copies: -1 (hi! () - Copies: -1) - Copies: 100");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.toString();
        java.lang.String str12 = item7.getGenre();
        item7.setName(" (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
        item7.setGenre("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        gui.Item item7 = new gui.Item(32, "0,,hi!,,1,hi!,hi! (hi! () - Copies: -1) - Copies: -1", "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,35,hi!,hi! () - Copies: 1", "1,-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32,hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0,52,,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", (int) '#', "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        int int11 = item7.getCopiesAvailable();
        int int12 = item7.getCopiesAvailable();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.toCsvString();
        item7.setName("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
        item7.setGenre(" (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
        java.lang.String str19 = item7.getLocation();
        java.lang.String str20 = item7.getName();
        int int21 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!" + "'", str20, "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setItemId(52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        int int17 = item7.getItemId();
        item7.setLocation(" () - Copies: 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        item7.setGenre("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setName("hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.String str12 = item7.getType();
        item7.setName("-1,,hi!,,0,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        item7.setName("1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        java.lang.String str25 = item7.getType();
        item7.setCopiesAvailable(0);
        int int28 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str25, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        int int16 = item7.getCopiesAvailable();
        java.lang.String str17 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        int int9 = item7.getItemId();
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setLocation("");
        item7.setGenre("-1,,,hi!,100,hi!,hi! () - Copies: 1");
        java.lang.String str16 = item7.toCsvString();
        item7.setGenre("10,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,,35,hi!,hi!");
        java.lang.String str19 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32,,,,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str16, "32,,,,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getLocation();
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getType();
        item7.setLocation("-1,,-1,,hi!,hi!,100,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!,0,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        gui.Item item7 = new gui.Item((int) (byte) -1, "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1", "-1,,hi!,,35,hi!,hi!", "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1", (int) (short) 100, "0,,hi!,,1,hi!,hi! () - Copies: 32", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,");
        item7.setItemId(52);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getType();
        java.lang.Class<?> wildcardClass13 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setGenre("");
        item7.setCopiesAvailable((int) (byte) -1);
        item7.setItemId((int) ' ');
        java.lang.String str16 = item7.getType();
        java.lang.Class<?> wildcardClass17 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.getGenre();
        item7.setName("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        item7.setItemId((int) '4');
        item7.setType("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
        int int24 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        item7.setName("hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.String str11 = item7.getName();
        int int12 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str11, "hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        item7.setItemId((int) ' ');
        item7.setGenre("-1,,,,-1,hi!,hi!");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setItemId((int) (byte) 10);
        java.lang.String str10 = item7.getGenre();
        java.lang.String str11 = item7.getType();
        item7.setGenre("32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " () - Copies: 100" + "'", str10, " () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: -1" + "'", str11, "hi! () - Copies: -1");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 35,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        gui.Item item7 = new gui.Item((int) (byte) -1, "-1,,hi!,,-1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,", "", "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!", (int) (byte) 0, "-1,hi!,35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,hi!,hi!", "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str16 = item7.getType();
        item7.setName("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi! () - Copies: 1" + "'", str19, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setName("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        gui.Item item7 = new gui.Item((int) 'a', "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32", "100,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,35,hi!,,52,hi! () - Copies: 100, (hi!) - Copies: 1", "1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", 0, "-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", "hi! (hi! () - Copies: 1) - Copies: 10");
        java.lang.String str8 = item7.getGenre();
        item7.setGenre("52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! (hi! () - Copies: 1) - Copies: 10" + "'", str8, "hi! (hi! () - Copies: 1) - Copies: 10");
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setLocation("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.toCsvString();
        java.lang.String str12 = item7.toCsvString();
        int int13 = item7.getItemId();
        java.lang.Class<?> wildcardClass14 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: -1" + "'", str10, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100" + "'", str11, "1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100" + "'", str12, "1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        gui.Item item7 = new gui.Item((int) (short) 1, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "", "hi! () - Copies: 1", 0, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setName("10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 100);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.toString();
        java.lang.String str10 = item7.getAuthor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! (hi! () - Copies: 1) - Copies: 10" + "'", str9, "hi! (hi! () - Copies: 1) - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        java.lang.String str21 = item7.getName();
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
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setCopiesAvailable(0);
        java.lang.String str12 = item7.toString();
        item7.setCopiesAvailable((int) (short) 0);
        item7.setGenre("97,,-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str12, "hi! () - Copies: 1 (hi!) - Copies: 0");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        item7.setAuthor("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getItemId();
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setGenre("-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId(0);
        java.lang.String str14 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setName(" () - Copies: -1");
        int int16 = item7.getItemId();
        int int17 = item7.getCopiesAvailable();
        item7.setType("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        gui.Item item7 = new gui.Item(1, "hi! () - Copies: 1", "-1,,hi!,,100,hi!,hi! () - Copies: 1", "hi! () - Copies: -1", (int) ' ', "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "hi! () - Copies: -1");
        java.lang.String str8 = item7.toCsvString();
        int int9 = item7.getItemId();
        int int10 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1,hi! () - Copies: 1,-1,,hi!,,100,hi!,hi! () - Copies: 1,hi! () - Copies: -1,32,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi! () - Copies: -1" + "'", str8, "1,hi! () - Copies: 1,-1,,hi!,,100,hi!,hi! () - Copies: 1,hi! () - Copies: -1,32,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setCopiesAvailable((int) ' ');
        java.lang.String str15 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        gui.Item item7 = new gui.Item((int) (byte) 10, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi! () - Copies: -1,hi!", "32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0", 52, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100", "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        item7.setGenre("32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str10 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: -1,hi!,32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0,52,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!," + "'", str10, "10,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: -1,hi!,32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0,52,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
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
        item7.setAuthor("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi! () - Copies: 35");
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
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setName("-1,,hi!,,100,hi!,hi! () - Copies: 1");
        item7.setAuthor("-1,,hi!,,-1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        int int13 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        gui.Item item7 = new gui.Item(32, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "hi! () - Copies: 1", "hi! () - Copies: 35", (int) (byte) 0, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getLocation();
        item7.setCopiesAvailable((int) '4');
        java.lang.String str11 = item7.getGenre();
        int int12 = item7.getItemId();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 35" + "'", str8, "hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str13, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str14, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("hi! () - Copies: 1");
        item7.setItemId(100);
        java.lang.String str21 = item7.getName();
        int int22 = item7.getItemId();
        item7.setCopiesAvailable(52);
        item7.setType("-1,,-1,,hi!,,1,hi!,hi!,,52,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 100 + "'", int22 == 100);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.getGenre();
        int int18 = item7.getItemId();
        java.lang.String str19 = item7.getName();
        java.lang.String str20 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! () - Copies: 1" + "'", str20, "hi! () - Copies: 1");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getName();
        item7.setAuthor("1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        item7.setAuthor("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
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
        item7.setItemId(0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setAuthor("hi! () - Copies: -1");
        java.lang.String str13 = item7.getType();
        item7.setItemId(35);
        item7.setLocation("-1,,hi!,,1,hi!,");
        int int18 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setGenre("");
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.getType();
        item7.setGenre("100,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!, () - Copies: 100,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,100,,-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!," + "'", str12, "-1,,hi!,,1,hi!,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getCopiesAvailable();
        java.lang.String str9 = item7.getType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        gui.Item item7 = new gui.Item((int) (byte) 100, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32", "hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32", (int) (byte) 100, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str8 = item7.getGenre();
        java.lang.String str9 = item7.getAuthor();
        int int10 = item7.getItemId();
        int int11 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str8, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str9, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toCsvString();
        int int12 = item7.getCopiesAvailable();
        java.lang.Class<?> wildcardClass13 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        java.lang.String str10 = item7.getGenre();
        item7.setLocation("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setItemId((int) (short) 100);
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setLocation("0,,0,,hi!,,1,hi!,hi!,,32,hi!,hi!");
        java.lang.String str19 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setName("hi! () - Copies: 1");
        int int18 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) '#');
        item7.setItemId(97);
        item7.setAuthor("-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setItemId(0);
        java.lang.Class<?> wildcardClass27 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
        item7.setAuthor("-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 0);
        item7.setItemId((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 32" + "'", str19, "hi! () - Copies: 32");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.toString();
        item7.setAuthor("-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str16 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        java.lang.String str17 = item7.getAuthor();
        item7.setType("hi! () - Copies: 1");
        int int20 = item7.getCopiesAvailable();
        item7.setLocation("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str23 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        item7.setItemId(32);
        item7.setName("0,hi! () - Copies: 1,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setName("hi! () - Copies: 1");
        java.lang.String str18 = item7.toCsvString();
        int int19 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1" + "'", str18, "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        gui.Item item7 = new gui.Item((int) (byte) 1, "-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32", "hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0", 52, "", "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setItemId(52);
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32" + "'", str10, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32 (-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 52" + "'", str11, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32 (-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 52");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        gui.Item item7 = new gui.Item((int) ' ', "hi! () - Copies: 35", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", (int) 'a', "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "");
        java.lang.String str8 = item7.toCsvString();
        int int9 = item7.getCopiesAvailable();
        item7.setLocation("-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,97,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1," + "'", str8, "32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,97,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        gui.Item item7 = new gui.Item(52, "-1,,hi!,,1,hi!,hi! () - Copies: 100", "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 0", " () - Copies: 100", 10, "-1,hi! () - Copies: 1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,,,-1,hi!,hi!");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        java.lang.String str13 = item7.toCsvString();
        item7.setName("-1,,hi!,,1,hi! () - Copies: -1,hi!");
        item7.setCopiesAvailable(1);
        item7.setItemId((int) (byte) -1);
        java.lang.String str20 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str13, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi! () - Copies: -1,hi!" + "'", str20, "-1,,hi!,,1,hi! () - Copies: -1,hi!");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        gui.Item item7 = new gui.Item((int) (short) 100, "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1", "0,,0,,hi!,,1,hi!,hi!,,32,hi!,hi!", "", 0, "0,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
        item7.setType("");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        gui.Item item7 = new gui.Item((int) (byte) 100, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32", "hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32", (int) (byte) 100, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str8 = item7.getGenre();
        java.lang.String str9 = item7.toCsvString();
        java.lang.String str10 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str8, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100,-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32,hi!,-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32,100,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str9, "100,-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32,hi!,-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32,100,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getGenre();
        item7.setGenre("-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setType("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("hi! () - Copies: 35");
        java.lang.String str10 = item7.getType();
        item7.setCopiesAvailable(100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        item7.setName("1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        int int25 = item7.getCopiesAvailable();
        java.lang.String str26 = item7.toCsvString();
        item7.setType("hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1,-1,hi!,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str26, "-1,-1,hi!,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        java.lang.String str13 = item7.getName();
        java.lang.String str14 = item7.toString();
        java.lang.String str15 = item7.getLocation();
        item7.setLocation("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 35" + "'", str14, "hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        java.lang.String str23 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,,,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.getLocation();
        item7.setType("hi! () - Copies: -1");
        java.lang.String str18 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.toString();
        item7.setLocation("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        java.lang.String str21 = item7.toCsvString();
        java.lang.String str22 = item7.getGenre();
        item7.setCopiesAvailable((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!" + "'", str21, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        java.lang.String str24 = item7.getLocation();
        item7.setItemId(100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str23, "1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str24, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
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
        java.lang.String str22 = item7.getGenre();
        java.lang.String str23 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 1" + "'", str22, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setGenre("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 35" + "'", str10, "hi! () - Copies: 1 (hi!) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str11, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        item7.setLocation("0,,hi!,,1,hi!,hi!");
        int int20 = item7.getCopiesAvailable();
        java.lang.String str21 = item7.getName();
        java.lang.String str22 = item7.getType();
        item7.setType("10,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        gui.Item item7 = new gui.Item((int) (short) 1, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "", "hi! () - Copies: 1", 0, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setName("10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str12 = item7.toCsvString();
        item7.setGenre("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 1,0,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str12, "1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 1,0,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setGenre("hi! () - Copies: 35");
        java.lang.String str15 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        int int25 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str23, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.getType();
        int int13 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        int int18 = item7.getItemId();
        java.lang.String str19 = item7.getAuthor();
        item7.setLocation("1,,hi!,,1,-1,,hi!,,1,hi!,hi!, (hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        gui.Item item7 = new gui.Item((int) (short) -1, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!", 0, "-1,,hi!,,1,hi!,hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str9, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        gui.Item item7 = new gui.Item((int) (short) 0, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 32, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getItemId();
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str11 = item7.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: -1" + "'", str11, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: -1");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        item7.setItemId((int) (byte) 10);
        item7.setAuthor("-1,,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        gui.Item item7 = new gui.Item((int) (byte) -1, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi! () - Copies: 1", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", 100, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setName("-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
        item7.setType("hi! () - Copies: 1 () - Copies: 100");
        item7.setAuthor("35,-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32,-1,,hi!,,1,hi!,hi!,,97,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setName("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str15 = item7.getName();
        item7.setAuthor("-1,,hi!,,1,hi!,");
        java.lang.String str18 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str15, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str18, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        int int17 = item7.getItemId();
        java.lang.String str18 = item7.getLocation();
        int int19 = item7.getCopiesAvailable();
        int int20 = item7.getCopiesAvailable();
        item7.setGenre("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.toString();
        java.lang.String str16 = item7.toString();
        item7.setGenre("");
        item7.setAuthor("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        java.lang.String str21 = item7.getAuthor();
        java.lang.Class<?> wildcardClass22 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!" + "'", str21, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        java.lang.String str18 = item7.getAuthor();
        int int19 = item7.getCopiesAvailable();
        item7.setType("hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.toString();
        item7.setLocation("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        java.lang.String str21 = item7.toCsvString();
        java.lang.String str22 = item7.getType();
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!" + "'", str21, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setAuthor(" () - Copies: 100");
        item7.setName("0,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.getName();
        java.lang.String str19 = item7.getAuthor();
        item7.setCopiesAvailable((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str18, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " () - Copies: 100" + "'", str19, " () - Copies: 100");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        item7.setName("-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str30 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1" + "'", str26, "hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi! () - Copies: -1" + "'", str27, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!" + "'", str30, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        int int14 = item7.getCopiesAvailable();
        item7.setItemId((int) (byte) 0);
        item7.setLocation("32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.toCsvString();
        java.lang.String str20 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0,,hi!,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!" + "'", str19, "0,,hi!,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getCopiesAvailable();
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("hi! () - Copies: 100");
        java.lang.String str22 = item7.getLocation();
        java.lang.String str23 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
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
        item7.setGenre("-1,,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str29 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        item7.setCopiesAvailable((-1));
        item7.setType("0,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) 1);
        java.lang.String str16 = item7.getName();
        item7.setItemId(32);
        java.lang.String str19 = item7.getName();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str14 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi!,hi! () - Copies: 100");
        item7.setGenre("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setAuthor("0,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!, () - Copies: -1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1,10,-1,,,,1,-1,,hi!,,1,hi!,hi!,,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        gui.Item item7 = new gui.Item((int) (byte) 100, "32, () - Copies: -1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi! () - Copies: 1 (hi!) - Copies: 35", "", "-1,,,hi!,100,hi!,hi! () - Copies: 1", (-1), "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1", "-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        gui.Item item7 = new gui.Item((int) (byte) -1, " () - Copies: -1", "-1,,hi!,,1,hi!,hi!", "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", (-1), "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
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
        item7.setGenre("1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str24 = item7.getLocation();
        item7.setType("-1,,hi!,hi!,0,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setAuthor("hi!");
        item7.setType("hi!");
        item7.setLocation("-1,,-1,,hi!,,1,hi!,hi!,,52,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
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
        java.lang.String str21 = item7.getLocation();
        java.lang.Class<?> wildcardClass22 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!," + "'", str21, "-1,,hi!,,1,hi!,");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setName("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str13 = item7.toCsvString();
        java.lang.String str14 = item7.toCsvString();
        item7.setGenre("-1,hi!,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1) - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str13, "-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str14, "-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        gui.Item item7 = new gui.Item(52, "-1,hi!,hi!,,1,hi!,hi!", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1", (int) (short) 100, "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,", "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str8 = item7.getType();
        java.lang.Class<?> wildcardClass9 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str8, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        item7.setName("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setItemId(35);
        java.lang.String str20 = item7.getName();
        java.lang.String str21 = item7.getLocation();
        java.lang.String str22 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str20, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
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
        java.lang.Class<?> wildcardClass20 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        gui.Item item7 = new gui.Item(35, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32", "-1,,hi!,,1,hi!,hi!", "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", (int) 'a', "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        item7.setLocation("");
        java.lang.String str10 = item7.toCsvString();
        java.lang.String str11 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32,-1,,hi!,,1,hi!,hi!,,97,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!" + "'", str10, "35,-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32,-1,,hi!,,1,hi!,hi!,,97,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        gui.Item item7 = new gui.Item(32, "-1,,hi!,,-1, () - Copies: 100,-1,,hi!,,1,hi!,hi! () - Copies: 100", "-1,,-1,,hi!,,1,hi!,hi!,,100,52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,52,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,", "hi! (hi! () - Copies: 1) - Copies: 10", 35, "100,-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32,hi!,-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32,100,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! () - Copies: -1");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        java.lang.String str8 = item7.getAuthor();
        item7.setItemId((int) (byte) 10);
        item7.setName(" (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
        java.lang.String str13 = item7.toCsvString();
        java.lang.String str14 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10,, (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10,,1,,hi! () - Copies: 1" + "'", str13, "10,, (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10,,1,,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10" + "'", str14, " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("0,,hi!,,1,hi!,hi!");
        item7.setLocation("10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        item7.setType("0,,hi!,,1,hi!,hi! () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.getType();
        int int18 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setCopiesAvailable(0);
        java.lang.String str12 = item7.toString();
        int int13 = item7.getCopiesAvailable();
        int int14 = item7.getCopiesAvailable();
        item7.setAuthor("1,-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32,hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0,52,,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str12, "hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str13 = item7.getAuthor();
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.toString();
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str13, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str13 = item7.getLocation();
        java.lang.String str14 = item7.toCsvString();
        item7.setType("-1,,hi!,,1,hi!,");
        item7.setType("1,,,,100,-1,,hi!,,1,hi!,hi!,");
        item7.setName("hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 52");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!" + "'", str14, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.toString();
        java.lang.String str18 = item7.getLocation();
        item7.setName("-1,-1,hi!,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        java.lang.String str16 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        gui.Item item7 = new gui.Item((int) '#', "-1,,hi!,,1,hi! () - Copies: 1,hi!", "", " () - Copies: 100", (int) (byte) 100, "hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setCopiesAvailable((-1));
        int int10 = item7.getCopiesAvailable();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
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
        item7.setName("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        java.lang.String str8 = item7.getAuthor();
        int int9 = item7.getItemId();
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! (hi! () - Copies: 1) - Copies: 10" + "'", str10, "hi! (hi! () - Copies: 1) - Copies: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int13 = item7.getItemId();
        item7.setType("hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("0,,hi!,,1,hi!,hi!");
        item7.setType("hi! () - Copies: -1");
        java.lang.String str22 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! (hi! () - Copies: -1) - Copies: 1" + "'", str22, "hi! (hi! () - Copies: -1) - Copies: 1");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        gui.Item item7 = new gui.Item((int) '#', "", "-1,,hi!,,35,hi!,", "-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,", (-1), "", "hi! () - Copies: 1");
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        gui.Item item7 = new gui.Item((int) (byte) 10, "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", "hi!", "-1,,hi!,,35,hi!,", 1, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "");
        java.lang.String str8 = item7.getGenre();
        item7.setCopiesAvailable((int) (short) 0);
        item7.setType("hi! (1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.toCsvString();
        int int17 = item7.getItemId();
        item7.setItemId(10);
        java.lang.String str20 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str16, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10,hi!,hi!,,1,hi!,hi!" + "'", str20, "10,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        gui.Item item7 = new gui.Item(35, "-1,,hi!,,1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", "100,hi!,hi!,,1,hi!,hi!", (int) (byte) 10, "hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: -1");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        gui.Item item7 = new gui.Item((int) (short) -1, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "hi! () - Copies: 1", "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", (int) (short) 1, "0,,hi!,,1,hi!,hi!", "hi!");
        item7.setLocation(" () - Copies: 10");
        java.lang.String str10 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.toCsvString();
        java.lang.String str16 = item7.getName();
        java.lang.Class<?> wildcardClass17 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str15, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setType("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setGenre("32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0");
        int int16 = item7.getCopiesAvailable();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        gui.Item item7 = new gui.Item(1, "hi! () - Copies: 1", "-1,,hi!,,100,hi!,hi! () - Copies: 1", "hi! () - Copies: -1", (int) ' ', "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "hi! () - Copies: -1");
        java.lang.String str8 = item7.toString();
        item7.setType("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str11 = item7.toString();
        java.lang.String str12 = item7.getAuthor();
        item7.setCopiesAvailable(35);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32" + "'", str8, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32" + "'", str11, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!" + "'", str12, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        item7.setCopiesAvailable((int) (byte) -1);
        item7.setName("-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str20 = item7.getLocation();
        java.lang.String str21 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        gui.Item item7 = new gui.Item((int) (short) 0, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 32, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getItemId();
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str11 = item7.toCsvString();
        item7.setGenre("");
        item7.setType("-1,,hi!,,1,0,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 32");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str11, "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setGenre("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable(32);
        java.lang.String str12 = item7.getName();
        item7.setGenre("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,1,0,,hi!,,1,hi!,hi!,");
        item7.setItemId((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        java.lang.String str11 = item7.toCsvString();
        int int12 = item7.getCopiesAvailable();
        item7.setLocation("-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
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
        item7.setName("hi! () - Copies: 1");
        java.lang.String str25 = item7.toString();
        java.lang.String str26 = item7.getLocation();
        item7.setCopiesAvailable((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! () - Copies: 1 () - Copies: 100" + "'", str25, "hi! () - Copies: 1 () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setCopiesAvailable(0);
        java.lang.String str12 = item7.toString();
        java.lang.String str13 = item7.toString();
        int int14 = item7.getItemId();
        java.lang.String str15 = item7.toString();
        int int16 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str12, "hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str13, "hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str15, "hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str13 = item7.toCsvString();
        item7.setGenre("-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        int int16 = item7.getItemId();
        item7.setName("hi! () - Copies: 1 () - Copies: 100");
        item7.setGenre("");
        item7.setCopiesAvailable(1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!" + "'", str13, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        java.lang.String str24 = item7.getGenre();
        java.lang.String str25 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! () - Copies: 1" + "'", str24, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        java.lang.String str8 = item7.getAuthor();
        int int9 = item7.getItemId();
        java.lang.String str10 = item7.getName();
        item7.setGenre("52,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,hi!,10,-1,,,,1,-1,,hi!,,1,hi!,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
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
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
        item7.setAuthor("0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35" + "'", str15, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str19, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        gui.Item item7 = new gui.Item((int) (byte) 100, "hi! () - Copies: 1", "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", (int) (byte) -1, "hi! () - Copies: -1", "-1,,hi!,,1,hi!,hi! () - Copies: 100");
        item7.setType("0,,hi!,hi! () - Copies: 35,32,hi!,hi!");
        item7.setGenre("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        gui.Item item7 = new gui.Item((int) (short) 100, "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", "hi!", "", (int) (short) -1, "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10");
        java.lang.String str8 = item7.getName();
        item7.setGenre("-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        item7.setCopiesAvailable((-1));
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str14 = item7.getName();
        item7.setCopiesAvailable(35);
        java.lang.String str17 = item7.getLocation();
        int int18 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        gui.Item item7 = new gui.Item((int) '4', "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!", "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1", "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", (int) '#', "35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str8 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!" + "'", str8, "35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        java.lang.String str13 = item7.getName();
        java.lang.String str14 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.getLocation();
        java.lang.String str19 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        java.lang.String str8 = item7.getAuthor();
        int int9 = item7.getItemId();
        item7.setCopiesAvailable((int) '#');
        int int12 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        java.lang.String str13 = item7.getName();
        java.lang.String str14 = item7.toString();
        item7.setItemId(35);
        item7.setItemId((int) (short) 1);
        java.lang.String str19 = item7.toString();
        java.lang.String str20 = item7.getGenre();
        item7.setCopiesAvailable((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 35" + "'", str14, "hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 35" + "'", str19, "hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        java.lang.String str13 = item7.toCsvString();
        java.lang.Class<?> wildcardClass14 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str13, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setGenre("32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        gui.Item item7 = new gui.Item((int) (byte) -1, " () - Copies: -1", "-1,,hi!,,1,hi!,hi!", "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", (-1), "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getAuthor();
        item7.setItemId((int) (byte) 10);
        java.lang.String str11 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str8, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " () - Copies: -1" + "'", str11, " () - Copies: -1");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.toString();
        java.lang.String str19 = item7.toString();
        item7.setAuthor("");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        java.lang.String str24 = item7.getAuthor();
        java.lang.String str25 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str18, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str19, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str25, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        gui.Item item7 = new gui.Item(32, "-1,,hi!,,1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1 () - Copies: 10", "0,,hi!,,1,hi!, () - Copies: 10", 97, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1", "-1,,hi!,,1,hi! () - Copies: -1,hi!");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getLocation();
        int int18 = item7.getItemId();
        java.lang.String str19 = item7.toString();
        item7.setType("hi! () - Copies: 32");
        java.lang.String str22 = item7.getType();
        java.lang.String str23 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 1" + "'", str19, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 32" + "'", str22, "hi! () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str23, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        item7.setCopiesAvailable(35);
        item7.setLocation("-1,,hi!,hi!,100,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        java.lang.String str13 = item7.getAuthor();
        int int14 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str13, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
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
        item7.setType("hi!");
        item7.setLocation("");
        item7.setLocation("97,,-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str28 = item7.getType();
        java.lang.String str29 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        item7.setItemId((int) ' ');
        item7.setLocation("hi!");
        item7.setAuthor("-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
        java.lang.String str14 = item7.toString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setItemId(32);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        gui.Item item7 = new gui.Item((int) (short) -1, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35", "-1,,hi!,,1,hi!,", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (byte) 10, "0,,hi!,,1,hi!,hi!", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.getAuthor();
        java.lang.String str10 = item7.getName();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str9, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!," + "'", str10, "-1,,hi!,,1,hi!,");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        java.lang.String str12 = item7.toCsvString();
        int int13 = item7.getItemId();
        item7.setName("32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setLocation("-1,,hi!,,1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str17 = item7.getType();
        java.lang.Class<?> wildcardClass18 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        int int17 = item7.getItemId();
        int int18 = item7.getCopiesAvailable();
        java.lang.String str19 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        java.lang.String str15 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        int int23 = item7.getItemId();
        java.lang.String str24 = item7.getName();
        java.lang.String str25 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setCopiesAvailable((int) (short) 0);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.toCsvString();
        item7.setCopiesAvailable((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,35,hi!,hi!" + "'", str15, "-1,,hi!,,35,hi!,hi!");
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("");
        java.lang.Class<?> wildcardClass15 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        gui.Item item7 = new gui.Item((int) (short) -1, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "hi! () - Copies: 1", "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", (int) (short) 1, "0,,hi!,,1,hi!,hi!", "hi!");
        java.lang.String str8 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str8, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getLocation();
        int int18 = item7.getItemId();
        java.lang.String str19 = item7.getName();
        item7.setGenre("-1,,hi!,,100,hi!,hi! () - Copies: 1");
        item7.setAuthor("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, (hi! () - Copies: -1) - Copies: -1");
        java.lang.String str24 = item7.toString();
        item7.setItemId((int) '#');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! () - Copies: 1" + "'", str24, "hi! () - Copies: 1");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getLocation();
        item7.setAuthor("0,,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.getGenre();
        item7.setName("hi! (-1,hi!,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.Class<?> wildcardClass22 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getLocation();
        java.lang.String str12 = item7.toString();
        item7.setCopiesAvailable(0);
        item7.setGenre("-1,,,hi!,100,hi!,hi! () - Copies: 1");
        item7.setName("35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!");
        item7.setCopiesAvailable((int) (short) 1);
        int int21 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        gui.Item item7 = new gui.Item(10, " (hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0) - Copies: -1", "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,", "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", (int) (short) 100, "-1,,hi!,,1,hi!,hi! (hi! () - Copies: 1 (hi!) - Copies: 0) - Copies: 1", "-1,,hi!,,1,hi! () - Copies: 35,");
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
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
        item7.setName("hi! () - Copies: -1");
        item7.setCopiesAvailable((int) (short) 1);
        item7.setAuthor("32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,52,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getLocation();
        int int18 = item7.getItemId();
        int int19 = item7.getCopiesAvailable();
        item7.setType("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52");
        item7.setCopiesAvailable((int) (short) 0);
        java.lang.String str24 = item7.getLocation();
        java.lang.String str25 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str24, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52" + "'", str25, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getLocation();
        item7.setCopiesAvailable((int) (short) 10);
        java.lang.String str11 = item7.getType();
        item7.setName("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        java.lang.String str14 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1," + "'", str14, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setAuthor("hi!");
        item7.setType("hi!");
        item7.setItemId(0);
        java.lang.String str18 = item7.getName();
        item7.setItemId((int) (short) 100);
        item7.setItemId((int) 'a');
        java.lang.String str23 = item7.getLocation();
        item7.setGenre("-1,,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setItemId(1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        gui.Item item7 = new gui.Item((int) (short) 0, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 32, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getItemId();
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str11 = item7.toCsvString();
        java.lang.String str12 = item7.getAuthor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str11, "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!" + "'", str12, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setName("0,,hi!,,1,hi!,hi!");
        item7.setType("100,hi! () - Copies: 1 (hi!) - Copies: 0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,10,hi! () - Copies: 1 (hi!) - Copies: 0,0,,hi!,,32,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str16 = item7.toCsvString();
        java.lang.String str17 = item7.toString();
        item7.setAuthor("hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35");
        java.lang.String str20 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: -1" + "'", str17, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) '4');
        item7.setName("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str22 = item7.getAuthor();
        item7.setLocation("");
        java.lang.String str25 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 () - Copies: 52" + "'", str25, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 () - Copies: 52");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        gui.Item item7 = new gui.Item((int) (byte) 10, "52,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,10,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 1 (hi!) - Copies: 0", " () - Copies: 1", "-1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!", 0, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
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
        java.lang.String str21 = item7.getLocation();
        int int22 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 32" + "'", str19, "hi! () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getName();
        item7.setLocation("-1,,hi!,,1,0,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setLocation(" () - Copies: 10");
        java.lang.String str10 = item7.getAuthor();
        java.lang.String str11 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str10, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " () - Copies: 10" + "'", str11, " () - Copies: 10");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        item7.setCopiesAvailable((int) (byte) -1);
        item7.setItemId(0);
        java.lang.String str20 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0,,hi!,,-1,hi!,hi!" + "'", str20, "0,,hi!,,-1,hi!,hi!");
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.getLocation();
        item7.setGenre(" () - Copies: 10");
        java.lang.String str18 = item7.toCsvString();
        java.lang.String str19 = item7.getType();
        item7.setName("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,,hi!,,1,hi!, () - Copies: 10" + "'", str18, "0,,hi!,,1,hi!, () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        gui.Item item7 = new gui.Item(97, "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52", "hi! (0,,hi!,,1,hi!,hi!) - Copies: 1", 100, "100,hi!,hi! () - Copies: 1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", "-1,,hi!,hi!,100,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        item7.setCopiesAvailable((int) '#');
        item7.setAuthor("-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.Class<?> wildcardClass20 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        gui.Item item7 = new gui.Item(0, "1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1", "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", (int) '4', "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str8, "1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.toCsvString();
        java.lang.String str16 = item7.toCsvString();
        item7.setName("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        int int19 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str15, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str16, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
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
        java.lang.String str20 = item7.toCsvString();
        item7.setType("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setGenre("32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str17, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 1" + "'", str18, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str20, "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        gui.Item item7 = new gui.Item((int) (byte) 1, "0,,hi!,,32,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,hi!,,-1,hi!,", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 52", (int) (byte) 0, "hi! () - Copies: 35", "97,,hi!,,1,hi!,hi! (hi! () - Copies: 32) - Copies: 100");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        gui.Item item7 = new gui.Item((int) (byte) 100, "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1", (-1), "-1,,hi!,,1,hi!,hi! () - Copies: 100", "32,,,,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,,hi!,100,hi!,hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 10);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("hi! () - Copies: 1");
        item7.setItemId(100);
        java.lang.String str21 = item7.getName();
        item7.setItemId((int) (short) 1);
        int int24 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        gui.Item item7 = new gui.Item(1, "hi! () - Copies: 1", "-1,,hi!,,100,hi!,hi! () - Copies: 1", "hi! () - Copies: -1", (int) ' ', "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "hi! () - Copies: -1");
        java.lang.String str8 = item7.toString();
        java.lang.String str9 = item7.toCsvString();
        java.lang.Class<?> wildcardClass10 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32" + "'", str8, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1,hi! () - Copies: 1,-1,,hi!,,100,hi!,hi! () - Copies: 1,hi! () - Copies: -1,32,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi! () - Copies: -1" + "'", str9, "1,hi! () - Copies: 1,-1,,hi!,,100,hi!,hi! () - Copies: 1,hi! () - Copies: -1,32,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi! () - Copies: -1");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        gui.Item item7 = new gui.Item((int) (byte) -1, "-1,,hi!,,100,hi!,hi! () - Copies: 1", "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,-1,,hi!,,1,hi!,hi! () - Copies: 100", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1", (int) (short) 100, "32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,97,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,", "35,hi!,hi!,,1,hi!,hi!");
        item7.setLocation("hi! (hi!) - Copies: 1");
        item7.setItemId(1);
        java.lang.String str12 = item7.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str12, "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,-1,,hi!,,1,hi!,hi! () - Copies: 100");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
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
        int int22 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        gui.Item item7 = new gui.Item((int) '#', "-1,,hi!,,1,hi! () - Copies: 1,hi!", "", " () - Copies: 100", (int) (byte) 100, "hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str8 = item7.getAuthor();
        int int9 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.toString();
        java.lang.String str19 = item7.toString();
        java.lang.String str20 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str18, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str19, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        item7.setItemId(97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
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
        item7.setType("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        java.lang.String str24 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1," + "'", str24, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getAuthor();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        gui.Item item7 = new gui.Item((int) (short) 0, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi!", "-1,,hi!,,1,hi!,hi!", (int) (short) 100, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getLocation();
        java.lang.String str9 = item7.getGenre();
        item7.setAuthor("-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1");
        java.lang.String str12 = item7.getAuthor();
        item7.setGenre("1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,,100,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str9, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1" + "'", str12, "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1");
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
        java.lang.String str21 = item7.toCsvString();
        item7.setLocation("32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        java.lang.Class<?> wildcardClass21 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str18, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str19, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        int int16 = item7.getCopiesAvailable();
        java.lang.String str17 = item7.getLocation();
        item7.setGenre("32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,");
        item7.setType("32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
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
        int int24 = item7.getCopiesAvailable();
        java.lang.String str25 = item7.getLocation();
        java.lang.String str26 = item7.getName();
        int int27 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str26, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str16 = item7.toString();
        java.lang.String str17 = item7.getType();
        item7.setGenre("hi! () - Copies: 1");
        int int20 = item7.getItemId();
        item7.setName("0,,hi!,0,,hi!,,1,hi!,hi!,32,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getType();
        int int15 = item7.getItemId();
        java.lang.String str16 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        item7.setCopiesAvailable(1);
        item7.setCopiesAvailable((int) (short) 0);
        java.lang.String str25 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str20, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! () - Copies: 1" + "'", str25, "hi! () - Copies: 1");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setName("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.getType();
        item7.setGenre("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) 'a');
        java.lang.String str21 = item7.getGenre();
        java.lang.String str22 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str15, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 97" + "'", str22, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 97");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        gui.Item item7 = new gui.Item((int) (byte) 1, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!", 35, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,100,hi!,-1,,hi!,,1,hi!,hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!) - Copies: 100");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        java.lang.String str10 = item7.getGenre();
        java.lang.String str11 = item7.getAuthor();
        java.lang.String str12 = item7.getType();
        java.lang.String str13 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str11, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setName("hi!");
        int int14 = item7.getItemId();
        java.lang.String str15 = item7.getType();
        item7.setType("");
        item7.setCopiesAvailable((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        gui.Item item7 = new gui.Item(52, "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi!,hi!", 100, "", " () - Copies: 10");
        java.lang.String str8 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getLocation();
        item7.setAuthor("0,,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.toCsvString();
        java.lang.String str20 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!" + "'", str19, "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getType();
        item7.setAuthor("");
        java.lang.String str19 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str16 = item7.toString();
        java.lang.String str17 = item7.getType();
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        int int20 = item7.getCopiesAvailable();
        item7.setCopiesAvailable(10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        gui.Item item7 = new gui.Item((int) (byte) 1, "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,hi! () - Copies: 1,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!", 1, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "0,,hi!,,1,hi!, () - Copies: 10");
        java.lang.String str8 = item7.getGenre();
        java.lang.String str9 = item7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,,hi!,,1,hi!, () - Copies: 10" + "'", str8, "0,,hi!,,1,hi!, () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi! (0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str9, "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi! (0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        int int15 = item7.getCopiesAvailable();
        int int16 = item7.getCopiesAvailable();
        java.lang.String str17 = item7.getName();
        item7.setLocation("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        int int20 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.getGenre();
        int int18 = item7.getItemId();
        java.lang.String str19 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
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
        java.lang.String str22 = item7.getName();
        item7.setLocation(" () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        gui.Item item7 = new gui.Item((int) (byte) 0, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,-1,,hi!,,1,hi!,hi!,,52,hi!,hi! () - Copies: 1", "-1,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", (-1), "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1", "0,,hi!,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str12 = item7.toCsvString();
        item7.setCopiesAvailable(0);
        item7.setItemId((int) (short) 1);
        item7.setItemId((int) 'a');
        java.lang.String str19 = item7.getAuthor();
        item7.setItemId(32);
        item7.setItemId((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str19, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
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
        item7.setName("1,,hi!,,1,-1,,hi!,,1,hi!,hi!, (hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        java.lang.String str8 = item7.getAuthor();
        java.lang.String str9 = item7.getName();
        item7.setLocation("hi! () - Copies: 100");
        java.lang.String str12 = item7.getGenre();
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
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
        java.lang.String str24 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str19, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! () - Copies: 1" + "'", str24, "hi! () - Copies: 1");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
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
        item7.setType("-1,,hi!,,1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        gui.Item item7 = new gui.Item(32, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,1,hi!,", "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", (int) 'a', "", "-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getLocation();
        item7.setLocation("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!" + "'", str8, "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        gui.Item item7 = new gui.Item((-1), "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1", " () - Copies: 10", (int) (byte) 0, "-1,,hi!,,1,hi!,hi!", "-1,,hi!,,1,hi! () - Copies: 35,");
        java.lang.String str8 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        gui.Item item7 = new gui.Item((int) (byte) 100, "-1,,hi!,,1,-1,,hi!,,1,hi!,hi! () - Copies: 100,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!", "-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32", 0, "32,,hi!,,1,hi! () - Copies: 1,hi!", "hi! (hi!) - Copies: 1");
        int int8 = item7.getCopiesAvailable();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        int int11 = item7.getCopiesAvailable();
        int int12 = item7.getCopiesAvailable();
        int int13 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.toCsvString();
        item7.setItemId((int) '#');
        item7.setAuthor(" () - Copies: 1");
        item7.setAuthor("1,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,,32, () - Copies: 100,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        java.lang.String str18 = item7.toCsvString();
        item7.setCopiesAvailable((int) 'a');
        java.lang.String str21 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1" + "'", str18, "-1,,hi!,,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 1" + "'", str21, "hi! () - Copies: 1");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.toString();
        item7.setGenre("-1,,hi!,,35,hi!,");
        java.lang.String str21 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str18, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,35,hi!," + "'", str21, "-1,,hi!,,35,hi!,");
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        gui.Item item7 = new gui.Item((int) (byte) 0, "hi! () - Copies: -1", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32", "-1,,-1,,hi!,hi!,100,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!,0,hi!,hi! () - Copies: 1", 0, "32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!", "");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str15 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
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
        item7.setName("hi! () - Copies: -1");
        item7.setCopiesAvailable((int) (short) 1);
        item7.setLocation(" () - Copies: 10");
        item7.setCopiesAvailable(1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
        item7.setCopiesAvailable((int) 'a');
        item7.setLocation("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 1" + "'", str22, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
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
        java.lang.Class<?> wildcardClass26 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str16 = item7.toString();
        item7.setGenre("");
        int int19 = item7.getItemId();
        java.lang.String str20 = item7.getLocation();
        int int21 = item7.getItemId();
        java.lang.String str22 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        gui.Item item7 = new gui.Item((int) (short) -1, "hi! () - Copies: 1 () - Copies: 100", "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!", "", (int) '#', "0,,hi!,hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0,1,hi!,-1,,hi!,,1,hi!,hi!", "hi! () - Copies: 1 (hi!) - Copies: 35");
        item7.setName("-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getGenre();
        item7.setCopiesAvailable((int) (byte) -1);
        java.lang.String str19 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getType();
        int int17 = item7.getItemId();
        java.lang.String str18 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
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
        int int22 = item7.getCopiesAvailable();
        int int23 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 1" + "'", str21, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        item7.setAuthor("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        java.lang.String str18 = item7.getGenre();
        item7.setName("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 0");
        item7.setType("-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getType();
        item7.setItemId((int) (short) -1);
        item7.setType(" () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setName("hi!");
        java.lang.String str14 = item7.getName();
        item7.setType("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setLocation("1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 1,0,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        int int9 = item7.getItemId();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
        java.lang.String str12 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.getName();
        java.lang.String str10 = item7.getAuthor();
        item7.setGenre("-1,,hi!,,1,hi!,hi! (hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35) - Copies: 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        item7.setName("");
        int int10 = item7.getCopiesAvailable();
        item7.setItemId(32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
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
        java.lang.String str25 = item7.getLocation();
        java.lang.String str26 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str22, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str26, "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str15 = item7.toString();
        item7.setName("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int18 = item7.getCopiesAvailable();
        java.lang.String str19 = item7.getType();
        java.lang.String str20 = item7.getLocation();
        java.lang.String str21 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35" + "'", str15, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str19, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getLocation();
        item7.setCopiesAvailable((int) (byte) 0);
        java.lang.String str19 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str20 = item7.getLocation();
        item7.setLocation("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("hi! () - Copies: 1");
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getName();
        java.lang.String str10 = item7.toString();
        item7.setItemId((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " () - Copies: 10" + "'", str10, " () - Copies: 10");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setName("97,,-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        int int8 = item7.getCopiesAvailable();
        item7.setAuthor("-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        int int11 = item7.getCopiesAvailable();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        java.lang.String str14 = item7.getLocation();
        java.lang.String str15 = item7.getName();
        int int16 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        gui.Item item7 = new gui.Item((int) (short) -1, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!", 0, "-1,,hi!,,1,hi!,hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) (short) -1);
        int int10 = item7.getCopiesAvailable();
        java.lang.String str11 = item7.getLocation();
        java.lang.String str12 = item7.getAuthor();
        item7.setItemId(0);
        int int15 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str11, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str12 = item7.toCsvString();
        item7.setCopiesAvailable(0);
        int int15 = item7.getCopiesAvailable();
        int int16 = item7.getCopiesAvailable();
        int int17 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
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
        java.lang.String str22 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        gui.Item item7 = new gui.Item((int) (byte) 1, "hi! () - Copies: 0", " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52", (int) ' ', "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1", "hi! () - Copies: -1");
        item7.setCopiesAvailable(97);
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
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
        int int24 = item7.getItemId();
        item7.setCopiesAvailable(10);
        java.lang.String str27 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + " () - Copies: 10" + "'", str27, " () - Copies: 10");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
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
        java.lang.String str28 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str23, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setCopiesAvailable((-1));
        item7.setName("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        java.lang.String str22 = item7.getLocation();
        java.lang.String str23 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! () - Copies: 1" + "'", str23, "hi! () - Copies: 1");
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,,hi!,100,hi!,hi! () - Copies: 1");
        item7.setGenre("0,,hi!,,32,hi!,hi!");
        java.lang.String str18 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str18, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
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
        java.lang.Class<?> wildcardClass19 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        gui.Item item7 = new gui.Item((int) (byte) 0, "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", "97,,-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!,,1,hi!,hi!", "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,", (int) (short) 10, "1,,,,100,-1,,hi!,,1,hi!,hi!,", "32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        java.lang.String str14 = item7.getLocation();
        int int15 = item7.getCopiesAvailable();
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getAuthor();
        item7.setCopiesAvailable(0);
        java.lang.String str20 = item7.getName();
        item7.setLocation("-1,,hi!,,1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        gui.Item item7 = new gui.Item((int) ' ', "-1,,hi!,,100,hi!,hi! () - Copies: 1", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "hi! () - Copies: 1", (int) (byte) 100, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "hi! () - Copies: -1");
        java.lang.String str8 = item7.toCsvString();
        item7.setName("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str11 = item7.toString();
        item7.setType("32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1" + "'", str8, "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,hi!,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1) - Copies: 100" + "'", str11, "-1,hi!,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1) - Copies: 100");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        gui.Item item7 = new gui.Item((int) (byte) 0, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 52", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,", "-1,-1,hi!,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,,0,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", 32, "-1,,hi!,hi!,100,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "35,,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!");
        java.lang.String str8 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 52" + "'", str8, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 52");
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setLocation(" () - Copies: 10");
        java.lang.String str10 = item7.toString();
        int int11 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 35" + "'", str10, "hi! () - Copies: 1 (hi!) - Copies: 35");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        gui.Item item7 = new gui.Item((int) (short) -1, "32,-1,,hi!,,1,hi!,hi! () - Copies: 100,,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,100,-1,,hi!,,1,hi!,hi!,", "1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,,100,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!", 0, "", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setItemId(10);
        item7.setItemId((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        gui.Item item7 = new gui.Item((int) (byte) 100, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", " () - Copies: 100", "", (int) 'a', "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        item7.setCopiesAvailable(10);
        item7.setName("hi! () - Copies: -1");
        item7.setAuthor("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("hi! () - Copies: 1");
        item7.setItemId(100);
        java.lang.String str21 = item7.getName();
        item7.setItemId((int) (short) 1);
        java.lang.String str24 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setName("hi!");
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.getName();
        item7.setAuthor("-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
        java.lang.String str18 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        int int18 = item7.getCopiesAvailable();
        item7.setName("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setGenre("-1,,hi!,,52,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.getAuthor();
        item7.setGenre(" () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        java.lang.String str10 = item7.toCsvString();
        java.lang.String str11 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str10, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setCopiesAvailable(0);
        item7.setType("35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) (byte) 0);
        item7.setGenre("-1,,hi!,,1,hi!,");
        item7.setGenre("hi! () - Copies: -1");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (short) 10);
        java.lang.String str10 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 10" + "'", str10, "hi! () - Copies: 10");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setAuthor("hi! () - Copies: -1");
        java.lang.String str13 = item7.getGenre();
        java.lang.Class<?> wildcardClass14 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("hi! () - Copies: 1");
        item7.setType("hi! () - Copies: 32");
        java.lang.String str12 = item7.getGenre();
        item7.setType("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        java.lang.String str15 = item7.getGenre();
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str15, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,0,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        gui.Item item7 = new gui.Item((-1), "-1,hi!,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1) - Copies: 100", "0,,hi!,,32,hi!,hi! (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 32", "100,,hi!,,32,hi!,hi!", (int) (short) 10, "100,hi!,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,hi! () - Copies: 1,hi!", "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 0");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        gui.Item item7 = new gui.Item((int) '#', "hi! (hi!) - Copies: 1", "hi! () - Copies: 35", "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", (int) ' ', "", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str10, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35,hi! (hi!) - Copies: 1,hi! () - Copies: 35,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!" + "'", str11, "35,hi! (hi!) - Copies: 1,hi! () - Copies: 35,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
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
        java.lang.String str21 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1" + "'", str20, "-1,,hi!,,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setLocation("10,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        java.lang.String str8 = item7.toString();
        item7.setName("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.Class<?> wildcardClass11 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 35" + "'", str8, "hi! () - Copies: 1 (hi!) - Copies: 35");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setCopiesAvailable(0);
        java.lang.String str12 = item7.toString();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str12, "hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
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
        java.lang.String str22 = item7.getGenre();
        item7.setGenre("35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!");
        java.lang.Class<?> wildcardClass25 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
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
        item7.setLocation("hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1");
        item7.setLocation("-1,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str15, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str16, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.toCsvString();
        int int17 = item7.getItemId();
        item7.setItemId(10);
        item7.setName("-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,-1,,hi!,,1,hi!,hi! () - Copies: 100");
        java.lang.String str22 = item7.getType();
        int int23 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str16, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getCopiesAvailable();
        java.lang.String str18 = item7.getGenre();
        java.lang.String str19 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setName("hi! () - Copies: 1");
        int int18 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) '#');
        java.lang.String str21 = item7.getType();
        java.lang.String str22 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 1 () - Copies: 35" + "'", str22, "hi! () - Copies: 1 () - Copies: 35");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getName();
        item7.setGenre(" () - Copies: 100");
        item7.setLocation("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        item7.setGenre("1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1 () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setAuthor("hi!");
        item7.setType("hi!");
        item7.setItemId(0);
        java.lang.String str18 = item7.getName();
        item7.setItemId((int) (short) 100);
        item7.setItemId((int) 'a');
        java.lang.String str23 = item7.getLocation();
        item7.setType("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
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
        item7.setType(" (hi!) - Copies: 1");
        item7.setItemId((-1));
        java.lang.String str26 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1, (hi!) - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str26, "-1, (hi!) - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        item7.setCopiesAvailable((-1));
        item7.setType("0,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) 1);
        java.lang.String str16 = item7.toString();
        java.lang.String str17 = item7.toCsvString();
        int int18 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! (0,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str16, "hi! (0,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!," + "'", str17, "-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
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
        java.lang.String str21 = item7.getAuthor();
        item7.setLocation("hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str20, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,,hi!,,1,hi!,", (-1), "", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) '#');
        item7.setType("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setAuthor("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        gui.Item item7 = new gui.Item((int) '#', "-1,,hi!,,1,hi! () - Copies: 1,hi!", "", " () - Copies: 100", (int) (byte) 100, "hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str8 = item7.getAuthor();
        java.lang.String str9 = item7.getType();
        item7.setGenre("hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str9, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("0,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str22 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str22, "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
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
        item7.setGenre("-1,,hi!,,1,hi!,hi! () - Copies: 100");
        java.lang.String str26 = item7.toString();
        java.lang.String str27 = item7.getAuthor();
        java.lang.String str28 = item7.toCsvString();
        java.lang.Class<?> wildcardClass29 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!, (-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str26, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!, (-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str28, "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
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
        item7.setLocation("-1,-1,hi!,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0,,hi!,,32,hi!,hi!" + "'", str19, "0,,hi!,,32,hi!,hi!");
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        gui.Item item7 = new gui.Item((int) '#', "-1,,hi!,,1,hi! () - Copies: 1,hi!", "", " () - Copies: 100", (int) (byte) 100, "hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str8 = item7.getType();
        int int9 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str8, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        gui.Item item7 = new gui.Item(10, "-1,,,,1,-1,,hi!,,1,hi!,hi!,", "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1", "-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (byte) 0, "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1 (-1,,,,1,-1,,hi!,,1,hi!,hi!,) - Copies: 0" + "'", str8, "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1 (-1,,,,1,-1,,hi!,,1,hi!,hi!,) - Copies: 0");
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        item7.setAuthor("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getItemId();
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setGenre("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str22 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        java.lang.String str14 = item7.getLocation();
        int int15 = item7.getCopiesAvailable();
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getAuthor();
        item7.setCopiesAvailable(0);
        java.lang.String str20 = item7.getName();
        java.lang.String str21 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        gui.Item item7 = new gui.Item(0, "hi! () - Copies: -1", "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", (int) (short) -1, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,", "0,,hi!,,1,hi!,hi!");
        item7.setName("-1,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str10 = item7.getType();
        java.lang.String str11 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: -1" + "'", str10, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str11, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        item7.setItemId(35);
        int int19 = item7.getItemId();
        int int20 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
        item7.setCopiesAvailable((int) (byte) -1);
        item7.setLocation("-1,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        gui.Item item7 = new gui.Item((int) '#', "-1,,hi!,,1,hi! () - Copies: 1,hi!", "", " () - Copies: 100", (int) (byte) 100, "hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setType("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getLocation();
        item7.setCopiesAvailable((int) (short) 10);
        java.lang.String str11 = item7.getType();
        item7.setName("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        java.lang.String str14 = item7.getLocation();
        int int15 = item7.getCopiesAvailable();
        java.lang.String str16 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1," + "'", str16, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        int int17 = item7.getItemId();
        java.lang.String str18 = item7.getType();
        java.lang.String str19 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
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
        int int33 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! () - Copies: 1" + "'", str26, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1" + "'", str27, "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!," + "'", str32, "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toString();
        java.lang.String str15 = item7.toString();
        java.lang.String str16 = item7.getGenre();
        java.lang.String str17 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 35" + "'", str14, "hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 35" + "'", str15, "hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.toString();
        item7.setItemId((int) 'a');
        java.lang.String str18 = item7.getLocation();
        item7.setGenre("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        gui.Item item7 = new gui.Item((int) (short) 0, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi!", "-1,,hi!,,1,hi!,hi!", (int) (short) 100, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!");
        item7.setType("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setGenre("32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        item7.setAuthor("1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str14 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        gui.Item item7 = new gui.Item(1, "hi! () - Copies: 1", "-1,,hi!,,100,hi!,hi! () - Copies: 1", "hi! () - Copies: -1", (int) ' ', "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "hi! () - Copies: -1");
        java.lang.String str8 = item7.toString();
        item7.setType("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str11 = item7.getName();
        item7.setType("-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
        item7.setLocation("1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int16 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32" + "'", str8, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1" + "'", str11, "-1,,hi!,,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
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
        java.lang.String str24 = item7.getName();
        item7.setItemId((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
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
        java.lang.String str26 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str22, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str25, "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10,-1,,hi!,,1,hi!,hi!,35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!" + "'", str26, "10,-1,,hi!,,1,hi!,hi!,35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        gui.Item item7 = new gui.Item((int) (byte) -1, " () - Copies: -1", "-1,,hi!,,1,hi!,hi!", "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", (-1), "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getAuthor();
        java.lang.String str9 = item7.getName();
        java.lang.Class<?> wildcardClass10 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str8, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str9, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
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
        item7.setItemId(0);
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str27 = item7.getGenre();
        item7.setCopiesAvailable((int) '#');
        java.lang.String str30 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str27, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str30, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
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
        item7.setItemId(1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str10 = item7.getType();
        java.lang.String str11 = item7.toCsvString();
        item7.setCopiesAvailable((-1));
        java.lang.String str14 = item7.getAuthor();
        java.lang.String str15 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,52,hi!," + "'", str11, "-1,,hi!,,52,hi!,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
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
        int int28 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! () - Copies: 1" + "'", str25, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        java.lang.String str17 = item7.getLocation();
        item7.setAuthor("0,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
        item7.setType("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getType();
        item7.setItemId(1);
        item7.setGenre("0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        java.lang.String str17 = item7.getAuthor();
        item7.setGenre(" (hi!) - Copies: 1");
        java.lang.String str20 = item7.toCsvString();
        java.lang.String str21 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1,,hi!,,1,-1,,hi!,,1,hi!,hi!, (hi!) - Copies: 1" + "'", str20, "1,,hi!,,1,-1,,hi!,,1,hi!,hi!, (hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "1,,hi!,,1,-1,,hi!,,1,hi!,hi!, (hi!) - Copies: 1" + "'", str21, "1,,hi!,,1,-1,,hi!,,1,hi!,hi!, (hi!) - Copies: 1");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
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
        java.lang.String str23 = item7.getAuthor();
        java.lang.String str24 = item7.getName();
        item7.setGenre("1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str15, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str16, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! () - Copies: 1" + "'", str23, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str24, "-1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
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
        java.lang.String str21 = item7.getGenre();
        item7.setType("-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!");
        item7.setName("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) (byte) 10);
        java.lang.String str28 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 1" + "'", str21, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi! () - Copies: 1" + "'", str28, "hi! () - Copies: 1");
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: -1");
        java.lang.String str19 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        java.lang.String str8 = item7.getType();
        int int9 = item7.getItemId();
        java.lang.String str10 = item7.getGenre();
        item7.setGenre("1,,,,100,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str13 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str13, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        int int18 = item7.getItemId();
        java.lang.String str19 = item7.getAuthor();
        item7.setGenre("-1,,,,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str22 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        item7.setLocation("0,,hi!,,1,hi!,hi!");
        java.lang.String str20 = item7.getAuthor();
        item7.setItemId(32);
        java.lang.Class<?> wildcardClass23 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        int int9 = item7.getCopiesAvailable();
        java.lang.String str10 = item7.getName();
        int int11 = item7.getItemId();
        java.lang.String str12 = item7.getAuthor();
        item7.setAuthor("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        int int15 = item7.getCopiesAvailable();
        java.lang.String str16 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str16, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getName();
        java.lang.String str17 = item7.toCsvString();
        int int18 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!" + "'", str17, "-1,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        gui.Item item7 = new gui.Item(0, "hi! () - Copies: -1", "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", (int) (short) -1, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,", "0,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getGenre();
        item7.setAuthor("hi! (hi! () - Copies: -1) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str8, "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        int int10 = item7.getCopiesAvailable();
        java.lang.String str11 = item7.toCsvString();
        item7.setType("-1,hi! () - Copies: 1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!");
        item7.setGenre("-1,,hi!,,1,hi!,hi! (hi! () - Copies: 1 (hi!) - Copies: 0) - Copies: 1");
        int int16 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str11, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,-1,,hi!,,1,hi!,hi!,,100,52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,52,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 0", (-1), "0,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!, () - Copies: -1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1,10,-1,,,,1,-1,,hi!,,1,hi!,hi!,,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35", "52,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,,-1,hi! () - Copies: 1 (hi!) - Copies: 0,hi! () - Copies: 1 (hi!) - Copies: 0");
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toString();
        java.lang.String str15 = item7.toString();
        item7.setGenre("1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 35" + "'", str14, "hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 35" + "'", str15, "hi! () - Copies: 35");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getCopiesAvailable();
        item7.setLocation("-1,,hi!,,1,0,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
        java.lang.String str20 = item7.getLocation();
        java.lang.String str21 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        gui.Item item7 = new gui.Item(52, "", "-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", 35, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str8 = item7.getAuthor();
        item7.setAuthor("-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        item7.setGenre("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 () - Copies: 52");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setGenre("");
        item7.setCopiesAvailable((int) (byte) -1);
        item7.setAuthor("hi! () - Copies: 1 (hi!) - Copies: 0");
        item7.setName("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setLocation("");
        item7.setCopiesAvailable((int) ' ');
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        item7.setGenre("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        int int10 = item7.getItemId();
        java.lang.String str11 = item7.getName();
        java.lang.String str12 = item7.getGenre();
        java.lang.String str13 = item7.getAuthor();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str12, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str13, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        java.lang.String str13 = item7.getName();
        item7.setType("");
        item7.setGenre("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi! () - Copies: 100");
        java.lang.String str20 = item7.getGenre();
        java.lang.String str21 = item7.getGenre();
        java.lang.String str22 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str21, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        gui.Item item7 = new gui.Item((int) ' ', " () - Copies: -1", "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,1,hi!,", (int) (byte) 1, "hi! () - Copies: -1", "hi! () - Copies: 1 (hi!) - Copies: 35");
        item7.setName("100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getGenre();
        java.lang.String str11 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 35" + "'", str10, "hi! () - Copies: 1 (hi!) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi! ( () - Copies: -1) - Copies: 1" + "'", str11, "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi! ( () - Copies: -1) - Copies: 1");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        item7.setLocation("hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.getName();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
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
        int int25 = item7.getCopiesAvailable();
        java.lang.String str26 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " () - Copies: 100" + "'", str24, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! () - Copies: -1" + "'", str26, "hi! () - Copies: -1");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
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
        item7.setLocation("-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
        int int24 = item7.getCopiesAvailable();
        int int25 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        gui.Item item7 = new gui.Item((int) (short) 100, "0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", (int) 'a', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! (hi! () - Copies: 1) - Copies: 10");
        java.lang.String str8 = item7.getAuthor();
        item7.setLocation("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,1,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str8, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getLocation();
        java.lang.String str12 = item7.toString();
        item7.setCopiesAvailable(0);
        item7.setGenre("-1,,,hi!,100,hi!,hi! () - Copies: 1");
        item7.setName("35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!");
        item7.setCopiesAvailable((int) (short) 1);
        java.lang.String str21 = item7.getGenre();
        int int22 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str21, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getName();
        int int16 = item7.getCopiesAvailable();
        int int17 = item7.getItemId();
        item7.setCopiesAvailable((int) '4');
        item7.setLocation("1,,hi!,,32,hi!,hi!");
        item7.setCopiesAvailable((-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        java.lang.String str11 = item7.getAuthor();
        java.lang.String str12 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        gui.Item item7 = new gui.Item((int) '#', "-1,,hi!,,1,hi! () - Copies: 1,hi!", "", " () - Copies: 100", (int) (byte) 100, "hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setCopiesAvailable((-1));
        item7.setLocation("hi! (hi!) - Copies: 1");
        java.lang.String str12 = item7.getType();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str12, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        gui.Item item7 = new gui.Item((int) (byte) -1, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi! () - Copies: 1", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", 100, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setName("-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
        item7.setType("hi! () - Copies: 1 () - Copies: 100");
        item7.setAuthor("32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,,52,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setCopiesAvailable(0);
        item7.setItemId((int) 'a');
        item7.setAuthor("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        int int12 = item7.getCopiesAvailable();
        java.lang.Class<?> wildcardClass13 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        java.lang.String str10 = item7.getGenre();
        item7.setLocation("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str13 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        java.lang.String str16 = item7.getType();
        item7.setName("1,-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32,hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0,52,,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str13, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
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
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
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
        item7.setCopiesAvailable((int) (byte) 1);
        item7.setGenre("-1,,hi!,,100,hi!,hi! () - Copies: 1");
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
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getCopiesAvailable();
        item7.setItemId(100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toString();
        item7.setGenre("-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setCopiesAvailable((int) (byte) 100);
        java.lang.String str19 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 35" + "'", str14, "hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
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
        item7.setName("-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        int int21 = item7.getItemId();
        java.lang.String str22 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        gui.Item item7 = new gui.Item((int) (short) -1, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!", 0, "-1,,hi!,,1,hi!,hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) (short) -1);
        int int10 = item7.getCopiesAvailable();
        item7.setGenre("35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int13 = item7.getCopiesAvailable();
        java.lang.String str14 = item7.getType();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str14, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.toCsvString();
        int int13 = item7.getCopiesAvailable();
        int int14 = item7.getItemId();
        java.lang.String str15 = item7.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " () - Copies: 1" + "'", str15, " () - Copies: 1");
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getType();
        item7.setCopiesAvailable(0);
        item7.setCopiesAvailable((int) ' ');
        int int19 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setType("-1,hi!,hi!,,1,hi!,hi!");
        item7.setItemId(0);
        java.lang.String str21 = item7.getName();
        java.lang.String str22 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setGenre("");
        item7.setLocation("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        item7.setLocation("hi!");
        java.lang.String str16 = item7.getName();
        item7.setItemId(52);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        int int12 = item7.getItemId();
        java.lang.String str13 = item7.getAuthor();
        java.lang.String str14 = item7.getAuthor();
        java.lang.String str15 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setGenre("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        int int10 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) (short) 0);
        java.lang.String str13 = item7.getType();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getLocation();
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getLocation();
        item7.setItemId(10);
        item7.setName("1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,,,100,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        item7.setName("hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getAuthor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        int int17 = item7.getItemId();
        item7.setAuthor("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        int int12 = item7.getCopiesAvailable();
        java.lang.String str13 = item7.toString();
        java.lang.String str14 = item7.toString();
        item7.setType("-1,,hi!,,-1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! () - Copies: 1" + "'", str13, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        item7.setCopiesAvailable((-1));
        java.lang.String str12 = item7.getLocation();
        item7.setAuthor("");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        int int12 = item7.getItemId();
        int int13 = item7.getCopiesAvailable();
        int int14 = item7.getItemId();
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.Class<?> wildcardClass17 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        java.lang.String str8 = item7.getType();
        java.lang.String str9 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        java.lang.String str14 = item7.getLocation();
        int int15 = item7.getCopiesAvailable();
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getAuthor();
        item7.setCopiesAvailable(0);
        item7.setName("32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.String str22 = item7.getGenre();
        item7.setAuthor("-1,,hi!,,52,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
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
        item7.setLocation("hi! (1,,,,100,-1,,hi!,,1,hi!,hi!,) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 32" + "'", str18, "hi! () - Copies: 32");
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setType("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.getLocation();
        java.lang.String str20 = item7.getLocation();
        item7.setType("-1,,hi!,,1,-1,hi!,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        int int17 = item7.getItemId();
        java.lang.String str18 = item7.getType();
        item7.setLocation("1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        java.lang.String str14 = item7.getGenre();
        item7.setType("hi! () - Copies: 1");
        java.lang.String str17 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! (hi! () - Copies: 1) - Copies: 1" + "'", str17, "hi! (hi! () - Copies: 1) - Copies: 1");
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        int int9 = item7.getCopiesAvailable();
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getAuthor();
        java.lang.String str12 = item7.toString();
        java.lang.String str13 = item7.getName();
        item7.setType("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,hi!,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setAuthor("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " () - Copies: 100" + "'", str12, " () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        gui.Item item7 = new gui.Item(1, "hi! () - Copies: 1", "-1,,hi!,,100,hi!,hi! () - Copies: 1", "hi! () - Copies: -1", (int) ' ', "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "hi! () - Copies: -1");
        java.lang.String str8 = item7.toCsvString();
        item7.setType("100,hi! () - Copies: 1 (hi!) - Copies: 0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,10,hi! () - Copies: 1 (hi!) - Copies: 0,0,,hi!,,32,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1,hi! () - Copies: 1,-1,,hi!,,100,hi!,hi! () - Copies: 1,hi! () - Copies: -1,32,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi! () - Copies: -1" + "'", str8, "1,hi! () - Copies: 1,-1,,hi!,,100,hi!,hi! () - Copies: 1,hi! () - Copies: -1,32,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi! () - Copies: -1");
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
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
        java.lang.String str20 = item7.getGenre();
        java.lang.String str21 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str20, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        gui.Item item7 = new gui.Item((int) '4', "0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!", "0,,hi!,,1,hi!,hi!", (int) '#', "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!" + "'", str8, "0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.getLocation();
        java.lang.String str10 = item7.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " () - Copies: 100" + "'", str10, " () - Copies: 100");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
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
        java.lang.String str21 = item7.getLocation();
        item7.setCopiesAvailable((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 32" + "'", str19, "hi! () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setName("-1,,hi!,,100,hi!,hi! () - Copies: 1");
        item7.setLocation("hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        gui.Item item7 = new gui.Item((int) (short) -1, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!", 0, "-1,,hi!,,1,hi!,hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) (short) -1);
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.getName();
        java.lang.String str12 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0" + "'", str10, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0" + "'", str12, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0");
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        gui.Item item7 = new gui.Item((int) '4', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1", "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,1,0,,hi!,,1,hi!,hi!,", "hi! (hi!) - Copies: 1", 0, "0,,hi!,,32,hi!,hi!", "52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!");
        item7.setCopiesAvailable(97);
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        java.lang.String str12 = item7.toCsvString();
        int int13 = item7.getItemId();
        item7.setItemId((int) (short) 1);
        java.lang.String str16 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        gui.Item item7 = new gui.Item(35, "", "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,35,hi!,hi! () - Copies: 1", "-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!", (int) (short) 0, "0,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!, () - Copies: -1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1,10,-1,,,,1,-1,,hi!,,1,hi!,hi!,,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35", "0,,hi!,,1,hi!,hi! (hi! () - Copies: -1) - Copies: -1");
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
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
        java.lang.String str20 = item7.getGenre();
        item7.setCopiesAvailable((int) (short) 100);
        java.lang.String str23 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        gui.Item item7 = new gui.Item((-1), "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1", " () - Copies: 10", (int) (byte) 0, "-1,,hi!,,1,hi!,hi!", "-1,,hi!,,1,hi! () - Copies: 35,");
        item7.setItemId(52);
        int int10 = item7.getCopiesAvailable();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int18 = item7.getItemId();
        java.lang.String str19 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        int int15 = item7.getCopiesAvailable();
        int int16 = item7.getCopiesAvailable();
        java.lang.String str17 = item7.getLocation();
        java.lang.String str18 = item7.getLocation();
        item7.setName("-1,,hi!,,35,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        gui.Item item7 = new gui.Item((int) ' ', "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,hi!,hi!,,1,hi!,hi!) - Copies: 1", "-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32) - Copies: 97", (int) (short) 10, "hi! () - Copies: 1 () - Copies: 100", "32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,97,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        item7.setGenre("0,,hi!,,1,hi!, () - Copies: 10");
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        gui.Item item7 = new gui.Item(35, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32", "-1,,hi!,,1,hi!,hi!", "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", (int) 'a', "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        item7.setLocation("");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "35,-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32,-1,,hi!,,1,hi!,hi!,,97,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!" + "'", str10, "35,-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32,-1,,hi!,,1,hi!,hi!,,97,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        java.lang.String str13 = item7.getName();
        item7.setType("");
        item7.setGenre("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi! () - Copies: 100");
        java.lang.String str20 = item7.toString();
        java.lang.String str21 = item7.getAuthor();
        item7.setType("hi! () - Copies: 1 () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! () - Copies: 1" + "'", str20, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        gui.Item item7 = new gui.Item(100, "hi! () - Copies: 1 (hi!) - Copies: 0", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", (int) (byte) 0, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (byte) 0);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) 1);
        java.lang.String str22 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str20 = item7.toCsvString();
        item7.setName("hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,-1,,hi!,,1,hi!,hi!,,52,hi!,hi! () - Copies: 1" + "'", str20, "-1,,-1,,hi!,,1,hi!,hi!,,52,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setLocation("");
        item7.setAuthor("0,,hi!,hi! () - Copies: 35,32,hi!,hi!");
        java.lang.Class<?> wildcardClass15 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str15 = item7.toString();
        item7.setName("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int18 = item7.getCopiesAvailable();
        java.lang.String str19 = item7.getType();
        java.lang.String str20 = item7.getLocation();
        item7.setItemId(52);
        item7.setAuthor("100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        item7.setType("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35" + "'", str15, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str19, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        gui.Item item7 = new gui.Item((int) (short) 100, "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", "hi!", "", (int) (short) -1, "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10");
        int int8 = item7.getCopiesAvailable();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }
}

