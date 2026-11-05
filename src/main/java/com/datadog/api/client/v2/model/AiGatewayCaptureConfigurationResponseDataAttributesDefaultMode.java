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

/** Default capture mode for the organization. Change it in <strong>Org defaults</strong>. */
@JsonSerialize(
    using =
        AiGatewayCaptureConfigurationResponseDataAttributesDefaultMode
            .AiGatewayCaptureConfigurationResponseDataAttributesDefaultModeSerializer.class)
public class AiGatewayCaptureConfigurationResponseDataAttributesDefaultMode
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("metadata_only", "full_capture"));

  public static final AiGatewayCaptureConfigurationResponseDataAttributesDefaultMode METADATA_ONLY =
      new AiGatewayCaptureConfigurationResponseDataAttributesDefaultMode("metadata_only");
  public static final AiGatewayCaptureConfigurationResponseDataAttributesDefaultMode FULL_CAPTURE =
      new AiGatewayCaptureConfigurationResponseDataAttributesDefaultMode("full_capture");

  AiGatewayCaptureConfigurationResponseDataAttributesDefaultMode(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayCaptureConfigurationResponseDataAttributesDefaultModeSerializer
      extends StdSerializer<AiGatewayCaptureConfigurationResponseDataAttributesDefaultMode> {
    public AiGatewayCaptureConfigurationResponseDataAttributesDefaultModeSerializer(
        Class<AiGatewayCaptureConfigurationResponseDataAttributesDefaultMode> t) {
      super(t);
    }

    public AiGatewayCaptureConfigurationResponseDataAttributesDefaultModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayCaptureConfigurationResponseDataAttributesDefaultMode value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayCaptureConfigurationResponseDataAttributesDefaultMode fromValue(
      String value) {
    return new AiGatewayCaptureConfigurationResponseDataAttributesDefaultMode(value);
  }
}
