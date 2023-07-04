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
@JsonSerialize(using = ScatterplotWidgetAggregator.ScatterplotWidgetAggregatorSerializer.class)
public class ScatterplotWidgetAggregator extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("avg", "last", "max", "min", "sum"));

  public static final ScatterplotWidgetAggregator AVERAGE = new ScatterplotWidgetAggregator("avg");
  public static final ScatterplotWidgetAggregator LAST = new ScatterplotWidgetAggregator("last");
  public static final ScatterplotWidgetAggregator MAXIMUM = new ScatterplotWidgetAggregator("max");
  public static final ScatterplotWidgetAggregator MINIMUM = new ScatterplotWidgetAggregator("min");
  public static final ScatterplotWidgetAggregator SUM = new ScatterplotWidgetAggregator("sum");

  ScatterplotWidgetAggregator(String value) {
    super(value, allowedValues);
  }

  public static class ScatterplotWidgetAggregatorSerializer
      extends StdSerializer<ScatterplotWidgetAggregator> {
    public ScatterplotWidgetAggregatorSerializer(Class<ScatterplotWidgetAggregator> t) {
      super(t);
    }

    public ScatterplotWidgetAggregatorSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScatterplotWidgetAggregator value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ScatterplotWidgetAggregator fromValue(String value) {
    return new ScatterplotWidgetAggregator(value);
  }
}
