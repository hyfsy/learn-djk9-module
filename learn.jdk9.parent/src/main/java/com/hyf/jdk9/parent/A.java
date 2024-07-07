package com.hyf.jdk9.parent;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

/**
 * @author baB_hyf
 * @date 2021/04/19
 */
public class A {

    private static final VarHandle I;
    private static final VarHandle S;
    private static final VarHandle SA;

    static {
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        try {
            I = lookup.findVarHandle(A.class, "i", int.class);
            S = lookup.findVarHandle(A.class, "s", String.class);
            SA = MethodHandles.arrayElementVarHandle(String[].class);
        } catch (ReflectiveOperationException e) {
            throw new Error(e);
        }
    }

    private              int       i;
    private              String    s;
    private              String[]  sArr;

    public static void main(String[] args) {

    }
}
