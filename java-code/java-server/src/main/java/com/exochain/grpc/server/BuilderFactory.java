package com.exochain.grpc.server;

import io.grpc.ServerBuilder;

public interface BuilderFactory {
    ServerBuilder makeBuilder(CfgId cfgId);
}
