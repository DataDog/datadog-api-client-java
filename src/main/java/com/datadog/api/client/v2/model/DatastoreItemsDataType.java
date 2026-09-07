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

/** The resource type for datastore items. */
@JsonSerialize(using = DatastoreItemsDataType.DatastoreItemsDataTypeSerializer.class)
public class DatastoreItemsDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("items"));

  public static final DatastoreItemsDataType ITEMS = new DatastoreItemsDataType("items");

  DatastoreItemsDataType(String value) {
    super(value, allowedValues);
  }

  public static class DatastoreItemsDataTypeSerializer
      extends StdSerializer<DatastoreItemsDataType> {
    public DatastoreItemsDataTypeSerializer(Class<DatastoreItemsDataType> t) {
      super(t);
    }

    public DatastoreItemsDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DatastoreItemsDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DatastoreItemsDataType fromValue(String value) {
    return new DatastoreItemsDataType(value);
  }
}
