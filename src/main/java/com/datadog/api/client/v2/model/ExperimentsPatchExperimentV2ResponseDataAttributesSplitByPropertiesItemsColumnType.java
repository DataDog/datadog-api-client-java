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

/** Type of the Datadog exposure field or Warehouse column. */
@JsonSerialize(
    using =
        ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType
            .ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnTypeSerializer
            .class)
public class ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType
    extends ModelEnum<String> {

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
              "raw",
              "STRING",
              "INTEGER",
              "FLOAT",
              "BOOLEAN",
              "DATE",
              "TIMESTAMP"));

  public static final
  ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType VARCHAR =
      new ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType(
          "varchar");
  public static final
  ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType INT =
      new ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType("int");
  public static final
  ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType DOUBLE =
      new ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType(
          "double");
  public static final
  ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType
      BOOLEAN_DATADOG =
          new ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType(
              "boolean");
  public static final
  ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType VARCHAR_ARRAY =
      new ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType(
          "varchar_array");
  public static final
  ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType INT_ARRAY =
      new ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType(
          "int_array");
  public static final
  ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType DOUBLE_ARRAY =
      new ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType(
          "double_array");
  public static final
  ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType RAW =
      new ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType("raw");
  public static final
  ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType STRING =
      new ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType(
          "STRING");
  public static final
  ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType INTEGER =
      new ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType(
          "INTEGER");
  public static final
  ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType FLOAT =
      new ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType(
          "FLOAT");
  public static final
  ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType
      BOOLEAN_WAREHOUSE =
          new ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType(
              "BOOLEAN");
  public static final
  ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType DATE =
      new ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType(
          "DATE");
  public static final
  ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType TIMESTAMP =
      new ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType(
          "TIMESTAMP");

  ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType(String value) {
    super(value, allowedValues);
  }

  public static
  class ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnTypeSerializer
      extends StdSerializer<
          ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType> {
    public
    ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnTypeSerializer(
        Class<ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType>
            t) {
      super(t);
    }

    public
    ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType
      fromValue(String value) {
    return new ExperimentsPatchExperimentV2ResponseDataAttributesSplitByPropertiesItemsColumnType(
        value);
  }
}
