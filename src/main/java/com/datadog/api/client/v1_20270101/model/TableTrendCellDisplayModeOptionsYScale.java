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
@JsonSerialize(
    using =
        TableTrendCellDisplayModeOptionsYScale.TableTrendCellDisplayModeOptionsYScaleSerializer
            .class)
public class TableTrendCellDisplayModeOptionsYScale extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("shared", "independent"));

  public static final TableTrendCellDisplayModeOptionsYScale SHARED =
      new TableTrendCellDisplayModeOptionsYScale("shared");
  public static final TableTrendCellDisplayModeOptionsYScale INDEPENDENT =
      new TableTrendCellDisplayModeOptionsYScale("independent");

  TableTrendCellDisplayModeOptionsYScale(String value) {
    super(value, allowedValues);
  }

  public static class TableTrendCellDisplayModeOptionsYScaleSerializer
      extends StdSerializer<TableTrendCellDisplayModeOptionsYScale> {
    public TableTrendCellDisplayModeOptionsYScaleSerializer(
        Class<TableTrendCellDisplayModeOptionsYScale> t) {
      super(t);
    }

    public TableTrendCellDisplayModeOptionsYScaleSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TableTrendCellDisplayModeOptionsYScale value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TableTrendCellDisplayModeOptionsYScale fromValue(String value) {
    return new TableTrendCellDisplayModeOptionsYScale(value);
  }
}
