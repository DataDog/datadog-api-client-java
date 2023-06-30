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

/** Type of the event. */
@JsonSerialize(
    using =
        CIAppCreatePipelineEventRequestDataType.CIAppCreatePipelineEventRequestDataTypeSerializer
            .class)
public class CIAppCreatePipelineEventRequestDataType extends ModelEnum<String> {

  public static final CIAppCreatePipelineEventRequestDataType CIPIPELINE_RESOURCE_REQUEST =
      new CIAppCreatePipelineEventRequestDataType("cipipeline_resource_request");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("cipipeline_resource_request"));

  CIAppCreatePipelineEventRequestDataType(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class CIAppCreatePipelineEventRequestDataTypeSerializer
      extends StdSerializer<CIAppCreatePipelineEventRequestDataType> {
    public CIAppCreatePipelineEventRequestDataTypeSerializer(
        Class<CIAppCreatePipelineEventRequestDataType> t) {
      super(t);
    }

    public CIAppCreatePipelineEventRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CIAppCreatePipelineEventRequestDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CIAppCreatePipelineEventRequestDataType fromValue(String value) {
    return new CIAppCreatePipelineEventRequestDataType(value);
  }
}
