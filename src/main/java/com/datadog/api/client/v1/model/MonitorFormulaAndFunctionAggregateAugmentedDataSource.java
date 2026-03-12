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

/** Data source for aggregate augmented queries. */
@JsonSerialize(
    using =
        MonitorFormulaAndFunctionAggregateAugmentedDataSource
            .MonitorFormulaAndFunctionAggregateAugmentedDataSourceSerializer.class)
public class MonitorFormulaAndFunctionAggregateAugmentedDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("aggregate_augmented_query"));

  public static final MonitorFormulaAndFunctionAggregateAugmentedDataSource
      AGGREGATE_AUGMENTED_QUERY =
          new MonitorFormulaAndFunctionAggregateAugmentedDataSource("aggregate_augmented_query");

  MonitorFormulaAndFunctionAggregateAugmentedDataSource(String value) {
    super(value, allowedValues);
  }

  public static class MonitorFormulaAndFunctionAggregateAugmentedDataSourceSerializer
      extends StdSerializer<MonitorFormulaAndFunctionAggregateAugmentedDataSource> {
    public MonitorFormulaAndFunctionAggregateAugmentedDataSourceSerializer(
        Class<MonitorFormulaAndFunctionAggregateAugmentedDataSource> t) {
      super(t);
    }

    public MonitorFormulaAndFunctionAggregateAugmentedDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        MonitorFormulaAndFunctionAggregateAugmentedDataSource value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MonitorFormulaAndFunctionAggregateAugmentedDataSource fromValue(String value) {
    return new MonitorFormulaAndFunctionAggregateAugmentedDataSource(value);
  }
}
