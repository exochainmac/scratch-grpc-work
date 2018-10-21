package com.exochain.grpc.server;

public enum ServerType {
    INPROC_DIRECT(new InProcessBuilderFactory())
    ;

    private final BuilderFactory factory;

    ServerType(BuilderFactory factory) {
        this.factory = factory;
    }

    public BuilderFactory getFactory() {
        return factory;
    }
}
