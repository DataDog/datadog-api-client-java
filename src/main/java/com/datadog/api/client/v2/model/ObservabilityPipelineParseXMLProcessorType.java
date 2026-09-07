/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>The processor type. The value should always be <code>parse_xml</code>.</p>
 */
@JsonSerialize(using = ObservabilityPipelineParseXMLProcessorType.ObservabilityPipelineParseXMLProcessorTypeSerializer.class)
public class ObservabilityPipelineParseXMLProcessorType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("parse_xml"));

  public static final ObservabilityPipelineParseXMLProcessorType PARSE_XML = new ObservabilityPipelineParseXMLProcessorType("parse_xml");


  ObservabilityPipelineParseXMLProcessorType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineParseXMLProcessorTypeSerializer extends StdSerializer<ObservabilityPipelineParseXMLProcessorType> {
      public ObservabilityPipelineParseXMLProcessorTypeSerializer(Class<ObservabilityPipelineParseXMLProcessorType> t) {
          super(t);
      }

      public ObservabilityPipelineParseXMLProcessorTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(ObservabilityPipelineParseXMLProcessorType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static ObservabilityPipelineParseXMLProcessorType fromValue(String value) {
    return new ObservabilityPipelineParseXMLProcessorType(value);
  }
}
