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

/** Zero data retention requirement for the organization's requests. */
@JsonSerialize(using = AiGatewayZDRMode.AiGatewayZDRModeSerializer.class)
public class AiGatewayZDRMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("off", "required"));

  public static final AiGatewayZDRMode OFF = new AiGatewayZDRMode("off");
  public static final AiGatewayZDRMode REQUIRED = new AiGatewayZDRMode("required");

  AiGatewayZDRMode(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayZDRModeSerializer extends StdSerializer<AiGatewayZDRMode> {
    public AiGatewayZDRModeSerializer(Class<AiGatewayZDRMode> t) {
      super(t);
    }

    public AiGatewayZDRModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(AiGatewayZDRMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayZDRMode fromValue(String value) {
    return new AiGatewayZDRMode(value);
  }
}
