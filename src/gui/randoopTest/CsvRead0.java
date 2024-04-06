package gui.randoopTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CsvRead0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass5 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass8 = userList7.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.verifyUser("");
        java.util.List<gui.User> userList27 = csvReadWrite20.getUnverifiedUsers();
        gui.User user30 = csvReadWrite20.loginUser("hi!", "");
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        boolean boolean41 = csvReadWrite20.registerUser("", "hi!", false, "", "", true, strList39);
        boolean boolean42 = csvReadWrite13.registerUser("hi!", "", true, "", "hi!", true, strList39);
        boolean boolean43 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList39);
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass46 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList27);
// flaky:         org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass7 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass9 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        gui.CsvReadWrite csvReadWrite29 = new gui.CsvReadWrite();
        csvReadWrite29.updateFacultyNotifications("");
        csvReadWrite29.verifyUser("");
        csvReadWrite29.verifyUser("");
        java.util.List<gui.User> userList36 = csvReadWrite29.getUnverifiedUsers();
        gui.User user39 = csvReadWrite29.loginUser("hi!", "");
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = csvReadWrite29.registerUser("", "hi!", false, "", "", true, strList48);
        boolean boolean51 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList48);
        java.util.List<gui.User> userList52 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass53 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite27 = new gui.CsvReadWrite();
        csvReadWrite27.updateFacultyNotifications("");
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        boolean boolean41 = csvReadWrite27.registerUser("", "", false, "hi!", "", false, strList39);
        boolean boolean42 = csvReadWrite20.registerUser("", "", false, "hi!", "", true, strList39);
        gui.CsvReadWrite csvReadWrite49 = new gui.CsvReadWrite();
        csvReadWrite49.updateFacultyNotifications("");
        csvReadWrite49.verifyUser("");
        csvReadWrite49.verifyUser("");
        java.util.List<gui.User> userList56 = csvReadWrite49.getUnverifiedUsers();
        gui.User user59 = csvReadWrite49.loginUser("hi!", "");
        java.lang.String[] strArray67 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        boolean boolean70 = csvReadWrite49.registerUser("", "hi!", false, "", "", true, strList68);
        boolean boolean71 = csvReadWrite20.registerUser("", "hi!", true, "", "", false, strList68);
        boolean boolean72 = csvReadWrite0.registerUser("hi!", "", true, "hi!", "", false, strList68);
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass75 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(userList56);
        org.junit.Assert.assertNotNull(user59);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass5 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        gui.CsvReadWrite csvReadWrite29 = new gui.CsvReadWrite();
        csvReadWrite29.updateFacultyNotifications("");
        csvReadWrite29.verifyUser("");
        csvReadWrite29.verifyUser("");
        java.util.List<gui.User> userList36 = csvReadWrite29.getUnverifiedUsers();
        gui.User user39 = csvReadWrite29.loginUser("hi!", "");
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = csvReadWrite29.registerUser("", "hi!", false, "", "", true, strList48);
        boolean boolean51 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList48);
        java.lang.Class<?> wildcardClass52 = strList48.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.User user3 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass6 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass11 = userList10.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite25 = new gui.CsvReadWrite();
        csvReadWrite25.updateFacultyNotifications("");
        csvReadWrite25.verifyUser("");
        csvReadWrite25.verifyUser("");
        java.util.List<gui.User> userList32 = csvReadWrite25.getUnverifiedUsers();
        gui.User user35 = csvReadWrite25.loginUser("hi!", "");
        gui.User user38 = csvReadWrite25.loginUser("", "");
        gui.CsvReadWrite csvReadWrite45 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite52 = new gui.CsvReadWrite();
        csvReadWrite52.updateFacultyNotifications("");
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        boolean boolean66 = csvReadWrite52.registerUser("", "", false, "hi!", "", false, strList64);
        boolean boolean67 = csvReadWrite45.registerUser("", "", false, "hi!", "", true, strList64);
        gui.CsvReadWrite csvReadWrite74 = new gui.CsvReadWrite();
        csvReadWrite74.updateFacultyNotifications("");
        csvReadWrite74.verifyUser("");
        csvReadWrite74.verifyUser("");
        java.util.List<gui.User> userList81 = csvReadWrite74.getUnverifiedUsers();
        gui.User user84 = csvReadWrite74.loginUser("hi!", "");
        java.lang.String[] strArray92 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList93 = new java.util.ArrayList<java.lang.String>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList93, strArray92);
        boolean boolean95 = csvReadWrite74.registerUser("", "hi!", false, "", "", true, strList93);
        boolean boolean96 = csvReadWrite45.registerUser("", "hi!", true, "", "", false, strList93);
        boolean boolean97 = csvReadWrite25.registerUser("hi!", "", true, "hi!", "", false, strList93);
        boolean boolean98 = csvReadWrite0.registerUser("", "", false, "hi!", "hi!", true, strList93);
        java.lang.Class<?> wildcardClass99 = strList93.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(user35);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(userList81);
        org.junit.Assert.assertNotNull(user84);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass12 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite25 = new gui.CsvReadWrite();
        csvReadWrite25.updateFacultyNotifications("");
        csvReadWrite25.verifyUser("");
        csvReadWrite25.verifyUser("");
        java.util.List<gui.User> userList32 = csvReadWrite25.getUnverifiedUsers();
        gui.User user35 = csvReadWrite25.loginUser("hi!", "");
        gui.User user38 = csvReadWrite25.loginUser("", "");
        gui.CsvReadWrite csvReadWrite45 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite52 = new gui.CsvReadWrite();
        csvReadWrite52.updateFacultyNotifications("");
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        boolean boolean66 = csvReadWrite52.registerUser("", "", false, "hi!", "", false, strList64);
        boolean boolean67 = csvReadWrite45.registerUser("", "", false, "hi!", "", true, strList64);
        gui.CsvReadWrite csvReadWrite74 = new gui.CsvReadWrite();
        csvReadWrite74.updateFacultyNotifications("");
        csvReadWrite74.verifyUser("");
        csvReadWrite74.verifyUser("");
        java.util.List<gui.User> userList81 = csvReadWrite74.getUnverifiedUsers();
        gui.User user84 = csvReadWrite74.loginUser("hi!", "");
        java.lang.String[] strArray92 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList93 = new java.util.ArrayList<java.lang.String>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList93, strArray92);
        boolean boolean95 = csvReadWrite74.registerUser("", "hi!", false, "", "", true, strList93);
        boolean boolean96 = csvReadWrite45.registerUser("", "hi!", true, "", "", false, strList93);
        boolean boolean97 = csvReadWrite25.registerUser("hi!", "", true, "hi!", "", false, strList93);
        boolean boolean98 = csvReadWrite0.registerUser("", "", false, "hi!", "hi!", true, strList93);
        java.lang.Class<?> wildcardClass99 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(user35);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(userList81);
        org.junit.Assert.assertNotNull(user84);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass60 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass8 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user15 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
// flaky:         org.junit.Assert.assertNotNull(user10);
// flaky:         org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.User user13 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass14 = null; // flaky: user13.getClass();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
// flaky:         org.junit.Assert.assertNotNull(user13);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList24 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass25 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user7 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass8 = user7.getClass();
        org.junit.Assert.assertNotNull(userList1);
// flaky:         org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        boolean boolean42 = csvReadWrite28.registerUser("", "", false, "hi!", "", false, strList40);
        boolean boolean43 = csvReadWrite0.registerUser("hi!", "", false, "", "hi!", true, strList40);
        java.lang.Class<?> wildcardClass44 = strList40.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite17 = new gui.CsvReadWrite();
        csvReadWrite17.updateFacultyNotifications("");
        csvReadWrite17.verifyUser("");
        csvReadWrite17.updateFacultyNotifications("");
        gui.User user26 = csvReadWrite17.loginUser("", "hi!");
        java.util.List<gui.User> userList27 = csvReadWrite17.getUnverifiedUsers();
        csvReadWrite17.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite36 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite43 = new gui.CsvReadWrite();
        csvReadWrite43.updateFacultyNotifications("");
        java.lang.String[] strArray54 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList55 = new java.util.ArrayList<java.lang.String>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList55, strArray54);
        boolean boolean57 = csvReadWrite43.registerUser("", "", false, "hi!", "", false, strList55);
        boolean boolean58 = csvReadWrite36.registerUser("", "", false, "hi!", "", true, strList55);
        boolean boolean59 = csvReadWrite17.registerUser("", "hi!", true, "", "", false, strList55);
        boolean boolean60 = csvReadWrite0.registerUser("hi!", "", true, "hi!", "hi!", true, strList55);
        java.lang.Class<?> wildcardClass61 = strList55.getClass();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass9 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass5 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.User user13 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.verifyUser("");
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite40 = new gui.CsvReadWrite();
        csvReadWrite40.updateFacultyNotifications("");
        csvReadWrite40.verifyUser("");
        csvReadWrite40.verifyUser("");
        java.util.List<gui.User> userList47 = csvReadWrite40.getUnverifiedUsers();
        gui.User user50 = csvReadWrite40.loginUser("hi!", "");
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        boolean boolean61 = csvReadWrite40.registerUser("", "hi!", false, "", "", true, strList59);
        boolean boolean62 = csvReadWrite33.registerUser("hi!", "", true, "", "hi!", true, strList59);
        boolean boolean63 = csvReadWrite20.registerUser("", "", false, "hi!", "", false, strList59);
        boolean boolean64 = csvReadWrite0.registerUser("hi!", "", false, "", "hi!", true, strList59);
        java.lang.Class<?> wildcardClass65 = strList59.getClass();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
// flaky:         org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(user50);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass19 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        csvReadWrite28.verifyUser("");
        csvReadWrite28.verifyUser("");
        java.util.List<gui.User> userList35 = csvReadWrite28.getUnverifiedUsers();
        gui.User user38 = csvReadWrite28.loginUser("hi!", "");
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        boolean boolean49 = csvReadWrite28.registerUser("", "hi!", false, "", "", true, strList47);
        boolean boolean50 = csvReadWrite0.registerUser("hi!", "hi!", false, "hi!", "", false, strList47);
        java.lang.Class<?> wildcardClass51 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite11 = new gui.CsvReadWrite();
        csvReadWrite11.updateFacultyNotifications("");
        csvReadWrite11.verifyUser("");
        csvReadWrite11.updateFacultyNotifications("");
        gui.User user20 = csvReadWrite11.loginUser("", "hi!");
        java.util.List<gui.User> userList21 = csvReadWrite11.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        csvReadWrite28.verifyUser("");
        csvReadWrite28.updateFacultyNotifications("");
        gui.User user37 = csvReadWrite28.loginUser("", "hi!");
        java.util.List<gui.User> userList38 = csvReadWrite28.getUnverifiedUsers();
        csvReadWrite28.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite47 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite54 = new gui.CsvReadWrite();
        csvReadWrite54.updateFacultyNotifications("");
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        boolean boolean68 = csvReadWrite54.registerUser("", "", false, "hi!", "", false, strList66);
        boolean boolean69 = csvReadWrite47.registerUser("", "", false, "hi!", "", true, strList66);
        boolean boolean70 = csvReadWrite28.registerUser("", "hi!", true, "", "", false, strList66);
        boolean boolean71 = csvReadWrite11.registerUser("hi!", "", true, "hi!", "hi!", true, strList66);
        boolean boolean72 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList66);
        java.lang.Class<?> wildcardClass73 = strList66.getClass();
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(user37);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        java.lang.Class<?> wildcardClass58 = strList52.getClass();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite19 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        csvReadWrite26.updateFacultyNotifications("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        boolean boolean40 = csvReadWrite26.registerUser("", "", false, "hi!", "", false, strList38);
        boolean boolean41 = csvReadWrite19.registerUser("", "", false, "hi!", "", true, strList38);
        boolean boolean42 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList38);
        java.lang.Class<?> wildcardClass43 = strList38.getClass();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass11 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
