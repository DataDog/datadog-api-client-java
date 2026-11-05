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

/**
 * Completeness of the matched source record. Partial also identifies metadata from a base model for
 * a dated snapshot or from a shared canonical-model fallback.
 */
@JsonSerialize(using = AiGatewayModelMetadataStatus.AiGatewayModelMetadataStatusSerializer.class)
public class AiGatewayModelMetadataStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("available", "partial"));

  public static final AiGatewayModelMetadataStatus AVAILABLE =
      new AiGatewayModelMetadataStatus("available");
  public static final AiGatewayModelMetadataStatus PARTIAL =
      new AiGatewayModelMetadataStatus("partial");

  AiGatewayModelMetadataStatus(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayModelMetadataStatusSerializer
      extends StdSerializer<AiGatewayModelMetadataStatus> {
    public AiGatewayModelMetadataStatusSerializer(Class<AiGatewayModelMetadataStatus> t) {
      super(t);
    }

    public AiGatewayModelMetadataStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayModelMetadataStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayModelMetadataStatus fromValue(String value) {
    return new AiGatewayModelMetadataStatus(value);
  }
}
