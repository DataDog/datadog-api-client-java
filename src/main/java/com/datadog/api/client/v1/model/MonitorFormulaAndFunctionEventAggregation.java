/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>Aggregation methods for event platform queries.</p>
 */
@JsonSerialize(using = MonitorFormulaAndFunctionEventAggregation.MonitorFormulaAndFunctionEventAggregationSerializer.class)
public class MonitorFormulaAndFunctionEventAggregation {

  public static final MonitorFormulaAndFunctionEventAggregation COUNT = new MonitorFormulaAndFunctionEventAggregation("count");
  public static final MonitorFormulaAndFunctionEventAggregation CARDINALITY = new MonitorFormulaAndFunctionEventAggregation("cardinality");
  public static final MonitorFormulaAndFunctionEventAggregation MEDIAN = new MonitorFormulaAndFunctionEventAggregation("median");
  public static final MonitorFormulaAndFunctionEventAggregation PC75 = new MonitorFormulaAndFunctionEventAggregation("pc75");
  public static final MonitorFormulaAndFunctionEventAggregation PC90 = new MonitorFormulaAndFunctionEventAggregation("pc90");
  public static final MonitorFormulaAndFunctionEventAggregation PC95 = new MonitorFormulaAndFunctionEventAggregation("pc95");
  public static final MonitorFormulaAndFunctionEventAggregation PC98 = new MonitorFormulaAndFunctionEventAggregation("pc98");
  public static final MonitorFormulaAndFunctionEventAggregation PC99 = new MonitorFormulaAndFunctionEventAggregation("pc99");
  public static final MonitorFormulaAndFunctionEventAggregation SUM = new MonitorFormulaAndFunctionEventAggregation("sum");
  public static final MonitorFormulaAndFunctionEventAggregation MIN = new MonitorFormulaAndFunctionEventAggregation("min");
  public static final MonitorFormulaAndFunctionEventAggregation MAX = new MonitorFormulaAndFunctionEventAggregation("max");
  public static final MonitorFormulaAndFunctionEventAggregation AVG = new MonitorFormulaAndFunctionEventAggregation("avg");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("count", "cardinality", "median", "pc75", "pc90", "pc95", "pc98", "pc99", "sum", "min", "max", "avg"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  MonitorFormulaAndFunctionEventAggregation(String value) {
    this.value = value;
  }

  public static class MonitorFormulaAndFunctionEventAggregationSerializer extends StdSerializer<MonitorFormulaAndFunctionEventAggregation> {
      public MonitorFormulaAndFunctionEventAggregationSerializer(Class<MonitorFormulaAndFunctionEventAggregation> t) {
          super(t);
      }

      public MonitorFormulaAndFunctionEventAggregationSerializer() {
          this(null);
      }

      @Override
      public void serialize(MonitorFormulaAndFunctionEventAggregation value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /**
   * Return true if this MonitorFormulaAndFunctionEventAggregation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((MonitorFormulaAndFunctionEventAggregation) o).value);
  }

  @Override
  public int hashCode() {
      return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static MonitorFormulaAndFunctionEventAggregation fromValue(String value) {
    return new MonitorFormulaAndFunctionEventAggregation(value);
  }
}
