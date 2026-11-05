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

/** Data capture overrides resource type. */
@JsonSerialize(
    using =
        AiGatewayCaptureUpdateRequestDataType.AiGatewayCaptureUpdateRequestDataTypeSerializer.class)
public class AiGatewayCaptureUpdateRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("data-capture-overrides"));

  public static final AiGatewayCaptureUpdateRequestDataType DATA_CAPTURE_OVERRIDES =
      new AiGatewayCaptureUpdateRequestDataType("data-capture-overrides");

  AiGatewayCaptureUpdateRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayCaptureUpdateRequestDataTypeSerializer
      extends StdSerializer<AiGatewayCaptureUpdateRequestDataType> {
    public AiGatewayCaptureUpdateRequestDataTypeSerializer(
        Class<AiGatewayCaptureUpdateRequestDataType> t) {
      super(t);
    }

    public AiGatewayCaptureUpdateRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayCaptureUpdateRequestDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayCaptureUpdateRequestDataType fromValue(String value) {
    return new AiGatewayCaptureUpdateRequestDataType(value);
  }
}
