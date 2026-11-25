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
@JsonSerialize(using = ScalarAggregator.ScalarAggregatorSerializer.class)
public class ScalarAggregator extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "sum",
              "min",
              "max",
              "avg",
              "last",
              "area",
              "l2norm",
              "percentile",
              "stddev",
              "count_unique"));

  public static final ScalarAggregator SUM = new ScalarAggregator("sum");
  public static final ScalarAggregator MIN = new ScalarAggregator("min");
  public static final ScalarAggregator MAX = new ScalarAggregator("max");
  public static final ScalarAggregator AVG = new ScalarAggregator("avg");
  public static final ScalarAggregator LAST = new ScalarAggregator("last");
  public static final ScalarAggregator AREA = new ScalarAggregator("area");
  public static final ScalarAggregator L2NORM = new ScalarAggregator("l2norm");
  public static final ScalarAggregator PERCENTILE = new ScalarAggregator("percentile");
  public static final ScalarAggregator STDDEV = new ScalarAggregator("stddev");
  public static final ScalarAggregator COUNT_UNIQUE = new ScalarAggregator("count_unique");

  ScalarAggregator(String value) {
    super(value, allowedValues);
  }

  public static class ScalarAggregatorSerializer extends StdSerializer<ScalarAggregator> {
    public ScalarAggregatorSerializer(Class<ScalarAggregator> t) {
      super(t);
    }

    public ScalarAggregatorSerializer() {
      this(null);
    }

    @Override
    public void serialize(ScalarAggregator value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ScalarAggregator fromValue(String value) {
    return new ScalarAggregator(value);
  }
}
