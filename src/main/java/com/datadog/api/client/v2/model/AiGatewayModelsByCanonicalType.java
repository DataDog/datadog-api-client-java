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

/** Canonical model grouping resource type. */
@JsonSerialize(
    using = AiGatewayModelsByCanonicalType.AiGatewayModelsByCanonicalTypeSerializer.class)
public class AiGatewayModelsByCanonicalType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("models-by-canonical"));

  public static final AiGatewayModelsByCanonicalType MODELS_BY_CANONICAL =
      new AiGatewayModelsByCanonicalType("models-by-canonical");

  AiGatewayModelsByCanonicalType(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayModelsByCanonicalTypeSerializer
      extends StdSerializer<AiGatewayModelsByCanonicalType> {
    public AiGatewayModelsByCanonicalTypeSerializer(Class<AiGatewayModelsByCanonicalType> t) {
      super(t);
    }

    public AiGatewayModelsByCanonicalTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayModelsByCanonicalType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayModelsByCanonicalType fromValue(String value) {
    return new AiGatewayModelsByCanonicalType(value);
  }
}
