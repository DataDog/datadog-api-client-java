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

/** The saved filter resource type. */
@JsonSerialize(using = SavedFilterDataType.SavedFilterDataTypeSerializer.class)
public class SavedFilterDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("saved-filters"));

  public static final SavedFilterDataType SAVED_FILTERS = new SavedFilterDataType("saved-filters");

  SavedFilterDataType(String value) {
    super(value, allowedValues);
  }

  public static class SavedFilterDataTypeSerializer extends StdSerializer<SavedFilterDataType> {
    public SavedFilterDataTypeSerializer(Class<SavedFilterDataType> t) {
      super(t);
    }

    public SavedFilterDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SavedFilterDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SavedFilterDataType fromValue(String value) {
    return new SavedFilterDataType(value);
  }
}
