package com.github.fridujo.markdown.junit.engine.visitor;

public sealed interface TestNode permits ContainerNode, NamedRunnable {

    String name();

    Type type();

    enum Type {
        CONTAINER,
        TEST,
    }

    interface Builder {
        TestNode build();
    }
}