package com.exochain.grpc.server;

/**
 * Marker interface
 */
public interface BuilderFactoryCfg {
    CfgId getCfgId();
    ServerType getServerType();
}
