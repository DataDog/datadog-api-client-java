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

/** Capture mode for matching traffic. */
@JsonSerialize(
    using =
        AiGatewayCaptureCreateRequestDataAttributesMode
            .AiGatewayCaptureCreateRequestDataAttributesModeSerializer.class)
public class AiGatewayCaptureCreateRequestDataAttributesMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("metadata_only", "full_capture"));

  public static final AiGatewayCaptureCreateRequestDataAttributesMode METADATA_ONLY =
      new AiGatewayCaptureCreateRequestDataAttributesMode("metadata_only");
  public static final AiGatewayCaptureCreateRequestDataAttributesMode FULL_CAPTURE =
      new AiGatewayCaptureCreateRequestDataAttributesMode("full_capture");

  AiGatewayCaptureCreateRequestDataAttributesMode(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayCaptureCreateRequestDataAttributesModeSerializer
      extends StdSerializer<AiGatewayCaptureCreateRequestDataAttributesMode> {
    public AiGatewayCaptureCreateRequestDataAttributesModeSerializer(
        Class<AiGatewayCaptureCreateRequestDataAttributesMode> t) {
      super(t);
    }

    public AiGatewayCaptureCreateRequestDataAttributesModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayCaptureCreateRequestDataAttributesMode value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayCaptureCreateRequestDataAttributesMode fromValue(String value) {
    return new AiGatewayCaptureCreateRequestDataAttributesMode(value);
  }
}
