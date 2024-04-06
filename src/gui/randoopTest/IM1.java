package gui.randoopTest;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class IM1 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        gui.ItemManager itemManager0 = new gui.ItemManager();
        java.lang.Class<?> wildcardClass1 = itemManager0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        gui.ItemManager itemManager0 = new gui.ItemManager();
        java.util.List<gui.Item> itemList2 = itemManager0.loadItemsFromCSV("hi!");
        java.lang.Class<?> wildcardClass3 = itemList2.getClass();
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        gui.ItemManager itemManager0 = new gui.ItemManager();
        java.util.List<gui.Item> itemList2 = itemManager0.loadItemsFromCSV("");
        java.lang.Class<?> wildcardClass3 = itemList2.getClass();
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        gui.ItemManager itemManager0 = new gui.ItemManager();
        java.util.List<gui.Item> itemList2 = itemManager0.loadItemsFromCSV("");
        java.lang.Class<?> wildcardClass3 = itemManager0.getClass();
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        gui.ItemManager itemManager0 = new gui.ItemManager();
        java.util.List<gui.Item> itemList2 = itemManager0.loadItemsFromCSV("hi!");
        java.util.List<gui.Item> itemList4 = itemManager0.loadItemsFromCSV("");
        org.junit.Assert.assertNotNull(itemList2);
        org.junit.Assert.assertNotNull(itemList4);
    }
}

