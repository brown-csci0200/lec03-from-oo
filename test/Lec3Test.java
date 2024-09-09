package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import src.FuncList;
import src.Lec03;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class Lec3Test {
    /**
     * Example test method.
     * Test methods must have @Test before the method
     */

    <E> FuncList<E> toFuncList(E... args) {
        return new FuncList<E>(args);
    }

    @Test
    public void testExample() {
        // example syntax for assertEquals
        Assert.assertEquals(2, 1 + 1);
    }

    @Test
    public void testProduct() {
        Assert.assertEquals(5 * 3 * 10 * 2, Lec03.product(toFuncList(5, 3, 10, 2)));
    }
}
