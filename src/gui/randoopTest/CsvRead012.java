package gui.randoopTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CsvRead012 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
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
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user66 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user69 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList70 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList36);
// flaky:         org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(userList55);
// flaky:         org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertNotNull(user69);
        org.junit.Assert.assertNotNull(userList70);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
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
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user28 = csvReadWrite0.loginUser("", "");
        gui.User user31 = csvReadWrite0.loginUser("hi!", "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
// flaky:         org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(user28);
// flaky:         org.junit.Assert.assertNotNull(user31);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user11 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList14 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList17 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass20 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
// flaky:         org.junit.Assert.assertNotNull(user4);
// flaky:         org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList19 = csvReadWrite0.getUnverifiedUsers();
        gui.User user22 = csvReadWrite0.loginUser("", "hi!");
        gui.User user25 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList30 = csvReadWrite0.getUnverifiedUsers();
        gui.User user33 = csvReadWrite0.loginUser("", "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
// flaky:         org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(user33);
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
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
        gui.CsvReadWrite csvReadWrite36 = new gui.CsvReadWrite();
        csvReadWrite36.updateFacultyNotifications("");
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = csvReadWrite36.registerUser("", "", false, "hi!", "", false, strList48);
        boolean boolean51 = csvReadWrite29.registerUser("", "", false, "hi!", "", true, strList48);
        java.util.List<gui.User> userList52 = csvReadWrite29.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList59 = null;
        boolean boolean60 = csvReadWrite29.registerUser("hi!", "hi!", false, "", "hi!", false, strList59);
        gui.CsvReadWrite csvReadWrite67 = new gui.CsvReadWrite();
        csvReadWrite67.updateFacultyNotifications("");
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        boolean boolean81 = csvReadWrite67.registerUser("", "", false, "hi!", "", false, strList79);
        boolean boolean82 = csvReadWrite29.registerUser("hi!", "hi!", true, "", "", false, strList79);
        boolean boolean83 = csvReadWrite0.registerUser("hi!", "", true, "", "hi!", false, strList79);
        java.util.List<gui.User> userList84 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user91 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList92 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(userList52);
// flaky:         org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(userList84);
        org.junit.Assert.assertNotNull(user91);
        org.junit.Assert.assertNotNull(userList92);
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        gui.User user11 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList14 = csvReadWrite0.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList21 = null;
        boolean boolean22 = csvReadWrite0.registerUser("", "", true, "hi!", "", true, strList21);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.verifyUser("");
        csvReadWrite20.updateFacultyNotifications("");
        gui.User user29 = csvReadWrite20.loginUser("", "hi!");
        java.util.List<gui.User> userList30 = csvReadWrite20.getUnverifiedUsers();
        gui.User user33 = csvReadWrite20.loginUser("hi!", "hi!");
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite46 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList47 = csvReadWrite46.getUnverifiedUsers();
        gui.User user50 = csvReadWrite46.loginUser("hi!", "");
        csvReadWrite46.updateFacultyNotifications("");
        csvReadWrite46.updateFacultyNotifications("hi!");
        csvReadWrite46.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite63 = new gui.CsvReadWrite();
        csvReadWrite63.updateFacultyNotifications("");
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        boolean boolean77 = csvReadWrite63.registerUser("", "", false, "hi!", "", false, strList75);
        boolean boolean78 = csvReadWrite46.registerUser("hi!", "hi!", false, "", "hi!", false, strList75);
        boolean boolean79 = csvReadWrite20.registerUser("", "hi!", true, "hi!", "", false, strList75);
        boolean boolean80 = csvReadWrite0.registerUser("hi!", "", true, "hi!", "hi!", false, strList75);
        gui.User user83 = csvReadWrite0.loginUser("", "hi!");
        gui.User user86 = csvReadWrite0.loginUser("hi!", "");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(user33);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(user50);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(user83);
        org.junit.Assert.assertNotNull(user86);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
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
        gui.User user69 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user72 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertNotNull(user69);
        org.junit.Assert.assertNotNull(user72);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite25 = new gui.CsvReadWrite();
        csvReadWrite25.updateFacultyNotifications("");
        csvReadWrite25.verifyUser("");
        csvReadWrite25.verifyUser("");
        java.util.List<gui.User> userList32 = csvReadWrite25.getUnverifiedUsers();
        gui.User user35 = csvReadWrite25.loginUser("hi!", "hi!");
        csvReadWrite25.updateFacultyNotifications("");
        gui.User user40 = csvReadWrite25.loginUser("hi!", "hi!");
        gui.User user43 = csvReadWrite25.loginUser("", "hi!");
        gui.CsvReadWrite csvReadWrite50 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList51 = csvReadWrite50.getUnverifiedUsers();
        java.util.List<gui.User> userList52 = csvReadWrite50.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite59 = new gui.CsvReadWrite();
        csvReadWrite59.updateFacultyNotifications("");
        java.lang.String[] strArray70 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList71 = new java.util.ArrayList<java.lang.String>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList71, strArray70);
        boolean boolean73 = csvReadWrite59.registerUser("", "", false, "hi!", "", false, strList71);
        boolean boolean74 = csvReadWrite50.registerUser("hi!", "hi!", false, "hi!", "", false, strList71);
        boolean boolean75 = csvReadWrite25.registerUser("", "", true, "", "", false, strList71);
        boolean boolean76 = csvReadWrite0.registerUser("hi!", "hi!", true, "", "hi!", false, strList71);
        java.lang.Class<?> wildcardClass77 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(user35);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
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
        gui.CsvReadWrite csvReadWrite32 = new gui.CsvReadWrite();
        csvReadWrite32.updateFacultyNotifications("");
        csvReadWrite32.verifyUser("");
        csvReadWrite32.verifyUser("");
        java.util.List<gui.User> userList39 = csvReadWrite32.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite46 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite53 = new gui.CsvReadWrite();
        csvReadWrite53.updateFacultyNotifications("");
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList65 = new java.util.ArrayList<java.lang.String>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList65, strArray64);
        boolean boolean67 = csvReadWrite53.registerUser("", "", false, "hi!", "", false, strList65);
        boolean boolean68 = csvReadWrite46.registerUser("", "", false, "hi!", "", true, strList65);
        boolean boolean69 = csvReadWrite32.registerUser("", "", false, "", "hi!", false, strList65);
        boolean boolean70 = csvReadWrite0.registerUser("", "", true, "", "", true, strList65);
        csvReadWrite0.verifyUser("");
        gui.User user75 = csvReadWrite0.loginUser("", "");
        gui.User user78 = csvReadWrite0.loginUser("hi!", "");
        gui.User user81 = csvReadWrite0.loginUser("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(user75);
        org.junit.Assert.assertNotNull(user78);
        org.junit.Assert.assertNotNull(user81);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("", "");
        gui.User user11 = csvReadWrite0.loginUser("", "");
        gui.User user14 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        gui.User user11 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.verifyUser("");
        gui.User user16 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(user16);
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite12 = new gui.CsvReadWrite();
        csvReadWrite12.updateFacultyNotifications("");
        csvReadWrite12.verifyUser("");
        csvReadWrite12.verifyUser("");
        java.util.List<gui.User> userList19 = csvReadWrite12.getUnverifiedUsers();
        java.util.List<gui.User> userList20 = csvReadWrite12.getUnverifiedUsers();
        java.util.List<gui.User> userList21 = csvReadWrite12.getUnverifiedUsers();
        java.util.List<gui.User> userList22 = csvReadWrite12.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite29 = new gui.CsvReadWrite();
        csvReadWrite29.updateFacultyNotifications("");
        csvReadWrite29.verifyUser("");
        csvReadWrite29.verifyUser("");
        java.util.List<gui.User> userList36 = csvReadWrite29.getUnverifiedUsers();
        java.util.List<gui.User> userList37 = csvReadWrite29.getUnverifiedUsers();
        java.util.List<gui.User> userList38 = csvReadWrite29.getUnverifiedUsers();
        gui.User user41 = csvReadWrite29.loginUser("hi!", "");
        gui.User user44 = csvReadWrite29.loginUser("hi!", "");
        gui.CsvReadWrite csvReadWrite51 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList52 = csvReadWrite51.getUnverifiedUsers();
        gui.User user55 = csvReadWrite51.loginUser("hi!", "");
        csvReadWrite51.updateFacultyNotifications("");
        csvReadWrite51.verifyUser("");
        gui.CsvReadWrite csvReadWrite66 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList67 = csvReadWrite66.getUnverifiedUsers();
        java.util.List<gui.User> userList68 = csvReadWrite66.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite75 = new gui.CsvReadWrite();
        csvReadWrite75.updateFacultyNotifications("");
        java.lang.String[] strArray86 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        boolean boolean89 = csvReadWrite75.registerUser("", "", false, "hi!", "", false, strList87);
        boolean boolean90 = csvReadWrite66.registerUser("hi!", "hi!", false, "hi!", "", false, strList87);
        boolean boolean91 = csvReadWrite51.registerUser("hi!", "", true, "hi!", "hi!", false, strList87);
        boolean boolean92 = csvReadWrite29.registerUser("", "hi!", true, "", "", false, strList87);
        boolean boolean93 = csvReadWrite12.registerUser("", "", false, "hi!", "", true, strList87);
        boolean boolean94 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", true, strList87);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userList37);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(user41);
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertNotNull(user55);
        org.junit.Assert.assertNotNull(userList67);
        org.junit.Assert.assertNotNull(userList68);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        gui.User user13 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user18 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass21 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
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
        gui.User user29 = csvReadWrite0.loginUser("hi!", "");
        gui.User user32 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(user32);
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite19 = new gui.CsvReadWrite();
        csvReadWrite19.updateFacultyNotifications("");
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        boolean boolean33 = csvReadWrite19.registerUser("", "", false, "hi!", "", false, strList31);
        csvReadWrite19.updateFacultyNotifications("");
        java.util.List<gui.User> userList36 = csvReadWrite19.getUnverifiedUsers();
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
        boolean boolean87 = csvReadWrite19.registerUser("hi!", "", true, "", "hi!", true, strList82);
        boolean boolean88 = csvReadWrite0.registerUser("", "hi!", false, "", "hi!", true, strList82);
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList91 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user98 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(userList70);
        org.junit.Assert.assertNotNull(user73);
        org.junit.Assert.assertNotNull(strArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(userList91);
        org.junit.Assert.assertNotNull(user98);
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user7 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        gui.User user11 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user18 = csvReadWrite0.loginUser("", "hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(user18);
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user11 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user16 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList17 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList22 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList22);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
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
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite38 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite45 = new gui.CsvReadWrite();
        csvReadWrite45.updateFacultyNotifications("");
        java.lang.String[] strArray56 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList57 = new java.util.ArrayList<java.lang.String>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList57, strArray56);
        boolean boolean59 = csvReadWrite45.registerUser("", "", false, "hi!", "", false, strList57);
        boolean boolean60 = csvReadWrite38.registerUser("", "", false, "hi!", "", true, strList57);
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
        boolean boolean89 = csvReadWrite38.registerUser("", "hi!", true, "", "", false, strList86);
        boolean boolean90 = csvReadWrite0.registerUser("hi!", "", true, "hi!", "", true, strList86);
        java.lang.Class<?> wildcardClass91 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(userList74);
        org.junit.Assert.assertNotNull(user77);
        org.junit.Assert.assertNotNull(strArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user16 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user21 = csvReadWrite0.loginUser("", "");
        gui.User user24 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList27 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList3 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList3);
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
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
        gui.User user91 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user96 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass97 = csvReadWrite0.getClass();
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
        org.junit.Assert.assertNotNull(user91);
        org.junit.Assert.assertNotNull(user96);
        org.junit.Assert.assertNotNull(wildcardClass97);
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
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
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user70 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
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
        org.junit.Assert.assertNotNull(user70);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
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
        gui.User user44 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass45 = user44.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user15 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList18 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        gui.User user11 = csvReadWrite0.loginUser("", "");
        gui.User user14 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
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
        java.lang.Class<?> wildcardClass71 = csvReadWrite0.getClass();
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
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite21 = new gui.CsvReadWrite();
        csvReadWrite21.updateFacultyNotifications("");
        csvReadWrite21.verifyUser("");
        csvReadWrite21.verifyUser("");
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
        boolean boolean78 = csvReadWrite21.registerUser("hi!", "", true, "", "", false, strList73);
        boolean boolean79 = csvReadWrite0.registerUser("", "hi!", true, "", "", true, strList73);
        java.lang.Class<?> wildcardClass80 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList61);
        org.junit.Assert.assertNotNull(user64);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
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
        csvReadWrite0.verifyUser("hi!");
        gui.User user27 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList28 = csvReadWrite0.getUnverifiedUsers();
        gui.User user31 = csvReadWrite0.loginUser("", "hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(user31);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
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
        java.util.List<gui.User> userList34 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList35 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user6 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(userList9);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user7 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user22 = csvReadWrite0.loginUser("hi!", "hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(user22);
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList19 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList22 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList24 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList24);
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user14 = csvReadWrite0.loginUser("hi!", "hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user14);
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
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
        csvReadWrite0.verifyUser("hi!");
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
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user15 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        gui.User user20 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList21 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user30 = csvReadWrite0.loginUser("", "hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(userList21);
        org.junit.Assert.assertNotNull(user30);
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
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
        gui.User user26 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(user23);
        org.junit.Assert.assertNotNull(user26);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
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
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass35 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("hi!", "");
        gui.CsvReadWrite csvReadWrite19 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList20 = csvReadWrite19.getUnverifiedUsers();
        csvReadWrite19.verifyUser("hi!");
        gui.User user25 = csvReadWrite19.loginUser("hi!", "hi!");
        csvReadWrite19.verifyUser("");
        gui.User user30 = csvReadWrite19.loginUser("", "");
        java.util.List<gui.User> userList31 = csvReadWrite19.getUnverifiedUsers();
        gui.User user34 = csvReadWrite19.loginUser("hi!", "");
        gui.CsvReadWrite csvReadWrite41 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList42 = csvReadWrite41.getUnverifiedUsers();
        gui.User user45 = csvReadWrite41.loginUser("hi!", "");
        csvReadWrite41.updateFacultyNotifications("");
        csvReadWrite41.verifyUser("");
        gui.CsvReadWrite csvReadWrite56 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList57 = csvReadWrite56.getUnverifiedUsers();
        java.util.List<gui.User> userList58 = csvReadWrite56.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite65 = new gui.CsvReadWrite();
        csvReadWrite65.updateFacultyNotifications("");
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList77 = new java.util.ArrayList<java.lang.String>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList77, strArray76);
        boolean boolean79 = csvReadWrite65.registerUser("", "", false, "hi!", "", false, strList77);
        boolean boolean80 = csvReadWrite56.registerUser("hi!", "hi!", false, "hi!", "", false, strList77);
        boolean boolean81 = csvReadWrite41.registerUser("hi!", "", true, "hi!", "hi!", false, strList77);
        boolean boolean82 = csvReadWrite19.registerUser("hi!", "hi!", true, "", "", true, strList77);
        boolean boolean83 = csvReadWrite0.registerUser("hi!", "hi!", true, "hi!", "", false, strList77);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(user34);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertNotNull(userList57);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(strArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite18 = new gui.CsvReadWrite();
        csvReadWrite18.updateFacultyNotifications("");
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList30 = new java.util.ArrayList<java.lang.String>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList30, strArray29);
        boolean boolean32 = csvReadWrite18.registerUser("", "", false, "hi!", "", false, strList30);
        java.util.List<gui.User> userList33 = csvReadWrite18.getUnverifiedUsers();
        csvReadWrite18.updateFacultyNotifications("hi!");
        gui.User user38 = csvReadWrite18.loginUser("", "");
        csvReadWrite18.updateFacultyNotifications("");
        gui.User user43 = csvReadWrite18.loginUser("hi!", "hi!");
        csvReadWrite18.verifyUser("");
        gui.CsvReadWrite csvReadWrite52 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList53 = csvReadWrite52.getUnverifiedUsers();
        java.util.List<gui.User> userList54 = csvReadWrite52.getUnverifiedUsers();
        csvReadWrite52.updateFacultyNotifications("hi!");
        csvReadWrite52.verifyUser("");
        java.util.List<gui.User> userList59 = csvReadWrite52.getUnverifiedUsers();
        gui.User user62 = csvReadWrite52.loginUser("hi!", "hi!");
        csvReadWrite52.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite71 = new gui.CsvReadWrite();
        csvReadWrite71.updateFacultyNotifications("");
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        boolean boolean85 = csvReadWrite71.registerUser("", "", false, "hi!", "", false, strList83);
        boolean boolean86 = csvReadWrite52.registerUser("", "", true, "", "hi!", true, strList83);
        boolean boolean87 = csvReadWrite18.registerUser("", "hi!", true, "hi!", "hi!", true, strList83);
        boolean boolean88 = csvReadWrite0.registerUser("", "hi!", true, "", "hi!", true, strList83);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertNotNull(userList54);
        org.junit.Assert.assertNotNull(userList59);
        org.junit.Assert.assertNotNull(user62);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
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
        gui.User user21 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList22 = csvReadWrite0.getUnverifiedUsers();
        gui.User user25 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList28 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertNotNull(userList28);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
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
        gui.User user58 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList61 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
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
        org.junit.Assert.assertNotNull(userList61);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList4 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        boolean boolean27 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList25);
        java.util.List<gui.User> userList28 = csvReadWrite13.getUnverifiedUsers();
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
        boolean boolean79 = csvReadWrite13.registerUser("", "hi!", true, "hi!", "", true, strList74);
        boolean boolean80 = csvReadWrite0.registerUser("hi!", "", false, "", "hi!", false, strList74);
        java.util.List<gui.User> userList81 = csvReadWrite0.getUnverifiedUsers();
        gui.User user84 = csvReadWrite0.loginUser("", "hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(user65);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(userList81);
        org.junit.Assert.assertNotNull(user84);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
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
        csvReadWrite24.verifyUser("");
        csvReadWrite24.verifyUser("");
        gui.CsvReadWrite csvReadWrite37 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite44 = new gui.CsvReadWrite();
        csvReadWrite44.updateFacultyNotifications("");
        csvReadWrite44.verifyUser("");
        csvReadWrite44.verifyUser("");
        java.util.List<gui.User> userList51 = csvReadWrite44.getUnverifiedUsers();
        gui.User user54 = csvReadWrite44.loginUser("hi!", "");
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        boolean boolean65 = csvReadWrite44.registerUser("", "hi!", false, "", "", true, strList63);
        boolean boolean66 = csvReadWrite37.registerUser("hi!", "", true, "", "hi!", true, strList63);
        boolean boolean67 = csvReadWrite24.registerUser("", "", false, "hi!", "", false, strList63);
        boolean boolean68 = csvReadWrite0.registerUser("hi!", "", true, "", "hi!", true, strList63);
        gui.User user71 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList72 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList73 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        gui.User user78 = csvReadWrite0.loginUser("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertNotNull(user54);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(user71);
        org.junit.Assert.assertNotNull(userList72);
        org.junit.Assert.assertNotNull(userList73);
        org.junit.Assert.assertNotNull(user78);
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
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
        csvReadWrite0.verifyUser("");
        gui.User user82 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
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
        org.junit.Assert.assertNotNull(user82);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        gui.CsvReadWrite csvReadWrite23 = new gui.CsvReadWrite();
        csvReadWrite23.updateFacultyNotifications("");
        csvReadWrite23.verifyUser("");
        csvReadWrite23.updateFacultyNotifications("");
        gui.User user32 = csvReadWrite23.loginUser("", "hi!");
        java.util.List<gui.User> userList33 = csvReadWrite23.getUnverifiedUsers();
        csvReadWrite23.updateFacultyNotifications("");
        java.util.List<gui.User> userList36 = csvReadWrite23.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite43 = new gui.CsvReadWrite();
        csvReadWrite43.updateFacultyNotifications("");
        csvReadWrite43.verifyUser("");
        csvReadWrite43.updateFacultyNotifications("");
        gui.User user52 = csvReadWrite43.loginUser("", "hi!");
        java.util.List<gui.User> userList53 = csvReadWrite43.getUnverifiedUsers();
        csvReadWrite43.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite62 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite69 = new gui.CsvReadWrite();
        csvReadWrite69.updateFacultyNotifications("");
        java.lang.String[] strArray80 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList81 = new java.util.ArrayList<java.lang.String>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList81, strArray80);
        boolean boolean83 = csvReadWrite69.registerUser("", "", false, "hi!", "", false, strList81);
        boolean boolean84 = csvReadWrite62.registerUser("", "", false, "hi!", "", true, strList81);
        boolean boolean85 = csvReadWrite43.registerUser("", "hi!", true, "", "", false, strList81);
        boolean boolean86 = csvReadWrite23.registerUser("", "", false, "", "", false, strList81);
        boolean boolean87 = csvReadWrite0.registerUser("hi!", "hi!", true, "", "", false, strList81);
        java.util.List<gui.User> userList88 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user32);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(user52);
        org.junit.Assert.assertNotNull(userList53);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(userList88);
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
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
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite36 = new gui.CsvReadWrite();
        csvReadWrite36.updateFacultyNotifications("");
        csvReadWrite36.verifyUser("");
        csvReadWrite36.updateFacultyNotifications("");
        gui.User user45 = csvReadWrite36.loginUser("", "hi!");
        java.util.List<gui.User> userList46 = csvReadWrite36.getUnverifiedUsers();
        csvReadWrite36.updateFacultyNotifications("");
        java.util.List<gui.User> userList49 = csvReadWrite36.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite56 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList57 = csvReadWrite56.getUnverifiedUsers();
        gui.User user60 = csvReadWrite56.loginUser("hi!", "");
        csvReadWrite56.updateFacultyNotifications("");
        csvReadWrite56.updateFacultyNotifications("hi!");
        csvReadWrite56.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite73 = new gui.CsvReadWrite();
        csvReadWrite73.updateFacultyNotifications("");
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        boolean boolean87 = csvReadWrite73.registerUser("", "", false, "hi!", "", false, strList85);
        boolean boolean88 = csvReadWrite56.registerUser("hi!", "hi!", false, "", "hi!", false, strList85);
        boolean boolean89 = csvReadWrite36.registerUser("hi!", "hi!", false, "", "", true, strList85);
        boolean boolean90 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList85);
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertNotNull(userList57);
        org.junit.Assert.assertNotNull(user60);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        gui.User user13 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList17 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList18 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass21 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
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
        java.util.List<gui.User> userList58 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user63 = csvReadWrite0.loginUser("hi!", "");
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
        org.junit.Assert.assertNotNull(userList55);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(user63);
        org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList6 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass11 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
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
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user24 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(user24);
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user15 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        gui.User user20 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass25 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList26 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList27 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite34 = new gui.CsvReadWrite();
        gui.User user37 = csvReadWrite34.loginUser("", "hi!");
        csvReadWrite34.updateFacultyNotifications("");
        java.util.List<gui.User> userList40 = csvReadWrite34.getUnverifiedUsers();
        csvReadWrite34.verifyUser("");
        csvReadWrite34.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite51 = new gui.CsvReadWrite();
        gui.User user54 = csvReadWrite51.loginUser("", "hi!");
        gui.User user57 = csvReadWrite51.loginUser("", "hi!");
        csvReadWrite51.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite66 = new gui.CsvReadWrite();
        csvReadWrite66.updateFacultyNotifications("");
        java.lang.String[] strArray77 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        boolean boolean80 = csvReadWrite66.registerUser("", "", false, "hi!", "", false, strList78);
        boolean boolean81 = csvReadWrite51.registerUser("hi!", "", false, "", "", true, strList78);
        boolean boolean82 = csvReadWrite34.registerUser("hi!", "", false, "", "hi!", true, strList78);
        boolean boolean83 = csvReadWrite0.registerUser("hi!", "hi!", false, "hi!", "", true, strList78);
        java.util.List<gui.User> userList84 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(user37);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user54);
        org.junit.Assert.assertNotNull(user57);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(userList84);
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite19 = new gui.CsvReadWrite();
        csvReadWrite19.updateFacultyNotifications("");
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        boolean boolean33 = csvReadWrite19.registerUser("", "", false, "hi!", "", false, strList31);
        boolean boolean34 = csvReadWrite0.registerUser("hi!", "", true, "", "", true, strList31);
        java.util.List<gui.User> userList35 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
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
        gui.User user59 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList64 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList69 = csvReadWrite0.getUnverifiedUsers();
        gui.User user72 = csvReadWrite0.loginUser("hi!", "");
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
        org.junit.Assert.assertNotNull(user59);
        org.junit.Assert.assertNotNull(userList64);
        org.junit.Assert.assertNotNull(userList69);
        org.junit.Assert.assertNotNull(user72);
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
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
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass91 = csvReadWrite0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
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
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
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
        gui.CsvReadWrite csvReadWrite36 = new gui.CsvReadWrite();
        csvReadWrite36.updateFacultyNotifications("");
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList48 = new java.util.ArrayList<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList48, strArray47);
        boolean boolean50 = csvReadWrite36.registerUser("", "", false, "hi!", "", false, strList48);
        boolean boolean51 = csvReadWrite29.registerUser("", "", false, "hi!", "", true, strList48);
        java.util.List<gui.User> userList52 = csvReadWrite29.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList59 = null;
        boolean boolean60 = csvReadWrite29.registerUser("hi!", "hi!", false, "", "hi!", false, strList59);
        gui.CsvReadWrite csvReadWrite67 = new gui.CsvReadWrite();
        csvReadWrite67.updateFacultyNotifications("");
        java.lang.String[] strArray78 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList79 = new java.util.ArrayList<java.lang.String>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList79, strArray78);
        boolean boolean81 = csvReadWrite67.registerUser("", "", false, "hi!", "", false, strList79);
        boolean boolean82 = csvReadWrite29.registerUser("hi!", "hi!", true, "", "", false, strList79);
        boolean boolean83 = csvReadWrite0.registerUser("hi!", "", true, "", "hi!", false, strList79);
        gui.User user86 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList87 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList90 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(userList52);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(user86);
        org.junit.Assert.assertNotNull(userList87);
        org.junit.Assert.assertNotNull(userList90);
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user7 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        gui.User user11 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user16 = csvReadWrite0.loginUser("hi!", "");
        gui.User user19 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass20 = user19.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
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
        gui.CsvReadWrite csvReadWrite29 = new gui.CsvReadWrite();
        csvReadWrite29.updateFacultyNotifications("");
        csvReadWrite29.verifyUser("");
        csvReadWrite29.updateFacultyNotifications("");
        gui.User user38 = csvReadWrite29.loginUser("", "hi!");
        java.util.List<gui.User> userList39 = csvReadWrite29.getUnverifiedUsers();
        gui.User user42 = csvReadWrite29.loginUser("hi!", "hi!");
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
        boolean boolean93 = csvReadWrite29.registerUser("hi!", "", false, "", "hi!", true, strList88);
        boolean boolean94 = csvReadWrite0.registerUser("hi!", "", false, "hi!", "hi!", false, strList88);
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList97 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(user42);
        org.junit.Assert.assertNotNull(userList76);
        org.junit.Assert.assertNotNull(user79);
        org.junit.Assert.assertNotNull(strArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(userList97);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
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
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        gui.User user26 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(user26);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
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
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user44 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList45 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList48 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertNotNull(userList48);
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
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
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList62 = csvReadWrite0.getUnverifiedUsers();
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
        org.junit.Assert.assertNotNull(userList62);
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
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
        gui.User user37 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(user37);
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user11 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user20 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass21 = user20.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
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
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList38 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(userList38);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
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
        gui.User user24 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList25 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass26 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass8 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
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
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite40 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite47 = new gui.CsvReadWrite();
        csvReadWrite47.updateFacultyNotifications("");
        csvReadWrite47.verifyUser("");
        csvReadWrite47.verifyUser("");
        java.util.List<gui.User> userList54 = csvReadWrite47.getUnverifiedUsers();
        gui.User user57 = csvReadWrite47.loginUser("hi!", "");
        java.lang.String[] strArray65 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList66 = new java.util.ArrayList<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList66, strArray65);
        boolean boolean68 = csvReadWrite47.registerUser("", "hi!", false, "", "", true, strList66);
        boolean boolean69 = csvReadWrite40.registerUser("hi!", "", true, "", "hi!", true, strList66);
        boolean boolean70 = csvReadWrite0.registerUser("", "hi!", false, "hi!", "", false, strList66);
        csvReadWrite0.verifyUser("hi!");
        gui.User user75 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(user17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(userList54);
        org.junit.Assert.assertNotNull(user57);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(user75);
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList4 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite13 = new gui.CsvReadWrite();
        csvReadWrite13.updateFacultyNotifications("");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList25 = new java.util.ArrayList<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList25, strArray24);
        boolean boolean27 = csvReadWrite13.registerUser("", "", false, "hi!", "", false, strList25);
        java.util.List<gui.User> userList28 = csvReadWrite13.getUnverifiedUsers();
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
        boolean boolean79 = csvReadWrite13.registerUser("", "hi!", true, "hi!", "", true, strList74);
        boolean boolean80 = csvReadWrite0.registerUser("hi!", "", false, "", "hi!", false, strList74);
        java.util.List<gui.User> userList81 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList82 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass83 = userList82.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList4);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(user65);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(userList81);
        org.junit.Assert.assertNotNull(userList82);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
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
        gui.User user54 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass55 = user54.getClass();
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
        org.junit.Assert.assertNotNull(user54);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList13 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList22 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user27 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(user27);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.lang.Class<?> wildcardClass13 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
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
        java.util.List<gui.User> userList83 = csvReadWrite0.getUnverifiedUsers();
        gui.User user86 = csvReadWrite0.loginUser("hi!", "hi!");
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
        org.junit.Assert.assertNotNull(userList83);
        org.junit.Assert.assertNotNull(user86);
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
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
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList92 = csvReadWrite0.getUnverifiedUsers();
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
        org.junit.Assert.assertNotNull(userList92);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
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
        java.util.List<gui.User> userList25 = csvReadWrite17.getUnverifiedUsers();
        java.util.List<gui.User> userList26 = csvReadWrite17.getUnverifiedUsers();
        gui.User user29 = csvReadWrite17.loginUser("hi!", "");
        gui.User user32 = csvReadWrite17.loginUser("hi!", "");
        gui.CsvReadWrite csvReadWrite39 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList40 = csvReadWrite39.getUnverifiedUsers();
        gui.User user43 = csvReadWrite39.loginUser("hi!", "");
        csvReadWrite39.updateFacultyNotifications("");
        csvReadWrite39.verifyUser("");
        gui.CsvReadWrite csvReadWrite54 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList55 = csvReadWrite54.getUnverifiedUsers();
        java.util.List<gui.User> userList56 = csvReadWrite54.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite63 = new gui.CsvReadWrite();
        csvReadWrite63.updateFacultyNotifications("");
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList75 = new java.util.ArrayList<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList75, strArray74);
        boolean boolean77 = csvReadWrite63.registerUser("", "", false, "hi!", "", false, strList75);
        boolean boolean78 = csvReadWrite54.registerUser("hi!", "hi!", false, "hi!", "", false, strList75);
        boolean boolean79 = csvReadWrite39.registerUser("hi!", "", true, "hi!", "hi!", false, strList75);
        boolean boolean80 = csvReadWrite17.registerUser("", "hi!", true, "", "", false, strList75);
        boolean boolean81 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList75);
        gui.User user84 = csvReadWrite0.loginUser("hi!", "");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(user32);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(userList55);
        org.junit.Assert.assertNotNull(userList56);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(user84);
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user7 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        gui.User user11 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList14 = csvReadWrite0.getUnverifiedUsers();
        gui.User user17 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(user17);
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user11 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user14 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userList16);
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList12 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user12 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user15 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass16 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList13 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList14 = csvReadWrite0.getUnverifiedUsers();
        gui.User user17 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user22 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(user17);
        org.junit.Assert.assertNotNull(user22);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
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
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite0.getUnverifiedUsers();
        gui.User user43 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user48 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(user48);
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user9 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList13 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite20 = new gui.CsvReadWrite();
        csvReadWrite20.updateFacultyNotifications("");
        csvReadWrite20.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite31 = new gui.CsvReadWrite();
        csvReadWrite31.updateFacultyNotifications("");
        csvReadWrite31.verifyUser("");
        csvReadWrite31.verifyUser("");
        java.util.List<gui.User> userList38 = csvReadWrite31.getUnverifiedUsers();
        gui.User user41 = csvReadWrite31.loginUser("hi!", "");
        java.lang.String[] strArray49 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList50 = new java.util.ArrayList<java.lang.String>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList50, strArray49);
        boolean boolean52 = csvReadWrite31.registerUser("", "hi!", false, "", "", true, strList50);
        gui.CsvReadWrite csvReadWrite59 = new gui.CsvReadWrite();
        csvReadWrite59.updateFacultyNotifications("");
        csvReadWrite59.verifyUser("");
        csvReadWrite59.verifyUser("");
        java.util.List<gui.User> userList66 = csvReadWrite59.getUnverifiedUsers();
        gui.User user69 = csvReadWrite59.loginUser("hi!", "");
        java.lang.String[] strArray77 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList78 = new java.util.ArrayList<java.lang.String>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList78, strArray77);
        boolean boolean80 = csvReadWrite59.registerUser("", "hi!", false, "", "", true, strList78);
        boolean boolean81 = csvReadWrite31.registerUser("hi!", "hi!", false, "hi!", "", false, strList78);
        boolean boolean82 = csvReadWrite20.registerUser("hi!", "", true, "", "hi!", false, strList78);
        boolean boolean83 = csvReadWrite0.registerUser("", "hi!", false, "hi!", "", true, strList78);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user98 = csvReadWrite0.loginUser("hi!", "");
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(user41);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(userList66);
        org.junit.Assert.assertNotNull(user69);
        org.junit.Assert.assertNotNull(strArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(user98);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList13 = csvReadWrite0.getUnverifiedUsers();
        gui.User user16 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList17 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass18 = userList17.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
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
        java.util.List<gui.User> userList19 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user28 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(user28);
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
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
        gui.User user30 = csvReadWrite0.loginUser("", "hi!");
        gui.User user33 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("hi!");
        gui.User user38 = csvReadWrite0.loginUser("", "");
        java.lang.Class<?> wildcardClass39 = user38.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(user33);
        org.junit.Assert.assertNotNull(user38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
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
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        csvReadWrite33.updateFacultyNotifications("");
        csvReadWrite33.verifyUser("");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "");
        gui.User user46 = csvReadWrite33.loginUser("", "");
        gui.User user49 = csvReadWrite33.loginUser("", "");
        gui.User user52 = csvReadWrite33.loginUser("", "");
        csvReadWrite33.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite61 = new gui.CsvReadWrite();
        csvReadWrite61.updateFacultyNotifications("");
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList73 = new java.util.ArrayList<java.lang.String>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList73, strArray72);
        boolean boolean75 = csvReadWrite61.registerUser("", "", false, "hi!", "", false, strList73);
        boolean boolean76 = csvReadWrite33.registerUser("hi!", "", false, "", "hi!", true, strList73);
        boolean boolean77 = csvReadWrite0.registerUser("", "", false, "hi!", "hi!", true, strList73);
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList80 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertNotNull(user49);
        org.junit.Assert.assertNotNull(user52);
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(userList80);
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
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
        gui.User user23 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite30 = new gui.CsvReadWrite();
        csvReadWrite30.updateFacultyNotifications("");
        csvReadWrite30.verifyUser("");
        csvReadWrite30.updateFacultyNotifications("");
        gui.User user39 = csvReadWrite30.loginUser("", "hi!");
        java.util.List<gui.User> userList40 = csvReadWrite30.getUnverifiedUsers();
        csvReadWrite30.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite49 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite56 = new gui.CsvReadWrite();
        csvReadWrite56.updateFacultyNotifications("");
        java.lang.String[] strArray67 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList68 = new java.util.ArrayList<java.lang.String>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList68, strArray67);
        boolean boolean70 = csvReadWrite56.registerUser("", "", false, "hi!", "", false, strList68);
        boolean boolean71 = csvReadWrite49.registerUser("", "", false, "hi!", "", true, strList68);
        boolean boolean72 = csvReadWrite30.registerUser("", "hi!", true, "", "", false, strList68);
        boolean boolean73 = csvReadWrite0.registerUser("hi!", "hi!", true, "", "", true, strList68);
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user82 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(user23);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(user82);
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
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
        java.util.List<gui.User> userList25 = csvReadWrite0.getUnverifiedUsers();
        gui.User user28 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user20);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(user28);
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
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
        csvReadWrite0.verifyUser("");
        gui.User user63 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList64 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass65 = userList64.getClass();
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
        org.junit.Assert.assertNotNull(user63);
        org.junit.Assert.assertNotNull(userList64);
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
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
        java.util.List<gui.User> userList61 = csvReadWrite0.getUnverifiedUsers();
        gui.User user64 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.verifyUser("hi!");
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
        org.junit.Assert.assertNotNull(userList61);
        org.junit.Assert.assertNotNull(user64);
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
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
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList42 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(userList42);
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite15 = new gui.CsvReadWrite();
        csvReadWrite15.updateFacultyNotifications("");
        csvReadWrite15.verifyUser("");
        csvReadWrite15.updateFacultyNotifications("");
        gui.User user24 = csvReadWrite15.loginUser("", "hi!");
        java.util.List<gui.User> userList25 = csvReadWrite15.getUnverifiedUsers();
        gui.User user28 = csvReadWrite15.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList29 = csvReadWrite15.getUnverifiedUsers();
        csvReadWrite15.updateFacultyNotifications("");
        csvReadWrite15.verifyUser("");
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
        boolean boolean90 = csvReadWrite40.registerUser("hi!", "hi!", false, "hi!", "", false, strList87);
        boolean boolean91 = csvReadWrite15.registerUser("hi!", "", false, "", "", false, strList87);
        boolean boolean92 = csvReadWrite0.registerUser("hi!", "", true, "hi!", "hi!", false, strList87);
        java.util.List<gui.User> userList93 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(user50);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(userList75);
        org.junit.Assert.assertNotNull(user78);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(userList93);
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList19 = csvReadWrite0.getUnverifiedUsers();
        gui.User user22 = csvReadWrite0.loginUser("", "hi!");
        gui.User user25 = csvReadWrite0.loginUser("", "");
        java.util.ArrayList<java.lang.String> strList32 = null;
        boolean boolean33 = csvReadWrite0.registerUser("hi!", "hi!", true, "hi!", "", false, strList32);
        java.util.List<gui.User> userList34 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(userList34);
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
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
        gui.User user56 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList57 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.lang.Class<?> wildcardClass62 = csvReadWrite0.getClass();
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
        org.junit.Assert.assertNotNull(user56);
        org.junit.Assert.assertNotNull(userList57);
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
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
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("hi!");
        gui.User user64 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(user64);
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user11 = csvReadWrite0.loginUser("", "hi!");
        gui.User user14 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(userList15);
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
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
        java.util.List<gui.User> userList78 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList81 = csvReadWrite0.getUnverifiedUsers();
        gui.User user84 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList85 = csvReadWrite0.getUnverifiedUsers();
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
        org.junit.Assert.assertNotNull(userList78);
        org.junit.Assert.assertNotNull(userList81);
        org.junit.Assert.assertNotNull(user84);
        org.junit.Assert.assertNotNull(userList85);
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
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
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList51 = csvReadWrite0.getUnverifiedUsers();
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
        org.junit.Assert.assertNotNull(userList51);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
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
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        gui.User user74 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(user74);
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
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
        boolean boolean68 = csvReadWrite0.registerUser("hi!", "hi!", true, "hi!", "", false, strList63);
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
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
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
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
        csvReadWrite0.verifyUser("");
        gui.User user59 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("hi!");
        gui.User user66 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList67 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList68 = csvReadWrite0.getUnverifiedUsers();
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
        org.junit.Assert.assertNotNull(user59);
        org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertNotNull(userList67);
        org.junit.Assert.assertNotNull(userList68);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
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
        csvReadWrite24.verifyUser("");
        csvReadWrite24.verifyUser("");
        gui.CsvReadWrite csvReadWrite37 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite44 = new gui.CsvReadWrite();
        csvReadWrite44.updateFacultyNotifications("");
        csvReadWrite44.verifyUser("");
        csvReadWrite44.verifyUser("");
        java.util.List<gui.User> userList51 = csvReadWrite44.getUnverifiedUsers();
        gui.User user54 = csvReadWrite44.loginUser("hi!", "");
        java.lang.String[] strArray62 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        boolean boolean65 = csvReadWrite44.registerUser("", "hi!", false, "", "", true, strList63);
        boolean boolean66 = csvReadWrite37.registerUser("hi!", "", true, "", "hi!", true, strList63);
        boolean boolean67 = csvReadWrite24.registerUser("", "", false, "hi!", "", false, strList63);
        boolean boolean68 = csvReadWrite0.registerUser("hi!", "", true, "", "hi!", true, strList63);
        gui.User user71 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList72 = csvReadWrite0.getUnverifiedUsers();
        gui.User user75 = csvReadWrite0.loginUser("", "");
        gui.User user78 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList51);
        org.junit.Assert.assertNotNull(user54);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(user71);
        org.junit.Assert.assertNotNull(userList72);
        org.junit.Assert.assertNotNull(user75);
        org.junit.Assert.assertNotNull(user78);
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
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
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList66 = csvReadWrite0.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList73 = null;
        boolean boolean74 = csvReadWrite0.registerUser("hi!", "", false, "", "", true, strList73);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(userList66);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
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
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user64 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList65 = csvReadWrite0.getUnverifiedUsers();
        gui.User user68 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.verifyUser("");
        gui.User user73 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(user64);
        org.junit.Assert.assertNotNull(userList65);
        org.junit.Assert.assertNotNull(user68);
        org.junit.Assert.assertNotNull(user73);
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user8 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass16 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
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
        java.util.List<gui.User> userList85 = csvReadWrite0.getUnverifiedUsers();
        gui.User user88 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass89 = csvReadWrite0.getClass();
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
        org.junit.Assert.assertNotNull(userList85);
        org.junit.Assert.assertNotNull(user88);
        org.junit.Assert.assertNotNull(wildcardClass89);
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user16 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList19 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite17 = new gui.CsvReadWrite();
        csvReadWrite17.updateFacultyNotifications("");
        csvReadWrite17.verifyUser("");
        csvReadWrite17.verifyUser("");
        java.util.List<gui.User> userList24 = csvReadWrite17.getUnverifiedUsers();
        gui.User user27 = csvReadWrite17.loginUser("hi!", "");
        gui.User user30 = csvReadWrite17.loginUser("", "");
        gui.User user33 = csvReadWrite17.loginUser("hi!", "");
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
        boolean boolean90 = csvReadWrite40.registerUser("hi!", "hi!", false, "hi!", "", false, strList87);
        boolean boolean91 = csvReadWrite17.registerUser("", "", true, "hi!", "hi!", true, strList87);
        boolean boolean92 = csvReadWrite0.registerUser("hi!", "hi!", true, "hi!", "hi!", false, strList87);
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user97 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(user33);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(user50);
        org.junit.Assert.assertNotNull(strArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(userList75);
        org.junit.Assert.assertNotNull(user78);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(user97);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
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
        java.lang.Class<?> wildcardClass47 = userList46.getClass();
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
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList17 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList18 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList19 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList22 = csvReadWrite0.getUnverifiedUsers();
        gui.User user25 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite32 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList33 = csvReadWrite32.getUnverifiedUsers();
        gui.User user36 = csvReadWrite32.loginUser("hi!", "hi!");
        csvReadWrite32.updateFacultyNotifications("hi!");
        csvReadWrite32.verifyUser("hi!");
        java.util.List<gui.User> userList41 = csvReadWrite32.getUnverifiedUsers();
        java.util.List<gui.User> userList42 = csvReadWrite32.getUnverifiedUsers();
        java.util.List<gui.User> userList43 = csvReadWrite32.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite50 = new gui.CsvReadWrite();
        csvReadWrite50.updateFacultyNotifications("");
        csvReadWrite50.verifyUser("");
        csvReadWrite50.verifyUser("");
        java.util.List<gui.User> userList57 = csvReadWrite50.getUnverifiedUsers();
        gui.User user60 = csvReadWrite50.loginUser("hi!", "");
        java.lang.String[] strArray68 = new java.lang.String[] { "" };
        java.util.ArrayList<java.lang.String> strList69 = new java.util.ArrayList<java.lang.String>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList69, strArray68);
        boolean boolean71 = csvReadWrite50.registerUser("", "hi!", false, "", "", true, strList69);
        boolean boolean72 = csvReadWrite32.registerUser("hi!", "", true, "hi!", "hi!", false, strList69);
        boolean boolean73 = csvReadWrite0.registerUser("hi!", "hi!", false, "", "hi!", true, strList69);
        java.util.List<gui.User> userList74 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList75 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass76 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList22);
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(user36);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(userList43);
        org.junit.Assert.assertNotNull(userList57);
        org.junit.Assert.assertNotNull(user60);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(userList74);
        org.junit.Assert.assertNotNull(userList75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList25 = csvReadWrite0.getUnverifiedUsers();
        gui.User user28 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user31 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList34 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList35 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
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
        gui.User user21 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user26 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList31 = csvReadWrite0.getUnverifiedUsers();
        gui.User user34 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(user34);
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
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
        csvReadWrite0.verifyUser("");
        gui.User user67 = csvReadWrite0.loginUser("", "");
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
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
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
        gui.CsvReadWrite csvReadWrite28 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList29 = csvReadWrite28.getUnverifiedUsers();
        gui.User user32 = csvReadWrite28.loginUser("hi!", "hi!");
        gui.User user35 = csvReadWrite28.loginUser("", "hi!");
        java.util.List<gui.User> userList36 = csvReadWrite28.getUnverifiedUsers();
        gui.User user39 = csvReadWrite28.loginUser("", "");
        java.util.List<gui.User> userList40 = csvReadWrite28.getUnverifiedUsers();
        csvReadWrite28.verifyUser("");
        gui.CsvReadWrite csvReadWrite49 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList50 = csvReadWrite49.getUnverifiedUsers();
        gui.User user53 = csvReadWrite49.loginUser("hi!", "");
        csvReadWrite49.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite62 = new gui.CsvReadWrite();
        csvReadWrite62.updateFacultyNotifications("");
        csvReadWrite62.verifyUser("");
        csvReadWrite62.verifyUser("");
        java.util.List<gui.User> userList69 = csvReadWrite62.getUnverifiedUsers();
        gui.User user72 = csvReadWrite62.loginUser("hi!", "hi!");
        csvReadWrite62.updateFacultyNotifications("");
        java.lang.String[] strArray83 = new java.lang.String[] { "", "" };
        java.util.ArrayList<java.lang.String> strList84 = new java.util.ArrayList<java.lang.String>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList84, strArray83);
        boolean boolean86 = csvReadWrite62.registerUser("", "hi!", false, "", "", true, strList84);
        boolean boolean87 = csvReadWrite49.registerUser("hi!", "", false, "", "", false, strList84);
        boolean boolean88 = csvReadWrite28.registerUser("", "hi!", true, "", "", false, strList84);
        boolean boolean89 = csvReadWrite0.registerUser("", "hi!", true, "", "", false, strList84);
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user94 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(user32);
        org.junit.Assert.assertNotNull(user35);
        org.junit.Assert.assertNotNull(userList36);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertNotNull(user53);
        org.junit.Assert.assertNotNull(userList69);
        org.junit.Assert.assertNotNull(user72);
        org.junit.Assert.assertNotNull(strArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(user94);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
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
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList47 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(userList47);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user6 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        gui.User user11 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.ArrayList<java.lang.String> strList24 = null;
        boolean boolean25 = csvReadWrite0.registerUser("", "hi!", true, "hi!", "", false, strList24);
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
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
        gui.CsvReadWrite csvReadWrite25 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList26 = csvReadWrite25.getUnverifiedUsers();
        gui.User user29 = csvReadWrite25.loginUser("hi!", "");
        csvReadWrite25.updateFacultyNotifications("");
        csvReadWrite25.verifyUser("");
        gui.CsvReadWrite csvReadWrite40 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList41 = csvReadWrite40.getUnverifiedUsers();
        java.util.List<gui.User> userList42 = csvReadWrite40.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite49 = new gui.CsvReadWrite();
        csvReadWrite49.updateFacultyNotifications("");
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList61 = new java.util.ArrayList<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList61, strArray60);
        boolean boolean63 = csvReadWrite49.registerUser("", "", false, "hi!", "", false, strList61);
        boolean boolean64 = csvReadWrite40.registerUser("hi!", "hi!", false, "hi!", "", false, strList61);
        boolean boolean65 = csvReadWrite25.registerUser("hi!", "", true, "hi!", "hi!", false, strList61);
        boolean boolean66 = csvReadWrite0.registerUser("", "", true, "hi!", "hi!", false, strList61);
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user73 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user78 = csvReadWrite0.loginUser("", "");
        gui.User user81 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(userList42);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(user73);
        org.junit.Assert.assertNotNull(user78);
        org.junit.Assert.assertNotNull(user81);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
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
        gui.User user26 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user31 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNotNull(user31);
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
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
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList34 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass37 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user7 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        gui.User user11 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList16 = csvReadWrite0.getUnverifiedUsers();
        gui.User user19 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList20 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
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
        gui.CsvReadWrite csvReadWrite35 = new gui.CsvReadWrite();
        csvReadWrite35.updateFacultyNotifications("");
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList47 = new java.util.ArrayList<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList47, strArray46);
        boolean boolean49 = csvReadWrite35.registerUser("", "", false, "hi!", "", false, strList47);
        boolean boolean50 = csvReadWrite28.registerUser("", "", false, "hi!", "", true, strList47);
        boolean boolean51 = csvReadWrite0.registerUser("", "hi!", true, "", "hi!", false, strList47);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(user21);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
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
        java.util.List<gui.User> userList67 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList70 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
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
        org.junit.Assert.assertNotNull(userList67);
        org.junit.Assert.assertNotNull(userList70);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user27 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList28 = csvReadWrite0.getUnverifiedUsers();
        gui.User user31 = csvReadWrite0.loginUser("hi!", "");
        gui.User user34 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(user34);
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
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
        gui.User user26 = csvReadWrite0.loginUser("", "hi!");
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
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
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
        csvReadWrite0.verifyUser("hi!");
        gui.User user29 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList30 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass31 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
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
        gui.User user40 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList41 = csvReadWrite0.getUnverifiedUsers();
        gui.User user44 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList45 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(userList41);
        org.junit.Assert.assertNotNull(user44);
        org.junit.Assert.assertNotNull(userList45);
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList13 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        gui.User user22 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(userList23);
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite7 = new gui.CsvReadWrite();
        csvReadWrite7.updateFacultyNotifications("");
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList19 = new java.util.ArrayList<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList19, strArray18);
        boolean boolean21 = csvReadWrite7.registerUser("", "", false, "hi!", "", false, strList19);
        boolean boolean22 = csvReadWrite0.registerUser("", "", false, "hi!", "", true, strList19);
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList25 = csvReadWrite0.getUnverifiedUsers();
        gui.User user28 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user31 = csvReadWrite0.loginUser("", "");
        gui.CsvReadWrite csvReadWrite38 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList39 = csvReadWrite38.getUnverifiedUsers();
        java.util.List<gui.User> userList40 = csvReadWrite38.getUnverifiedUsers();
        csvReadWrite38.updateFacultyNotifications("hi!");
        csvReadWrite38.verifyUser("");
        java.util.List<gui.User> userList45 = csvReadWrite38.getUnverifiedUsers();
        java.util.List<gui.User> userList46 = csvReadWrite38.getUnverifiedUsers();
        java.util.List<gui.User> userList47 = csvReadWrite38.getUnverifiedUsers();
        java.util.List<gui.User> userList48 = csvReadWrite38.getUnverifiedUsers();
        gui.User user51 = csvReadWrite38.loginUser("hi!", "");
        csvReadWrite38.verifyUser("");
        csvReadWrite38.updateFacultyNotifications("");
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
        boolean boolean84 = csvReadWrite38.registerUser("", "", false, "hi!", "", true, strList81);
        boolean boolean85 = csvReadWrite0.registerUser("hi!", "", false, "", "", false, strList81);
        java.util.List<gui.User> userList86 = csvReadWrite0.getUnverifiedUsers();
        gui.User user89 = csvReadWrite0.loginUser("hi!", "hi!");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userList45);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(userList47);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertNotNull(user51);
        org.junit.Assert.assertNotNull(userList69);
        org.junit.Assert.assertNotNull(user72);
        org.junit.Assert.assertNotNull(strArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(userList86);
        org.junit.Assert.assertNotNull(user89);
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
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
        csvReadWrite0.verifyUser("hi!");
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
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
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
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user50 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user59 = csvReadWrite0.loginUser("", "");
        gui.User user62 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(user42);
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertNotNull(user50);
        org.junit.Assert.assertNotNull(user59);
        org.junit.Assert.assertNotNull(user62);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user15 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user22 = csvReadWrite0.loginUser("hi!", "");
        gui.User user25 = csvReadWrite0.loginUser("hi!", "hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(user25);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
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
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList61 = csvReadWrite0.getUnverifiedUsers();
        gui.User user64 = csvReadWrite0.loginUser("hi!", "");
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
        org.junit.Assert.assertNotNull(userList61);
        org.junit.Assert.assertNotNull(user64);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList13 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        gui.User user22 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(user22);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.CsvReadWrite csvReadWrite19 = new gui.CsvReadWrite();
        gui.User user22 = csvReadWrite19.loginUser("", "hi!");
        csvReadWrite19.updateFacultyNotifications("");
        java.util.List<gui.User> userList25 = csvReadWrite19.getUnverifiedUsers();
        csvReadWrite19.verifyUser("");
        csvReadWrite19.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite36 = new gui.CsvReadWrite();
        gui.User user39 = csvReadWrite36.loginUser("", "hi!");
        gui.User user42 = csvReadWrite36.loginUser("", "hi!");
        csvReadWrite36.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite51 = new gui.CsvReadWrite();
        csvReadWrite51.updateFacultyNotifications("");
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList63 = new java.util.ArrayList<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList63, strArray62);
        boolean boolean65 = csvReadWrite51.registerUser("", "", false, "hi!", "", false, strList63);
        boolean boolean66 = csvReadWrite36.registerUser("hi!", "", false, "", "", true, strList63);
        boolean boolean67 = csvReadWrite19.registerUser("hi!", "", false, "", "hi!", true, strList63);
        boolean boolean68 = csvReadWrite0.registerUser("hi!", "hi!", false, "hi!", "", true, strList63);
        gui.User user71 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(user42);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(user71);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
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
        gui.CsvReadWrite csvReadWrite33 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList34 = csvReadWrite33.getUnverifiedUsers();
        java.util.List<gui.User> userList35 = csvReadWrite33.getUnverifiedUsers();
        csvReadWrite33.updateFacultyNotifications("hi!");
        csvReadWrite33.verifyUser("");
        java.util.List<gui.User> userList40 = csvReadWrite33.getUnverifiedUsers();
        gui.User user43 = csvReadWrite33.loginUser("hi!", "hi!");
        csvReadWrite33.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite52 = new gui.CsvReadWrite();
        csvReadWrite52.updateFacultyNotifications("");
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList64 = new java.util.ArrayList<java.lang.String>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList64, strArray63);
        boolean boolean66 = csvReadWrite52.registerUser("", "", false, "hi!", "", false, strList64);
        boolean boolean67 = csvReadWrite33.registerUser("", "", true, "", "hi!", true, strList64);
        boolean boolean68 = csvReadWrite0.registerUser("hi!", "", true, "", "", false, strList64);
        gui.User user71 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList72 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(user71);
        org.junit.Assert.assertNotNull(userList72);
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
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
        java.util.List<gui.User> userList23 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user28 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(user28);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
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
        java.util.List<gui.User> userList34 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList35 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(userList33);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
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
        java.util.List<gui.User> userList62 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList63 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(userList63);
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
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
        java.util.List<gui.User> userList28 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user35 = csvReadWrite0.loginUser("", "hi!");
        java.lang.Class<?> wildcardClass36 = user35.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(user35);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user12 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList17 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList18 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
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
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList72 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        gui.User user77 = csvReadWrite0.loginUser("hi!", "");
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
        org.junit.Assert.assertNotNull(userList72);
        org.junit.Assert.assertNotNull(user77);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
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
        gui.User user54 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList55 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        gui.User user60 = csvReadWrite0.loginUser("", "hi!");
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
        org.junit.Assert.assertNotNull(user54);
        org.junit.Assert.assertNotNull(userList55);
        org.junit.Assert.assertNotNull(user60);
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user6 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList20 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass21 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
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
        java.util.List<gui.User> userList65 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList68 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(user64);
        org.junit.Assert.assertNotNull(userList65);
        org.junit.Assert.assertNotNull(userList68);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
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
        csvReadWrite0.verifyUser("");
        gui.User user63 = csvReadWrite0.loginUser("", "hi!");
        gui.User user66 = csvReadWrite0.loginUser("hi!", "");
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
        org.junit.Assert.assertNotNull(user63);
        org.junit.Assert.assertNotNull(user66);
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user6 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        gui.User user11 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList12 = csvReadWrite0.getUnverifiedUsers();
        gui.User user15 = csvReadWrite0.loginUser("hi!", "");
        gui.CsvReadWrite csvReadWrite22 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList23 = csvReadWrite22.getUnverifiedUsers();
        gui.User user26 = csvReadWrite22.loginUser("hi!", "");
        csvReadWrite22.updateFacultyNotifications("");
        csvReadWrite22.verifyUser("");
        gui.CsvReadWrite csvReadWrite37 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList38 = csvReadWrite37.getUnverifiedUsers();
        java.util.List<gui.User> userList39 = csvReadWrite37.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite46 = new gui.CsvReadWrite();
        csvReadWrite46.updateFacultyNotifications("");
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList58 = new java.util.ArrayList<java.lang.String>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList58, strArray57);
        boolean boolean60 = csvReadWrite46.registerUser("", "", false, "hi!", "", false, strList58);
        boolean boolean61 = csvReadWrite37.registerUser("hi!", "hi!", false, "hi!", "", false, strList58);
        boolean boolean62 = csvReadWrite22.registerUser("hi!", "", true, "hi!", "hi!", false, strList58);
        boolean boolean63 = csvReadWrite0.registerUser("hi!", "hi!", true, "", "", true, strList58);
        gui.User user66 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        java.lang.Class<?> wildcardClass69 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNotNull(userList38);
        org.junit.Assert.assertNotNull(userList39);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
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
        java.util.List<gui.User> userList38 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(userList38);
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
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
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList94 = csvReadWrite0.getUnverifiedUsers();
        gui.User user97 = csvReadWrite0.loginUser("", "");
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
        org.junit.Assert.assertNotNull(userList94);
        org.junit.Assert.assertNotNull(user97);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
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
        gui.User user91 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
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
        org.junit.Assert.assertNotNull(user91);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
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
        java.util.List<gui.User> userList88 = csvReadWrite0.getUnverifiedUsers();
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
        org.junit.Assert.assertNotNull(userList88);
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        gui.User user6 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList13 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList18 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(userList18);
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass9 = userList8.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user7 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        gui.User user20 = csvReadWrite0.loginUser("hi!", "hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(user20);
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "");
        gui.User user7 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite18 = new gui.CsvReadWrite();
        csvReadWrite18.updateFacultyNotifications("");
        csvReadWrite18.verifyUser("");
        csvReadWrite18.verifyUser("");
        java.util.List<gui.User> userList25 = csvReadWrite18.getUnverifiedUsers();
        java.util.List<gui.User> userList26 = csvReadWrite18.getUnverifiedUsers();
        csvReadWrite18.verifyUser("hi!");
        gui.User user31 = csvReadWrite18.loginUser("", "");
        gui.User user34 = csvReadWrite18.loginUser("hi!", "hi!");
        csvReadWrite18.updateFacultyNotifications("");
        csvReadWrite18.verifyUser("hi!");
        csvReadWrite18.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite47 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList48 = csvReadWrite47.getUnverifiedUsers();
        gui.User user51 = csvReadWrite47.loginUser("hi!", "");
        csvReadWrite47.updateFacultyNotifications("");
        csvReadWrite47.verifyUser("");
        gui.CsvReadWrite csvReadWrite62 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList63 = csvReadWrite62.getUnverifiedUsers();
        java.util.List<gui.User> userList64 = csvReadWrite62.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite71 = new gui.CsvReadWrite();
        csvReadWrite71.updateFacultyNotifications("");
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        boolean boolean85 = csvReadWrite71.registerUser("", "", false, "hi!", "", false, strList83);
        boolean boolean86 = csvReadWrite62.registerUser("hi!", "hi!", false, "hi!", "", false, strList83);
        boolean boolean87 = csvReadWrite47.registerUser("hi!", "", true, "hi!", "hi!", false, strList83);
        boolean boolean88 = csvReadWrite18.registerUser("hi!", "hi!", true, "hi!", "", false, strList83);
        boolean boolean89 = csvReadWrite0.registerUser("", "", false, "", "hi!", true, strList83);
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList25);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(user34);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertNotNull(user51);
        org.junit.Assert.assertNotNull(userList63);
        org.junit.Assert.assertNotNull(userList64);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
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
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite36 = new gui.CsvReadWrite();
        csvReadWrite36.updateFacultyNotifications("");
        csvReadWrite36.verifyUser("");
        csvReadWrite36.updateFacultyNotifications("");
        gui.User user45 = csvReadWrite36.loginUser("", "hi!");
        java.util.List<gui.User> userList46 = csvReadWrite36.getUnverifiedUsers();
        csvReadWrite36.updateFacultyNotifications("");
        java.util.List<gui.User> userList49 = csvReadWrite36.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite56 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList57 = csvReadWrite56.getUnverifiedUsers();
        gui.User user60 = csvReadWrite56.loginUser("hi!", "");
        csvReadWrite56.updateFacultyNotifications("");
        csvReadWrite56.updateFacultyNotifications("hi!");
        csvReadWrite56.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite73 = new gui.CsvReadWrite();
        csvReadWrite73.updateFacultyNotifications("");
        java.lang.String[] strArray84 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList85 = new java.util.ArrayList<java.lang.String>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList85, strArray84);
        boolean boolean87 = csvReadWrite73.registerUser("", "", false, "hi!", "", false, strList85);
        boolean boolean88 = csvReadWrite56.registerUser("hi!", "hi!", false, "", "hi!", false, strList85);
        boolean boolean89 = csvReadWrite36.registerUser("hi!", "hi!", false, "", "", true, strList85);
        boolean boolean90 = csvReadWrite0.registerUser("", "hi!", false, "", "", true, strList85);
        java.util.List<gui.User> userList91 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertNotNull(userList46);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertNotNull(userList57);
        org.junit.Assert.assertNotNull(user60);
        org.junit.Assert.assertNotNull(strArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(userList91);
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user7 = csvReadWrite0.loginUser("", "");
        gui.User user10 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user7);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
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
        csvReadWrite0.verifyUser("hi!");
        gui.CsvReadWrite csvReadWrite35 = new gui.CsvReadWrite();
        csvReadWrite35.updateFacultyNotifications("");
        csvReadWrite35.verifyUser("");
        csvReadWrite35.updateFacultyNotifications("");
        csvReadWrite35.updateFacultyNotifications("hi!");
        csvReadWrite35.verifyUser("");
        gui.CsvReadWrite csvReadWrite52 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite59 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList60 = csvReadWrite59.getUnverifiedUsers();
        java.util.List<gui.User> userList61 = csvReadWrite59.getUnverifiedUsers();
        csvReadWrite59.updateFacultyNotifications("hi!");
        csvReadWrite59.verifyUser("");
        java.util.List<gui.User> userList66 = csvReadWrite59.getUnverifiedUsers();
        gui.User user69 = csvReadWrite59.loginUser("hi!", "hi!");
        csvReadWrite59.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite78 = new gui.CsvReadWrite();
        csvReadWrite78.updateFacultyNotifications("");
        java.lang.String[] strArray89 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList90 = new java.util.ArrayList<java.lang.String>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList90, strArray89);
        boolean boolean92 = csvReadWrite78.registerUser("", "", false, "hi!", "", false, strList90);
        boolean boolean93 = csvReadWrite59.registerUser("", "", true, "", "hi!", true, strList90);
        boolean boolean94 = csvReadWrite52.registerUser("hi!", "hi!", false, "hi!", "hi!", true, strList90);
        boolean boolean95 = csvReadWrite35.registerUser("", "hi!", false, "hi!", "hi!", false, strList90);
        boolean boolean96 = csvReadWrite0.registerUser("hi!", "", true, "hi!", "hi!", true, strList90);
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNotNull(userList60);
        org.junit.Assert.assertNotNull(userList61);
        org.junit.Assert.assertNotNull(userList66);
        org.junit.Assert.assertNotNull(user69);
        org.junit.Assert.assertNotNull(strArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
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
        csvReadWrite0.verifyUser("hi!");
        gui.User user39 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList40 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        gui.CsvReadWrite csvReadWrite49 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite56 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList57 = csvReadWrite56.getUnverifiedUsers();
        java.util.List<gui.User> userList58 = csvReadWrite56.getUnverifiedUsers();
        csvReadWrite56.updateFacultyNotifications("hi!");
        csvReadWrite56.verifyUser("");
        java.util.List<gui.User> userList63 = csvReadWrite56.getUnverifiedUsers();
        gui.User user66 = csvReadWrite56.loginUser("hi!", "hi!");
        csvReadWrite56.updateFacultyNotifications("hi!");
        gui.CsvReadWrite csvReadWrite75 = new gui.CsvReadWrite();
        csvReadWrite75.updateFacultyNotifications("");
        java.lang.String[] strArray86 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList87 = new java.util.ArrayList<java.lang.String>();
        boolean boolean88 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList87, strArray86);
        boolean boolean89 = csvReadWrite75.registerUser("", "", false, "hi!", "", false, strList87);
        boolean boolean90 = csvReadWrite56.registerUser("", "", true, "", "hi!", true, strList87);
        boolean boolean91 = csvReadWrite49.registerUser("hi!", "hi!", false, "hi!", "hi!", true, strList87);
        boolean boolean92 = csvReadWrite0.registerUser("", "", true, "hi!", "", true, strList87);
        org.junit.Assert.assertNotNull(userList14);
        org.junit.Assert.assertNotNull(user17);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(user34);
        org.junit.Assert.assertNotNull(user39);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(userList57);
        org.junit.Assert.assertNotNull(userList58);
        org.junit.Assert.assertNotNull(userList63);
        org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertNotNull(strArray86);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
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
        java.util.List<gui.User> userList48 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList49 = csvReadWrite0.getUnverifiedUsers();
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
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertNotNull(userList49);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList6 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("hi!");
        gui.User user14 = csvReadWrite0.loginUser("hi!", "");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList6);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user14);
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        gui.User user4 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList5 = csvReadWrite0.getUnverifiedUsers();
        java.util.ArrayList<java.lang.String> strList12 = null;
        boolean boolean13 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.verifyUser("");
        gui.User user22 = csvReadWrite0.loginUser("", "hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(userList5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(user22);
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
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
        csvReadWrite0.verifyUser("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user92 = csvReadWrite0.loginUser("hi!", "");
        gui.User user95 = csvReadWrite0.loginUser("hi!", "");
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
        org.junit.Assert.assertNotNull(user92);
        org.junit.Assert.assertNotNull(user95);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
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
        gui.User user75 = csvReadWrite0.loginUser("hi!", "");
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
        org.junit.Assert.assertNotNull(user75);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
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
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user27 = csvReadWrite0.loginUser("hi!", "");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(userList16);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(user27);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
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
        java.util.List<gui.User> userList30 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList31 = csvReadWrite0.getUnverifiedUsers();
        gui.User user34 = csvReadWrite0.loginUser("", "");
        gui.User user37 = csvReadWrite0.loginUser("", "");
        gui.User user40 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user45 = csvReadWrite0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass46 = user45.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(userList30);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(user34);
        org.junit.Assert.assertNotNull(user37);
        org.junit.Assert.assertNotNull(user40);
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        gui.User user14 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user19 = csvReadWrite0.loginUser("", "");
        gui.User user22 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("");
        gui.User user27 = csvReadWrite0.loginUser("", "");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(user27);
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        org.junit.Assert.assertNotNull(userList11);
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
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
        gui.User user31 = csvReadWrite0.loginUser("hi!", "hi!");
        gui.User user34 = csvReadWrite0.loginUser("hi!", "");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(user34);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
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
        java.util.List<gui.User> userList28 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList29 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(userList28);
        org.junit.Assert.assertNotNull(userList29);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
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
        csvReadWrite0.updateFacultyNotifications("");
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
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
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
        csvReadWrite0.verifyUser("");
        gui.User user31 = csvReadWrite0.loginUser("", "");
        java.util.List<gui.User> userList32 = csvReadWrite0.getUnverifiedUsers();
        gui.CsvReadWrite csvReadWrite39 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList40 = csvReadWrite39.getUnverifiedUsers();
        csvReadWrite39.verifyUser("hi!");
        gui.User user45 = csvReadWrite39.loginUser("hi!", "hi!");
        csvReadWrite39.verifyUser("");
        java.util.List<gui.User> userList48 = csvReadWrite39.getUnverifiedUsers();
        gui.User user51 = csvReadWrite39.loginUser("", "");
        csvReadWrite39.verifyUser("hi!");
        csvReadWrite39.verifyUser("");
        gui.CsvReadWrite csvReadWrite62 = new gui.CsvReadWrite();
        gui.User user65 = csvReadWrite62.loginUser("", "hi!");
        gui.User user68 = csvReadWrite62.loginUser("", "hi!");
        csvReadWrite62.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite77 = new gui.CsvReadWrite();
        csvReadWrite77.updateFacultyNotifications("");
        java.lang.String[] strArray88 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList89 = new java.util.ArrayList<java.lang.String>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList89, strArray88);
        boolean boolean91 = csvReadWrite77.registerUser("", "", false, "hi!", "", false, strList89);
        boolean boolean92 = csvReadWrite62.registerUser("hi!", "", false, "", "", true, strList89);
        boolean boolean93 = csvReadWrite39.registerUser("hi!", "hi!", true, "", "hi!", false, strList89);
        boolean boolean94 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList89);
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(user26);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user45);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertNotNull(user51);
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
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "hi!");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList12 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(userList12);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList19 = csvReadWrite0.getUnverifiedUsers();
        gui.User user22 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user29 = csvReadWrite0.loginUser("", "hi!");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(user29);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        java.util.List<gui.User> userList1 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList2 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList10 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass12 = userList11.getClass();
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(userList2);
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList3 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("");
        gui.CsvReadWrite csvReadWrite12 = new gui.CsvReadWrite();
        gui.CsvReadWrite csvReadWrite19 = new gui.CsvReadWrite();
        csvReadWrite19.updateFacultyNotifications("");
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList31 = new java.util.ArrayList<java.lang.String>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList31, strArray30);
        boolean boolean33 = csvReadWrite19.registerUser("", "", false, "hi!", "", false, strList31);
        boolean boolean34 = csvReadWrite12.registerUser("", "", false, "hi!", "", true, strList31);
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
        boolean boolean63 = csvReadWrite12.registerUser("", "hi!", true, "", "", false, strList60);
        boolean boolean64 = csvReadWrite0.registerUser("hi!", "", true, "hi!", "", false, strList60);
        java.util.List<gui.User> userList65 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("");
        org.junit.Assert.assertNotNull(userList3);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(userList48);
        org.junit.Assert.assertNotNull(user51);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(userList65);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
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
        java.util.List<gui.User> userList24 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user29 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user34 = csvReadWrite0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass35 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(userList20);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertNotNull(user34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList8 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList9 = csvReadWrite0.getUnverifiedUsers();
        gui.User user12 = csvReadWrite0.loginUser("", "hi!");
        gui.User user15 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("hi!");
        java.util.List<gui.User> userList18 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList19 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(userList8);
        org.junit.Assert.assertNotNull(userList9);
        org.junit.Assert.assertNotNull(user12);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
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
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList29 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass30 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(userList26);
        org.junit.Assert.assertNotNull(userList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList12 = new java.util.ArrayList<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList12, strArray11);
        boolean boolean14 = csvReadWrite0.registerUser("", "", false, "hi!", "", false, strList12);
        java.util.List<gui.User> userList15 = csvReadWrite0.getUnverifiedUsers();
        gui.User user18 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList19 = csvReadWrite0.getUnverifiedUsers();
        gui.User user22 = csvReadWrite0.loginUser("", "hi!");
        gui.User user25 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("");
        gui.User user30 = csvReadWrite0.loginUser("", "hi!");
        java.util.List<gui.User> userList31 = csvReadWrite0.getUnverifiedUsers();
        java.lang.Class<?> wildcardClass32 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
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
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        org.junit.Assert.assertNotNull(userList27);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(userList46);
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
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
        gui.CsvReadWrite csvReadWrite61 = new gui.CsvReadWrite();
        csvReadWrite61.updateFacultyNotifications("");
        csvReadWrite61.verifyUser("");
        csvReadWrite61.verifyUser("");
        java.util.List<gui.User> userList68 = csvReadWrite61.getUnverifiedUsers();
        gui.User user71 = csvReadWrite61.loginUser("hi!", "");
        gui.User user74 = csvReadWrite61.loginUser("", "");
        java.lang.String[] strArray82 = new java.lang.String[] { "hi!" };
        java.util.ArrayList<java.lang.String> strList83 = new java.util.ArrayList<java.lang.String>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList83, strArray82);
        boolean boolean85 = csvReadWrite61.registerUser("", "", false, "hi!", "", false, strList83);
        boolean boolean86 = csvReadWrite0.registerUser("hi!", "", true, "", "", true, strList83);
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList89 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList90 = csvReadWrite0.getUnverifiedUsers();
        gui.User user93 = csvReadWrite0.loginUser("hi!", "hi!");
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
        org.junit.Assert.assertNotNull(userList68);
        org.junit.Assert.assertNotNull(user71);
        org.junit.Assert.assertNotNull(user74);
        org.junit.Assert.assertNotNull(strArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(userList89);
        org.junit.Assert.assertNotNull(userList90);
        org.junit.Assert.assertNotNull(user93);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
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
        java.util.List<gui.User> userList62 = csvReadWrite0.getUnverifiedUsers();
        java.util.List<gui.User> userList63 = csvReadWrite0.getUnverifiedUsers();
        gui.User user66 = csvReadWrite0.loginUser("", "hi!");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList69 = csvReadWrite0.getUnverifiedUsers();
        gui.User user72 = csvReadWrite0.loginUser("", "hi!");
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(userList63);
        org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertNotNull(userList69);
        org.junit.Assert.assertNotNull(user72);
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
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
        gui.User user59 = csvReadWrite0.loginUser("hi!", "hi!");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        java.util.List<gui.User> userList64 = csvReadWrite0.getUnverifiedUsers();
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
        org.junit.Assert.assertNotNull(user59);
        org.junit.Assert.assertNotNull(userList64);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
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
        gui.User user34 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(userList24);
        org.junit.Assert.assertNotNull(user31);
        org.junit.Assert.assertNotNull(user34);
    }

    @Test
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
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
        java.util.List<gui.User> userList62 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.verifyUser("");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user69 = csvReadWrite0.loginUser("hi!", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(userList62);
        org.junit.Assert.assertNotNull(user69);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
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
        java.util.List<gui.User> userList68 = csvReadWrite0.getUnverifiedUsers();
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user73 = csvReadWrite0.loginUser("", "hi!");
        org.junit.Assert.assertNotNull(userList40);
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(userList68);
        org.junit.Assert.assertNotNull(user73);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
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
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user32 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("");
        java.util.List<gui.User> userList35 = csvReadWrite0.getUnverifiedUsers();
        gui.User user38 = csvReadWrite0.loginUser("hi!", "");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user32);
        org.junit.Assert.assertNotNull(userList35);
        org.junit.Assert.assertNotNull(user38);
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        gui.CsvReadWrite csvReadWrite0 = new gui.CsvReadWrite();
        csvReadWrite0.updateFacultyNotifications("");
        csvReadWrite0.verifyUser("");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList7 = csvReadWrite0.getUnverifiedUsers();
        gui.User user10 = csvReadWrite0.loginUser("hi!", "");
        java.util.List<gui.User> userList11 = csvReadWrite0.getUnverifiedUsers();
        gui.User user14 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.updateFacultyNotifications("hi!");
        gui.User user19 = csvReadWrite0.loginUser("hi!", "");
        gui.User user22 = csvReadWrite0.loginUser("hi!", "hi!");
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(userList11);
        org.junit.Assert.assertNotNull(user14);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user22);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
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
        csvReadWrite0.updateFacultyNotifications("");
        java.lang.Class<?> wildcardClass28 = csvReadWrite0.getClass();
        org.junit.Assert.assertNotNull(userList7);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user16);
        org.junit.Assert.assertNotNull(user19);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(userList23);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
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
        csvReadWrite0.updateFacultyNotifications("");
        gui.User user25 = csvReadWrite0.loginUser("", "");
        csvReadWrite0.verifyUser("");
        java.util.List<gui.User> userList28 = csvReadWrite0.getUnverifiedUsers();
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(userList10);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertNotNull(userList28);
    }
}
