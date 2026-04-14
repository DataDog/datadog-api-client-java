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
 * Metric for User Journey formula compute. <code>__dd.conversion</code> and <code>
 * __dd.conversion_rate</code> accept <code>count</code> and <code>cardinality</code> as
 * aggregations. <code>__dd.time_to_convert</code> accepts <code>avg</code>, <code>median</code>,
 * <code>pc75</code>, <code>pc95</code>, <code>pc98</code>, <code>pc99</code>, <code>min</code>, and
 * <code>max</code>.
 */
@JsonSerialize(
    using = UserJourneyFormulaComputeMetric.UserJourneyFormulaComputeMetricSerializer.class)
public class UserJourneyFormulaComputeMetric extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("__dd.conversion", "__dd.conversion_rate", "__dd.time_to_convert"));

  public static final UserJourneyFormulaComputeMetric CONVERSION =
      new UserJourneyFormulaComputeMetric("__dd.conversion");
  public static final UserJourneyFormulaComputeMetric CONVERSION_RATE =
      new UserJourneyFormulaComputeMetric("__dd.conversion_rate");
  public static final UserJourneyFormulaComputeMetric TIME_TO_CONVERT =
      new UserJourneyFormulaComputeMetric("__dd.time_to_convert");

  UserJourneyFormulaComputeMetric(String value) {
    super(value, allowedValues);
  }

  public static class UserJourneyFormulaComputeMetricSerializer
      extends StdSerializer<UserJourneyFormulaComputeMetric> {
    public UserJourneyFormulaComputeMetricSerializer(Class<UserJourneyFormulaComputeMetric> t) {
      super(t);
    }

    public UserJourneyFormulaComputeMetricSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        UserJourneyFormulaComputeMetric value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static UserJourneyFormulaComputeMetric fromValue(String value) {
    return new UserJourneyFormulaComputeMetric(value);
  }
}
