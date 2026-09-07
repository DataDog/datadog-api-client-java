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

/** Analysis request resource type. */
@JsonSerialize(using = AnalysisRequestDataType.AnalysisRequestDataTypeSerializer.class)
public class AnalysisRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("analysis_request"));

  public static final AnalysisRequestDataType ANALYSIS_REQUEST =
      new AnalysisRequestDataType("analysis_request");

  AnalysisRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class AnalysisRequestDataTypeSerializer
      extends StdSerializer<AnalysisRequestDataType> {
    public AnalysisRequestDataTypeSerializer(Class<AnalysisRequestDataType> t) {
      super(t);
    }

    public AnalysisRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AnalysisRequestDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AnalysisRequestDataType fromValue(String value) {
    return new AnalysisRequestDataType(value);
  }
}
