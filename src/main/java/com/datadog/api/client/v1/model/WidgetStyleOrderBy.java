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
 * How to order series in timeseries visualizations. - <code>tags</code>: Order series
 * alphabetically by tag name (default behavior) - <code>values</code>: Order series by their
 * current metric values (typically descending)
 */
@JsonSerialize(using = WidgetStyleOrderBy.WidgetStyleOrderBySerializer.class)
public class WidgetStyleOrderBy extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("tags", "values"));

  public static final WidgetStyleOrderBy TAGS = new WidgetStyleOrderBy("tags");
  public static final WidgetStyleOrderBy VALUES = new WidgetStyleOrderBy("values");

  WidgetStyleOrderBy(String value) {
    super(value, allowedValues);
  }

  public static class WidgetStyleOrderBySerializer extends StdSerializer<WidgetStyleOrderBy> {
    public WidgetStyleOrderBySerializer(Class<WidgetStyleOrderBy> t) {
      super(t);
    }

    public WidgetStyleOrderBySerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetStyleOrderBy value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetStyleOrderBy fromValue(String value) {
    return new WidgetStyleOrderBy(value);
  }
}
