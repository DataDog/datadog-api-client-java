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

/** Comparison applied by this filter. */
@JsonSerialize(
    using =
        ExperimentsMeasureComparisonFilterInputOperation
            .ExperimentsMeasureComparisonFilterInputOperationSerializer.class)
public class ExperimentsMeasureComparisonFilterInputOperation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("=", "!=", ">", ">=", "<", "<="));

  public static final ExperimentsMeasureComparisonFilterInputOperation EQ =
      new ExperimentsMeasureComparisonFilterInputOperation("=");
  public static final ExperimentsMeasureComparisonFilterInputOperation NEQ =
      new ExperimentsMeasureComparisonFilterInputOperation("!=");
  public static final ExperimentsMeasureComparisonFilterInputOperation GT =
      new ExperimentsMeasureComparisonFilterInputOperation(">");
  public static final ExperimentsMeasureComparisonFilterInputOperation GT_EQ =
      new ExperimentsMeasureComparisonFilterInputOperation(">=");
  public static final ExperimentsMeasureComparisonFilterInputOperation LT =
      new ExperimentsMeasureComparisonFilterInputOperation("<");
  public static final ExperimentsMeasureComparisonFilterInputOperation LT_EQ =
      new ExperimentsMeasureComparisonFilterInputOperation("<=");

  ExperimentsMeasureComparisonFilterInputOperation(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsMeasureComparisonFilterInputOperationSerializer
      extends StdSerializer<ExperimentsMeasureComparisonFilterInputOperation> {
    public ExperimentsMeasureComparisonFilterInputOperationSerializer(
        Class<ExperimentsMeasureComparisonFilterInputOperation> t) {
      super(t);
    }

    public ExperimentsMeasureComparisonFilterInputOperationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsMeasureComparisonFilterInputOperation value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsMeasureComparisonFilterInputOperation fromValue(String value) {
    return new ExperimentsMeasureComparisonFilterInputOperation(value);
  }
}
