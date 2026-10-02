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

/** Data type of a column in the SQL model. */
@JsonSerialize(
    using =
        ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType
            .ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnTypeSerializer
            .class)
public class ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("STRING", "INTEGER", "FLOAT", "BOOLEAN", "DATE", "TIMESTAMP"));

  public static final ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType
      STRING =
          new ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType("STRING");
  public static final ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType
      INTEGER =
          new ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType("INTEGER");
  public static final ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType
      FLOAT = new ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType("FLOAT");
  public static final ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType
      BOOLEAN =
          new ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType("BOOLEAN");
  public static final ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType DATE =
      new ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType("DATE");
  public static final ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType
      TIMESTAMP =
          new ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType("TIMESTAMP");

  ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType(String value) {
    super(value, allowedValues);
  }

  public static
  class ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnTypeSerializer
      extends StdSerializer<
          ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType> {
    public ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnTypeSerializer(
        Class<ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType> t) {
      super(t);
    }

    public ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType fromValue(
      String value) {
    return new ExperimentsCreateExposureSQLModelV2RequestDataAttributesItemsColumnType(value);
  }
}
