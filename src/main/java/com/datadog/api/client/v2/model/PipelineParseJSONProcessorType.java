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

/** The processor type. The value should always be <code>parse_json</code>. */
@JsonSerialize(
    using = PipelineParseJSONProcessorType.PipelineParseJSONProcessorTypeSerializer.class)
public class PipelineParseJSONProcessorType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("parse_json"));

  public static final PipelineParseJSONProcessorType PARSE_JSON =
      new PipelineParseJSONProcessorType("parse_json");

  PipelineParseJSONProcessorType(String value) {
    super(value, allowedValues);
  }

  public static class PipelineParseJSONProcessorTypeSerializer
      extends StdSerializer<PipelineParseJSONProcessorType> {
    public PipelineParseJSONProcessorTypeSerializer(Class<PipelineParseJSONProcessorType> t) {
      super(t);
    }

    public PipelineParseJSONProcessorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PipelineParseJSONProcessorType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PipelineParseJSONProcessorType fromValue(String value) {
    return new PipelineParseJSONProcessorType(value);
  }
}
