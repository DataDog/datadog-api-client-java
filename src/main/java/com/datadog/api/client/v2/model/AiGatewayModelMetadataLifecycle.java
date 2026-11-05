/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** Model lifecycle state. */
@JsonSerialize(
    using = AiGatewayModelMetadataLifecycle.AiGatewayModelMetadataLifecycleSerializer.class)
public class AiGatewayModelMetadataLifecycle extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("active", "alpha", "beta", "deprecated"));

  public static final AiGatewayModelMetadataLifecycle ACTIVE =
      new AiGatewayModelMetadataLifecycle("active");
  public static final AiGatewayModelMetadataLifecycle ALPHA =
      new AiGatewayModelMetadataLifecycle("alpha");
  public static final AiGatewayModelMetadataLifecycle BETA =
      new AiGatewayModelMetadataLifecycle("beta");
  public static final AiGatewayModelMetadataLifecycle DEPRECATED =
      new AiGatewayModelMetadataLifecycle("deprecated");

  AiGatewayModelMetadataLifecycle(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayModelMetadataLifecycleSerializer
      extends StdSerializer<AiGatewayModelMetadataLifecycle> {
    public AiGatewayModelMetadataLifecycleSerializer(Class<AiGatewayModelMetadataLifecycle> t) {
      super(t);
    }

    public AiGatewayModelMetadataLifecycleSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayModelMetadataLifecycle value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayModelMetadataLifecycle fromValue(String value) {
    return new AiGatewayModelMetadataLifecycle(value);
  }
}
