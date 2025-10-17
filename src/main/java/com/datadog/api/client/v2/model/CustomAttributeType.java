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

/** Custom attributes type */
@JsonSerialize(using = CustomAttributeType.CustomAttributeTypeSerializer.class)
public class CustomAttributeType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("URL", "TEXT", "NUMBER"));

  public static final CustomAttributeType URL = new CustomAttributeType("URL");
  public static final CustomAttributeType TEXT = new CustomAttributeType("TEXT");
  public static final CustomAttributeType NUMBER = new CustomAttributeType("NUMBER");

  CustomAttributeType(String value) {
    super(value, allowedValues);
  }

  public static class CustomAttributeTypeSerializer extends StdSerializer<CustomAttributeType> {
    public CustomAttributeTypeSerializer(Class<CustomAttributeType> t) {
      super(t);
    }

    public CustomAttributeTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CustomAttributeType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CustomAttributeType fromValue(String value) {
    return new CustomAttributeType(value);
  }
}
