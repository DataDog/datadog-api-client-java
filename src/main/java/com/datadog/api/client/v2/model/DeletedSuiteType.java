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
@JsonSerialize(using = DeletedSuiteType.DeletedSuiteTypeSerializer.class)
public class DeletedSuiteType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("suites"));

  public static final DeletedSuiteType SUITES = new DeletedSuiteType("suites");

  DeletedSuiteType(String value) {
    super(value, allowedValues);
  }

  public static class DeletedSuiteTypeSerializer extends StdSerializer<DeletedSuiteType> {
    public DeletedSuiteTypeSerializer(Class<DeletedSuiteType> t) {
      super(t);
    }

    public DeletedSuiteTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(DeletedSuiteType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DeletedSuiteType fromValue(String value) {
    return new DeletedSuiteType(value);
  }
}
