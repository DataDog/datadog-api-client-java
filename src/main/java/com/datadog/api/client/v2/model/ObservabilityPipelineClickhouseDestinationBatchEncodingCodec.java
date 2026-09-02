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

/** The codec used for batch encoding. Only <code>arrow_stream</code> is supported. */
@JsonSerialize(
    using =
        ObservabilityPipelineClickhouseDestinationBatchEncodingCodec
            .ObservabilityPipelineClickhouseDestinationBatchEncodingCodecSerializer.class)
public class ObservabilityPipelineClickhouseDestinationBatchEncodingCodec
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("arrow_stream"));

  public static final ObservabilityPipelineClickhouseDestinationBatchEncodingCodec ARROW_STREAM =
      new ObservabilityPipelineClickhouseDestinationBatchEncodingCodec("arrow_stream");

  ObservabilityPipelineClickhouseDestinationBatchEncodingCodec(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineClickhouseDestinationBatchEncodingCodecSerializer
      extends StdSerializer<ObservabilityPipelineClickhouseDestinationBatchEncodingCodec> {
    public ObservabilityPipelineClickhouseDestinationBatchEncodingCodecSerializer(
        Class<ObservabilityPipelineClickhouseDestinationBatchEncodingCodec> t) {
      super(t);
    }

    public ObservabilityPipelineClickhouseDestinationBatchEncodingCodecSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineClickhouseDestinationBatchEncodingCodec value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineClickhouseDestinationBatchEncodingCodec fromValue(
      String value) {
    return new ObservabilityPipelineClickhouseDestinationBatchEncodingCodec(value);
  }
}
