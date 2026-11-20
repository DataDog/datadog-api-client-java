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
        CompositeReferentialDataQueryComputeItemsAggregation
            .CompositeReferentialDataQueryComputeItemsAggregationSerializer.class)
public class CompositeReferentialDataQueryComputeItemsAggregation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("sum", "min", "max", "avg", "count"));

  public static final CompositeReferentialDataQueryComputeItemsAggregation SUM =
      new CompositeReferentialDataQueryComputeItemsAggregation("sum");
  public static final CompositeReferentialDataQueryComputeItemsAggregation MIN =
      new CompositeReferentialDataQueryComputeItemsAggregation("min");
  public static final CompositeReferentialDataQueryComputeItemsAggregation MAX =
      new CompositeReferentialDataQueryComputeItemsAggregation("max");
  public static final CompositeReferentialDataQueryComputeItemsAggregation AVG =
      new CompositeReferentialDataQueryComputeItemsAggregation("avg");
  public static final CompositeReferentialDataQueryComputeItemsAggregation COUNT =
      new CompositeReferentialDataQueryComputeItemsAggregation("count");

  CompositeReferentialDataQueryComputeItemsAggregation(String value) {
    super(value, allowedValues);
  }

  public static class CompositeReferentialDataQueryComputeItemsAggregationSerializer
      extends StdSerializer<CompositeReferentialDataQueryComputeItemsAggregation> {
    public CompositeReferentialDataQueryComputeItemsAggregationSerializer(
        Class<CompositeReferentialDataQueryComputeItemsAggregation> t) {
      super(t);
    }

    public CompositeReferentialDataQueryComputeItemsAggregationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CompositeReferentialDataQueryComputeItemsAggregation value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CompositeReferentialDataQueryComputeItemsAggregation fromValue(String value) {
    return new CompositeReferentialDataQueryComputeItemsAggregation(value);
  }
}
