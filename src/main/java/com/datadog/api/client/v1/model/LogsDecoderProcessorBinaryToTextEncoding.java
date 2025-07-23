/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** The encoding used to represent the binary data. */
@JsonSerialize(
    using =
        LogsDecoderProcessorBinaryToTextEncoding.LogsDecoderProcessorBinaryToTextEncodingSerializer
            .class)
public class LogsDecoderProcessorBinaryToTextEncoding extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("base64", "base16"));

  public static final LogsDecoderProcessorBinaryToTextEncoding BASE64 =
      new LogsDecoderProcessorBinaryToTextEncoding("base64");
  public static final LogsDecoderProcessorBinaryToTextEncoding BASE16 =
      new LogsDecoderProcessorBinaryToTextEncoding("base16");

  LogsDecoderProcessorBinaryToTextEncoding(String value) {
    super(value, allowedValues);
  }

  public static class LogsDecoderProcessorBinaryToTextEncodingSerializer
      extends StdSerializer<LogsDecoderProcessorBinaryToTextEncoding> {
    public LogsDecoderProcessorBinaryToTextEncodingSerializer(
        Class<LogsDecoderProcessorBinaryToTextEncoding> t) {
      super(t);
    }

    public LogsDecoderProcessorBinaryToTextEncodingSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LogsDecoderProcessorBinaryToTextEncoding value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LogsDecoderProcessorBinaryToTextEncoding fromValue(String value) {
    return new LogsDecoderProcessorBinaryToTextEncoding(value);
  }
}
