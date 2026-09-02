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

/** Security findings resource type. */
@JsonSerialize(using = FindingDataType.FindingDataTypeSerializer.class)
public class FindingDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("findings"));

  public static final FindingDataType FINDINGS = new FindingDataType("findings");

  FindingDataType(String value) {
    super(value, allowedValues);
  }

  public static class FindingDataTypeSerializer extends StdSerializer<FindingDataType> {
    public FindingDataTypeSerializer(Class<FindingDataType> t) {
      super(t);
    }

    public FindingDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(FindingDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FindingDataType fromValue(String value) {
    return new FindingDataType(value);
  }
}
