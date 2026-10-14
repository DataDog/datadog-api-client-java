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

/** Data type of the column evaluated by the entry-point filter. */
@JsonSerialize(
    using =
        ExperimentsDatadogEntryPointFilterColumnType
            .ExperimentsDatadogEntryPointFilterColumnTypeSerializer.class)
public class ExperimentsDatadogEntryPointFilterColumnType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "varchar",
              "int",
              "double",
              "boolean",
              "varchar_array",
              "int_array",
              "double_array",
              "raw"));

  public static final ExperimentsDatadogEntryPointFilterColumnType VARCHAR =
      new ExperimentsDatadogEntryPointFilterColumnType("varchar");
  public static final ExperimentsDatadogEntryPointFilterColumnType INT =
      new ExperimentsDatadogEntryPointFilterColumnType("int");
  public static final ExperimentsDatadogEntryPointFilterColumnType DOUBLE =
      new ExperimentsDatadogEntryPointFilterColumnType("double");
  public static final ExperimentsDatadogEntryPointFilterColumnType BOOLEAN =
      new ExperimentsDatadogEntryPointFilterColumnType("boolean");
  public static final ExperimentsDatadogEntryPointFilterColumnType VARCHAR_ARRAY =
      new ExperimentsDatadogEntryPointFilterColumnType("varchar_array");
  public static final ExperimentsDatadogEntryPointFilterColumnType INT_ARRAY =
      new ExperimentsDatadogEntryPointFilterColumnType("int_array");
  public static final ExperimentsDatadogEntryPointFilterColumnType DOUBLE_ARRAY =
      new ExperimentsDatadogEntryPointFilterColumnType("double_array");
  public static final ExperimentsDatadogEntryPointFilterColumnType RAW =
      new ExperimentsDatadogEntryPointFilterColumnType("raw");

  ExperimentsDatadogEntryPointFilterColumnType(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsDatadogEntryPointFilterColumnTypeSerializer
      extends StdSerializer<ExperimentsDatadogEntryPointFilterColumnType> {
    public ExperimentsDatadogEntryPointFilterColumnTypeSerializer(
        Class<ExperimentsDatadogEntryPointFilterColumnType> t) {
      super(t);
    }

    public ExperimentsDatadogEntryPointFilterColumnTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsDatadogEntryPointFilterColumnType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsDatadogEntryPointFilterColumnType fromValue(String value) {
    return new ExperimentsDatadogEntryPointFilterColumnType(value);
  }
}
