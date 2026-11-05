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

/** How a model catalog entry is managed. */
@JsonSerialize(using = AiGatewayModelSource.AiGatewayModelSourceSerializer.class)
public class AiGatewayModelSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("discovered", "manual"));

  public static final AiGatewayModelSource DISCOVERED = new AiGatewayModelSource("discovered");
  public static final AiGatewayModelSource MANUAL = new AiGatewayModelSource("manual");

  AiGatewayModelSource(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayModelSourceSerializer extends StdSerializer<AiGatewayModelSource> {
    public AiGatewayModelSourceSerializer(Class<AiGatewayModelSource> t) {
      super(t);
    }

    public AiGatewayModelSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayModelSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayModelSource fromValue(String value) {
    return new AiGatewayModelSource(value);
  }
}
