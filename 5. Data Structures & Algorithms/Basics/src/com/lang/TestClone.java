package com.lang;

public class TestClone implements Cloneable {
    int a;
    double d;

    TestClone cloneClass() {
        try {
            return (TestClone) super.clone();
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
            return this;
        }
    }

    public TestClone clone() {
        try {
            return (TestClone) super.clone();
        } catch (CloneNotSupportedException cnse) {
            cnse.printStackTrace();
            return this;
        }
    }
}
