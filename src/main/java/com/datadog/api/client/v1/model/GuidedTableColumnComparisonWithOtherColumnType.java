/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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
@JsonSerialize(
    using =
        GuidedTableColumnComparisonWithOtherColumnType
            .GuidedTableColumnComparisonWithOtherColumnTypeSerializer.class)
public class GuidedTableColumnComparisonWithOtherColumnType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("diff_from", "percent_of", "percent_diff_from"));

  public static final GuidedTableColumnComparisonWithOtherColumnType DIFF_FROM =
      new GuidedTableColumnComparisonWithOtherColumnType("diff_from");
  public static final GuidedTableColumnComparisonWithOtherColumnType PERCENT_OF =
      new GuidedTableColumnComparisonWithOtherColumnType("percent_of");
  public static final GuidedTableColumnComparisonWithOtherColumnType PERCENT_DIFF_FROM =
      new GuidedTableColumnComparisonWithOtherColumnType("percent_diff_from");

  GuidedTableColumnComparisonWithOtherColumnType(String value) {
    super(value, allowedValues);
  }

  public static class GuidedTableColumnComparisonWithOtherColumnTypeSerializer
      extends StdSerializer<GuidedTableColumnComparisonWithOtherColumnType> {
    public GuidedTableColumnComparisonWithOtherColumnTypeSerializer(
        Class<GuidedTableColumnComparisonWithOtherColumnType> t) {
      super(t);
    }

    public GuidedTableColumnComparisonWithOtherColumnTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GuidedTableColumnComparisonWithOtherColumnType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GuidedTableColumnComparisonWithOtherColumnType fromValue(String value) {
    return new GuidedTableColumnComparisonWithOtherColumnType(value);
  }
}
