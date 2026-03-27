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

/** The data transform type. */
@JsonSerialize(using = DataTransformType.DataTransformTypeSerializer.class)
public class DataTransformType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("dataTransform"));

  public static final DataTransformType DATATRANSFORM = new DataTransformType("dataTransform");

  DataTransformType(String value) {
    super(value, allowedValues);
  }

  public static class DataTransformTypeSerializer extends StdSerializer<DataTransformType> {
    public DataTransformTypeSerializer(Class<DataTransformType> t) {
      super(t);
    }

    public DataTransformTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(DataTransformType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DataTransformType fromValue(String value) {
    return new DataTransformType(value);
  }
}
