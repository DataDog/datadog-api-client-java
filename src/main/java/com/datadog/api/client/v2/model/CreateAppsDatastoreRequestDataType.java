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

/** Datastores resource type. */
@JsonSerialize(
    using = CreateAppsDatastoreRequestDataType.CreateAppsDatastoreRequestDataTypeSerializer.class)
public class CreateAppsDatastoreRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("datastores"));

  public static final CreateAppsDatastoreRequestDataType DATASTORES =
      new CreateAppsDatastoreRequestDataType("datastores");

  CreateAppsDatastoreRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class CreateAppsDatastoreRequestDataTypeSerializer
      extends StdSerializer<CreateAppsDatastoreRequestDataType> {
    public CreateAppsDatastoreRequestDataTypeSerializer(
        Class<CreateAppsDatastoreRequestDataType> t) {
      super(t);
    }

    public CreateAppsDatastoreRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CreateAppsDatastoreRequestDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CreateAppsDatastoreRequestDataType fromValue(String value) {
    return new CreateAppsDatastoreRequestDataType(value);
  }
}
