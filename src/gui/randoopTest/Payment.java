package gui.randoopTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Payment {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        java.lang.Class<?> wildcardClass2 = paymentContext1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.pay();
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        java.lang.Class<?> wildcardClass8 = paymentContext1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.pay();
        java.lang.Class<?> wildcardClass9 = paymentContext1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        gui.PaymentState paymentState6 = null;
        paymentContext1.setState(paymentState6);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(true);
        java.lang.Class<?> wildcardClass12 = paymentContext1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        gui.PaymentState paymentState12 = null;
        paymentContext1.setState(paymentState12);
        paymentContext1.pay();
        gui.PaymentState paymentState15 = null;
        paymentContext1.setState(paymentState15);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.pay();
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        gui.PaymentState paymentState6 = null;
        paymentContext1.setState(paymentState6);
        paymentContext1.paymentFinished(true);
        paymentContext1.pay();
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.pay();
        paymentContext1.paymentFinished(false);
        paymentContext1.pay();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(false);
        gui.PaymentState paymentState10 = null;
        paymentContext1.setState(paymentState10);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        gui.PaymentState paymentState6 = null;
        paymentContext1.setState(paymentState6);
        paymentContext1.paymentFinished(true);
        java.lang.Class<?> wildcardClass10 = paymentContext1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        java.lang.Class<?> wildcardClass12 = paymentContext1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        gui.PaymentState paymentState12 = null;
        paymentContext1.setState(paymentState12);
        paymentContext1.pay();
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(true);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        gui.PaymentState paymentState6 = null;
        paymentContext1.setState(paymentState6);
        gui.PaymentState paymentState8 = null;
        paymentContext1.setState(paymentState8);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        paymentContext1.paymentFinished(false);
        gui.PaymentState paymentState4 = null;
        paymentContext1.setState(paymentState4);
        paymentContext1.paymentFinished(true);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.pay();
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(false);
        paymentContext1.pay();
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        paymentContext1.paymentFinished(false);
        gui.PaymentState paymentState4 = null;
        paymentContext1.setState(paymentState4);
        java.lang.Class<?> wildcardClass6 = paymentContext1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.pay();
        paymentContext1.paymentFinished(true);
        gui.PaymentState paymentState11 = null;
        paymentContext1.setState(paymentState11);
        paymentContext1.pay();
        java.lang.Class<?> wildcardClass14 = paymentContext1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(true);
        paymentContext1.pay();
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.pay();
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(true);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        gui.PaymentState paymentState12 = null;
        paymentContext1.setState(paymentState12);
        paymentContext1.pay();
        paymentContext1.pay();
        gui.PaymentState paymentState16 = null;
        paymentContext1.setState(paymentState16);
        java.lang.Class<?> wildcardClass18 = paymentContext1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(false);
        gui.PaymentState paymentState14 = null;
        paymentContext1.setState(paymentState14);
        java.lang.Class<?> wildcardClass16 = paymentContext1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.pay();
        paymentContext1.paymentFinished(true);
        gui.PaymentState paymentState11 = null;
        paymentContext1.setState(paymentState11);
        paymentContext1.pay();
        paymentContext1.pay();
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        gui.PaymentState paymentState6 = null;
        paymentContext1.setState(paymentState6);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(false);
        paymentContext1.pay();
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        paymentContext1.paymentFinished(false);
        gui.PaymentState paymentState4 = null;
        paymentContext1.setState(paymentState4);
        gui.PaymentState paymentState6 = null;
        paymentContext1.setState(paymentState6);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(false);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(false);
        gui.PaymentState paymentState14 = null;
        paymentContext1.setState(paymentState14);
        paymentContext1.pay();
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        gui.PaymentState paymentState6 = null;
        paymentContext1.setState(paymentState6);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(true);
        gui.PaymentState paymentState12 = null;
        paymentContext1.setState(paymentState12);
        gui.PaymentState paymentState14 = null;
        paymentContext1.setState(paymentState14);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        gui.PaymentState paymentState12 = null;
        paymentContext1.setState(paymentState12);
        paymentContext1.pay();
        paymentContext1.pay();
        gui.PaymentState paymentState16 = null;
        paymentContext1.setState(paymentState16);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        paymentContext1.paymentFinished(false);
        java.lang.Class<?> wildcardClass4 = paymentContext1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        paymentContext1.paymentFinished(false);
        paymentContext1.pay();
        paymentContext1.pay();
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        gui.PaymentState paymentState12 = null;
        paymentContext1.setState(paymentState12);
        gui.PaymentState paymentState14 = null;
        paymentContext1.setState(paymentState14);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        gui.PaymentState paymentState12 = null;
        paymentContext1.setState(paymentState12);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        paymentContext1.pay();
        paymentContext1.pay();
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.pay();
        paymentContext1.paymentFinished(true);
        gui.PaymentState paymentState11 = null;
        paymentContext1.setState(paymentState11);
        java.lang.Class<?> wildcardClass13 = paymentContext1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        gui.PaymentState paymentState8 = null;
        paymentContext1.setState(paymentState8);
        paymentContext1.paymentFinished(false);
        gui.PaymentState paymentState12 = null;
        paymentContext1.setState(paymentState12);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        gui.PaymentState paymentState12 = null;
        paymentContext1.setState(paymentState12);
        paymentContext1.pay();
        paymentContext1.pay();
        gui.PaymentState paymentState16 = null;
        paymentContext1.setState(paymentState16);
        paymentContext1.paymentFinished(false);
        gui.PaymentState paymentState20 = null;
        paymentContext1.setState(paymentState20);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        gui.PaymentState paymentState6 = null;
        paymentContext1.setState(paymentState6);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(true);
        paymentContext1.pay();
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(true);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        paymentContext1.paymentFinished(true);
        paymentContext1.paymentFinished(true);
        gui.PaymentState paymentState10 = null;
        paymentContext1.setState(paymentState10);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        gui.PaymentFinishedListener paymentFinishedListener0 = null;
        gui.PaymentContext paymentContext1 = new gui.PaymentContext(paymentFinishedListener0);
        gui.PaymentState paymentState2 = null;
        paymentContext1.setState(paymentState2);
        paymentContext1.paymentFinished(false);
        gui.PaymentState paymentState6 = null;
        paymentContext1.setState(paymentState6);
        paymentContext1.paymentFinished(false);
        paymentContext1.pay();
    }
}

