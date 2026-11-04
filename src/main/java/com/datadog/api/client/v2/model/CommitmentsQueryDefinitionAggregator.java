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

/** The reducer a scalar widget applies to the query. */
@JsonSerialize(
    using =
        CommitmentsQueryDefinitionAggregator.CommitmentsQueryDefinitionAggregatorSerializer.class)
public class CommitmentsQueryDefinitionAggregator extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("sum", "avg", "min", "max"));

  public static final CommitmentsQueryDefinitionAggregator SUM =
      new CommitmentsQueryDefinitionAggregator("sum");
  public static final CommitmentsQueryDefinitionAggregator AVG =
      new CommitmentsQueryDefinitionAggregator("avg");
  public static final CommitmentsQueryDefinitionAggregator MIN =
      new CommitmentsQueryDefinitionAggregator("min");
  public static final CommitmentsQueryDefinitionAggregator MAX =
      new CommitmentsQueryDefinitionAggregator("max");

  CommitmentsQueryDefinitionAggregator(String value) {
    super(value, allowedValues);
  }

  public static class CommitmentsQueryDefinitionAggregatorSerializer
      extends StdSerializer<CommitmentsQueryDefinitionAggregator> {
    public CommitmentsQueryDefinitionAggregatorSerializer(
        Class<CommitmentsQueryDefinitionAggregator> t) {
      super(t);
    }

    public CommitmentsQueryDefinitionAggregatorSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CommitmentsQueryDefinitionAggregator value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CommitmentsQueryDefinitionAggregator fromValue(String value) {
    return new CommitmentsQueryDefinitionAggregator(value);
  }
}
