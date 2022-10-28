package rs;

import rs.behavioral.command.CommandPattern;
import rs.behavioral.memento.MementoPattern;
import rs.creational.builder.BuilderPattern;
import rs.structural.adapter.AdapterPattern;
import rs.structural.proxy.ProxyPattern;

public class DemoApp {
    public static void main(String[] args) {
        System.out.println("*****************************************");
        System.out.println("*** Gang of Four Design Patterns Demo ***");
        System.out.println("*****************************************");
        System.out.println();
        System.out.println("### Creational Patterns ###");
        System.out.println();
        BuilderPattern.run();
        System.out.println("### Structural Patterns ###");
        System.out.println();
        AdapterPattern.run();
        ProxyPattern.run();
        System.out.println("### Behavioral Patterns ###");
        System.out.println();
        CommandPattern.run();
        MementoPattern.run();
    }
}
