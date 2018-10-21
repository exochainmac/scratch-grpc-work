package com.exochain.grpc.server;

public class AbstractBuilderFactoryCfg implements BuilderFactoryCfg {
    private CfgId cfgId;
    private ServerType serverType;

    public AbstractBuilderFactoryCfg(CfgId cfgId, ServerType serverType) {
        this.cfgId = cfgId;
        this.serverType = serverType;
    }

    @Override
    public CfgId getCfgId() {
        return cfgId;
    }

    @Override
    public ServerType getServerType() {
        return serverType;
    }
}
