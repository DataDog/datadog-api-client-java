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

/** The processor type. The value should always be <code>parse_xml</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineParseXMLProcessorType
            .ObservabilityPipelineParseXMLProcessorTypeSerializer.class)
public class ObservabilityPipelineParseXMLProcessorType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("parse_xml"));

  public static final ObservabilityPipelineParseXMLProcessorType PARSE_XML =
      new ObservabilityPipelineParseXMLProcessorType("parse_xml");

  ObservabilityPipelineParseXMLProcessorType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineParseXMLProcessorTypeSerializer
      extends StdSerializer<ObservabilityPipelineParseXMLProcessorType> {
    public ObservabilityPipelineParseXMLProcessorTypeSerializer(
        Class<ObservabilityPipelineParseXMLProcessorType> t) {
      super(t);
    }

    public ObservabilityPipelineParseXMLProcessorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineParseXMLProcessorType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineParseXMLProcessorType fromValue(String value) {
    return new ObservabilityPipelineParseXMLProcessorType(value);
  }
}
