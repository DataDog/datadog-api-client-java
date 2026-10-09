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

/** Severity override resource type. */
@JsonSerialize(using = SeverityOverrideDataType.SeverityOverrideDataTypeSerializer.class)
public class SeverityOverrideDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("severity_override"));

  public static final SeverityOverrideDataType SEVERITY_OVERRIDE =
      new SeverityOverrideDataType("severity_override");

  SeverityOverrideDataType(String value) {
    super(value, allowedValues);
  }

  public static class SeverityOverrideDataTypeSerializer
      extends StdSerializer<SeverityOverrideDataType> {
    public SeverityOverrideDataTypeSerializer(Class<SeverityOverrideDataType> t) {
      super(t);
    }

    public SeverityOverrideDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SeverityOverrideDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SeverityOverrideDataType fromValue(String value) {
    return new SeverityOverrideDataType(value);
  }
}
