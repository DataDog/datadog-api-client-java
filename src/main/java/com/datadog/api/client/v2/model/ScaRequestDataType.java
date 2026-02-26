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

/** */
@JsonSerialize(using = ScaRequestDataType.ScaRequestDataTypeSerializer.class)
public class ScaRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("scarequests"));

  public static final ScaRequestDataType SCAREQUESTS = new ScaRequestDataType("scarequests");

  ScaRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class ScaRequestDataTypeSerializer extends StdSerializer<ScaRequestDataType> {
    public ScaRequestDataTypeSerializer(Class<ScaRequestDataType> t) {
      super(t);
    }

    public ScaRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(ScaRequestDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ScaRequestDataType fromValue(String value) {
    return new ScaRequestDataType(value);
  }
}
