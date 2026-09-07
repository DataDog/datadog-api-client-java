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

/** The decoding format used to interpret incoming logs. */
@JsonSerialize(using = ObservabilityPipelineDecoding.ObservabilityPipelineDecodingSerializer.class)
public class ObservabilityPipelineDecoding extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("bytes", "gelf", "json", "syslog"));

  public static final ObservabilityPipelineDecoding DECODE_BYTES =
      new ObservabilityPipelineDecoding("bytes");
  public static final ObservabilityPipelineDecoding DECODE_GELF =
      new ObservabilityPipelineDecoding("gelf");
  public static final ObservabilityPipelineDecoding DECODE_JSON =
      new ObservabilityPipelineDecoding("json");
  public static final ObservabilityPipelineDecoding DECODE_SYSLOG =
      new ObservabilityPipelineDecoding("syslog");

  ObservabilityPipelineDecoding(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineDecodingSerializer
      extends StdSerializer<ObservabilityPipelineDecoding> {
    public ObservabilityPipelineDecodingSerializer(Class<ObservabilityPipelineDecoding> t) {
      super(t);
    }

    public ObservabilityPipelineDecodingSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineDecoding value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineDecoding fromValue(String value) {
    return new ObservabilityPipelineDecoding(value);
  }
}
