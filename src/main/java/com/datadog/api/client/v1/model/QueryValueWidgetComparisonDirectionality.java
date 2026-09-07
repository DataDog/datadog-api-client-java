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

/**
 * Color-coding direction: <code>increase_better</code> (green on rise), <code>decrease_better
 * </code> (green on drop), or <code>neutral</code> (no color).
 */
@JsonSerialize(
    using =
        QueryValueWidgetComparisonDirectionality.QueryValueWidgetComparisonDirectionalitySerializer
            .class)
public class QueryValueWidgetComparisonDirectionality extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("increase_better", "decrease_better", "neutral"));

  public static final QueryValueWidgetComparisonDirectionality INCREASE_BETTER =
      new QueryValueWidgetComparisonDirectionality("increase_better");
  public static final QueryValueWidgetComparisonDirectionality DECREASE_BETTER =
      new QueryValueWidgetComparisonDirectionality("decrease_better");
  public static final QueryValueWidgetComparisonDirectionality NEUTRAL =
      new QueryValueWidgetComparisonDirectionality("neutral");

  QueryValueWidgetComparisonDirectionality(String value) {
    super(value, allowedValues);
  }

  public static class QueryValueWidgetComparisonDirectionalitySerializer
      extends StdSerializer<QueryValueWidgetComparisonDirectionality> {
    public QueryValueWidgetComparisonDirectionalitySerializer(
        Class<QueryValueWidgetComparisonDirectionality> t) {
      super(t);
    }

    public QueryValueWidgetComparisonDirectionalitySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        QueryValueWidgetComparisonDirectionality value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static QueryValueWidgetComparisonDirectionality fromValue(String value) {
    return new QueryValueWidgetComparisonDirectionality(value);
  }
}
