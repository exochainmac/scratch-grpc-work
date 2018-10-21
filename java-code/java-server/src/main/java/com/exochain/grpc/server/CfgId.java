package com.exochain.grpc.server;

import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import static com.google.common.base.Preconditions.checkArgument;

@Data
public class CfgId {
    private final String id;

    public CfgId(String id) {
        checkArgument(StringUtils.isNotBlank(id), "id cannot be blank");
        this.id = id;
    }
}
