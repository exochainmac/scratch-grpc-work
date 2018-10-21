package com.exochain.grpc.server;

public class InProcessBuilderFactoryCfg extends AbstractBuilderFactoryCfg {
    private String name;

    public InProcessBuilderFactoryCfg(CfgId cfgId, ServerType serverType) {
        super(cfgId, serverType);
    }

    public InProcessBuilderFactoryCfg(CfgId cfgId, ServerType serverType, String name) {
        super(cfgId, serverType);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
