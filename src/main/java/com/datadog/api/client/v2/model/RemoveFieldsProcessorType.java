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

/** The definition of <code>RemoveFieldsProcessorType</code> object. */
@JsonSerialize(using = RemoveFieldsProcessorType.RemoveFieldsProcessorTypeSerializer.class)
public class RemoveFieldsProcessorType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("remove_fields"));

  public static final RemoveFieldsProcessorType REMOVE_FIELDS =
      new RemoveFieldsProcessorType("remove_fields");

  RemoveFieldsProcessorType(String value) {
    super(value, allowedValues);
  }

  public static class RemoveFieldsProcessorTypeSerializer
      extends StdSerializer<RemoveFieldsProcessorType> {
    public RemoveFieldsProcessorTypeSerializer(Class<RemoveFieldsProcessorType> t) {
      super(t);
    }

    public RemoveFieldsProcessorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RemoveFieldsProcessorType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RemoveFieldsProcessorType fromValue(String value) {
    return new RemoveFieldsProcessorType(value);
  }
}
