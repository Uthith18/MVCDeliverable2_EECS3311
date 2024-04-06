package gui.randoopTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0501");
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
        java.lang.String str27 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "10,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str27, "10,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str15 = item7.getAuthor();
        item7.setCopiesAvailable((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str15, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.getType();
        java.lang.String str10 = item7.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! (hi! () - Copies: 1) - Copies: 10" + "'", str10, "hi! (hi! () - Copies: 1) - Copies: 10");
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! () - Copies: 1", (int) (short) 1, "hi! () - Copies: 1", "-1,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("hi!");
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.getType();
        int int14 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str12, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getLocation();
        java.lang.String str15 = item7.getGenre();
        int int16 = item7.getCopiesAvailable();
        item7.setAuthor("0,,hi!,,32,hi!,hi!");
        item7.setLocation("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
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
        java.lang.Class<?> wildcardClass23 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str20, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        item7.setItemId((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        gui.Item item7 = new gui.Item(52, "-1,hi!,hi!,,1,hi!,hi!", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1", (int) (short) 100, "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,", "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str8 = item7.getType();
        java.lang.String str9 = item7.getType();
        int int10 = item7.getCopiesAvailable();
        item7.setAuthor("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str8, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str9, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
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
        java.lang.Class<?> wildcardClass22 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        item7.setAuthor("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getAuthor();
        item7.setLocation("10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,100,hi!,hi! () - Copies: 1");
        java.lang.Class<?> wildcardClass13 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setLocation("");
        java.lang.String str13 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str13, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setName("hi! () - Copies: -1");
        java.lang.String str19 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("hi! () - Copies: 35");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 35," + "'", str11, "-1,,hi!,,1,hi! () - Copies: 35,");
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        int int10 = item7.getCopiesAvailable();
        item7.setGenre("-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getGenre();
        item7.setGenre("-1,,hi!,,35,hi!,");
        item7.setType("hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
        gui.Item item7 = new gui.Item(0, "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,0,hi! () - Copies: -1,hi!,,1,hi!,hi!", "32, () - Copies: -1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi! () - Copies: 1 (hi!) - Copies: 35", "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", 0, "-1,,hi!,,35,hi!,hi!", " () - Copies: 1");
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
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
        java.lang.String str22 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str22, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        item7.setCopiesAvailable((-1));
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,hi!,,-1,hi!," + "'", str14, "-1,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,hi!,,-1,hi!,");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        gui.Item item7 = new gui.Item((int) (byte) 1, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", "", (int) (byte) 100, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1");
        item7.setItemId((int) ' ');
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        gui.Item item7 = new gui.Item(35, "32,,hi!,,1,hi! () - Copies: 1,hi!", "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) '4', "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        java.lang.String str8 = item7.getType();
        item7.setAuthor("-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
        java.lang.String str11 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getLocation();
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getLocation();
        int int12 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        int int12 = item7.getCopiesAvailable();
        java.lang.String str13 = item7.toString();
        java.lang.String str14 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! () - Copies: 1" + "'", str13, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        int int14 = item7.getCopiesAvailable();
        item7.setItemId((int) (byte) 0);
        item7.setItemId((int) 'a');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        gui.Item item7 = new gui.Item((int) (byte) 10, "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", "hi!", "-1,,hi!,,35,hi!,", 1, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "");
        int int8 = item7.getCopiesAvailable();
        item7.setItemId((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
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
        java.lang.String str23 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str23, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.Class<?> wildcardClass13 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.toString();
        int int18 = item7.getCopiesAvailable();
        java.lang.String str19 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: -1" + "'", str17, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str19, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        item7.setGenre("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        int int10 = item7.getItemId();
        java.lang.String str11 = item7.getAuthor();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setName("hi!");
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.getName();
        item7.setAuthor("-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
        java.lang.String str18 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,hi!" + "'", str18, "-1,,hi!,,1,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,hi!");
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        gui.Item item7 = new gui.Item((int) '4', "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "10,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", (int) (byte) 0, "-1,,hi!,hi!,100,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getAuthor();
        item7.setType("hi! () - Copies: 1");
        item7.setAuthor("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        item7.setName("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.Class<?> wildcardClass26 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        java.lang.String str12 = item7.toCsvString();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!" + "'", str16, "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
        gui.Item item7 = new gui.Item((int) (short) -1, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", "-1,,hi!,,1,hi!,hi! () - Copies: 100", 35, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str8 = item7.getType();
        item7.setCopiesAvailable((int) (short) 10);
        java.lang.String str11 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100" + "'", str8, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100" + "'", str11, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getName();
        item7.setItemId(0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!," + "'", str10, "-1,,hi!,,1,hi!,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("");
        java.lang.String str15 = item7.getName();
        item7.setAuthor("10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        int int9 = item7.getItemId();
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setLocation("");
        java.lang.String str14 = item7.getAuthor();
        item7.setLocation("1,,,,100,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str14, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
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
        item7.setName("-1,,hi!,,1,hi! () - Copies: -1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getAuthor();
        item7.setType("hi! () - Copies: 1");
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.toCsvString();
        item7.setItemId((int) ' ');
        item7.setAuthor("-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!" + "'", str15, "32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setGenre("hi! () - Copies: 35");
        item7.setItemId((int) (short) 10);
        item7.setCopiesAvailable((int) (byte) 1);
        int int19 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.getName();
        item7.setName("-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setAuthor("hi!");
        item7.setType("hi!");
        int int16 = item7.getItemId();
        java.lang.String str17 = item7.getType();
        java.lang.String str18 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setName("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str15 = item7.getGenre();
        int int16 = item7.getItemId();
        java.lang.String str17 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!" + "'", str17, "-1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getName();
        int int10 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        item7.setGenre("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        int int10 = item7.getItemId();
        item7.setAuthor("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.toCsvString();
        java.lang.Class<?> wildcardClass15 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setCopiesAvailable(0);
        java.lang.String str12 = item7.toString();
        java.lang.String str13 = item7.getAuthor();
        int int14 = item7.getItemId();
        item7.setItemId((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str12, "hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str13, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
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
        java.lang.String str25 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! () - Copies: 1" + "'", str24, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! () - Copies: 1" + "'", str25, "hi! () - Copies: 1");
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        gui.Item item7 = new gui.Item((int) ' ', " () - Copies: -1", "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,1,hi!,", (int) (byte) 1, "hi! () - Copies: -1", "hi! () - Copies: 1 (hi!) - Copies: 35");
        java.lang.String str8 = item7.getLocation();
        item7.setType("hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!," + "'", str8, "-1,,hi!,,1,hi!,");
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
        gui.Item item7 = new gui.Item((int) (byte) 100, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", " () - Copies: 100", "", (int) 'a', "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        item7.setCopiesAvailable(10);
        item7.setName("-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        item7.setLocation("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getAuthor();
        java.lang.String str18 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
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
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,,hi!,hi!,100,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! () - Copies: 1" + "'", str26, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1" + "'", str27, "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toString();
        int int15 = item7.getCopiesAvailable();
        java.lang.String str16 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 35" + "'", str14, "hi! () - Copies: 35");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        gui.Item item7 = new gui.Item(0, "-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,32,hi!,hi! (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 32", "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", 35, "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!", "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str13 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32", "", "-1,,hi!,,52,hi!,", 97, "1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,-1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        item7.setLocation("hi!");
        item7.setGenre("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (short) 10);
        java.lang.String str21 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.getName();
        item7.setAuthor("-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32");
        item7.setGenre("hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setCopiesAvailable((int) '#');
        item7.setGenre("10,,hi!,,1,hi!,hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
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
        item7.setItemId((int) (short) 10);
        item7.setItemId((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        java.lang.String str8 = item7.getAuthor();
        item7.setLocation("hi! () - Copies: 1 (hi!) - Copies: 35");
        item7.setGenre("hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        gui.Item item7 = new gui.Item((int) ' ', "hi! () - Copies: 35", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", (int) 'a', "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.getLocation();
        java.lang.String str12 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52" + "'", str10, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str11, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1," + "'", str12, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        item7.setName("");
        item7.setAuthor("-1,,hi!,,52,hi!,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable(0);
        java.lang.String str15 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str15, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
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
        java.lang.String str21 = item7.getType();
        int int22 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setAuthor("hi! () - Copies: -1");
        java.lang.String str13 = item7.getName();
        java.lang.Class<?> wildcardClass14 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,100,hi!,hi! () - Copies: 1");
        java.lang.String str13 = item7.toCsvString();
        item7.setName("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,1,0,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1," + "'", str13, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        gui.Item item7 = new gui.Item(32, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "hi! () - Copies: 1", "hi! () - Copies: 35", (int) (byte) 0, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getLocation();
        int int9 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 35" + "'", str8, "hi! () - Copies: 35");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        gui.Item item7 = new gui.Item((int) (short) 1, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "", (int) (short) 1, "0,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        java.lang.String str9 = item7.toString();
        java.lang.String str10 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1" + "'", str9, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str10, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
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
        java.lang.Class<?> wildcardClass25 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getLocation();
        item7.setType("");
        item7.setAuthor("hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
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
        int int22 = item7.getItemId();
        item7.setGenre("-1,,hi!,,52,hi!,");
        item7.setAuthor("0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str21, "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
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
        item7.setCopiesAvailable(1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str19, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        gui.Item item7 = new gui.Item((int) (short) 1, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "", (int) (short) 1, "0,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.toCsvString();
        item7.setCopiesAvailable((int) '4');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str8, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,1,0,,hi!,,1,hi!,hi!," + "'", str9, "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,1,0,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getName();
        item7.setAuthor("1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        java.lang.String str19 = item7.getLocation();
        item7.setGenre("hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        java.lang.String str23 = item7.toCsvString();
        item7.setCopiesAvailable((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1" + "'", str23, "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        item7.setCopiesAvailable((-1));
        java.lang.Class<?> wildcardClass12 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("hi! () - Copies: 35");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str12 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 35" + "'", str12, "hi! () - Copies: 35");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        gui.Item item7 = new gui.Item((int) ' ', "hi! () - Copies: 35", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", (int) 'a', "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "");
        item7.setCopiesAvailable((int) '4');
        item7.setLocation("-1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        int int12 = item7.getCopiesAvailable();
        item7.setName("1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setName("32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
        item7.setCopiesAvailable((int) 'a');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
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
        java.lang.String str24 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str24, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.getGenre();
        item7.setItemId(35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        gui.Item item7 = new gui.Item((int) ' ', "", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "hi! () - Copies: 35", (int) (byte) 10, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.String str8 = item7.getGenre();
        int int9 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str8, "hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        int int11 = item7.getCopiesAvailable();
        java.lang.String str12 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        item7.setLocation("1,,,,100,-1,,hi!,,1,hi!,hi!,");
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
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getGenre();
        java.lang.String str17 = item7.toCsvString();
        java.lang.String str18 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str17, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        gui.Item item7 = new gui.Item((int) (byte) 100, "", "-1,,hi!,,1,hi!,hi!", "32,,hi!,,1,hi! () - Copies: 1,hi!", (int) (short) 10, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100", "-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getLocation();
        item7.setCopiesAvailable((int) (short) 10);
        java.lang.String str11 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toString();
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setType("hi! () - Copies: 100");
        java.lang.Class<?> wildcardClass19 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 35" + "'", str14, "hi! () - Copies: 35");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        java.lang.String str14 = item7.getGenre();
        int int15 = item7.getItemId();
        java.lang.String str16 = item7.toString();
        item7.setItemId(10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        java.lang.String str8 = item7.getAuthor();
        int int9 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str8, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        int int11 = item7.getCopiesAvailable();
        java.lang.String str12 = item7.getLocation();
        java.lang.Class<?> wildcardClass13 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setAuthor("hi! () - Copies: -1");
        java.lang.String str13 = item7.getType();
        item7.setItemId(35);
        item7.setLocation("-1,,hi!,,1,hi!,");
        java.lang.String str18 = item7.getGenre();
        java.lang.String str19 = item7.toCsvString();
        java.lang.String str20 = item7.getLocation();
        java.lang.Class<?> wildcardClass21 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!" + "'", str19, "35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi!," + "'", str20, "-1,,hi!,,1,hi!,");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
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
        java.lang.String str23 = item7.getGenre();
        java.lang.String str24 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "10,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str24, "10,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setLocation("hi! () - Copies: -1");
        item7.setCopiesAvailable(35);
        item7.setType("32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.Class<?> wildcardClass18 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
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
        item7.setName("-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
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
        java.lang.String str23 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!" + "'", str19, "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!" + "'", str23, "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
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
        item7.setAuthor("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        item7.setLocation("hi!");
        java.lang.String str12 = item7.toString();
        java.lang.Class<?> wildcardClass13 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
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
        java.lang.String str21 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 32" + "'", str18, "hi! () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        gui.Item item7 = new gui.Item((-1), "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", (int) '4', " () - Copies: -1", "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setCopiesAvailable((int) (short) 1);
        item7.setCopiesAvailable((int) (short) 0);
        item7.setCopiesAvailable(10);
        item7.setType("-1,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getCopiesAvailable();
        java.lang.String str9 = item7.getAuthor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str9, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        gui.Item item7 = new gui.Item((int) (short) 1, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "", (int) (short) 1, "0,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.toCsvString();
        java.lang.Class<?> wildcardClass10 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str8, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,1,0,,hi!,,1,hi!,hi!," + "'", str9, "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,1,0,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        java.lang.String str22 = item7.getGenre();
        java.lang.String str23 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        java.lang.String str12 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setGenre("");
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.toString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!," + "'", str12, "-1,,hi!,,1,hi!,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! () - Copies: 1" + "'", str13, "hi! () - Copies: 1");
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
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
        java.lang.Class<?> wildcardClass24 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setAuthor("hi!");
        item7.setType("hi!");
        java.lang.String str16 = item7.getName();
        item7.setCopiesAvailable(1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
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
        java.lang.String str22 = item7.getType();
        item7.setItemId((-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
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
        java.lang.Class<?> wildcardClass19 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
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
        java.lang.String str22 = item7.getType();
        java.lang.String str23 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str23, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.getType();
        int int10 = item7.getCopiesAvailable();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
        java.lang.Class<?> wildcardClass13 = item7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        gui.Item item7 = new gui.Item((int) (byte) 1, "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!", 1, "-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!");
        java.lang.String str8 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!,1,-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!" + "'", str8, "1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!,1,-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
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
        java.lang.Class<?> wildcardClass24 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
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
        item7.setAuthor("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "32,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str20, "32,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
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
        item7.setName("hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        gui.Item item7 = new gui.Item(35, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10", "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,hi! () - Copies: 1,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!", (int) ' ', "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str16 = item7.toString();
        java.lang.String str17 = item7.getType();
        item7.setGenre("hi! () - Copies: 1");
        item7.setName("hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
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
        item7.setCopiesAvailable((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! () - Copies: 1", (int) (short) 1, "hi! () - Copies: 1", "-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable(0);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", (int) (short) 10, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        gui.Item item7 = new gui.Item(52, "-1,hi!,hi!,,1,hi!,hi!", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1", (int) (short) 100, "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,", "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setItemId((int) (byte) 10);
        item7.setItemId(100);
        int int12 = item7.getCopiesAvailable();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getType();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: -1" + "'", str14, "hi! () - Copies: -1");
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '#');
        java.lang.String str10 = item7.getName();
        int int11 = item7.getCopiesAvailable();
        item7.setType("-1,hi!,hi!,,1,hi!,hi!");
        int int14 = item7.getCopiesAvailable();
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        gui.Item item7 = new gui.Item((int) (short) 1, "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi! () - Copies: 35", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!", "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,", (int) (short) -1, "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,1,0,,hi!,,1,hi!,hi!,", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        item7.setGenre("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setName("hi! () - Copies: 1 (hi!) - Copies: 0");
        item7.setGenre("");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str15, "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        gui.Item item7 = new gui.Item(1, "hi! () - Copies: 1", "-1,,hi!,,100,hi!,hi! () - Copies: 1", "hi! () - Copies: -1", (int) ' ', "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "hi! () - Copies: -1");
        java.lang.String str8 = item7.toString();
        item7.setLocation("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        java.lang.String str11 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32" + "'", str8, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        gui.Item item7 = new gui.Item((int) ' ', "", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "hi! () - Copies: 35", (int) (byte) 10, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.String str8 = item7.getGenre();
        item7.setCopiesAvailable((int) 'a');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str8, "hi! () - Copies: 1 (hi!) - Copies: 0");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setAuthor("hi! () - Copies: -1");
        java.lang.String str13 = item7.getType();
        item7.setItemId(35);
        java.lang.String str16 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        item7.setName("hi!");
        item7.setItemId(100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        gui.Item item7 = new gui.Item((int) (byte) 10, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 1", "32,,,,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,,hi!,100,hi!,hi! () - Copies: 1", 10, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", "hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        java.lang.String str17 = item7.getName();
        java.lang.String str18 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str18, "-1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setName("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str15 = item7.getName();
        item7.setItemId(0);
        item7.setItemId((int) (byte) 1);
        item7.setItemId((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str15, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        gui.Item item7 = new gui.Item(100, "hi! () - Copies: 1 (hi!) - Copies: 35", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!", 0, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi!", "");
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        gui.Item item7 = new gui.Item((int) '4', "1,hi! () - Copies: 1,-1,,hi!,,100,hi!,hi! () - Copies: 1,hi! () - Copies: -1,32,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi! () - Copies: -1", "10,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "1,hi! () - Copies: 1,-1,,hi!,,100,hi!,hi! () - Copies: 1,hi! () - Copies: -1,32,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi! () - Copies: -1", (int) '#', "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 52", "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        gui.Item item7 = new gui.Item((int) (short) 0, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 32, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getItemId();
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str11 = item7.getName();
        item7.setLocation("-1,,hi!,-1,,hi!,,1,hi!,hi!,100,hi!,hi! () - Copies: 1");
        java.lang.String str14 = item7.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str11, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: -1" + "'", str14, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: -1");
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        int int11 = item7.getCopiesAvailable();
        java.lang.String str12 = item7.getLocation();
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setCopiesAvailable((-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        gui.Item item7 = new gui.Item((int) (short) 100, "hi!", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", (int) (short) 0, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        int int8 = item7.getCopiesAvailable();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.getType();
        java.lang.String str16 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        java.lang.String str17 = item7.getLocation();
        item7.setAuthor("0,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
        java.lang.String str20 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setName("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str15 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 1" + "'", str15, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 1");
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        java.lang.String str17 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 35" + "'", str17, "hi! () - Copies: 35");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        item7.setGenre("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        int int10 = item7.getItemId();
        java.lang.String str11 = item7.getLocation();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getName();
        int int15 = item7.getCopiesAvailable();
        java.lang.String str16 = item7.toString();
        item7.setLocation("100,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!, () - Copies: 100,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,100,,-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 35" + "'", str16, "hi! () - Copies: 35");
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
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
        java.lang.String str24 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str23, "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! () - Copies: 1" + "'", str24, "hi! () - Copies: 1");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        int int9 = item7.getCopiesAvailable();
        item7.setLocation("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        item7.setLocation("52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!");
        int int14 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str12 = item7.toCsvString();
        item7.setCopiesAvailable(0);
        item7.setGenre("0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        java.lang.String str17 = item7.getType();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str17, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        gui.Item item7 = new gui.Item(1, "hi! () - Copies: 1", "-1,,hi!,,100,hi!,hi! () - Copies: 1", "hi! () - Copies: -1", (int) ' ', "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "hi! () - Copies: -1");
        int int8 = item7.getCopiesAvailable();
        java.lang.Class<?> wildcardClass9 = item7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
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
        java.lang.String str21 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str21, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str16 = item7.getType();
        item7.setName("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setLocation("35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        gui.Item item7 = new gui.Item((int) ' ', "-1,,hi!,,100,hi!,hi! () - Copies: 1", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "hi! () - Copies: 1", (int) (byte) 100, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "hi! () - Copies: -1");
        java.lang.String str8 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: -1" + "'", str8, "hi! () - Copies: -1");
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        item7.setAuthor("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getItemId();
        item7.setType("1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        item7.setItemId((int) ' ');
        java.lang.String str10 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        int int19 = item7.getCopiesAvailable();
        java.lang.String str20 = item7.getGenre();
        item7.setItemId((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setLocation("hi! () - Copies: -1");
        int int18 = item7.getItemId();
        java.lang.String str19 = item7.getLocation();
        item7.setLocation("-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: -1" + "'", str19, "hi! () - Copies: -1");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
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
        item7.setCopiesAvailable(100);
        java.lang.Class<?> wildcardClass30 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str24, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setAuthor("hi!");
        java.lang.String str14 = item7.getAuthor();
        int int15 = item7.getItemId();
        java.lang.String str16 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        gui.Item item7 = new gui.Item((int) (byte) -1, "1,hi! () - Copies: 1,-1,,hi!,,100,hi!,hi! () - Copies: 1,hi! () - Copies: -1,32,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi! () - Copies: -1", "-1,,hi!,,1,hi!,", "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1", (int) (byte) 1, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setItemId((int) '#');
        int int14 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 35 + "'", int14 == 35);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setName("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!" + "'", str14, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str16 = item7.getType();
        item7.setGenre(" () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0671");
        gui.Item item7 = new gui.Item((-1), "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", (int) '4', " () - Copies: -1", "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getName();
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str8, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str9, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str10, "-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
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
        java.lang.String str21 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! () - Copies: 1" + "'", str20, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str21, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
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
        java.lang.String str27 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str27, "-1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        item7.setType("1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        java.lang.Class<?> wildcardClass16 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!", (int) (short) 0, "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getItemId();
        java.lang.Class<?> wildcardClass9 = item7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
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
        item7.setLocation("1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!,1,-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        int int16 = item7.getItemId();
        java.lang.String str17 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        gui.Item item7 = new gui.Item((int) (short) 0, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi!", "-1,,hi!,,1,hi!,hi!", (int) (short) 100, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getLocation();
        java.lang.String str9 = item7.toCsvString();
        java.lang.String str10 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!" + "'", str9, "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str10, "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        java.lang.String str30 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!" + "'", str24, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str30, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setType("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str19, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        item7.setName("");
        java.lang.String str11 = item7.getName();
        item7.setLocation("-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        int int15 = item7.getCopiesAvailable();
        int int16 = item7.getCopiesAvailable();
        java.lang.String str17 = item7.getType();
        java.lang.String str18 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 0" + "'", str18, "hi! () - Copies: 0");
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        item7.setName("hi! () - Copies: 1 (hi!) - Copies: 0");
        item7.setItemId((int) 'a');
        java.lang.String str13 = item7.getLocation();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        gui.Item item7 = new gui.Item((int) ' ', "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,,,1,-1,,hi!,,1,hi!,hi!,", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1", (int) (short) 0, "", "1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!,1,-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
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
        java.lang.String str21 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str19, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
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
        item7.setCopiesAvailable(1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
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
        java.lang.String str24 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,,hi!,,-1, () - Copies: 100,-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str24, "-1,,hi!,,-1, () - Copies: 100,-1,,hi!,,1,hi!,hi! () - Copies: 100");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        item7.setLocation("0,,hi!,,1,hi!,hi!");
        item7.setType("hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.Class<?> wildcardClass14 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 35", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", 0, "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!", "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
        java.lang.String str8 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 35" + "'", str8, "hi! () - Copies: 35");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        java.lang.String str8 = item7.getAuthor();
        java.lang.String str9 = item7.getName();
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.getAuthor();
        java.lang.String str12 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! (hi! () - Copies: 1) - Copies: 10" + "'", str10, "hi! (hi! () - Copies: 1) - Copies: 10");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        int int10 = item7.getCopiesAvailable();
        java.lang.String str11 = item7.toCsvString();
        item7.setAuthor("hi! () - Copies: 35");
        java.lang.String str14 = item7.getType();
        item7.setName("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1");
        item7.setType("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str11, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        java.lang.String str8 = item7.getAuthor();
        item7.setItemId(32);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
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
        int int20 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        java.lang.String str18 = item7.toString();
        java.lang.String str19 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str19, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        gui.Item item7 = new gui.Item(10, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1", (int) ' ', "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "");
        int int8 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.getLocation();
        item7.setItemId((int) (byte) 100);
        item7.setAuthor("-1,,hi!,,52,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        java.lang.String str14 = item7.getGenre();
        int int15 = item7.getItemId();
        java.lang.String str16 = item7.toString();
        item7.setItemId((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        java.lang.String str12 = item7.toCsvString();
        item7.setGenre("-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        gui.Item item7 = new gui.Item((int) (byte) 100, "hi! () - Copies: 1", "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", (int) (byte) -1, "hi! () - Copies: -1", "-1,,hi!,,1,hi!,hi! () - Copies: 100");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.toCsvString();
        item7.setGenre("1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str17 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        gui.Item item7 = new gui.Item((int) (short) 1, "10,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!,35,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!", "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!", "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10", (int) (byte) 100, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi!", "32, () - Copies: -1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi! () - Copies: 1 (hi!) - Copies: 35");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
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
        int int24 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable(52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setItemId(10);
        item7.setGenre("-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        java.lang.String str17 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str15, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        gui.Item item7 = new gui.Item(1, "-1,,hi!,,1,hi!,hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "-1,,,,1,-1,,hi!,,1,hi!,hi!,", 35, "", "");
        java.lang.String str8 = item7.toCsvString();
        item7.setName("-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        int int11 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,," + "'", str8, "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
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
        item7.setType("0,,hi!,,1,hi!, () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,," + "'", str19, "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        gui.Item item7 = new gui.Item(52, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "hi! () - Copies: 32", "-1,,hi!,,35,hi!,hi!", (int) (short) 0, "100,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!, () - Copies: 100,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,100,,-1,hi!,hi!,,1,hi!,hi!", "");
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        int int12 = item7.getItemId();
        java.lang.String str13 = item7.getAuthor();
        java.lang.String str14 = item7.getAuthor();
        java.lang.String str15 = item7.getType();
        java.lang.String str16 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
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
        java.lang.String str20 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 32" + "'", str19, "hi! () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getName();
        int int16 = item7.getCopiesAvailable();
        int int17 = item7.getItemId();
        java.lang.String str18 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 1" + "'", str18, "hi! () - Copies: 1");
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        item7.setItemId((int) (byte) 0);
        item7.setType("100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        item7.setItemId(100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
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
        java.lang.String str25 = item7.toString();
        java.lang.String str26 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,hi!,hi!,,1,hi!,hi!) - Copies: 1" + "'", str25, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,hi!,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str26, "-1,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        java.lang.String str14 = item7.getLocation();
        int int15 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) (byte) 1);
        java.lang.String str18 = item7.toCsvString();
        java.lang.String str19 = item7.getAuthor();
        int int20 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setItemId((int) (byte) 1);
        java.lang.String str13 = item7.toCsvString();
        java.lang.String str14 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "1,,hi!,,1,hi!,hi!" + "'", str13, "1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable((int) (short) -1);
        int int14 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        item7.setGenre("0,,0,,hi!,,1,hi!,hi!,,32,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
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
        java.lang.String str21 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! () - Copies: 32");
        item7.setName("hi! () - Copies: 1 (hi!) - Copies: 35");
        java.lang.String str22 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 32" + "'", str22, "hi! () - Copies: 32");
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setType("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        gui.Item item7 = new gui.Item(32, "0,,hi!,,1,hi!,hi!", " (hi!) - Copies: 1", "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (byte) 1, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str8 = item7.toCsvString();
        java.lang.String str9 = item7.getType();
        java.lang.String str10 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str8, "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str9, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str10, "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
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
        java.lang.String str27 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 1" + "'", str22, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi! () - Copies: 1" + "'", str27, "hi! () - Copies: 1");
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        gui.Item item7 = new gui.Item((int) (short) 10, "0,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", "10,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,1,hi!,hi! () - Copies: 100", (int) (byte) 1, "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", " (hi!) - Copies: 1");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str14 = item7.getLocation();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getLocation();
        item7.setItemId((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
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
        item7.setItemId((-1));
        java.lang.String str29 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str29, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        java.lang.String str17 = item7.getAuthor();
        java.lang.String str18 = item7.toCsvString();
        item7.setAuthor("-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
        java.lang.Class<?> wildcardClass21 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,,hi!,,32,hi!,hi!" + "'", str18, "0,,hi!,,32,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        gui.Item item7 = new gui.Item((int) '#', "-1,,hi!,,1,hi! () - Copies: 1,hi!", "", " () - Copies: 100", (int) (byte) 100, "hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setType("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) -1);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setGenre("hi! () - Copies: 35");
        item7.setItemId((int) (short) 10);
        item7.setLocation("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("32,,,,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,,hi!,100,hi!,hi! () - Copies: 1");
        int int21 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 35 + "'", int21 == 35);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
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
        item7.setAuthor("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int23 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! () - Copies: 1" + "'", str20, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        int int11 = item7.getCopiesAvailable();
        int int12 = item7.getCopiesAvailable();
        java.lang.Class<?> wildcardClass13 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
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
        int int23 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setItemId((int) (byte) 10);
        item7.setItemId(100);
        item7.setName("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getName();
        item7.setGenre("32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,97,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!" + "'", str14, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        item7.setAuthor("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getAuthor();
        int int18 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        item7.setAuthor("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getItemId();
        java.lang.Class<?> wildcardClass18 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
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
        item7.setItemId(100);
        java.lang.String str24 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.Class<?> wildcardClass14 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '#');
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) ' ');
        java.lang.String str14 = item7.getName();
        item7.setAuthor("52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!");
        java.lang.String str17 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "32,,hi!,,35,52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!," + "'", str17, "32,,hi!,,35,52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
        gui.Item item7 = new gui.Item((int) (byte) 10, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!", "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!", 0, "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1", "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
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
        item7.setCopiesAvailable(100);
        java.lang.String str30 = item7.getAuthor();
        java.lang.Class<?> wildcardClass31 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str24, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + " () - Copies: 100" + "'", str30, " () - Copies: 100");
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
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
        java.lang.String str28 = item7.toCsvString();
        java.lang.String str29 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! () - Copies: 1" + "'", str23, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1,,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1" + "'", str28, "-1,,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str29, "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
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
        java.lang.String str22 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " () - Copies: 1" + "'", str22, " () - Copies: 1");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getLocation();
        java.lang.String str12 = item7.toString();
        item7.setCopiesAvailable(0);
        java.lang.String str15 = item7.getGenre();
        java.lang.String str16 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        int int10 = item7.getCopiesAvailable();
        java.lang.String str11 = item7.toString();
        java.lang.String str12 = item7.getName();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 35" + "'", str11, "hi! () - Copies: 1 (hi!) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
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
        item7.setItemId((int) (short) 10);
        java.lang.String str27 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str27, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
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
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setLocation("-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! () - Copies: 1" + "'", str26, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1" + "'", str27, "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        int int12 = item7.getItemId();
        java.lang.String str13 = item7.getAuthor();
        java.lang.String str14 = item7.getType();
        item7.setAuthor("-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setItemId(10);
        item7.setAuthor("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        item7.setLocation("-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setAuthor("-1,,hi!,,35,hi!,hi!");
        java.lang.String str17 = item7.toString();
        item7.setGenre("hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " () - Copies: 10" + "'", str17, " () - Copies: 10");
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        item7.setLocation("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("-1,,hi!,,100,hi!,hi! () - Copies: 1");
        int int19 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        gui.Item item7 = new gui.Item(100, "hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35", "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10", "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", 52, "32,,,,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,,hi!,100,hi!,hi! () - Copies: 1", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        item7.setItemId((int) (byte) 10);
        item7.setAuthor("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
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
        item7.setLocation("-1,,hi!,,35,hi!,");
        java.lang.String str24 = item7.getAuthor();
        java.lang.Class<?> wildcardClass25 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
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
        item7.setType("0,,hi!,,1,hi!,hi!");
        java.lang.String str21 = item7.toCsvString();
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
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!" + "'", str21, "-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!" + "'", str22, "-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        gui.Item item7 = new gui.Item(32, "0,,hi!,,1,hi!,hi!", " (hi!) - Copies: 1", "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (byte) 1, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setType("0,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (byte) -1);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        int int15 = item7.getCopiesAvailable();
        int int16 = item7.getCopiesAvailable();
        java.lang.String str17 = item7.getLocation();
        int int18 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setItemId((int) ' ');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!" + "'", str14, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        gui.Item item7 = new gui.Item((int) '#', "-1,,hi!,,1,hi! () - Copies: 1,hi!", "", " () - Copies: 100", (int) (byte) 100, "hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setCopiesAvailable((-1));
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
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
        item7.setType("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        java.lang.String str13 = item7.getName();
        java.lang.String str14 = item7.toString();
        item7.setItemId(35);
        item7.setItemId((int) (short) 1);
        item7.setAuthor("0,,hi!,,1,hi!, () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 35" + "'", str14, "hi! () - Copies: 35");
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        item7.setCopiesAvailable((-1));
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str15, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
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
        int int23 = item7.getCopiesAvailable();
        java.lang.String str24 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 1" + "'", str22, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str24, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        gui.Item item7 = new gui.Item((int) (byte) -1, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi! () - Copies: 1", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", 100, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str8 = item7.getAuthor();
        java.lang.String str9 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str8, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str9, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        item7.setAuthor("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        item7.setCopiesAvailable((int) (short) 1);
        java.lang.String str20 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! (hi!) - Copies: 1" + "'", str20, "hi! (hi!) - Copies: 1");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        gui.Item item7 = new gui.Item((int) (byte) -1, "-1,,hi!,,100,hi!,hi! () - Copies: 1", " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi!", (int) (short) -1, "", "0,,hi!,,1,hi!,hi! () - Copies: 32");
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
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
        java.lang.String str27 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!, (-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str26, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!, (-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        java.lang.String str14 = item7.getLocation();
        java.lang.String str15 = item7.toString();
        item7.setGenre("1,,,,100,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        gui.Item item7 = new gui.Item((int) (short) 0, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 32, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getItemId();
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str11 = item7.toCsvString();
        item7.setItemId((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str11, "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        int int11 = item7.getCopiesAvailable();
        int int12 = item7.getCopiesAvailable();
        java.lang.String str13 = item7.getGenre();
        item7.setLocation("-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        int int16 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
        gui.Item item7 = new gui.Item(0, "-1,,hi!,hi!,100,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52", "1,,hi!,,1,hi!,hi!", (int) (short) 10, "-1,,hi!,hi!,100,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.getAuthor();
        item7.setGenre("-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32");
        java.lang.Class<?> wildcardClass18 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setType("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setItemId((int) '4');
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        item7.setAuthor("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getAuthor();
        java.lang.String str18 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        gui.Item item7 = new gui.Item(32, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "hi! () - Copies: 1", "hi! () - Copies: 35", (int) (byte) 0, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getLocation();
        item7.setCopiesAvailable((int) '4');
        java.lang.String str11 = item7.getGenre();
        item7.setType("0,,hi!,,32,hi!,hi!");
        java.lang.String str14 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 35" + "'", str8, "hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!" + "'", str14, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        item7.setLocation(" (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
        item7.setCopiesAvailable((int) '#');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
        gui.Item item7 = new gui.Item((int) (short) 100, "0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", (int) 'a', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! (hi! () - Copies: 1) - Copies: 10");
        item7.setType("32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
    }

    @Test
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getLocation();
        item7.setCopiesAvailable((int) (byte) 0);
        java.lang.String str19 = item7.toString();
        java.lang.String str20 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 0" + "'", str19, "hi! () - Copies: 0");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! () - Copies: 1" + "'", str20, "hi! () - Copies: 1");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        item7.setCopiesAvailable(1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
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
        java.lang.String str22 = item7.getGenre();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.getGenre();
        java.lang.Class<?> wildcardClass18 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
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
        java.lang.String str23 = item7.getGenre();
        item7.setItemId((int) 'a');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
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
        int int27 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: -1" + "'", str22, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setAuthor("-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
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
        int int24 = item7.getItemId();
        item7.setAuthor("-1,,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32) - Copies: 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " () - Copies: -1" + "'", str21, " () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
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
        item7.setCopiesAvailable((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 1" + "'", str19, "hi! () - Copies: 1");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getCopiesAvailable();
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable(100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
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
        item7.setCopiesAvailable((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,52,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        item7.setItemId(1);
        int int18 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        gui.Item item7 = new gui.Item(32, "0,,hi!,,1,hi!,hi!", " (hi!) - Copies: 1", "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (byte) 1, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setType("0,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str10, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.toCsvString();
        item7.setGenre("-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str15, "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setName("hi! () - Copies: 1");
        java.lang.String str18 = item7.toCsvString();
        item7.setItemId((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1" + "'", str18, "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        item7.setCopiesAvailable((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        gui.Item item7 = new gui.Item(32, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "hi! () - Copies: 1", "hi! () - Copies: 35", (int) (byte) 0, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getLocation();
        item7.setCopiesAvailable((int) '4');
        item7.setItemId((int) (byte) 100);
        java.lang.String str13 = item7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 35" + "'", str8, "hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 52" + "'", str13, "hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 52");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        gui.Item item7 = new gui.Item((-1), "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1,,hi!,,1,-1,,hi!,,1,hi!,hi! () - Copies: 100,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,,hi!,100,hi!,hi! () - Copies: 1", (int) '4', "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setCopiesAvailable(100);
        int int16 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId(32);
        java.lang.Class<?> wildcardClass19 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str18 = item7.getLocation();
        java.lang.String str19 = item7.toCsvString();
        item7.setName("-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi! (hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100) - Copies: 32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str19, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        gui.Item item7 = new gui.Item((int) (byte) 10, "", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10", (int) (byte) -1, "hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getCopiesAvailable();
        item7.setLocation("hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35");
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.getName();
        item7.setType("1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35" + "'", str16, "hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        item7.setLocation("");
        java.lang.String str18 = item7.getLocation();
        item7.setLocation("97,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        item7.setLocation("hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!," + "'", str15, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
        gui.Item item7 = new gui.Item((int) ' ', "hi! () - Copies: 35", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", (int) 'a', "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,52,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1," + "'", str10, "32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,52,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
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
        java.lang.String str22 = item7.getLocation();
        java.lang.String str23 = item7.getGenre();
        java.lang.Class<?> wildcardClass24 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! () - Copies: 1" + "'", str23, "hi! () - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getLocation();
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getLocation();
        java.lang.Class<?> wildcardClass12 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        gui.Item item7 = new gui.Item((int) (byte) -1, " () - Copies: -1", "-1,,hi!,,1,hi!,hi!", "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", (-1), "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getAuthor();
        java.lang.Class<?> wildcardClass9 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str8, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str15 = item7.toString();
        item7.setName("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int18 = item7.getCopiesAvailable();
        java.lang.String str19 = item7.getType();
        java.lang.String str20 = item7.getAuthor();
        int int21 = item7.getItemId();
        java.lang.Class<?> wildcardClass22 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35" + "'", str15, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str19, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        item7.setName("hi! () - Copies: 1 (hi!) - Copies: 0");
        int int11 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        int int11 = item7.getCopiesAvailable();
        int int12 = item7.getCopiesAvailable();
        java.lang.String str13 = item7.getGenre();
        item7.setLocation("-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
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
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getName();
        java.lang.String str17 = item7.getLocation();
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str13, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        gui.Item item7 = new gui.Item(100, "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", " () - Copies: 100", "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", 100, "", "-1,hi!,hi!,,1,hi!,hi!");
        item7.setAuthor(" () - Copies: 1");
        java.lang.Class<?> wildcardClass10 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getLocation();
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getAuthor();
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!");
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,hi!,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        gui.Item item7 = new gui.Item(52, "-1,,hi!,,1,hi!,hi! () - Copies: 100", "-1,,hi!,,1,hi! () - Copies: -1,hi!", "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1", 0, "0,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "52,-1,,hi!,,1,hi!,hi! () - Copies: 100,-1,,hi!,,1,hi! () - Copies: -1,hi!,32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1,0,0,,hi!,,1,hi!,hi!," + "'", str8, "52,-1,,hi!,,1,hi!,hi! () - Copies: 100,-1,,hi!,,1,hi! () - Copies: -1,hi!,32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1,0,0,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
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
        item7.setType("35,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        int int14 = item7.getCopiesAvailable();
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        java.lang.String str8 = item7.toString();
        java.lang.Class<?> wildcardClass9 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
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
        item7.setItemId((int) ' ');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setName("-1,,hi!,,100,hi!,hi! () - Copies: 1");
        item7.setGenre("hi! (hi!) - Copies: 1");
        java.lang.String str13 = item7.getName();
        java.lang.String str14 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1" + "'", str13, "-1,,hi!,,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! (hi!) - Copies: 1" + "'", str14, "hi! (hi!) - Copies: 1");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getLocation();
        item7.setItemId((int) 'a');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        gui.Item item7 = new gui.Item((int) (short) 1, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "0,,hi!,,32,hi!,hi!", "35,hi!,hi!,,1,hi!,hi!", (int) ' ', "0,hi! () - Copies: -1,hi!,,1,hi!,hi!", "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str8 = item7.toString();
        item7.setAuthor("-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "0,,hi!,,32,hi!,hi! (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 32" + "'", str8, "0,,hi!,,32,hi!,hi! (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 32");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
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
        int int24 = item7.getCopiesAvailable();
        item7.setCopiesAvailable(52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str22, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! () - Copies: 32" + "'", str23, "hi! () - Copies: 32");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getName();
        item7.setGenre(" () - Copies: 100");
        java.lang.String str17 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        gui.Item item7 = new gui.Item(32, "0,,hi!,,1,hi!,hi!", " (hi!) - Copies: 1", "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (byte) 1, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setCopiesAvailable(32);
        java.lang.String str10 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str10, "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
        gui.Item item7 = new gui.Item(100, "-1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", "1,,hi!,,1,hi!,hi!", " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10", (-1), "-1,,hi!,hi!,100,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", " () - Copies: 100");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        item7.setGenre("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str20 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0,,hi!,,32,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str20, "0,,hi!,,32,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        java.lang.String str8 = item7.toString();
        item7.setName("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setLocation("-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 35" + "'", str8, "hi! () - Copies: 1 (hi!) - Copies: 35");
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        int int11 = item7.getCopiesAvailable();
        int int12 = item7.getCopiesAvailable();
        java.lang.String str13 = item7.getGenre();
        int int14 = item7.getItemId();
        item7.setCopiesAvailable((int) ' ');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getLocation();
        item7.setName("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
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
        item7.setGenre("32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0");
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 1" + "'", str20, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 1");
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        item7.setCopiesAvailable((int) '#');
        item7.setType("32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,97,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        java.lang.String str20 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getName();
        int int16 = item7.getCopiesAvailable();
        java.lang.String str17 = item7.getAuthor();
        java.lang.String str18 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        int int12 = item7.getCopiesAvailable();
        java.lang.String str13 = item7.toString();
        java.lang.String str14 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! () - Copies: 1" + "'", str13, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        int int12 = item7.getItemId();
        item7.setCopiesAvailable((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("0,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str22 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
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
        int int22 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " () - Copies: -1" + "'", str21, " () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getAuthor();
        item7.setLocation("1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        item7.setCopiesAvailable(0);
        java.lang.Class<?> wildcardClass21 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        java.lang.String str15 = item7.getGenre();
        item7.setCopiesAvailable(32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str15, "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.Class<?> wildcardClass13 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.toCsvString();
        java.lang.String str16 = item7.toCsvString();
        item7.setAuthor("");
        java.lang.String str19 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str15, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str16, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 1" + "'", str19, "hi! () - Copies: 1");
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setName("hi!");
        java.lang.String str14 = item7.toString();
        java.lang.String str15 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str15, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        item7.setAuthor("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setCopiesAvailable((int) 'a');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! () - Copies: 1" + "'", str20, "hi! () - Copies: 1");
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getType();
        int int15 = item7.getItemId();
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getGenre();
        java.lang.String str18 = item7.getAuthor();
        java.lang.Class<?> wildcardClass19 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        gui.Item item7 = new gui.Item(97, "10,,hi!,,1,hi!,hi! () - Copies: 35", "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,0,hi! () - Copies: -1,hi!,,1,hi!,hi!", "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0", 35, "-1,,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1", "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!");
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        gui.Item item7 = new gui.Item(97, "", "0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 52", (int) (byte) 0, "32,,hi!,,35,52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,", "10,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getLocation();
        item7.setItemId(0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
        gui.Item item7 = new gui.Item((int) '#', "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,hi!,,52,hi!,", (int) (short) 0, "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1", "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setName("hi! () - Copies: -1");
        item7.setAuthor("10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setName("0,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.toCsvString();
        item7.setGenre("1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        item7.setLocation("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.getGenre();
        java.lang.String str20 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str14, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,," + "'", str19, "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,," + "'", str20, "-1,,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        gui.Item item7 = new gui.Item((int) (short) 1, "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!", 32, "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,hi! () - Copies: 1,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!", "0,,hi!,,1,hi!, () - Copies: 10");
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.getLocation();
        item7.setType("hi! () - Copies: -1");
        java.lang.String str18 = item7.toCsvString();
        item7.setType("0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.Class<?> wildcardClass21 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,hi! () - Copies: -1,hi!,,1,hi!,hi!" + "'", str18, "0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
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
        item7.setAuthor("hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! () - Copies: 1" + "'", str26, "hi! () - Copies: 1");
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        int int14 = item7.getCopiesAvailable();
        item7.setItemId((int) (byte) 0);
        java.lang.String str17 = item7.toString();
        java.lang.Class<?> wildcardClass18 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.toString();
        item7.setItemId((int) 'a');
        int int18 = item7.getCopiesAvailable();
        item7.setItemId(0);
        int int21 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        item7.setLocation("hi!");
        java.lang.String str12 = item7.toString();
        java.lang.String str13 = item7.getLocation();
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.getAuthor();
        item7.setCopiesAvailable((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        gui.Item item7 = new gui.Item((int) (short) 0, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 32, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getItemId();
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str11 = item7.getType();
        java.lang.Class<?> wildcardClass12 = item7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str11, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setName("0,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getLocation();
        item7.setCopiesAvailable((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toString();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setGenre("");
        item7.setCopiesAvailable((int) (byte) -1);
        item7.setAuthor("hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.String str16 = item7.toString();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        gui.Item item7 = new gui.Item(1, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!", "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1", (int) (short) 0, "-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1");
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setName("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,,hi!,,-1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        int int15 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,,hi!,,1,hi!,", (-1), "", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) '#');
        java.lang.String str10 = item7.getGenre();
        java.lang.String str11 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str10, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("hi! () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
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
        item7.setCopiesAvailable((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str24, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        int int12 = item7.getItemId();
        int int13 = item7.getCopiesAvailable();
        int int14 = item7.getItemId();
        item7.setType("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!" + "'", str17, "-1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getLocation();
        java.lang.String str15 = item7.getGenre();
        int int16 = item7.getCopiesAvailable();
        item7.setAuthor("0,,hi!,,32,hi!,hi!");
        java.lang.String str19 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
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
        item7.setType("hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        java.lang.String str30 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str24, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        gui.Item item7 = new gui.Item(32, "0,,hi!,,1,hi!,hi!", " (hi!) - Copies: 1", "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (byte) 1, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str8 = item7.toCsvString();
        int int9 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str8, "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
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
        item7.setItemId(0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
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
        java.lang.Class<?> wildcardClass22 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 1" + "'", str21, "hi! () - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
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
        item7.setType("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
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
        java.lang.String str22 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setType("-1,hi!,hi!,,1,hi!,hi!");
        item7.setType("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
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
        java.lang.String str21 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,,,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,");
        java.lang.String str20 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
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
        java.lang.String str23 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!" + "'", str19, "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        item7.setCopiesAvailable((int) '#');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
        gui.Item item7 = new gui.Item((int) (short) -1, "97,,-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!,,1,hi!,hi!", "hi! (hi!) - Copies: 1", "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!, (-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1", 100, "10,,hi!,,1,hi!,hi! () - Copies: 35", "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId(1);
        item7.setType("10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setType("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str15 = item7.toString();
        item7.setName("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int18 = item7.getCopiesAvailable();
        java.lang.String str19 = item7.getType();
        java.lang.Class<?> wildcardClass20 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35" + "'", str15, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str19, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
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
        item7.setGenre("-1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0,,hi!,hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str27, "0,,hi!,hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
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
        java.lang.String str22 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        int int22 = item7.getCopiesAvailable();
        int int23 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        item7.setGenre("");
        java.lang.String str26 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
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
        java.lang.String str26 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        item7.setName(" (hi!) - Copies: 1");
        item7.setGenre("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi! () - Copies: 35");
        item7.setCopiesAvailable((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str20, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        gui.Item item7 = new gui.Item(52, "-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", 32, "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setType("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setLocation("-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        gui.Item item7 = new gui.Item((int) ' ', "", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "hi! () - Copies: 35", (int) (byte) 10, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.String str8 = item7.toCsvString();
        int int9 = item7.getCopiesAvailable();
        java.lang.String str10 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str8, "32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 35" + "'", str10, "hi! () - Copies: 35");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int15 = item7.getItemId();
        item7.setType("32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        gui.Item item7 = new gui.Item(32, "0,,hi!,,1,hi!,hi!", " (hi!) - Copies: 1", "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (byte) 1, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setCopiesAvailable(32);
        item7.setGenre("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi! () - Copies: 35");
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        int int12 = item7.getItemId();
        int int13 = item7.getCopiesAvailable();
        int int14 = item7.getItemId();
        item7.setType("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
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
        item7.setAuthor("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setAuthor("hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        java.lang.String str13 = item7.getName();
        item7.setType("");
        item7.setGenre("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setAuthor("-1,,hi!,,52,hi!,");
        java.lang.String str20 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,100,hi!,hi! () - Copies: 1");
        java.lang.String str13 = item7.toCsvString();
        int int14 = item7.getItemId();
        java.lang.String str15 = item7.getGenre();
        item7.setItemId(35);
        java.lang.Class<?> wildcardClass18 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1," + "'", str13, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        gui.Item item7 = new gui.Item((int) (byte) 10, "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", "hi!", "-1,,hi!,,35,hi!,", 1, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "");
        java.lang.String str8 = item7.getGenre();
        java.lang.Class<?> wildcardClass9 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        java.lang.String str8 = item7.getAuthor();
        item7.setName("-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str11 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str11, "-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
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
        item7.setCopiesAvailable(10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! () - Copies: 1 () - Copies: 100" + "'", str25, "hi! () - Copies: 1 () - Copies: 100");
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.getType();
        int int10 = item7.getCopiesAvailable();
        item7.setAuthor("");
        java.lang.String str13 = item7.getName();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        gui.Item item7 = new gui.Item(1, "-1,,hi!,,100,hi!,hi! () - Copies: 1", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi! () - Copies: 1 (hi!) - Copies: 0", 0, "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi! () - Copies: -1,hi!");
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getLocation();
        int int17 = item7.getItemId();
        java.lang.String str18 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        java.lang.String str14 = item7.getGenre();
        item7.setType("hi! () - Copies: 1");
        java.lang.String str17 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0,hi! () - Copies: 1,hi!,,1,hi!,hi!" + "'", str17, "0,hi! () - Copies: 1,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
        gui.Item item7 = new gui.Item((int) ' ', "hi! () - Copies: 35", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", (int) 'a', "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str10 = item7.toString();
        java.lang.Class<?> wildcardClass11 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52" + "'", str10, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        item7.setAuthor("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getAuthor();
        java.lang.String str18 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
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
        item7.setAuthor("-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getName();
        item7.setCopiesAvailable((int) ' ');
        java.lang.String str17 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,32,hi!,-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,32,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        int int9 = item7.getItemId();
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setLocation("");
        item7.setCopiesAvailable((int) (byte) 10);
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        int int14 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
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
        java.lang.Class<?> wildcardClass24 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!" + "'", str22, "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        java.lang.String str22 = item7.getType();
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, (hi! () - Copies: -1) - Copies: -1" + "'", str22, "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, (hi! () - Copies: -1) - Copies: -1");
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
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
        item7.setItemId((int) (byte) 100);
        item7.setName("hi! () - Copies: 35");
        item7.setGenre("0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        gui.Item item7 = new gui.Item(0, "0,,hi!,,32,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", (int) (short) 0, "hi! () - Copies: 35", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: -1");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setItemId((int) (byte) 10);
        java.lang.String str10 = item7.getType();
        item7.setCopiesAvailable((int) (short) 1);
        int int13 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: -1" + "'", str10, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        int int16 = item7.getCopiesAvailable();
        java.lang.String str17 = item7.getLocation();
        java.lang.String str18 = item7.getLocation();
        java.lang.String str19 = item7.getGenre();
        item7.setType("0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,hi! () - Copies: 1,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        int int15 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        item7.setItemId((int) (byte) 0);
        java.lang.String str16 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        gui.Item item7 = new gui.Item((int) (short) -1, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "hi! () - Copies: 1", "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", (int) (short) 1, "0,,hi!,,1,hi!,hi!", "hi!");
        java.lang.String str8 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        int int17 = item7.getItemId();
        java.lang.String str18 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.getName();
        item7.setItemId((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
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
        java.lang.String str21 = item7.getGenre();
        java.lang.String str22 = item7.toString();
        int int23 = item7.getCopiesAvailable();
        java.lang.Class<?> wildcardClass24 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 32" + "'", str18, "hi! () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str21, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 32" + "'", str22, "hi! () - Copies: 32");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.toCsvString();
        int int18 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str17, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        item7.setItemId((int) ' ');
        item7.setType("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setGenre("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        int int10 = item7.getCopiesAvailable();
        int int11 = item7.getItemId();
        int int12 = item7.getCopiesAvailable();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        gui.Item item7 = new gui.Item((int) '4', "35,hi!,hi!,,1,hi!,hi!", "0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", 32, "-1,hi!,hi!,,1,hi!,hi!", "-1,,hi!,,35,hi!,");
        item7.setItemId(10);
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getType();
        int int15 = item7.getItemId();
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getGenre();
        java.lang.String str18 = item7.getAuthor();
        item7.setName("10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        item7.setName("");
        item7.setAuthor("32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str13 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str13, "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int17 = item7.getCopiesAvailable();
        java.lang.String str18 = item7.toCsvString();
        int int19 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str13 = item7.getLocation();
        java.lang.String str14 = item7.toCsvString();
        item7.setGenre("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!" + "'", str14, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
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
        java.lang.String str21 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        java.lang.String str15 = item7.getGenre();
        int int16 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str15, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.toString();
        int int16 = item7.getItemId();
        item7.setType("1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        gui.Item item7 = new gui.Item((int) (byte) 1, "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", "", (-1), "-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!", "0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str20 = item7.getGenre();
        java.lang.String str21 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! () - Copies: 1" + "'", str20, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 1" + "'", str21, "hi! () - Copies: 1");
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
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
        item7.setGenre("");
        java.lang.String str26 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str26, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        gui.Item item7 = new gui.Item(32, "52,-1,,hi!,,1,hi!,hi! () - Copies: 100,-1,,hi!,,1,hi! () - Copies: -1,hi!,32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1,0,0,,hi!,,1,hi!,hi!,", "-1,,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32) - Copies: 97", "-1,,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32) - Copies: 97", 52, "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi! () - Copies: 35");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
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
        int int24 = item7.getItemId();
        java.lang.String str25 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        gui.Item item7 = new gui.Item((int) (byte) 100, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32", "hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32", (int) (byte) 100, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        item7.setItemId(32);
        java.lang.String str11 = item7.getName();
        item7.setLocation("hi! () - Copies: -1 (hi! () - Copies: -1) - Copies: 100");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str12 = item7.toCsvString();
        item7.setCopiesAvailable(0);
        item7.setItemId((int) (short) 1);
        item7.setItemId((int) 'a');
        java.lang.String str19 = item7.getAuthor();
        item7.setItemId((int) '#');
        item7.setName("hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str19, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        gui.Item item7 = new gui.Item((int) 'a', "", "-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32", "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", (int) (byte) 1, "32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!", "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
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
        item7.setType("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! () - Copies: 1" + "'", str24, "hi! () - Copies: 1");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.toCsvString();
        int int16 = item7.getItemId();
        int int17 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str15, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
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
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! () - Copies: 1" + "'", str26, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1" + "'", str27, "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        java.lang.String str10 = item7.getGenre();
        java.lang.String str11 = item7.getAuthor();
        item7.setGenre("0,,hi!,hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setItemId(1);
        java.lang.Class<?> wildcardClass16 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str11, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toString();
        int int15 = item7.getCopiesAvailable();
        int int16 = item7.getCopiesAvailable();
        item7.setGenre("-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
        java.lang.String str19 = item7.getType();
        java.lang.Class<?> wildcardClass20 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 35" + "'", str14, "hi! () - Copies: 35");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        gui.Item item7 = new gui.Item(52, "-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", 32, "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setType("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.Class<?> wildcardClass10 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
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
        java.lang.String str22 = item7.getLocation();
        java.lang.String str23 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
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
        int int22 = item7.getItemId();
        item7.setCopiesAvailable((int) (byte) 10);
        java.lang.String str25 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("hi! () - Copies: 1");
        item7.setItemId(100);
        java.lang.Class<?> wildcardClass21 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setName("hi! () - Copies: 1");
        int int18 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) '#');
        java.lang.String str21 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,35,hi!,hi! () - Copies: 1" + "'", str21, "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,35,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 35", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", 0, "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!", "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!");
        item7.setLocation("hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        java.lang.Class<?> wildcardClass10 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("hi! (hi! () - Copies: 1) - Copies: 10");
        java.lang.String str16 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi! (hi! () - Copies: 1) - Copies: 10" + "'", str16, "-1,,hi!,,1,hi!,hi! (hi! () - Copies: 1) - Copies: 10");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        gui.Item item7 = new gui.Item(32, "hi! () - Copies: 1 (hi!) - Copies: 35", "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", (int) (short) 10, "-1,,hi!,hi!,10,hi!,hi!", "-1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
    }

    @Test
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setType("-1,hi!,hi!,,1,hi!,hi!");
        item7.setItemId(0);
        item7.setAuthor("hi! (hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        java.lang.String str15 = item7.getGenre();
        java.lang.String str16 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
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
        java.lang.String str19 = item7.getLocation();
        java.lang.String str20 = item7.getAuthor();
        java.lang.String str21 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setGenre("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        int int10 = item7.getCopiesAvailable();
        item7.setGenre("-1,,hi!,,1,hi!,");
        int int13 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
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
        java.lang.String str28 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str25, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getLocation();
        int int12 = item7.getItemId();
        item7.setLocation("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 52");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        gui.Item item7 = new gui.Item((int) (byte) -1, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi! () - Copies: 1", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", 100, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1");
        item7.setName("-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        gui.Item item7 = new gui.Item((int) (byte) 10, "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", "hi!", "-1,,hi!,,35,hi!,", 1, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "");
        item7.setItemId(32);
        java.lang.String str10 = item7.getLocation();
        int int11 = item7.getCopiesAvailable();
        item7.setType("32,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,35,hi!," + "'", str10, "-1,,hi!,,35,hi!,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! () - Copies: 1", (int) (short) 1, "hi! () - Copies: 1", "-1,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("hi!");
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str12, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! () - Copies: 1" + "'", str13, "hi! () - Copies: 1");
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str12 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!" + "'", str12, "-1,,hi!,,1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!");
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
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
        int int24 = item7.getCopiesAvailable();
        int int25 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str16 = item7.getLocation();
        int int17 = item7.getCopiesAvailable();
        item7.setType("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        item7.setName("32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
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
        item7.setName("100,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!, () - Copies: 100,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,100,,-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 1" + "'", str22, "hi! () - Copies: 1");
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
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
        java.lang.Class<?> wildcardClass30 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str23, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        int int9 = item7.getItemId();
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setLocation("");
        item7.setGenre("-1,,,hi!,100,hi!,hi! () - Copies: 1");
        java.lang.String str16 = item7.getGenre();
        item7.setName("hi! () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str16, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (byte) 100);
        java.lang.String str21 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 100" + "'", str21, "hi! () - Copies: 100");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        gui.Item item7 = new gui.Item(1, "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", " () - Copies: 100", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,hi!,hi!,,1,hi!,hi!) - Copies: 1", (int) '#', "-1,,hi!,,1,hi! () - Copies: -1,hi!", "-1,hi!,35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,hi!,hi!");
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
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
        item7.setAuthor("-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.Class<?> wildcardClass25 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
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
        item7.setItemId((int) (short) 0);
        item7.setAuthor("10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
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
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
        java.lang.String str24 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! () - Copies: 1" + "'", str24, "hi! () - Copies: 1");
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId(32);
        java.lang.String str19 = item7.toCsvString();
        java.lang.String str20 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str19, "32,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "32,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "32,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        gui.Item item7 = new gui.Item((int) (byte) 100, "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1", (-1), "-1,,hi!,,1,hi!,hi! () - Copies: 100", "32,,,,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,,hi!,100,hi!,hi! () - Copies: 1");
        java.lang.String str8 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1" + "'", str8, "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
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
        item7.setGenre("1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 32" + "'", str19, "hi! () - Copies: 32");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! () - Copies: 1", (int) (short) 1, "hi! () - Copies: 1", "-1,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("hi!");
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.getType();
        item7.setCopiesAvailable(52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str12, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setCopiesAvailable((int) ' ');
        int int15 = item7.getCopiesAvailable();
        java.lang.Class<?> wildcardClass16 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setGenre("hi!");
        item7.setType("-1,,hi!,,1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.toString();
        java.lang.String str17 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        item7.setType("1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        item7.setType("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!, (-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setType("32,,hi!,,35,52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        gui.Item item7 = new gui.Item((int) (byte) 1, "1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!", "-1,,hi!,,-1, () - Copies: 100,-1,,hi!,,1,hi!,hi! () - Copies: 100", (int) (byte) 1, "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!", "52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!");
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.Class<?> wildcardClass18 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
        gui.Item item7 = new gui.Item((int) 'a', "hi! () - Copies: 35", "hi!", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (short) -1, "hi! () - Copies: 1", "hi! () - Copies: 1");
        java.lang.String str8 = item7.getAuthor();
        item7.setAuthor("10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        java.lang.String str11 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!" + "'", str11, "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
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
        item7.setAuthor("0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        gui.Item item7 = new gui.Item((-1), "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", (int) '4', " () - Copies: -1", "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setCopiesAvailable((int) (short) 1);
        item7.setCopiesAvailable((int) (short) 0);
        item7.setCopiesAvailable(10);
        java.lang.String str14 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1,,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str14, "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        gui.Item item7 = new gui.Item((int) (short) 10, "hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 52", "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!", (int) '#', "hi! () - Copies: -1", "");
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        gui.Item item7 = new gui.Item((int) (byte) 10, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0", "", "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!", (-1), "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!", "0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setItemId((-1));
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        gui.Item item7 = new gui.Item((int) ' ', "hi! () - Copies: 35", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", (int) 'a', "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "");
        item7.setCopiesAvailable((int) '4');
        java.lang.Class<?> wildcardClass10 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
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
        item7.setItemId(0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
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
        java.lang.String str25 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 32" + "'", str18, "hi! () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!," + "'", str25, "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
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
        java.lang.Class<?> wildcardClass23 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str13 = item7.toCsvString();
        item7.setLocation("52,-1,,hi!,,1,hi!,hi! () - Copies: 100,-1,,hi!,,1,hi! () - Copies: -1,hi!,32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1,0,0,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!" + "'", str13, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        gui.Item item7 = new gui.Item((int) (short) -1, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!", 0, "-1,,hi!,,1,hi!,hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) (short) -1);
        int int10 = item7.getCopiesAvailable();
        java.lang.String str11 = item7.getName();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
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
        int int22 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str15, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str16, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
        gui.Item item7 = new gui.Item((int) (byte) 10, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi! () - Copies: -1,hi!", "32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0", 52, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100", "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        item7.setCopiesAvailable(1);
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str10, "32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0");
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setName("hi! () - Copies: 1");
        int int18 = item7.getCopiesAvailable();
        java.lang.Class<?> wildcardClass19 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.getName();
        java.lang.String str10 = item7.getLocation();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,,hi!,,1,hi!,");
        item7.setName("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
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
        item7.setType("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! () - Copies: 1" + "'", str20, "hi! () - Copies: 1");
    }
}

