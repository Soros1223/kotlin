// FILE: A.java
public @interface A {
    int a();
    double b();
    boolean x();
}

// FILE: b.kt
A(<!CONSTANT_EXPECTED_TYPE_MISMATCH, POSITIONED_VALUE_ARGUMENT_FOR_JAVA_ANNOTATION!>false<!>,
<!POSITIONED_VALUE_ARGUMENT_FOR_JAVA_ANNOTATION!>1.0<!>,
<!POSITIONED_VALUE_ARGUMENT_FOR_JAVA_ANNOTATION!>false<!>) fun foo1() {}

A(<!CONSTANT_EXPECTED_TYPE_MISMATCH, POSITIONED_VALUE_ARGUMENT_FOR_JAVA_ANNOTATION!>2.0<!>, x = true, b = 2.0) fun foo2() {}
