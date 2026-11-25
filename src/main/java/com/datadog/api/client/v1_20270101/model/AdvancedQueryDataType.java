/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(using = AdvancedQueryDataType.AdvancedQueryDataTypeSerializer.class)
public class AdvancedQueryDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "string",
              "group",
              "inet",
              "int64",
              "float64",
              "timestamp",
              "date",
              "interval",
              "bool",
              "json",
              "hstore",
              "array<string>",
              "array<int64>",
              "array<float64>",
              "array<timestamp>",
              "array<interval>",
              "array<bool>",
              "array<json>"));

  public static final AdvancedQueryDataType STRING = new AdvancedQueryDataType("string");
  public static final AdvancedQueryDataType GROUP = new AdvancedQueryDataType("group");
  public static final AdvancedQueryDataType INET = new AdvancedQueryDataType("inet");
  public static final AdvancedQueryDataType INT64 = new AdvancedQueryDataType("int64");
  public static final AdvancedQueryDataType FLOAT64 = new AdvancedQueryDataType("float64");
  public static final AdvancedQueryDataType TIMESTAMP = new AdvancedQueryDataType("timestamp");
  public static final AdvancedQueryDataType DATE = new AdvancedQueryDataType("date");
  public static final AdvancedQueryDataType INTERVAL = new AdvancedQueryDataType("interval");
  public static final AdvancedQueryDataType BOOL = new AdvancedQueryDataType("bool");
  public static final AdvancedQueryDataType JSON = new AdvancedQueryDataType("json");
  public static final AdvancedQueryDataType HSTORE = new AdvancedQueryDataType("hstore");
  public static final AdvancedQueryDataType ARRAYLTSTRINGGT =
      new AdvancedQueryDataType("array<string>");
  public static final AdvancedQueryDataType ARRAYLTINT64GT =
      new AdvancedQueryDataType("array<int64>");
  public static final AdvancedQueryDataType ARRAYLTFLOAT64GT =
      new AdvancedQueryDataType("array<float64>");
  public static final AdvancedQueryDataType ARRAYLTTIMESTAMPGT =
      new AdvancedQueryDataType("array<timestamp>");
  public static final AdvancedQueryDataType ARRAYLTINTERVALGT =
      new AdvancedQueryDataType("array<interval>");
  public static final AdvancedQueryDataType ARRAYLTBOOLGT =
      new AdvancedQueryDataType("array<bool>");
  public static final AdvancedQueryDataType ARRAYLTJSONGT =
      new AdvancedQueryDataType("array<json>");

  AdvancedQueryDataType(String value) {
    super(value, allowedValues);
  }

  public static class AdvancedQueryDataTypeSerializer extends StdSerializer<AdvancedQueryDataType> {
    public AdvancedQueryDataTypeSerializer(Class<AdvancedQueryDataType> t) {
      super(t);
    }

    public AdvancedQueryDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AdvancedQueryDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AdvancedQueryDataType fromValue(String value) {
    return new AdvancedQueryDataType(value);
  }
}
