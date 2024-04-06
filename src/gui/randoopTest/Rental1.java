package gui.randoopTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Rental1 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (byte) 10, "", localDate2, localDate3);
        java.lang.Class<?> wildcardClass5 = rental4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) 'a', "hi!", localDate2, localDate3);
        java.lang.Class<?> wildcardClass5 = rental4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) 'a', "hi!", localDate2, localDate3);
        java.time.LocalDate localDate5 = rental4.getDueDate();
        java.lang.String str6 = rental4.toCSVString();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "97,hi!,null,null" + "'", str6, "97,hi!,null,null");
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) 'a', "hi!", localDate2, localDate3);
        int int5 = rental4.getItemId();
        java.time.LocalDate localDate6 = rental4.getDueDate();
        java.lang.String str7 = rental4.toString();
        java.lang.Class<?> wildcardClass8 = rental4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str7, "Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (short) 10, "Rental: Item ID 97, Username: hi!", localDate2, localDate3);
        java.lang.String str5 = rental4.getUsername();
        java.lang.String str6 = rental4.toCSVString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str5, "Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10,Rental: Item ID 97, Username: hi!,null,null" + "'", str6, "10,Rental: Item ID 97, Username: hi!,null,null");
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) 'a', "hi!", localDate2, localDate3);
        int int5 = rental4.getItemId();
        java.time.LocalDate localDate6 = rental4.getDueDate();
        java.time.LocalDate localDate7 = rental4.getRentalDate();
        java.lang.String str8 = rental4.getUsername();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) 'a', "hi!", localDate2, localDate3);
        int int5 = rental4.getItemId();
        java.time.LocalDate localDate6 = rental4.getDueDate();
        java.time.LocalDate localDate7 = rental4.getRentalDate();
        java.time.LocalDate localDate8 = rental4.getDueDate();
        java.lang.String str9 = rental4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str9, "Rental: Item ID 97, Username: hi!");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (byte) 0, "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!", localDate2, localDate3);
        java.time.LocalDate localDate5 = rental4.getDueDate();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = localDate5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(localDate5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) 'a', "hi!", localDate2, localDate3);
        int int5 = rental4.getItemId();
        java.time.LocalDate localDate6 = rental4.getDueDate();
        java.time.LocalDate localDate7 = rental4.getRentalDate();
        java.lang.String str8 = rental4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str8, "Rental: Item ID 97, Username: hi!");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (short) 10, "Rental: Item ID 97, Username: hi!", localDate2, localDate3);
        java.lang.String str5 = rental4.toString();
        java.lang.String str6 = rental4.toCSVString();
        java.lang.String str7 = rental4.getUsername();
        java.lang.Class<?> wildcardClass8 = rental4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!" + "'", str5, "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10,Rental: Item ID 97, Username: hi!,null,null" + "'", str6, "10,Rental: Item ID 97, Username: hi!,null,null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str7, "Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (short) 10, "Rental: Item ID 97, Username: hi!", localDate2, localDate3);
        java.lang.String str5 = rental4.toString();
        java.lang.String str6 = rental4.toCSVString();
        java.lang.Class<?> wildcardClass7 = rental4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!" + "'", str5, "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10,Rental: Item ID 97, Username: hi!,null,null" + "'", str6, "10,Rental: Item ID 97, Username: hi!,null,null");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) '4', "10,Rental: Item ID 97, Username: hi!,null,null", localDate2, localDate3);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (short) 10, "Rental: Item ID 97, Username: hi!", localDate2, localDate3);
        java.lang.String str5 = rental4.getUsername();
        java.time.LocalDate localDate6 = rental4.getRentalDate();
        int int7 = rental4.getItemId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str5, "Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) ' ', "hi!", localDate2, localDate3);
        java.lang.Class<?> wildcardClass5 = rental4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) 'a', "hi!", localDate2, localDate3);
        java.lang.String str5 = rental4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str5, "Rental: Item ID 97, Username: hi!");
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (short) 10, "Rental: Item ID 97, Username: hi!", localDate2, localDate3);
        java.lang.String str5 = rental4.getUsername();
        java.time.LocalDate localDate6 = rental4.getRentalDate();
        java.lang.String str7 = rental4.toCSVString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str5, "Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10,Rental: Item ID 97, Username: hi!,null,null" + "'", str7, "10,Rental: Item ID 97, Username: hi!,null,null");
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) 'a', "hi!", localDate2, localDate3);
        int int5 = rental4.getItemId();
        java.time.LocalDate localDate6 = rental4.getDueDate();
        java.lang.Class<?> wildcardClass7 = rental4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) 'a', "hi!", localDate2, localDate3);
        java.time.LocalDate localDate5 = rental4.getDueDate();
        java.lang.String str6 = rental4.getUsername();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (short) 10, "Rental: Item ID 97, Username: hi!", localDate2, localDate3);
        java.lang.String str5 = rental4.toString();
        java.lang.Class<?> wildcardClass6 = rental4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!" + "'", str5, "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental(0, "Rental: Item ID 97, Username: hi!", localDate2, localDate3);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) 'a', "hi!", localDate2, localDate3);
        int int5 = rental4.getItemId();
        java.time.LocalDate localDate6 = rental4.getDueDate();
        java.time.LocalDate localDate7 = rental4.getRentalDate();
        java.lang.String str8 = rental4.toCSVString();
        int int9 = rental4.getItemId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "97,hi!,null,null" + "'", str8, "97,hi!,null,null");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental(0, "", localDate2, localDate3);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (short) 10, "Rental: Item ID 97, Username: hi!", localDate2, localDate3);
        java.lang.Class<?> wildcardClass5 = rental4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (byte) 10, "Rental: Item ID 97, Username: hi!", localDate2, localDate3);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) 'a', "hi!", localDate2, localDate3);
        java.time.LocalDate localDate5 = rental4.getRentalDate();
        java.lang.String str6 = rental4.toCSVString();
        java.time.LocalDate localDate7 = rental4.getRentalDate();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "97,hi!,null,null" + "'", str6, "97,hi!,null,null");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) ' ', "hi!", localDate2, localDate3);
        java.time.LocalDate localDate5 = rental4.getDueDate();
        java.lang.String str6 = rental4.toCSVString();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "32,hi!,null,null" + "'", str6, "32,hi!,null,null");
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (byte) 10, "", localDate2, localDate3);
        java.time.LocalDate localDate5 = rental4.getDueDate();
        org.junit.Assert.assertNull(localDate5);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) 'a', "hi!", localDate2, localDate3);
        int int5 = rental4.getItemId();
        java.lang.String str6 = rental4.toCSVString();
        java.lang.String str7 = rental4.toCSVString();
        int int8 = rental4.getItemId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "97,hi!,null,null" + "'", str6, "97,hi!,null,null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,hi!,null,null" + "'", str7, "97,hi!,null,null");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (short) 10, "Rental: Item ID 97, Username: hi!", localDate2, localDate3);
        java.lang.String str5 = rental4.toString();
        java.lang.String str6 = rental4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!" + "'", str5, "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!" + "'", str6, "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!");
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) 'a', "hi!", localDate2, localDate3);
        int int5 = rental4.getItemId();
        java.lang.String str6 = rental4.toCSVString();
        java.time.LocalDate localDate7 = rental4.getRentalDate();
        java.lang.String str8 = rental4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "97,hi!,null,null" + "'", str6, "97,hi!,null,null");
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str8, "Rental: Item ID 97, Username: hi!");
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental(100, "Rental: Item ID 97, Username: hi!", localDate2, localDate3);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (short) 10, "Rental: Item ID 97, Username: hi!", localDate2, localDate3);
        java.lang.String str5 = rental4.toString();
        java.lang.String str6 = rental4.toCSVString();
        java.lang.String str7 = rental4.getUsername();
        java.time.LocalDate localDate8 = rental4.getRentalDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!" + "'", str5, "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10,Rental: Item ID 97, Username: hi!,null,null" + "'", str6, "10,Rental: Item ID 97, Username: hi!,null,null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str7, "Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (short) 10, "Rental: Item ID 97, Username: hi!", localDate2, localDate3);
        int int5 = rental4.getItemId();
        java.time.LocalDate localDate6 = rental4.getRentalDate();
        java.lang.String str7 = rental4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!" + "'", str7, "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!");
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) 'a', "hi!", localDate2, localDate3);
        java.time.LocalDate localDate5 = rental4.getRentalDate();
        java.lang.String str6 = rental4.toString();
        int int7 = rental4.getItemId();
        java.time.LocalDate localDate8 = rental4.getRentalDate();
        int int9 = rental4.getItemId();
        java.lang.String str10 = rental4.getUsername();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str6, "Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (short) 10, "Rental: Item ID 97, Username: hi!", localDate2, localDate3);
        java.lang.String str5 = rental4.getUsername();
        java.time.LocalDate localDate6 = rental4.getRentalDate();
        java.time.LocalDate localDate7 = rental4.getDueDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str5, "Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental(0, "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!", localDate2, localDate3);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (short) 10, "32,hi!,null,null", localDate2, localDate3);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) 'a', "hi!", localDate2, localDate3);
        int int5 = rental4.getItemId();
        java.time.LocalDate localDate6 = rental4.getDueDate();
        java.time.LocalDate localDate7 = rental4.getRentalDate();
        java.time.LocalDate localDate8 = rental4.getDueDate();
        int int9 = rental4.getItemId();
        java.lang.String str10 = rental4.toCSVString();
        java.lang.String str11 = rental4.toCSVString();
        int int12 = rental4.getItemId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "97,hi!,null,null" + "'", str10, "97,hi!,null,null");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97,hi!,null,null" + "'", str11, "97,hi!,null,null");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) 'a', "hi!", localDate2, localDate3);
        int int5 = rental4.getItemId();
        java.time.LocalDate localDate6 = rental4.getDueDate();
        java.lang.String str7 = rental4.toString();
        int int8 = rental4.getItemId();
        int int9 = rental4.getItemId();
        java.lang.String str10 = rental4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str7, "Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 97 + "'", int9 == 97);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str10, "Rental: Item ID 97, Username: hi!");
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental(97, "10,Rental: Item ID 97, Username: hi!,null,null", localDate2, localDate3);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (short) 10, "Rental: Item ID 97, Username: hi!", localDate2, localDate3);
        java.lang.String str5 = rental4.toString();
        java.lang.String str6 = rental4.toCSVString();
        java.lang.String str7 = rental4.toString();
        java.time.LocalDate localDate8 = rental4.getDueDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!" + "'", str5, "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10,Rental: Item ID 97, Username: hi!,null,null" + "'", str6, "10,Rental: Item ID 97, Username: hi!,null,null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!" + "'", str7, "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) 'a', "hi!", localDate2, localDate3);
        int int5 = rental4.getItemId();
        java.time.LocalDate localDate6 = rental4.getDueDate();
        java.lang.String str7 = rental4.toString();
        java.lang.String str8 = rental4.toString();
        java.lang.String str9 = rental4.getUsername();
        java.lang.Class<?> wildcardClass10 = rental4.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str7, "Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str8, "Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) 'a', "hi!", localDate2, localDate3);
        int int5 = rental4.getItemId();
        java.lang.String str6 = rental4.toCSVString();
        java.lang.String str7 = rental4.toCSVString();
        java.lang.String str8 = rental4.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "97,hi!,null,null" + "'", str6, "97,hi!,null,null");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "97,hi!,null,null" + "'", str7, "97,hi!,null,null");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str8, "Rental: Item ID 97, Username: hi!");
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (byte) 10, "hi!", localDate2, localDate3);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (short) 10, "Rental: Item ID 97, Username: hi!", localDate2, localDate3);
        java.lang.String str5 = rental4.getUsername();
        java.lang.String str6 = rental4.toString();
        java.time.LocalDate localDate7 = rental4.getDueDate();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str5, "Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!" + "'", str6, "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertNull(localDate7);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (byte) 1, "Rental: Item ID 97, Username: hi!", localDate2, localDate3);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (byte) 100, "", localDate2, localDate3);
        java.lang.String str5 = rental4.toCSVString();
        java.lang.String str6 = rental4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "100,,null,null" + "'", str5, "100,,null,null");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Rental: Item ID 100, Username: " + "'", str6, "Rental: Item ID 100, Username: ");
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (byte) 0, "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!", localDate2, localDate3);
        java.time.LocalDate localDate5 = rental4.getDueDate();
        java.lang.String str6 = rental4.toCSVString();
        org.junit.Assert.assertNull(localDate5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "0,Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!,null,null" + "'", str6, "0,Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!,null,null");
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (short) 10, "Rental: Item ID 97, Username: hi!", localDate2, localDate3);
        int int5 = rental4.getItemId();
        java.time.LocalDate localDate6 = rental4.getRentalDate();
        java.time.LocalDate localDate7 = rental4.getDueDate();
        java.lang.String str8 = rental4.getUsername();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertNull(localDate7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str8, "Rental: Item ID 97, Username: hi!");
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (short) 10, "Rental: Item ID 97, Username: hi!", localDate2, localDate3);
        int int5 = rental4.getItemId();
        java.time.LocalDate localDate6 = rental4.getRentalDate();
        java.lang.String str7 = rental4.toCSVString();
        java.time.LocalDate localDate8 = rental4.getRentalDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10,Rental: Item ID 97, Username: hi!,null,null" + "'", str7, "10,Rental: Item ID 97, Username: hi!,null,null");
        org.junit.Assert.assertNull(localDate8);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental(100, "97,hi!,null,null", localDate2, localDate3);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) (short) 10, "Rental: Item ID 97, Username: hi!", localDate2, localDate3);
        java.lang.String str5 = rental4.getUsername();
        java.lang.String str6 = rental4.toString();
        java.lang.String str7 = rental4.toCSVString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str5, "Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!" + "'", str6, "Rental: Item ID 10, Username: Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "10,Rental: Item ID 97, Username: hi!,null,null" + "'", str7, "10,Rental: Item ID 97, Username: hi!,null,null");
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        java.time.LocalDate localDate2 = null;
        java.time.LocalDate localDate3 = null;
        gui.Rental rental4 = new gui.Rental((int) 'a', "hi!", localDate2, localDate3);
        int int5 = rental4.getItemId();
        java.time.LocalDate localDate6 = rental4.getDueDate();
        java.lang.String str7 = rental4.toString();
        java.lang.String str8 = rental4.toString();
        java.lang.String str9 = rental4.getUsername();
        java.time.LocalDate localDate10 = rental4.getDueDate();
        java.lang.String str11 = rental4.toCSVString();
        java.time.LocalDate localDate12 = rental4.getRentalDate();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str7, "Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Rental: Item ID 97, Username: hi!" + "'", str8, "Rental: Item ID 97, Username: hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(localDate10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "97,hi!,null,null" + "'", str11, "97,hi!,null,null");
        org.junit.Assert.assertNull(localDate12);
    }
}

