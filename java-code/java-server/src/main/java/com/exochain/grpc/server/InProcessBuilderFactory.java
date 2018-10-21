package com.exochain.grpc.server;

import io.grpc.ServerBuilder;
import io.grpc.inprocess.InProcessServerBuilder;
import lombok.NonNull;
import lombok.extern.slf4j.XSlf4j;

@XSlf4j
class InProcessBuilderFactory implements BuilderFactory {
    InProcessBuilderFactory() {
    }

    @Override
    public ServerBuilder makeBuilder(@NonNull CfgId cfgId) {
        L.entry(cfgId);
        InProcessBuilderFactoryCfg cfg = BuilderFactoryCfgRegistry.getConfiguration(cfgId, InProcessBuilderFactoryCfg.class);
        L.info("Constructed [{}(InProcessServerBuilder)] for cfgId [{}]", cfg.getServerType().toString(), cfgId.getId());
        return L.exit(InProcessServerBuilder.forName(cfg.getName()).directExecutor());
    }

}
