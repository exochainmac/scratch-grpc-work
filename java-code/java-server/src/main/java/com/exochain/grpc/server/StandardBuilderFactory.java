package com.exochain.grpc.server;

import io.grpc.ServerBuilder;
import lombok.NonNull;
import lombok.extern.slf4j.XSlf4j;

@XSlf4j
public class StandardBuilderFactory implements BuilderFactory {

    // Don't instantiate
    private StandardBuilderFactory() {
    }

    @Override
    public ServerBuilder makeBuilder(@NonNull CfgId cfgId) {
        L.entry(cfgId);
        BuilderFactoryCfg cfg = BuilderFactoryCfgRegistry.getConfiguration(cfgId);
        ServerType serverType = cfg.getServerType();
        return L.exit(serverType.getFactory().makeBuilder(cfgId));
    }
}
