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
@JsonSerialize(using = AiGatewayCaptureOverrideMode.AiGatewayCaptureOverrideModeSerializer.class)
public class AiGatewayCaptureOverrideMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("metadata_only", "full_capture"));

  public static final AiGatewayCaptureOverrideMode METADATA_ONLY =
      new AiGatewayCaptureOverrideMode("metadata_only");
  public static final AiGatewayCaptureOverrideMode FULL_CAPTURE =
      new AiGatewayCaptureOverrideMode("full_capture");

  AiGatewayCaptureOverrideMode(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayCaptureOverrideModeSerializer
      extends StdSerializer<AiGatewayCaptureOverrideMode> {
    public AiGatewayCaptureOverrideModeSerializer(Class<AiGatewayCaptureOverrideMode> t) {
      super(t);
    }

    public AiGatewayCaptureOverrideModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayCaptureOverrideMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayCaptureOverrideMode fromValue(String value) {
    return new AiGatewayCaptureOverrideMode(value);
  }
}
