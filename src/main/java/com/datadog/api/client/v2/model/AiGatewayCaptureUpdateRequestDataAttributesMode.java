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
        AiGatewayCaptureUpdateRequestDataAttributesMode
            .AiGatewayCaptureUpdateRequestDataAttributesModeSerializer.class)
public class AiGatewayCaptureUpdateRequestDataAttributesMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("metadata_only", "full_capture"));

  public static final AiGatewayCaptureUpdateRequestDataAttributesMode METADATA_ONLY =
      new AiGatewayCaptureUpdateRequestDataAttributesMode("metadata_only");
  public static final AiGatewayCaptureUpdateRequestDataAttributesMode FULL_CAPTURE =
      new AiGatewayCaptureUpdateRequestDataAttributesMode("full_capture");

  AiGatewayCaptureUpdateRequestDataAttributesMode(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayCaptureUpdateRequestDataAttributesModeSerializer
      extends StdSerializer<AiGatewayCaptureUpdateRequestDataAttributesMode> {
    public AiGatewayCaptureUpdateRequestDataAttributesModeSerializer(
        Class<AiGatewayCaptureUpdateRequestDataAttributesMode> t) {
      super(t);
    }

    public AiGatewayCaptureUpdateRequestDataAttributesModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayCaptureUpdateRequestDataAttributesMode value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayCaptureUpdateRequestDataAttributesMode fromValue(String value) {
    return new AiGatewayCaptureUpdateRequestDataAttributesMode(value);
  }
}
