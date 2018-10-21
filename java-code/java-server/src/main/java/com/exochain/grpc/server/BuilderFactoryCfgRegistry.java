package com.exochain.grpc.server;

import lombok.NonNull;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class BuilderFactoryCfgRegistry {
    private static final int INITIAL_CONFIGS_SLOTS = 5;
    private static final ConcurrentMap<CfgId, BuilderFactoryCfg> configs =
            new ConcurrentHashMap<>(INITIAL_CONFIGS_SLOTS);

    // Don't instantiate
    private BuilderFactoryCfgRegistry() {
    }

    public static void setConfiguration(@NonNull final CfgId cfgId,
                                 @NonNull final BuilderFactoryCfg config) {
        configs.putIfAbsent(cfgId, config);
    }

    public static BuilderFactoryCfg getConfiguration(@NonNull final CfgId cfgId) {
        return configs.get(cfgId);
    }

    public static <T extends BuilderFactoryCfg> T getConfiguration(@NonNull final CfgId cfgId,
                                                            @NonNull Class<T> type) {
        return type.cast(getConfiguration(cfgId));
    }
}
