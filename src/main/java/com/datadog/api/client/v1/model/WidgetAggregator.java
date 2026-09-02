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

/** Aggregator used for the request. */
@JsonSerialize(using = WidgetAggregator.WidgetAggregatorSerializer.class)
public class WidgetAggregator extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("avg", "last", "max", "min", "sum", "percentile"));

  public static final WidgetAggregator AVERAGE = new WidgetAggregator("avg");
  public static final WidgetAggregator LAST = new WidgetAggregator("last");
  public static final WidgetAggregator MAXIMUM = new WidgetAggregator("max");
  public static final WidgetAggregator MINIMUM = new WidgetAggregator("min");
  public static final WidgetAggregator SUM = new WidgetAggregator("sum");
  public static final WidgetAggregator PERCENTILE = new WidgetAggregator("percentile");

  WidgetAggregator(String value) {
    super(value, allowedValues);
  }

  public static class WidgetAggregatorSerializer extends StdSerializer<WidgetAggregator> {
    public WidgetAggregatorSerializer(Class<WidgetAggregator> t) {
      super(t);
    }

    public WidgetAggregatorSerializer() {
      this(null);
    }

    @Override
    public void serialize(WidgetAggregator value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static WidgetAggregator fromValue(String value) {
    return new WidgetAggregator(value);
  }
}
