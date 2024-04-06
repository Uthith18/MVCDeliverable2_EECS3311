package gui.randoopTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("0,,hi!,,1,hi!,hi!");
        item7.setLocation("-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
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
        java.lang.String str21 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str16 = item7.toString();
        item7.setGenre("");
        java.lang.String str19 = item7.toString();
        int int20 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: -1" + "'", str19, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setName("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) 100);
        int int15 = item7.getItemId();
        item7.setAuthor("-1,,hi!,,1,hi!,hi! (hi! () - Copies: 1) - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        int int14 = item7.getCopiesAvailable();
        item7.setItemId((int) (byte) 0);
        int int17 = item7.getCopiesAvailable();
        java.lang.String str18 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getType();
        int int15 = item7.getItemId();
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        gui.Item item7 = new gui.Item(52, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1", "0,,hi!,,1,hi!,hi!", (int) (byte) 100, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", " () - Copies: 10");
        java.lang.String str8 = item7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!) - Copies: 100" + "'", str8, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!) - Copies: 100");
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
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
        java.lang.String str25 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str23, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str25, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("0,,hi!,,1,hi!,hi!");
        int int20 = item7.getCopiesAvailable();
        java.lang.String str21 = item7.getGenre();
        item7.setItemId((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getGenre();
        int int18 = item7.getCopiesAvailable();
        item7.setType("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str10 = item7.getType();
        java.lang.String str11 = item7.toCsvString();
        item7.setCopiesAvailable((-1));
        java.lang.String str14 = item7.getType();
        item7.setAuthor("hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,52,hi!," + "'", str11, "-1,,hi!,,52,hi!,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.getName();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        int int17 = item7.getCopiesAvailable();
        int int18 = item7.getCopiesAvailable();
        int int19 = item7.getCopiesAvailable();
        java.lang.String str20 = item7.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str20, "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        java.lang.String str13 = item7.getName();
        item7.setType("");
        item7.setGenre("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str18 = item7.getGenre();
        java.lang.String str19 = item7.getAuthor();
        item7.setItemId((-1));
        java.lang.Class<?> wildcardClass22 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str18, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setName("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getLocation();
        item7.setCopiesAvailable((int) (short) 10);
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setItemId((int) (byte) 1);
        item7.setType("-1,,hi!,,1,hi!,hi!");
        java.lang.String str15 = item7.getGenre();
        item7.setCopiesAvailable(0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        gui.Item item7 = new gui.Item(35, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "35,,hi!,,1,hi! () - Copies: -1,hi!", "hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1", 32, "100,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,35,hi!,,52,hi! () - Copies: 100, (hi!) - Copies: 1", "hi! (0,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        gui.Item item7 = new gui.Item((int) ' ', "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!", "-1,,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", "97,,hi!,,1,hi!,hi!", (int) (short) 0, "97,,hi!,,1,hi!,hi!", "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,35,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
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
        item7.setItemId((int) '4');
        java.lang.String str24 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        java.lang.String str14 = item7.getName();
        item7.setType("35,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        gui.Item item7 = new gui.Item(0, "1,,,,100,-1,,hi!,,1,hi!,hi!,", "-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,,100,-1,,hi!,,1,hi!,hi!,", 1, "hi! (hi!) - Copies: 1", "0,,hi!,hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        gui.Item item7 = new gui.Item((int) ' ', "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1", "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,32,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0", 0, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1", "10,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        gui.Item item7 = new gui.Item(52, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10", "-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32", "", (int) (short) -1, "0,,hi!,,1,hi!,hi!", "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!, (-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
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
        java.lang.String str23 = item7.getAuthor();
        item7.setItemId(35);
        java.lang.String str26 = item7.getLocation();
        java.lang.Class<?> wildcardClass27 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getCopiesAvailable();
        java.lang.String str18 = item7.getType();
        item7.setCopiesAvailable((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getName();
        item7.setGenre(" (hi!) - Copies: 1");
        java.lang.String str19 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getLocation();
        item7.setCopiesAvailable((int) (short) 10);
        java.lang.String str11 = item7.getType();
        item7.setName(" (hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
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
        java.lang.String str19 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,hi!" + "'", str19, "-1,,hi!,,1,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,hi!");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        gui.Item item7 = new gui.Item((int) '4', "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35", "-1,hi!,hi!,,1,hi!,hi!", "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", (int) (byte) 10, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.String str8 = item7.getLocation();
        java.lang.String str9 = item7.getGenre();
        item7.setLocation("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int12 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!" + "'", str8, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str9, "hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
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
        item7.setItemId(0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        gui.Item item7 = new gui.Item((int) (byte) 100, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", " () - Copies: 100", "", (int) 'a', "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        java.lang.Class<?> wildcardClass9 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        gui.Item item7 = new gui.Item((int) '4', "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "", (int) (byte) -1, "hi! () - Copies: 1 (hi!) - Copies: 0", "hi! () - Copies: 1 (hi!) - Copies: 0");
        item7.setName("hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        java.lang.String str10 = item7.getAuthor();
        java.lang.String str11 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str10, "hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str11, "hi! () - Copies: 1 (hi!) - Copies: 0");
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        item7.setLocation("hi!");
        java.lang.String str12 = item7.toString();
        java.lang.String str13 = item7.getLocation();
        java.lang.String str14 = item7.getName();
        int int15 = item7.getItemId();
        java.lang.String str16 = item7.getType();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        item7.setItemId((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        gui.Item item7 = new gui.Item(32, "0,,hi!,,1,hi!,hi!", " (hi!) - Copies: 1", "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (byte) 1, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str8 = item7.toCsvString();
        item7.setItemId((int) '4');
        item7.setGenre("100,hi!,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str8, "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setCopiesAvailable(0);
        java.lang.String str12 = item7.toString();
        java.lang.String str13 = item7.getAuthor();
        int int14 = item7.getItemId();
        java.lang.String str15 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str12, "hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str13, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str15, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        item7.setCopiesAvailable((int) '#');
        java.lang.Class<?> wildcardClass18 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        item7.setName("");
        item7.setGenre("-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1" + "'", str14, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        gui.Item item7 = new gui.Item(10, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1", (int) ' ', "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "");
        item7.setLocation("");
        java.lang.String str10 = item7.getName();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        item7.setName("-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!");
        int int16 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str10, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
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
        java.lang.String str20 = item7.getType();
        java.lang.String str21 = item7.getAuthor();
        int int22 = item7.getItemId();
        item7.setItemId(32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        gui.Item item7 = new gui.Item(32, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "hi! () - Copies: 1", "hi! () - Copies: 35", (int) (byte) 0, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getLocation();
        item7.setCopiesAvailable((int) '4');
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("-1,,hi!,,1,hi!,");
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 35" + "'", str8, "hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!" + "'", str16, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable(0);
        java.lang.Class<?> wildcardClass15 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        java.lang.String str16 = item7.getGenre();
        java.lang.String str17 = item7.toCsvString();
        item7.setAuthor("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        int int20 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1" + "'", str17, "-1,,hi!,,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        gui.Item item7 = new gui.Item(100, "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", " () - Copies: 100", "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", 100, "", "-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.toCsvString();
        int int9 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!, () - Copies: 100,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,100,,-1,hi!,hi!,,1,hi!,hi!" + "'", str8, "100,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!, () - Copies: 100,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,100,,-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        gui.Item item7 = new gui.Item(10, "97,,-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!,,1,hi!,hi!", "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,", "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", (int) '4', "-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32");
        item7.setGenre(" () - Copies: 97");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        gui.Item item7 = new gui.Item(52, "-1,,hi!,,1,hi!,hi! () - Copies: 100", "-1,hi!,35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,hi!,hi!", "10,,hi!,,1,hi!,hi! () - Copies: 35", (int) (short) 1, "32,,,,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,,hi!,100,hi!,hi! () - Copies: 1", "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, (hi! () - Copies: -1) - Copies: -1");
        item7.setLocation("-1,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,hi!,,-1,hi!,");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str12 = item7.toCsvString();
        item7.setCopiesAvailable(0);
        item7.setItemId((int) (short) 1);
        item7.setItemId((int) 'a');
        item7.setLocation("-1,,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        int int12 = item7.getItemId();
        int int13 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
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
        item7.setCopiesAvailable(35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.toCsvString();
        int int13 = item7.getCopiesAvailable();
        item7.setItemId((int) (short) 10);
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getName();
        java.lang.String str18 = item7.getType();
        java.lang.String str19 = item7.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " () - Copies: 1" + "'", str19, " () - Copies: 1");
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
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
        int int22 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35" + "'", str15, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str19, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
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
        java.lang.String str20 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! () - Copies: 0" + "'", str20, "hi! () - Copies: 0");
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getLocation();
        java.lang.String str15 = item7.getGenre();
        int int16 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        int int9 = item7.getItemId();
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setLocation("");
        java.lang.String str14 = item7.getAuthor();
        item7.setItemId((int) (short) -1);
        java.lang.String str17 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str14, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        gui.Item item7 = new gui.Item(100, "hi! () - Copies: 1 (hi!) - Copies: 0", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", (int) (byte) 0, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getCopiesAvailable();
        item7.setAuthor("hi! () - Copies: 32");
        java.lang.Class<?> wildcardClass11 = item7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getName();
        java.lang.String str17 = item7.getAuthor();
        item7.setLocation("-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
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
        item7.setGenre("");
        java.lang.String str23 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
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
        int int24 = item7.getItemId();
        java.lang.String str25 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        java.lang.String str18 = item7.toString();
        int int19 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        java.lang.String str22 = item7.getName();
        java.lang.String str23 = item7.getGenre();
        item7.setAuthor("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 32" + "'", str18, "hi! () - Copies: 32");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getType();
        item7.setItemId(1);
        item7.setGenre("0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        java.lang.String str17 = item7.toCsvString();
        item7.setGenre("-1,,hi!,,100,hi!,hi! () - Copies: 1");
        java.lang.String str20 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,0,hi! () - Copies: -1,hi!,,1,hi!,hi!" + "'", str17, "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1" + "'", str20, "-1,,hi!,,100,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("hi! () - Copies: 1");
        item7.setType("hi! () - Copies: 32");
        java.lang.String str12 = item7.getGenre();
        java.lang.String str13 = item7.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " (hi! () - Copies: 32) - Copies: 100" + "'", str13, " (hi! () - Copies: 32) - Copies: 100");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        gui.Item item7 = new gui.Item((-1), "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!", "97,,-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!,,1,hi!,hi!", (int) (short) 0, "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "100,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,35,hi!,,52,hi! () - Copies: 100, (hi!) - Copies: 1");
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getLocation();
        item7.setType("hi! () - Copies: 1");
        java.lang.String str12 = item7.getAuthor();
        java.lang.Class<?> wildcardClass13 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
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
        item7.setLocation("hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0");
        int int27 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setType("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.getLocation();
        java.lang.String str20 = item7.getType();
        item7.setGenre("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 1");
        item7.setLocation("32, () - Copies: -1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi! () - Copies: 1 (hi!) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str20, "-1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        item7.setItemId(0);
        item7.setName("0,,hi!,,1,hi!,hi!");
        java.lang.String str22 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        gui.Item item7 = new gui.Item((int) (short) 100, "100,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,35,hi!,,52,hi! () - Copies: 100, (hi!) - Copies: 1", "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!", "0,,hi!,,32,hi!,hi! (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 32", (int) (short) -1, "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52");
        item7.setItemId(35);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        java.lang.Class<?> wildcardClass20 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
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
        java.lang.String str22 = item7.getAuthor();
        item7.setType("-1,,hi!,,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setName(" () - Copies: -1");
        int int16 = item7.getItemId();
        int int17 = item7.getCopiesAvailable();
        java.lang.String str18 = item7.getName();
        item7.setItemId(1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " () - Copies: -1" + "'", str18, " () - Copies: -1");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setItemId((int) (byte) 10);
        java.lang.String str10 = item7.getType();
        item7.setCopiesAvailable((int) (short) 1);
        int int13 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: -1" + "'", str10, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        gui.Item item7 = new gui.Item((int) (byte) 10, "-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", (int) (byte) 0, "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,hi! () - Copies: 1,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!", "-1,,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
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
        item7.setName("-1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
        item7.setType("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.toString();
        int int18 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '#');
        java.lang.String str10 = item7.getName();
        int int11 = item7.getCopiesAvailable();
        java.lang.String str12 = item7.toCsvString();
        item7.setAuthor("-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,35,hi!," + "'", str12, "-1,,hi!,,35,hi!,");
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: 35", "", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (byte) 100, "hi! () - Copies: 1 (hi!) - Copies: 0", "hi! () - Copies: 35");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str14 = item7.toCsvString();
        int int15 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str14, "-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        gui.Item item7 = new gui.Item((int) (short) -1, "0,,hi!,,32,hi!,hi! (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 32", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", " () - Copies: 10", 0, "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        int int8 = item7.getCopiesAvailable();
        java.lang.String str9 = item7.getName();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str9, "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        item7.setAuthor("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getItemId();
        item7.setType("0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        int int9 = item7.getItemId();
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setLocation("");
        java.lang.String str14 = item7.getAuthor();
        java.lang.String str15 = item7.toString();
        item7.setLocation("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str14, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " () - Copies: 10" + "'", str15, " () - Copies: 10");
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
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
        item7.setAuthor("10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        item7.setGenre("hi! () - Copies: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str18, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str19, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getName();
        item7.setType("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
        int int14 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.toString();
        java.lang.String str12 = item7.getAuthor();
        int int13 = item7.getCopiesAvailable();
        item7.setCopiesAvailable(100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " () - Copies: 10" + "'", str11, " () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setCopiesAvailable((int) '#');
        item7.setType("-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32");
        java.lang.Class<?> wildcardClass12 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        item7.setLocation("hi!");
        item7.setCopiesAvailable((int) (short) 10);
        java.lang.String str19 = item7.toCsvString();
        java.lang.String str20 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,hi!,10,hi!,hi!" + "'", str19, "-1,,hi!,hi!,10,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
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
        int int23 = item7.getItemId();
        item7.setCopiesAvailable(1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35" + "'", str15, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str19, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        gui.Item item7 = new gui.Item((int) (short) -1, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!", 0, "-1,,hi!,,1,hi!,hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) (short) -1);
        int int10 = item7.getCopiesAvailable();
        item7.setGenre("35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str13 = item7.getName();
        java.lang.String str14 = item7.getGenre();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str14, "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.Class<?> wildcardClass14 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        int int10 = item7.getCopiesAvailable();
        java.lang.String str11 = item7.toCsvString();
        item7.setAuthor("hi! () - Copies: 35");
        java.lang.String str14 = item7.toString();
        java.lang.String str15 = item7.toCsvString();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str11, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 35" + "'", str14, "hi! () - Copies: 1 (hi!) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,hi! () - Copies: 35,hi! () - Copies: 1" + "'", str15, "1,hi!,hi! () - Copies: 1,,35,hi! () - Copies: 35,hi! () - Copies: 1");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        int int9 = item7.getItemId();
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setLocation("");
        item7.setGenre("-1,,,hi!,100,hi!,hi! () - Copies: 1");
        java.lang.String str16 = item7.getGenre();
        item7.setName("-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
        java.lang.String str19 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str16, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1" + "'", str19, "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
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
        java.lang.String str22 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 35" + "'", str22, "hi! () - Copies: 35");
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        item7.setAuthor("0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getGenre();
        java.lang.String str18 = item7.getLocation();
        java.lang.String str19 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.getName();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setType("hi! (1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        gui.Item item7 = new gui.Item((int) (byte) 1, "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0,1,hi!,-1,,hi!,,1,hi!,hi!", (-1), "32,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,hi!,,-1, () - Copies: 100,-1,,hi!,,1,hi!,hi! () - Copies: 100");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("-1,,hi!,,1,hi!,hi! () - Copies: 100");
        java.lang.String str17 = item7.toCsvString();
        item7.setAuthor("-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
        java.lang.String str20 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,-1,,hi!,,1,hi!,hi! () - Copies: 100,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "-1,,hi!,,1,-1,,hi!,,1,hi!,hi! () - Copies: 100,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str20, "-1,,hi!,,1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setName("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str13 = item7.toCsvString();
        java.lang.String str14 = item7.getLocation();
        java.lang.String str15 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str13, "-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getAuthor();
        item7.setItemId(10);
        java.lang.String str19 = item7.toCsvString();
        java.lang.String str20 = item7.toCsvString();
        item7.setItemId((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10,,hi!,,1,hi!,hi!" + "'", str19, "10,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "10,,hi!,,1,hi!,hi!" + "'", str20, "10,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!," + "'", str10, "-1,,hi!,,1,hi!,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setAuthor("hi!");
        item7.setType("hi!");
        java.lang.String str16 = item7.getName();
        item7.setLocation("1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.getAuthor();
        item7.setGenre("-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32");
        int int18 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! () - Copies: 32");
        java.lang.Class<?> wildcardClass20 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        int int11 = item7.getCopiesAvailable();
        int int12 = item7.getCopiesAvailable();
        java.lang.String str13 = item7.getGenre();
        item7.setLocation("-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str16, "-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.toString();
        java.lang.String str16 = item7.getGenre();
        java.lang.String str17 = item7.getName();
        java.lang.String str18 = item7.getAuthor();
        java.lang.Class<?> wildcardClass19 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
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
        item7.setLocation("hi! () - Copies: 1 () - Copies: 100");
        item7.setLocation("1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setItemId((int) (byte) 10);
        item7.setItemId(100);
        item7.setName("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str14, "-1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.getName();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        int int17 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) (byte) -1);
        java.lang.String str20 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        item7.setLocation("hi!");
        item7.setType("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int19 = item7.getItemId();
        item7.setType("hi! () - Copies: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        java.lang.String str9 = item7.toString();
        item7.setAuthor("-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " () - Copies: 10" + "'", str9, " () - Copies: 10");
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        gui.Item item7 = new gui.Item((int) (byte) 10, "-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,-1,,hi!,,1,hi!,hi! () - Copies: 100", "1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,,,100,-1,,hi!,,1,hi!,hi!,", (int) (byte) 0, "-1,,hi!,hi!,100,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.toString();
        java.lang.String str16 = item7.getAuthor();
        java.lang.String str17 = item7.toCsvString();
        java.lang.Class<?> wildcardClass18 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
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
        item7.setLocation("-1,,-1,,hi!,,1,hi!,hi!,,52,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getLocation();
        item7.setCopiesAvailable((int) (short) 10);
        java.lang.String str11 = item7.getType();
        item7.setGenre(" (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
        java.lang.String str14 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setName("0,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.toCsvString();
        item7.setGenre("1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        item7.setLocation("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.getGenre();
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: -1,hi!");
        java.lang.Class<?> wildcardClass22 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str14, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,," + "'", str19, "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        java.lang.String str10 = item7.getGenre();
        java.lang.String str11 = item7.getAuthor();
        java.lang.String str12 = item7.toCsvString();
        item7.setLocation("hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str11, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str12, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
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
        item7.setItemId(1);
        java.lang.String str22 = item7.getAuthor();
        java.lang.String str23 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        item7.setLocation("hi!");
        java.lang.String str12 = item7.getLocation();
        item7.setCopiesAvailable(10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        int int9 = item7.getCopiesAvailable();
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getAuthor();
        item7.setType("-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setLocation("-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str17 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.toString();
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setName("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.Class<?> wildcardClass20 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.getGenre();
        java.lang.Class<?> wildcardClass14 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        int int17 = item7.getItemId();
        item7.setCopiesAvailable((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) '4');
        item7.setName("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setItemId(10);
        java.lang.Class<?> wildcardClass24 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str14 = item7.getLocation();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,,hi!,,52,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
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
        java.lang.String str22 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 35 + "'", int20 == 35);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!," + "'", str21, "-1,,hi!,,1,hi!,");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
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
        int int22 = item7.getCopiesAvailable();
        java.lang.String str23 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 32 + "'", int22 == 32);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! () - Copies: 32" + "'", str23, "hi! () - Copies: 32");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
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
        item7.setCopiesAvailable((int) (byte) 10);
        int int23 = item7.getItemId();
        item7.setCopiesAvailable((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 35 + "'", int23 == 35);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        int int15 = item7.getItemId();
        java.lang.String str16 = item7.getGenre();
        java.lang.String str17 = item7.getName();
        item7.setCopiesAvailable((int) 'a');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
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
        item7.setCopiesAvailable(0);
        int int25 = item7.getCopiesAvailable();
        int int26 = item7.getItemId();
        item7.setLocation("-1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,hi!,100,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        java.lang.String str31 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-1,,-1,,hi!,hi!,100,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!,0,hi!,hi! () - Copies: 1" + "'", str31, "-1,,-1,,hi!,hi!,100,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!,0,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        gui.Item item7 = new gui.Item((int) (byte) 0, "100,hi!,hi!,,1,hi!,hi!", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "52,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,10,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 1 (hi!) - Copies: 0", (int) (byte) -1, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,", "0,,0,,hi!,,1,hi!,hi!,,32,hi!,hi!");
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        item7.setGenre("1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,32,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str24 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        item7.setItemId(32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        java.lang.String str14 = item7.getLocation();
        int int15 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) (byte) 1);
        java.lang.String str18 = item7.toCsvString();
        java.lang.String str19 = item7.getType();
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,100,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.toString();
        item7.setItemId((int) 'a');
        java.lang.String str18 = item7.getAuthor();
        item7.setItemId((int) (short) 10);
        java.lang.Class<?> wildcardClass21 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getType();
        item7.setAuthor("hi! () - Copies: -1");
        item7.setGenre("-1,,hi!,,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        item7.setItemId(32);
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
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.toCsvString();
        item7.setGenre("1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        item7.setCopiesAvailable((int) '4');
        item7.setAuthor("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        item7.setItemId(1);
        java.lang.String str18 = item7.getGenre();
        int int19 = item7.getCopiesAvailable();
        item7.setType("hi! () - Copies: 1 () - Copies: 100");
        java.lang.String str22 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! (hi! () - Copies: 1 () - Copies: 100) - Copies: -1" + "'", str22, "hi! (hi! () - Copies: 1 () - Copies: 100) - Copies: -1");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        gui.Item item7 = new gui.Item(1, "hi! () - Copies: 1", "-1,,hi!,,100,hi!,hi! () - Copies: 1", "hi! () - Copies: -1", (int) ' ', "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "hi! () - Copies: -1");
        java.lang.String str8 = item7.toString();
        item7.setLocation("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        int int11 = item7.getCopiesAvailable();
        int int12 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32" + "'", str8, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getAuthor();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setGenre("0,,0,,hi!,,1,hi!,hi!,,32,hi!,hi!");
        int int21 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
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
        java.lang.String str23 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! () - Copies: 32" + "'", str23, "hi! () - Copies: 32");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        gui.Item item7 = new gui.Item((int) '#', "hi! (hi! () - Copies: 1) - Copies: 10", "-1,,hi!,,35,hi!,", "-1,,hi!,hi!,100,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", 100, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!");
        int int8 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        item7.setItemId((int) (short) 1);
        int int19 = item7.getCopiesAvailable();
        java.lang.String str20 = item7.getAuthor();
        java.lang.String str21 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 32" + "'", str21, "hi! () - Copies: 32");
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        item7.setName("");
        java.lang.Class<?> wildcardClass11 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setName("hi! () - Copies: -1");
        item7.setGenre("32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str18 = item7.getAuthor();
        item7.setGenre(" () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str18, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!", (int) (short) 0, "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getItemId();
        item7.setType("-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
        java.lang.String str11 = item7.getGenre();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        gui.Item item7 = new gui.Item(1, "hi! () - Copies: 1", "-1,,hi!,,100,hi!,hi! () - Copies: 1", "hi! () - Copies: -1", (int) ' ', "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "hi! () - Copies: -1");
        java.lang.String str8 = item7.toString();
        item7.setType("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str11 = item7.getName();
        item7.setType("-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
        item7.setLocation("1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32" + "'", str8, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1" + "'", str11, "-1,,hi!,,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!" + "'", str16, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str13 = item7.getAuthor();
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.getGenre();
        item7.setCopiesAvailable((-1));
        java.lang.String str18 = item7.getAuthor();
        java.lang.Class<?> wildcardClass19 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str13, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str15, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        java.lang.String str17 = item7.getAuthor();
        item7.setType("hi! () - Copies: 1");
        item7.setName("1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
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
        item7.setCopiesAvailable(32);
        java.lang.Class<?> wildcardClass24 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
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
        item7.setLocation("0,,0,,hi!,,1,hi!,hi!,,32,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str14, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,," + "'", str19, "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        java.lang.String str8 = item7.getAuthor();
        int int9 = item7.getItemId();
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getLocation();
        item7.setAuthor("hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35");
        java.lang.String str18 = item7.getLocation();
        java.lang.String str19 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35" + "'", str19, "hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35");
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        gui.Item item7 = new gui.Item((int) 'a', "-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,", "10,-1,,hi!,,1,hi! () - Copies: 1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,", "-1,,hi!,-1,,hi!,,1,hi!,hi!,100,hi!,hi! () - Copies: 1", (int) (byte) 10, "-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,,hi!,-1,,hi!,,1,hi!,hi!,-1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int18 = item7.getItemId();
        java.lang.Class<?> wildcardClass19 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setType("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setGenre("32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.String str16 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str16, "32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setName("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        java.lang.String str16 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        int int17 = item7.getItemId();
        item7.setAuthor("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        item7.setAuthor("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.toString();
        item7.setLocation("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        item7.setItemId(35);
        java.lang.String str22 = item7.toCsvString();
        item7.setItemId((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "35,,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!" + "'", str22, "35,,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setName("hi!");
        java.lang.String str14 = item7.getName();
        item7.setType("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setAuthor("32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! (1,,hi!,,1,-1,,hi!,,1,hi!,hi!,) - Copies: 1" + "'", str19, "hi! (1,,hi!,,1,-1,,hi!,,1,hi!,hi!,) - Copies: 1");
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setLocation("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.toCsvString();
        item7.setName("hi! (hi! () - Copies: 1 () - Copies: 100) - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: -1" + "'", str10, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100" + "'", str11, "1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100");
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        item7.setName("hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.String str11 = item7.getType();
        item7.setGenre("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int14 = item7.getCopiesAvailable();
        java.lang.String str15 = item7.getLocation();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
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
        java.lang.String str21 = item7.getAuthor();
        item7.setType("-1,,hi!,,35,hi!,");
        item7.setName("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
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
        item7.setLocation("-1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        gui.Item item7 = new gui.Item((int) ' ', "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!", "32,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!", (int) (byte) 1, "1,,hi!,,1,hi!,hi!", "1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100");
        java.lang.String str8 = item7.getGenre();
        item7.setLocation("");
        item7.setItemId((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100" + "'", str8, "1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100");
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        gui.Item item7 = new gui.Item((int) '#', "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,", "", "-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!", (int) '4', "0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "-1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,0,,hi!,,1,hi!,hi!,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getCopiesAvailable();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
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
        java.lang.String str25 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        gui.Item item7 = new gui.Item((int) ' ', "-1,,hi!,,100,hi!,hi! () - Copies: 1", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "hi! () - Copies: 1", (int) (byte) 100, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "hi! () - Copies: -1");
        java.lang.String str8 = item7.toCsvString();
        item7.setName("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str11 = item7.toString();
        java.lang.String str12 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1" + "'", str8, "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,hi!,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1) - Copies: 100" + "'", str11, "-1,hi!,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1) - Copies: 100");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str12, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
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
        item7.setCopiesAvailable((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 1" + "'", str19, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 32" + "'", str22, "hi! () - Copies: 32");
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.getType();
        java.lang.String str19 = item7.getAuthor();
        item7.setGenre("-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        item7.setAuthor("97,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        gui.Item item7 = new gui.Item((int) '4', "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35", "-1,,hi!,,1,hi!,hi!", (int) (byte) 10, "-1,,,,1,-1,,hi!,,1,hi!,hi!,", "hi!");
        java.lang.String str8 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str8, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        java.lang.String str8 = item7.getName();
        int int9 = item7.getCopiesAvailable();
        java.lang.String str10 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setType("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! (-1,hi!,hi!,,1,hi!,hi!) - Copies: 1" + "'", str19, "hi! (-1,hi!,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        item7.setType("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        item7.setName("-1,,hi!,,1,hi! () - Copies: -1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
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
        item7.setType("-1,,hi!,,1,-1,hi!,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
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
        java.lang.String str24 = item7.getAuthor();
        item7.setItemId(0);
        item7.setType("-1,,hi!,,1,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 1" + "'", str21, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
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
        int int21 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!" + "'", str19, "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        gui.Item item7 = new gui.Item((int) (byte) 100, "-1,,hi!,,1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", "", "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!", (-1), "-1,,,,1,-1,,hi!,,1,hi!,hi!,", "-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str8 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str8, "-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
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
        java.lang.String str23 = item7.getGenre();
        item7.setAuthor("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        int int26 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str23, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 10 + "'", int26 == 10);
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        int int9 = item7.getCopiesAvailable();
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getAuthor();
        item7.setType("-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setGenre("10,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str17 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getName();
        item7.setGenre("hi! () - Copies: 1 (hi!) - Copies: 35");
        java.lang.Class<?> wildcardClass17 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        item7.setLocation("");
        java.lang.String str18 = item7.getLocation();
        item7.setCopiesAvailable((int) ' ');
        java.lang.String str21 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "100,,hi!,,32,hi!,hi!" + "'", str21, "100,,hi!,,32,hi!,hi!");
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
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
        item7.setLocation("");
        item7.setCopiesAvailable(0);
        item7.setLocation("hi! (hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str24, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
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
        item7.setGenre(" (hi!) - Copies: 1");
        java.lang.String str30 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!" + "'", str24, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        gui.Item item7 = new gui.Item(35, " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10", "-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", "hi!", (int) (short) 1, "0,hi! () - Copies: -1,hi!,,1,hi!,hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
        item7.setType("1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setAuthor("-1,,hi!,,1,-1,hi!,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        gui.Item item7 = new gui.Item((int) (byte) 100, "hi! () - Copies: 32", "97,,hi!,,1,hi!,hi!", " () - Copies: 1", (int) (short) 100, "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,35,hi!,hi! () - Copies: 1", "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!");
        java.lang.String str8 = item7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "97,,hi!,,1,hi!,hi! (hi! () - Copies: 32) - Copies: 100" + "'", str8, "97,,hi!,,1,hi!,hi! (hi! () - Copies: 32) - Copies: 100");
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setLocation("0,,hi!,,32,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        java.lang.String str14 = item7.getLocation();
        int int15 = item7.getItemId();
        item7.setCopiesAvailable((int) (short) 1);
        java.lang.String str18 = item7.toCsvString();
        java.lang.String str19 = item7.getLocation();
        item7.setItemId(97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 1" + "'", str18, "-1,,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        int int11 = item7.getCopiesAvailable();
        int int12 = item7.getCopiesAvailable();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.toCsvString();
        item7.setName("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
        item7.setGenre(" (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
        item7.setCopiesAvailable((int) (byte) -1);
        int int21 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
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
        item7.setLocation("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str26 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " () - Copies: 1" + "'", str26, " () - Copies: 1");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
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
        java.lang.String str20 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setName("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setLocation("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.toString();
        item7.setGenre(" (hi!) - Copies: 1");
        java.lang.String str19 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("-1,,hi!,,1,hi!,hi! () - Copies: 100");
        java.lang.String str17 = item7.toCsvString();
        java.lang.String str18 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,-1,,hi!,,1,hi!,hi! () - Copies: 100,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "-1,,hi!,,1,-1,,hi!,,1,hi!,hi! () - Copies: 100,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        gui.Item item7 = new gui.Item((int) (short) 0, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 32, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getItemId();
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str11 = item7.getName();
        item7.setItemId((int) 'a');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str11, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setName("1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        java.lang.String str22 = item7.getAuthor();
        java.lang.String str23 = item7.getType();
        java.lang.String str24 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str15, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str16, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 1" + "'", str22, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        gui.Item item7 = new gui.Item(1, "0,,hi!,,32,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", " () - Copies: 100", "0,,hi!,,1,hi!, () - Copies: 10", (-1), "10,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        java.lang.Class<?> wildcardClass33 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str23, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.toString();
        item7.setName("hi!");
        item7.setType("35,hi!,hi!,,1,hi!,hi!");
        item7.setType("-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,,hi!,,1,hi!,", (-1), "", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) '#');
        java.lang.String str10 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi! (hi! () - Copies: 1) - Copies: 10");
        int int13 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str10, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
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
        item7.setType("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str26 = item7.getAuthor();
        java.lang.Class<?> wildcardClass27 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        gui.Item item7 = new gui.Item((int) (byte) 10, "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", "hi!", "-1,,hi!,,35,hi!,", 1, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "");
        item7.setItemId(32);
        java.lang.String str10 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str10, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setCopiesAvailable(35);
        java.lang.String str15 = item7.getGenre();
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        java.lang.String str9 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str9, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
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
        java.lang.String str26 = item7.getGenre();
        int int27 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str22, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str25, "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str26, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
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
        item7.setCopiesAvailable(0);
        item7.setItemId(1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        gui.Item item7 = new gui.Item((int) (short) 0, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi!", "-1,,hi!,,1,hi!,hi!", (int) (short) 100, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!");
        item7.setType("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setGenre("32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        item7.setName("0,,hi!,hi! () - Copies: 35,32,hi!,hi!");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) 1);
        item7.setAuthor(" () - Copies: 10");
        java.lang.String str24 = item7.getName();
        java.lang.String str25 = item7.getName();
        java.lang.String str26 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! () - Copies: 1" + "'", str26, "hi! () - Copies: 1");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        java.lang.String str24 = item7.getGenre();
        java.lang.String str25 = item7.toCsvString();
        java.lang.String str26 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!" + "'", str25, "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
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
        item7.setName("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0,,hi!,,32,hi!,hi!" + "'", str19, "0,,hi!,,32,hi!,hi!");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
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
        java.lang.String str24 = item7.getAuthor();
        item7.setLocation("-1,,hi!,,1,hi!,hi! () - Copies: 100");
        java.lang.String str27 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str23, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str27, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
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
        java.lang.String str25 = item7.toString();
        java.lang.Class<?> wildcardClass26 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! () - Copies: 1" + "'", str24, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1" + "'", str25, "hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getCopiesAvailable();
        java.lang.String str18 = item7.toCsvString();
        int int19 = item7.getItemId();
        int int20 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        gui.Item item7 = new gui.Item(0, "52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1,,hi!,,1,hi! () - Copies: 35,", "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1", (int) (short) 0, "10,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!", "100,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,35,hi!,,52,hi! () - Copies: 100, (hi!) - Copies: 1");
        item7.setType("1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setLocation(" () - Copies: 10");
        item7.setName("hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1");
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
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
        item7.setName("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        int int10 = item7.getCopiesAvailable();
        java.lang.String str11 = item7.toString();
        item7.setType("10,-1,,hi!,,1,hi! () - Copies: 1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 35" + "'", str11, "hi! () - Copies: 1 (hi!) - Copies: 35");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getName();
        item7.setLocation("-1,,hi!,,1,0,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
        item7.setName("-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.getType();
        int int10 = item7.getCopiesAvailable();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.toCsvString();
        item7.setName("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,hi! () - Copies: 1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!" + "'", str12, "-1,hi! () - Copies: 1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
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
        java.lang.String str23 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        int int9 = item7.getCopiesAvailable();
        item7.setLocation("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        item7.setLocation("52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!");
        java.lang.String str14 = item7.getLocation();
        java.lang.String str15 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!" + "'", str14, "52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1,,,52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,100,-1,,hi!,,1,hi!,hi!," + "'", str15, "1,,,52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setType("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
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
        int int24 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
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
        item7.setLocation("hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0");
        java.lang.String str27 = item7.toCsvString();
        java.lang.String str28 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0,,hi!,hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str27, "0,,hi!,hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0" + "'", str28, "hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getType();
        int int15 = item7.getItemId();
        item7.setGenre("-1,,,hi!,100,hi!,hi! () - Copies: 1");
        int int18 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        gui.Item item7 = new gui.Item((int) '#', "-1,,hi!,,-1,hi!,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! (hi! () - Copies: 1) - Copies: 10", "32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,52,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,", (int) (short) -1, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35", "0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
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
        item7.setType("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        java.lang.String str22 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str22, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str13 = item7.getLocation();
        java.lang.String str14 = item7.toCsvString();
        item7.setType("-1,,hi!,,1,hi!,");
        item7.setType("1,,,,100,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str19 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!" + "'", str14, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! (1,,,,100,-1,,hi!,,1,hi!,hi!,) - Copies: 1" + "'", str19, "hi! (1,,,,100,-1,,hi!,,1,hi!,hi!,) - Copies: 1");
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        java.lang.String str13 = item7.getName();
        java.lang.String str14 = item7.toString();
        item7.setItemId((int) (short) 100);
        item7.setItemId((int) (short) 0);
        item7.setType("-1,,hi!,,1,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 35" + "'", str14, "hi! () - Copies: 35");
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
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
        item7.setType("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi!,hi! () - Copies: 100");
        int int28 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
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
        int int27 = item7.getCopiesAvailable();
        item7.setItemId((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        gui.Item item7 = new gui.Item((int) (byte) 10, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi! () - Copies: -1,hi!", "32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0", 52, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100", "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        item7.setGenre("32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str10 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100" + "'", str10, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        int int17 = item7.getItemId();
        int int18 = item7.getCopiesAvailable();
        java.lang.String str19 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.toString();
        java.lang.String str12 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " () - Copies: 10" + "'", str11, " () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
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
        item7.setLocation("-1,hi!,hi!,,1,hi!,hi!");
        int int26 = item7.getItemId();
        java.lang.Class<?> wildcardClass27 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        int int11 = item7.getCopiesAvailable();
        int int12 = item7.getCopiesAvailable();
        java.lang.String str13 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        gui.Item item7 = new gui.Item((-1), "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35", "hi! (hi!) - Copies: 1", "0,,hi!,,1,hi!, () - Copies: 10", (int) 'a', "-1,,hi!,,-1, () - Copies: 100,-1,,hi!,,1,hi!,hi! () - Copies: 100", "10,, (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10,,1,,hi! () - Copies: 1");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getLocation();
        item7.setCopiesAvailable((int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setItemId(10);
        item7.setAuthor("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        item7.setLocation("-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setAuthor("-1,,hi!,,35,hi!,hi!");
        java.lang.String str17 = item7.toString();
        int int18 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " () - Copies: 10" + "'", str17, " () - Copies: 10");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
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
        java.lang.String str27 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.toCsvString();
        item7.setLocation("-1,,hi!,,52,hi!,");
        item7.setLocation("-1,,hi!,,1,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str13, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getLocation();
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getAuthor();
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!" + "'", str15, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!");
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        gui.Item item7 = new gui.Item((int) (short) 1, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "", "hi! () - Copies: 1", 0, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId(0);
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (byte) 0);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getName();
        int int11 = item7.getItemId();
        java.lang.String str12 = item7.getType();
        int int13 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        item7.setGenre("-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str11 = item7.getLocation();
        java.lang.String str12 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        java.lang.String str24 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        item7.setLocation("");
        item7.setAuthor("1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 1,0,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        int int14 = item7.getItemId();
        item7.setLocation("-1,,hi!,,-1,hi!,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getName();
        item7.setAuthor("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        java.lang.String str9 = item7.getLocation();
        java.lang.String str10 = item7.getType();
        java.lang.Class<?> wildcardClass11 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setItemId(10);
        item7.setGenre("-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str13 = item7.getName();
        item7.setGenre("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        java.lang.String str8 = item7.getAuthor();
        int int9 = item7.getItemId();
        java.lang.String str10 = item7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str8, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 35" + "'", str10, "hi! () - Copies: 1 (hi!) - Copies: 35");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
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
        item7.setName("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str14, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,," + "'", str19, "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        gui.Item item7 = new gui.Item(100, "hi! () - Copies: 1 (hi!) - Copies: 0", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", (int) (byte) 0, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getCopiesAvailable();
        item7.setType("32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = item7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str13 = item7.getAuthor();
        item7.setType("-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
        item7.setLocation("10,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        item7.setLocation(" () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str13, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
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
        java.lang.String str23 = item7.getGenre();
        item7.setName("hi! (1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: -1" + "'", str22, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        item7.setName("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setGenre("-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setGenre("10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        java.lang.String str14 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.toString();
        java.lang.String str17 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        java.lang.String str17 = item7.getName();
        item7.setCopiesAvailable((int) (short) 100);
        java.lang.String str20 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getGenre();
        java.lang.String str14 = item7.getType();
        item7.setCopiesAvailable(10);
        item7.setType("-1,,,,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.Class<?> wildcardClass19 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str16 = item7.toString();
        item7.setGenre("");
        int int19 = item7.getItemId();
        item7.setItemId((int) (short) 100);
        item7.setName("32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.Class<?> wildcardClass24 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
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
        java.lang.String str18 = item7.toCsvString();
        java.lang.String str19 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setAuthor("hi!");
        item7.setType("hi!");
        int int16 = item7.getItemId();
        java.lang.String str17 = item7.getGenre();
        item7.setGenre("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getName();
        item7.setLocation("1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        item7.setType("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setItemId((int) (byte) 0);
        java.lang.String str23 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,1,hi!,hi!" + "'", str23, "0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,1,hi!,hi!");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
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
        item7.setAuthor("-1,,hi!,,35,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
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
        java.lang.String str29 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        java.lang.String str12 = item7.toCsvString();
        int int13 = item7.getItemId();
        item7.setName("32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getName();
        item7.setType("-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str16, "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        gui.Item item7 = new gui.Item((int) ' ', "hi! () - Copies: 35", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", (int) 'a', "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.getLocation();
        int int12 = item7.getItemId();
        int int13 = item7.getCopiesAvailable();
        int int14 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52" + "'", str10, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str11, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getGenre();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.toCsvString();
        item7.setGenre("hi! (hi! () - Copies: 1 () - Copies: 100) - Copies: -1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str15, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
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
        item7.setCopiesAvailable((int) (short) 100);
        item7.setType("hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
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
        item7.setAuthor("-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setCopiesAvailable((int) (short) 1);
        item7.setCopiesAvailable((int) (short) 100);
        java.lang.Class<?> wildcardClass29 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 1" + "'", str22, "hi! () - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        int int9 = item7.getCopiesAvailable();
        item7.setItemId((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        gui.Item item7 = new gui.Item((int) (byte) -1, "-1,,hi!,,1,hi!,hi! () - Copies: 100", " () - Copies: 10", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!", 100, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 0", "-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,");
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setCopiesAvailable((int) (short) 1);
        java.lang.String str16 = item7.getLocation();
        item7.setAuthor("1,hi! () - Copies: 32,,,100,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.toString();
        java.lang.String str12 = item7.getAuthor();
        item7.setName("1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " () - Copies: 10" + "'", str11, " () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str15, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1 () - Copies: 10" + "'", str16, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1 () - Copies: 10");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        java.lang.String str8 = item7.getAuthor();
        item7.setName("hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 52");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getLocation();
        item7.setGenre("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.toCsvString();
        item7.setName("1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
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
        java.lang.String str22 = item7.getName();
        java.lang.String str23 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " () - Copies: -1" + "'", str21, " () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,,,,-1,hi!,hi!" + "'", str23, "-1,,,,-1,hi!,hi!");
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setGenre("");
        item7.setCopiesAvailable((int) (byte) -1);
        item7.setAuthor("hi! () - Copies: 1 (hi!) - Copies: 0");
        item7.setName("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str18 = item7.toString();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: -1" + "'", str18, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: -1");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        gui.Item item7 = new gui.Item(32, "0,,hi!,,1,hi!,hi!", " (hi!) - Copies: 1", "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (byte) 1, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setType("0,,hi!,,1,hi!,hi!");
        item7.setType("");
        int int12 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getGenre();
        java.lang.Class<?> wildcardClass14 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setGenre("");
        item7.setGenre("-1,hi!,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,35,hi!,");
        item7.setCopiesAvailable((int) 'a');
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
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
        java.lang.String str18 = item7.toCsvString();
        item7.setType("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setLocation("1,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,,32, () - Copies: 100,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        item7.setCopiesAvailable((-1));
        item7.setType("0,,hi!,,1,hi!,hi!");
        item7.setLocation("10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        item7.setGenre("hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0");
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        gui.Item item7 = new gui.Item((int) ' ', "hi! () - Copies: 35", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", (int) 'a', "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "");
        java.lang.String str8 = item7.toCsvString();
        int int9 = item7.getCopiesAvailable();
        item7.setName("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,97,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1," + "'", str8, "32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,97,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("hi! () - Copies: 35");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        gui.Item item7 = new gui.Item((int) (byte) 10, "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,hi!,35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,hi!,hi!", "32, () - Copies: -1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi! () - Copies: 1 (hi!) - Copies: 35", 35, "hi! () - Copies: -1", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setAuthor("1,hi! () - Copies: 32,,,100,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.toString();
        item7.setName("hi!");
        item7.setCopiesAvailable((int) (byte) 10);
        java.lang.String str20 = item7.getAuthor();
        item7.setType("0,,hi!,,32,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        item7.setCopiesAvailable((int) '#');
        item7.setAuthor("-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str20 = item7.getLocation();
        item7.setItemId(0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setCopiesAvailable(0);
        java.lang.String str18 = item7.getType();
        item7.setCopiesAvailable(100);
        java.lang.String str21 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str21, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getName();
        item7.setCopiesAvailable((int) (byte) -1);
        item7.setCopiesAvailable(100);
        java.lang.String str20 = item7.getAuthor();
        java.lang.String str21 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! () - Copies: 1" + "'", str20, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 1" + "'", str21, "hi! () - Copies: 1");
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
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
        item7.setItemId((int) '#');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
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
        java.lang.String str28 = item7.toCsvString();
        java.lang.String str29 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str25, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1,-1,hi!,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,,0,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str28, "-1,-1,hi!,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,,0,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        gui.Item item7 = new gui.Item((int) 'a', "-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!", "-1,,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32) - Copies: 97", "", (int) (byte) 10, "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        item7.setLocation("1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100");
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
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
        item7.setAuthor("52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        gui.Item item7 = new gui.Item((int) (byte) 100, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32", "hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32", (int) (byte) 100, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str8 = item7.getGenre();
        java.lang.String str9 = item7.getAuthor();
        java.lang.Class<?> wildcardClass10 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str8, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str9, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        gui.Item item7 = new gui.Item(35, "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", (int) '4', "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        int int11 = item7.getCopiesAvailable();
        int int12 = item7.getCopiesAvailable();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.toCsvString();
        item7.setName("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
        item7.setGenre(" (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
        item7.setGenre("0,,hi!,hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str21 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
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
        int int27 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " () - Copies: -1" + "'", str21, " () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " () - Copies: -1" + "'", str26, " () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setName("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.getType();
        item7.setItemId(0);
        java.lang.String str19 = item7.toCsvString();
        item7.setCopiesAvailable(32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str15, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!" + "'", str19, "0,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        int int18 = item7.getCopiesAvailable();
        item7.setType("hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35");
        java.lang.String str21 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi! (hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35) - Copies: 1" + "'", str21, "-1,,hi!,,1,hi!,hi! (hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35) - Copies: 1");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        item7.setAuthor("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        item7.setItemId(52);
        int int20 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
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
        item7.setName("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
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
        item7.setLocation("-1,-1,hi!,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,,0,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.toString();
        item7.setAuthor("52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setGenre("32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,52,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        java.lang.String str23 = item7.toCsvString();
        item7.setGenre("-1,,hi!,,32,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str18, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,,-1,,hi!,,1,hi!,hi!,,100,52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,52,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1," + "'", str23, "-1,,-1,,hi!,,1,hi!,hi!,,100,52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,52,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("hi! () - Copies: 35");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str12 = item7.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setCopiesAvailable((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getType();
        item7.setItemId((int) (short) -1);
        java.lang.String str14 = item7.toString();
        item7.setGenre("-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setName("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        int int16 = item7.getCopiesAvailable();
        int int17 = item7.getItemId();
        item7.setCopiesAvailable(97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        item7.setItemId(0);
        java.lang.String str20 = item7.getType();
        item7.setGenre(" () - Copies: 1");
        item7.setGenre("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        item7.setLocation("hi!");
        item7.setGenre("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        int int19 = item7.getCopiesAvailable();
        java.lang.String str20 = item7.toCsvString();
        java.lang.String str21 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,hi!,0,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,,hi!,hi!,0,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str21, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str20 = item7.toCsvString();
        item7.setItemId(32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,-1,,hi!,,1,hi!,hi!,,52,hi!,hi! () - Copies: 1" + "'", str20, "-1,,-1,,hi!,,1,hi!,hi!,,52,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setItemId((int) (byte) 10);
        item7.setItemId(100);
        item7.setGenre("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        item7.setGenre("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        int int10 = item7.getItemId();
        java.lang.String str11 = item7.getName();
        int int12 = item7.getCopiesAvailable();
        item7.setGenre("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setCopiesAvailable((int) '#');
        java.lang.String str15 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int18 = item7.getItemId();
        int int19 = item7.getItemId();
        item7.setName("-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,-1,,hi!,,1,hi!,hi! () - Copies: 100");
        item7.setName("52,-1,,hi!,,1,hi!,hi! () - Copies: 100,-1,,hi!,,1,hi! () - Copies: -1,hi!,32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1,0,0,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        gui.Item item7 = new gui.Item(1, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 35, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "");
        java.lang.String str8 = item7.getAuthor();
        item7.setAuthor("1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str8, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
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
        item7.setName("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 1" + "'", str21, "hi! () - Copies: 1");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getLocation();
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getAuthor();
        java.lang.String str12 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setAuthor("52,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,,-1,hi! () - Copies: 1 (hi!) - Copies: 0,hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
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
        java.lang.String str20 = item7.getGenre();
        item7.setLocation("hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        item7.setItemId((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getName();
        item7.setLocation("1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        item7.setAuthor("-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        gui.Item item7 = new gui.Item(1, "hi! () - Copies: 1", "-1,,hi!,,100,hi!,hi! () - Copies: 1", "hi! () - Copies: -1", (int) ' ', "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "hi! () - Copies: -1");
        java.lang.String str8 = item7.toString();
        item7.setType("-1,hi!,hi!,,1,hi!,hi!");
        int int11 = item7.getItemId();
        item7.setGenre("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32" + "'", str8, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
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
        item7.setItemId((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        item7.setLocation("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getAuthor();
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1", "10,,hi!,,1,hi!,hi!", "", (int) '4', "10,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,,35,hi!,hi!", "32,,hi!,,35,52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,");
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        item7.setLocation("hi!");
        java.lang.String str12 = item7.toString();
        int int13 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        java.lang.String str12 = item7.toCsvString();
        int int13 = item7.getItemId();
        item7.setName("32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getName();
        item7.setCopiesAvailable(52);
        item7.setLocation("1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1 () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str16, "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        int int11 = item7.getCopiesAvailable();
        java.lang.String str12 = item7.getLocation();
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setAuthor("32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,97,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        java.lang.String str10 = item7.getGenre();
        java.lang.String str11 = item7.getAuthor();
        java.lang.String str12 = item7.getLocation();
        item7.setGenre("hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str11, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str10 = item7.toCsvString();
        item7.setCopiesAvailable((int) (byte) -1);
        item7.setCopiesAvailable((int) (short) 1);
        item7.setName("-1,,hi!,,1,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str10, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        gui.Item item7 = new gui.Item(52, "-1,hi!,hi!,,1,hi!,hi!", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1", (int) (short) 100, "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,", "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str8 = item7.getType();
        java.lang.String str9 = item7.getType();
        item7.setName("-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str8, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str9, "-1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getName();
        int int17 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: 35", "", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (byte) 100, "hi! () - Copies: 1 (hi!) - Copies: 0", "hi! () - Copies: 35");
        item7.setName("-1,hi!,hi!,,1,hi!,hi!");
        int int10 = item7.getItemId();
        java.lang.String str11 = item7.getName();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str11, "-1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str12 = item7.toCsvString();
        item7.setCopiesAvailable(0);
        java.lang.String str15 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getName();
        item7.setLocation("-1,,hi!,,1,0,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
        java.lang.Class<?> wildcardClass19 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        item7.setLocation("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getAuthor();
        int int18 = item7.getItemId();
        java.lang.String str19 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("hi! () - Copies: 35");
        java.lang.String str10 = item7.getName();
        item7.setType("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
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
        java.lang.String str21 = item7.getAuthor();
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
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
        java.lang.String str18 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str18, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getLocation();
        item7.setAuthor("0,,hi!,,32,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
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
        java.lang.String str24 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! (32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,) - Copies: -1" + "'", str24, "hi! (32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,) - Copies: -1");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        item7.setItemId((int) (byte) 0);
        item7.setType("100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!" + "'", str18, "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
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
        int int22 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        gui.Item item7 = new gui.Item((int) (byte) 10, "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 0, "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setName("hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getLocation();
        java.lang.String str15 = item7.getGenre();
        int int16 = item7.getCopiesAvailable();
        item7.setItemId((int) '#');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setCopiesAvailable(0);
        java.lang.String str18 = item7.getType();
        java.lang.String str19 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 0" + "'", str19, "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 0");
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.toString();
        int int18 = item7.getCopiesAvailable();
        item7.setAuthor("-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: -1" + "'", str17, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.toString();
        item7.setAuthor("-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
        gui.Item item7 = new gui.Item((int) (byte) 100, "hi! () - Copies: 1", "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", (int) (byte) -1, "hi! () - Copies: -1", "-1,,hi!,,1,hi!,hi! () - Copies: 100");
        java.lang.String str8 = item7.getLocation();
        java.lang.String str9 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1," + "'", str8, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1," + "'", str9, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.toString();
        item7.setAuthor("-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setType("-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " () - Copies: 10" + "'", str11, " () - Copies: 10");
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setAuthor("hi!");
        item7.setType("hi!");
        item7.setItemId(0);
        java.lang.String str18 = item7.getName();
        item7.setItemId((int) (short) 100);
        item7.setGenre("1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,,100,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str18 = item7.getAuthor();
        int int19 = item7.getItemId();
        item7.setLocation("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str18, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
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
        item7.setAuthor("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
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
        java.lang.String str23 = item7.getGenre();
        java.lang.String str24 = item7.getAuthor();
        item7.setName("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str23, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        item7.setName("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setItemId(35);
        item7.setItemId(1);
        item7.setType("10,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,,35,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setGenre("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable(32);
        java.lang.String str12 = item7.getName();
        item7.setType("0,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
        java.lang.String str15 = item7.getLocation();
        item7.setType("1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!,1,-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
        gui.Item item7 = new gui.Item((-1), "", "-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!", (int) (short) 100, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        java.lang.String str8 = item7.toCsvString();
        item7.setAuthor("hi! (0,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setAuthor("32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35" + "'", str8, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        item7.setAuthor(" () - Copies: 100");
        item7.setGenre("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str21 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str21, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId(32);
        item7.setType("-1,,hi!,-1,,hi!,,1,hi!,hi!,100,hi!,hi! () - Copies: 1");
        java.lang.String str21 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
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
        java.lang.String str20 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setCopiesAvailable((-1));
        item7.setName("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        item7.setLocation("1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str24 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str24, "1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getName();
        item7.setItemId(1);
        item7.setItemId((int) 'a');
        java.lang.String str21 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("hi!");
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setName("hi! () - Copies: 32");
        java.lang.String str20 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        java.lang.String str18 = item7.getLocation();
        int int19 = item7.getItemId();
        item7.setName("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str22 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getCopiesAvailable();
        java.lang.String str18 = item7.getGenre();
        java.lang.String str19 = item7.getGenre();
        java.lang.String str20 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str19, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        gui.Item item7 = new gui.Item(0, "-1,,hi!,,-1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,", "32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!", "1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", 10, "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1", "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setLocation("hi! () - Copies: 32");
        int int10 = item7.getItemId();
        java.lang.String str11 = item7.getName();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!" + "'", str11, "32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
        gui.Item item7 = new gui.Item(10, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1", (int) ' ', "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "");
        item7.setLocation("");
        java.lang.String str10 = item7.getName();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        item7.setName("-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str10, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.toString();
        java.lang.String str16 = item7.getAuthor();
        int int17 = item7.getCopiesAvailable();
        java.lang.String str18 = item7.getName();
        java.lang.String str19 = item7.getType();
        java.lang.String str20 = item7.getGenre();
        java.lang.String str21 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        java.lang.String str8 = item7.toString();
        item7.setName("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setGenre("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 35" + "'", str8, "hi! () - Copies: 1 (hi!) - Copies: 35");
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getGenre();
        item7.setGenre("-1,,hi!,,35,hi!,");
        int int20 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        java.lang.String str10 = item7.getGenre();
        item7.setLocation("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setItemId((int) (short) 100);
        item7.setCopiesAvailable((int) (byte) 1);
        item7.setItemId((int) (byte) -1);
        item7.setGenre("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str21 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str21, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        int int10 = item7.getCopiesAvailable();
        java.lang.String str11 = item7.toCsvString();
        item7.setAuthor("hi! () - Copies: 35");
        item7.setGenre("1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str11, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.getName();
        int int19 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 100 + "'", int19 == 100);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        java.lang.String str8 = item7.getAuthor();
        item7.setItemId((int) (byte) 10);
        item7.setName(" (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
        int int13 = item7.getCopiesAvailable();
        java.lang.String str14 = item7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10 () - Copies: 1" + "'", str14, " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10 () - Copies: 1");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str16 = item7.getLocation();
        item7.setLocation("100,,hi!,,32,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.toString();
        item7.setItemId(10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1" + "'", str16, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1");
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        gui.Item item7 = new gui.Item((int) (byte) 100, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", " () - Copies: 100", "", (int) 'a', "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.getName();
        java.lang.String str18 = item7.getAuthor();
        java.lang.String str19 = item7.getLocation();
        java.lang.String str20 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str19, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
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
        java.lang.String str22 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        gui.Item item7 = new gui.Item((int) (short) -1, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", "-1,,hi!,,1,hi!,hi! () - Copies: 100", 35, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str8 = item7.getType();
        int int9 = item7.getItemId();
        java.lang.String str10 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100" + "'", str8, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str10, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
        gui.Item item7 = new gui.Item(52, "hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 52", "0,,hi!,,32,hi!,hi! (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 32", "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1", (int) (byte) 100, "-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        item7.setLocation("0,,hi!,,1,hi!,hi!");
        java.lang.String str20 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        int int15 = item7.getItemId();
        java.lang.String str16 = item7.getGenre();
        java.lang.String str17 = item7.toCsvString();
        int int18 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str17, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setAuthor(" () - Copies: 100");
        item7.setName("0,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.getName();
        java.lang.String str19 = item7.getAuthor();
        java.lang.Class<?> wildcardClass20 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str18, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " () - Copies: 100" + "'", str19, " () - Copies: 100");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
        gui.Item item7 = new gui.Item((int) (short) 100, "hi! () - Copies: 1", "1,,,,100,-1,,hi!,,1,hi!,hi!,", "-1,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, (hi! () - Copies: -1) - Copies: -1,hi!,,1,hi!,hi!", 0, "hi! () - Copies: 1 (hi!) - Copies: 35", " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
        gui.Item item7 = new gui.Item((int) ' ', "hi! (1,,hi!,,1,-1,,hi!,,1,hi!,hi!,) - Copies: 1", "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!", "100,hi!,hi! () - Copies: 1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", (int) (short) 10, "-1,,-1,,hi!,hi!,100,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!,0,hi!,hi! () - Copies: 1", "");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        int int9 = item7.getItemId();
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setItemId((int) (byte) 100);
        java.lang.String str14 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100,,,hi! () - Copies: 1,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1," + "'", str14, "100,,,hi! () - Copies: 1,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
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
        item7.setLocation("-1,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setLocation("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str13 = item7.getAuthor();
        int int14 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toString();
        int int15 = item7.getCopiesAvailable();
        java.lang.String str16 = item7.getGenre();
        java.lang.String str17 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 35" + "'", str14, "hi! () - Copies: 35");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
        gui.Item item7 = new gui.Item((int) (short) 0, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi!", "-1,,hi!,,1,hi!,hi!", (int) (short) 100, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!");
        item7.setType("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setLocation("-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str10 = item7.getType();
        java.lang.String str11 = item7.toCsvString();
        item7.setGenre("-1,,hi!,,32,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,52,hi!," + "'", str11, "-1,,hi!,,52,hi!,");
    }

    @Test
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getGenre();
        int int17 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.toCsvString();
        item7.setLocation("hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str17, "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        gui.Item item7 = new gui.Item(32, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,1,hi!,", "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", (int) 'a', "", "-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getLocation();
        java.lang.String str9 = item7.toCsvString();
        java.lang.String str10 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!" + "'", str8, "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "32,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,97,,-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!" + "'", str9, "32,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,97,,-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!," + "'", str10, "-1,,hi!,,1,hi!,");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setAuthor("1,,hi!,,1,hi!,hi!");
        item7.setAuthor("hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!," + "'", str10, "-1,,hi!,,1,hi!,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        int int10 = item7.getCopiesAvailable();
        java.lang.String str11 = item7.getGenre();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        gui.Item item7 = new gui.Item((int) (short) 0, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi!", "-1,,hi!,,1,hi!,hi!", (int) (short) 100, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getGenre();
        java.lang.String str11 = item7.getGenre();
        java.lang.Class<?> wildcardClass12 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str10, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str11, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        gui.Item item7 = new gui.Item((int) (short) 0, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 32, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getItemId();
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str11 = item7.getName();
        item7.setType("0,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str11, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: 1 (hi!) - Copies: 0", "", "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (byte) 10, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52", " (hi!) - Copies: 1");
        item7.setCopiesAvailable((int) (short) 0);
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        int int12 = item7.getItemId();
        int int13 = item7.getCopiesAvailable();
        int int14 = item7.getItemId();
        item7.setType("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        item7.setItemId((int) ' ');
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.Class<?> wildcardClass19 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        gui.Item item7 = new gui.Item((int) 'a', "hi! () - Copies: 35", "hi!", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (short) -1, "hi! () - Copies: 1", "hi! () - Copies: 1");
        int int8 = item7.getCopiesAvailable();
        item7.setGenre("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        java.lang.String str11 = item7.getAuthor();
        item7.setGenre("100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        int int14 = item7.getCopiesAvailable();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
        gui.Item item7 = new gui.Item((int) ' ', "hi! () - Copies: 1", "-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!", "35,,hi!,,1,hi! () - Copies: -1,hi!", (int) '4', "-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str14 = item7.getLocation();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getAuthor();
        int int18 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str20 = item7.getGenre();
        item7.setItemId((int) (byte) 100);
        item7.setAuthor("hi! (hi!) - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! () - Copies: 1" + "'", str20, "hi! () - Copies: 1");
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        gui.Item item7 = new gui.Item((-1), "35,,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!", "-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!", "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", (-1), "-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!", "0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        java.lang.String str18 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        gui.Item item7 = new gui.Item(100, "", "-1,,hi!,,1,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,hi!", "hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1", (int) (short) 100, "-1,,hi!,,1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!", " (hi! () - Copies: 32) - Copies: 100");
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.toString();
        item7.setAuthor("52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setGenre("32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,52,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        item7.setType("-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str18, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getLocation();
        java.lang.String str12 = item7.toString();
        item7.setName("52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!");
        java.lang.String str15 = item7.getGenre();
        java.lang.Class<?> wildcardClass16 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setLocation(" () - Copies: 10");
        java.lang.String str10 = item7.getAuthor();
        java.lang.String str11 = item7.getAuthor();
        item7.setName("-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str10, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str11, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getName();
        item7.setLocation("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        java.lang.String str19 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 1" + "'", str19, "hi! () - Copies: 1");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("0,,hi!,,1,hi!,hi!");
        int int20 = item7.getCopiesAvailable();
        java.lang.String str21 = item7.getGenre();
        item7.setName("1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 1,0,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.getType();
        int int13 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str13 = item7.getAuthor();
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.toString();
        item7.setItemId(52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str13, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        item7.setLocation("hi!");
        java.lang.String str12 = item7.toString();
        item7.setItemId((int) (short) 0);
        item7.setType("-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str17 = item7.getLocation();
        java.lang.Class<?> wildcardClass18 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
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
        java.lang.Class<?> wildcardClass19 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setAuthor("hi!");
        item7.setType("hi!");
        item7.setItemId(0);
        item7.setGenre("-1,,hi!,,35,hi!,hi!");
        int int20 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
        gui.Item item7 = new gui.Item((int) (byte) 100, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35", "0,hi! () - Copies: 1,hi!,,1,hi!,hi!", (int) 'a', "hi! () - Copies: 10", "-1,,hi!,,1,hi! () - Copies: -1,hi!");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        gui.Item item7 = new gui.Item(0, "32,,hi!,,35,52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35", 32, "1,hi! () - Copies: 32,,,100,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 1", " () - Copies: 10");
        java.lang.String str8 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 10" + "'", str8, " () - Copies: 10");
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getGenre();
        item7.setAuthor("32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        int int20 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        java.lang.String str12 = item7.toCsvString();
        item7.setName("-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setItemId(100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
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
        item7.setType("52,-1,,hi!,,1,hi!,hi! () - Copies: 100,-1,,hi!,,1,hi! () - Copies: -1,hi!,32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1,0,0,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setItemId(10);
        item7.setGenre("-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
        int int13 = item7.getCopiesAvailable();
        item7.setCopiesAvailable(97);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setItemId((int) (byte) 10);
        item7.setItemId(100);
        item7.setGenre("");
        int int14 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        gui.Item item7 = new gui.Item(10, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100", "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 32, " () - Copies: 10", "-1,hi!,hi!,,1,hi!,hi!");
        item7.setLocation("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getLocation();
        item7.setType("hi! () - Copies: 1");
        java.lang.String str12 = item7.getType();
        item7.setType("-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        gui.Item item7 = new gui.Item((int) '#', "", "0,hi! () - Copies: -1,hi!,,1,hi!,hi!", "0,hi! () - Copies: -1,hi!,,1,hi!,hi!", (int) (short) -1, "", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        item7.setName("hi! () - Copies: 32");
        item7.setGenre("");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        int int13 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        java.lang.String str13 = item7.getName();
        java.lang.String str14 = item7.toString();
        item7.setItemId((int) (short) 100);
        item7.setItemId((int) (short) 0);
        item7.setName("-1,,hi!,,1,hi!,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 35" + "'", str14, "hi! () - Copies: 35");
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        item7.setCopiesAvailable((int) '#');
        item7.setType("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!");
        item7.setName("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!");
        java.lang.String str22 = item7.getLocation();
        item7.setAuthor("35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str25 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str25, "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        gui.Item item7 = new gui.Item((int) (byte) 0, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,,-1,,hi!,hi!,100,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!,0,hi!,hi! () - Copies: 1", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 0", (int) (byte) 10, "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi! () - Copies: 35", "-1,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setItemId(10);
        item7.setGenre("-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str13 = item7.getName();
        java.lang.String str14 = item7.getGenre();
        item7.setCopiesAvailable((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str14, "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        item7.setName("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        int int20 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        gui.Item item7 = new gui.Item((int) (short) -1, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", "-1,,hi!,,1,hi!,hi! () - Copies: 100", 35, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str8 = item7.getType();
        java.lang.String str9 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100" + "'", str8, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100" + "'", str9, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,,hi!,,1,hi!,", (-1), "", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) '#');
        item7.setAuthor("0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        int int9 = item7.getCopiesAvailable();
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getAuthor();
        java.lang.String str12 = item7.toString();
        java.lang.String str13 = item7.getName();
        item7.setGenre(" (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " () - Copies: 100" + "'", str12, " () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("hi! () - Copies: 1");
        item7.setType("hi! () - Copies: 32");
        java.lang.String str12 = item7.getGenre();
        item7.setAuthor("1,hi!,hi! () - Copies: 1,,35,hi! () - Copies: 35,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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
        java.lang.String str22 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 32" + "'", str19, "hi! () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 32" + "'", str21, "hi! () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "0,,hi!,,32,hi!,hi!" + "'", str22, "0,,hi!,,32,hi!,hi!");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.toCsvString();
        int int13 = item7.getCopiesAvailable();
        item7.setItemId((int) (short) 10);
        int int16 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        java.lang.String str17 = item7.getAuthor();
        item7.setType("hi! () - Copies: 1");
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setItemId(10);
        item7.setCopiesAvailable((int) 'a');
        java.lang.String str26 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        gui.Item item7 = new gui.Item((int) (byte) 10, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0", "", "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!", (-1), "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!", "0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getAuthor();
        java.lang.String str9 = item7.getLocation();
        java.lang.String str10 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!" + "'", str8, "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str9, "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!" + "'", str10, "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getName();
        int int15 = item7.getCopiesAvailable();
        java.lang.String str16 = item7.toString();
        java.lang.Class<?> wildcardClass17 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 35" + "'", str16, "hi! () - Copies: 35");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", (int) (short) 10, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "");
        item7.setName(" () - Copies: 10");
        int int10 = item7.getItemId();
        item7.setItemId((int) '#');
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        gui.Item item7 = new gui.Item((int) (short) -1, "0,,hi!,,32,hi!,hi! (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 32", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", " () - Copies: 10", 0, "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        int int8 = item7.getCopiesAvailable();
        item7.setGenre("-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int11 = item7.getItemId();
        java.lang.Class<?> wildcardClass12 = item7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
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
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,hi!,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        gui.Item item7 = new gui.Item(10, "0,,hi!,0,,hi!,,1,hi!,hi!,32,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "32,,,,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,,hi!,100,hi!,hi! () - Copies: 1", "0,hi! () - Copies: -1,hi!,,1,hi!,hi!", (int) (short) -1, "", "-1,,,,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: 1 (hi!) - Copies: 0", "", "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (byte) 10, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52", " (hi!) - Copies: 1");
        item7.setItemId((int) (byte) 0);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        gui.Item item7 = new gui.Item((int) (short) 0, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi!", "-1,,hi!,,1,hi!,hi!", (int) (short) 100, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.toCsvString();
        item7.setCopiesAvailable((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!" + "'", str10, "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getLocation();
        java.lang.String str18 = item7.toString();
        java.lang.String str19 = item7.getName();
        java.lang.String str20 = item7.getType();
        java.lang.String str21 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 1" + "'", str18, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str21, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        java.lang.String str17 = item7.getAuthor();
        item7.setType("hi! () - Copies: 1");
        item7.setItemId((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
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
        int int24 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int15 = item7.getItemId();
        item7.setLocation("10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.toString();
        int int19 = item7.getItemId();
        item7.setLocation("-1,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,hi!,,-1,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 1" + "'", str18, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
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
        item7.setLocation("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        int int26 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!" + "'", str19, "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        gui.Item item7 = new gui.Item(100, "hi! () - Copies: 1 (hi!) - Copies: 0", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", (int) (byte) 0, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getCopiesAvailable();
        item7.setType("32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str11 = item7.toString();
        item7.setCopiesAvailable(32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 0" + "'", str11, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 0");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getName();
        int int16 = item7.getCopiesAvailable();
        item7.setItemId(32);
        java.lang.String str19 = item7.getName();
        java.lang.String str20 = item7.toCsvString();
        int int21 = item7.getItemId();
        item7.setAuthor("10,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "32,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str20, "32,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable(0);
        int int15 = item7.getCopiesAvailable();
        java.lang.Class<?> wildcardClass16 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        gui.Item item7 = new gui.Item((int) '4', "-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1", "0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,35,hi!,hi! () - Copies: 1", (int) (short) 0, "-1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,0,,hi!,,1,hi!,hi!,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!", "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
        gui.Item item7 = new gui.Item((int) (byte) 1, "-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32", "hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0", 52, "", "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str8 = item7.getType();
        item7.setItemId((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str8, "-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
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
        java.lang.String str23 = item7.toCsvString();
        java.lang.Class<?> wildcardClass24 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str23, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str14 = item7.getLocation();
        item7.setLocation("-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setItemId((int) (byte) 1);
        item7.setLocation("");
        java.lang.String str21 = item7.toString();
        int int22 = item7.getCopiesAvailable();
        java.lang.String str23 = item7.getGenre();
        item7.setType("1,,,52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 1" + "'", str21, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str23, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        int int10 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        gui.Item item7 = new gui.Item(35, "-1,,hi!,,1,hi!,hi!", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,hi!,hi!,10,hi!,hi!", (int) (short) 0, "-1,,hi!,,35,hi!,hi!", "-1,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getLocation();
        int int9 = item7.getItemId();
        java.lang.String str10 = item7.toCsvString();
        java.lang.String str11 = item7.getName();
        item7.setLocation("-1,hi! () - Copies: 1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str10, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getLocation();
        java.lang.String str12 = item7.toString();
        item7.setCopiesAvailable(0);
        java.lang.String str15 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,0,hi!,hi!" + "'", str15, "-1,,hi!,,0,hi!,hi!");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setAuthor("hi!");
        java.lang.String str14 = item7.toString();
        java.lang.String str15 = item7.toString();
        java.lang.String str16 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.getName();
        item7.setItemId((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.toString();
        int int16 = item7.getCopiesAvailable();
        item7.setCopiesAvailable(100);
        item7.setAuthor("-1,,-1,,hi!,hi!,100,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!,0,hi!,hi! () - Copies: 1");
        item7.setGenre("-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
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
        java.lang.String str22 = item7.getAuthor();
        java.lang.String str23 = item7.getType();
        java.lang.String str24 = item7.getAuthor();
        java.lang.String str25 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str23, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        item7.setLocation("0,,hi!,,1,hi!,hi!");
        item7.setName("0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) -1);
        item7.setType("1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        gui.Item item7 = new gui.Item((int) (short) 0, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 32, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getCopiesAvailable();
        java.lang.String str9 = item7.getType();
        java.lang.String str10 = item7.getType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str9, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str10, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str16 = item7.toString();
        item7.setGenre("");
        int int19 = item7.getItemId();
        int int20 = item7.getItemId();
        java.lang.String str21 = item7.getName();
        java.lang.String str22 = item7.toCsvString();
        java.lang.String str23 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,-1,hi!," + "'", str22, "-1,,hi!,,-1,hi!,");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
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
        java.lang.String str21 = item7.getLocation();
        java.lang.String str22 = item7.getName();
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str19, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getLocation();
        int int9 = item7.getItemId();
        item7.setType("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        gui.Item item7 = new gui.Item((int) '4', "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35", "-1,hi!,hi!,,1,hi!,hi!", "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", (int) (byte) 10, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.String str8 = item7.getAuthor();
        item7.setName("-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("");
        item7.setLocation("32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str8, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str17 = item7.getGenre();
        java.lang.String str18 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str18, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setAuthor("hi! () - Copies: -1");
        java.lang.String str13 = item7.getType();
        item7.setItemId(35);
        item7.setLocation("-1,,hi!,,1,hi!,");
        java.lang.String str18 = item7.getGenre();
        java.lang.String str19 = item7.getType();
        java.lang.String str20 = item7.getLocation();
        java.lang.String str21 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi!," + "'", str20, "-1,,hi!,,1,hi!,");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        gui.Item item7 = new gui.Item((int) (byte) 0, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! () - Copies: 1", "-1,,hi!,,100,hi!,hi! () - Copies: 1", (-1), "hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str8 = item7.getType();
        java.lang.String str9 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str8, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setItemId(10);
        item7.setAuthor("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        item7.setLocation("-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str15 = item7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " () - Copies: 10" + "'", str15, " () - Copies: 10");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("hi!");
        item7.setType("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setName("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.getType();
        item7.setGenre("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.getName();
        java.lang.String str20 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str15, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str19, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 1" + "'", str20, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 1");
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        gui.Item item7 = new gui.Item((int) ' ', "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!", "32,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!", (int) (byte) 1, "1,,hi!,,1,hi!,hi!", "1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100");
        java.lang.String str8 = item7.getGenre();
        item7.setLocation("");
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100" + "'", str8, "1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!" + "'", str11, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!,,1,1,,hi!,,1,hi!,hi!,1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100" + "'", str12, "32,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!,,1,1,,hi!,,1,hi!,hi!,1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        gui.Item item7 = new gui.Item(32, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "hi! () - Copies: 1", "hi! () - Copies: 35", (int) (byte) 0, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getLocation();
        item7.setCopiesAvailable((int) '4');
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("-1,,hi!,,1,hi!,");
        item7.setGenre("-1,,hi!,,1,hi!,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1");
        java.lang.String str16 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 35" + "'", str8, "hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        gui.Item item7 = new gui.Item(35, "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!,1,-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!", "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", (int) (short) 0, "97,,-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,,hi!,,-1, () - Copies: 100,-1,,hi!,,1,hi!,hi! () - Copies: 100");
        java.lang.String str8 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.toString();
        item7.setItemId((int) 'a');
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str20 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getCopiesAvailable();
        java.lang.String str18 = item7.toCsvString();
        java.lang.String str19 = item7.getGenre();
        java.lang.String str20 = item7.toCsvString();
        item7.setGenre("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str19, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setGenre("");
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.toCsvString();
        item7.setAuthor("0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int16 = item7.getCopiesAvailable();
        int int17 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!," + "'", str12, "-1,,hi!,,1,hi!,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,hi!," + "'", str13, "-1,,hi!,,1,hi!,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getLocation();
        item7.setCopiesAvailable((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        int int9 = item7.getCopiesAvailable();
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getAuthor();
        java.lang.String str12 = item7.toString();
        item7.setType("-1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
        java.lang.String str15 = item7.getName();
        int int16 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " () - Copies: 100" + "'", str12, " () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        item7.setLocation("");
        item7.setAuthor("-1,hi!,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1) - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        item7.setItemId((int) (short) 1);
        int int19 = item7.getCopiesAvailable();
        java.lang.String str20 = item7.getAuthor();
        java.lang.String str21 = item7.getLocation();
        java.lang.String str22 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }
}