// flaky:         org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList26 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass27 = userList26.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite11 = new gui.CsvReadWrite();
        csvReadWrite11.updateFacultyNotifications("");
        csvReadWrite11.verifyUser("");
        csvReadWrite11.verifyUser("");
        java.util.List<gui.User> userList18 = csvReadWrite11.getUnverifiedUsers();
        gui.User user21 = csvReadWrite11.loginUser("hi!", "");
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        boolean boolean32 = csvReadWrite11.registerUser("", "hi!", false, "", "", true, strList30);
        gui.CsvReadWrite csvReadWrite39 = new gui.CsvReadWrite();
        csvReadWrite39.updateFacultyNotifications("");
        csvReadWrite39.verifyUser("");
        csvReadWrite39.verifyUser("");
        java.util.List<gui.User> userList46 = csvReadWrite39.getUnverifiedUsers();
        gui.User user49 = csvReadWrite39.loginUser("hi!", "");
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        boolean boolean60 = csvReadWrite39.registerUser("", "hi!", false, "", "", true, strList58);
        boolean boolean61 = csvReadWrite11.registerUser("hi!", "hi!", false, "hi!", "", false, strList58);
        boolean boolean62 = csvReadWrite0.registerUser("hi!", "", true, "", "hi!", false, strList58);
        java.lang.Class<?> wildcardClass63 = strList58.getClass();
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass7 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        gui.User user5 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass6 = null; // flaky: user5.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
// flaky:         org.junit.Assert.assertNotNull(user5);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        csvReadWrite28.verifyUser("");
        csvReadWrite28.verifyUser("");
        java.util.List<gui.User> userList35 = csvReadWrite28.getUnverifiedUsers();
        gui.User user38 = csvReadWrite28.loginUser("hi!", "");
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        boolean boolean49 = csvReadWrite28.registerUser("", "hi!", false, "", "", true, strList47);
        boolean boolean50 = csvReadWrite0.registerUser("hi!", "hi!", false, "hi!", "", false, strList47);
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass53 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass8 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass3 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        java.lang.Class<?> wildcardClass22 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite11 = new gui.CsvReadWrite();
        csvReadWrite11.updateFacultyNotifications("");
        csvReadWrite11.verifyUser("");
        csvReadWrite11.verifyUser("");
        java.util.List<gui.User> userList18 = csvReadWrite11.getUnverifiedUsers();
        gui.User user21 = csvReadWrite11.loginUser("hi!", "");
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        boolean boolean32 = csvReadWrite11.registerUser("", "hi!", false, "", "", true, strList30);
        gui.CsvReadWrite csvReadWrite39 = new gui.CsvReadWrite();
        csvReadWrite39.updateFacultyNotifications("");
        csvReadWrite39.verifyUser("");
        csvReadWrite39.verifyUser("");
        java.util.List<gui.User> userList46 = csvReadWrite39.getUnverifiedUsers();
        gui.User user49 = csvReadWrite39.loginUser("hi!", "");
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        boolean boolean60 = csvReadWrite39.registerUser("", "hi!", false, "", "", true, strList58);
        boolean boolean61 = csvReadWrite11.registerUser("hi!", "hi!", false, "hi!", "", false, strList58);
        boolean boolean62 = csvReadWrite0.registerUser("hi!", "", true, "", "hi!", false, strList58);
        java.lang.Class<?> wildcardClass63 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass21 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        gui.CsvReadWrite csvReadWrite29 = new gui.CsvReadWrite();
        csvReadWrite29.updateFacultyNotifications("");
        csvReadWrite29.verifyUser("");
        csvReadWrite29.verifyUser("");
        java.util.List<gui.User> userList36 = csvReadWrite29.getUnverifiedUsers();
        gui.User user39 = csvReadWrite29.loginUser("hi!", "");
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = csvReadWrite29.registerUser("", "hi!", false, "", "", true, strList48);
        boolean boolean51 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList48);
        java.util.List<gui.User> userList52 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList55 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList56 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass57 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(userList55);
        org.junit.Assert.assertNotNull(userList56);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList30 = null;
        boolean boolean31 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", false, strList30);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList40 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList41 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass42 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass13 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass9 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user7 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass8 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass6 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList26 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass27 = userList26.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass14 = user13.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass11 = userList10.getClass();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList3 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass4 = userList3.getClass();
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite11 = new gui.CsvReadWrite();
        csvReadWrite11.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        gui.CsvReadWrite csvReadWrite31 = new gui.CsvReadWrite();
        csvReadWrite31.updateFacultyNotifications("");
        csvReadWrite31.verifyUser("");
        csvReadWrite31.updateFacultyNotifications("");
        gui.User user40 = csvReadWrite31.loginUser("", "hi!");
        java.util.List<gui.User> userList41 = csvReadWrite31.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite48 = new gui.CsvReadWrite();
        csvReadWrite48.updateFacultyNotifications("");
        csvReadWrite48.verifyUser("");
        csvReadWrite48.updateFacultyNotifications("");
        gui.User user57 = csvReadWrite48.loginUser("", "hi!");
        java.util.List<gui.User> userList58 = csvReadWrite48.getUnverifiedUsers();
        csvReadWrite48.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite67 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite74 = new gui.CsvReadWrite();
        csvReadWrite74.updateFacultyNotifications("");
        java.lang.String[] strArray85 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        boolean boolean88 = csvReadWrite74.registerUser("", "", false, "hi!", "", false, strList86);
        boolean boolean89 = csvReadWrite67.registerUser("", "", false, "hi!", "", true, strList86);
        boolean boolean90 = csvReadWrite48.registerUser("", "hi!", true, "", "", false, strList86);
        boolean boolean91 = csvReadWrite31.registerUser("hi!", "", true, "hi!", "hi!", true, strList86);
        boolean boolean92 = csvReadWrite20.registerUser("", "hi!", true, "", "", false, strList86);
        boolean boolean93 = csvReadWrite11.registerUser("", "", true, "", "", false, strList86);
        boolean boolean94 = csvReadWrite0.registerUser("", "hi!", false, "", "", false, strList86);
        java.lang.Class<?> wildcardClass95 = strList86.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(user57);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList22 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass23 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass15 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass13 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass24 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList4 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass5 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite17 = new gui.CsvReadWrite();
        csvReadWrite17.updateFacultyNotifications("");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = csvReadWrite17.registerUser("", "", false, "hi!", "", false, strList29);
        boolean boolean32 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", false, strList29);
        java.lang.Class<?> wildcardClass33 = strList29.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("hi!", "");
        gui.CsvReadWrite csvReadWrite23 = new gui.CsvReadWrite();
        csvReadWrite23.updateFacultyNotifications("");
        csvReadWrite23.verifyUser("");
        csvReadWrite23.verifyUser("");
        java.util.List<gui.User> userList30 = csvReadWrite23.getUnverifiedUsers();
        gui.User user33 = csvReadWrite23.loginUser("hi!", "");
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        boolean boolean44 = csvReadWrite23.registerUser("", "hi!", false, "", "", true, strList42);
        gui.CsvReadWrite csvReadWrite51 = new gui.CsvReadWrite();
        csvReadWrite51.updateFacultyNotifications("");
        csvReadWrite51.verifyUser("");
        csvReadWrite51.verifyUser("");
        java.util.List<gui.User> userList58 = csvReadWrite51.getUnverifiedUsers();
        gui.User user61 = csvReadWrite51.loginUser("hi!", "");
        java.lang.String[] strArray69 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        boolean boolean72 = csvReadWrite51.registerUser("", "hi!", false, "", "", true, strList70);
        boolean boolean73 = csvReadWrite23.registerUser("hi!", "hi!", false, "hi!", "", false, strList70);
        boolean boolean74 = csvReadWrite0.registerUser("", "", true, "hi!", "hi!", true, strList70);
        java.lang.Class<?> wildcardClass75 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(user33);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(user61);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(wildcardClass75);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass24 = userList23.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.updateFacultyNotifications("");
        gui.User user29 = csvReadWrite20.loginUser("", "hi!");
        java.util.List<gui.User> userList30 = csvReadWrite20.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite37 = new gui.CsvReadWrite();
        csvReadWrite37.updateFacultyNotifications("");
        csvReadWrite37.verifyUser("");
        csvReadWrite37.updateFacultyNotifications("");
        gui.User user46 = csvReadWrite37.loginUser("", "hi!");
        java.util.List<gui.User> userList47 = csvReadWrite37.getUnverifiedUsers();
        csvReadWrite37.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite56 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite63 = new gui.CsvReadWrite();
        csvReadWrite63.updateFacultyNotifications("");
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        boolean boolean77 = csvReadWrite63.registerUser("", "", false, "hi!", "", false, strList75);
        boolean boolean78 = csvReadWrite56.registerUser("", "", false, "hi!", "", true, strList75);
        boolean boolean79 = csvReadWrite37.registerUser("", "hi!", true, "", "", false, strList75);
        boolean boolean80 = csvReadWrite20.registerUser("hi!", "", true, "hi!", "hi!", true, strList75);
        boolean boolean81 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList75);
        java.lang.Class<?> wildcardClass82 = strList75.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList19 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass20 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        csvReadWrite28.verifyUser("");
        csvReadWrite28.verifyUser("");
        java.util.List<gui.User> userList35 = csvReadWrite28.getUnverifiedUsers();
        gui.User user38 = csvReadWrite28.loginUser("hi!", "");
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        boolean boolean49 = csvReadWrite28.registerUser("", "hi!", false, "", "", true, strList47);
        boolean boolean50 = csvReadWrite0.registerUser("hi!", "hi!", false, "hi!", "", false, strList47);
        java.lang.Class<?> wildcardClass51 = strList47.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user6 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.User user13 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.verifyUser("");
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite40 = new gui.CsvReadWrite();
        csvReadWrite40.updateFacultyNotifications("");
        csvReadWrite40.verifyUser("");
        csvReadWrite40.verifyUser("");
        java.util.List<gui.User> userList47 = csvReadWrite40.getUnverifiedUsers();
        gui.User user50 = csvReadWrite40.loginUser("hi!", "");
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        boolean boolean61 = csvReadWrite40.registerUser("", "hi!", false, "", "", true, strList59);
        boolean boolean62 = csvReadWrite33.registerUser("hi!", "", true, "", "hi!", true, strList59);
        boolean boolean63 = csvReadWrite20.registerUser("", "", false, "hi!", "", false, strList59);
        boolean boolean64 = csvReadWrite0.registerUser("hi!", "", false, "", "hi!", true, strList59);
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass67 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(user50);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite15 = new gui.CsvReadWrite();
        csvReadWrite15.updateFacultyNotifications("");
        csvReadWrite15.verifyUser("");
        csvReadWrite15.updateFacultyNotifications("");
        gui.User user24 = csvReadWrite15.loginUser("", "hi!");
        java.util.List<gui.User> userList25 = csvReadWrite15.getUnverifiedUsers();
        gui.User user28 = csvReadWrite15.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite35 = new gui.CsvReadWrite();
        csvReadWrite35.updateFacultyNotifications("");
        csvReadWrite35.verifyUser("");
        csvReadWrite35.verifyUser("");
        gui.CsvReadWrite csvReadWrite48 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite55 = new gui.CsvReadWrite();
        csvReadWrite55.updateFacultyNotifications("");
        csvReadWrite55.verifyUser("");
        csvReadWrite55.verifyUser("");
        java.util.List<gui.User> userList62 = csvReadWrite55.getUnverifiedUsers();
        gui.User user65 = csvReadWrite55.loginUser("hi!", "");
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        boolean boolean76 = csvReadWrite55.registerUser("", "hi!", false, "", "", true, strList74);
        boolean boolean77 = csvReadWrite48.registerUser("hi!", "", true, "", "hi!", true, strList74);
        boolean boolean78 = csvReadWrite35.registerUser("", "", false, "hi!", "", false, strList74);
        boolean boolean79 = csvReadWrite15.registerUser("hi!", "", false, "", "hi!", true, strList74);
        boolean boolean80 = csvReadWrite0.registerUser("", "", false, "hi!", "hi!", false, strList74);
        gui.User user83 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass84 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(user65);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(user83);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user6 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user9 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass10 = user9.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList19 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass20 = userList19.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite11 = new gui.CsvReadWrite();
        csvReadWrite11.updateFacultyNotifications("");
        csvReadWrite11.verifyUser("");
        csvReadWrite11.verifyUser("");
        java.util.List<gui.User> userList18 = csvReadWrite11.getUnverifiedUsers();
        gui.User user21 = csvReadWrite11.loginUser("hi!", "");
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        boolean boolean32 = csvReadWrite11.registerUser("", "hi!", false, "", "", true, strList30);
        gui.CsvReadWrite csvReadWrite39 = new gui.CsvReadWrite();
        csvReadWrite39.updateFacultyNotifications("");
        csvReadWrite39.verifyUser("");
        csvReadWrite39.verifyUser("");
        java.util.List<gui.User> userList46 = csvReadWrite39.getUnverifiedUsers();
        gui.User user49 = csvReadWrite39.loginUser("hi!", "");
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        boolean boolean60 = csvReadWrite39.registerUser("", "hi!", false, "", "", true, strList58);
        boolean boolean61 = csvReadWrite11.registerUser("hi!", "hi!", false, "hi!", "", false, strList58);
        boolean boolean62 = csvReadWrite0.registerUser("hi!", "", true, "", "hi!", false, strList58);
        java.util.List<gui.User> userList63 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(userList63);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass3 = userList2.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        gui.CsvReadWrite csvReadWrite11 = new gui.CsvReadWrite();
        csvReadWrite11.updateFacultyNotifications("");
        csvReadWrite11.verifyUser("");
        gui.CsvReadWrite csvReadWrite22 = new gui.CsvReadWrite();
        csvReadWrite22.updateFacultyNotifications("");
        csvReadWrite22.verifyUser("");
        csvReadWrite22.updateFacultyNotifications("");
        gui.User user31 = csvReadWrite22.loginUser("", "hi!");
        java.util.List<gui.User> userList32 = csvReadWrite22.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite39 = new gui.CsvReadWrite();
        csvReadWrite39.updateFacultyNotifications("");
        csvReadWrite39.verifyUser("");
        csvReadWrite39.updateFacultyNotifications("");
        gui.User user48 = csvReadWrite39.loginUser("", "hi!");
        java.util.List<gui.User> userList49 = csvReadWrite39.getUnverifiedUsers();
        csvReadWrite39.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite58 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite65 = new gui.CsvReadWrite();
        csvReadWrite65.updateFacultyNotifications("");
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList77 = new java.util.ArrayList<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList77, strArray76);
        boolean boolean79 = csvReadWrite65.registerUser("", "", false, "hi!", "", false, strList77);
        boolean boolean80 = csvReadWrite58.registerUser("", "", false, "hi!", "", true, strList77);
        boolean boolean81 = csvReadWrite39.registerUser("", "hi!", true, "", "", false, strList77);
        boolean boolean82 = csvReadWrite22.registerUser("hi!", "", true, "hi!", "hi!", true, strList77);
        boolean boolean83 = csvReadWrite11.registerUser("", "hi!", true, "", "", false, strList77);
        boolean boolean84 = csvReadWrite0.registerUser("hi!", "hi!", true, "", "", false, strList77);
        java.lang.Class<?> wildcardClass85 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(user48);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.verifyUser("hi!");
        gui.CsvReadWrite csvReadWrite27 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite34 = new gui.CsvReadWrite();
        csvReadWrite34.updateFacultyNotifications("");
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        boolean boolean48 = csvReadWrite34.registerUser("", "", false, "hi!", "", false, strList46);
        boolean boolean49 = csvReadWrite27.registerUser("", "", false, "hi!", "", true, strList46);
        boolean boolean50 = csvReadWrite0.registerUser("hi!", "hi!", true, "", "", false, strList46);
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass53 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass25 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.lang.Class<?> wildcardClass1 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass28 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user15 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        gui.User user20 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass25 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user15 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass16 = user15.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass64 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user15 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass16 = user15.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass26 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass9 = userList8.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass17 = userList16.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite11 = new gui.CsvReadWrite();
        csvReadWrite11.updateFacultyNotifications("");
        csvReadWrite11.verifyUser("");
        csvReadWrite11.updateFacultyNotifications("");
        gui.User user20 = csvReadWrite11.loginUser("", "hi!");
        java.util.List<gui.User> userList21 = csvReadWrite11.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        csvReadWrite28.verifyUser("");
        csvReadWrite28.updateFacultyNotifications("");
        gui.User user37 = csvReadWrite28.loginUser("", "hi!");
        java.util.List<gui.User> userList38 = csvReadWrite28.getUnverifiedUsers();
        csvReadWrite28.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite47 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite54 = new gui.CsvReadWrite();
        csvReadWrite54.updateFacultyNotifications("");
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        boolean boolean68 = csvReadWrite54.registerUser("", "", false, "hi!", "", false, strList66);
        boolean boolean69 = csvReadWrite47.registerUser("", "", false, "hi!", "", true, strList66);
        boolean boolean70 = csvReadWrite28.registerUser("", "hi!", true, "", "", false, strList66);
        boolean boolean71 = csvReadWrite11.registerUser("hi!", "", true, "hi!", "hi!", true, strList66);
        boolean boolean72 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList66);
        java.lang.Class<?> wildcardClass73 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(user37);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user15 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        gui.User user20 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass24 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("", "hi!");
        gui.CsvReadWrite csvReadWrite19 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        csvReadWrite26.updateFacultyNotifications("");
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList38 = new java.util.ArrayList<java.lang.String>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList38, strArray37);
        boolean boolean40 = csvReadWrite26.registerUser("", "", false, "hi!", "", false, strList38);
        boolean boolean41 = csvReadWrite19.registerUser("", "", false, "hi!", "", true, strList38);
        gui.CsvReadWrite csvReadWrite48 = new gui.CsvReadWrite();
        csvReadWrite48.updateFacultyNotifications("");
        csvReadWrite48.verifyUser("");
        csvReadWrite48.verifyUser("");
        java.util.List<gui.User> userList55 = csvReadWrite48.getUnverifiedUsers();
        gui.User user58 = csvReadWrite48.loginUser("hi!", "");
        java.lang.String[] strArray66 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList67 = new java.util.ArrayList<java.lang.String>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList67, strArray66);
        boolean boolean69 = csvReadWrite48.registerUser("", "hi!", false, "", "", true, strList67);
        boolean boolean70 = csvReadWrite19.registerUser("", "hi!", true, "", "", false, strList67);
        boolean boolean71 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "", true, strList67);
        java.lang.Class<?> wildcardClass72 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(userList55);
        org.junit.Assert.assertNotNull(user58);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass10 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList20 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass28 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.verifyUser("hi!");
        gui.User user23 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass24 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(user23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite11 = new gui.CsvReadWrite();
        csvReadWrite11.updateFacultyNotifications("");
        csvReadWrite11.verifyUser("");
        csvReadWrite11.verifyUser("");
        java.util.List<gui.User> userList18 = csvReadWrite11.getUnverifiedUsers();
        gui.User user21 = csvReadWrite11.loginUser("hi!", "");
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        boolean boolean32 = csvReadWrite11.registerUser("", "hi!", false, "", "", true, strList30);
        gui.CsvReadWrite csvReadWrite39 = new gui.CsvReadWrite();
        csvReadWrite39.updateFacultyNotifications("");
        csvReadWrite39.verifyUser("");
        csvReadWrite39.verifyUser("");
        java.util.List<gui.User> userList46 = csvReadWrite39.getUnverifiedUsers();
        gui.User user49 = csvReadWrite39.loginUser("hi!", "");
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        boolean boolean60 = csvReadWrite39.registerUser("", "hi!", false, "", "", true, strList58);
        boolean boolean61 = csvReadWrite11.registerUser("hi!", "hi!", false, "hi!", "", false, strList58);
        boolean boolean62 = csvReadWrite0.registerUser("hi!", "", true, "", "hi!", false, strList58);
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass69 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        gui.User user66 = csvReadWrite0.loginUser("hi!", "");
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(user66);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass11 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user20 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite27 = new gui.CsvReadWrite();
        csvReadWrite27.updateFacultyNotifications("");
        csvReadWrite27.verifyUser("");
        csvReadWrite27.updateFacultyNotifications("");
        gui.User user36 = csvReadWrite27.loginUser("", "hi!");
        java.util.List<gui.User> userList37 = csvReadWrite27.getUnverifiedUsers();
        gui.User user40 = csvReadWrite27.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite47 = new gui.CsvReadWrite();
        csvReadWrite47.updateFacultyNotifications("");
        csvReadWrite47.verifyUser("");
        csvReadWrite47.verifyUser("");
        gui.CsvReadWrite csvReadWrite60 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite67 = new gui.CsvReadWrite();
        csvReadWrite67.updateFacultyNotifications("");
        csvReadWrite67.verifyUser("");
        csvReadWrite67.verifyUser("");
        java.util.List<gui.User> userList74 = csvReadWrite67.getUnverifiedUsers();
        gui.User user77 = csvReadWrite67.loginUser("hi!", "");
        java.lang.String[] strArray85 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        boolean boolean88 = csvReadWrite67.registerUser("", "hi!", false, "", "", true, strList86);
        boolean boolean89 = csvReadWrite60.registerUser("hi!", "", true, "", "hi!", true, strList86);
        boolean boolean90 = csvReadWrite47.registerUser("", "", false, "hi!", "", false, strList86);
        boolean boolean91 = csvReadWrite27.registerUser("hi!", "", false, "", "hi!", true, strList86);
        boolean boolean92 = csvReadWrite0.registerUser("hi!", "", false, "", "hi!", true, strList86);
        java.lang.Class<?> wildcardClass93 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(user36);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(userList74);
        org.junit.Assert.assertNotNull(user77);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite15 = new gui.CsvReadWrite();
        csvReadWrite15.updateFacultyNotifications("");
        csvReadWrite15.verifyUser("");
        csvReadWrite15.updateFacultyNotifications("");
        gui.User user24 = csvReadWrite15.loginUser("", "hi!");
        java.util.List<gui.User> userList25 = csvReadWrite15.getUnverifiedUsers();
        gui.User user28 = csvReadWrite15.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite35 = new gui.CsvReadWrite();
        csvReadWrite35.updateFacultyNotifications("");
        csvReadWrite35.verifyUser("");
        csvReadWrite35.verifyUser("");
        gui.CsvReadWrite csvReadWrite48 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite55 = new gui.CsvReadWrite();
        csvReadWrite55.updateFacultyNotifications("");
        csvReadWrite55.verifyUser("");
        csvReadWrite55.verifyUser("");
        java.util.List<gui.User> userList62 = csvReadWrite55.getUnverifiedUsers();
        gui.User user65 = csvReadWrite55.loginUser("hi!", "");
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        boolean boolean76 = csvReadWrite55.registerUser("", "hi!", false, "", "", true, strList74);
        boolean boolean77 = csvReadWrite48.registerUser("hi!", "", true, "", "hi!", true, strList74);
        boolean boolean78 = csvReadWrite35.registerUser("", "", false, "hi!", "", false, strList74);
        boolean boolean79 = csvReadWrite15.registerUser("hi!", "", false, "", "hi!", true, strList74);
        boolean boolean80 = csvReadWrite0.registerUser("", "", false, "hi!", "hi!", false, strList74);
        java.lang.Class<?> wildcardClass81 = strList74.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(user65);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass17 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user24 = csvReadWrite0.loginUser("hi!", "");
        gui.User user27 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass28 = user27.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user15 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass18 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass64 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList26 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass27 = userList26.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass2 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user15 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass16 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite11 = new gui.CsvReadWrite();
        csvReadWrite11.updateFacultyNotifications("");
        csvReadWrite11.verifyUser("");
        csvReadWrite11.verifyUser("");
        java.util.List<gui.User> userList18 = csvReadWrite11.getUnverifiedUsers();
        gui.User user21 = csvReadWrite11.loginUser("hi!", "");
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        boolean boolean32 = csvReadWrite11.registerUser("", "hi!", false, "", "", true, strList30);
        gui.CsvReadWrite csvReadWrite39 = new gui.CsvReadWrite();
        csvReadWrite39.updateFacultyNotifications("");
        csvReadWrite39.verifyUser("");
        csvReadWrite39.verifyUser("");
        java.util.List<gui.User> userList46 = csvReadWrite39.getUnverifiedUsers();
        gui.User user49 = csvReadWrite39.loginUser("hi!", "");
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        boolean boolean60 = csvReadWrite39.registerUser("", "hi!", false, "", "", true, strList58);
        boolean boolean61 = csvReadWrite11.registerUser("hi!", "hi!", false, "hi!", "", false, strList58);
        boolean boolean62 = csvReadWrite0.registerUser("hi!", "", true, "", "hi!", false, strList58);
        java.util.List<gui.User> userList63 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass64 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(userList63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user62 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass63 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(user62);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass64 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        gui.User user28 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass35 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList4 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass5 = userList4.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user11 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList14 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass15 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        csvReadWrite28.verifyUser("");
        csvReadWrite28.verifyUser("");
        java.util.List<gui.User> userList35 = csvReadWrite28.getUnverifiedUsers();
        gui.User user38 = csvReadWrite28.loginUser("hi!", "");
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        boolean boolean49 = csvReadWrite28.registerUser("", "hi!", false, "", "", true, strList47);
        boolean boolean50 = csvReadWrite0.registerUser("hi!", "hi!", false, "hi!", "", false, strList47);
        gui.User user53 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList54 = csvReadWrite0.getUnverifiedUsers();
        gui.User user57 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(user53);
        org.junit.Assert.assertNotNull(userList54);
        org.junit.Assert.assertNotNull(user57);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user66 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass67 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass15 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite27 = new gui.CsvReadWrite();
        csvReadWrite27.updateFacultyNotifications("");
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        boolean boolean41 = csvReadWrite27.registerUser("", "", false, "hi!", "", false, strList39);
        boolean boolean42 = csvReadWrite20.registerUser("", "", false, "hi!", "", true, strList39);
        gui.CsvReadWrite csvReadWrite49 = new gui.CsvReadWrite();
        csvReadWrite49.updateFacultyNotifications("");
        csvReadWrite49.verifyUser("");
        csvReadWrite49.verifyUser("");
        java.util.List<gui.User> userList56 = csvReadWrite49.getUnverifiedUsers();
        gui.User user59 = csvReadWrite49.loginUser("hi!", "");
        java.lang.String[] strArray67 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        boolean boolean70 = csvReadWrite49.registerUser("", "hi!", false, "", "", true, strList68);
        boolean boolean71 = csvReadWrite20.registerUser("", "hi!", true, "", "", false, strList68);
        boolean boolean72 = csvReadWrite0.registerUser("hi!", "", true, "hi!", "", false, strList68);
        csvReadWrite0.verifyUser("");
        gui.User user77 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass78 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(userList56);
        org.junit.Assert.assertNotNull(user59);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(user77);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        csvReadWrite0.verifyUser("hi!");
        gui.User user27 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList28 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user11 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList14 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass15 = userList14.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user6 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user9 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.User user13 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass14 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        csvReadWrite28.verifyUser("");
        csvReadWrite28.verifyUser("");
        java.util.List<gui.User> userList35 = csvReadWrite28.getUnverifiedUsers();
        gui.User user38 = csvReadWrite28.loginUser("hi!", "");
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        boolean boolean49 = csvReadWrite28.registerUser("", "hi!", false, "", "", true, strList47);
        boolean boolean50 = csvReadWrite0.registerUser("hi!", "hi!", false, "hi!", "", false, strList47);
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass53 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite17 = new gui.CsvReadWrite();
        csvReadWrite17.updateFacultyNotifications("");
        csvReadWrite17.verifyUser("");
        csvReadWrite17.verifyUser("");
        java.util.List<gui.User> userList24 = csvReadWrite17.getUnverifiedUsers();
        gui.User user27 = csvReadWrite17.loginUser("hi!", "hi!");
        csvReadWrite17.updateFacultyNotifications("");
        gui.User user32 = csvReadWrite17.loginUser("hi!", "hi!");
        gui.User user35 = csvReadWrite17.loginUser("", "hi!");
        gui.CsvReadWrite csvReadWrite42 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList43 = csvReadWrite42.getUnverifiedUsers();
        java.util.List<gui.User> userList44 = csvReadWrite42.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite51 = new gui.CsvReadWrite();
        csvReadWrite51.updateFacultyNotifications("");
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        boolean boolean65 = csvReadWrite51.registerUser("", "", false, "hi!", "", false, strList63);
        boolean boolean66 = csvReadWrite42.registerUser("hi!", "hi!", false, "hi!", "", false, strList63);
        boolean boolean67 = csvReadWrite17.registerUser("", "", true, "", "", false, strList63);
        boolean boolean68 = csvReadWrite0.registerUser("", "", false, "hi!", "hi!", true, strList63);
        java.lang.Class<?> wildcardClass69 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(user32);
        org.junit.Assert.assertNotNull(user35);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertNotNull(userList44);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList13 = csvReadWrite0.getUnverifiedUsers();
        gui.User user16 = csvReadWrite0.loginUser("", "hi!");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass20 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList20 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList26 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass27 = userList26.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList20 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList26 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass27 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass16 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass9 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.User user3 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList6 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass7 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        gui.User user24 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite31 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite38 = new gui.CsvReadWrite();
        csvReadWrite38.updateFacultyNotifications("");
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        boolean boolean52 = csvReadWrite38.registerUser("", "", false, "hi!", "", false, strList50);
        boolean boolean53 = csvReadWrite31.registerUser("", "", false, "hi!", "", true, strList50);
        java.util.List<gui.User> userList54 = csvReadWrite31.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList61 = null;
        boolean boolean62 = csvReadWrite31.registerUser("hi!", "hi!", false, "", "hi!", false, strList61);
        gui.CsvReadWrite csvReadWrite69 = new gui.CsvReadWrite();
        csvReadWrite69.updateFacultyNotifications("");
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        boolean boolean83 = csvReadWrite69.registerUser("", "", false, "hi!", "", false, strList81);
        boolean boolean84 = csvReadWrite31.registerUser("hi!", "hi!", true, "", "", false, strList81);
        boolean boolean85 = csvReadWrite0.registerUser("", "", false, "", "hi!", true, strList81);
        java.lang.Class<?> wildcardClass86 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(userList54);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass5 = user4.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.User user13 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList14 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass15 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.verifyUser("hi!");
        gui.User user26 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass27 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass13 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user7 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite14 = new gui.CsvReadWrite();
        csvReadWrite14.updateFacultyNotifications("");
        csvReadWrite14.verifyUser("");
        csvReadWrite14.verifyUser("");
        java.util.List<gui.User> userList21 = csvReadWrite14.getUnverifiedUsers();
        gui.User user24 = csvReadWrite14.loginUser("hi!", "hi!");
        csvReadWrite14.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        gui.CsvReadWrite csvReadWrite46 = new gui.CsvReadWrite();
        csvReadWrite46.updateFacultyNotifications("");
        csvReadWrite46.verifyUser("");
        csvReadWrite46.verifyUser("");
        gui.CsvReadWrite csvReadWrite59 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite66 = new gui.CsvReadWrite();
        csvReadWrite66.updateFacultyNotifications("");
        csvReadWrite66.verifyUser("");
        csvReadWrite66.verifyUser("");
        java.util.List<gui.User> userList73 = csvReadWrite66.getUnverifiedUsers();
        gui.User user76 = csvReadWrite66.loginUser("hi!", "");
        java.lang.String[] strArray84 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        boolean boolean87 = csvReadWrite66.registerUser("", "hi!", false, "", "", true, strList85);
        boolean boolean88 = csvReadWrite59.registerUser("hi!", "", true, "", "hi!", true, strList85);
        boolean boolean89 = csvReadWrite46.registerUser("", "", false, "hi!", "", false, strList85);
        boolean boolean90 = csvReadWrite33.registerUser("hi!", "", true, "", "", false, strList85);
        boolean boolean91 = csvReadWrite14.registerUser("hi!", "hi!", true, "", "hi!", false, strList85);
        boolean boolean92 = csvReadWrite0.registerUser("", "hi!", true, "", "", true, strList85);
        java.lang.Class<?> wildcardClass93 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(userList73);
        org.junit.Assert.assertNotNull(user76);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList28 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass33 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user12 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass13 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite11 = new gui.CsvReadWrite();
        csvReadWrite11.updateFacultyNotifications("");
        csvReadWrite11.verifyUser("");
        csvReadWrite11.verifyUser("");
        java.util.List<gui.User> userList18 = csvReadWrite11.getUnverifiedUsers();
        gui.User user21 = csvReadWrite11.loginUser("hi!", "");
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        boolean boolean32 = csvReadWrite11.registerUser("", "hi!", false, "", "", true, strList30);
        gui.CsvReadWrite csvReadWrite39 = new gui.CsvReadWrite();
        csvReadWrite39.updateFacultyNotifications("");
        csvReadWrite39.verifyUser("");
        csvReadWrite39.verifyUser("");
        java.util.List<gui.User> userList46 = csvReadWrite39.getUnverifiedUsers();
        gui.User user49 = csvReadWrite39.loginUser("hi!", "");
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        boolean boolean60 = csvReadWrite39.registerUser("", "hi!", false, "", "", true, strList58);
        boolean boolean61 = csvReadWrite11.registerUser("hi!", "hi!", false, "hi!", "", false, strList58);
        boolean boolean62 = csvReadWrite0.registerUser("hi!", "", true, "", "hi!", false, strList58);
        csvReadWrite0.verifyUser("hi!");
        gui.User user67 = csvReadWrite0.loginUser("", "hi!");
        gui.User user70 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user73 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass74 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(user67);
        org.junit.Assert.assertNotNull(user70);
        org.junit.Assert.assertNotNull(user73);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList20 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass23 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.User user3 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite12 = new gui.CsvReadWrite();
        csvReadWrite12.updateFacultyNotifications("");
        csvReadWrite12.verifyUser("");
        csvReadWrite12.updateFacultyNotifications("");
        gui.User user21 = csvReadWrite12.loginUser("", "hi!");
        java.util.List<gui.User> userList22 = csvReadWrite12.getUnverifiedUsers();
        gui.User user25 = csvReadWrite12.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite32 = new gui.CsvReadWrite();
        csvReadWrite32.updateFacultyNotifications("");
        csvReadWrite32.verifyUser("");
        csvReadWrite32.verifyUser("");
        gui.CsvReadWrite csvReadWrite45 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite52 = new gui.CsvReadWrite();
        csvReadWrite52.updateFacultyNotifications("");
        csvReadWrite52.verifyUser("");
        csvReadWrite52.verifyUser("");
        java.util.List<gui.User> userList59 = csvReadWrite52.getUnverifiedUsers();
        gui.User user62 = csvReadWrite52.loginUser("hi!", "");
        java.lang.String[] strArray70 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        boolean boolean73 = csvReadWrite52.registerUser("", "hi!", false, "", "", true, strList71);
        boolean boolean74 = csvReadWrite45.registerUser("hi!", "", true, "", "hi!", true, strList71);
        boolean boolean75 = csvReadWrite32.registerUser("", "", false, "hi!", "", false, strList71);
        boolean boolean76 = csvReadWrite12.registerUser("hi!", "", false, "", "hi!", true, strList71);
        boolean boolean77 = csvReadWrite0.registerUser("hi!", "", true, "hi!", "", false, strList71);
        java.lang.Class<?> wildcardClass78 = strList71.getClass();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(user62);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user6 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        gui.User user11 = csvReadWrite0.loginUser("", "");
        gui.User user14 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass15 = user14.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList26 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass27 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList26 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList27 = csvReadWrite0.getUnverifiedUsers();
        gui.User user30 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass31 = user30.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.verifyUser("");
        java.util.List<gui.User> userList27 = csvReadWrite20.getUnverifiedUsers();
        gui.User user30 = csvReadWrite20.loginUser("hi!", "");
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        boolean boolean41 = csvReadWrite20.registerUser("", "hi!", false, "", "", true, strList39);
        boolean boolean42 = csvReadWrite13.registerUser("hi!", "", true, "", "hi!", true, strList39);
        boolean boolean43 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList39);
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user48 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass49 = user48.getClass();
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(user48);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user11 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList14 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite21 = new gui.CsvReadWrite();
        csvReadWrite21.updateFacultyNotifications("");
        csvReadWrite21.verifyUser("");
        csvReadWrite21.verifyUser("");
        java.util.List<gui.User> userList28 = csvReadWrite21.getUnverifiedUsers();
        gui.User user31 = csvReadWrite21.loginUser("hi!", "hi!");
        csvReadWrite21.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite40 = new gui.CsvReadWrite();
        csvReadWrite40.updateFacultyNotifications("");
        csvReadWrite40.verifyUser("");
        csvReadWrite40.verifyUser("");
        gui.CsvReadWrite csvReadWrite53 = new gui.CsvReadWrite();
        csvReadWrite53.updateFacultyNotifications("");
        csvReadWrite53.verifyUser("");
        csvReadWrite53.verifyUser("");
        gui.CsvReadWrite csvReadWrite66 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite73 = new gui.CsvReadWrite();
        csvReadWrite73.updateFacultyNotifications("");
        csvReadWrite73.verifyUser("");
        csvReadWrite73.verifyUser("");
        java.util.List<gui.User> userList80 = csvReadWrite73.getUnverifiedUsers();
        gui.User user83 = csvReadWrite73.loginUser("hi!", "");
        java.lang.String[] strArray91 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList92 = new java.util.ArrayList<java.lang.String>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList92, strArray91);
        boolean boolean94 = csvReadWrite73.registerUser("", "hi!", false, "", "", true, strList92);
        boolean boolean95 = csvReadWrite66.registerUser("hi!", "", true, "", "hi!", true, strList92);
        boolean boolean96 = csvReadWrite53.registerUser("", "", false, "hi!", "", false, strList92);
        boolean boolean97 = csvReadWrite40.registerUser("hi!", "", true, "", "", false, strList92);
        boolean boolean98 = csvReadWrite21.registerUser("hi!", "hi!", true, "", "hi!", false, strList92);
        boolean boolean99 = csvReadWrite0.registerUser("hi!", "hi!", true, "", "", false, strList92);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(userList80);
        org.junit.Assert.assertNotNull(user83);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        gui.CsvReadWrite csvReadWrite29 = new gui.CsvReadWrite();
        csvReadWrite29.updateFacultyNotifications("");
        csvReadWrite29.verifyUser("");
        csvReadWrite29.verifyUser("");
        java.util.List<gui.User> userList36 = csvReadWrite29.getUnverifiedUsers();
        gui.User user39 = csvReadWrite29.loginUser("hi!", "");
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = csvReadWrite29.registerUser("", "hi!", false, "", "", true, strList48);
        boolean boolean51 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList48);
        java.util.List<gui.User> userList52 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList55 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(userList55);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite17 = new gui.CsvReadWrite();
        csvReadWrite17.updateFacultyNotifications("");
        csvReadWrite17.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        csvReadWrite28.verifyUser("");
        csvReadWrite28.verifyUser("");
        java.util.List<gui.User> userList35 = csvReadWrite28.getUnverifiedUsers();
        gui.User user38 = csvReadWrite28.loginUser("hi!", "");
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        boolean boolean49 = csvReadWrite28.registerUser("", "hi!", false, "", "", true, strList47);
        gui.CsvReadWrite csvReadWrite56 = new gui.CsvReadWrite();
        csvReadWrite56.updateFacultyNotifications("");
        csvReadWrite56.verifyUser("");
        csvReadWrite56.verifyUser("");
        java.util.List<gui.User> userList63 = csvReadWrite56.getUnverifiedUsers();
        gui.User user66 = csvReadWrite56.loginUser("hi!", "");
        java.lang.String[] strArray74 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        boolean boolean77 = csvReadWrite56.registerUser("", "hi!", false, "", "", true, strList75);
        boolean boolean78 = csvReadWrite28.registerUser("hi!", "hi!", false, "hi!", "", false, strList75);
        boolean boolean79 = csvReadWrite17.registerUser("hi!", "", true, "", "hi!", false, strList75);
        boolean boolean80 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList75);
        java.lang.Class<?> wildcardClass81 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(userList63);
        org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.User user13 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass17 = userList16.getClass();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        gui.User user14 = csvReadWrite0.loginUser("", "");
        gui.User user17 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass18 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(user17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user24 = csvReadWrite0.loginUser("hi!", "");
        gui.User user27 = csvReadWrite0.loginUser("", "hi!");
        gui.User user30 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass31 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite11 = new gui.CsvReadWrite();
        csvReadWrite11.updateFacultyNotifications("");
        csvReadWrite11.verifyUser("");
        csvReadWrite11.updateFacultyNotifications("");
        gui.User user20 = csvReadWrite11.loginUser("", "hi!");
        java.util.List<gui.User> userList21 = csvReadWrite11.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        csvReadWrite28.verifyUser("");
        csvReadWrite28.updateFacultyNotifications("");
        gui.User user37 = csvReadWrite28.loginUser("", "hi!");
        java.util.List<gui.User> userList38 = csvReadWrite28.getUnverifiedUsers();
        csvReadWrite28.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite47 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite54 = new gui.CsvReadWrite();
        csvReadWrite54.updateFacultyNotifications("");
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        boolean boolean68 = csvReadWrite54.registerUser("", "", false, "hi!", "", false, strList66);
        boolean boolean69 = csvReadWrite47.registerUser("", "", false, "hi!", "", true, strList66);
        boolean boolean70 = csvReadWrite28.registerUser("", "hi!", true, "", "", false, strList66);
        boolean boolean71 = csvReadWrite11.registerUser("hi!", "", true, "hi!", "hi!", true, strList66);
        boolean boolean72 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList66);
        java.util.List<gui.User> userList73 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass74 = userList73.getClass();
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(user37);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(userList73);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass10 = userList9.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user66 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList67 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass68 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertNotNull(userList67);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass11 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList20 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList21 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite30 = new gui.CsvReadWrite();
        csvReadWrite30.updateFacultyNotifications("");
        csvReadWrite30.verifyUser("");
        csvReadWrite30.verifyUser("");
        java.util.List<gui.User> userList37 = csvReadWrite30.getUnverifiedUsers();
        gui.User user40 = csvReadWrite30.loginUser("hi!", "hi!");
        csvReadWrite30.updateFacultyNotifications("");
        gui.User user45 = csvReadWrite30.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite52 = new gui.CsvReadWrite();
        csvReadWrite52.updateFacultyNotifications("");
        csvReadWrite52.verifyUser("");
        csvReadWrite52.updateFacultyNotifications("");
        gui.User user61 = csvReadWrite52.loginUser("", "hi!");
        java.util.List<gui.User> userList62 = csvReadWrite52.getUnverifiedUsers();
        csvReadWrite52.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite71 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite78 = new gui.CsvReadWrite();
        csvReadWrite78.updateFacultyNotifications("");
        java.lang.String[] strArray89 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList90 = new java.util.ArrayList<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList90, strArray89);
        boolean boolean92 = csvReadWrite78.registerUser("", "", false, "hi!", "", false, strList90);
        boolean boolean93 = csvReadWrite71.registerUser("", "", false, "hi!", "", true, strList90);
        boolean boolean94 = csvReadWrite52.registerUser("", "hi!", true, "", "", false, strList90);
        boolean boolean95 = csvReadWrite30.registerUser("", "hi!", false, "hi!", "hi!", false, strList90);
        boolean boolean96 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList90);
        gui.User user99 = csvReadWrite0.loginUser("hi!", "hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertNotNull(user61);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(user99);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.User user13 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList18 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass19 = userList18.getClass();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user15 = csvReadWrite0.loginUser("", "");
        gui.User user18 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite25 = new gui.CsvReadWrite();
        csvReadWrite25.updateFacultyNotifications("");
        java.util.List<gui.User> userList28 = csvReadWrite25.getUnverifiedUsers();
        csvReadWrite25.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite37 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite44 = new gui.CsvReadWrite();
        csvReadWrite44.updateFacultyNotifications("");
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        boolean boolean58 = csvReadWrite44.registerUser("", "", false, "hi!", "", false, strList56);
        boolean boolean59 = csvReadWrite37.registerUser("", "", false, "hi!", "", true, strList56);
        gui.CsvReadWrite csvReadWrite66 = new gui.CsvReadWrite();
        csvReadWrite66.updateFacultyNotifications("");
        csvReadWrite66.verifyUser("");
        csvReadWrite66.verifyUser("");
        java.util.List<gui.User> userList73 = csvReadWrite66.getUnverifiedUsers();
        gui.User user76 = csvReadWrite66.loginUser("hi!", "");
        java.lang.String[] strArray84 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        boolean boolean87 = csvReadWrite66.registerUser("", "hi!", false, "", "", true, strList85);
        boolean boolean88 = csvReadWrite37.registerUser("", "hi!", true, "", "", false, strList85);
        boolean boolean89 = csvReadWrite25.registerUser("hi!", "", true, "hi!", "", false, strList85);
        boolean boolean90 = csvReadWrite0.registerUser("hi!", "", true, "", "", true, strList85);
        java.lang.Class<?> wildcardClass91 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(userList73);
        org.junit.Assert.assertNotNull(user76);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        gui.User user24 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite31 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite38 = new gui.CsvReadWrite();
        csvReadWrite38.updateFacultyNotifications("");
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        boolean boolean52 = csvReadWrite38.registerUser("", "", false, "hi!", "", false, strList50);
        boolean boolean53 = csvReadWrite31.registerUser("", "", false, "hi!", "", true, strList50);
        java.util.List<gui.User> userList54 = csvReadWrite31.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList61 = null;
        boolean boolean62 = csvReadWrite31.registerUser("hi!", "hi!", false, "", "hi!", false, strList61);
        gui.CsvReadWrite csvReadWrite69 = new gui.CsvReadWrite();
        csvReadWrite69.updateFacultyNotifications("");
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        boolean boolean83 = csvReadWrite69.registerUser("", "", false, "hi!", "", false, strList81);
        boolean boolean84 = csvReadWrite31.registerUser("hi!", "hi!", true, "", "", false, strList81);
        boolean boolean85 = csvReadWrite0.registerUser("", "", false, "", "hi!", true, strList81);
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass88 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(userList54);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite27 = new gui.CsvReadWrite();
        csvReadWrite27.updateFacultyNotifications("");
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        boolean boolean41 = csvReadWrite27.registerUser("", "", false, "hi!", "", false, strList39);
        boolean boolean42 = csvReadWrite20.registerUser("", "", false, "hi!", "", true, strList39);
        gui.CsvReadWrite csvReadWrite49 = new gui.CsvReadWrite();
        csvReadWrite49.updateFacultyNotifications("");
        csvReadWrite49.verifyUser("");
        csvReadWrite49.verifyUser("");
        java.util.List<gui.User> userList56 = csvReadWrite49.getUnverifiedUsers();
        gui.User user59 = csvReadWrite49.loginUser("hi!", "");
        java.lang.String[] strArray67 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        boolean boolean70 = csvReadWrite49.registerUser("", "hi!", false, "", "", true, strList68);
        boolean boolean71 = csvReadWrite20.registerUser("", "hi!", true, "", "", false, strList68);
        boolean boolean72 = csvReadWrite0.registerUser("hi!", "", true, "hi!", "", false, strList68);
        csvReadWrite0.verifyUser("");
        gui.User user77 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass78 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(userList56);
        org.junit.Assert.assertNotNull(user59);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(user77);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        boolean boolean42 = csvReadWrite28.registerUser("", "", false, "hi!", "", false, strList40);
        boolean boolean43 = csvReadWrite0.registerUser("hi!", "", false, "", "hi!", true, strList40);
        java.util.List<gui.User> userList44 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass45 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(userList44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList19 = csvReadWrite0.getUnverifiedUsers();
        gui.User user22 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList24 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user15 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass17 = userList16.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass16 = userList15.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass13 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.User user3 = csvReadWrite0.loginUser("", "hi!");
        gui.CsvReadWrite csvReadWrite10 = new gui.CsvReadWrite();
        csvReadWrite10.updateFacultyNotifications("");
        csvReadWrite10.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite21 = new gui.CsvReadWrite();
        csvReadWrite21.updateFacultyNotifications("");
        csvReadWrite21.verifyUser("");
        csvReadWrite21.verifyUser("");
        java.util.List<gui.User> userList28 = csvReadWrite21.getUnverifiedUsers();
        gui.User user31 = csvReadWrite21.loginUser("hi!", "");
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        boolean boolean42 = csvReadWrite21.registerUser("", "hi!", false, "", "", true, strList40);
        gui.CsvReadWrite csvReadWrite49 = new gui.CsvReadWrite();
        csvReadWrite49.updateFacultyNotifications("");
        csvReadWrite49.verifyUser("");
        csvReadWrite49.verifyUser("");
        java.util.List<gui.User> userList56 = csvReadWrite49.getUnverifiedUsers();
        gui.User user59 = csvReadWrite49.loginUser("hi!", "");
        java.lang.String[] strArray67 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        boolean boolean70 = csvReadWrite49.registerUser("", "hi!", false, "", "", true, strList68);
        boolean boolean71 = csvReadWrite21.registerUser("hi!", "hi!", false, "hi!", "", false, strList68);
        boolean boolean72 = csvReadWrite10.registerUser("hi!", "", true, "", "hi!", false, strList68);
        boolean boolean73 = csvReadWrite0.registerUser("", "", false, "", "", false, strList68);
        java.lang.Class<?> wildcardClass74 = strList68.getClass();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(userList56);
        org.junit.Assert.assertNotNull(user59);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user23 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(user23);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList24 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass25 = userList24.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite15 = new gui.CsvReadWrite();
        csvReadWrite15.updateFacultyNotifications("");
        csvReadWrite15.verifyUser("");
        csvReadWrite15.updateFacultyNotifications("");
        gui.User user24 = csvReadWrite15.loginUser("", "hi!");
        java.util.List<gui.User> userList25 = csvReadWrite15.getUnverifiedUsers();
        gui.User user28 = csvReadWrite15.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite35 = new gui.CsvReadWrite();
        csvReadWrite35.updateFacultyNotifications("");
        csvReadWrite35.verifyUser("");
        csvReadWrite35.verifyUser("");
        gui.CsvReadWrite csvReadWrite48 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite55 = new gui.CsvReadWrite();
        csvReadWrite55.updateFacultyNotifications("");
        csvReadWrite55.verifyUser("");
        csvReadWrite55.verifyUser("");
        java.util.List<gui.User> userList62 = csvReadWrite55.getUnverifiedUsers();
        gui.User user65 = csvReadWrite55.loginUser("hi!", "");
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        boolean boolean76 = csvReadWrite55.registerUser("", "hi!", false, "", "", true, strList74);
        boolean boolean77 = csvReadWrite48.registerUser("hi!", "", true, "", "hi!", true, strList74);
        boolean boolean78 = csvReadWrite35.registerUser("", "", false, "hi!", "", false, strList74);
        boolean boolean79 = csvReadWrite15.registerUser("hi!", "", false, "", "hi!", true, strList74);
        boolean boolean80 = csvReadWrite0.registerUser("", "", false, "hi!", "hi!", false, strList74);
        gui.User user83 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList84 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass85 = userList84.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(user65);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(user83);
        org.junit.Assert.assertNotNull(userList84);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        csvReadWrite28.verifyUser("");
        csvReadWrite28.verifyUser("");
        java.util.List<gui.User> userList35 = csvReadWrite28.getUnverifiedUsers();
        gui.User user38 = csvReadWrite28.loginUser("hi!", "");
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        boolean boolean49 = csvReadWrite28.registerUser("", "hi!", false, "", "", true, strList47);
        boolean boolean50 = csvReadWrite0.registerUser("hi!", "hi!", false, "hi!", "", false, strList47);
        gui.User user53 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList54 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList55 = csvReadWrite0.getUnverifiedUsers();
        gui.User user58 = csvReadWrite0.loginUser("", "hi!");
        java.util.ArrayList<java.lang.String> strList65 = null;
        boolean boolean66 = csvReadWrite0.registerUser("hi!", "", true, "", "hi!", true, strList65);
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList69 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass70 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(user53);
        org.junit.Assert.assertNotNull(userList54);
        org.junit.Assert.assertNotNull(userList55);
        org.junit.Assert.assertNotNull(user58);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(userList69);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite8 = new gui.CsvReadWrite();
        csvReadWrite8.updateFacultyNotifications("");
        csvReadWrite8.verifyUser("");
        csvReadWrite8.verifyUser("");
        java.util.List<gui.User> userList15 = csvReadWrite8.getUnverifiedUsers();
        gui.User user18 = csvReadWrite8.loginUser("hi!", "hi!");
        csvReadWrite8.updateFacultyNotifications("");
        gui.User user23 = csvReadWrite8.loginUser("hi!", "hi!");
        gui.User user26 = csvReadWrite8.loginUser("", "hi!");
        gui.User user29 = csvReadWrite8.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite36 = new gui.CsvReadWrite();
        csvReadWrite36.updateFacultyNotifications("");
        csvReadWrite36.verifyUser("");
        csvReadWrite36.verifyUser("");
        gui.CsvReadWrite csvReadWrite49 = new gui.CsvReadWrite();
        csvReadWrite49.updateFacultyNotifications("");
        csvReadWrite49.verifyUser("");
        csvReadWrite49.verifyUser("");
        gui.CsvReadWrite csvReadWrite62 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite69 = new gui.CsvReadWrite();
        csvReadWrite69.updateFacultyNotifications("");
        csvReadWrite69.verifyUser("");
        csvReadWrite69.verifyUser("");
        java.util.List<gui.User> userList76 = csvReadWrite69.getUnverifiedUsers();
        gui.User user79 = csvReadWrite69.loginUser("hi!", "");
        java.lang.String[] strArray87 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        boolean boolean90 = csvReadWrite69.registerUser("", "hi!", false, "", "", true, strList88);
        boolean boolean91 = csvReadWrite62.registerUser("hi!", "", true, "", "hi!", true, strList88);
        boolean boolean92 = csvReadWrite49.registerUser("", "", false, "hi!", "", false, strList88);
        boolean boolean93 = csvReadWrite36.registerUser("hi!", "", true, "", "", false, strList88);
        boolean boolean94 = csvReadWrite8.registerUser("hi!", "", false, "", "", false, strList88);
        boolean boolean95 = csvReadWrite0.registerUser("hi!", "", false, "", "hi!", true, strList88);
        java.lang.Class<?> wildcardClass96 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(user23);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(userList76);
        org.junit.Assert.assertNotNull(user79);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user6 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass13 = user12.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user6 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        gui.User user11 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass12 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList30 = null;
        boolean boolean31 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", false, strList30);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass38 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.User user3 = csvReadWrite0.loginUser("", "hi!");
        gui.User user6 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass8 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList30 = null;
        boolean boolean31 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", false, strList30);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass38 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList26 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        gui.CsvReadWrite csvReadWrite46 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite53 = new gui.CsvReadWrite();
        csvReadWrite53.updateFacultyNotifications("");
        csvReadWrite53.verifyUser("");
        csvReadWrite53.verifyUser("");
        java.util.List<gui.User> userList60 = csvReadWrite53.getUnverifiedUsers();
        gui.User user63 = csvReadWrite53.loginUser("hi!", "");
        java.lang.String[] strArray71 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList72 = new java.util.ArrayList<java.lang.String>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList72, strArray71);
        boolean boolean74 = csvReadWrite53.registerUser("", "hi!", false, "", "", true, strList72);
        boolean boolean75 = csvReadWrite46.registerUser("hi!", "", true, "", "hi!", true, strList72);
        boolean boolean76 = csvReadWrite33.registerUser("", "", false, "hi!", "", false, strList72);
        boolean boolean77 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "", true, strList72);
        java.lang.Class<?> wildcardClass78 = strList72.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList60);
        org.junit.Assert.assertNotNull(user63);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList17 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList18 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass19 = userList18.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.User user13 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user20 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass21 = user20.getClass();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        gui.CsvReadWrite csvReadWrite29 = new gui.CsvReadWrite();
        csvReadWrite29.updateFacultyNotifications("");
        csvReadWrite29.verifyUser("");
        csvReadWrite29.verifyUser("");
        java.util.List<gui.User> userList36 = csvReadWrite29.getUnverifiedUsers();
        gui.User user39 = csvReadWrite29.loginUser("hi!", "");
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = csvReadWrite29.registerUser("", "hi!", false, "", "", true, strList48);
        boolean boolean51 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList48);
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass54 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        gui.CsvReadWrite csvReadWrite29 = new gui.CsvReadWrite();
        csvReadWrite29.updateFacultyNotifications("");
        csvReadWrite29.verifyUser("");
        csvReadWrite29.verifyUser("");
        java.util.List<gui.User> userList36 = csvReadWrite29.getUnverifiedUsers();
        gui.User user39 = csvReadWrite29.loginUser("hi!", "");
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = csvReadWrite29.registerUser("", "hi!", false, "", "", true, strList48);
        boolean boolean51 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList48);
        java.util.List<gui.User> userList52 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList55 = csvReadWrite0.getUnverifiedUsers();
        gui.User user58 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass59 = user58.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(userList55);
        org.junit.Assert.assertNotNull(user58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user24 = csvReadWrite0.loginUser("hi!", "");
        gui.CsvReadWrite csvReadWrite31 = new gui.CsvReadWrite();
        csvReadWrite31.updateFacultyNotifications("");
        csvReadWrite31.verifyUser("");
        csvReadWrite31.updateFacultyNotifications("");
        gui.User user40 = csvReadWrite31.loginUser("", "hi!");
        java.util.List<gui.User> userList41 = csvReadWrite31.getUnverifiedUsers();
        gui.User user44 = csvReadWrite31.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite51 = new gui.CsvReadWrite();
        csvReadWrite51.updateFacultyNotifications("");
        csvReadWrite51.verifyUser("");
        csvReadWrite51.verifyUser("");
        gui.CsvReadWrite csvReadWrite64 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite71 = new gui.CsvReadWrite();
        csvReadWrite71.updateFacultyNotifications("");
        csvReadWrite71.verifyUser("");
        csvReadWrite71.verifyUser("");
        java.util.List<gui.User> userList78 = csvReadWrite71.getUnverifiedUsers();
        gui.User user81 = csvReadWrite71.loginUser("hi!", "");
        java.lang.String[] strArray89 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList90 = new java.util.ArrayList<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList90, strArray89);
        boolean boolean92 = csvReadWrite71.registerUser("", "hi!", false, "", "", true, strList90);
        boolean boolean93 = csvReadWrite64.registerUser("hi!", "", true, "", "hi!", true, strList90);
        boolean boolean94 = csvReadWrite51.registerUser("", "", false, "hi!", "", false, strList90);
        boolean boolean95 = csvReadWrite31.registerUser("hi!", "", false, "", "hi!", true, strList90);
        boolean boolean96 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList90);
        gui.User user99 = csvReadWrite0.loginUser("", "hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertNotNull(userList78);
        org.junit.Assert.assertNotNull(user81);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(user99);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.User user19 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass20 = user19.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        boolean boolean42 = csvReadWrite28.registerUser("", "", false, "hi!", "", false, strList40);
        boolean boolean43 = csvReadWrite0.registerUser("hi!", "", false, "", "hi!", true, strList40);
        gui.User user46 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList47 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass48 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass27 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList5 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass6 = userList5.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass66 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        java.util.List<gui.User> userList20 = csvReadWrite13.getUnverifiedUsers();
        gui.User user23 = csvReadWrite13.loginUser("hi!", "hi!");
        csvReadWrite13.updateFacultyNotifications("");
        gui.User user28 = csvReadWrite13.loginUser("hi!", "hi!");
        gui.User user31 = csvReadWrite13.loginUser("", "hi!");
        gui.CsvReadWrite csvReadWrite38 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList39 = csvReadWrite38.getUnverifiedUsers();
        java.util.List<gui.User> userList40 = csvReadWrite38.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite47 = new gui.CsvReadWrite();
        csvReadWrite47.updateFacultyNotifications("");
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        boolean boolean61 = csvReadWrite47.registerUser("", "", false, "hi!", "", false, strList59);
        boolean boolean62 = csvReadWrite38.registerUser("hi!", "hi!", false, "hi!", "", false, strList59);
        boolean boolean63 = csvReadWrite13.registerUser("", "", true, "", "", false, strList59);
        boolean boolean64 = csvReadWrite0.registerUser("", "hi!", false, "", "", false, strList59);
        java.lang.Class<?> wildcardClass65 = strList59.getClass();
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(user23);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass26 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        gui.User user5 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(user5);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user28 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass29 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList30 = null;
        boolean boolean31 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", false, strList30);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user38 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass39 = user38.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        gui.User user14 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite21 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        boolean boolean42 = csvReadWrite28.registerUser("", "", false, "hi!", "", false, strList40);
        boolean boolean43 = csvReadWrite21.registerUser("", "", false, "hi!", "", true, strList40);
        java.util.List<gui.User> userList44 = csvReadWrite21.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList51 = null;
        boolean boolean52 = csvReadWrite21.registerUser("hi!", "hi!", false, "", "hi!", false, strList51);
        gui.CsvReadWrite csvReadWrite59 = new gui.CsvReadWrite();
        csvReadWrite59.updateFacultyNotifications("");
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        boolean boolean73 = csvReadWrite59.registerUser("", "", false, "hi!", "", false, strList71);
        boolean boolean74 = csvReadWrite21.registerUser("hi!", "hi!", true, "", "", false, strList71);
        boolean boolean75 = csvReadWrite0.registerUser("hi!", "", true, "", "", true, strList71);
        java.lang.Class<?> wildcardClass76 = strList71.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(userList44);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        gui.CsvReadWrite csvReadWrite29 = new gui.CsvReadWrite();
        csvReadWrite29.updateFacultyNotifications("");
        csvReadWrite29.verifyUser("");
        csvReadWrite29.verifyUser("");
        java.util.List<gui.User> userList36 = csvReadWrite29.getUnverifiedUsers();
        gui.User user39 = csvReadWrite29.loginUser("hi!", "");
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = csvReadWrite29.registerUser("", "hi!", false, "", "", true, strList48);
        boolean boolean51 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList48);
        java.util.List<gui.User> userList52 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList55 = csvReadWrite0.getUnverifiedUsers();
        gui.User user58 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass59 = user58.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(userList55);
        org.junit.Assert.assertNotNull(user58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user6 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user9 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.User user13 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass14 = user13.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList19 = csvReadWrite0.getUnverifiedUsers();
        gui.User user22 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite31 = new gui.CsvReadWrite();
        csvReadWrite31.updateFacultyNotifications("");
        csvReadWrite31.verifyUser("");
        csvReadWrite31.verifyUser("");
        java.util.List<gui.User> userList38 = csvReadWrite31.getUnverifiedUsers();
        gui.User user41 = csvReadWrite31.loginUser("hi!", "hi!");
        csvReadWrite31.updateFacultyNotifications("");
        gui.User user46 = csvReadWrite31.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite53 = new gui.CsvReadWrite();
        csvReadWrite53.updateFacultyNotifications("");
        csvReadWrite53.verifyUser("");
        csvReadWrite53.updateFacultyNotifications("");
        gui.User user62 = csvReadWrite53.loginUser("", "hi!");
        java.util.List<gui.User> userList63 = csvReadWrite53.getUnverifiedUsers();
        csvReadWrite53.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite72 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite79 = new gui.CsvReadWrite();
        csvReadWrite79.updateFacultyNotifications("");
        java.lang.String[] strArray90 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList91 = new java.util.ArrayList<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList91, strArray90);
        boolean boolean93 = csvReadWrite79.registerUser("", "", false, "hi!", "", false, strList91);
        boolean boolean94 = csvReadWrite72.registerUser("", "", false, "hi!", "", true, strList91);
        boolean boolean95 = csvReadWrite53.registerUser("", "hi!", true, "", "", false, strList91);
        boolean boolean96 = csvReadWrite31.registerUser("", "hi!", false, "hi!", "hi!", false, strList91);
        boolean boolean97 = csvReadWrite0.registerUser("", "hi!", false, "", "hi!", true, strList91);
        java.lang.Class<?> wildcardClass98 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(user41);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertNotNull(user62);
        org.junit.Assert.assertNotNull(userList63);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass11 = userList10.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass27 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.verifyUser("");
        java.util.List<gui.User> userList27 = csvReadWrite20.getUnverifiedUsers();
        gui.User user30 = csvReadWrite20.loginUser("hi!", "");
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        boolean boolean41 = csvReadWrite20.registerUser("", "hi!", false, "", "", true, strList39);
        boolean boolean42 = csvReadWrite13.registerUser("hi!", "", true, "", "hi!", true, strList39);
        boolean boolean43 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList39);
        java.lang.Class<?> wildcardClass44 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("hi!", "");
        gui.CsvReadWrite csvReadWrite23 = new gui.CsvReadWrite();
        csvReadWrite23.updateFacultyNotifications("");
        csvReadWrite23.verifyUser("");
        csvReadWrite23.verifyUser("");
        java.util.List<gui.User> userList30 = csvReadWrite23.getUnverifiedUsers();
        gui.User user33 = csvReadWrite23.loginUser("hi!", "");
        java.lang.String[] strArray41 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        boolean boolean44 = csvReadWrite23.registerUser("", "hi!", false, "", "", true, strList42);
        gui.CsvReadWrite csvReadWrite51 = new gui.CsvReadWrite();
        csvReadWrite51.updateFacultyNotifications("");
        csvReadWrite51.verifyUser("");
        csvReadWrite51.verifyUser("");
        java.util.List<gui.User> userList58 = csvReadWrite51.getUnverifiedUsers();
        gui.User user61 = csvReadWrite51.loginUser("hi!", "");
        java.lang.String[] strArray69 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList70 = new java.util.ArrayList<java.lang.String>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList70, strArray69);
        boolean boolean72 = csvReadWrite51.registerUser("", "hi!", false, "", "", true, strList70);
        boolean boolean73 = csvReadWrite23.registerUser("hi!", "hi!", false, "hi!", "", false, strList70);
        boolean boolean74 = csvReadWrite0.registerUser("", "", true, "hi!", "hi!", true, strList70);
        java.util.List<gui.User> userList75 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList76 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList77 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass78 = userList77.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(user33);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(user61);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(userList75);
        org.junit.Assert.assertNotNull(userList76);
        org.junit.Assert.assertNotNull(userList77);
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList30 = null;
        boolean boolean31 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", false, strList30);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList40 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass41 = userList40.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.User user3 = csvReadWrite0.loginUser("", "hi!");
        gui.User user6 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass19 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user15 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass18 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass10 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList19 = csvReadWrite0.getUnverifiedUsers();
        gui.User user22 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite31 = new gui.CsvReadWrite();
        csvReadWrite31.updateFacultyNotifications("");
        csvReadWrite31.verifyUser("");
        csvReadWrite31.verifyUser("");
        java.util.List<gui.User> userList38 = csvReadWrite31.getUnverifiedUsers();
        gui.User user41 = csvReadWrite31.loginUser("hi!", "hi!");
        csvReadWrite31.updateFacultyNotifications("");
        gui.User user46 = csvReadWrite31.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite53 = new gui.CsvReadWrite();
        csvReadWrite53.updateFacultyNotifications("");
        csvReadWrite53.verifyUser("");
        csvReadWrite53.updateFacultyNotifications("");
        gui.User user62 = csvReadWrite53.loginUser("", "hi!");
        java.util.List<gui.User> userList63 = csvReadWrite53.getUnverifiedUsers();
        csvReadWrite53.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite72 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite79 = new gui.CsvReadWrite();
        csvReadWrite79.updateFacultyNotifications("");
        java.lang.String[] strArray90 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList91 = new java.util.ArrayList<java.lang.String>();
        boolean boolean92 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList91, strArray90);
        boolean boolean93 = csvReadWrite79.registerUser("", "", false, "hi!", "", false, strList91);
        boolean boolean94 = csvReadWrite72.registerUser("", "", false, "hi!", "", true, strList91);
        boolean boolean95 = csvReadWrite53.registerUser("", "hi!", true, "", "", false, strList91);
        boolean boolean96 = csvReadWrite31.registerUser("", "hi!", false, "hi!", "hi!", false, strList91);
        boolean boolean97 = csvReadWrite0.registerUser("", "hi!", false, "", "hi!", true, strList91);
        java.util.List<gui.User> userList98 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList99 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(user41);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertNotNull(user62);
        org.junit.Assert.assertNotNull(userList63);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + true + "'", boolean92 == true);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(userList98);
        org.junit.Assert.assertNotNull(userList99);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.updateFacultyNotifications("");
        gui.User user29 = csvReadWrite20.loginUser("", "hi!");
        java.util.List<gui.User> userList30 = csvReadWrite20.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite37 = new gui.CsvReadWrite();
        csvReadWrite37.updateFacultyNotifications("");
        csvReadWrite37.verifyUser("");
        csvReadWrite37.updateFacultyNotifications("");
        gui.User user46 = csvReadWrite37.loginUser("", "hi!");
        java.util.List<gui.User> userList47 = csvReadWrite37.getUnverifiedUsers();
        csvReadWrite37.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite56 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite63 = new gui.CsvReadWrite();
        csvReadWrite63.updateFacultyNotifications("");
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        boolean boolean77 = csvReadWrite63.registerUser("", "", false, "hi!", "", false, strList75);
        boolean boolean78 = csvReadWrite56.registerUser("", "", false, "hi!", "", true, strList75);
        boolean boolean79 = csvReadWrite37.registerUser("", "hi!", true, "", "", false, strList75);
        boolean boolean80 = csvReadWrite20.registerUser("hi!", "", true, "hi!", "hi!", true, strList75);
        boolean boolean81 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList75);
        gui.User user84 = csvReadWrite0.loginUser("", "hi!");
        gui.User user87 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(user84);
        org.junit.Assert.assertNotNull(user87);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user13 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass14 = user13.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass9 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.updateFacultyNotifications("");
        gui.User user29 = csvReadWrite20.loginUser("", "hi!");
        java.util.List<gui.User> userList30 = csvReadWrite20.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite37 = new gui.CsvReadWrite();
        csvReadWrite37.updateFacultyNotifications("");
        csvReadWrite37.verifyUser("");
        csvReadWrite37.updateFacultyNotifications("");
        gui.User user46 = csvReadWrite37.loginUser("", "hi!");
        java.util.List<gui.User> userList47 = csvReadWrite37.getUnverifiedUsers();
        csvReadWrite37.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite56 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite63 = new gui.CsvReadWrite();
        csvReadWrite63.updateFacultyNotifications("");
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        boolean boolean77 = csvReadWrite63.registerUser("", "", false, "hi!", "", false, strList75);
        boolean boolean78 = csvReadWrite56.registerUser("", "", false, "hi!", "", true, strList75);
        boolean boolean79 = csvReadWrite37.registerUser("", "hi!", true, "", "", false, strList75);
        boolean boolean80 = csvReadWrite20.registerUser("hi!", "", true, "hi!", "hi!", true, strList75);
        boolean boolean81 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList75);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user88 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList89 = csvReadWrite0.getUnverifiedUsers();
        gui.User user92 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass93 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(user88);
        org.junit.Assert.assertNotNull(userList89);
        org.junit.Assert.assertNotNull(user92);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        gui.CsvReadWrite csvReadWrite25 = new gui.CsvReadWrite();
        csvReadWrite25.updateFacultyNotifications("");
        csvReadWrite25.verifyUser("");
        csvReadWrite25.verifyUser("");
        java.util.List<gui.User> userList32 = csvReadWrite25.getUnverifiedUsers();
        gui.User user35 = csvReadWrite25.loginUser("hi!", "");
        gui.User user38 = csvReadWrite25.loginUser("", "");
        gui.User user41 = csvReadWrite25.loginUser("", "");
        gui.User user44 = csvReadWrite25.loginUser("", "");
        csvReadWrite25.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite53 = new gui.CsvReadWrite();
        csvReadWrite53.updateFacultyNotifications("");
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        boolean boolean67 = csvReadWrite53.registerUser("", "", false, "hi!", "", false, strList65);
        boolean boolean68 = csvReadWrite25.registerUser("hi!", "", false, "", "hi!", true, strList65);
        boolean boolean69 = csvReadWrite0.registerUser("", "", false, "", "hi!", false, strList65);
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass72 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(user35);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(user41);
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user24 = csvReadWrite0.loginUser("hi!", "");
        gui.User user27 = csvReadWrite0.loginUser("", "hi!");
        gui.CsvReadWrite csvReadWrite34 = new gui.CsvReadWrite();
        csvReadWrite34.updateFacultyNotifications("");
        csvReadWrite34.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite45 = new gui.CsvReadWrite();
        csvReadWrite45.updateFacultyNotifications("");
        csvReadWrite45.verifyUser("");
        csvReadWrite45.verifyUser("");
        java.util.List<gui.User> userList52 = csvReadWrite45.getUnverifiedUsers();
        gui.User user55 = csvReadWrite45.loginUser("hi!", "");
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        boolean boolean66 = csvReadWrite45.registerUser("", "hi!", false, "", "", true, strList64);
        gui.CsvReadWrite csvReadWrite73 = new gui.CsvReadWrite();
        csvReadWrite73.updateFacultyNotifications("");
        csvReadWrite73.verifyUser("");
        csvReadWrite73.verifyUser("");
        java.util.List<gui.User> userList80 = csvReadWrite73.getUnverifiedUsers();
        gui.User user83 = csvReadWrite73.loginUser("hi!", "");
        java.lang.String[] strArray91 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList92 = new java.util.ArrayList<java.lang.String>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList92, strArray91);
        boolean boolean94 = csvReadWrite73.registerUser("", "hi!", false, "", "", true, strList92);
        boolean boolean95 = csvReadWrite45.registerUser("hi!", "hi!", false, "hi!", "", false, strList92);
        boolean boolean96 = csvReadWrite34.registerUser("hi!", "", true, "", "hi!", false, strList92);
        boolean boolean97 = csvReadWrite0.registerUser("hi!", "hi!", true, "hi!", "", true, strList92);
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(user55);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(userList80);
        org.junit.Assert.assertNotNull(user83);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass19 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass11 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite15 = new gui.CsvReadWrite();
        csvReadWrite15.updateFacultyNotifications("");
        csvReadWrite15.verifyUser("");
        csvReadWrite15.updateFacultyNotifications("");
        gui.User user24 = csvReadWrite15.loginUser("", "hi!");
        java.util.List<gui.User> userList25 = csvReadWrite15.getUnverifiedUsers();
        gui.User user28 = csvReadWrite15.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite35 = new gui.CsvReadWrite();
        csvReadWrite35.updateFacultyNotifications("");
        csvReadWrite35.verifyUser("");
        csvReadWrite35.verifyUser("");
        gui.CsvReadWrite csvReadWrite48 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite55 = new gui.CsvReadWrite();
        csvReadWrite55.updateFacultyNotifications("");
        csvReadWrite55.verifyUser("");
        csvReadWrite55.verifyUser("");
        java.util.List<gui.User> userList62 = csvReadWrite55.getUnverifiedUsers();
        gui.User user65 = csvReadWrite55.loginUser("hi!", "");
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        boolean boolean76 = csvReadWrite55.registerUser("", "hi!", false, "", "", true, strList74);
        boolean boolean77 = csvReadWrite48.registerUser("hi!", "", true, "", "hi!", true, strList74);
        boolean boolean78 = csvReadWrite35.registerUser("", "", false, "hi!", "", false, strList74);
        boolean boolean79 = csvReadWrite15.registerUser("hi!", "", false, "", "hi!", true, strList74);
        boolean boolean80 = csvReadWrite0.registerUser("", "", false, "hi!", "hi!", false, strList74);
        java.lang.Class<?> wildcardClass81 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(user65);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite9 = new gui.CsvReadWrite();
        csvReadWrite9.updateFacultyNotifications("");
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        boolean boolean23 = csvReadWrite9.registerUser("", "", false, "hi!", "", false, strList21);
        boolean boolean24 = csvReadWrite0.registerUser("hi!", "hi!", false, "hi!", "", false, strList21);
        java.lang.Class<?> wildcardClass25 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        gui.User user28 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user31 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        gui.User user38 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass39 = user38.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user20 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user25 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass26 = user25.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite16 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite23 = new gui.CsvReadWrite();
        csvReadWrite23.updateFacultyNotifications("");
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList35 = new java.util.ArrayList<java.lang.String>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList35, strArray34);
        boolean boolean37 = csvReadWrite23.registerUser("", "", false, "hi!", "", false, strList35);
        boolean boolean38 = csvReadWrite16.registerUser("", "", false, "hi!", "", true, strList35);
        java.util.List<gui.User> userList39 = csvReadWrite16.getUnverifiedUsers();
        csvReadWrite16.updateFacultyNotifications("");
        java.util.List<gui.User> userList42 = csvReadWrite16.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite49 = new gui.CsvReadWrite();
        csvReadWrite49.updateFacultyNotifications("");
        csvReadWrite49.verifyUser("");
        csvReadWrite49.verifyUser("");
        java.util.List<gui.User> userList56 = csvReadWrite49.getUnverifiedUsers();
        gui.User user59 = csvReadWrite49.loginUser("hi!", "");
        gui.User user62 = csvReadWrite49.loginUser("", "");
        gui.User user65 = csvReadWrite49.loginUser("", "");
        gui.User user68 = csvReadWrite49.loginUser("", "");
        csvReadWrite49.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite77 = new gui.CsvReadWrite();
        csvReadWrite77.updateFacultyNotifications("");
        java.lang.String[] strArray88 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList89 = new java.util.ArrayList<java.lang.String>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList89, strArray88);
        boolean boolean91 = csvReadWrite77.registerUser("", "", false, "hi!", "", false, strList89);
        boolean boolean92 = csvReadWrite49.registerUser("hi!", "", false, "", "hi!", true, strList89);
        boolean boolean93 = csvReadWrite16.registerUser("", "", false, "hi!", "hi!", true, strList89);
        boolean boolean94 = csvReadWrite0.registerUser("", "", false, "hi!", "hi!", false, strList89);
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(userList56);
        org.junit.Assert.assertNotNull(user59);
        org.junit.Assert.assertNotNull(user62);
        org.junit.Assert.assertNotNull(user65);
        org.junit.Assert.assertNotNull(user68);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user26 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user29 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass30 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.verifyUser("");
        java.util.List<gui.User> userList27 = csvReadWrite20.getUnverifiedUsers();
        gui.User user30 = csvReadWrite20.loginUser("hi!", "");
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        boolean boolean41 = csvReadWrite20.registerUser("", "hi!", false, "", "", true, strList39);
        boolean boolean42 = csvReadWrite13.registerUser("hi!", "", true, "", "hi!", true, strList39);
        boolean boolean43 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList39);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("hi!", "hi!", true, "", "", true, strList19);
        java.lang.Class<?> wildcardClass22 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList30 = null;
        boolean boolean31 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", false, strList30);
        gui.CsvReadWrite csvReadWrite38 = new gui.CsvReadWrite();
        csvReadWrite38.updateFacultyNotifications("");
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        boolean boolean52 = csvReadWrite38.registerUser("", "", false, "hi!", "", false, strList50);
        boolean boolean53 = csvReadWrite0.registerUser("hi!", "hi!", true, "", "", false, strList50);
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass56 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        gui.User user14 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass15 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList20 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass21 = userList20.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass7 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass9 = userList8.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user24 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass25 = user24.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass68 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList20 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite27 = new gui.CsvReadWrite();
        csvReadWrite27.updateFacultyNotifications("");
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        boolean boolean41 = csvReadWrite27.registerUser("", "", false, "hi!", "", false, strList39);
        java.util.List<gui.User> userList42 = csvReadWrite27.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite49 = new gui.CsvReadWrite();
        csvReadWrite49.updateFacultyNotifications("");
        csvReadWrite49.verifyUser("");
        csvReadWrite49.verifyUser("");
        gui.CsvReadWrite csvReadWrite62 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite69 = new gui.CsvReadWrite();
        csvReadWrite69.updateFacultyNotifications("");
        csvReadWrite69.verifyUser("");
        csvReadWrite69.verifyUser("");
        java.util.List<gui.User> userList76 = csvReadWrite69.getUnverifiedUsers();
        gui.User user79 = csvReadWrite69.loginUser("hi!", "");
        java.lang.String[] strArray87 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        boolean boolean90 = csvReadWrite69.registerUser("", "hi!", false, "", "", true, strList88);
        boolean boolean91 = csvReadWrite62.registerUser("hi!", "", true, "", "hi!", true, strList88);
        boolean boolean92 = csvReadWrite49.registerUser("", "", false, "hi!", "", false, strList88);
        boolean boolean93 = csvReadWrite27.registerUser("", "hi!", true, "hi!", "", true, strList88);
        boolean boolean94 = csvReadWrite0.registerUser("hi!", "", true, "", "", true, strList88);
        java.lang.Class<?> wildcardClass95 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(userList76);
        org.junit.Assert.assertNotNull(user79);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        boolean boolean42 = csvReadWrite28.registerUser("", "", false, "hi!", "", false, strList40);
        boolean boolean43 = csvReadWrite0.registerUser("hi!", "", false, "", "hi!", true, strList40);
        gui.User user46 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user51 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList52 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertNotNull(user51);
        org.junit.Assert.assertNotNull(userList52);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        gui.User user17 = csvReadWrite0.loginUser("", "hi!");
        gui.CsvReadWrite csvReadWrite24 = new gui.CsvReadWrite();
        csvReadWrite24.updateFacultyNotifications("");
        csvReadWrite24.verifyUser("");
        csvReadWrite24.verifyUser("");
        java.util.List<gui.User> userList31 = csvReadWrite24.getUnverifiedUsers();
        gui.User user34 = csvReadWrite24.loginUser("hi!", "hi!");
        csvReadWrite24.updateFacultyNotifications("");
        gui.User user39 = csvReadWrite24.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite46 = new gui.CsvReadWrite();
        csvReadWrite46.updateFacultyNotifications("");
        csvReadWrite46.verifyUser("");
        csvReadWrite46.updateFacultyNotifications("");
        gui.User user55 = csvReadWrite46.loginUser("", "hi!");
        java.util.List<gui.User> userList56 = csvReadWrite46.getUnverifiedUsers();
        csvReadWrite46.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite65 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite72 = new gui.CsvReadWrite();
        csvReadWrite72.updateFacultyNotifications("");
        java.lang.String[] strArray83 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        boolean boolean86 = csvReadWrite72.registerUser("", "", false, "hi!", "", false, strList84);
        boolean boolean87 = csvReadWrite65.registerUser("", "", false, "hi!", "", true, strList84);
        boolean boolean88 = csvReadWrite46.registerUser("", "hi!", true, "", "", false, strList84);
        boolean boolean89 = csvReadWrite24.registerUser("", "hi!", false, "hi!", "hi!", false, strList84);
        boolean boolean90 = csvReadWrite0.registerUser("hi!", "hi!", false, "hi!", "hi!", false, strList84);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(user17);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(user34);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(user55);
        org.junit.Assert.assertNotNull(userList56);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user15 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        gui.User user20 = csvReadWrite0.loginUser("", "hi!");
        gui.User user23 = csvReadWrite0.loginUser("", "");
        gui.User user26 = csvReadWrite0.loginUser("hi!", "hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(user23);
        org.junit.Assert.assertNotNull(user26);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.verifyUser("hi!");
        gui.CsvReadWrite csvReadWrite30 = new gui.CsvReadWrite();
        csvReadWrite30.updateFacultyNotifications("");
        csvReadWrite30.verifyUser("");
        csvReadWrite30.verifyUser("");
        java.util.List<gui.User> userList37 = csvReadWrite30.getUnverifiedUsers();
        gui.User user40 = csvReadWrite30.loginUser("hi!", "hi!");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        boolean boolean51 = csvReadWrite30.registerUser("hi!", "hi!", true, "", "", true, strList49);
        boolean boolean52 = csvReadWrite0.registerUser("", "", true, "hi!", "", false, strList49);
        csvReadWrite0.updateFacultyNotifications("");
        java.util.ArrayList<java.lang.String> strList61 = null;
        boolean boolean62 = csvReadWrite0.registerUser("", "hi!", false, "hi!", "", true, strList61);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user20 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite27 = new gui.CsvReadWrite();
        csvReadWrite27.updateFacultyNotifications("");
        csvReadWrite27.verifyUser("");
        csvReadWrite27.updateFacultyNotifications("");
        gui.User user36 = csvReadWrite27.loginUser("", "hi!");
        java.util.List<gui.User> userList37 = csvReadWrite27.getUnverifiedUsers();
        gui.User user40 = csvReadWrite27.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite47 = new gui.CsvReadWrite();
        csvReadWrite47.updateFacultyNotifications("");
        csvReadWrite47.verifyUser("");
        csvReadWrite47.verifyUser("");
        gui.CsvReadWrite csvReadWrite60 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite67 = new gui.CsvReadWrite();
        csvReadWrite67.updateFacultyNotifications("");
        csvReadWrite67.verifyUser("");
        csvReadWrite67.verifyUser("");
        java.util.List<gui.User> userList74 = csvReadWrite67.getUnverifiedUsers();
        gui.User user77 = csvReadWrite67.loginUser("hi!", "");
        java.lang.String[] strArray85 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        boolean boolean88 = csvReadWrite67.registerUser("", "hi!", false, "", "", true, strList86);
        boolean boolean89 = csvReadWrite60.registerUser("hi!", "", true, "", "hi!", true, strList86);
        boolean boolean90 = csvReadWrite47.registerUser("", "", false, "hi!", "", false, strList86);
        boolean boolean91 = csvReadWrite27.registerUser("hi!", "", false, "", "hi!", true, strList86);
        boolean boolean92 = csvReadWrite0.registerUser("hi!", "", false, "", "hi!", true, strList86);
        gui.User user95 = csvReadWrite0.loginUser("", "");
        gui.User user98 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass99 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(user36);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(userList74);
        org.junit.Assert.assertNotNull(user77);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(user95);
        org.junit.Assert.assertNotNull(user98);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        csvReadWrite7.verifyUser("");
        csvReadWrite7.verifyUser("");
        java.util.List<gui.User> userList14 = csvReadWrite7.getUnverifiedUsers();
        gui.User user17 = csvReadWrite7.loginUser("hi!", "");
        java.lang.String[] strArray25 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList26 = new java.util.ArrayList<java.lang.String>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList26, strArray25);
        boolean boolean28 = csvReadWrite7.registerUser("", "hi!", false, "", "", true, strList26);
        boolean boolean29 = csvReadWrite0.registerUser("hi!", "", true, "", "hi!", true, strList26);
        csvReadWrite0.verifyUser("");
        gui.User user34 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass35 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(user17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(user34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user15 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        gui.User user20 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user27 = csvReadWrite0.loginUser("", "");
        gui.User user30 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass33 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList20 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite27 = new gui.CsvReadWrite();
        csvReadWrite27.updateFacultyNotifications("");
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        boolean boolean41 = csvReadWrite27.registerUser("", "", false, "hi!", "", false, strList39);
        java.util.List<gui.User> userList42 = csvReadWrite27.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite49 = new gui.CsvReadWrite();
        csvReadWrite49.updateFacultyNotifications("");
        csvReadWrite49.verifyUser("");
        csvReadWrite49.verifyUser("");
        gui.CsvReadWrite csvReadWrite62 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite69 = new gui.CsvReadWrite();
        csvReadWrite69.updateFacultyNotifications("");
        csvReadWrite69.verifyUser("");
        csvReadWrite69.verifyUser("");
        java.util.List<gui.User> userList76 = csvReadWrite69.getUnverifiedUsers();
        gui.User user79 = csvReadWrite69.loginUser("hi!", "");
        java.lang.String[] strArray87 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList88 = new java.util.ArrayList<java.lang.String>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList88, strArray87);
        boolean boolean90 = csvReadWrite69.registerUser("", "hi!", false, "", "", true, strList88);
        boolean boolean91 = csvReadWrite62.registerUser("hi!", "", true, "", "hi!", true, strList88);
        boolean boolean92 = csvReadWrite49.registerUser("", "", false, "hi!", "", false, strList88);
        boolean boolean93 = csvReadWrite27.registerUser("", "hi!", true, "hi!", "", true, strList88);
        boolean boolean94 = csvReadWrite0.registerUser("hi!", "", true, "", "", true, strList88);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList99 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(userList76);
        org.junit.Assert.assertNotNull(user79);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(userList99);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList64 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass65 = userList64.getClass();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(userList64);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass24 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user11 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite18 = new gui.CsvReadWrite();
        csvReadWrite18.updateFacultyNotifications("");
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        boolean boolean32 = csvReadWrite18.registerUser("", "", false, "hi!", "", false, strList30);
        csvReadWrite18.updateFacultyNotifications("");
        java.util.List<gui.User> userList35 = csvReadWrite18.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite42 = new gui.CsvReadWrite();
        csvReadWrite42.updateFacultyNotifications("");
        csvReadWrite42.verifyUser("");
        csvReadWrite42.verifyUser("");
        gui.CsvReadWrite csvReadWrite55 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite62 = new gui.CsvReadWrite();
        csvReadWrite62.updateFacultyNotifications("");
        csvReadWrite62.verifyUser("");
        csvReadWrite62.verifyUser("");
        java.util.List<gui.User> userList69 = csvReadWrite62.getUnverifiedUsers();
        gui.User user72 = csvReadWrite62.loginUser("hi!", "");
        java.lang.String[] strArray80 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        boolean boolean83 = csvReadWrite62.registerUser("", "hi!", false, "", "", true, strList81);
        boolean boolean84 = csvReadWrite55.registerUser("hi!", "", true, "", "hi!", true, strList81);
        boolean boolean85 = csvReadWrite42.registerUser("", "", false, "hi!", "", false, strList81);
        boolean boolean86 = csvReadWrite18.registerUser("hi!", "", true, "", "hi!", true, strList81);
        boolean boolean87 = csvReadWrite0.registerUser("hi!", "hi!", true, "", "", true, strList81);
        csvReadWrite0.verifyUser("hi!");
        gui.User user92 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass93 = user92.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userList69);
        org.junit.Assert.assertNotNull(user72);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(user92);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        gui.User user28 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user31 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        gui.User user38 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList39 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass40 = userList39.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite25 = new gui.CsvReadWrite();
        csvReadWrite25.updateFacultyNotifications("");
        csvReadWrite25.verifyUser("");
        csvReadWrite25.verifyUser("");
        java.util.List<gui.User> userList32 = csvReadWrite25.getUnverifiedUsers();
        gui.User user35 = csvReadWrite25.loginUser("hi!", "");
        gui.User user38 = csvReadWrite25.loginUser("", "");
        gui.CsvReadWrite csvReadWrite45 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite52 = new gui.CsvReadWrite();
        csvReadWrite52.updateFacultyNotifications("");
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        boolean boolean66 = csvReadWrite52.registerUser("", "", false, "hi!", "", false, strList64);
        boolean boolean67 = csvReadWrite45.registerUser("", "", false, "hi!", "", true, strList64);
        gui.CsvReadWrite csvReadWrite74 = new gui.CsvReadWrite();
        csvReadWrite74.updateFacultyNotifications("");
        csvReadWrite74.verifyUser("");
        csvReadWrite74.verifyUser("");
        java.util.List<gui.User> userList81 = csvReadWrite74.getUnverifiedUsers();
        gui.User user84 = csvReadWrite74.loginUser("hi!", "");
        java.lang.String[] strArray92 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList93 = new java.util.ArrayList<java.lang.String>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList93, strArray92);
        boolean boolean95 = csvReadWrite74.registerUser("", "hi!", false, "", "", true, strList93);
        boolean boolean96 = csvReadWrite45.registerUser("", "hi!", true, "", "", false, strList93);
        boolean boolean97 = csvReadWrite25.registerUser("hi!", "", true, "hi!", "", false, strList93);
        boolean boolean98 = csvReadWrite0.registerUser("", "", false, "hi!", "hi!", true, strList93);
        java.util.List<gui.User> userList99 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(user35);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(userList81);
        org.junit.Assert.assertNotNull(user84);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(userList99);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList22 = csvReadWrite0.getUnverifiedUsers();
        gui.User user25 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass26 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.User user3 = csvReadWrite0.loginUser("", "hi!");
        gui.User user6 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass9 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass19 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList20 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite14 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite21 = new gui.CsvReadWrite();
        csvReadWrite21.updateFacultyNotifications("");
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        boolean boolean35 = csvReadWrite21.registerUser("", "", false, "hi!", "", false, strList33);
        boolean boolean36 = csvReadWrite14.registerUser("", "", false, "hi!", "", true, strList33);
        boolean boolean37 = csvReadWrite0.registerUser("", "", false, "", "hi!", false, strList33);
        java.lang.Class<?> wildcardClass38 = strList33.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("hi!");
        gui.User user21 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass22 = user21.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user6 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("", "hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        boolean boolean42 = csvReadWrite28.registerUser("", "", false, "hi!", "", false, strList40);
        boolean boolean43 = csvReadWrite0.registerUser("hi!", "", false, "", "hi!", true, strList40);
        java.util.List<gui.User> userList44 = csvReadWrite0.getUnverifiedUsers();
        gui.User user47 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass48 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(userList44);
        org.junit.Assert.assertNotNull(user47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user11 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList14 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(userList14);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.updateFacultyNotifications("");
        gui.User user29 = csvReadWrite20.loginUser("", "hi!");
        java.util.List<gui.User> userList30 = csvReadWrite20.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite37 = new gui.CsvReadWrite();
        csvReadWrite37.updateFacultyNotifications("");
        csvReadWrite37.verifyUser("");
        csvReadWrite37.updateFacultyNotifications("");
        gui.User user46 = csvReadWrite37.loginUser("", "hi!");
        java.util.List<gui.User> userList47 = csvReadWrite37.getUnverifiedUsers();
        csvReadWrite37.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite56 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite63 = new gui.CsvReadWrite();
        csvReadWrite63.updateFacultyNotifications("");
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        boolean boolean77 = csvReadWrite63.registerUser("", "", false, "hi!", "", false, strList75);
        boolean boolean78 = csvReadWrite56.registerUser("", "", false, "hi!", "", true, strList75);
        boolean boolean79 = csvReadWrite37.registerUser("", "hi!", true, "", "", false, strList75);
        boolean boolean80 = csvReadWrite20.registerUser("hi!", "", true, "hi!", "hi!", true, strList75);
        boolean boolean81 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList75);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user88 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList89 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList92 = csvReadWrite0.getUnverifiedUsers();
        gui.User user95 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList96 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass97 = userList96.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(user88);
        org.junit.Assert.assertNotNull(userList89);
        org.junit.Assert.assertNotNull(userList92);
        org.junit.Assert.assertNotNull(user95);
        org.junit.Assert.assertNotNull(userList96);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        gui.CsvReadWrite csvReadWrite29 = new gui.CsvReadWrite();
        csvReadWrite29.updateFacultyNotifications("");
        csvReadWrite29.verifyUser("");
        csvReadWrite29.verifyUser("");
        java.util.List<gui.User> userList36 = csvReadWrite29.getUnverifiedUsers();
        gui.User user39 = csvReadWrite29.loginUser("hi!", "");
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = csvReadWrite29.registerUser("", "hi!", false, "", "", true, strList48);
        boolean boolean51 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList48);
        java.util.List<gui.User> userList52 = csvReadWrite0.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList59 = null;
        boolean boolean60 = csvReadWrite0.registerUser("", "", true, "hi!", "", true, strList59);
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList63 = csvReadWrite0.getUnverifiedUsers();
        gui.User user66 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass67 = user66.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(userList63);
        org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite17 = new gui.CsvReadWrite();
        csvReadWrite17.updateFacultyNotifications("");
        csvReadWrite17.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        csvReadWrite28.verifyUser("");
        csvReadWrite28.verifyUser("");
        java.util.List<gui.User> userList35 = csvReadWrite28.getUnverifiedUsers();
        gui.User user38 = csvReadWrite28.loginUser("hi!", "");
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        boolean boolean49 = csvReadWrite28.registerUser("", "hi!", false, "", "", true, strList47);
        gui.CsvReadWrite csvReadWrite56 = new gui.CsvReadWrite();
        csvReadWrite56.updateFacultyNotifications("");
        csvReadWrite56.verifyUser("");
        csvReadWrite56.verifyUser("");
        java.util.List<gui.User> userList63 = csvReadWrite56.getUnverifiedUsers();
        gui.User user66 = csvReadWrite56.loginUser("hi!", "");
        java.lang.String[] strArray74 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        boolean boolean77 = csvReadWrite56.registerUser("", "hi!", false, "", "", true, strList75);
        boolean boolean78 = csvReadWrite28.registerUser("hi!", "hi!", false, "hi!", "", false, strList75);
        boolean boolean79 = csvReadWrite17.registerUser("hi!", "", true, "", "hi!", false, strList75);
        boolean boolean80 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList75);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass85 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(userList63);
        org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList12 = csvReadWrite0.getUnverifiedUsers();
        gui.User user15 = csvReadWrite0.loginUser("", "");
        gui.User user18 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass19 = user18.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite9 = new gui.CsvReadWrite();
        csvReadWrite9.updateFacultyNotifications("");
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList21 = new java.util.ArrayList<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList21, strArray20);
        boolean boolean23 = csvReadWrite9.registerUser("", "", false, "hi!", "", false, strList21);
        boolean boolean24 = csvReadWrite0.registerUser("hi!", "hi!", false, "hi!", "", false, strList21);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user31 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(user31);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList24 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass29 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("hi!", "");
        gui.User user15 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass16 = user15.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("hi!", "hi!", true, "", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user26 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        csvReadWrite33.verifyUser("hi!");
        gui.CsvReadWrite csvReadWrite63 = new gui.CsvReadWrite();
        csvReadWrite63.updateFacultyNotifications("");
        csvReadWrite63.verifyUser("");
        csvReadWrite63.verifyUser("");
        java.util.List<gui.User> userList70 = csvReadWrite63.getUnverifiedUsers();
        gui.User user73 = csvReadWrite63.loginUser("hi!", "hi!");
        java.lang.String[] strArray81 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        boolean boolean84 = csvReadWrite63.registerUser("hi!", "hi!", true, "", "", true, strList82);
        boolean boolean85 = csvReadWrite33.registerUser("", "", true, "hi!", "", false, strList82);
        boolean boolean86 = csvReadWrite0.registerUser("hi!", "hi!", true, "hi!", "", false, strList82);
        java.lang.Class<?> wildcardClass87 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(userList70);
        org.junit.Assert.assertNotNull(user73);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user6 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass7 = user6.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite11 = new gui.CsvReadWrite();
        csvReadWrite11.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        gui.CsvReadWrite csvReadWrite31 = new gui.CsvReadWrite();
        csvReadWrite31.updateFacultyNotifications("");
        csvReadWrite31.verifyUser("");
        csvReadWrite31.updateFacultyNotifications("");
        gui.User user40 = csvReadWrite31.loginUser("", "hi!");
        java.util.List<gui.User> userList41 = csvReadWrite31.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite48 = new gui.CsvReadWrite();
        csvReadWrite48.updateFacultyNotifications("");
        csvReadWrite48.verifyUser("");
        csvReadWrite48.updateFacultyNotifications("");
        gui.User user57 = csvReadWrite48.loginUser("", "hi!");
        java.util.List<gui.User> userList58 = csvReadWrite48.getUnverifiedUsers();
        csvReadWrite48.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite67 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite74 = new gui.CsvReadWrite();
        csvReadWrite74.updateFacultyNotifications("");
        java.lang.String[] strArray85 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        boolean boolean88 = csvReadWrite74.registerUser("", "", false, "hi!", "", false, strList86);
        boolean boolean89 = csvReadWrite67.registerUser("", "", false, "hi!", "", true, strList86);
        boolean boolean90 = csvReadWrite48.registerUser("", "hi!", true, "", "", false, strList86);
        boolean boolean91 = csvReadWrite31.registerUser("hi!", "", true, "hi!", "hi!", true, strList86);
        boolean boolean92 = csvReadWrite20.registerUser("", "hi!", true, "", "", false, strList86);
        boolean boolean93 = csvReadWrite11.registerUser("", "", true, "", "", false, strList86);
        boolean boolean94 = csvReadWrite0.registerUser("", "hi!", false, "", "", false, strList86);
        java.lang.Class<?> wildcardClass95 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(user57);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user23 = csvReadWrite0.loginUser("hi!", "");
        gui.CsvReadWrite csvReadWrite30 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList31 = csvReadWrite30.getUnverifiedUsers();
        gui.User user34 = csvReadWrite30.loginUser("hi!", "");
        csvReadWrite30.updateFacultyNotifications("");
        csvReadWrite30.updateFacultyNotifications("hi!");
        csvReadWrite30.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite47 = new gui.CsvReadWrite();
        csvReadWrite47.updateFacultyNotifications("");
        csvReadWrite47.verifyUser("");
        csvReadWrite47.verifyUser("");
        gui.CsvReadWrite csvReadWrite60 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite67 = new gui.CsvReadWrite();
        csvReadWrite67.updateFacultyNotifications("");
        csvReadWrite67.verifyUser("");
        csvReadWrite67.verifyUser("");
        java.util.List<gui.User> userList74 = csvReadWrite67.getUnverifiedUsers();
        gui.User user77 = csvReadWrite67.loginUser("hi!", "");
        java.lang.String[] strArray85 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        boolean boolean88 = csvReadWrite67.registerUser("", "hi!", false, "", "", true, strList86);
        boolean boolean89 = csvReadWrite60.registerUser("hi!", "", true, "", "hi!", true, strList86);
        boolean boolean90 = csvReadWrite47.registerUser("", "", false, "hi!", "", false, strList86);
        boolean boolean91 = csvReadWrite30.registerUser("hi!", "", true, "", "", true, strList86);
        boolean boolean92 = csvReadWrite0.registerUser("hi!", "", false, "hi!", "hi!", false, strList86);
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(user23);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(user34);
        org.junit.Assert.assertNotNull(userList74);
        org.junit.Assert.assertNotNull(user77);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList19 = csvReadWrite0.getUnverifiedUsers();
        gui.User user22 = csvReadWrite0.loginUser("", "");
        gui.User user25 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass26 = user25.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList13 = csvReadWrite0.getUnverifiedUsers();
        gui.User user16 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass17 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        gui.CsvReadWrite csvReadWrite29 = new gui.CsvReadWrite();
        csvReadWrite29.updateFacultyNotifications("");
        csvReadWrite29.verifyUser("");
        csvReadWrite29.verifyUser("");
        java.util.List<gui.User> userList36 = csvReadWrite29.getUnverifiedUsers();
        gui.User user39 = csvReadWrite29.loginUser("hi!", "");
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = csvReadWrite29.registerUser("", "hi!", false, "", "", true, strList48);
        boolean boolean51 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList48);
        java.util.List<gui.User> userList52 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList55 = csvReadWrite0.getUnverifiedUsers();
        gui.User user58 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass59 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(userList55);
        org.junit.Assert.assertNotNull(user58);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user28 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass29 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user28 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass29 = user28.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        gui.User user24 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList25 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass26 = userList25.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList24 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass25 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.verifyUser("");
        java.util.List<gui.User> userList27 = csvReadWrite20.getUnverifiedUsers();
        gui.User user30 = csvReadWrite20.loginUser("hi!", "");
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        boolean boolean41 = csvReadWrite20.registerUser("", "hi!", false, "", "", true, strList39);
        boolean boolean42 = csvReadWrite13.registerUser("hi!", "", true, "", "hi!", true, strList39);
        boolean boolean43 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList39);
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList46 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass47 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user15 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        gui.User user20 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.ArrayList<java.lang.String> strList29 = null;
        boolean boolean30 = csvReadWrite0.registerUser("hi!", "", false, "hi!", "", false, strList29);
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user35 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(user35);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.User user13 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList21 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass22 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.User user30 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass31 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass18 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite15 = new gui.CsvReadWrite();
        csvReadWrite15.updateFacultyNotifications("");
        csvReadWrite15.verifyUser("");
        csvReadWrite15.updateFacultyNotifications("");
        gui.User user24 = csvReadWrite15.loginUser("", "hi!");
        java.util.List<gui.User> userList25 = csvReadWrite15.getUnverifiedUsers();
        gui.User user28 = csvReadWrite15.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite35 = new gui.CsvReadWrite();
        csvReadWrite35.updateFacultyNotifications("");
        csvReadWrite35.verifyUser("");
        csvReadWrite35.verifyUser("");
        gui.CsvReadWrite csvReadWrite48 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite55 = new gui.CsvReadWrite();
        csvReadWrite55.updateFacultyNotifications("");
        csvReadWrite55.verifyUser("");
        csvReadWrite55.verifyUser("");
        java.util.List<gui.User> userList62 = csvReadWrite55.getUnverifiedUsers();
        gui.User user65 = csvReadWrite55.loginUser("hi!", "");
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        boolean boolean76 = csvReadWrite55.registerUser("", "hi!", false, "", "", true, strList74);
        boolean boolean77 = csvReadWrite48.registerUser("hi!", "", true, "", "hi!", true, strList74);
        boolean boolean78 = csvReadWrite35.registerUser("", "", false, "hi!", "", false, strList74);
        boolean boolean79 = csvReadWrite15.registerUser("hi!", "", false, "", "hi!", true, strList74);
        boolean boolean80 = csvReadWrite0.registerUser("", "", false, "hi!", "hi!", false, strList74);
        gui.User user83 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList84 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass87 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(user65);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(user83);
        org.junit.Assert.assertNotNull(userList84);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList6 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass7 = userList6.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList13 = csvReadWrite0.getUnverifiedUsers();
        gui.User user16 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(user16);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass27 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user62 = csvReadWrite0.loginUser("", "hi!");
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(user62);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass11 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        gui.User user14 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass17 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        csvReadWrite0.verifyUser("hi!");
        gui.User user27 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass28 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user20 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite27 = new gui.CsvReadWrite();
        csvReadWrite27.updateFacultyNotifications("");
        csvReadWrite27.verifyUser("");
        csvReadWrite27.updateFacultyNotifications("");
        gui.User user36 = csvReadWrite27.loginUser("", "hi!");
        java.util.List<gui.User> userList37 = csvReadWrite27.getUnverifiedUsers();
        gui.User user40 = csvReadWrite27.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite47 = new gui.CsvReadWrite();
        csvReadWrite47.updateFacultyNotifications("");
        csvReadWrite47.verifyUser("");
        csvReadWrite47.verifyUser("");
        gui.CsvReadWrite csvReadWrite60 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite67 = new gui.CsvReadWrite();
        csvReadWrite67.updateFacultyNotifications("");
        csvReadWrite67.verifyUser("");
        csvReadWrite67.verifyUser("");
        java.util.List<gui.User> userList74 = csvReadWrite67.getUnverifiedUsers();
        gui.User user77 = csvReadWrite67.loginUser("hi!", "");
        java.lang.String[] strArray85 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        boolean boolean88 = csvReadWrite67.registerUser("", "hi!", false, "", "", true, strList86);
        boolean boolean89 = csvReadWrite60.registerUser("hi!", "", true, "", "hi!", true, strList86);
        boolean boolean90 = csvReadWrite47.registerUser("", "", false, "hi!", "", false, strList86);
        boolean boolean91 = csvReadWrite27.registerUser("hi!", "", false, "", "hi!", true, strList86);
        boolean boolean92 = csvReadWrite0.registerUser("hi!", "", false, "", "hi!", true, strList86);
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(user36);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(userList74);
        org.junit.Assert.assertNotNull(user77);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        gui.User user24 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass25 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        gui.User user14 = csvReadWrite0.loginUser("", "");
        gui.User user17 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass20 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(user17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList30 = null;
        boolean boolean31 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", false, strList30);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user42 = csvReadWrite0.loginUser("", "");
        gui.User user45 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass46 = user45.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(user42);
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        gui.User user5 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass6 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite8 = new gui.CsvReadWrite();
        csvReadWrite8.updateFacultyNotifications("");
        java.util.List<gui.User> userList11 = csvReadWrite8.getUnverifiedUsers();
        csvReadWrite8.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.verifyUser("");
        java.util.List<gui.User> userList27 = csvReadWrite20.getUnverifiedUsers();
        java.util.List<gui.User> userList28 = csvReadWrite20.getUnverifiedUsers();
        java.util.List<gui.User> userList29 = csvReadWrite20.getUnverifiedUsers();
        gui.User user32 = csvReadWrite20.loginUser("", "hi!");
        gui.CsvReadWrite csvReadWrite39 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite46 = new gui.CsvReadWrite();
        csvReadWrite46.updateFacultyNotifications("");
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        boolean boolean60 = csvReadWrite46.registerUser("", "", false, "hi!", "", false, strList58);
        boolean boolean61 = csvReadWrite39.registerUser("", "", false, "hi!", "", true, strList58);
        gui.CsvReadWrite csvReadWrite68 = new gui.CsvReadWrite();
        csvReadWrite68.updateFacultyNotifications("");
        csvReadWrite68.verifyUser("");
        csvReadWrite68.verifyUser("");
        java.util.List<gui.User> userList75 = csvReadWrite68.getUnverifiedUsers();
        gui.User user78 = csvReadWrite68.loginUser("hi!", "");
        java.lang.String[] strArray86 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        boolean boolean89 = csvReadWrite68.registerUser("", "hi!", false, "", "", true, strList87);
        boolean boolean90 = csvReadWrite39.registerUser("", "hi!", true, "", "", false, strList87);
        boolean boolean91 = csvReadWrite20.registerUser("hi!", "hi!", false, "", "", true, strList87);
        boolean boolean92 = csvReadWrite8.registerUser("hi!", "", false, "hi!", "", false, strList87);
        boolean boolean93 = csvReadWrite0.registerUser("hi!", "", false, "hi!", "", false, strList87);
        java.lang.Class<?> wildcardClass94 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(user32);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(userList75);
        org.junit.Assert.assertNotNull(user78);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user11 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass18 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user26 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList27 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass30 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        gui.User user24 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite31 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite38 = new gui.CsvReadWrite();
        csvReadWrite38.updateFacultyNotifications("");
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        boolean boolean52 = csvReadWrite38.registerUser("", "", false, "hi!", "", false, strList50);
        boolean boolean53 = csvReadWrite31.registerUser("", "", false, "hi!", "", true, strList50);
        java.util.List<gui.User> userList54 = csvReadWrite31.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList61 = null;
        boolean boolean62 = csvReadWrite31.registerUser("hi!", "hi!", false, "", "hi!", false, strList61);
        gui.CsvReadWrite csvReadWrite69 = new gui.CsvReadWrite();
        csvReadWrite69.updateFacultyNotifications("");
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        boolean boolean83 = csvReadWrite69.registerUser("", "", false, "hi!", "", false, strList81);
        boolean boolean84 = csvReadWrite31.registerUser("hi!", "hi!", true, "", "", false, strList81);
        boolean boolean85 = csvReadWrite0.registerUser("", "", false, "", "hi!", true, strList81);
        java.util.List<gui.User> userList86 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass87 = userList86.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(userList54);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(userList86);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("hi!", "hi!", true, "", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user26 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(user26);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite30 = new gui.CsvReadWrite();
        csvReadWrite30.updateFacultyNotifications("");
        csvReadWrite30.verifyUser("");
        csvReadWrite30.verifyUser("");
        gui.CsvReadWrite csvReadWrite43 = new gui.CsvReadWrite();
        csvReadWrite43.updateFacultyNotifications("");
        csvReadWrite43.verifyUser("");
        csvReadWrite43.verifyUser("");
        gui.CsvReadWrite csvReadWrite56 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite63 = new gui.CsvReadWrite();
        csvReadWrite63.updateFacultyNotifications("");
        csvReadWrite63.verifyUser("");
        csvReadWrite63.verifyUser("");
        java.util.List<gui.User> userList70 = csvReadWrite63.getUnverifiedUsers();
        gui.User user73 = csvReadWrite63.loginUser("hi!", "");
        java.lang.String[] strArray81 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        boolean boolean84 = csvReadWrite63.registerUser("", "hi!", false, "", "", true, strList82);
        boolean boolean85 = csvReadWrite56.registerUser("hi!", "", true, "", "hi!", true, strList82);
        boolean boolean86 = csvReadWrite43.registerUser("", "", false, "hi!", "", false, strList82);
        boolean boolean87 = csvReadWrite30.registerUser("hi!", "", true, "", "", false, strList82);
        boolean boolean88 = csvReadWrite0.registerUser("", "", true, "hi!", "hi!", true, strList82);
        java.lang.Class<?> wildcardClass89 = strList82.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList70);
        org.junit.Assert.assertNotNull(user73);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass15 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user20 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        gui.User user27 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass28 = user27.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass9 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        gui.User user24 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite31 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite38 = new gui.CsvReadWrite();
        csvReadWrite38.updateFacultyNotifications("");
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        boolean boolean52 = csvReadWrite38.registerUser("", "", false, "hi!", "", false, strList50);
        boolean boolean53 = csvReadWrite31.registerUser("", "", false, "hi!", "", true, strList50);
        java.util.List<gui.User> userList54 = csvReadWrite31.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList61 = null;
        boolean boolean62 = csvReadWrite31.registerUser("hi!", "hi!", false, "", "hi!", false, strList61);
        gui.CsvReadWrite csvReadWrite69 = new gui.CsvReadWrite();
        csvReadWrite69.updateFacultyNotifications("");
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        boolean boolean83 = csvReadWrite69.registerUser("", "", false, "hi!", "", false, strList81);
        boolean boolean84 = csvReadWrite31.registerUser("hi!", "hi!", true, "", "", false, strList81);
        boolean boolean85 = csvReadWrite0.registerUser("", "", false, "", "hi!", true, strList81);
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user90 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass93 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(userList54);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(user90);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite11 = new gui.CsvReadWrite();
        csvReadWrite11.updateFacultyNotifications("");
        csvReadWrite11.verifyUser("");
        csvReadWrite11.verifyUser("");
        java.util.List<gui.User> userList18 = csvReadWrite11.getUnverifiedUsers();
        gui.User user21 = csvReadWrite11.loginUser("hi!", "");
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        boolean boolean32 = csvReadWrite11.registerUser("", "hi!", false, "", "", true, strList30);
        gui.CsvReadWrite csvReadWrite39 = new gui.CsvReadWrite();
        csvReadWrite39.updateFacultyNotifications("");
        csvReadWrite39.verifyUser("");
        csvReadWrite39.verifyUser("");
        java.util.List<gui.User> userList46 = csvReadWrite39.getUnverifiedUsers();
        gui.User user49 = csvReadWrite39.loginUser("hi!", "");
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        boolean boolean60 = csvReadWrite39.registerUser("", "hi!", false, "", "", true, strList58);
        boolean boolean61 = csvReadWrite11.registerUser("hi!", "hi!", false, "hi!", "", false, strList58);
        boolean boolean62 = csvReadWrite0.registerUser("hi!", "", true, "", "hi!", false, strList58);
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass65 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user13 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass14 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        gui.CsvReadWrite csvReadWrite29 = new gui.CsvReadWrite();
        csvReadWrite29.updateFacultyNotifications("");
        csvReadWrite29.verifyUser("");
        csvReadWrite29.verifyUser("");
        java.util.List<gui.User> userList36 = csvReadWrite29.getUnverifiedUsers();
        gui.User user39 = csvReadWrite29.loginUser("hi!", "");
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = csvReadWrite29.registerUser("", "hi!", false, "", "", true, strList48);
        boolean boolean51 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList48);
        java.util.List<gui.User> userList52 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList55 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(userList55);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList13 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass14 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        gui.User user28 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList31 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass32 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        gui.User user14 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite21 = new gui.CsvReadWrite();
        csvReadWrite21.updateFacultyNotifications("");
        csvReadWrite21.verifyUser("");
        csvReadWrite21.updateFacultyNotifications("");
        gui.User user30 = csvReadWrite21.loginUser("", "hi!");
        java.util.List<gui.User> userList31 = csvReadWrite21.getUnverifiedUsers();
        gui.User user34 = csvReadWrite21.loginUser("hi!", "hi!");
        csvReadWrite21.updateFacultyNotifications("");
        gui.User user39 = csvReadWrite21.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite46 = new gui.CsvReadWrite();
        csvReadWrite46.updateFacultyNotifications("");
        csvReadWrite46.verifyUser("");
        csvReadWrite46.verifyUser("");
        java.util.List<gui.User> userList53 = csvReadWrite46.getUnverifiedUsers();
        gui.User user56 = csvReadWrite46.loginUser("hi!", "");
        gui.User user59 = csvReadWrite46.loginUser("", "");
        gui.User user62 = csvReadWrite46.loginUser("", "");
        gui.User user65 = csvReadWrite46.loginUser("", "");
        csvReadWrite46.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite74 = new gui.CsvReadWrite();
        csvReadWrite74.updateFacultyNotifications("");
        java.lang.String[] strArray85 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        boolean boolean88 = csvReadWrite74.registerUser("", "", false, "hi!", "", false, strList86);
        boolean boolean89 = csvReadWrite46.registerUser("hi!", "", false, "", "hi!", true, strList86);
        boolean boolean90 = csvReadWrite21.registerUser("", "hi!", false, "", "", true, strList86);
        boolean boolean91 = csvReadWrite0.registerUser("", "hi!", false, "hi!", "", true, strList86);
        gui.User user94 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass95 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(user34);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertNotNull(user56);
        org.junit.Assert.assertNotNull(user59);
        org.junit.Assert.assertNotNull(user62);
        org.junit.Assert.assertNotNull(user65);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(user94);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user9 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass12 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite18 = new gui.CsvReadWrite();
        csvReadWrite18.updateFacultyNotifications("");
        csvReadWrite18.verifyUser("");
        csvReadWrite18.verifyUser("");
        java.util.List<gui.User> userList25 = csvReadWrite18.getUnverifiedUsers();
        gui.User user28 = csvReadWrite18.loginUser("hi!", "");
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        boolean boolean39 = csvReadWrite18.registerUser("", "hi!", false, "", "", true, strList37);
        gui.CsvReadWrite csvReadWrite46 = new gui.CsvReadWrite();
        csvReadWrite46.updateFacultyNotifications("");
        csvReadWrite46.verifyUser("");
        csvReadWrite46.verifyUser("");
        java.util.List<gui.User> userList53 = csvReadWrite46.getUnverifiedUsers();
        gui.User user56 = csvReadWrite46.loginUser("hi!", "");
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        boolean boolean67 = csvReadWrite46.registerUser("", "hi!", false, "", "", true, strList65);
        boolean boolean68 = csvReadWrite18.registerUser("hi!", "hi!", false, "hi!", "", false, strList65);
        boolean boolean69 = csvReadWrite0.registerUser("", "", true, "", "hi!", true, strList65);
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass72 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertNotNull(user56);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.updateFacultyNotifications("");
        gui.User user29 = csvReadWrite20.loginUser("", "hi!");
        java.util.List<gui.User> userList30 = csvReadWrite20.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite37 = new gui.CsvReadWrite();
        csvReadWrite37.updateFacultyNotifications("");
        csvReadWrite37.verifyUser("");
        csvReadWrite37.updateFacultyNotifications("");
        gui.User user46 = csvReadWrite37.loginUser("", "hi!");
        java.util.List<gui.User> userList47 = csvReadWrite37.getUnverifiedUsers();
        csvReadWrite37.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite56 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite63 = new gui.CsvReadWrite();
        csvReadWrite63.updateFacultyNotifications("");
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        boolean boolean77 = csvReadWrite63.registerUser("", "", false, "hi!", "", false, strList75);
        boolean boolean78 = csvReadWrite56.registerUser("", "", false, "hi!", "", true, strList75);
        boolean boolean79 = csvReadWrite37.registerUser("", "hi!", true, "", "", false, strList75);
        boolean boolean80 = csvReadWrite20.registerUser("hi!", "", true, "hi!", "hi!", true, strList75);
        boolean boolean81 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList75);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user88 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList89 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList92 = csvReadWrite0.getUnverifiedUsers();
        gui.User user95 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList96 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList97 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass98 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(user88);
        org.junit.Assert.assertNotNull(userList89);
        org.junit.Assert.assertNotNull(userList92);
        org.junit.Assert.assertNotNull(user95);
        org.junit.Assert.assertNotNull(userList96);
        org.junit.Assert.assertNotNull(userList97);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user15 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = user15.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user13 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        gui.User user28 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass31 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite17 = new gui.CsvReadWrite();
        csvReadWrite17.updateFacultyNotifications("");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = csvReadWrite17.registerUser("", "", false, "hi!", "", false, strList29);
        boolean boolean32 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", false, strList29);
        java.util.List<gui.User> userList33 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass34 = userList33.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass7 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user30 = csvReadWrite0.loginUser("hi!", "");
        gui.User user33 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(user33);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList19 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList20 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass23 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList26 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass27 = userList26.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList21 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass22 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite18 = new gui.CsvReadWrite();
        csvReadWrite18.updateFacultyNotifications("");
        csvReadWrite18.verifyUser("");
        csvReadWrite18.verifyUser("");
        java.util.List<gui.User> userList25 = csvReadWrite18.getUnverifiedUsers();
        gui.User user28 = csvReadWrite18.loginUser("hi!", "");
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        boolean boolean39 = csvReadWrite18.registerUser("", "hi!", false, "", "", true, strList37);
        gui.CsvReadWrite csvReadWrite46 = new gui.CsvReadWrite();
        csvReadWrite46.updateFacultyNotifications("");
        csvReadWrite46.verifyUser("");
        csvReadWrite46.verifyUser("");
        java.util.List<gui.User> userList53 = csvReadWrite46.getUnverifiedUsers();
        gui.User user56 = csvReadWrite46.loginUser("hi!", "");
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        boolean boolean67 = csvReadWrite46.registerUser("", "hi!", false, "", "", true, strList65);
        boolean boolean68 = csvReadWrite18.registerUser("hi!", "hi!", false, "hi!", "", false, strList65);
        boolean boolean69 = csvReadWrite0.registerUser("", "", true, "", "hi!", true, strList65);
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertNotNull(user56);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user11 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass17 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user24 = csvReadWrite0.loginUser("hi!", "");
        gui.User user27 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass28 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.User user3 = csvReadWrite0.loginUser("", "hi!");
        gui.CsvReadWrite csvReadWrite10 = new gui.CsvReadWrite();
        csvReadWrite10.updateFacultyNotifications("");
        csvReadWrite10.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite21 = new gui.CsvReadWrite();
        csvReadWrite21.updateFacultyNotifications("");
        csvReadWrite21.verifyUser("");
        csvReadWrite21.verifyUser("");
        java.util.List<gui.User> userList28 = csvReadWrite21.getUnverifiedUsers();
        gui.User user31 = csvReadWrite21.loginUser("hi!", "");
        java.lang.String[] strArray39 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        boolean boolean42 = csvReadWrite21.registerUser("", "hi!", false, "", "", true, strList40);
        gui.CsvReadWrite csvReadWrite49 = new gui.CsvReadWrite();
        csvReadWrite49.updateFacultyNotifications("");
        csvReadWrite49.verifyUser("");
        csvReadWrite49.verifyUser("");
        java.util.List<gui.User> userList56 = csvReadWrite49.getUnverifiedUsers();
        gui.User user59 = csvReadWrite49.loginUser("hi!", "");
        java.lang.String[] strArray67 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        boolean boolean70 = csvReadWrite49.registerUser("", "hi!", false, "", "", true, strList68);
        boolean boolean71 = csvReadWrite21.registerUser("hi!", "hi!", false, "hi!", "", false, strList68);
        boolean boolean72 = csvReadWrite10.registerUser("hi!", "", true, "", "hi!", false, strList68);
        boolean boolean73 = csvReadWrite0.registerUser("", "", false, "", "", false, strList68);
        java.lang.Class<?> wildcardClass74 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(userList56);
        org.junit.Assert.assertNotNull(user59);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.verifyUser("hi!");
        gui.CsvReadWrite csvReadWrite30 = new gui.CsvReadWrite();
        csvReadWrite30.updateFacultyNotifications("");
        csvReadWrite30.verifyUser("");
        csvReadWrite30.verifyUser("");
        java.util.List<gui.User> userList37 = csvReadWrite30.getUnverifiedUsers();
        gui.User user40 = csvReadWrite30.loginUser("hi!", "hi!");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        boolean boolean51 = csvReadWrite30.registerUser("hi!", "hi!", true, "", "", true, strList49);
        boolean boolean52 = csvReadWrite0.registerUser("", "", true, "hi!", "", false, strList49);
        java.lang.Class<?> wildcardClass53 = strList49.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        gui.User user28 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user31 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(user31);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user68 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite77 = new gui.CsvReadWrite();
        csvReadWrite77.updateFacultyNotifications("");
        csvReadWrite77.verifyUser("");
        csvReadWrite77.verifyUser("");
        java.util.List<gui.User> userList84 = csvReadWrite77.getUnverifiedUsers();
        gui.User user87 = csvReadWrite77.loginUser("hi!", "");
        java.lang.String[] strArray95 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList96 = new java.util.ArrayList<java.lang.String>();
        boolean boolean97 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList96, strArray95);
        boolean boolean98 = csvReadWrite77.registerUser("", "hi!", false, "", "", true, strList96);
        boolean boolean99 = csvReadWrite0.registerUser("hi!", "hi!", true, "", "hi!", false, strList96);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(user68);
        org.junit.Assert.assertNotNull(userList84);
        org.junit.Assert.assertNotNull(user87);
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        gui.User user22 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList26 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass27 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user11 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass12 = user11.getClass();
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite15 = new gui.CsvReadWrite();
        csvReadWrite15.updateFacultyNotifications("");
        csvReadWrite15.verifyUser("");
        csvReadWrite15.updateFacultyNotifications("");
        gui.User user24 = csvReadWrite15.loginUser("", "hi!");
        java.util.List<gui.User> userList25 = csvReadWrite15.getUnverifiedUsers();
        gui.User user28 = csvReadWrite15.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite35 = new gui.CsvReadWrite();
        csvReadWrite35.updateFacultyNotifications("");
        csvReadWrite35.verifyUser("");
        csvReadWrite35.verifyUser("");
        gui.CsvReadWrite csvReadWrite48 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite55 = new gui.CsvReadWrite();
        csvReadWrite55.updateFacultyNotifications("");
        csvReadWrite55.verifyUser("");
        csvReadWrite55.verifyUser("");
        java.util.List<gui.User> userList62 = csvReadWrite55.getUnverifiedUsers();
        gui.User user65 = csvReadWrite55.loginUser("hi!", "");
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        boolean boolean76 = csvReadWrite55.registerUser("", "hi!", false, "", "", true, strList74);
        boolean boolean77 = csvReadWrite48.registerUser("hi!", "", true, "", "hi!", true, strList74);
        boolean boolean78 = csvReadWrite35.registerUser("", "", false, "hi!", "", false, strList74);
        boolean boolean79 = csvReadWrite15.registerUser("hi!", "", false, "", "hi!", true, strList74);
        boolean boolean80 = csvReadWrite0.registerUser("", "", false, "hi!", "hi!", false, strList74);
        gui.User user83 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass84 = user83.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(user65);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(user83);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.User user13 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList17 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass18 = userList17.getClass();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass12 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass17 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite15 = new gui.CsvReadWrite();
        csvReadWrite15.updateFacultyNotifications("");
        csvReadWrite15.verifyUser("");
        csvReadWrite15.updateFacultyNotifications("");
        gui.User user24 = csvReadWrite15.loginUser("", "hi!");
        java.util.List<gui.User> userList25 = csvReadWrite15.getUnverifiedUsers();
        gui.User user28 = csvReadWrite15.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite35 = new gui.CsvReadWrite();
        csvReadWrite35.updateFacultyNotifications("");
        csvReadWrite35.verifyUser("");
        csvReadWrite35.verifyUser("");
        gui.CsvReadWrite csvReadWrite48 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite55 = new gui.CsvReadWrite();
        csvReadWrite55.updateFacultyNotifications("");
        csvReadWrite55.verifyUser("");
        csvReadWrite55.verifyUser("");
        java.util.List<gui.User> userList62 = csvReadWrite55.getUnverifiedUsers();
        gui.User user65 = csvReadWrite55.loginUser("hi!", "");
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        boolean boolean76 = csvReadWrite55.registerUser("", "hi!", false, "", "", true, strList74);
        boolean boolean77 = csvReadWrite48.registerUser("hi!", "", true, "", "hi!", true, strList74);
        boolean boolean78 = csvReadWrite35.registerUser("", "", false, "hi!", "", false, strList74);
        boolean boolean79 = csvReadWrite15.registerUser("hi!", "", false, "", "hi!", true, strList74);
        boolean boolean80 = csvReadWrite0.registerUser("", "", false, "hi!", "hi!", false, strList74);
        gui.User user83 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList84 = csvReadWrite0.getUnverifiedUsers();
        gui.User user87 = csvReadWrite0.loginUser("hi!", "");
        gui.User user90 = csvReadWrite0.loginUser("", "");
        gui.User user93 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(user65);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(user83);
        org.junit.Assert.assertNotNull(userList84);
        org.junit.Assert.assertNotNull(user87);
        org.junit.Assert.assertNotNull(user90);
        org.junit.Assert.assertNotNull(user93);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user15 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user18 = csvReadWrite0.loginUser("", "hi!");
        gui.User user21 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        csvReadWrite28.verifyUser("");
        csvReadWrite28.verifyUser("");
        gui.CsvReadWrite csvReadWrite41 = new gui.CsvReadWrite();
        csvReadWrite41.updateFacultyNotifications("");
        csvReadWrite41.verifyUser("");
        csvReadWrite41.verifyUser("");
        gui.CsvReadWrite csvReadWrite54 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite61 = new gui.CsvReadWrite();
        csvReadWrite61.updateFacultyNotifications("");
        csvReadWrite61.verifyUser("");
        csvReadWrite61.verifyUser("");
        java.util.List<gui.User> userList68 = csvReadWrite61.getUnverifiedUsers();
        gui.User user71 = csvReadWrite61.loginUser("hi!", "");
        java.lang.String[] strArray79 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        boolean boolean82 = csvReadWrite61.registerUser("", "hi!", false, "", "", true, strList80);
        boolean boolean83 = csvReadWrite54.registerUser("hi!", "", true, "", "hi!", true, strList80);
        boolean boolean84 = csvReadWrite41.registerUser("", "", false, "hi!", "", false, strList80);
        boolean boolean85 = csvReadWrite28.registerUser("hi!", "", true, "", "", false, strList80);
        boolean boolean86 = csvReadWrite0.registerUser("hi!", "", false, "", "", false, strList80);
        java.lang.Class<?> wildcardClass87 = strList80.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(userList68);
        org.junit.Assert.assertNotNull(user71);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(wildcardClass87);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList28 = csvReadWrite0.getUnverifiedUsers();
        gui.User user31 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass32 = user31.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass11 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user16 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass17 = user16.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList30 = null;
        boolean boolean31 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", false, strList30);
        gui.CsvReadWrite csvReadWrite38 = new gui.CsvReadWrite();
        csvReadWrite38.updateFacultyNotifications("");
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        boolean boolean52 = csvReadWrite38.registerUser("", "", false, "hi!", "", false, strList50);
        boolean boolean53 = csvReadWrite0.registerUser("hi!", "hi!", true, "", "", false, strList50);
        java.lang.Class<?> wildcardClass54 = strList50.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user20 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user25 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass26 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user15 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user18 = csvReadWrite0.loginUser("", "hi!");
        gui.User user21 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        csvReadWrite28.verifyUser("");
        csvReadWrite28.verifyUser("");
        gui.CsvReadWrite csvReadWrite41 = new gui.CsvReadWrite();
        csvReadWrite41.updateFacultyNotifications("");
        csvReadWrite41.verifyUser("");
        csvReadWrite41.verifyUser("");
        gui.CsvReadWrite csvReadWrite54 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite61 = new gui.CsvReadWrite();
        csvReadWrite61.updateFacultyNotifications("");
        csvReadWrite61.verifyUser("");
        csvReadWrite61.verifyUser("");
        java.util.List<gui.User> userList68 = csvReadWrite61.getUnverifiedUsers();
        gui.User user71 = csvReadWrite61.loginUser("hi!", "");
        java.lang.String[] strArray79 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList80 = new java.util.ArrayList<java.lang.String>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList80, strArray79);
        boolean boolean82 = csvReadWrite61.registerUser("", "hi!", false, "", "", true, strList80);
        boolean boolean83 = csvReadWrite54.registerUser("hi!", "", true, "", "hi!", true, strList80);
        boolean boolean84 = csvReadWrite41.registerUser("", "", false, "hi!", "", false, strList80);
        boolean boolean85 = csvReadWrite28.registerUser("hi!", "", true, "", "", false, strList80);
        boolean boolean86 = csvReadWrite0.registerUser("hi!", "", false, "", "", false, strList80);
        java.util.List<gui.User> userList87 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass88 = userList87.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(userList68);
        org.junit.Assert.assertNotNull(user71);
        org.junit.Assert.assertNotNull(strArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(userList87);
        org.junit.Assert.assertNotNull(wildcardClass88);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user30 = csvReadWrite0.loginUser("hi!", "");
        gui.User user33 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass34 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(user33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass9 = userList8.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList66 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass69 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(userList66);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList5 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass6 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        gui.CsvReadWrite csvReadWrite29 = new gui.CsvReadWrite();
        csvReadWrite29.updateFacultyNotifications("");
        csvReadWrite29.verifyUser("");
        csvReadWrite29.verifyUser("");
        java.util.List<gui.User> userList36 = csvReadWrite29.getUnverifiedUsers();
        gui.User user39 = csvReadWrite29.loginUser("hi!", "");
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = csvReadWrite29.registerUser("", "hi!", false, "", "", true, strList48);
        boolean boolean51 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList48);
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass56 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.updateFacultyNotifications("");
        gui.User user29 = csvReadWrite20.loginUser("", "hi!");
        java.util.List<gui.User> userList30 = csvReadWrite20.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite37 = new gui.CsvReadWrite();
        csvReadWrite37.updateFacultyNotifications("");
        csvReadWrite37.verifyUser("");
        csvReadWrite37.updateFacultyNotifications("");
        gui.User user46 = csvReadWrite37.loginUser("", "hi!");
        java.util.List<gui.User> userList47 = csvReadWrite37.getUnverifiedUsers();
        csvReadWrite37.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite56 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite63 = new gui.CsvReadWrite();
        csvReadWrite63.updateFacultyNotifications("");
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        boolean boolean77 = csvReadWrite63.registerUser("", "", false, "hi!", "", false, strList75);
        boolean boolean78 = csvReadWrite56.registerUser("", "", false, "hi!", "", true, strList75);
        boolean boolean79 = csvReadWrite37.registerUser("", "hi!", true, "", "", false, strList75);
        boolean boolean80 = csvReadWrite20.registerUser("hi!", "", true, "hi!", "hi!", true, strList75);
        boolean boolean81 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList75);
        gui.User user84 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass85 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(user84);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite32 = new gui.CsvReadWrite();
        csvReadWrite32.updateFacultyNotifications("");
        csvReadWrite32.verifyUser("");
        csvReadWrite32.verifyUser("");
        java.util.List<gui.User> userList39 = csvReadWrite32.getUnverifiedUsers();
        gui.User user42 = csvReadWrite32.loginUser("hi!", "hi!");
        csvReadWrite32.updateFacultyNotifications("");
        gui.User user47 = csvReadWrite32.loginUser("hi!", "hi!");
        gui.User user50 = csvReadWrite32.loginUser("", "hi!");
        gui.CsvReadWrite csvReadWrite57 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList58 = csvReadWrite57.getUnverifiedUsers();
        java.util.List<gui.User> userList59 = csvReadWrite57.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite66 = new gui.CsvReadWrite();
        csvReadWrite66.updateFacultyNotifications("");
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        boolean boolean80 = csvReadWrite66.registerUser("", "", false, "hi!", "", false, strList78);
        boolean boolean81 = csvReadWrite57.registerUser("hi!", "hi!", false, "hi!", "", false, strList78);
        boolean boolean82 = csvReadWrite32.registerUser("", "", true, "", "", false, strList78);
        boolean boolean83 = csvReadWrite0.registerUser("hi!", "", false, "", "", true, strList78);
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user88 = csvReadWrite0.loginUser("hi!", "");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(user42);
        org.junit.Assert.assertNotNull(user47);
        org.junit.Assert.assertNotNull(user50);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(user88);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass16 = userList15.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass13 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.User user13 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.verifyUser("");
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite40 = new gui.CsvReadWrite();
        csvReadWrite40.updateFacultyNotifications("");
        csvReadWrite40.verifyUser("");
        csvReadWrite40.verifyUser("");
        java.util.List<gui.User> userList47 = csvReadWrite40.getUnverifiedUsers();
        gui.User user50 = csvReadWrite40.loginUser("hi!", "");
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        boolean boolean61 = csvReadWrite40.registerUser("", "hi!", false, "", "", true, strList59);
        boolean boolean62 = csvReadWrite33.registerUser("hi!", "", true, "", "hi!", true, strList59);
        boolean boolean63 = csvReadWrite20.registerUser("", "", false, "hi!", "", false, strList59);
        boolean boolean64 = csvReadWrite0.registerUser("hi!", "", false, "", "hi!", true, strList59);
        java.util.List<gui.User> userList65 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass66 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(user50);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(userList65);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.User user13 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass14 = user13.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite17 = new gui.CsvReadWrite();
        csvReadWrite17.updateFacultyNotifications("");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = csvReadWrite17.registerUser("", "", false, "hi!", "", false, strList29);
        boolean boolean32 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", false, strList29);
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass39 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass11 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList12 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass13 = userList12.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList30 = null;
        boolean boolean31 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", false, strList30);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user40 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass41 = user40.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass28 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user7 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        gui.User user11 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList14 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass15 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList30 = null;
        boolean boolean31 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", false, strList30);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("hi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList20 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList21 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite30 = new gui.CsvReadWrite();
        csvReadWrite30.updateFacultyNotifications("");
        csvReadWrite30.verifyUser("");
        csvReadWrite30.verifyUser("");
        java.util.List<gui.User> userList37 = csvReadWrite30.getUnverifiedUsers();
        gui.User user40 = csvReadWrite30.loginUser("hi!", "hi!");
        csvReadWrite30.updateFacultyNotifications("");
        gui.User user45 = csvReadWrite30.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite52 = new gui.CsvReadWrite();
        csvReadWrite52.updateFacultyNotifications("");
        csvReadWrite52.verifyUser("");
        csvReadWrite52.updateFacultyNotifications("");
        gui.User user61 = csvReadWrite52.loginUser("", "hi!");
        java.util.List<gui.User> userList62 = csvReadWrite52.getUnverifiedUsers();
        csvReadWrite52.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite71 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite78 = new gui.CsvReadWrite();
        csvReadWrite78.updateFacultyNotifications("");
        java.lang.String[] strArray89 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList90 = new java.util.ArrayList<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList90, strArray89);
        boolean boolean92 = csvReadWrite78.registerUser("", "", false, "hi!", "", false, strList90);
        boolean boolean93 = csvReadWrite71.registerUser("", "", false, "hi!", "", true, strList90);
        boolean boolean94 = csvReadWrite52.registerUser("", "hi!", true, "", "", false, strList90);
        boolean boolean95 = csvReadWrite30.registerUser("", "hi!", false, "hi!", "hi!", false, strList90);
        boolean boolean96 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList90);
        gui.User user99 = csvReadWrite0.loginUser("hi!", "");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertNotNull(user61);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(user99);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite11 = new gui.CsvReadWrite();
        csvReadWrite11.updateFacultyNotifications("");
        csvReadWrite11.verifyUser("");
        csvReadWrite11.verifyUser("");
        java.util.List<gui.User> userList18 = csvReadWrite11.getUnverifiedUsers();
        gui.User user21 = csvReadWrite11.loginUser("hi!", "");
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        boolean boolean32 = csvReadWrite11.registerUser("", "hi!", false, "", "", true, strList30);
        gui.CsvReadWrite csvReadWrite39 = new gui.CsvReadWrite();
        csvReadWrite39.updateFacultyNotifications("");
        csvReadWrite39.verifyUser("");
        csvReadWrite39.verifyUser("");
        java.util.List<gui.User> userList46 = csvReadWrite39.getUnverifiedUsers();
        gui.User user49 = csvReadWrite39.loginUser("hi!", "");
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        boolean boolean60 = csvReadWrite39.registerUser("", "hi!", false, "", "", true, strList58);
        boolean boolean61 = csvReadWrite11.registerUser("hi!", "hi!", false, "hi!", "", false, strList58);
        boolean boolean62 = csvReadWrite0.registerUser("hi!", "", true, "", "hi!", false, strList58);
        csvReadWrite0.verifyUser("hi!");
        gui.User user67 = csvReadWrite0.loginUser("", "hi!");
        gui.User user70 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass71 = user70.getClass();
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(user67);
        org.junit.Assert.assertNotNull(user70);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList66 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass67 = userList66.getClass();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(userList66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite11 = new gui.CsvReadWrite();
        csvReadWrite11.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        gui.CsvReadWrite csvReadWrite31 = new gui.CsvReadWrite();
        csvReadWrite31.updateFacultyNotifications("");
        csvReadWrite31.verifyUser("");
        csvReadWrite31.updateFacultyNotifications("");
        gui.User user40 = csvReadWrite31.loginUser("", "hi!");
        java.util.List<gui.User> userList41 = csvReadWrite31.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite48 = new gui.CsvReadWrite();
        csvReadWrite48.updateFacultyNotifications("");
        csvReadWrite48.verifyUser("");
        csvReadWrite48.updateFacultyNotifications("");
        gui.User user57 = csvReadWrite48.loginUser("", "hi!");
        java.util.List<gui.User> userList58 = csvReadWrite48.getUnverifiedUsers();
        csvReadWrite48.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite67 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite74 = new gui.CsvReadWrite();
        csvReadWrite74.updateFacultyNotifications("");
        java.lang.String[] strArray85 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        boolean boolean88 = csvReadWrite74.registerUser("", "", false, "hi!", "", false, strList86);
        boolean boolean89 = csvReadWrite67.registerUser("", "", false, "hi!", "", true, strList86);
        boolean boolean90 = csvReadWrite48.registerUser("", "hi!", true, "", "", false, strList86);
        boolean boolean91 = csvReadWrite31.registerUser("hi!", "", true, "hi!", "hi!", true, strList86);
        boolean boolean92 = csvReadWrite20.registerUser("", "hi!", true, "", "", false, strList86);
        boolean boolean93 = csvReadWrite11.registerUser("", "", true, "", "", false, strList86);
        boolean boolean94 = csvReadWrite0.registerUser("", "hi!", false, "", "", false, strList86);
        java.util.List<gui.User> userList95 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(user57);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(userList95);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        gui.User user28 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass29 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList30 = null;
        boolean boolean31 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", false, strList30);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList40 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass41 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList6 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        java.util.List<gui.User> userList16 = csvReadWrite13.getUnverifiedUsers();
        csvReadWrite13.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite25 = new gui.CsvReadWrite();
        csvReadWrite25.updateFacultyNotifications("");
        csvReadWrite25.verifyUser("");
        csvReadWrite25.verifyUser("");
        java.util.List<gui.User> userList32 = csvReadWrite25.getUnverifiedUsers();
        java.util.List<gui.User> userList33 = csvReadWrite25.getUnverifiedUsers();
        java.util.List<gui.User> userList34 = csvReadWrite25.getUnverifiedUsers();
        gui.User user37 = csvReadWrite25.loginUser("", "hi!");
        gui.CsvReadWrite csvReadWrite44 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite51 = new gui.CsvReadWrite();
        csvReadWrite51.updateFacultyNotifications("");
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        boolean boolean65 = csvReadWrite51.registerUser("", "", false, "hi!", "", false, strList63);
        boolean boolean66 = csvReadWrite44.registerUser("", "", false, "hi!", "", true, strList63);
        gui.CsvReadWrite csvReadWrite73 = new gui.CsvReadWrite();
        csvReadWrite73.updateFacultyNotifications("");
        csvReadWrite73.verifyUser("");
        csvReadWrite73.verifyUser("");
        java.util.List<gui.User> userList80 = csvReadWrite73.getUnverifiedUsers();
        gui.User user83 = csvReadWrite73.loginUser("hi!", "");
        java.lang.String[] strArray91 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList92 = new java.util.ArrayList<java.lang.String>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList92, strArray91);
        boolean boolean94 = csvReadWrite73.registerUser("", "hi!", false, "", "", true, strList92);
        boolean boolean95 = csvReadWrite44.registerUser("", "hi!", true, "", "", false, strList92);
        boolean boolean96 = csvReadWrite25.registerUser("hi!", "hi!", false, "", "", true, strList92);
        boolean boolean97 = csvReadWrite13.registerUser("hi!", "", false, "hi!", "", false, strList92);
        boolean boolean98 = csvReadWrite0.registerUser("", "hi!", true, "hi!", "hi!", true, strList92);
        java.util.List<gui.User> userList99 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(user37);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(userList80);
        org.junit.Assert.assertNotNull(user83);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertNotNull(userList99);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass26 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.verifyUser("");
        java.util.List<gui.User> userList27 = csvReadWrite20.getUnverifiedUsers();
        gui.User user30 = csvReadWrite20.loginUser("hi!", "");
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        boolean boolean41 = csvReadWrite20.registerUser("", "hi!", false, "", "", true, strList39);
        boolean boolean42 = csvReadWrite13.registerUser("hi!", "", true, "", "hi!", true, strList39);
        boolean boolean43 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList39);
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList46 = csvReadWrite0.getUnverifiedUsers();
        gui.User user49 = csvReadWrite0.loginUser("", "hi!");
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(user49);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList13 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass14 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        org.junit.Assert.assertNotNull(userList7);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user15 = csvReadWrite0.loginUser("", "");
        gui.User user18 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList19 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        csvReadWrite26.updateFacultyNotifications("");
        csvReadWrite26.verifyUser("");
        csvReadWrite26.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite39 = new gui.CsvReadWrite();
        csvReadWrite39.updateFacultyNotifications("");
        csvReadWrite39.verifyUser("");
        csvReadWrite39.verifyUser("");
        java.util.List<gui.User> userList46 = csvReadWrite39.getUnverifiedUsers();
        gui.User user49 = csvReadWrite39.loginUser("hi!", "hi!");
        csvReadWrite39.updateFacultyNotifications("");
        gui.User user54 = csvReadWrite39.loginUser("hi!", "hi!");
        gui.User user57 = csvReadWrite39.loginUser("", "hi!");
        gui.CsvReadWrite csvReadWrite64 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList65 = csvReadWrite64.getUnverifiedUsers();
        java.util.List<gui.User> userList66 = csvReadWrite64.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite73 = new gui.CsvReadWrite();
        csvReadWrite73.updateFacultyNotifications("");
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        boolean boolean87 = csvReadWrite73.registerUser("", "", false, "hi!", "", false, strList85);
        boolean boolean88 = csvReadWrite64.registerUser("hi!", "hi!", false, "hi!", "", false, strList85);
        boolean boolean89 = csvReadWrite39.registerUser("", "", true, "", "", false, strList85);
        boolean boolean90 = csvReadWrite26.registerUser("", "hi!", false, "", "", false, strList85);
        boolean boolean91 = csvReadWrite0.registerUser("hi!", "", false, "", "", true, strList85);
        java.lang.Class<?> wildcardClass92 = strList85.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertNotNull(user54);
        org.junit.Assert.assertNotNull(user57);
        org.junit.Assert.assertNotNull(userList65);
        org.junit.Assert.assertNotNull(userList66);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.User user13 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass14 = user13.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        gui.CsvReadWrite csvReadWrite29 = new gui.CsvReadWrite();
        csvReadWrite29.updateFacultyNotifications("");
        csvReadWrite29.verifyUser("");
        csvReadWrite29.verifyUser("");
        java.util.List<gui.User> userList36 = csvReadWrite29.getUnverifiedUsers();
        gui.User user39 = csvReadWrite29.loginUser("hi!", "");
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = csvReadWrite29.registerUser("", "hi!", false, "", "", true, strList48);
        boolean boolean51 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList48);
        java.util.List<gui.User> userList52 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass59 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user7 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite18 = new gui.CsvReadWrite();
        csvReadWrite18.updateFacultyNotifications("");
        csvReadWrite18.verifyUser("");
        csvReadWrite18.updateFacultyNotifications("");
        gui.User user27 = csvReadWrite18.loginUser("", "hi!");
        java.util.List<gui.User> userList28 = csvReadWrite18.getUnverifiedUsers();
        csvReadWrite18.updateFacultyNotifications("");
        java.util.List<gui.User> userList31 = csvReadWrite18.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite38 = new gui.CsvReadWrite();
        csvReadWrite38.updateFacultyNotifications("");
        csvReadWrite38.verifyUser("");
        csvReadWrite38.updateFacultyNotifications("");
        gui.User user47 = csvReadWrite38.loginUser("", "hi!");
        java.util.List<gui.User> userList48 = csvReadWrite38.getUnverifiedUsers();
        csvReadWrite38.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite57 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite64 = new gui.CsvReadWrite();
        csvReadWrite64.updateFacultyNotifications("");
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        boolean boolean78 = csvReadWrite64.registerUser("", "", false, "hi!", "", false, strList76);
        boolean boolean79 = csvReadWrite57.registerUser("", "", false, "hi!", "", true, strList76);
        boolean boolean80 = csvReadWrite38.registerUser("", "hi!", true, "", "", false, strList76);
        boolean boolean81 = csvReadWrite18.registerUser("", "", false, "", "", false, strList76);
        boolean boolean82 = csvReadWrite0.registerUser("hi!", "", true, "hi!", "hi!", false, strList76);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(user47);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite15 = new gui.CsvReadWrite();
        csvReadWrite15.updateFacultyNotifications("");
        csvReadWrite15.verifyUser("");
        csvReadWrite15.updateFacultyNotifications("");
        gui.User user24 = csvReadWrite15.loginUser("", "hi!");
        java.util.List<gui.User> userList25 = csvReadWrite15.getUnverifiedUsers();
        gui.User user28 = csvReadWrite15.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite35 = new gui.CsvReadWrite();
        csvReadWrite35.updateFacultyNotifications("");
        csvReadWrite35.verifyUser("");
        csvReadWrite35.verifyUser("");
        gui.CsvReadWrite csvReadWrite48 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite55 = new gui.CsvReadWrite();
        csvReadWrite55.updateFacultyNotifications("");
        csvReadWrite55.verifyUser("");
        csvReadWrite55.verifyUser("");
        java.util.List<gui.User> userList62 = csvReadWrite55.getUnverifiedUsers();
        gui.User user65 = csvReadWrite55.loginUser("hi!", "");
        java.lang.String[] strArray73 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList74 = new java.util.ArrayList<java.lang.String>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList74, strArray73);
        boolean boolean76 = csvReadWrite55.registerUser("", "hi!", false, "", "", true, strList74);
        boolean boolean77 = csvReadWrite48.registerUser("hi!", "", true, "", "hi!", true, strList74);
        boolean boolean78 = csvReadWrite35.registerUser("", "", false, "hi!", "", false, strList74);
        boolean boolean79 = csvReadWrite15.registerUser("hi!", "", false, "", "hi!", true, strList74);
        boolean boolean80 = csvReadWrite0.registerUser("", "", false, "hi!", "hi!", false, strList74);
        csvReadWrite0.verifyUser("");
        gui.User user85 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(user65);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(user85);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass19 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass17 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite19 = new gui.CsvReadWrite();
        csvReadWrite19.updateFacultyNotifications("");
        csvReadWrite19.verifyUser("");
        csvReadWrite19.verifyUser("");
        gui.CsvReadWrite csvReadWrite32 = new gui.CsvReadWrite();
        csvReadWrite32.updateFacultyNotifications("");
        csvReadWrite32.verifyUser("");
        csvReadWrite32.verifyUser("");
        gui.CsvReadWrite csvReadWrite45 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite52 = new gui.CsvReadWrite();
        csvReadWrite52.updateFacultyNotifications("");
        csvReadWrite52.verifyUser("");
        csvReadWrite52.verifyUser("");
        java.util.List<gui.User> userList59 = csvReadWrite52.getUnverifiedUsers();
        gui.User user62 = csvReadWrite52.loginUser("hi!", "");
        java.lang.String[] strArray70 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        boolean boolean73 = csvReadWrite52.registerUser("", "hi!", false, "", "", true, strList71);
        boolean boolean74 = csvReadWrite45.registerUser("hi!", "", true, "", "hi!", true, strList71);
        boolean boolean75 = csvReadWrite32.registerUser("", "", false, "hi!", "", false, strList71);
        boolean boolean76 = csvReadWrite19.registerUser("hi!", "", true, "", "", false, strList71);
        boolean boolean77 = csvReadWrite0.registerUser("hi!", "hi!", true, "", "hi!", false, strList71);
        java.util.ArrayList<java.lang.String> strList84 = null;
        boolean boolean85 = csvReadWrite0.registerUser("", "hi!", false, "", "", false, strList84);
        gui.User user88 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(user62);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(user88);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList24 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass27 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass12 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass8 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user27 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass28 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user28 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user33 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass34 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(user33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite17 = new gui.CsvReadWrite();
        csvReadWrite17.updateFacultyNotifications("");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList29 = new java.util.ArrayList<java.lang.String>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList29, strArray28);
        boolean boolean31 = csvReadWrite17.registerUser("", "", false, "hi!", "", false, strList29);
        boolean boolean32 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", false, strList29);
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass6 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.verifyUser("hi!");
        gui.CsvReadWrite csvReadWrite27 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite34 = new gui.CsvReadWrite();
        csvReadWrite34.updateFacultyNotifications("");
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        boolean boolean48 = csvReadWrite34.registerUser("", "", false, "hi!", "", false, strList46);
        boolean boolean49 = csvReadWrite27.registerUser("", "", false, "hi!", "", true, strList46);
        boolean boolean50 = csvReadWrite0.registerUser("hi!", "hi!", true, "", "", false, strList46);
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass57 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("hi!", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass20 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite32 = new gui.CsvReadWrite();
        csvReadWrite32.updateFacultyNotifications("");
        csvReadWrite32.verifyUser("");
        csvReadWrite32.verifyUser("");
        java.util.List<gui.User> userList39 = csvReadWrite32.getUnverifiedUsers();
        gui.User user42 = csvReadWrite32.loginUser("hi!", "hi!");
        csvReadWrite32.updateFacultyNotifications("");
        gui.User user47 = csvReadWrite32.loginUser("hi!", "hi!");
        gui.User user50 = csvReadWrite32.loginUser("", "hi!");
        gui.CsvReadWrite csvReadWrite57 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList58 = csvReadWrite57.getUnverifiedUsers();
        java.util.List<gui.User> userList59 = csvReadWrite57.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite66 = new gui.CsvReadWrite();
        csvReadWrite66.updateFacultyNotifications("");
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        boolean boolean80 = csvReadWrite66.registerUser("", "", false, "hi!", "", false, strList78);
        boolean boolean81 = csvReadWrite57.registerUser("hi!", "hi!", false, "hi!", "", false, strList78);
        boolean boolean82 = csvReadWrite32.registerUser("", "", true, "", "", false, strList78);
        boolean boolean83 = csvReadWrite0.registerUser("hi!", "", false, "", "", true, strList78);
        java.util.List<gui.User> userList84 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass85 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(user42);
        org.junit.Assert.assertNotNull(user47);
        org.junit.Assert.assertNotNull(user50);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(userList84);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user26 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList27 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass32 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user11 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass20 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user15 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        gui.User user20 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.ArrayList<java.lang.String> strList29 = null;
        boolean boolean30 = csvReadWrite0.registerUser("hi!", "", false, "hi!", "", false, strList29);
        gui.User user33 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(user33);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite18 = new gui.CsvReadWrite();
        csvReadWrite18.updateFacultyNotifications("");
        csvReadWrite18.verifyUser("");
        csvReadWrite18.verifyUser("");
        java.util.List<gui.User> userList25 = csvReadWrite18.getUnverifiedUsers();
        gui.User user28 = csvReadWrite18.loginUser("hi!", "");
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        boolean boolean39 = csvReadWrite18.registerUser("", "hi!", false, "", "", true, strList37);
        gui.CsvReadWrite csvReadWrite46 = new gui.CsvReadWrite();
        csvReadWrite46.updateFacultyNotifications("");
        csvReadWrite46.verifyUser("");
        csvReadWrite46.verifyUser("");
        java.util.List<gui.User> userList53 = csvReadWrite46.getUnverifiedUsers();
        gui.User user56 = csvReadWrite46.loginUser("hi!", "");
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        boolean boolean67 = csvReadWrite46.registerUser("", "hi!", false, "", "", true, strList65);
        boolean boolean68 = csvReadWrite18.registerUser("hi!", "hi!", false, "hi!", "", false, strList65);
        boolean boolean69 = csvReadWrite0.registerUser("", "", true, "", "hi!", true, strList65);
        gui.User user72 = csvReadWrite0.loginUser("", "hi!");
        gui.User user75 = csvReadWrite0.loginUser("", "");
        gui.User user78 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass79 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertNotNull(user56);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(user72);
        org.junit.Assert.assertNotNull(user75);
        org.junit.Assert.assertNotNull(user78);
        org.junit.Assert.assertNotNull(wildcardClass79);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user7 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        gui.User user11 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass12 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        csvReadWrite28.verifyUser("");
        csvReadWrite28.verifyUser("");
        java.util.List<gui.User> userList35 = csvReadWrite28.getUnverifiedUsers();
        gui.User user38 = csvReadWrite28.loginUser("hi!", "");
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        boolean boolean49 = csvReadWrite28.registerUser("", "hi!", false, "", "", true, strList47);
        boolean boolean50 = csvReadWrite0.registerUser("hi!", "hi!", false, "hi!", "", false, strList47);
        java.util.List<gui.User> userList51 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass52 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.User user13 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList22 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass23 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList24 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user31 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass32 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user7 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        gui.User user11 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass14 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList26 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList27 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass28 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        boolean boolean42 = csvReadWrite28.registerUser("", "", false, "hi!", "", false, strList40);
        boolean boolean43 = csvReadWrite0.registerUser("hi!", "", false, "", "hi!", true, strList40);
        gui.User user46 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList47 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite54 = new gui.CsvReadWrite();
        csvReadWrite54.updateFacultyNotifications("");
        csvReadWrite54.verifyUser("");
        csvReadWrite54.verifyUser("");
        java.util.List<gui.User> userList61 = csvReadWrite54.getUnverifiedUsers();
        gui.User user64 = csvReadWrite54.loginUser("hi!", "");
        gui.User user67 = csvReadWrite54.loginUser("", "");
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList76 = new java.util.ArrayList<java.lang.String>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList76, strArray75);
        boolean boolean78 = csvReadWrite54.registerUser("", "", false, "hi!", "", false, strList76);
        boolean boolean79 = csvReadWrite0.registerUser("hi!", "", true, "", "hi!", false, strList76);
        java.lang.Class<?> wildcardClass80 = strList76.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(userList61);
        org.junit.Assert.assertNotNull(user64);
        org.junit.Assert.assertNotNull(user67);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.verifyUser("");
        java.util.List<gui.User> userList27 = csvReadWrite20.getUnverifiedUsers();
        gui.User user30 = csvReadWrite20.loginUser("hi!", "");
        java.lang.String[] strArray38 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList39 = new java.util.ArrayList<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList39, strArray38);
        boolean boolean41 = csvReadWrite20.registerUser("", "hi!", false, "", "", true, strList39);
        boolean boolean42 = csvReadWrite13.registerUser("hi!", "", true, "", "hi!", true, strList39);
        boolean boolean43 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList39);
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList46 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass49 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.User user3 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass4 = user3.getClass();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList17 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite24 = new gui.CsvReadWrite();
        csvReadWrite24.updateFacultyNotifications("");
        csvReadWrite24.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite35 = new gui.CsvReadWrite();
        csvReadWrite35.updateFacultyNotifications("");
        csvReadWrite35.verifyUser("");
        csvReadWrite35.verifyUser("");
        java.util.List<gui.User> userList42 = csvReadWrite35.getUnverifiedUsers();
        gui.User user45 = csvReadWrite35.loginUser("hi!", "");
        java.lang.String[] strArray53 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList54 = new java.util.ArrayList<java.lang.String>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList54, strArray53);
        boolean boolean56 = csvReadWrite35.registerUser("", "hi!", false, "", "", true, strList54);
        gui.CsvReadWrite csvReadWrite63 = new gui.CsvReadWrite();
        csvReadWrite63.updateFacultyNotifications("");
        csvReadWrite63.verifyUser("");
        csvReadWrite63.verifyUser("");
        java.util.List<gui.User> userList70 = csvReadWrite63.getUnverifiedUsers();
        gui.User user73 = csvReadWrite63.loginUser("hi!", "");
        java.lang.String[] strArray81 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList82 = new java.util.ArrayList<java.lang.String>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList82, strArray81);
        boolean boolean84 = csvReadWrite63.registerUser("", "hi!", false, "", "", true, strList82);
        boolean boolean85 = csvReadWrite35.registerUser("hi!", "hi!", false, "hi!", "", false, strList82);
        boolean boolean86 = csvReadWrite24.registerUser("hi!", "", true, "", "hi!", false, strList82);
        boolean boolean87 = csvReadWrite0.registerUser("hi!", "", false, "hi!", "hi!", true, strList82);
        gui.User user90 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass91 = user90.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(userList70);
        org.junit.Assert.assertNotNull(user73);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(user90);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user13 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass14 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user6 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        gui.User user11 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList12 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList13 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(userList13);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.updateFacultyNotifications("");
        gui.User user29 = csvReadWrite20.loginUser("", "hi!");
        java.util.List<gui.User> userList30 = csvReadWrite20.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite37 = new gui.CsvReadWrite();
        csvReadWrite37.updateFacultyNotifications("");
        csvReadWrite37.verifyUser("");
        csvReadWrite37.updateFacultyNotifications("");
        gui.User user46 = csvReadWrite37.loginUser("", "hi!");
        java.util.List<gui.User> userList47 = csvReadWrite37.getUnverifiedUsers();
        csvReadWrite37.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite56 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite63 = new gui.CsvReadWrite();
        csvReadWrite63.updateFacultyNotifications("");
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        boolean boolean77 = csvReadWrite63.registerUser("", "", false, "hi!", "", false, strList75);
        boolean boolean78 = csvReadWrite56.registerUser("", "", false, "hi!", "", true, strList75);
        boolean boolean79 = csvReadWrite37.registerUser("", "hi!", true, "", "", false, strList75);
        boolean boolean80 = csvReadWrite20.registerUser("hi!", "", true, "hi!", "hi!", true, strList75);
        boolean boolean81 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList75);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user88 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList89 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass90 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(user88);
        org.junit.Assert.assertNotNull(userList89);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user62 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass65 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(user62);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList26 = csvReadWrite0.getUnverifiedUsers();
        gui.User user29 = csvReadWrite0.loginUser("hi!", "");
        gui.User user32 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass33 = user32.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(user32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass16 = userList15.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user6 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass11 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user11 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass18 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        gui.User user28 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user31 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        gui.User user38 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass39 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass14 = user13.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.updateFacultyNotifications("");
        gui.User user29 = csvReadWrite20.loginUser("", "hi!");
        java.util.List<gui.User> userList30 = csvReadWrite20.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite37 = new gui.CsvReadWrite();
        csvReadWrite37.updateFacultyNotifications("");
        csvReadWrite37.verifyUser("");
        csvReadWrite37.updateFacultyNotifications("");
        gui.User user46 = csvReadWrite37.loginUser("", "hi!");
        java.util.List<gui.User> userList47 = csvReadWrite37.getUnverifiedUsers();
        csvReadWrite37.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite56 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite63 = new gui.CsvReadWrite();
        csvReadWrite63.updateFacultyNotifications("");
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        boolean boolean77 = csvReadWrite63.registerUser("", "", false, "hi!", "", false, strList75);
        boolean boolean78 = csvReadWrite56.registerUser("", "", false, "hi!", "", true, strList75);
        boolean boolean79 = csvReadWrite37.registerUser("", "hi!", true, "", "", false, strList75);
        boolean boolean80 = csvReadWrite20.registerUser("hi!", "", true, "hi!", "hi!", true, strList75);
        boolean boolean81 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList75);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user88 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList89 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList92 = csvReadWrite0.getUnverifiedUsers();
        gui.User user95 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass96 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(user88);
        org.junit.Assert.assertNotNull(userList89);
        org.junit.Assert.assertNotNull(userList92);
        org.junit.Assert.assertNotNull(user95);
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite17 = new gui.CsvReadWrite();
        csvReadWrite17.updateFacultyNotifications("");
        csvReadWrite17.verifyUser("");
        csvReadWrite17.verifyUser("");
        java.util.List<gui.User> userList24 = csvReadWrite17.getUnverifiedUsers();
        gui.User user27 = csvReadWrite17.loginUser("hi!", "hi!");
        csvReadWrite17.updateFacultyNotifications("");
        gui.User user32 = csvReadWrite17.loginUser("hi!", "hi!");
        gui.User user35 = csvReadWrite17.loginUser("", "hi!");
        gui.CsvReadWrite csvReadWrite42 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList43 = csvReadWrite42.getUnverifiedUsers();
        java.util.List<gui.User> userList44 = csvReadWrite42.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite51 = new gui.CsvReadWrite();
        csvReadWrite51.updateFacultyNotifications("");
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        boolean boolean65 = csvReadWrite51.registerUser("", "", false, "hi!", "", false, strList63);
        boolean boolean66 = csvReadWrite42.registerUser("hi!", "hi!", false, "hi!", "", false, strList63);
        boolean boolean67 = csvReadWrite17.registerUser("", "", true, "", "", false, strList63);
        boolean boolean68 = csvReadWrite0.registerUser("", "", false, "hi!", "hi!", true, strList63);
        java.util.List<gui.User> userList69 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass70 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(user32);
        org.junit.Assert.assertNotNull(user35);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertNotNull(userList44);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(userList69);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList24 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user31 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass32 = user31.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user26 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList27 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass28 = userList27.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.updateFacultyNotifications("");
        gui.User user29 = csvReadWrite20.loginUser("", "hi!");
        java.util.List<gui.User> userList30 = csvReadWrite20.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite37 = new gui.CsvReadWrite();
        csvReadWrite37.updateFacultyNotifications("");
        csvReadWrite37.verifyUser("");
        csvReadWrite37.updateFacultyNotifications("");
        gui.User user46 = csvReadWrite37.loginUser("", "hi!");
        java.util.List<gui.User> userList47 = csvReadWrite37.getUnverifiedUsers();
        csvReadWrite37.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite56 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite63 = new gui.CsvReadWrite();
        csvReadWrite63.updateFacultyNotifications("");
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        boolean boolean77 = csvReadWrite63.registerUser("", "", false, "hi!", "", false, strList75);
        boolean boolean78 = csvReadWrite56.registerUser("", "", false, "hi!", "", true, strList75);
        boolean boolean79 = csvReadWrite37.registerUser("", "hi!", true, "", "", false, strList75);
        boolean boolean80 = csvReadWrite20.registerUser("hi!", "", true, "hi!", "hi!", true, strList75);
        boolean boolean81 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList75);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user88 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList89 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass92 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(user88);
        org.junit.Assert.assertNotNull(userList89);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList30 = null;
        boolean boolean31 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", false, strList30);
        gui.CsvReadWrite csvReadWrite38 = new gui.CsvReadWrite();
        csvReadWrite38.updateFacultyNotifications("");
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        boolean boolean52 = csvReadWrite38.registerUser("", "", false, "hi!", "", false, strList50);
        boolean boolean53 = csvReadWrite0.registerUser("hi!", "hi!", true, "", "", false, strList50);
        java.lang.Class<?> wildcardClass54 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass11 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        gui.User user17 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass20 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(user17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        gui.CsvReadWrite csvReadWrite29 = new gui.CsvReadWrite();
        csvReadWrite29.updateFacultyNotifications("");
        csvReadWrite29.verifyUser("");
        csvReadWrite29.verifyUser("");
        java.util.List<gui.User> userList36 = csvReadWrite29.getUnverifiedUsers();
        gui.User user39 = csvReadWrite29.loginUser("hi!", "");
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = csvReadWrite29.registerUser("", "hi!", false, "", "", true, strList48);
        boolean boolean51 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList48);
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass56 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user15 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user18 = csvReadWrite0.loginUser("", "hi!");
        gui.CsvReadWrite csvReadWrite25 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList26 = csvReadWrite25.getUnverifiedUsers();
        java.util.List<gui.User> userList27 = csvReadWrite25.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite34 = new gui.CsvReadWrite();
        csvReadWrite34.updateFacultyNotifications("");
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList46 = new java.util.ArrayList<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList46, strArray45);
        boolean boolean48 = csvReadWrite34.registerUser("", "", false, "hi!", "", false, strList46);
        boolean boolean49 = csvReadWrite25.registerUser("hi!", "hi!", false, "hi!", "", false, strList46);
        boolean boolean50 = csvReadWrite0.registerUser("", "", true, "", "", false, strList46);
        java.lang.Class<?> wildcardClass51 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        gui.CsvReadWrite csvReadWrite29 = new gui.CsvReadWrite();
        csvReadWrite29.updateFacultyNotifications("");
        csvReadWrite29.verifyUser("");
        csvReadWrite29.verifyUser("");
        java.util.List<gui.User> userList36 = csvReadWrite29.getUnverifiedUsers();
        gui.User user39 = csvReadWrite29.loginUser("hi!", "");
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = csvReadWrite29.registerUser("", "hi!", false, "", "", true, strList48);
        boolean boolean51 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList48);
        java.util.List<gui.User> userList52 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass57 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user23 = csvReadWrite0.loginUser("hi!", "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(user23);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        csvReadWrite28.verifyUser("");
        csvReadWrite28.verifyUser("");
        java.util.List<gui.User> userList35 = csvReadWrite28.getUnverifiedUsers();
        gui.User user38 = csvReadWrite28.loginUser("hi!", "");
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        boolean boolean49 = csvReadWrite28.registerUser("", "hi!", false, "", "", true, strList47);
        boolean boolean50 = csvReadWrite0.registerUser("hi!", "hi!", false, "hi!", "", false, strList47);
        java.util.List<gui.User> userList51 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(userList51);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        gui.User user24 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite31 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite38 = new gui.CsvReadWrite();
        csvReadWrite38.updateFacultyNotifications("");
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        boolean boolean52 = csvReadWrite38.registerUser("", "", false, "hi!", "", false, strList50);
        boolean boolean53 = csvReadWrite31.registerUser("", "", false, "hi!", "", true, strList50);
        java.util.List<gui.User> userList54 = csvReadWrite31.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList61 = null;
        boolean boolean62 = csvReadWrite31.registerUser("hi!", "hi!", false, "", "hi!", false, strList61);
        gui.CsvReadWrite csvReadWrite69 = new gui.CsvReadWrite();
        csvReadWrite69.updateFacultyNotifications("");
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        boolean boolean83 = csvReadWrite69.registerUser("", "", false, "hi!", "", false, strList81);
        boolean boolean84 = csvReadWrite31.registerUser("hi!", "hi!", true, "", "", false, strList81);
        boolean boolean85 = csvReadWrite0.registerUser("", "", false, "", "hi!", true, strList81);
        gui.User user88 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("");
        gui.User user93 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(userList54);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(user88);
        org.junit.Assert.assertNotNull(user93);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user15 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        gui.User user20 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.ArrayList<java.lang.String> strList29 = null;
        boolean boolean30 = csvReadWrite0.registerUser("hi!", "", false, "hi!", "", false, strList29);
        gui.User user33 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass34 = user33.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(user33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("hi!");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(user9);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        gui.User user17 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass22 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(user17);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user19 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass20 = user19.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        csvReadWrite0.verifyUser("hi!");
        gui.User user26 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList27 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList28 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass29 = userList28.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user6 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user9 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass11 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user24 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList27 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass28 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList64 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass65 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(userList64);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("", "");
        gui.User user11 = csvReadWrite0.loginUser("", "");
        gui.User user14 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user17 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass18 = user17.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(user17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("", "");
        gui.User user11 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass12 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList13 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList21 = csvReadWrite20.getUnverifiedUsers();
        gui.User user24 = csvReadWrite20.loginUser("hi!", "");
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.updateFacultyNotifications("hi!");
        csvReadWrite20.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite37 = new gui.CsvReadWrite();
        csvReadWrite37.updateFacultyNotifications("");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList49 = new java.util.ArrayList<java.lang.String>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList49, strArray48);
        boolean boolean51 = csvReadWrite37.registerUser("", "", false, "hi!", "", false, strList49);
        boolean boolean52 = csvReadWrite20.registerUser("hi!", "hi!", false, "", "hi!", false, strList49);
        boolean boolean53 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "", true, strList49);
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user60 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass61 = user60.getClass();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(user60);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList28 = csvReadWrite0.getUnverifiedUsers();
        gui.User user31 = csvReadWrite0.loginUser("", "");
        gui.User user34 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass35 = user34.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(user34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList26 = csvReadWrite0.getUnverifiedUsers();
        gui.User user29 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass36 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite18 = new gui.CsvReadWrite();
        csvReadWrite18.updateFacultyNotifications("");
        csvReadWrite18.verifyUser("");
        csvReadWrite18.verifyUser("");
        java.util.List<gui.User> userList25 = csvReadWrite18.getUnverifiedUsers();
        gui.User user28 = csvReadWrite18.loginUser("hi!", "hi!");
        csvReadWrite18.updateFacultyNotifications("");
        gui.User user33 = csvReadWrite18.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite40 = new gui.CsvReadWrite();
        csvReadWrite40.updateFacultyNotifications("");
        csvReadWrite40.verifyUser("");
        csvReadWrite40.updateFacultyNotifications("");
        gui.User user49 = csvReadWrite40.loginUser("", "hi!");
        java.util.List<gui.User> userList50 = csvReadWrite40.getUnverifiedUsers();
        csvReadWrite40.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite59 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite66 = new gui.CsvReadWrite();
        csvReadWrite66.updateFacultyNotifications("");
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        boolean boolean80 = csvReadWrite66.registerUser("", "", false, "hi!", "", false, strList78);
        boolean boolean81 = csvReadWrite59.registerUser("", "", false, "hi!", "", true, strList78);
        boolean boolean82 = csvReadWrite40.registerUser("", "hi!", true, "", "", false, strList78);
        boolean boolean83 = csvReadWrite18.registerUser("", "hi!", false, "hi!", "hi!", false, strList78);
        boolean boolean84 = csvReadWrite0.registerUser("hi!", "hi!", true, "hi!", "", true, strList78);
        java.lang.Class<?> wildcardClass85 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(user33);
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user23 = csvReadWrite0.loginUser("hi!", "");
        gui.CsvReadWrite csvReadWrite30 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList31 = csvReadWrite30.getUnverifiedUsers();
        gui.User user34 = csvReadWrite30.loginUser("hi!", "");
        csvReadWrite30.updateFacultyNotifications("");
        csvReadWrite30.updateFacultyNotifications("hi!");
        csvReadWrite30.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite47 = new gui.CsvReadWrite();
        csvReadWrite47.updateFacultyNotifications("");
        csvReadWrite47.verifyUser("");
        csvReadWrite47.verifyUser("");
        gui.CsvReadWrite csvReadWrite60 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite67 = new gui.CsvReadWrite();
        csvReadWrite67.updateFacultyNotifications("");
        csvReadWrite67.verifyUser("");
        csvReadWrite67.verifyUser("");
        java.util.List<gui.User> userList74 = csvReadWrite67.getUnverifiedUsers();
        gui.User user77 = csvReadWrite67.loginUser("hi!", "");
        java.lang.String[] strArray85 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        boolean boolean88 = csvReadWrite67.registerUser("", "hi!", false, "", "", true, strList86);
        boolean boolean89 = csvReadWrite60.registerUser("hi!", "", true, "", "hi!", true, strList86);
        boolean boolean90 = csvReadWrite47.registerUser("", "", false, "hi!", "", false, strList86);
        boolean boolean91 = csvReadWrite30.registerUser("hi!", "", true, "", "", true, strList86);
        boolean boolean92 = csvReadWrite0.registerUser("hi!", "", false, "hi!", "hi!", false, strList86);
        java.lang.Class<?> wildcardClass93 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(user23);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(user34);
        org.junit.Assert.assertNotNull(userList74);
        org.junit.Assert.assertNotNull(user77);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user6 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        gui.User user11 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user16 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass17 = user16.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user66 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass67 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        gui.User user28 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user31 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        gui.User user38 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList39 = csvReadWrite0.getUnverifiedUsers();
        gui.User user42 = csvReadWrite0.loginUser("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(user42);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.CsvReadWrite csvReadWrite17 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList18 = csvReadWrite17.getUnverifiedUsers();
        gui.User user21 = csvReadWrite17.loginUser("hi!", "");
        csvReadWrite17.updateFacultyNotifications("");
        csvReadWrite17.updateFacultyNotifications("hi!");
        csvReadWrite17.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite34 = new gui.CsvReadWrite();
        csvReadWrite34.updateFacultyNotifications("");
        csvReadWrite34.verifyUser("");
        csvReadWrite34.verifyUser("");
        gui.CsvReadWrite csvReadWrite47 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite54 = new gui.CsvReadWrite();
        csvReadWrite54.updateFacultyNotifications("");
        csvReadWrite54.verifyUser("");
        csvReadWrite54.verifyUser("");
        java.util.List<gui.User> userList61 = csvReadWrite54.getUnverifiedUsers();
        gui.User user64 = csvReadWrite54.loginUser("hi!", "");
        java.lang.String[] strArray72 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        boolean boolean75 = csvReadWrite54.registerUser("", "hi!", false, "", "", true, strList73);
        boolean boolean76 = csvReadWrite47.registerUser("hi!", "", true, "", "hi!", true, strList73);
        boolean boolean77 = csvReadWrite34.registerUser("", "", false, "hi!", "", false, strList73);
        boolean boolean78 = csvReadWrite17.registerUser("hi!", "", true, "", "", true, strList73);
        boolean boolean79 = csvReadWrite0.registerUser("hi!", "", false, "", "hi!", false, strList73);
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(userList61);
        org.junit.Assert.assertNotNull(user64);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.User user3 = csvReadWrite0.loginUser("", "hi!");
        gui.User user6 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite15 = new gui.CsvReadWrite();
        csvReadWrite15.updateFacultyNotifications("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        boolean boolean29 = csvReadWrite15.registerUser("", "", false, "hi!", "", false, strList27);
        boolean boolean30 = csvReadWrite0.registerUser("hi!", "", false, "", "", true, strList27);
        java.lang.Class<?> wildcardClass31 = strList27.getClass();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite18 = new gui.CsvReadWrite();
        csvReadWrite18.updateFacultyNotifications("");
        csvReadWrite18.verifyUser("");
        csvReadWrite18.verifyUser("");
        java.util.List<gui.User> userList25 = csvReadWrite18.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite32 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite39 = new gui.CsvReadWrite();
        csvReadWrite39.updateFacultyNotifications("");
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList51 = new java.util.ArrayList<java.lang.String>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList51, strArray50);
        boolean boolean53 = csvReadWrite39.registerUser("", "", false, "hi!", "", false, strList51);
        boolean boolean54 = csvReadWrite32.registerUser("", "", false, "hi!", "", true, strList51);
        boolean boolean55 = csvReadWrite18.registerUser("", "", false, "", "hi!", false, strList51);
        boolean boolean56 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "", false, strList51);
        java.lang.Class<?> wildcardClass57 = strList51.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user64 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass65 = user64.getClass();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(user64);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        gui.User user28 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass29 = user28.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList26 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList27 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass30 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass12 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        gui.User user5 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user8 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("hi!", "hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user12 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass16 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList28 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass31 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.User user13 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.verifyUser("");
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite40 = new gui.CsvReadWrite();
        csvReadWrite40.updateFacultyNotifications("");
        csvReadWrite40.verifyUser("");
        csvReadWrite40.verifyUser("");
        java.util.List<gui.User> userList47 = csvReadWrite40.getUnverifiedUsers();
        gui.User user50 = csvReadWrite40.loginUser("hi!", "");
        java.lang.String[] strArray58 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList59 = new java.util.ArrayList<java.lang.String>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList59, strArray58);
        boolean boolean61 = csvReadWrite40.registerUser("", "hi!", false, "", "", true, strList59);
        boolean boolean62 = csvReadWrite33.registerUser("hi!", "", true, "", "hi!", true, strList59);
        boolean boolean63 = csvReadWrite20.registerUser("", "", false, "hi!", "", false, strList59);
        boolean boolean64 = csvReadWrite0.registerUser("hi!", "", false, "", "hi!", true, strList59);
        java.util.List<gui.User> userList65 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass66 = userList65.getClass();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(user50);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(userList65);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user9 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass10 = user9.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList30 = null;
        boolean boolean31 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", false, strList30);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass40 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user7 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass12 = userList11.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        gui.CsvReadWrite csvReadWrite29 = new gui.CsvReadWrite();
        csvReadWrite29.updateFacultyNotifications("");
        csvReadWrite29.verifyUser("");
        csvReadWrite29.verifyUser("");
        java.util.List<gui.User> userList36 = csvReadWrite29.getUnverifiedUsers();
        gui.User user39 = csvReadWrite29.loginUser("hi!", "");
        java.lang.String[] strArray47 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = csvReadWrite29.registerUser("", "hi!", false, "", "", true, strList48);
        boolean boolean51 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList48);
        java.util.List<gui.User> userList52 = csvReadWrite0.getUnverifiedUsers();
        gui.User user55 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass56 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(user55);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user7 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        gui.User user11 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass16 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user20 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite27 = new gui.CsvReadWrite();
        csvReadWrite27.updateFacultyNotifications("");
        csvReadWrite27.verifyUser("");
        csvReadWrite27.updateFacultyNotifications("");
        gui.User user36 = csvReadWrite27.loginUser("", "hi!");
        java.util.List<gui.User> userList37 = csvReadWrite27.getUnverifiedUsers();
        gui.User user40 = csvReadWrite27.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite47 = new gui.CsvReadWrite();
        csvReadWrite47.updateFacultyNotifications("");
        csvReadWrite47.verifyUser("");
        csvReadWrite47.verifyUser("");
        gui.CsvReadWrite csvReadWrite60 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite67 = new gui.CsvReadWrite();
        csvReadWrite67.updateFacultyNotifications("");
        csvReadWrite67.verifyUser("");
        csvReadWrite67.verifyUser("");
        java.util.List<gui.User> userList74 = csvReadWrite67.getUnverifiedUsers();
        gui.User user77 = csvReadWrite67.loginUser("hi!", "");
        java.lang.String[] strArray85 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList86 = new java.util.ArrayList<java.lang.String>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList86, strArray85);
        boolean boolean88 = csvReadWrite67.registerUser("", "hi!", false, "", "", true, strList86);
        boolean boolean89 = csvReadWrite60.registerUser("hi!", "", true, "", "hi!", true, strList86);
        boolean boolean90 = csvReadWrite47.registerUser("", "", false, "hi!", "", false, strList86);
        boolean boolean91 = csvReadWrite27.registerUser("hi!", "", false, "", "hi!", true, strList86);
        boolean boolean92 = csvReadWrite0.registerUser("hi!", "", false, "", "hi!", true, strList86);
        gui.User user95 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(user36);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(userList74);
        org.junit.Assert.assertNotNull(user77);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(user95);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList30 = null;
        boolean boolean31 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", false, strList30);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList40 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList41 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList42 = csvReadWrite0.getUnverifiedUsers();
        gui.User user45 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass46 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite11 = new gui.CsvReadWrite();
        csvReadWrite11.updateFacultyNotifications("");
        csvReadWrite11.verifyUser("");
        csvReadWrite11.verifyUser("");
        java.util.List<gui.User> userList18 = csvReadWrite11.getUnverifiedUsers();
        gui.User user21 = csvReadWrite11.loginUser("hi!", "");
        java.lang.String[] strArray29 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        boolean boolean32 = csvReadWrite11.registerUser("", "hi!", false, "", "", true, strList30);
        gui.CsvReadWrite csvReadWrite39 = new gui.CsvReadWrite();
        csvReadWrite39.updateFacultyNotifications("");
        csvReadWrite39.verifyUser("");
        csvReadWrite39.verifyUser("");
        java.util.List<gui.User> userList46 = csvReadWrite39.getUnverifiedUsers();
        gui.User user49 = csvReadWrite39.loginUser("hi!", "");
        java.lang.String[] strArray57 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        boolean boolean60 = csvReadWrite39.registerUser("", "hi!", false, "", "", true, strList58);
        boolean boolean61 = csvReadWrite11.registerUser("hi!", "hi!", false, "hi!", "", false, strList58);
        boolean boolean62 = csvReadWrite0.registerUser("hi!", "", true, "", "hi!", false, strList58);
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass65 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList1);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        gui.User user25 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(user25);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        java.util.List<gui.User> userList20 = csvReadWrite13.getUnverifiedUsers();
        gui.User user23 = csvReadWrite13.loginUser("hi!", "");
        java.lang.String[] strArray31 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList32 = new java.util.ArrayList<java.lang.String>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList32, strArray31);
        boolean boolean34 = csvReadWrite13.registerUser("", "hi!", false, "", "", true, strList32);
        gui.CsvReadWrite csvReadWrite41 = new gui.CsvReadWrite();
        csvReadWrite41.updateFacultyNotifications("");
        csvReadWrite41.verifyUser("");
        csvReadWrite41.verifyUser("");
        java.util.List<gui.User> userList48 = csvReadWrite41.getUnverifiedUsers();
        gui.User user51 = csvReadWrite41.loginUser("hi!", "");
        java.lang.String[] strArray59 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList60 = new java.util.ArrayList<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList60, strArray59);
        boolean boolean62 = csvReadWrite41.registerUser("", "hi!", false, "", "", true, strList60);
        boolean boolean63 = csvReadWrite13.registerUser("hi!", "hi!", false, "hi!", "", false, strList60);
        boolean boolean64 = csvReadWrite0.registerUser("hi!", "", true, "", "", true, strList60);
        gui.User user67 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("");
        gui.User user72 = csvReadWrite0.loginUser("", "hi!");
        java.util.ArrayList<java.lang.String> strList79 = null;
        boolean boolean80 = csvReadWrite0.registerUser("hi!", "hi!", true, "hi!", "hi!", true, strList79);
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(user23);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertNotNull(user51);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(user67);
        org.junit.Assert.assertNotNull(user72);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass15 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass13 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList66 = csvReadWrite0.getUnverifiedUsers();
        gui.User user69 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList70 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(userList66);
        org.junit.Assert.assertNotNull(user69);
        org.junit.Assert.assertNotNull(userList70);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList25 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass26 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList66 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList69 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass70 = userList69.getClass();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(userList66);
        org.junit.Assert.assertNotNull(userList69);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("", "");
        gui.User user11 = csvReadWrite0.loginUser("", "");
        gui.User user14 = csvReadWrite0.loginUser("", "hi!");
        gui.CsvReadWrite csvReadWrite21 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        java.lang.String[] strArray39 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList40 = new java.util.ArrayList<java.lang.String>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList40, strArray39);
        boolean boolean42 = csvReadWrite28.registerUser("", "", false, "hi!", "", false, strList40);
        boolean boolean43 = csvReadWrite21.registerUser("", "", false, "hi!", "", true, strList40);
        java.util.List<gui.User> userList44 = csvReadWrite21.getUnverifiedUsers();
        csvReadWrite21.updateFacultyNotifications("");
        java.util.List<gui.User> userList47 = csvReadWrite21.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite54 = new gui.CsvReadWrite();
        csvReadWrite54.updateFacultyNotifications("");
        csvReadWrite54.verifyUser("");
        csvReadWrite54.verifyUser("");
        java.util.List<gui.User> userList61 = csvReadWrite54.getUnverifiedUsers();
        gui.User user64 = csvReadWrite54.loginUser("hi!", "");
        gui.User user67 = csvReadWrite54.loginUser("", "");
        gui.User user70 = csvReadWrite54.loginUser("", "");
        gui.User user73 = csvReadWrite54.loginUser("", "");
        csvReadWrite54.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite82 = new gui.CsvReadWrite();
        csvReadWrite82.updateFacultyNotifications("");
        java.lang.String[] strArray93 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList94 = new java.util.ArrayList<java.lang.String>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList94, strArray93);
        boolean boolean96 = csvReadWrite82.registerUser("", "", false, "hi!", "", false, strList94);
        boolean boolean97 = csvReadWrite54.registerUser("hi!", "", false, "", "hi!", true, strList94);
        boolean boolean98 = csvReadWrite21.registerUser("", "", false, "hi!", "hi!", true, strList94);
        boolean boolean99 = csvReadWrite0.registerUser("hi!", "", false, "", "", false, strList94);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(userList44);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(userList61);
        org.junit.Assert.assertNotNull(user64);
        org.junit.Assert.assertNotNull(user67);
        org.junit.Assert.assertNotNull(user70);
        org.junit.Assert.assertNotNull(user73);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user24 = csvReadWrite0.loginUser("hi!", "");
        gui.CsvReadWrite csvReadWrite31 = new gui.CsvReadWrite();
        csvReadWrite31.updateFacultyNotifications("");
        csvReadWrite31.verifyUser("");
        csvReadWrite31.updateFacultyNotifications("");
        gui.User user40 = csvReadWrite31.loginUser("", "hi!");
        java.util.List<gui.User> userList41 = csvReadWrite31.getUnverifiedUsers();
        gui.User user44 = csvReadWrite31.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite51 = new gui.CsvReadWrite();
        csvReadWrite51.updateFacultyNotifications("");
        csvReadWrite51.verifyUser("");
        csvReadWrite51.verifyUser("");
        gui.CsvReadWrite csvReadWrite64 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite71 = new gui.CsvReadWrite();
        csvReadWrite71.updateFacultyNotifications("");
        csvReadWrite71.verifyUser("");
        csvReadWrite71.verifyUser("");
        java.util.List<gui.User> userList78 = csvReadWrite71.getUnverifiedUsers();
        gui.User user81 = csvReadWrite71.loginUser("hi!", "");
        java.lang.String[] strArray89 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList90 = new java.util.ArrayList<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList90, strArray89);
        boolean boolean92 = csvReadWrite71.registerUser("", "hi!", false, "", "", true, strList90);
        boolean boolean93 = csvReadWrite64.registerUser("hi!", "", true, "", "hi!", true, strList90);
        boolean boolean94 = csvReadWrite51.registerUser("", "", false, "hi!", "", false, strList90);
        boolean boolean95 = csvReadWrite31.registerUser("hi!", "", false, "", "hi!", true, strList90);
        boolean boolean96 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList90);
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList99 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertNotNull(userList78);
        org.junit.Assert.assertNotNull(user81);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(userList99);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.User user13 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList19 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass23 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.updateFacultyNotifications("");
        gui.User user29 = csvReadWrite20.loginUser("", "hi!");
        java.util.List<gui.User> userList30 = csvReadWrite20.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite37 = new gui.CsvReadWrite();
        csvReadWrite37.updateFacultyNotifications("");
        csvReadWrite37.verifyUser("");
        csvReadWrite37.updateFacultyNotifications("");
        gui.User user46 = csvReadWrite37.loginUser("", "hi!");
        java.util.List<gui.User> userList47 = csvReadWrite37.getUnverifiedUsers();
        csvReadWrite37.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite56 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite63 = new gui.CsvReadWrite();
        csvReadWrite63.updateFacultyNotifications("");
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        boolean boolean77 = csvReadWrite63.registerUser("", "", false, "hi!", "", false, strList75);
        boolean boolean78 = csvReadWrite56.registerUser("", "", false, "hi!", "", true, strList75);
        boolean boolean79 = csvReadWrite37.registerUser("", "hi!", true, "", "", false, strList75);
        boolean boolean80 = csvReadWrite20.registerUser("hi!", "", true, "hi!", "hi!", true, strList75);
        boolean boolean81 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList75);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user88 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList89 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList92 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass93 = userList92.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(user88);
        org.junit.Assert.assertNotNull(userList89);
        org.junit.Assert.assertNotNull(userList92);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass25 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList22 = new java.util.ArrayList<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList22, strArray21);
        boolean boolean24 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList22);
        gui.User user27 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass28 = user27.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass28 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user20 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite29 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList30 = csvReadWrite29.getUnverifiedUsers();
        gui.User user33 = csvReadWrite29.loginUser("hi!", "");
        csvReadWrite29.updateFacultyNotifications("");
        csvReadWrite29.verifyUser("");
        gui.CsvReadWrite csvReadWrite44 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList45 = csvReadWrite44.getUnverifiedUsers();
        java.util.List<gui.User> userList46 = csvReadWrite44.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite53 = new gui.CsvReadWrite();
        csvReadWrite53.updateFacultyNotifications("");
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        boolean boolean67 = csvReadWrite53.registerUser("", "", false, "hi!", "", false, strList65);
        boolean boolean68 = csvReadWrite44.registerUser("hi!", "hi!", false, "hi!", "", false, strList65);
        boolean boolean69 = csvReadWrite29.registerUser("hi!", "", true, "hi!", "hi!", false, strList65);
        boolean boolean70 = csvReadWrite0.registerUser("hi!", "", false, "hi!", "hi!", true, strList65);
        java.lang.Class<?> wildcardClass71 = strList65.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(user33);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite18 = new gui.CsvReadWrite();
        csvReadWrite18.updateFacultyNotifications("");
        csvReadWrite18.verifyUser("");
        csvReadWrite18.verifyUser("");
        java.util.List<gui.User> userList25 = csvReadWrite18.getUnverifiedUsers();
        gui.User user28 = csvReadWrite18.loginUser("hi!", "");
        java.lang.String[] strArray36 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList37 = new java.util.ArrayList<java.lang.String>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList37, strArray36);
        boolean boolean39 = csvReadWrite18.registerUser("", "hi!", false, "", "", true, strList37);
        gui.CsvReadWrite csvReadWrite46 = new gui.CsvReadWrite();
        csvReadWrite46.updateFacultyNotifications("");
        csvReadWrite46.verifyUser("");
        csvReadWrite46.verifyUser("");
        java.util.List<gui.User> userList53 = csvReadWrite46.getUnverifiedUsers();
        gui.User user56 = csvReadWrite46.loginUser("hi!", "");
        java.lang.String[] strArray64 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        boolean boolean67 = csvReadWrite46.registerUser("", "hi!", false, "", "", true, strList65);
        boolean boolean68 = csvReadWrite18.registerUser("hi!", "hi!", false, "hi!", "", false, strList65);
        boolean boolean69 = csvReadWrite0.registerUser("", "", true, "", "hi!", true, strList65);
        gui.User user72 = csvReadWrite0.loginUser("", "hi!");
        gui.User user75 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass76 = user75.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertNotNull(user56);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(user72);
        org.junit.Assert.assertNotNull(user75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user15 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = user15.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user26 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList27 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass30 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        csvReadWrite13.verifyUser("");
        csvReadWrite13.verifyUser("");
        gui.CsvReadWrite csvReadWrite26 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        java.lang.String[] strArray51 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList52 = new java.util.ArrayList<java.lang.String>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList52, strArray51);
        boolean boolean54 = csvReadWrite33.registerUser("", "hi!", false, "", "", true, strList52);
        boolean boolean55 = csvReadWrite26.registerUser("hi!", "", true, "", "hi!", true, strList52);
        boolean boolean56 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList52);
        boolean boolean57 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList52);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user68 = csvReadWrite0.loginUser("", "");
        gui.User user71 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList74 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(user68);
        org.junit.Assert.assertNotNull(user71);
        org.junit.Assert.assertNotNull(userList74);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user15 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        gui.User user20 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user27 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite34 = new gui.CsvReadWrite();
        csvReadWrite34.updateFacultyNotifications("");
        csvReadWrite34.verifyUser("");
        csvReadWrite34.verifyUser("");
        java.util.List<gui.User> userList41 = csvReadWrite34.getUnverifiedUsers();
        gui.User user44 = csvReadWrite34.loginUser("hi!", "hi!");
        csvReadWrite34.updateFacultyNotifications("");
        java.lang.String[] strArray55 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList56 = new java.util.ArrayList<java.lang.String>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList56, strArray55);
        boolean boolean58 = csvReadWrite34.registerUser("", "hi!", false, "", "", true, strList56);
        boolean boolean59 = csvReadWrite0.registerUser("hi!", "", true, "hi!", "hi!", true, strList56);
        java.lang.Class<?> wildcardClass60 = strList56.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass16 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user15 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        gui.User user20 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user27 = csvReadWrite0.loginUser("", "");
        gui.User user30 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass31 = user30.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList26 = csvReadWrite0.getUnverifiedUsers();
        gui.User user29 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass32 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("hi!", "hi!", true, "", "", true, strList19);
        csvReadWrite0.verifyUser("hi!");
        gui.CsvReadWrite csvReadWrite30 = new gui.CsvReadWrite();
        csvReadWrite30.updateFacultyNotifications("");
        java.lang.String[] strArray41 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList42 = new java.util.ArrayList<java.lang.String>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList42, strArray41);
        boolean boolean44 = csvReadWrite30.registerUser("", "", false, "hi!", "", false, strList42);
        csvReadWrite30.updateFacultyNotifications("");
        java.util.List<gui.User> userList47 = csvReadWrite30.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite54 = new gui.CsvReadWrite();
        csvReadWrite54.updateFacultyNotifications("");
        csvReadWrite54.verifyUser("");
        csvReadWrite54.verifyUser("");
        gui.CsvReadWrite csvReadWrite67 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite74 = new gui.CsvReadWrite();
        csvReadWrite74.updateFacultyNotifications("");
        csvReadWrite74.verifyUser("");
        csvReadWrite74.verifyUser("");
        java.util.List<gui.User> userList81 = csvReadWrite74.getUnverifiedUsers();
        gui.User user84 = csvReadWrite74.loginUser("hi!", "");
        java.lang.String[] strArray92 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList93 = new java.util.ArrayList<java.lang.String>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList93, strArray92);
        boolean boolean95 = csvReadWrite74.registerUser("", "hi!", false, "", "", true, strList93);
        boolean boolean96 = csvReadWrite67.registerUser("hi!", "", true, "", "hi!", true, strList93);
        boolean boolean97 = csvReadWrite54.registerUser("", "", false, "hi!", "", false, strList93);
        boolean boolean98 = csvReadWrite30.registerUser("hi!", "", true, "", "hi!", true, strList93);
        boolean boolean99 = csvReadWrite0.registerUser("hi!", "hi!", false, "hi!", "", true, strList93);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(userList81);
        org.junit.Assert.assertNotNull(user84);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
        org.junit.Assert.assertTrue("'" + boolean99 + "' != '" + false + "'", boolean99 == false);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user24 = csvReadWrite0.loginUser("hi!", "");
        gui.CsvReadWrite csvReadWrite31 = new gui.CsvReadWrite();
        csvReadWrite31.updateFacultyNotifications("");
        csvReadWrite31.verifyUser("");
        csvReadWrite31.updateFacultyNotifications("");
        gui.User user40 = csvReadWrite31.loginUser("", "hi!");
        java.util.List<gui.User> userList41 = csvReadWrite31.getUnverifiedUsers();
        gui.User user44 = csvReadWrite31.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite51 = new gui.CsvReadWrite();
        csvReadWrite51.updateFacultyNotifications("");
        csvReadWrite51.verifyUser("");
        csvReadWrite51.verifyUser("");
        gui.CsvReadWrite csvReadWrite64 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite71 = new gui.CsvReadWrite();
        csvReadWrite71.updateFacultyNotifications("");
        csvReadWrite71.verifyUser("");
        csvReadWrite71.verifyUser("");
        java.util.List<gui.User> userList78 = csvReadWrite71.getUnverifiedUsers();
        gui.User user81 = csvReadWrite71.loginUser("hi!", "");
        java.lang.String[] strArray89 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList90 = new java.util.ArrayList<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList90, strArray89);
        boolean boolean92 = csvReadWrite71.registerUser("", "hi!", false, "", "", true, strList90);
        boolean boolean93 = csvReadWrite64.registerUser("hi!", "", true, "", "hi!", true, strList90);
        boolean boolean94 = csvReadWrite51.registerUser("", "", false, "hi!", "", false, strList90);
        boolean boolean95 = csvReadWrite31.registerUser("hi!", "", false, "", "hi!", true, strList90);
        boolean boolean96 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList90);
        csvReadWrite0.verifyUser("hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertNotNull(userList78);
        org.junit.Assert.assertNotNull(user81);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.User user3 = csvReadWrite0.loginUser("", "hi!");
        gui.User user6 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite15 = new gui.CsvReadWrite();
        csvReadWrite15.updateFacultyNotifications("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList27 = new java.util.ArrayList<java.lang.String>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList27, strArray26);
        boolean boolean29 = csvReadWrite15.registerUser("", "", false, "hi!", "", false, strList27);
        boolean boolean30 = csvReadWrite0.registerUser("hi!", "", false, "", "", true, strList27);
        java.lang.Class<?> wildcardClass31 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(user3);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList30 = null;
        boolean boolean31 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", false, strList30);
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList34 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass35 = userList34.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList5 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass6 = userList5.getClass();
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user31 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass32 = user31.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite32 = new gui.CsvReadWrite();
        csvReadWrite32.updateFacultyNotifications("");
        csvReadWrite32.verifyUser("");
        csvReadWrite32.verifyUser("");
        java.util.List<gui.User> userList39 = csvReadWrite32.getUnverifiedUsers();
        gui.User user42 = csvReadWrite32.loginUser("hi!", "hi!");
        csvReadWrite32.updateFacultyNotifications("");
        gui.User user47 = csvReadWrite32.loginUser("hi!", "hi!");
        gui.User user50 = csvReadWrite32.loginUser("", "hi!");
        gui.CsvReadWrite csvReadWrite57 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList58 = csvReadWrite57.getUnverifiedUsers();
        java.util.List<gui.User> userList59 = csvReadWrite57.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite66 = new gui.CsvReadWrite();
        csvReadWrite66.updateFacultyNotifications("");
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        boolean boolean80 = csvReadWrite66.registerUser("", "", false, "hi!", "", false, strList78);
        boolean boolean81 = csvReadWrite57.registerUser("hi!", "hi!", false, "hi!", "", false, strList78);
        boolean boolean82 = csvReadWrite32.registerUser("", "", true, "", "", false, strList78);
        boolean boolean83 = csvReadWrite0.registerUser("hi!", "", false, "", "", true, strList78);
        java.util.List<gui.User> userList84 = csvReadWrite0.getUnverifiedUsers();
        gui.User user87 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(user42);
        org.junit.Assert.assertNotNull(user47);
        org.junit.Assert.assertNotNull(user50);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(userList84);
        org.junit.Assert.assertNotNull(user87);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("hi!", "");
        gui.User user15 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass16 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite17 = new gui.CsvReadWrite();
        csvReadWrite17.updateFacultyNotifications("");
        csvReadWrite17.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        csvReadWrite28.updateFacultyNotifications("");
        csvReadWrite28.verifyUser("");
        csvReadWrite28.verifyUser("");
        java.util.List<gui.User> userList35 = csvReadWrite28.getUnverifiedUsers();
        gui.User user38 = csvReadWrite28.loginUser("hi!", "");
        java.lang.String[] strArray46 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        boolean boolean49 = csvReadWrite28.registerUser("", "hi!", false, "", "", true, strList47);
        gui.CsvReadWrite csvReadWrite56 = new gui.CsvReadWrite();
        csvReadWrite56.updateFacultyNotifications("");
        csvReadWrite56.verifyUser("");
        csvReadWrite56.verifyUser("");
        java.util.List<gui.User> userList63 = csvReadWrite56.getUnverifiedUsers();
        gui.User user66 = csvReadWrite56.loginUser("hi!", "");
        java.lang.String[] strArray74 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        boolean boolean77 = csvReadWrite56.registerUser("", "hi!", false, "", "", true, strList75);
        boolean boolean78 = csvReadWrite28.registerUser("hi!", "hi!", false, "hi!", "", false, strList75);
        boolean boolean79 = csvReadWrite17.registerUser("hi!", "", true, "", "hi!", false, strList75);
        boolean boolean80 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList75);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList87 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(userList63);
        org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(userList87);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user24 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass25 = user24.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.String[] strArray18 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList19);
        gui.User user24 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite31 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite38 = new gui.CsvReadWrite();
        csvReadWrite38.updateFacultyNotifications("");
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        boolean boolean52 = csvReadWrite38.registerUser("", "", false, "hi!", "", false, strList50);
        boolean boolean53 = csvReadWrite31.registerUser("", "", false, "hi!", "", true, strList50);
        java.util.List<gui.User> userList54 = csvReadWrite31.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList61 = null;
        boolean boolean62 = csvReadWrite31.registerUser("hi!", "hi!", false, "", "hi!", false, strList61);
        gui.CsvReadWrite csvReadWrite69 = new gui.CsvReadWrite();
        csvReadWrite69.updateFacultyNotifications("");
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        boolean boolean83 = csvReadWrite69.registerUser("", "", false, "hi!", "", false, strList81);
        boolean boolean84 = csvReadWrite31.registerUser("hi!", "hi!", true, "", "", false, strList81);
        boolean boolean85 = csvReadWrite0.registerUser("", "", false, "", "hi!", true, strList81);
        gui.User user88 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("");
        gui.User user93 = csvReadWrite0.loginUser("", "");
        gui.User user96 = csvReadWrite0.loginUser("", "");
        gui.User user99 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(userList54);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(user88);
        org.junit.Assert.assertNotNull(user93);
        org.junit.Assert.assertNotNull(user96);
        org.junit.Assert.assertNotNull(user99);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite8 = new gui.CsvReadWrite();
        csvReadWrite8.updateFacultyNotifications("");
        java.util.List<gui.User> userList11 = csvReadWrite8.getUnverifiedUsers();
        csvReadWrite8.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.verifyUser("");
        java.util.List<gui.User> userList27 = csvReadWrite20.getUnverifiedUsers();
        java.util.List<gui.User> userList28 = csvReadWrite20.getUnverifiedUsers();
        java.util.List<gui.User> userList29 = csvReadWrite20.getUnverifiedUsers();
        gui.User user32 = csvReadWrite20.loginUser("", "hi!");
        gui.CsvReadWrite csvReadWrite39 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite46 = new gui.CsvReadWrite();
        csvReadWrite46.updateFacultyNotifications("");
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        boolean boolean60 = csvReadWrite46.registerUser("", "", false, "hi!", "", false, strList58);
        boolean boolean61 = csvReadWrite39.registerUser("", "", false, "hi!", "", true, strList58);
        gui.CsvReadWrite csvReadWrite68 = new gui.CsvReadWrite();
        csvReadWrite68.updateFacultyNotifications("");
        csvReadWrite68.verifyUser("");
        csvReadWrite68.verifyUser("");
        java.util.List<gui.User> userList75 = csvReadWrite68.getUnverifiedUsers();
        gui.User user78 = csvReadWrite68.loginUser("hi!", "");
        java.lang.String[] strArray86 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        boolean boolean89 = csvReadWrite68.registerUser("", "hi!", false, "", "", true, strList87);
        boolean boolean90 = csvReadWrite39.registerUser("", "hi!", true, "", "", false, strList87);
        boolean boolean91 = csvReadWrite20.registerUser("hi!", "hi!", false, "", "", true, strList87);
        boolean boolean92 = csvReadWrite8.registerUser("hi!", "", false, "hi!", "", false, strList87);
        boolean boolean93 = csvReadWrite0.registerUser("hi!", "", false, "hi!", "", false, strList87);
        java.util.List<gui.User> userList94 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass95 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(user32);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(userList75);
        org.junit.Assert.assertNotNull(user78);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(userList94);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite15 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList16 = csvReadWrite15.getUnverifiedUsers();
        java.util.List<gui.User> userList17 = csvReadWrite15.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite24 = new gui.CsvReadWrite();
        csvReadWrite24.updateFacultyNotifications("");
        java.lang.String[] strArray35 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        boolean boolean38 = csvReadWrite24.registerUser("", "", false, "hi!", "", false, strList36);
        boolean boolean39 = csvReadWrite15.registerUser("hi!", "hi!", false, "hi!", "", false, strList36);
        boolean boolean40 = csvReadWrite0.registerUser("hi!", "", true, "hi!", "hi!", false, strList36);
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite49 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList50 = csvReadWrite49.getUnverifiedUsers();
        gui.User user53 = csvReadWrite49.loginUser("hi!", "");
        csvReadWrite49.updateFacultyNotifications("");
        csvReadWrite49.verifyUser("");
        gui.CsvReadWrite csvReadWrite64 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList65 = csvReadWrite64.getUnverifiedUsers();
        java.util.List<gui.User> userList66 = csvReadWrite64.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite73 = new gui.CsvReadWrite();
        csvReadWrite73.updateFacultyNotifications("");
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        boolean boolean87 = csvReadWrite73.registerUser("", "", false, "hi!", "", false, strList85);
        boolean boolean88 = csvReadWrite64.registerUser("hi!", "hi!", false, "hi!", "", false, strList85);
        boolean boolean89 = csvReadWrite49.registerUser("hi!", "", true, "hi!", "hi!", false, strList85);
        boolean boolean90 = csvReadWrite0.registerUser("", "hi!", true, "hi!", "", true, strList85);
        gui.User user93 = csvReadWrite0.loginUser("hi!", "hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertNotNull(user53);
        org.junit.Assert.assertNotNull(userList65);
        org.junit.Assert.assertNotNull(userList66);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(user93);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite27 = new gui.CsvReadWrite();
        csvReadWrite27.updateFacultyNotifications("");
        csvReadWrite27.verifyUser("");
        csvReadWrite27.verifyUser("");
        java.util.List<gui.User> userList34 = csvReadWrite27.getUnverifiedUsers();
        gui.User user37 = csvReadWrite27.loginUser("hi!", "");
        java.util.List<gui.User> userList38 = csvReadWrite27.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite45 = new gui.CsvReadWrite();
        csvReadWrite45.updateFacultyNotifications("");
        csvReadWrite45.verifyUser("");
        csvReadWrite45.verifyUser("");
        java.util.List<gui.User> userList52 = csvReadWrite45.getUnverifiedUsers();
        gui.User user55 = csvReadWrite45.loginUser("hi!", "");
        java.lang.String[] strArray63 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        boolean boolean66 = csvReadWrite45.registerUser("", "hi!", false, "", "", true, strList64);
        gui.CsvReadWrite csvReadWrite73 = new gui.CsvReadWrite();
        csvReadWrite73.updateFacultyNotifications("");
        csvReadWrite73.verifyUser("");
        csvReadWrite73.verifyUser("");
        java.util.List<gui.User> userList80 = csvReadWrite73.getUnverifiedUsers();
        gui.User user83 = csvReadWrite73.loginUser("hi!", "");
        java.lang.String[] strArray91 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList92 = new java.util.ArrayList<java.lang.String>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList92, strArray91);
        boolean boolean94 = csvReadWrite73.registerUser("", "hi!", false, "", "", true, strList92);
        boolean boolean95 = csvReadWrite45.registerUser("hi!", "hi!", false, "hi!", "", false, strList92);
        boolean boolean96 = csvReadWrite27.registerUser("", "", true, "", "hi!", true, strList92);
        boolean boolean97 = csvReadWrite0.registerUser("", "", true, "", "", false, strList92);
        java.lang.Class<?> wildcardClass98 = strList92.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(user37);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(user55);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(userList80);
        org.junit.Assert.assertNotNull(user83);
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(wildcardClass98);
    }
}
