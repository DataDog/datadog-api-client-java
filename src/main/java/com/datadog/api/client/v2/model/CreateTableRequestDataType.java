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

/** Reference table resource type. */
@JsonSerialize(using = CreateTableRequestDataType.CreateTableRequestDataTypeSerializer.class)
public class CreateTableRequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("reference_table"));

  public static final CreateTableRequestDataType REFERENCE_TABLE =
      new CreateTableRequestDataType("reference_table");

  CreateTableRequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class CreateTableRequestDataTypeSerializer
      extends StdSerializer<CreateTableRequestDataType> {
    public CreateTableRequestDataTypeSerializer(Class<CreateTableRequestDataType> t) {
      super(t);
    }

    public CreateTableRequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CreateTableRequestDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CreateTableRequestDataType fromValue(String value) {
    return new CreateTableRequestDataType(value);
  }
}
