package com.jcp.invoke.demo;

import somepackage.MultiplyDemo;
import somepackage.NativeLibrary;
import somepackage.Sm4Ref;

public class TestHello {

    public static void main(String[] args) throws Exception {

        MultiplyDemo.hello();

        NativeLibrary.NativeClass l = new NativeLibrary.NativeClass();
        l.set_property("Hello World!");
        System.out.println(l.property());

        Sm4Ref.main(null);
    }
}
