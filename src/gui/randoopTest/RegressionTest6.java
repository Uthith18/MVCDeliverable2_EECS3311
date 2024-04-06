package gui.randoopTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test3001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3001");
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
        java.lang.String str21 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " () - Copies: 1" + "'", str21, " () - Copies: 1");
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        java.lang.String str8 = item7.getAuthor();
        java.lang.String str9 = item7.getName();
        java.lang.String str10 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        gui.Item item7 = new gui.Item((int) ' ', "hi! () - Copies: 35", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", (int) 'a', "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.getLocation();
        java.lang.String str12 = item7.getType();
        java.lang.String str13 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52" + "'", str10, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str11, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 35" + "'", str12, "hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1," + "'", str13, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
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
        int int26 = item7.getCopiesAvailable();
        item7.setLocation("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " () - Copies: 100" + "'", str24, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
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
        item7.setGenre("-1,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,hi!,,100,hi!,hi! () - Copies: 1");
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
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        gui.Item item7 = new gui.Item((int) (byte) 10, "-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "", " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10", (-1), "52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str8 = item7.getGenre();
        item7.setLocation("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 97");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str8, "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
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
        item7.setCopiesAvailable((int) 'a');
        int int32 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str24, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!", 35, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        java.lang.String str10 = item7.toCsvString();
        item7.setAuthor("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "10,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!,35,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!" + "'", str10, "10,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!,35,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.toString();
        item7.setItemId((int) 'a');
        item7.setCopiesAvailable((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        gui.Item item7 = new gui.Item(1, "hi! () - Copies: 1", "-1,,hi!,,100,hi!,hi! () - Copies: 1", "hi! () - Copies: -1", (int) ' ', "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "hi! () - Copies: -1");
        int int8 = item7.getCopiesAvailable();
        java.lang.String str9 = item7.getType();
        int int10 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
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
        int int21 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1,,hi!,,1,-1,,hi!,,1,hi!,hi!, (hi!) - Copies: 1" + "'", str20, "1,,hi!,,1,-1,,hi!,,1,hi!,hi!, (hi!) - Copies: 1");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        java.lang.String str13 = item7.toCsvString();
        item7.setName("-1,,hi!,,1,hi! () - Copies: -1,hi!");
        java.lang.String str16 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str13, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,,hi!,,1,hi!,", (-1), "", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) '#');
        item7.setType("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setName("-1,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
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
        item7.setGenre("-1,,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32) - Copies: 97");
        java.lang.String str28 = item7.getType();
        item7.setName("-1,,-1,,hi!,,1,hi!,hi!,,100,52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,52,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!" + "'", str25, "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str28, "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str14 = item7.getLocation();
        item7.setName("hi! () - Copies: 35");
        java.lang.String str17 = item7.getAuthor();
        java.lang.String str18 = item7.getName();
        item7.setName("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 35" + "'", str18, "hi! () - Copies: 35");
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setGenre("");
        item7.setGenre("-1,hi!,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,35,hi!,");
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getType();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        item7.setGenre("-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
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
        item7.setAuthor("");
        item7.setLocation("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.toCsvString();
        int int13 = item7.getCopiesAvailable();
        item7.setItemId((int) (short) 10);
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getName();
        java.lang.String str18 = item7.getType();
        java.lang.String str19 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "10,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str19, "10,,,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        gui.Item item7 = new gui.Item((int) (byte) 0, "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,hi! () - Copies: 1,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!", "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", "0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", (int) '#', "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "hi! () - Copies: 100");
        item7.setLocation("-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getAuthor();
        java.lang.String str11 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str10, "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 100" + "'", str11, "hi! () - Copies: 100");
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
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
        item7.setLocation("-1,,hi!,,1,hi!,hi! (-1,hi!,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        int int15 = item7.getCopiesAvailable();
        int int16 = item7.getCopiesAvailable();
        java.lang.String str17 = item7.getLocation();
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
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setName("-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.toString();
        java.lang.String str19 = item7.toString();
        java.lang.String str20 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str18, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str19, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str20, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        gui.Item item7 = new gui.Item((int) '#', "hi! (hi!) - Copies: 1", "hi! () - Copies: 35", "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", (int) ' ', "", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str10, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str11, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        gui.Item item7 = new gui.Item((int) (byte) -1, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi! () - Copies: 1", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", 100, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str8 = item7.getAuthor();
        java.lang.String str9 = item7.getAuthor();
        item7.setCopiesAvailable((int) (short) 100);
        java.lang.String str12 = item7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str8, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str9, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1 (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 100" + "'", str12, "hi! () - Copies: 1 (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 100");
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        gui.Item item7 = new gui.Item((int) (byte) 10, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!", "32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0", (int) (byte) -1, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,,hi!,,-1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        java.lang.String str8 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str8, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setItemId((int) (short) 10);
        item7.setName("hi! () - Copies: -1 (hi! () - Copies: -1) - Copies: 100 (hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        int int9 = item7.getItemId();
        item7.setItemId((-1));
        java.lang.String str12 = item7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " () - Copies: 100" + "'", str12, " () - Copies: 100");
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! () - Copies: 1");
        item7.setItemId((int) 'a');
        item7.setItemId(32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
        item7.setLocation("-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        gui.Item item7 = new gui.Item((int) (short) 1, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "", (int) (short) 1, "0,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.toCsvString();
        java.lang.String str10 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str8, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,1,0,,hi!,,1,hi!,hi!," + "'", str9, "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,1,0,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,1,0,,hi!,,1,hi!,hi!," + "'", str10, "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,1,0,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,,hi!,,1,hi!,");
        int int18 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) (short) 0);
        item7.setName("0,,hi!,,32,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.getLocation();
        item7.setType("hi! () - Copies: -1");
        java.lang.String str18 = item7.toCsvString();
        int int19 = item7.getItemId();
        item7.setAuthor("32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str22 = item7.getType();
        item7.setCopiesAvailable(52);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,hi! () - Copies: -1,hi!,,1,hi!,hi!" + "'", str18, "0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: -1" + "'", str22, "hi! () - Copies: -1");
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.getGenre();
        java.lang.String str14 = item7.toCsvString();
        item7.setItemId((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        gui.Item item7 = new gui.Item((int) (short) 100, "100,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,35,hi!,,52,hi! () - Copies: 100, (hi!) - Copies: 1", "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!", "0,,hi!,,32,hi!,hi! (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 32", (int) (short) -1, "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52");
        int int8 = item7.getCopiesAvailable();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        gui.Item item7 = new gui.Item((-1), "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", (int) '4', " () - Copies: -1", "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setType("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getType();
        int int11 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!" + "'", str10, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
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
        java.lang.String str23 = item7.getName();
        item7.setCopiesAvailable((int) 'a');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        item7.setAuthor("hi! () - Copies: 100");
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 100" + "'", str16, "hi! () - Copies: 100");
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.toString();
        java.lang.String str16 = item7.toString();
        java.lang.String str17 = item7.getName();
        java.lang.String str18 = item7.getLocation();
        item7.setType("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setLocation("32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,,52,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
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
        java.lang.String str22 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32", 0, "hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1", "-1,,hi!,,1,hi!,");
        item7.setType("");
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setItemId(10);
        item7.setGenre("-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setAuthor("32, () - Copies: -1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi! () - Copies: 1 (hi!) - Copies: 35");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 35,");
        java.lang.Class<?> wildcardClass17 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str10 = item7.toCsvString();
        item7.setCopiesAvailable((int) (byte) -1);
        java.lang.String str13 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str10, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: -1" + "'", str13, "hi! () - Copies: 1 (hi!) - Copies: -1");
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        gui.Item item7 = new gui.Item((int) (short) 0, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi!", "-1,,hi!,,1,hi!,hi!", (int) (short) 100, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!");
        item7.setType("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setCopiesAvailable((int) '#');
        item7.setLocation("hi! (hi!) - Copies: 1");
        java.lang.String str14 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,hi! (hi!) - Copies: 1,35,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!" + "'", str14, "0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,hi! (hi!) - Copies: 1,35,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
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
        java.lang.String str22 = item7.getName();
        item7.setItemId(32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str22, "32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0");
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
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
        java.lang.String str20 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
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
        java.lang.String str20 = item7.getType();
        int int21 = item7.getItemId();
        java.lang.String str22 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setGenre("");
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.toCsvString();
        item7.setAuthor("0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int16 = item7.getCopiesAvailable();
        item7.setAuthor("32,-1,,hi!,,1,hi!,hi! () - Copies: 100,,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,100,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!," + "'", str12, "-1,,hi!,,1,hi!,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,hi!," + "'", str13, "-1,,hi!,,1,hi!,");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
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
        int int25 = item7.getCopiesAvailable();
        java.lang.String str26 = item7.getType();
        java.lang.String str27 = item7.toCsvString();
        item7.setCopiesAvailable((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str27, "-1,,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        item7.setGenre("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        int int10 = item7.getItemId();
        item7.setType("hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        java.lang.String str13 = item7.getGenre();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str13, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
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
        item7.setLocation("32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,,52,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
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
        item7.setGenre("-1,,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32) - Copies: 97");
        java.lang.String str28 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!" + "'", str25, "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        gui.Item item7 = new gui.Item((int) '4', "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35", "-1,hi!,hi!,,1,hi!,hi!", "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", (int) (byte) 10, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.String str8 = item7.getAuthor();
        java.lang.String str9 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str8, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!" + "'", str9, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        gui.Item item7 = new gui.Item((int) 'a', "-1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,0,,hi!,,1,hi!,hi!,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!", "100,,,hi! () - Copies: 1,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,", " () - Copies: 10", (int) (byte) 100, "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "52,-1,,hi!,,1,hi!,hi! () - Copies: 100,-1,,hi!,,1,hi! () - Copies: -1,hi!,32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1,0,0,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getGenre();
        item7.setCopiesAvailable((-1));
        java.lang.String str19 = item7.toString();
        item7.setName("32,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,97,,-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!");
        item7.setName("0,,hi!,hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: -1" + "'", str19, "hi! () - Copies: -1");
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str18 = item7.getName();
        java.lang.String str19 = item7.getName();
        java.lang.String str20 = item7.getGenre();
        int int21 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        gui.Item item7 = new gui.Item((int) (short) 100, "0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,1,hi!,hi!", " (hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0) - Copies: -1", "-1,,-1,,hi!,,1,hi!,hi!,,52,hi!,hi! () - Copies: 1", (int) (short) 10, "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 1", "1,hi!,hi! () - Copies: 1,,0,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setLocation("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setName("-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getLocation();
        java.lang.String str14 = item7.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1" + "'", str12, "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str13, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1" + "'", str14, "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        int int17 = item7.getItemId();
        int int18 = item7.getCopiesAvailable();
        java.lang.String str19 = item7.getGenre();
        item7.setItemId(97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str19, "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getGenre();
        java.lang.String str18 = item7.getLocation();
        java.lang.String str19 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
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
        item7.setGenre("-1,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,hi!,,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.toString();
        item7.setItemId((int) (byte) 100);
        java.lang.Class<?> wildcardClass19 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getName();
        item7.setCopiesAvailable(1);
        java.lang.String str17 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        gui.Item item7 = new gui.Item((int) (short) 0, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi!", "-1,,hi!,,1,hi!,hi!", (int) (short) 100, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.toCsvString();
        java.lang.String str11 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!" + "'", str10, "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        int int12 = item7.getItemId();
        java.lang.String str13 = item7.getAuthor();
        java.lang.String str14 = item7.getAuthor();
        java.lang.String str15 = item7.getType();
        item7.setGenre("97,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
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
        int int27 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
        java.lang.String str20 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: -1" + "'", str19, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
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
        item7.setItemId((int) (byte) 10);
        java.lang.String str24 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str19, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
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
        java.lang.String str23 = item7.getType();
        java.lang.String str24 = item7.getAuthor();
        item7.setName(" (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10 () - Copies: 1");
        item7.setName("hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 52");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
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
        item7.setItemId((int) 'a');
        item7.setType("-1,,hi!,,1,hi!,hi! (-1,hi!,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        java.lang.String str20 = item7.getAuthor();
        item7.setGenre("hi! () - Copies: 1 () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 32" + "'", str19, "hi! () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
        gui.Item item7 = new gui.Item((int) (byte) 10, "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", "hi!", "-1,,hi!,,35,hi!,", 1, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "");
        item7.setGenre("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 52");
        java.lang.String str12 = item7.toString();
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! (1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,) - Copies: 1" + "'", str12, "hi! (1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,) - Copies: 1");
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        gui.Item item7 = new gui.Item(10, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100", "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 32, " () - Copies: 10", "-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getLocation();
        item7.setLocation("100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi! ( () - Copies: -1) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str8, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        gui.Item item7 = new gui.Item((-1), "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!", (int) (short) 0, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        int int8 = item7.getCopiesAvailable();
        item7.setName("-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int11 = item7.getCopiesAvailable();
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.getLocation();
        java.lang.String str14 = item7.getGenre();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str13, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str14, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
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
        item7.setItemId((int) '#');
        item7.setGenre("hi! (1,,,,100,-1,,hi!,,1,hi!,hi!,) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        item7.setLocation("hi!");
        item7.setCopiesAvailable((int) (short) 10);
        java.lang.String str19 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 10" + "'", str19, "hi! () - Copies: 10");
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
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
        int int25 = item7.getItemId();
        java.lang.String str26 = item7.toString();
        int int27 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi! () - Copies: 1 () - Copies: 100" + "'", str26, "hi! () - Copies: 1 () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        int int11 = item7.getCopiesAvailable();
        int int12 = item7.getCopiesAvailable();
        item7.setItemId((-1));
        int int15 = item7.getCopiesAvailable();
        java.lang.String str16 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        gui.Item item7 = new gui.Item((int) (short) 1, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "", (int) (short) 1, "0,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        item7.setCopiesAvailable((int) '4');
        int int11 = item7.getItemId();
        java.lang.String str12 = item7.getLocation();
        java.lang.String str13 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str13, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        java.lang.String str14 = item7.getLocation();
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.toString();
        java.lang.String str17 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("");
        item7.setCopiesAvailable((int) (short) 1);
        java.lang.String str17 = item7.toCsvString();
        int int18 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        int int14 = item7.getCopiesAvailable();
        item7.setItemId((int) (byte) 0);
        item7.setLocation("32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.toCsvString();
        item7.setType("10,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0,,hi!,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!" + "'", str19, "0,,hi!,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!");
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
        gui.Item item7 = new gui.Item((int) (byte) 0, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1", " () - Copies: 97", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!", (int) 'a', "-1,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, (hi! () - Copies: -1) - Copies: -1,hi!,,1,hi!,hi!", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
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
        java.lang.String str24 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " () - Copies: -1" + "'", str21, " () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
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
        java.lang.String str20 = item7.toString();
        java.lang.String str21 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! () - Copies: 1" + "'", str20, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        gui.Item item7 = new gui.Item(0, "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!", "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,", "hi! (hi!) - Copies: 1", (int) ' ', "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!", "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
        item7.setLocation("hi! (hi! (0,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 1");
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.toCsvString();
        int int13 = item7.getCopiesAvailable();
        item7.setItemId((int) (short) 10);
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getName();
        java.lang.String str18 = item7.getType();
        java.lang.String str19 = item7.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setItemId(10);
        java.lang.String str18 = item7.toCsvString();
        java.lang.String str19 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!" + "'", str18, "10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        gui.Item item7 = new gui.Item(97, "-1,-1,hi!,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,,0,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 1,0,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi! () - Copies: 1,hi!", "52,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,hi!,10,-1,,,,1,-1,,hi!,,1,hi!,hi!,,hi!", (int) (byte) -1, "-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        item7.setLocation("-1,,,hi!,100,hi!,hi! () - Copies: 1");
        item7.setItemId((int) (byte) 100);
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
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
        java.lang.String str19 = item7.toCsvString();
        int int20 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "97,,hi!,,1,hi!,hi!" + "'", str19, "97,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
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
        item7.setCopiesAvailable(35);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
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
        item7.setGenre("");
        java.lang.String str23 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        gui.Item item7 = new gui.Item(35, " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10", "-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", "hi!", (int) (short) 1, "0,hi! () - Copies: -1,hi!,,1,hi!,hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
        item7.setCopiesAvailable(100);
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getLocation();
        item7.setType("1,hi! () - Copies: 1,-1,,hi!,,100,hi!,hi! () - Copies: 1,hi! () - Copies: -1,32,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi! () - Copies: -1");
        java.lang.String str14 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str10, "-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32" + "'", str14, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        item7.setCopiesAvailable(100);
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        java.lang.String str23 = item7.getAuthor();
        java.lang.String str24 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str24, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,,hi!,,1,hi!,");
        int int18 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) (short) 0);
        java.lang.String str21 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,-1,,hi!,,1,hi!,,hi!,-1,,hi!,,1,hi!,hi!,0,hi!,hi!" + "'", str21, "-1,-1,,hi!,,1,hi!,,hi!,-1,,hi!,,1,hi!,hi!,0,hi!,hi!");
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
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
        item7.setGenre("1,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,,32, () - Copies: 100,hi!");
        int int30 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "0,,hi!,hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str27, "0,,hi!,hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.toString();
        java.lang.String str10 = item7.toString();
        item7.setName("-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! (hi! () - Copies: 1) - Copies: 10" + "'", str9, "hi! (hi! () - Copies: 1) - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! (hi! () - Copies: 1) - Copies: 10" + "'", str10, "hi! (hi! () - Copies: 1) - Copies: 10");
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toCsvString();
        int int12 = item7.getCopiesAvailable();
        java.lang.String str13 = item7.getType();
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1");
        java.lang.String str16 = item7.toCsvString();
        item7.setGenre("-1,,hi!,,52,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1" + "'", str16, "-1,,hi!,,1,hi!,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1");
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getName();
        item7.setAuthor("32,,,,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str12 = item7.toCsvString();
        item7.setCopiesAvailable(0);
        item7.setItemId((int) (short) 1);
        item7.setAuthor("-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("");
        item7.setName("-1,,hi!,,1,-1,hi!,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str23 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getCopiesAvailable();
        item7.setItemId((int) (byte) 100);
        java.lang.String str11 = item7.getType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        gui.Item item7 = new gui.Item((int) ' ', "", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "hi! () - Copies: 35", (int) (byte) 10, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.String str8 = item7.toCsvString();
        int int9 = item7.getCopiesAvailable();
        int int10 = item7.getItemId();
        int int11 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str8, "32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
        gui.Item item7 = new gui.Item(10, "97,,-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!,,1,hi!,hi!", "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,", "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", (int) '4', "-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32");
        java.lang.String str8 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
        gui.Item item7 = new gui.Item((int) (byte) 100, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: -1", "hi! () - Copies: 1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,", (int) (short) 100, "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52");
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! () - Copies: 1", (int) (short) 1, "hi! () - Copies: 1", "-1,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("hi!");
        java.lang.String str12 = item7.toString();
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setName("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str12, "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        gui.Item item7 = new gui.Item((int) (byte) 100, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", " () - Copies: 100", "", (int) 'a', "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setAuthor("0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("0,,hi!,,1,hi!,hi!");
        item7.setLocation("10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        java.lang.String str22 = item7.toString();
        int int23 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 1" + "'", str22, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getLocation();
        item7.setCopiesAvailable((int) (short) 10);
        java.lang.String str11 = item7.getType();
        item7.setName("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        java.lang.String str14 = item7.getLocation();
        int int15 = item7.getCopiesAvailable();
        item7.setType("1,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,hi!,,32,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        java.lang.String str8 = item7.getAuthor();
        item7.setLocation("hi! () - Copies: 1 (hi!) - Copies: 35");
        item7.setItemId((int) ' ');
        int int13 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        java.lang.String str11 = item7.getType();
        item7.setType("hi! (hi!) - Copies: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,,hi!,,1,hi!,", (-1), "", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) '#');
        java.lang.String str10 = item7.getGenre();
        java.lang.String str11 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str10, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getName();
        item7.setGenre(" () - Copies: 100");
        item7.setLocation("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        java.lang.String str19 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        int int9 = item7.getItemId();
        item7.setItemId((-1));
        item7.setName("32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
        int int14 = item7.getItemId();
        item7.setCopiesAvailable(0);
        java.lang.String str17 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        gui.Item item7 = new gui.Item((int) (short) -1, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: -1", "35,,hi!,0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,1,hi! () - Copies: -1,hi!", 0, "", "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1");
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
        gui.Item item7 = new gui.Item((int) 'a', "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32", "100,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,35,hi!,,52,hi! () - Copies: 100, (hi!) - Copies: 1", "1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", 0, "-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", "hi! (hi! () - Copies: 1) - Copies: 10");
        item7.setType("32,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,35,hi!,,52,hi! () - Copies: 100, (hi!) - Copies: 1" + "'", str10, "100,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,35,hi!,,52,hi! () - Copies: 100, (hi!) - Copies: 1");
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("hi! () - Copies: 35");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str12 = item7.getType();
        java.lang.String str13 = item7.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        gui.Item item7 = new gui.Item(10, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100", "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 32, " () - Copies: 10", "-1,hi!,hi!,,1,hi!,hi!");
        item7.setLocation("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        gui.Item item7 = new gui.Item((-1), "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", (int) '4', " () - Copies: -1", "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getName();
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str8, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str9, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str10, "-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
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
        item7.setGenre("-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str19, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.getGenre();
        item7.setLocation("hi! () - Copies: 35");
        item7.setAuthor("52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str22 = item7.getLocation();
        item7.setGenre("-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 35" + "'", str22, "hi! () - Copies: 35");
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
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
        int int22 = item7.getItemId();
        item7.setCopiesAvailable(32);
        item7.setLocation("100,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,35,hi!,,52,hi! () - Copies: 100, (hi!) - Copies: 1");
        item7.setType("hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10");
        java.lang.String str29 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "100,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,35,hi!,,52,hi! () - Copies: 100, (hi!) - Copies: 1" + "'", str29, "100,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,35,hi!,,52,hi! () - Copies: 100, (hi!) - Copies: 1");
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        int int8 = item7.getItemId();
        int int9 = item7.getItemId();
        java.lang.String str10 = item7.toCsvString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100,,hi!,,1,,hi! () - Copies: 1" + "'", str10, "100,,hi!,,1,,hi! () - Copies: 1");
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        item7.setLocation("");
        java.lang.String str18 = item7.getLocation();
        item7.setAuthor("1,,,,100,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
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
        item7.setAuthor("-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
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
        java.lang.String str22 = item7.getLocation();
        item7.setLocation("1,hi!,hi! () - Copies: 1,,35,hi! () - Copies: 35,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        gui.Item item7 = new gui.Item((int) '4', "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi! (hi! () - Copies: 1) - Copies: 35", "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 32", (int) (short) -1, "", "1,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,hi!,,32,hi!,hi!");
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str13 = item7.getAuthor();
        java.lang.String str14 = item7.getName();
        int int15 = item7.getItemId();
        item7.setGenre("52,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,10,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.String str18 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str13, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        item7.setCopiesAvailable((-1));
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str14 = item7.getName();
        item7.setCopiesAvailable(35);
        item7.setType("-1,,hi!,,35,hi!,");
        int int19 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
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
        java.lang.String str23 = item7.toCsvString();
        item7.setType("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1, (hi! () - Copies: 35) - Copies: 52");
        item7.setGenre("0,,hi!,,-1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str23, "-1,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        java.lang.String str12 = item7.toCsvString();
        int int13 = item7.getCopiesAvailable();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.toString();
        java.lang.String str17 = item7.getAuthor();
        java.lang.String str18 = item7.toString();
        item7.setLocation("-1,,hi!,,35,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 1" + "'", str18, "hi! () - Copies: 1");
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
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
        item7.setItemId(35);
        java.lang.String str27 = item7.toString();
        item7.setItemId(52);
        java.lang.String str30 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str27, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str30, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setName("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str13 = item7.toCsvString();
        item7.setName("-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str13, "-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        gui.Item item7 = new gui.Item((int) (short) 0, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 32, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getItemId();
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str11 = item7.getType();
        item7.setGenre("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 0");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str11, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        gui.Item item7 = new gui.Item((int) (short) 0, "-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,-1,hi!,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,,0,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "1,hi!,hi! () - Copies: 1,,0,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", (int) (short) 1, "1,,hi!,,32,hi!,hi!", "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        java.lang.String str8 = item7.getAuthor();
        java.lang.String str9 = item7.getName();
        java.lang.String str10 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,hi! () - Copies: 1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!" + "'", str10, "-1,hi! () - Copies: 1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!");
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.toString();
        java.lang.String str12 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " () - Copies: 10" + "'", str11, " () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " () - Copies: 10" + "'", str12, " () - Copies: 10");
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setName("hi! () - Copies: 1");
        int int18 = item7.getCopiesAvailable();
        java.lang.String str19 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '#');
        item7.setName("32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi! (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 0");
        java.lang.String str12 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
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
        java.lang.String str22 = item7.toString();
        int int23 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 32" + "'", str22, "hi! () - Copies: 32");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        int int14 = item7.getCopiesAvailable();
        int int15 = item7.getItemId();
        java.lang.String str16 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getName();
        int int16 = item7.getCopiesAvailable();
        int int17 = item7.getItemId();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
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
        item7.setType("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str19, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,35,hi!,");
        item7.setCopiesAvailable(0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setGenre("");
        item7.setGenre("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1");
        int int14 = item7.getItemId();
        java.lang.String str15 = item7.toCsvString();
        java.lang.String str16 = item7.toCsvString();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1" + "'", str15, "-1,,hi!,,1,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1" + "'", str16, "-1,,hi!,,1,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1");
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
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
        java.lang.String str26 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " () - Copies: 100" + "'", str24, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getLocation();
        java.lang.String str17 = item7.getLocation();
        item7.setItemId((int) (byte) 100);
        item7.setItemId((int) '4');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getName();
        int int17 = item7.getCopiesAvailable();
        item7.setLocation("0,,hi!,,32,hi!,hi! (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
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
        item7.setLocation("97,,hi!,,1,hi!,hi! (hi! () - Copies: 32) - Copies: 100");
        int int27 = item7.getCopiesAvailable();
        int int28 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 100 + "'", int27 == 100);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
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
        item7.setGenre("hi! () - Copies: -1");
        java.lang.String str25 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str15, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str16, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
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
        item7.setCopiesAvailable(97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        gui.Item item7 = new gui.Item((int) (byte) 100, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32", "hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32", (int) (byte) 100, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str8 = item7.getGenre();
        item7.setAuthor("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str8, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
        gui.Item item7 = new gui.Item((int) (short) 0, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!", " () - Copies: -1", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1", 10, "-1,,,,1,-1,,hi!,,1,hi!,hi!,", "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        item7.setType("-1,,,-1,,hi!,,52,hi!,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        gui.Item item7 = new gui.Item(100, "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "10,hi!,hi!,,1,hi!,hi!", "-1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", (int) (byte) -1, "0,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!, () - Copies: -1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1,10,-1,,,,1,-1,,hi!,,1,hi!,hi!,,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35", "32,,,,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,,hi!,100,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
        gui.Item item7 = new gui.Item((int) (short) 0, "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1", "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", "32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,52,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,", 52, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "1,hi! () - Copies: 1,-1,,hi!,,100,hi!,hi! () - Copies: 1,hi! () - Copies: -1,32,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi! () - Copies: -1");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
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
        item7.setLocation("");
        java.lang.String str23 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,hi! () - Copies: -1,hi!,,1,hi!,hi!" + "'", str18, "0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        gui.Item item7 = new gui.Item((int) (byte) -1, "-1,,,,-1,hi!,hi!", "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: -1", "35,hi! (hi!) - Copies: 1,hi! () - Copies: 35,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!", 52, "100,,hi!,,32,hi!,hi!", "0,, (hi! () - Copies: 32) - Copies: 100,,10,hi!,hi!");
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        gui.Item item7 = new gui.Item(52, "-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! () - Copies: -1 (hi! () - Copies: -1) - Copies: 100", "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", 52, "hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1", "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setType("35,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setType("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setName("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        item7.setLocation("hi! () - Copies: 0");
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        gui.Item item7 = new gui.Item((int) (short) 0, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi!", "-1,,hi!,,1,hi!,hi!", (int) (short) 100, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!");
        item7.setType("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str10 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str10, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
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
        item7.setLocation("-1,,hi!,,52,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 1" + "'", str22, "hi! () - Copies: 1");
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
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
        int int21 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
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
        java.lang.String str23 = item7.getAuthor();
        java.lang.String str24 = item7.getName();
        item7.setCopiesAvailable(0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 1" + "'", str21, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        int int10 = item7.getCopiesAvailable();
        int int11 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
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
        item7.setCopiesAvailable((int) (short) 0);
        java.lang.String str26 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str23, "1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setCopiesAvailable((-1));
        java.lang.String str20 = item7.getLocation();
        java.lang.String str21 = item7.toString();
        item7.setAuthor(" () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: -1" + "'", str21, "hi! () - Copies: -1");
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        gui.Item item7 = new gui.Item(0, "-1,,hi!,,-1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,", "32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!", "1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", 10, "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1", "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setLocation("hi! () - Copies: 32");
        item7.setAuthor("hi!");
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str13 = item7.getLocation();
        java.lang.String str14 = item7.toCsvString();
        java.lang.String str15 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!" + "'", str14, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        gui.Item item7 = new gui.Item((int) '4', "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35", "-1,hi!,hi!,,1,hi!,hi!", "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", (int) (byte) 10, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "hi! () - Copies: 1 (hi!) - Copies: 0");
        item7.setAuthor("52,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,hi!,10,-1,,,,1,-1,,hi!,,1,hi!,hi!,,hi!");
        java.lang.String str10 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str10, "hi! () - Copies: 1 (hi!) - Copies: 0");
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        java.lang.String str14 = item7.getLocation();
        java.lang.String str15 = item7.toString();
        java.lang.String str16 = item7.getLocation();
        item7.setGenre("hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
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
        item7.setLocation("35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setType("hi! (hi! (0,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        gui.Item item7 = new gui.Item((int) (short) 0, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi!", "-1,,hi!,,1,hi!,hi!", (int) (short) 100, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        int int10 = item7.getItemId();
        java.lang.String str11 = item7.getLocation();
        int int12 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        gui.Item item7 = new gui.Item((int) (byte) 10, "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!", "hi! () - Copies: 1 (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 100", "-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,", 100, "-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! (-1,,,hi!,100,hi!,hi! () - Copies: 1) - Copies: 35", "-1,,hi!,,1,-1,,hi!,,1,hi!,hi! () - Copies: 100,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        int int8 = item7.getCopiesAvailable();
        item7.setAuthor("-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str11 = item7.getGenre();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getName();
        item7.setCopiesAvailable(1);
        int int17 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.getType();
        int int10 = item7.getCopiesAvailable();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.toCsvString();
        item7.setCopiesAvailable(1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,hi! () - Copies: 1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!" + "'", str12, "-1,hi! () - Copies: 1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!");
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.toCsvString();
        item7.setLocation("-1,,hi!,,52,hi!,");
        java.lang.String str16 = item7.getAuthor();
        java.lang.String str17 = item7.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str13, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
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
        java.lang.String str22 = item7.getAuthor();
        item7.setItemId((int) '#');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
        gui.Item item7 = new gui.Item((int) '#', "-1,,hi!,,1,hi! () - Copies: 1,hi!", "", " () - Copies: 100", (int) (byte) 100, "hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str10 = item7.getName();
        item7.setCopiesAvailable((int) (short) 1);
        item7.setAuthor("hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        gui.Item item7 = new gui.Item(52, "-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", 32, "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setType("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getAuthor();
        item7.setAuthor("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str11, "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        gui.Item item7 = new gui.Item((int) (byte) -1, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi! () - Copies: 1", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", 100, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setName("-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
        item7.setType("hi! () - Copies: 1 () - Copies: 100");
        item7.setType("32,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getName();
        item7.setCopiesAvailable((int) ' ');
        java.lang.String str17 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
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
        item7.setGenre("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,hi!");
        java.lang.String str25 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1" + "'", str22, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        gui.Item item7 = new gui.Item(52, "-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", 32, "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str8 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "52,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,32,32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str8, "52,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,32,32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        java.lang.String str8 = item7.getLocation();
        java.lang.String str9 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str10 = item7.toCsvString();
        java.lang.String str11 = item7.getLocation();
        java.lang.String str12 = item7.getGenre();
        item7.setLocation("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str10, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("-1,,hi!,,1,hi!,hi! () - Copies: 100");
        java.lang.String str17 = item7.getName();
        int int18 = item7.getItemId();
        item7.setName("0,,hi!,,32,hi!,hi!");
        item7.setType("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!");
        item7.setName("-1,,hi!,-1,,hi!,,1,hi!,hi!,-1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str13 = item7.getAuthor();
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.getGenre();
        item7.setCopiesAvailable((-1));
        java.lang.String str18 = item7.getAuthor();
        int int19 = item7.getCopiesAvailable();
        item7.setName("32,,hi!,,1,hi! () - Copies: 1,hi! (0,,hi!,,1,hi!, () - Copies: 10) - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str13, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str15, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        java.lang.String str14 = item7.getGenre();
        int int15 = item7.getItemId();
        java.lang.String str16 = item7.toString();
        int int17 = item7.getCopiesAvailable();
        java.lang.String str18 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str18, "0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        java.lang.String str14 = item7.getGenre();
        java.lang.Class<?> wildcardClass15 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        item7.setType("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str15 = item7.getLocation();
        item7.setLocation("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.Class<?> wildcardClass18 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str12 = item7.getType();
        int int13 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,,hi!,100,hi!,hi! () - Copies: 1");
        java.lang.Class<?> wildcardClass16 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
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
        item7.setName("100,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,35,hi!,,52,hi! () - Copies: 100, (hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 1" + "'", str20, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 1");
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        gui.Item item7 = new gui.Item((int) (short) 1, "-1,,-1,,hi!,,1,hi!,hi!,,100,52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,52,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,", "hi! () - Copies: -1 (hi! () - Copies: -1) - Copies: 100", "10,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!,35,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!", (int) (byte) 100, "35,hi!,hi!,,1,hi!,hi!", "hi! () - Copies: 1 (hi!) - Copies: 35");
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        item7.setItemId(1);
        java.lang.String str18 = item7.getGenre();
        int int19 = item7.getItemId();
        java.lang.String str20 = item7.getType();
        item7.setAuthor("0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setName("hi!");
        java.lang.String str14 = item7.toString();
        item7.setItemId((int) '#');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
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
        java.lang.String str25 = item7.getGenre();
        java.lang.String str26 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str15, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str16, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! () - Copies: 1" + "'", str23, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str24, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
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
        item7.setName("-1,,hi!,,1,hi!,hi! () - Copies: 100");
        item7.setGenre("-1,,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str25 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1,-1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,,-1,hi!,-1,,hi!,,1,hi!,hi! () - Copies: 1" + "'", str25, "-1,-1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,,-1,hi!,-1,,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setItemId((int) (byte) 1);
        item7.setType("-1,,hi!,,1,hi!,hi!");
        java.lang.String str15 = item7.getGenre();
        item7.setCopiesAvailable((int) (short) 0);
        java.lang.String str18 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,100,hi!,hi! () - Copies: 1");
        java.lang.String str13 = item7.toCsvString();
        int int14 = item7.getItemId();
        java.lang.String str15 = item7.getGenre();
        item7.setItemId(35);
        item7.setGenre("-1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,0,,hi!,,1,hi!,hi!,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setName("hi! () - Copies: -1");
        item7.setLocation("-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32 (-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 52");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1," + "'", str13, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
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
        int int23 = item7.getItemId();
        java.lang.String str24 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi! () - Copies: 1" + "'", str24, "hi! () - Copies: 1");
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
        gui.Item item7 = new gui.Item((int) (short) 10, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!", (int) (short) 0, "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getItemId();
        item7.setType("-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!");
        item7.setGenre("");
        item7.setAuthor("-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setGenre("");
        item7.setLocation("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,hi!,35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,hi!,hi!");
        int int16 = item7.getCopiesAvailable();
        java.lang.String str17 = item7.getType();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
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
        int int26 = item7.getCopiesAvailable();
        item7.setItemId((int) (short) 1);
        item7.setType("-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str16 = item7.toString();
        item7.setGenre("");
        java.lang.String str19 = item7.toString();
        item7.setName("-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,35,hi!,hi! () - Copies: 1");
        java.lang.String str22 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: -1" + "'", str19, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,35,hi!,hi! () - Copies: 1" + "'", str22, "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,35,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
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
        java.lang.String str20 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setCopiesAvailable(0);
        item7.setItemId((int) 'a');
        java.lang.String str17 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        java.lang.String str9 = item7.getGenre();
        item7.setType("hi! (hi! () - Copies: 1) - Copies: 32");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        item7.setItemId(32);
        item7.setItemId(52);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
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
        int int26 = item7.getCopiesAvailable();
        java.lang.String str27 = item7.getName();
        java.lang.String str28 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " () - Copies: 100" + "'", str24, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " () - Copies: 100" + "'", str28, " () - Copies: 100");
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
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
        item7.setName("0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setItemId(100);
        item7.setName("-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!");
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
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
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
        item7.setCopiesAvailable((int) 'a');
        int int22 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
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
        java.lang.String str22 = item7.toString();
        item7.setName("-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi! ( () - Copies: -1) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 32" + "'", str18, "hi! () - Copies: 32");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 32" + "'", str22, "hi! () - Copies: 32");
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        gui.Item item7 = new gui.Item((int) (short) 1, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "", (int) (short) 1, "0,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        java.lang.String str9 = item7.toString();
        java.lang.Class<?> wildcardClass10 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1" + "'", str9, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        gui.Item item7 = new gui.Item((int) (short) -1, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35", "-1,,hi!,,1,hi!,", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", (int) (byte) 10, "0,,hi!,,1,hi!,hi!", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.getAuthor();
        java.lang.Class<?> wildcardClass10 = item7.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str9, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        gui.Item item7 = new gui.Item((int) ' ', "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,hi!,hi!,,1,hi!,hi!) - Copies: 1", "-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32) - Copies: 97", (int) (short) 10, "hi! () - Copies: 1 () - Copies: 100", "32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,97,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        int int8 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
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
        java.lang.String str25 = item7.getName();
        java.lang.String str26 = item7.toString();
        item7.setCopiesAvailable((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35" + "'", str15, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str19, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str25, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35" + "'", str26, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.getGenre();
        java.lang.String str17 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
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
        int int19 = item7.getItemId();
        item7.setLocation("hi! (hi! () - Copies: 1) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setLocation("hi! () - Copies: -1");
        int int18 = item7.getItemId();
        item7.setType("hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        item7.setCopiesAvailable((int) (byte) 1);
        item7.setLocation("1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1 () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
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
        java.lang.String str21 = item7.toCsvString();
        java.lang.String str22 = item7.getName();
        java.lang.Class<?> wildcardClass23 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!" + "'", str21, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        gui.Item item7 = new gui.Item((int) (byte) 1, "-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32", "hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 0", 52, "", "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str13 = item7.getAuthor();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getAuthor();
        item7.setLocation("-1,,hi!,,-1,hi!,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str13, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str15, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        gui.Item item7 = new gui.Item((int) 'a', "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35", "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,1,0,,hi!,,1,hi!,hi!,", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!) - Copies: 100", (int) (byte) 10, "1,hi! () - Copies: 32,,,100,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 1", "");
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
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
        item7.setType("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
        item7.setType(" (hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0) - Copies: -1");
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
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        gui.Item item7 = new gui.Item((int) (short) 100, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32) - Copies: 97", "1,hi!,hi! () - Copies: 1,,35,hi! () - Copies: 35,hi! () - Copies: 1", "", 0, "-1,,hi!,,1,hi!,0,,hi!,,1,hi!,hi!", "52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
        gui.Item item7 = new gui.Item((int) (short) 100, "hi! (1,,,,100,-1,,hi!,,1,hi!,hi!,) - Copies: 1", "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1", "100,,,hi! () - Copies: 1,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,", 10, "hi! () - Copies: -1 (hi! () - Copies: -1) - Copies: 100", "1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,");
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
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
        java.lang.String str21 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getLocation();
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str19 = item7.toString();
        java.lang.String str20 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 1" + "'", str19, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        java.lang.String str9 = item7.getLocation();
        int int10 = item7.getItemId();
        item7.setItemId((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.toCsvString();
        java.lang.String str16 = item7.toCsvString();
        item7.setAuthor("");
        java.lang.String str19 = item7.getType();
        java.lang.String str20 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str15, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str16, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
        gui.Item item7 = new gui.Item((int) (byte) 10, "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,hi!,35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,hi!,hi!", "32, () - Copies: -1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi! () - Copies: 1 (hi!) - Copies: 35", 35, "hi! () - Copies: -1", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setAuthor("-1,,hi!,,1,hi!,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1");
        item7.setName("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.toString();
        java.lang.String str16 = item7.toString();
        int int17 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setType("");
        item7.setCopiesAvailable((-1));
        java.lang.String str20 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,-1,hi!,hi! () - Copies: 1" + "'", str20, "-1,,hi!,,-1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setCopiesAvailable(0);
        java.lang.String str12 = item7.toString();
        java.lang.String str13 = item7.getAuthor();
        int int14 = item7.getItemId();
        java.lang.String str15 = item7.toCsvString();
        item7.setLocation("-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1 (-1,,,,1,-1,,hi!,,1,hi!,hi!,) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str12, "hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str13, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1,hi!,hi! () - Copies: 1,,0,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str15, "1,hi!,hi! () - Copies: 1,,0,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int18 = item7.getItemId();
        int int19 = item7.getItemId();
        java.lang.String str20 = item7.getGenre();
        int int21 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
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
        item7.setName("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str28 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setCopiesAvailable((int) ' ');
        java.lang.String str17 = item7.getName();
        item7.setName("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        int int20 = item7.getCopiesAvailable();
        item7.setItemId((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        java.lang.String str16 = item7.getAuthor();
        int int17 = item7.getCopiesAvailable();
        item7.setAuthor("1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1 () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toString();
        item7.setGenre("-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setCopiesAvailable((int) (byte) 100);
        item7.setAuthor("hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0");
        java.lang.String str21 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 35" + "'", str14, "hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        gui.Item item7 = new gui.Item((int) (byte) 1, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!", "1,,hi!,,32,hi!,hi!", "32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,97,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,", 52, "-1,,hi!,,1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "32,,hi!,,35,52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,");
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setAuthor("hi! () - Copies: -1");
        java.lang.String str13 = item7.getType();
        item7.setItemId(35);
        int int16 = item7.getItemId();
        int int17 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
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
        int int21 = item7.getCopiesAvailable();
        item7.setCopiesAvailable((int) ' ');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str20, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        int int16 = item7.getCopiesAvailable();
        item7.setItemId(0);
        item7.setLocation("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str21 = item7.getType();
        item7.setCopiesAvailable((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        gui.Item item7 = new gui.Item((int) ' ', "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32", "hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35", "-1,,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", 0, "1,hi!,hi! () - Copies: 1,,35,hi! () - Copies: 35,hi! () - Copies: 1", "-1,,,,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getLocation();
        java.lang.String str9 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,," + "'", str8, "-1,,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32" + "'", str9, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32");
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
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
        int int25 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
        gui.Item item7 = new gui.Item((-1), "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!", (int) (short) 0, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        int int8 = item7.getCopiesAvailable();
        item7.setName("-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int11 = item7.getCopiesAvailable();
        java.lang.String str12 = item7.toCsvString();
        item7.setLocation("hi! () - Copies: 1 (hi!) - Copies: 35");
        java.lang.String str15 = item7.getName();
        item7.setCopiesAvailable(10);
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str15, "-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        java.lang.String str10 = item7.getGenre();
        item7.setLocation("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str13 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setLocation("-1,,hi!,-1,,hi!,,1,hi!,hi!,-1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str13, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
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
        item7.setAuthor("32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,hi! () - Copies: -1,hi!,,1,hi!,hi!" + "'", str18, "0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setName(" () - Copies: -1");
        int int16 = item7.getItemId();
        java.lang.String str17 = item7.toCsvString();
        java.lang.String str18 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " () - Copies: -1 () - Copies: 1" + "'", str18, " () - Copies: -1 () - Copies: 1");
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toString();
        int int15 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        gui.Item item7 = new gui.Item(52, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi! (hi! () - Copies: 1) - Copies: 35", "100,hi!,hi! () - Copies: 1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", (int) (byte) 100, "-1,-1,hi!,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,,0,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "32,-1,,hi!,hi!,10,hi!,hi!,,,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
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
        java.lang.String str25 = item7.getGenre();
        int int26 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! () - Copies: 1" + "'", str25, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        gui.Item item7 = new gui.Item((int) ' ', "", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "hi! () - Copies: 35", (int) (byte) 10, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi! () - Copies: 1 (hi!) - Copies: 0");
        java.lang.String str8 = item7.toCsvString();
        item7.setGenre("97,,-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str8, "32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0");
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.getType();
        java.lang.String str10 = item7.toCsvString();
        item7.setCopiesAvailable((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,hi! () - Copies: 1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!" + "'", str10, "-1,hi! () - Copies: 1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!");
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
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
        java.lang.String str20 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str20, "-1,,hi!,,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getName();
        java.lang.String str17 = item7.getName();
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
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
        item7.setLocation("-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!) - Copies: 100");
        java.lang.String str21 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!) - Copies: 100" + "'", str21, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!) - Copies: 100");
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
        gui.Item item7 = new gui.Item((int) (short) 0, "1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!,1,-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!", "1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100", "-1,,,,1,hi!,-1,,hi!,,1,hi!,hi!", (int) (short) 1, "hi! (hi! () - Copies: 1) - Copies: 10", "hi! () - Copies: 0");
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        item7.setLocation("hi!");
        java.lang.String str12 = item7.getType();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        int int9 = item7.getItemId();
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setLocation("");
        java.lang.String str14 = item7.getAuthor();
        item7.setItemId((int) (short) -1);
        item7.setGenre("");
        int int19 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str14, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getLocation();
        java.lang.String str15 = item7.getGenre();
        int int16 = item7.getCopiesAvailable();
        java.lang.String str17 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
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
        java.lang.String str20 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!,,1,hi!, (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10" + "'", str20, "-1,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!,,1,hi!, (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        int int15 = item7.getItemId();
        java.lang.String str16 = item7.getGenre();
        java.lang.String str17 = item7.getName();
        item7.setItemId((int) (byte) 1);
        java.lang.String str20 = item7.getLocation();
        java.lang.String str21 = item7.getAuthor();
        int int22 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setLocation("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) 100);
        int int18 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 100 + "'", int18 == 100);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
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
        java.lang.String str21 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 32" + "'", str19, "hi! () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "0,,hi!,,32,hi!,hi!" + "'", str20, "0,,hi!,,32,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 32" + "'", str21, "hi! () - Copies: 32");
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toCsvString();
        int int12 = item7.getCopiesAvailable();
        java.lang.String str13 = item7.getType();
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1");
        java.lang.String str16 = item7.toCsvString();
        java.lang.String str17 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1" + "'", str16, "-1,,hi!,,1,hi!,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
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
        int int20 = item7.getCopiesAvailable();
        item7.setItemId((int) (short) 100);
        int int23 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        gui.Item item7 = new gui.Item((int) (byte) 10, "0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,hi!,,1,hi! () - Copies: 35,", "10,-1,,hi!,,1,hi! () - Copies: 1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,", (int) (short) -1, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32", "");
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("hi! () - Copies: 1");
        item7.setType("hi! () - Copies: 32");
        item7.setType("0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
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
        int int20 = item7.getCopiesAvailable();
        int int21 = item7.getCopiesAvailable();
        item7.setName("-1,,hi!,,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        item7.setItemId((int) (byte) 0);
        item7.setType("-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str18 = item7.getAuthor();
        int int19 = item7.getItemId();
        java.lang.String str20 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! (-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str20, "hi! (-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
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
        java.lang.String str21 = item7.getAuthor();
        java.lang.String str22 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str22, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.toCsvString();
        java.lang.String str10 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,,hi!,,1,hi!," + "'", str9, "-1,,hi!,,1,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!," + "'", str10, "-1,,hi!,,1,hi!,");
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str16 = item7.toString();
        java.lang.String str17 = item7.getType();
        java.lang.String str18 = item7.toString();
        java.lang.String str19 = item7.toCsvString();
        java.lang.String str20 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: -1" + "'", str18, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str19, "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! () - Copies: -1" + "'", str20, "hi! () - Copies: -1");
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setName(" () - Copies: -1");
        int int16 = item7.getItemId();
        int int17 = item7.getCopiesAvailable();
        java.lang.String str18 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + " () - Copies: -1 () - Copies: 1" + "'", str18, " () - Copies: -1 () - Copies: 1");
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getGenre();
        int int18 = item7.getItemId();
        item7.setType("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!, (-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        java.lang.String str8 = item7.getAuthor();
        item7.setItemId((int) (byte) 10);
        item7.setName(" (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
        item7.setName("-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setCopiesAvailable((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
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
        java.lang.Class<?> wildcardClass21 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        int int9 = item7.getItemId();
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setLocation("");
        item7.setCopiesAvailable((int) (byte) 10);
        java.lang.String str16 = item7.getLocation();
        item7.setType("-1,,hi!,hi!,10,hi!,hi!");
        item7.setType("-1,hi! () - Copies: 1 () - Copies: 100,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setType("-1,,hi!,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getLocation();
        item7.setCopiesAvailable((int) (short) 10);
        java.lang.String str11 = item7.getType();
        item7.setName("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        java.lang.String str14 = item7.getLocation();
        item7.setType("hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getType();
        item7.setItemId(1);
        java.lang.String str15 = item7.getGenre();
        item7.setType("97,,hi!,,1,hi!,hi!");
        item7.setName("32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,");
        int int20 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        gui.Item item7 = new gui.Item((int) (short) 0, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!", " () - Copies: -1", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1", 10, "-1,,,,1,-1,,hi!,,1,hi!,hi!,", "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        java.lang.String str8 = item7.getGenre();
        java.lang.String str9 = item7.toCsvString();
        item7.setCopiesAvailable((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35" + "'", str8, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!, () - Copies: -1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1,10,-1,,,,1,-1,,hi!,,1,hi!,hi!,,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35" + "'", str9, "0,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!, () - Copies: -1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1,10,-1,,,,1,-1,,hi!,,1,hi!,hi!,,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
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
        item7.setGenre("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setItemId((int) ' ');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
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
        java.lang.String str25 = item7.getLocation();
        item7.setItemId((int) (short) -1);
        java.lang.String str28 = item7.getName();
        java.lang.String str29 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str23, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!" + "'", str29, "-1,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getGenre();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getGenre();
        int int18 = item7.getItemId();
        item7.setAuthor("-1,,hi!,,1,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        gui.Item item7 = new gui.Item((int) (short) 0, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi!", "-1,,hi!,,1,hi!,hi!", (int) (short) 100, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "0,,hi!,,1,hi!,hi!");
        item7.setType("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setGenre("32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        item7.setType("-1,,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1");
        java.lang.Class<?> wildcardClass14 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.toString();
        java.lang.String str12 = item7.getGenre();
        item7.setName(" (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
        item7.setName("10,-1,,hi!,,1,hi!,hi!,35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getType();
        item7.setItemId(1);
        java.lang.String str15 = item7.getGenre();
        java.lang.String str16 = item7.toCsvString();
        java.lang.String str17 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1,,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str16, "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1,,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str17, "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        gui.Item item7 = new gui.Item((int) (short) 0, "-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", "1,,,52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,", "10,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!", (int) (short) 100, "hi! () - Copies: -1 (hi! () - Copies: -1) - Copies: 100 (hi!) - Copies: 1", "0,,hi!,,32,hi!,hi!");
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        gui.Item item7 = new gui.Item(52, "-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "", "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", 32, "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,hi! () - Copies: 35,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setType("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str10 = item7.getName();
        int int11 = item7.getItemId();
        java.lang.String str12 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        gui.Item item7 = new gui.Item((int) '4', "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi! () - Copies: 1", "-1,,hi!,,1,hi!,hi! (-1,hi!,hi!,,1,hi!,hi!) - Copies: 1", "hi! () - Copies: 1 () - Copies: 35", (int) (byte) 10, "", "-1,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
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
        java.lang.String str22 = item7.getType();
        item7.setAuthor("-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        gui.Item item7 = new gui.Item((int) (short) 10, "0,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", "10,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,1,hi!,hi! () - Copies: 100", (int) (byte) 1, "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", " (hi!) - Copies: 1");
        java.lang.String str8 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str8, "10,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! () - Copies: 1", (int) (short) 1, "hi! () - Copies: 1", "-1,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("hi!");
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.getType();
        item7.setItemId(35);
        java.lang.String str16 = item7.getType();
        int int17 = item7.getCopiesAvailable();
        java.lang.String str18 = item7.getName();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str12, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str18, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str12 = item7.toCsvString();
        item7.setCopiesAvailable(0);
        item7.setItemId((int) (short) 1);
        item7.setAuthor("-1, () - Copies: 10,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,10,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,hi!,,1,hi!,hi!");
        item7.setType("32,,,,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,,hi!,100,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        gui.Item item7 = new gui.Item(35, "", "-1,,hi!,,-1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,", "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!", (int) (short) 1, "10,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!", "0,,hi!,,32,hi!,hi!");
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setLocation("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setType("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.Class<?> wildcardClass12 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setAuthor("hi!");
        item7.setType("hi!");
        int int16 = item7.getItemId();
        java.lang.String str17 = item7.getType();
        item7.setItemId(1);
        java.lang.String str20 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
        java.lang.String str18 = item7.toCsvString();
        java.lang.String str19 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
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
        java.lang.String str21 = item7.getType();
        java.lang.String str22 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str16, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 1" + "'", str22, "hi! () - Copies: 1");
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        int int9 = item7.getCopiesAvailable();
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getAuthor();
        item7.setType("-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str14, "-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
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
        item7.setType("1,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,,32, () - Copies: 100,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
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
        item7.setItemId((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str25, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1,-1,hi!,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,,0,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str28, "-1,-1,hi!,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,,0,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        gui.Item item7 = new gui.Item((int) (short) -1, "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!", 0, "-1,,hi!,,1,hi!,hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) (short) -1);
        item7.setType("hi! (1,,,,100,-1,,hi!,,1,hi!,hi!,) - Copies: 1");
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
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
        java.lang.String str21 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str20, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        gui.Item item7 = new gui.Item((int) (byte) 10, "-1, (hi!) - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!", "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10", (int) (byte) 100, "-1,,hi!,,1,-1,hi!,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!", "97,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
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
        item7.setItemId(52);
        item7.setName("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        item7.setItemId(1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        int int12 = item7.getCopiesAvailable();
        item7.setName("1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setGenre("-1,,,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str14 = item7.getLocation();
        item7.setName("hi! () - Copies: 35");
        java.lang.String str17 = item7.getAuthor();
        java.lang.String str18 = item7.getName();
        java.lang.String str19 = item7.getType();
        java.lang.String str20 = item7.getLocation();
        item7.setLocation("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 35" + "'", str18, "hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
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
        item7.setLocation("-1,,hi!,,1,0,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str25, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        int int17 = item7.getItemId();
        int int18 = item7.getItemId();
        java.lang.String str19 = item7.toString();
        java.lang.String str20 = item7.getGenre();
        int int21 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi! () - Copies: 1" + "'", str19, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str20, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        gui.Item item7 = new gui.Item((int) (byte) 100, " () - Copies: 1", "-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", "32,-1,,hi!,,100,hi!,hi! () - Copies: 1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,hi! () - Copies: 1,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1", (int) (byte) 10, " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10", "52,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,10,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 1 (hi!) - Copies: 0");
        int int8 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
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
        item7.setAuthor("hi! () - Copies: 1 () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str10 = item7.getType();
        item7.setType("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setCopiesAvailable(35);
        item7.setItemId(100);
        java.lang.String str17 = item7.getGenre();
        item7.setCopiesAvailable((int) ' ');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        gui.Item item7 = new gui.Item(32, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "hi! () - Copies: 1", "hi! () - Copies: 35", (int) (byte) 0, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getLocation();
        item7.setCopiesAvailable((int) '4');
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("-1,,hi!,,1,hi!,");
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.toCsvString();
        java.lang.String str17 = item7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 35" + "'", str8, "hi! () - Copies: 35");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 1" + "'", str14, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,,52,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str16, "32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,,52,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 52" + "'", str17, "hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 52");
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        gui.Item item7 = new gui.Item((-1), "hi! (hi! () - Copies: 1) - Copies: 10", "-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", (int) (short) -1, " (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32");
        item7.setLocation("-1,,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        item7.setCopiesAvailable(1);
        java.lang.String str12 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,," + "'", str12, "-1,,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        gui.Item item7 = new gui.Item(0, "-1,,hi!,,-1,hi!,hi! () - Copies: 1", "-1,,hi!,,0,hi!,hi!", "32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,97,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,", (int) '4', "-1,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "100,hi!,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str17 = item7.getGenre();
        java.lang.Class<?> wildcardClass18 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getLocation();
        java.lang.String str12 = item7.toString();
        item7.setCopiesAvailable(0);
        item7.setGenre("-1,,,hi!,100,hi!,hi! () - Copies: 1");
        item7.setName("35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!");
        int int19 = item7.getCopiesAvailable();
        java.lang.String str20 = item7.getName();
        java.lang.String str21 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1" + "'", str12, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!" + "'", str20, "35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setName("hi! () - Copies: 1 () - Copies: 35");
        java.lang.String str18 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 1 () - Copies: 35" + "'", str18, "hi! () - Copies: 1 () - Copies: 35");
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.getName();
        int int16 = item7.getCopiesAvailable();
        java.lang.String str17 = item7.getAuthor();
        java.lang.String str18 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! () - Copies: 1" + "'", str18, "hi! () - Copies: 1");
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
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
        java.lang.Class<?> wildcardClass22 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int18 = item7.getItemId();
        java.lang.String str19 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!" + "'", str19, "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!");
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.getAuthor();
        item7.setGenre("-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32");
        java.lang.String str18 = item7.getAuthor();
        int int19 = item7.getItemId();
        int int20 = item7.getItemId();
        java.lang.String str21 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,35,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32" + "'", str21, "-1,,hi!,,35,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32");
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        int int13 = item7.getItemId();
        int int14 = item7.getCopiesAvailable();
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        gui.Item item7 = new gui.Item((int) (short) -1, "1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100", "0,hi! () - Copies: -1,hi!,,1,hi!,hi!", "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 52, "-1,,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1", "-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1");
        java.lang.String str8 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100" + "'", str8, "1,hi! () - Copies: -1,hi! () - Copies: -1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100");
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setGenre("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str18 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        gui.Item item7 = new gui.Item((int) (byte) 10, "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 0, "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setName("hi! () - Copies: 1 (hi!) - Copies: 35");
        int int10 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setName("hi!");
        java.lang.String str14 = item7.getName();
        item7.setType("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setAuthor("32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,");
        java.lang.String str21 = item7.toCsvString();
        item7.setName("-1,,hi!,,1,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,hi!,,1,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!," + "'", str21, "-1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,hi!,,1,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,0,,hi!,,1,hi!,hi!,hi!,,1,hi!,");
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setItemId((int) (byte) 10);
        item7.setItemId(100);
        item7.setName("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!" + "'", str14, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " () - Copies: 100" + "'", str15, " () - Copies: 100");
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.getLocation();
        java.lang.String str16 = item7.toString();
        item7.setGenre(" () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
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
        java.lang.String str20 = item7.getType();
        java.lang.String str21 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        gui.Item item7 = new gui.Item((int) (byte) -1, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi! () - Copies: 1", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", 100, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str8 = item7.getLocation();
        item7.setType("32,,hi!,,1,hi! () - Copies: 1,hi! (0,,hi!,,1,hi!, () - Copies: 10) - Copies: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1," + "'", str8, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
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
        item7.setGenre("32,,,,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,,hi!,100,hi!,hi! () - Copies: 1");
        item7.setType("35,hi!,hi!,,1,hi!,hi!");
        int int31 = item7.getCopiesAvailable();
        java.lang.String str32 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 100 + "'", int31 == 100);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "35,hi!,hi!,,1,hi!,hi!" + "'", str32, "35,hi!,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        gui.Item item7 = new gui.Item((int) (short) 10, "hi! () - Copies: -1 (hi! () - Copies: -1) - Copies: 100 (hi!) - Copies: 1", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 97", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 0, "", "32,-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str10 = item7.getType();
        java.lang.String str11 = item7.toCsvString();
        item7.setCopiesAvailable((-1));
        java.lang.String str14 = item7.getAuthor();
        java.lang.String str15 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,52,hi!," + "'", str11, "-1,,hi!,,52,hi!,");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
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
        java.lang.String str23 = item7.getType();
        item7.setAuthor("35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        item7.setAuthor("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((-1));
        item7.setName("-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32");
        java.lang.String str18 = item7.getName();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32" + "'", str18, "-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32");
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
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
        java.lang.String str24 = item7.getAuthor();
        java.lang.String str25 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str18, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-1,,-1,,hi!,,1,hi!,hi!,,100,52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,52,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1," + "'", str23, "-1,,-1,,hi!,,1,hi!,hi!,,100,52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,52,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str24, "52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getName();
        int int11 = item7.getItemId();
        java.lang.String str12 = item7.getType();
        java.lang.String str13 = item7.toString();
        item7.setCopiesAvailable(0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + " () - Copies: 10" + "'", str13, " () - Copies: 10");
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
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
        java.lang.String str21 = item7.getName();
        java.lang.String str22 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
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
        java.lang.Class<?> wildcardClass23 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi! () - Copies: 1" + "'", str17, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
        gui.Item item7 = new gui.Item((int) (byte) 0, "-1,,hi!,,-1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,", "-1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,0,,hi!,,1,hi!,hi!,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!", (int) (short) -1, "hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1", "10,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str8 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1" + "'", str8, "hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1");
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toCsvString();
        int int11 = item7.getItemId();
        item7.setItemId((int) (byte) 0);
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.getLocation();
        item7.setType("hi! () - Copies: -1");
        item7.setGenre("");
        item7.setName("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setItemId((int) (byte) 10);
        item7.setItemId(100);
        item7.setName("100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getName();
        item7.setCopiesAvailable(0);
        java.lang.String str17 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!" + "'", str14, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        gui.Item item7 = new gui.Item((int) ' ', "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,hi!,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1) - Copies: 100", (int) (short) 10, "32,,,,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,,hi!,100,hi!,hi! () - Copies: 1", "");
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        java.lang.String str12 = item7.toCsvString();
        int int13 = item7.getCopiesAvailable();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.toString();
        java.lang.String str17 = item7.getAuthor();
        item7.setItemId(100);
        item7.setCopiesAvailable((int) '#');
        java.lang.String str22 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 35" + "'", str22, "hi! () - Copies: 35");
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        gui.Item item7 = new gui.Item(100, "", "-1,,,,1,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,35,hi!,", 52, "hi! () - Copies: 100", " (hi!) - Copies: 1");
        java.lang.String str8 = item7.getName();
        item7.setType("-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int11 = item7.getItemId();
        java.lang.String str12 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str8, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,35,hi!,,52,hi! () - Copies: 100, (hi!) - Copies: 1" + "'", str12, "100,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,35,hi!,,52,hi! () - Copies: 100, (hi!) - Copies: 1");
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
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
        java.lang.String str23 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: -1" + "'", str22, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! () - Copies: -1" + "'", str23, "hi! () - Copies: -1");
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
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
        item7.setGenre("52,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1,-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!,35,35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str25 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        gui.Item item7 = new gui.Item((int) (short) -1, "97,,-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!,1,hi!,hi! () - Copies: 1", "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1", 1, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,,,hi!,100,hi!,hi! () - Copies: 1");
        item7.setName("1,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 1,0,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        gui.Item item7 = new gui.Item(35, "-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32", "-1,,hi!,,1,hi!,hi!", "-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", (int) 'a', "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.toString();
        int int9 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32) - Copies: 97" + "'", str8, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,100,hi!,hi! () - Copies: 1 (hi! () - Copies: 1) - Copies: 32) - Copies: 97");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        gui.Item item7 = new gui.Item((int) (byte) 10, "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,0,,hi!,,1,hi!,hi!,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!", (int) (byte) 1, "hi! () - Copies: 35", "hi!");
        java.lang.String str8 = item7.getType();
        java.lang.String str9 = item7.toString();
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str8, "35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1" + "'", str9, "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,0,,hi!,,1,hi!,hi!,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,0,,hi!,,1,hi!,hi!,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,0,,hi!,,1,hi!,hi!,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,10,0,,hi!,,1,hi!,hi!,32,hi! () - Copies: 1,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setName("hi! () - Copies: 1");
        int int18 = item7.getCopiesAvailable();
        item7.setType("-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        item7.setLocation("hi! () - Copies: -1");
        java.lang.String str23 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! () - Copies: 1 (-1,,,,1,-1,,hi!,,1,hi!,hi!,) - Copies: 1" + "'", str23, "hi! () - Copies: 1 (-1,,,,1,-1,,hi!,,1,hi!,hi!,) - Copies: 1");
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setName(" () - Copies: -1");
        int int16 = item7.getItemId();
        java.lang.String str17 = item7.toCsvString();
        java.lang.String str18 = item7.getLocation();
        item7.setGenre("32,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,, () - Copies: -1,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        gui.Item item7 = new gui.Item((int) '#', "hi! (hi! () - Copies: -1) - Copies: 1", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi! (hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100) - Copies: 32", 35, "100,,hi!,,1,,hi! () - Copies: 1", "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,hi! () - Copies: 1,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        java.lang.String str8 = item7.toString();
        item7.setName("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,0,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setCopiesAvailable(100);
        int int13 = item7.getItemId();
        item7.setCopiesAvailable(1);
        item7.setCopiesAvailable((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 35" + "'", str8, "hi! () - Copies: 1 (hi!) - Copies: 35");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        item7.setName("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,,hi!,,-1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        item7.setGenre("52,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,10,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
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
        java.lang.String str22 = item7.getName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0,,hi!,,32,hi!,hi!" + "'", str19, "0,,hi!,,32,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
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
        java.lang.String str24 = item7.getAuthor();
        java.lang.String str25 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 1" + "'", str21, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str23, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi! () - Copies: 1" + "'", str25, "hi! () - Copies: 1");
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setCopiesAvailable((int) '#');
        java.lang.String str10 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 35" + "'", str10, "hi! () - Copies: 1 (hi!) - Copies: 35");
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        gui.Item item7 = new gui.Item((int) (short) 0, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 32, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.getType();
        java.lang.String str10 = item7.getGenre();
        java.lang.String str11 = item7.getAuthor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str9, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str10, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!" + "'", str11, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setName("hi! () - Copies: 1");
        java.lang.String str10 = item7.getGenre();
        item7.setLocation("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setItemId((int) (short) 100);
        java.lang.String str15 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getLocation();
        java.lang.String str12 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
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
        java.lang.String str21 = item7.getName();
        java.lang.String str22 = item7.getType();
        int int23 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str22, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        gui.Item item7 = new gui.Item((int) ' ', "hi! () - Copies: 35", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", (int) 'a', "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "");
        java.lang.String str8 = item7.toCsvString();
        item7.setGenre("100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi! ( () - Copies: -1) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,97,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1," + "'", str8, "32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,97,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.toCsvString();
        int int13 = item7.getCopiesAvailable();
        item7.setItemId((int) (short) 10);
        java.lang.String str16 = item7.toString();
        java.lang.String str17 = item7.toString();
        item7.setCopiesAvailable((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " () - Copies: 1" + "'", str16, " () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " () - Copies: 1" + "'", str17, " () - Copies: 1");
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        int int11 = item7.getCopiesAvailable();
        int int12 = item7.getCopiesAvailable();
        int int13 = item7.getCopiesAvailable();
        int int14 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setCopiesAvailable(0);
        java.lang.String str12 = item7.toString();
        java.lang.String str13 = item7.getAuthor();
        int int14 = item7.getItemId();
        java.lang.String str15 = item7.toCsvString();
        int int16 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi! () - Copies: 1 (hi!) - Copies: 0" + "'", str12, "hi! () - Copies: 1 (hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str13, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1,hi!,hi! () - Copies: 1,,0,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str15, "1,hi!,hi! () - Copies: 1,,0,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.getType();
        item7.setLocation("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: -1");
        java.lang.String str15 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: -1,1,-1,,hi!,,1,hi!,hi!," + "'", str15, "-1,,,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! (100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: -1,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
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
        item7.setGenre("hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35");
        java.lang.String str25 = item7.getType();
        java.lang.String str26 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!" + "'", str25, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!" + "'", str26, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str12 = item7.toCsvString();
        item7.setCopiesAvailable(0);
        int int15 = item7.getCopiesAvailable();
        int int16 = item7.getCopiesAvailable();
        java.lang.String str17 = item7.getName();
        java.lang.String str18 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,0,-1,,hi!,,1,hi!,hi!," + "'", str18, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,0,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        gui.Item item7 = new gui.Item((int) ' ', "hi! () - Copies: 35", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", (int) 'a', "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getAuthor();
        int int12 = item7.getItemId();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,35,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str10, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str11, "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        int int9 = item7.getItemId();
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setLocation("");
        item7.setCopiesAvailable((int) (byte) 10);
        java.lang.String str16 = item7.getLocation();
        item7.setType("-1,,hi!,hi!,10,hi!,hi!");
        item7.setType("-1,hi! () - Copies: 1 () - Copies: 100,-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) ' ');
        int int23 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        java.lang.String str13 = item7.getName();
        item7.setAuthor("32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,");
        item7.setType(" (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10");
        java.lang.String str18 = item7.getName();
        item7.setAuthor("-1,hi!,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable(32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getType();
        item7.setItemId(1);
        item7.setGenre("0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        java.lang.String str17 = item7.toCsvString();
        java.lang.String str18 = item7.getGenre();
        java.lang.Class<?> wildcardClass19 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,0,hi! () - Copies: -1,hi!,,1,hi!,hi!" + "'", str17, "1,,hi!,,1,-1,,hi!,,1,hi!,hi!,0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,hi! () - Copies: -1,hi!,,1,hi!,hi!" + "'", str18, "0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("-1,,hi!,,1,hi!,hi! () - Copies: 100");
        java.lang.String str17 = item7.toCsvString();
        java.lang.String str18 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,-1,,hi!,,1,hi!,hi! () - Copies: 100,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "-1,,hi!,,1,-1,,hi!,,1,hi!,hi! () - Copies: 100,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi!,hi! () - Copies: 100" + "'", str18, "-1,,hi!,,1,hi!,hi! () - Copies: 100");
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        item7.setName("hi! () - Copies: 1 (hi!) - Copies: 0");
        item7.setItemId((int) 'a');
        int int13 = item7.getCopiesAvailable();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
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
        int int23 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100" + "'", str22, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
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
        item7.setType("hi! () - Copies: 1 (hi!) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
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
        int int25 = item7.getCopiesAvailable();
        java.lang.String str26 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 100 + "'", int23 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 100 + "'", int25 == 100);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str26, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        java.lang.String str13 = item7.getType();
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.getName();
        java.lang.String str16 = item7.toString();
        item7.setAuthor("0,,hi!,,1,hi!, () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getType();
        item7.setItemId(1);
        item7.setGenre("0,hi! () - Copies: -1,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,,hi!,-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!,1,hi! () - Copies: 35,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        java.lang.String str12 = item7.toCsvString();
        int int13 = item7.getCopiesAvailable();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.toString();
        java.lang.String str17 = item7.getAuthor();
        item7.setItemId(100);
        item7.setCopiesAvailable((int) '#');
        item7.setName("100,hi!,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        java.lang.String str12 = item7.toCsvString();
        item7.setItemId(35);
        int int15 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! () - Copies: 1", (int) (short) 1, "hi! () - Copies: 1", "-1,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("hi!");
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.getType();
        item7.setItemId(35);
        java.lang.String str16 = item7.getType();
        int int17 = item7.getCopiesAvailable();
        item7.setName("-1,,hi!,,1,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str12, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
        gui.Item item7 = new gui.Item((int) (byte) -1, " () - Copies: -1", "-1,,hi!,,1,hi!,hi!", "100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", (-1), "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str8 = item7.getAuthor();
        java.lang.String str9 = item7.getName();
        int int10 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str8, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str9, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setAuthor("hi! () - Copies: 1");
        java.lang.String str15 = item7.toCsvString();
        java.lang.String str16 = item7.toCsvString();
        item7.setCopiesAvailable(100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str15, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str16, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
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
        item7.setName("1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,35,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!, () - Copies: 32");
        int int23 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! () - Copies: 1" + "'", str20, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.getName();
        item7.setGenre(" () - Copies: 100");
        java.lang.String str17 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getLocation();
        java.lang.String str12 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        gui.Item item7 = new gui.Item((int) '4', "0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!", "-1,,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,-1,hi!,hi!,,1,hi!,hi!,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", (int) (short) -1, "-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! (-1,,,hi!,100,hi!,hi! () - Copies: 1) - Copies: 35", "");
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getGenre();
        item7.setCopiesAvailable((-1));
        java.lang.String str19 = item7.getAuthor();
        int int20 = item7.getCopiesAvailable();
        java.lang.String str21 = item7.getType();
        item7.setName("hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
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
        item7.setGenre("-1,,hi!,-1,,hi!,,1,hi!,hi!,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        gui.Item item7 = new gui.Item((int) '4', "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35", "-1,hi!,hi!,,1,hi!,hi!", "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", (int) (byte) 10, "-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!", "hi! () - Copies: 1 (hi!) - Copies: 0");
        item7.setAuthor("52,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,hi!,10,-1,,,,1,-1,,hi!,,1,hi!,hi!,,hi!");
        java.lang.String str10 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "52,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,hi!,10,-1,,,,1,-1,,hi!,,1,hi!,hi!,,hi!" + "'", str10, "52,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,-1,,hi!,,1,hi!,hi!,10,-1,,,,1,-1,,hi!,,1,hi!,hi!,,hi!");
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
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
        item7.setGenre("hi! () - Copies: 1 (-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1) - Copies: 52");
        item7.setGenre("-1,,hi!,,1,hi!,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
        gui.Item item7 = new gui.Item((int) (short) 1, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "", "hi! () - Copies: 1", 0, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str10 = item7.getType();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str10, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        gui.Item item7 = new gui.Item((int) '#', "", "-1,,hi!,,52,hi!,", "hi! (hi!) - Copies: 1", 97, "1,hi!,hi! () - Copies: 1,,0,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        java.lang.String str8 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1,hi!,hi! () - Copies: 1,,0,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str8, "1,hi!,hi! () - Copies: 1,,0,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
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
        java.lang.String str25 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str20, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! () - Copies: 1" + "'", str21, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        gui.Item item7 = new gui.Item((int) (byte) -1, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "hi! () - Copies: 1", "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", 100, "-1,,,hi!,100,hi!,hi! () - Copies: 1", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setType("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1");
        java.lang.String str10 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str10, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '#');
        item7.setAuthor("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str12 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        int int12 = item7.getItemId();
        item7.setType("hi!");
        java.lang.String str15 = item7.getAuthor();
        item7.setAuthor("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        java.lang.String str18 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 35,");
        item7.setCopiesAvailable((int) '4');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setType("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        int int15 = item7.getCopiesAvailable();
        java.lang.String str16 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setGenre("");
        item7.setCopiesAvailable((int) (byte) -1);
        int int14 = item7.getCopiesAvailable();
        int int15 = item7.getCopiesAvailable();
        java.lang.String str16 = item7.getGenre();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        java.lang.String str14 = item7.getLocation();
        int int15 = item7.getItemId();
        item7.setAuthor("100,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!, () - Copies: 100,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,100,,-1,hi!,hi!,,1,hi!,hi!");
        item7.setGenre("-1,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi!,hi! () - Copies: -1,1,hi!,hi! () - Copies: 1 (-1,,,,1,-1,,hi!,,1,hi!,hi!,) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str16 = item7.getType();
        int int17 = item7.getCopiesAvailable();
        java.lang.String str18 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
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
        item7.setGenre("0,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        int int25 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setCopiesAvailable(0);
        item7.setType("35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) (byte) 0);
        int int16 = item7.getCopiesAvailable();
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setGenre("");
        item7.setCopiesAvailable((int) (byte) -1);
        item7.setAuthor("hi! () - Copies: 1 (hi!) - Copies: 0");
        item7.setGenre("hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        java.lang.String str18 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35" + "'", str18, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        gui.Item item7 = new gui.Item(52, "0,hi! () - Copies: 1,hi!,,1,hi!,hi!", "32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,", "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", (int) (short) 1, "1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!,1,-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!", "0,,hi!,,1,hi!, () - Copies: 10");
        java.lang.String str8 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "52,0,hi! () - Copies: 1,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!,1,-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!,0,,hi!,,1,hi!, () - Copies: 10" + "'", str8, "52,0,hi! () - Copies: 1,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,1,1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!,1,-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!,0,,hi!,,1,hi!, () - Copies: 10");
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
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
        java.lang.String str22 = item7.getAuthor();
        java.lang.String str23 = item7.getGenre();
        java.lang.Class<?> wildcardClass24 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
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
        item7.setGenre("100,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!, () - Copies: 100,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,100,,-1,hi!,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        int int34 = item7.getCopiesAvailable();
        item7.setItemId((-1));
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 100 + "'", int21 == 100);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!" + "'", str24, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        item7.setGenre("hi! () - Copies: 35");
        item7.setItemId((int) (short) 10);
        item7.setLocation("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("32,,,,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,,hi!,100,hi!,hi! () - Copies: 1");
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
        java.lang.Class<?> wildcardClass23 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable(0);
        java.lang.String str15 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str15, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
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
        item7.setType("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str18, "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str22, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "hi!", "", (int) (byte) 1, "", "hi! () - Copies: 1");
        java.lang.String str8 = item7.getAuthor();
        java.lang.String str9 = item7.getName();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str12 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
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
        java.lang.String str23 = item7.getGenre();
        java.lang.String str24 = item7.getName();
        item7.setLocation("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str20, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! () - Copies: 1" + "'", str23, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str24, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setItemId(0);
        item7.setAuthor("hi! () - Copies: 100");
        java.lang.String str15 = item7.getName();
        item7.setType("-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str18 = item7.getLocation();
        item7.setItemId((int) (short) 0);
        int int21 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        gui.Item item7 = new gui.Item(1, "-1,,hi!,,1,hi!,hi!", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "-1,,,,1,-1,,hi!,,1,hi!,hi!,", 35, "", "");
        int int8 = item7.getCopiesAvailable();
        item7.setItemId((int) (short) 10);
        java.lang.String str11 = item7.getLocation();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str11, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
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
        item7.setGenre("32,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        int int25 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
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
        item7.setType("-1,,hi!,,1,hi!,hi!");
        java.lang.String str24 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setName(" () - Copies: -1");
        int int16 = item7.getItemId();
        int int17 = item7.getCopiesAvailable();
        int int18 = item7.getCopiesAvailable();
        java.lang.String str19 = item7.getType();
        item7.setName("-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        item7.setGenre("");
        item7.setLocation("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        item7.setAuthor("hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        java.lang.String str16 = item7.getName();
        item7.setType("hi! () - Copies: 1 (hi!) - Copies: 0");
        item7.setLocation("1,,hi!,,1,hi!,hi!");
        java.lang.String str21 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,hi! () - Copies: 1 (hi!) - Copies: 0,hi!,1,,hi!,,1,hi!,hi!,1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35," + "'", str21, "-1,hi! () - Copies: 1 (hi!) - Copies: 0,hi!,1,,hi!,,1,hi!,hi!,1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35,");
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
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
        item7.setGenre("100,,,hi! () - Copies: 1,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        item7.setItemId((int) (short) -1);
        item7.setName("-1,,hi!,,-1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        int int9 = item7.getCopiesAvailable();
        java.lang.String str10 = item7.getName();
        int int11 = item7.getItemId();
        java.lang.String str12 = item7.getAuthor();
        item7.setAuthor("hi! (hi!) - Copies: 10");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        item7.setCopiesAvailable(0);
        java.lang.String str14 = item7.getAuthor();
        item7.setLocation("hi!");
        item7.setGenre("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        java.lang.String str19 = item7.getName();
        java.lang.String str20 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi! () - Copies: 0" + "'", str20, "hi! () - Copies: 0");
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str17 = item7.getLocation();
        java.lang.String str18 = item7.getLocation();
        item7.setItemId((int) '4');
        item7.setType("-1,,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! (-1,,,hi!,100,hi!,hi! () - Copies: 1) - Copies: 35");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str17, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str18, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getGenre();
        java.lang.String str15 = item7.toString();
        item7.setName("hi!");
        item7.setName("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 97");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! () - Copies: 1" + "'", str15, "hi! () - Copies: 1");
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
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
        java.lang.String str22 = item7.getLocation();
        item7.setItemId((int) ' ');
        item7.setLocation("-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str22, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getLocation();
        item7.setType("hi! () - Copies: 1");
        item7.setCopiesAvailable(35);
        item7.setCopiesAvailable((int) (byte) 1);
        java.lang.String str16 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        gui.Item item7 = new gui.Item(10, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100", "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 32, " () - Copies: 10", "-1,hi!,hi!,,1,hi!,hi!");
        int int8 = item7.getCopiesAvailable();
        item7.setAuthor("0,,hi!,,32,hi!,hi!");
        java.lang.String str11 = item7.toString();
        item7.setItemId((int) (short) 0);
        java.lang.String str14 = item7.getType();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi! (hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100) - Copies: 32" + "'", str11, "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi! (hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100) - Copies: 32");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100" + "'", str14, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
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
        item7.setLocation("35,,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!" + "'", str20, "-1,,hi!,,1,0,,hi!,,1,hi!,hi!,0,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! () - Copies: 1", (int) (short) 1, "hi! () - Copies: 1", "-1,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("hi!");
        java.lang.String str12 = item7.toCsvString();
        java.lang.String str13 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str12, "100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        java.lang.String str8 = item7.getAuthor();
        int int9 = item7.getItemId();
        item7.setName("35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,");
        java.lang.String str14 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setAuthor("-1,,hi!,,1,hi!,hi!");
        item7.setName("");
        java.lang.String str12 = item7.getName();
        item7.setName("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setAuthor("32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1");
        item7.setCopiesAvailable(35);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toString();
        int int15 = item7.getCopiesAvailable();
        int int16 = item7.getCopiesAvailable();
        item7.setLocation("-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        java.lang.String str19 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! () - Copies: 35" + "'", str14, "hi! () - Copies: 35");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 35 + "'", int15 == 35);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!" + "'", str19, "-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        gui.Item item7 = new gui.Item((int) '#', "-1,,hi!,,1,hi! () - Copies: 1,hi!", "", " () - Copies: 100", (int) (byte) 100, "hi!", "-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setCopiesAvailable((-1));
        java.lang.String str10 = item7.getName();
        item7.setCopiesAvailable((int) (short) 1);
        item7.setItemId((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
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
        item7.setGenre("-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!," + "'", str22, "1,,hi!,,32,hi!,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
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
        item7.setLocation("-1,,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
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
        item7.setItemId((int) 'a');
        item7.setLocation("1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!,1,-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!");
        java.lang.String str28 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + " () - Copies: 1" + "'", str28, " () - Copies: 1");
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setItemId(10);
        int int11 = item7.getItemId();
        item7.setName("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.String str14 = item7.getType();
        java.lang.String str15 = item7.toCsvString();
        item7.setName("1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setType("1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "10,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str15, "10,,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        item7.setType("-1,,hi!,,1,hi!,hi!");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable(0);
        int int15 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
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
        java.lang.String str22 = item7.getGenre();
        java.lang.String str23 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str22, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi! () - Copies: 52" + "'", str23, "hi! () - Copies: 52");
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        gui.Item item7 = new gui.Item((int) (byte) 0, "0,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,hi! () - Copies: 1,0,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi! () - Copies: 1,1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi!", "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,", "0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", (int) '#', "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "hi! () - Copies: 100");
        item7.setLocation("-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!");
        int int10 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
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
        item7.setItemId((int) '4');
        java.lang.String str31 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi! () - Copies: 1" + "'", str31, "hi! () - Copies: 1");
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.toString();
        item7.setGenre("-1,hi!,hi!,,1,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.String str11 = item7.getLocation();
        java.lang.String str12 = item7.toString();
        item7.setItemId(100);
        java.lang.String str15 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " () - Copies: 100" + "'", str8, " () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " () - Copies: 100" + "'", str12, " () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        int int12 = item7.getItemId();
        java.lang.String str13 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        item7.setCopiesAvailable((-1));
        item7.setAuthor("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        java.lang.Class<?> wildcardClass14 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setAuthor("hi!");
        java.lang.String str14 = item7.getAuthor();
        java.lang.String str15 = item7.getAuthor();
        java.lang.String str16 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setGenre("hi! () - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getName();
        item7.setItemId(1);
        item7.setItemId((int) 'a');
        java.lang.String str21 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str21, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
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
        java.lang.String str22 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: -1" + "'", str22, "hi! () - Copies: -1");
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
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
        java.lang.String str22 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str22, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setCopiesAvailable((int) '4');
        java.lang.String str10 = item7.getType();
        item7.setType("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setCopiesAvailable(35);
        item7.setItemId(100);
        int int17 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        gui.Item item7 = new gui.Item(10, "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", 35, "-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!, (-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1", "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi!,hi!");
        java.lang.Class<?> wildcardClass8 = item7.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
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
        java.lang.String str23 = item7.getType();
        java.lang.String str24 = item7.getAuthor();
        item7.setName(" (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10 () - Copies: 1");
        java.lang.String str27 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        gui.Item item7 = new gui.Item((int) (byte) 100, "-1,,hi! () - Copies: 100,32, () - Copies: -1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,,1,hi! () - Copies: -1,hi! () - Copies: 1 (hi!) - Copies: 35,1,hi!,hi!", "100,hi! (32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,) - Copies: 35,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52,32,,,,10,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,-1,,,hi!,100,hi!,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "", 100, "-1,100,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,,52, () - Copies: -1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        int int8 = item7.getCopiesAvailable();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 100 + "'", int8 == 100);
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        gui.Item item7 = new gui.Item(100, "", "-1,,,,1,-1,,hi!,,1,hi!,hi!,", "-1,,hi!,,35,hi!,", 52, "hi! () - Copies: 100", " (hi!) - Copies: 1");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,,,hi!,100,hi!,hi! () - Copies: 1");
        java.lang.String str12 = item7.getName();
        item7.setAuthor("35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setItemId((-1));
        int int17 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,,,1,-1,,hi!,,1,hi!,hi!," + "'", str12, "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        gui.Item item7 = new gui.Item((int) (short) -1, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100", "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", "-1,,hi!,,1,hi!,hi! () - Copies: 100", 35, "32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,", "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str8 = item7.getType();
        item7.setCopiesAvailable((int) (short) 10);
        java.lang.String str11 = item7.toCsvString();
        java.lang.String str12 = item7.getName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100" + "'", str8, "hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str11, "-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str12, "1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1");
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setLocation("");
        item7.setAuthor("");
        java.lang.String str12 = item7.getType();
        int int13 = item7.getCopiesAvailable();
        java.lang.String str14 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
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
        item7.setLocation("10,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        gui.Item item7 = new gui.Item((int) (byte) 100, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", " () - Copies: 100", "", (int) 'a', "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        item7.setGenre("52,-1,,hi!,,1,hi!,hi! () - Copies: 100,-1,,hi!,,1,hi! () - Copies: -1,hi!,32,-1,,hi!,,100,hi!,hi! () - Copies: 1,-1,hi!,hi!,,1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!,,1,hi!,hi!,100,-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!,hi! () - Copies: -1,0,0,,hi!,,1,hi!,hi!,");
        item7.setCopiesAvailable((int) (short) 0);
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toString();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " () - Copies: 100 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 0" + "'", str14, " () - Copies: 100 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 0");
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.toString();
        java.lang.String str12 = item7.getAuthor();
        item7.setAuthor("0,,hi!,hi! () - Copies: 35,32,hi!,hi!");
        int int15 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " () - Copies: 10" + "'", str11, " () - Copies: 10");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
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
        java.lang.String str20 = item7.getName();
        item7.setLocation("-1,,hi!,,1,hi! () - Copies: 1,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setAuthor("-1,,,,1,-1,,hi!,,1,hi!,hi!, () - Copies: 32");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str18, "-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str19, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi!" + "'", str20, "-1,,hi!,,1,hi! () - Copies: 1,hi!");
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
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
        item7.setCopiesAvailable(100);
        int int25 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        gui.Item item7 = new gui.Item((int) (byte) 1, "", "", "", (int) (byte) 100, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getGenre();
        int int9 = item7.getItemId();
        java.lang.String str10 = item7.toString();
        item7.setAuthor("1,,,52,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,100,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " () - Copies: 100" + "'", str10, " () - Copies: 100");
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setItemId((int) (byte) 10);
        java.lang.String str10 = item7.getGenre();
        java.lang.String str11 = item7.getType();
        item7.setLocation("0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!");
        java.lang.String str14 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " () - Copies: 100" + "'", str10, " () - Copies: 100");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: -1" + "'", str11, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10,hi! () - Copies: -1,hi! () - Copies: -1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100" + "'", str14, "10,hi! () - Copies: -1,hi! () - Copies: -1,0,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi!,-1,,hi!,,1,hi!,hi!,100,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,,hi!,,1,hi!,hi!,100,-1,hi!,hi!,,1,hi!,hi!, () - Copies: 100");
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        gui.Item item7 = new gui.Item(52, "", "-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!", "-1,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,-1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,,1,-1,,hi!,,1,hi!,hi!,,,1,hi!,hi!", 35, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,,,1,-1,,hi!,,1,hi!,hi!,");
        java.lang.String str8 = item7.getAuthor();
        java.lang.Class<?> wildcardClass9 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str8, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setLocation("32,hi! () - Copies: 35,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,52,-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,");
        java.lang.String str19 = item7.getGenre();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1" + "'", str19, "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        gui.Item item7 = new gui.Item((-1), "hi! () - Copies: 1", "hi!", "hi!", (int) (short) 10, "-1,,hi!,,1,hi!,hi!", "hi!");
        int int8 = item7.getItemId();
        java.lang.String str9 = item7.getType();
        int int10 = item7.getCopiesAvailable();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.toCsvString();
        item7.setGenre("hi! (-1,hi!,hi!,,1,hi!,hi!) - Copies: 1");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,hi! () - Copies: 1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!" + "'", str12, "-1,hi! () - Copies: 1,hi!,hi!,10,-1,,hi!,,1,hi!,hi!,hi!");
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
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
        item7.setType("-1,,,hi!,100,hi!,hi! () - Copies: 1");
        item7.setType("-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int30 = item7.getItemId();
        java.lang.Class<?> wildcardClass31 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getLocation();
        int int9 = item7.getItemId();
        java.lang.String str10 = item7.toCsvString();
        java.lang.String str11 = item7.toCsvString();
        item7.setName("0,,hi!,,1,hi!,hi! (hi! () - Copies: -1) - Copies: -1");
        int int14 = item7.getCopiesAvailable();
        item7.setName("-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi! () - Copies: 1" + "'", str8, "hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str10, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str11, "32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
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
        item7.setAuthor("32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!, () - Copies: 1");
        java.lang.String str25 = item7.getType();
        item7.setCopiesAvailable((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        gui.Item item7 = new gui.Item((int) ' ', "", "", "hi! () - Copies: 1", 10, "-1,,hi!,,1,hi!,hi!", "");
        java.lang.String str8 = item7.getName();
        java.lang.String str9 = item7.getLocation();
        java.lang.String str10 = item7.getLocation();
        java.lang.String str11 = item7.getAuthor();
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        java.lang.String str16 = item7.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi! () - Copies: 1" + "'", str9, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str11, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: 1" + "'", str16, "hi! () - Copies: 1");
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        gui.Item item7 = new gui.Item((int) (short) 100, "", "-1,,hi!,,1,hi! () - Copies: 1,hi!", "hi! () - Copies: 1", (int) (short) 1, "hi! () - Copies: 1", "-1,,hi!,,1,hi!,hi!");
        item7.setGenre("-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setLocation("hi!");
        java.lang.String str12 = item7.toString();
        item7.setGenre("-1,-1,hi!,hi!,,1,hi!,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setType("hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 0");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1" + "'", str12, "-1,,hi!,,1,hi! () - Copies: 1,hi! () - Copies: 1");
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        int int17 = item7.getItemId();
        java.lang.Class<?> wildcardClass18 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        item7.setCopiesAvailable(32);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
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
        java.lang.String str23 = item7.getType();
        java.lang.String str24 = item7.getAuthor();
        item7.setName(" (-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 10 () - Copies: 1");
        item7.setGenre("1,1,,hi!,,1,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!,1,-1,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,1,hi!,hi! () - Copies: 1,,35,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,hi! () - Copies: 100,10,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!");
        item7.setItemId(0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
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
        java.lang.String str21 = item7.getType();
        item7.setItemId((int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
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
        java.lang.String str22 = item7.toCsvString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "-1,,hi!,,-1,hi!," + "'", str22, "-1,,hi!,,-1,hi!,");
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        gui.Item item7 = new gui.Item(35, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1", "hi! (-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!) - Copies: 1", "-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32 (-1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,100,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!,,1,hi!,100,,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,1,hi! () - Copies: 1,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 52", 0, "0,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,,1,hi!,hi!, () - Copies: -1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1 (-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1) - Copies: 1,10,-1,,,,1,-1,,hi!,,1,hi!,hi!,,hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35", "-1,-1,hi!,hi!,,1,hi!,hi!,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1 (35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 1");
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
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
        java.lang.String str21 = item7.getAuthor();
        item7.setName("-1, (hi!) - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        int int24 = item7.getItemId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35" + "'", str15, "hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 35 + "'", int18 == 35);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!" + "'", str19, "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
        gui.Item item7 = new gui.Item((int) (short) 1, "hi! () - Copies: -1", "hi! () - Copies: -1", "-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", 100, "-1,hi!,hi!,,1,hi!,hi!", " () - Copies: 100");
        item7.setItemId((int) (byte) 10);
        item7.setItemId(100);
        item7.setGenre("");
        item7.setLocation("-1,,hi!,hi!,100,hi!,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!");
        item7.setGenre("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
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
        item7.setType("-1,,,hi!,100,hi!,hi! () - Copies: 1");
        java.lang.String str28 = item7.getType();
        item7.setName("-1,,hi!,,100,hi!,hi! () - Copies: 1 (-1,hi!,hi!,,1,hi!,hi!) - Copies: 32");
        item7.setGenre("-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setType("hi! (-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!) - Copies: 35 (-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi!) - Copies: 10");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "-1,,,hi!,100,hi!,hi! () - Copies: 1" + "'", str28, "-1,,,hi!,100,hi!,hi! () - Copies: 1");
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
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
        java.lang.String str22 = item7.getLocation();
        item7.setCopiesAvailable((int) '4');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        java.lang.String str8 = item7.getAuthor();
        int int9 = item7.getItemId();
        item7.setName("-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: -1");
        item7.setType("32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
        item7.setCopiesAvailable(100);
        item7.setName(" () - Copies: -1");
        java.lang.String str18 = item7.getAuthor();
        java.lang.String str19 = item7.getType();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str8, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1" + "'", str18, "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!," + "'", str19, "32,0,,hi!,,1,hi!,hi!, (hi!) - Copies: 1,-1,,hi!,hi! () - Copies: 1,1,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,");
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getGenre();
        item7.setLocation("");
        item7.setLocation("-1,,hi!,,1,hi!,hi!");
        item7.setType("-1,,hi!,,1,hi!,");
        int int18 = item7.getCopiesAvailable();
        item7.setAuthor("hi! () - Copies: 1 (hi!) - Copies: 35");
        java.lang.String str21 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi! (-1,,hi!,,1,hi!,) - Copies: 1" + "'", str21, "hi! (-1,,hi!,,1,hi!,) - Copies: 1");
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        java.lang.String str12 = item7.toCsvString();
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.toCsvString();
        item7.setItemId((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str12, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str14, "-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
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
        java.lang.String str25 = item7.getLocation();
        java.lang.String str26 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi! () - Copies: -1" + "'", str16, "hi! () - Copies: -1");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: -1" + "'", str22, "hi! () - Copies: -1");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
        gui.Item item7 = new gui.Item((int) (short) -1, "-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", "hi! () - Copies: 1", "hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1", (int) (short) 1, "0,,hi!,,1,hi!,hi!", "hi!");
        item7.setLocation(" () - Copies: 10");
        item7.setType("-1,,0,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 52");
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
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
        java.lang.String str21 = item7.toCsvString();
        java.lang.String str22 = item7.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0,,hi!,,1,hi!,hi!" + "'", str14, "0,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "0,,hi!,,32,hi!,hi!" + "'", str18, "0,,hi!,,32,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0,,hi!,,32,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,hi!" + "'", str21, "0,,hi!,,32,-1,,hi!,,1,0,,hi!,,1,hi!,hi!,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi! () - Copies: 32" + "'", str22, "hi! () - Copies: 32");
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        gui.Item item7 = new gui.Item(1, "hi!", "hi! () - Copies: 1", "", (int) '#', "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1", "hi! () - Copies: 1");
        item7.setAuthor("-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1");
        item7.setCopiesAvailable(0);
        item7.setType("35,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!,-1,,,hi!,100,hi!,hi! () - Copies: 1,-1,,hi!,,1,hi!,,-1,,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        item7.setItemId((int) (byte) 0);
        item7.setAuthor("0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!");
        item7.setGenre("32,-1,,hi!,,1,hi!,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,hi! () - Copies: 1,-1,,hi!,,1,hi!,,52,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi!,hi!");
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
        gui.Item item7 = new gui.Item((-1), " (hi!) - Copies: 1", "1,hi!,hi! () - Copies: 1,,0,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi! () - Copies: 1", "-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,32,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1,10,-1,,hi!,,100,hi!,hi! () - Copies: 1,,1,hi!,hi!", 0, "0,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,,35,hi!,hi!,,1,hi!,hi!,hi! () - Copies: 100,32, () - Copies: 10,-1,,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,1,hi!,-1,,hi!,,1,hi!,hi!", "-1,,hi!,-1,,hi!,,1,hi!,hi!,100,hi!,hi! () - Copies: 1");
        int int8 = item7.getItemId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        item7.setGenre("0,,hi!,,1,hi!,hi!");
        item7.setGenre("hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1");
        item7.setType("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str19 = item7.getLocation();
        item7.setGenre("1,-1,,hi!,,-1,hi! (-1,,hi!,,1,hi!,hi!) - Copies: 1,,hi!,,100,hi!,");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setCopiesAvailable((int) (short) -1);
        java.lang.String str16 = item7.getType();
        java.lang.String str17 = item7.getGenre();
        java.lang.String str18 = item7.getAuthor();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "-1,,hi!,,1,hi!,hi!" + "'", str17, "-1,,hi!,,1,hi!,hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getLocation();
        item7.setCopiesAvailable((int) '#');
        int int13 = item7.getItemId();
        java.lang.String str14 = item7.getName();
        java.lang.String str15 = item7.toCsvString();
        int int16 = item7.getCopiesAvailable();
        int int17 = item7.getCopiesAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "-1,,hi!,,35,hi!,hi!" + "'", str15, "-1,,hi!,,35,hi!,hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 35 + "'", int16 == 35);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.toString();
        java.lang.String str11 = item7.toString();
        item7.setGenre("-1,,hi!,,1,hi!,hi!");
        item7.setAuthor("-1,hi!,hi!,,1,hi!,hi!");
        java.lang.String str16 = item7.getAuthor();
        item7.setType("-1,,hi!,,1,hi! () - Copies: -1,hi!");
        item7.setAuthor("1,hi! () - Copies: 1,-1,,hi!,,100,hi!,hi! () - Copies: 1,hi! () - Copies: -1,32,-1,,hi!,,1,-1,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi!,hi!,,1,hi!,hi! () - Copies: 1,hi!,hi! () - Copies: -1");
        java.lang.Class<?> wildcardClass21 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi! () - Copies: 1" + "'", str10, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi! () - Copies: 1" + "'", str11, "hi! () - Copies: 1");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "-1,hi!,hi!,,1,hi!,hi!" + "'", str16, "-1,hi!,hi!,,1,hi!,hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        gui.Item item7 = new gui.Item((-1), "", "hi!", "", 1, "hi!", "");
        item7.setGenre("hi!");
        java.lang.String str10 = item7.getName();
        java.lang.String str11 = item7.getType();
        java.lang.String str12 = item7.getName();
        int int13 = item7.getItemId();
        item7.setItemId((int) (byte) 100);
        item7.setLocation("");
        java.lang.String str18 = item7.getLocation();
        item7.setAuthor("10,-1,-1,,hi!,,1,hi! () - Copies: 1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,0,-1,,hi!,,1,hi!,hi!,-1,,hi!,,1,hi! () - Copies: 1,hi!,-1,,hi!,,1,hi! () - Copies: -1,hi!,32,,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!,hi! () - Copies: 35,10,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,hi! () - Copies: 1 (hi!) - Copies: 0,52,hi! (-1,,hi!,,1,hi! () - Copies: 1,hi!) - Copies: 100,32,-1,,hi!,,1,hi!,hi!,,-1,,hi!,,1,hi!,hi!,0,-1,,hi!,,1,hi!,hi!,");
        java.lang.Class<?> wildcardClass21 = item7.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        gui.Item item7 = new gui.Item(0, "0,,hi!,,1,hi!, () - Copies: 10", "32,,hi!,,1,hi! () - Copies: 1,hi!", "-1,,hi!,-1,,hi!,,1,hi!,hi!,1,0,,hi!,,1,hi!,hi!,-1,,hi!,,-1,hi!,-1,,hi!,,1,hi!,hi!", 10, "0,hi! () - Copies: -1,hi!,,1,hi!,hi!", "1,-1,,hi!,,1,hi!,hi!,32,,,hi! () - Copies: 1,10,-1,,hi!,,1,hi!,hi!,,-1,,,,1,-1,,hi!,,1,hi!,hi!,,35,,");
        java.lang.String str8 = item7.toString();
        item7.setLocation("-1,,hi!,,1,-1,,hi!,,1,hi!,hi! () - Copies: 100,-1,,hi!,,1,hi! () - Copies: 1,hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "32,,hi!,,1,hi! () - Copies: 1,hi! (0,,hi!,,1,hi!, () - Copies: 10) - Copies: 10" + "'", str8, "32,,hi!,,1,hi! () - Copies: 1,hi! (0,,hi!,,1,hi!, () - Copies: 10) - Copies: 10");
    }
}

