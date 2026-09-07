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

/** Byte frames according to the octet counting format as per RFC6587. */
@JsonSerialize(
    using =
        ObservabilityPipelineSocketSourceFramingOctetCountingMethod
            .ObservabilityPipelineSocketSourceFramingOctetCountingMethodSerializer.class)
public class ObservabilityPipelineSocketSourceFramingOctetCountingMethod extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("octet_counting"));

  public static final ObservabilityPipelineSocketSourceFramingOctetCountingMethod OCTET_COUNTING =
      new ObservabilityPipelineSocketSourceFramingOctetCountingMethod("octet_counting");

  ObservabilityPipelineSocketSourceFramingOctetCountingMethod(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineSocketSourceFramingOctetCountingMethodSerializer
      extends StdSerializer<ObservabilityPipelineSocketSourceFramingOctetCountingMethod> {
    public ObservabilityPipelineSocketSourceFramingOctetCountingMethodSerializer(
        Class<ObservabilityPipelineSocketSourceFramingOctetCountingMethod> t) {
      super(t);
    }

    public ObservabilityPipelineSocketSourceFramingOctetCountingMethodSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineSocketSourceFramingOctetCountingMethod value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineSocketSourceFramingOctetCountingMethod fromValue(
      String value) {
    return new ObservabilityPipelineSocketSourceFramingOctetCountingMethod(value);
  }
}
