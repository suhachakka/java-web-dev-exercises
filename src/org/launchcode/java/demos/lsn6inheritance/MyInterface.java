package org.launchcode.java.demos.lsn6inheritance;

public interface MyInterface {
    void someMethod();

    //A default method has a body and is a fully-formed method. It is preceded with the default keyword,
    // and it may be overridden by classes implementing the interface.
    default void someOtherMethods(){

    }
}
