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

/** The resource type for datastores. */
@JsonSerialize(using = DatastoreDataType.DatastoreDataTypeSerializer.class)
public class DatastoreDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("datastores"));

  public static final DatastoreDataType DATASTORES = new DatastoreDataType("datastores");

  DatastoreDataType(String value) {
    super(value, allowedValues);
  }

  public static class DatastoreDataTypeSerializer extends StdSerializer<DatastoreDataType> {
    public DatastoreDataTypeSerializer(Class<DatastoreDataType> t) {
      super(t);
    }

    public DatastoreDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(DatastoreDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DatastoreDataType fromValue(String value) {
    return new DatastoreDataType(value);
  }
}
