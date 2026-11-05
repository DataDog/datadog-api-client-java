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
        AiGatewayCaptureOverrideResponseDataAttributesMode
            .AiGatewayCaptureOverrideResponseDataAttributesModeSerializer.class)
public class AiGatewayCaptureOverrideResponseDataAttributesMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("metadata_only", "full_capture"));

  public static final AiGatewayCaptureOverrideResponseDataAttributesMode METADATA_ONLY =
      new AiGatewayCaptureOverrideResponseDataAttributesMode("metadata_only");
  public static final AiGatewayCaptureOverrideResponseDataAttributesMode FULL_CAPTURE =
      new AiGatewayCaptureOverrideResponseDataAttributesMode("full_capture");

  AiGatewayCaptureOverrideResponseDataAttributesMode(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayCaptureOverrideResponseDataAttributesModeSerializer
      extends StdSerializer<AiGatewayCaptureOverrideResponseDataAttributesMode> {
    public AiGatewayCaptureOverrideResponseDataAttributesModeSerializer(
        Class<AiGatewayCaptureOverrideResponseDataAttributesMode> t) {
      super(t);
    }

    public AiGatewayCaptureOverrideResponseDataAttributesModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayCaptureOverrideResponseDataAttributesMode value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayCaptureOverrideResponseDataAttributesMode fromValue(String value) {
    return new AiGatewayCaptureOverrideResponseDataAttributesMode(value);
  }
}
