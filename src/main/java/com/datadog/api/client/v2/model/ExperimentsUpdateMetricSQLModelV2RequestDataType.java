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

/** Metric SQL models resource type. */
@JsonSerialize(
    using =
        ExperimentsUpdateMetricSQLModelV2RequestDataType
            .ExperimentsUpdateMetricSQLModelV2RequestDataTypeSerializer.class)
public class ExperimentsUpdateMetricSQLModelV2RequestDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("metric-sql-models"));

  public static final ExperimentsUpdateMetricSQLModelV2RequestDataType METRIC_SQL_MODELS =
      new ExperimentsUpdateMetricSQLModelV2RequestDataType("metric-sql-models");

  ExperimentsUpdateMetricSQLModelV2RequestDataType(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsUpdateMetricSQLModelV2RequestDataTypeSerializer
      extends StdSerializer<ExperimentsUpdateMetricSQLModelV2RequestDataType> {
    public ExperimentsUpdateMetricSQLModelV2RequestDataTypeSerializer(
        Class<ExperimentsUpdateMetricSQLModelV2RequestDataType> t) {
      super(t);
    }

    public ExperimentsUpdateMetricSQLModelV2RequestDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsUpdateMetricSQLModelV2RequestDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsUpdateMetricSQLModelV2RequestDataType fromValue(String value) {
    return new ExperimentsUpdateMetricSQLModelV2RequestDataType(value);
  }
}
