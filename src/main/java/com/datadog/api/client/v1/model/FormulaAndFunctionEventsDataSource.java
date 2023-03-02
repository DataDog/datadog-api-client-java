/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** Data source for event platform-based queries. */
@JsonSerialize(
    using = FormulaAndFunctionEventsDataSource.FormulaAndFunctionEventsDataSourceSerializer.class)
public class FormulaAndFunctionEventsDataSource {

  public static final FormulaAndFunctionEventsDataSource LOGS =
      new FormulaAndFunctionEventsDataSource("logs");
  public static final FormulaAndFunctionEventsDataSource SPANS =
      new FormulaAndFunctionEventsDataSource("spans");
  public static final FormulaAndFunctionEventsDataSource NETWORK =
      new FormulaAndFunctionEventsDataSource("network");
  public static final FormulaAndFunctionEventsDataSource RUM =
      new FormulaAndFunctionEventsDataSource("rum");
  public static final FormulaAndFunctionEventsDataSource SECURITY_SIGNALS =
      new FormulaAndFunctionEventsDataSource("security_signals");
  public static final FormulaAndFunctionEventsDataSource PROFILES =
      new FormulaAndFunctionEventsDataSource("profiles");
  public static final FormulaAndFunctionEventsDataSource AUDIT =
      new FormulaAndFunctionEventsDataSource("audit");
  public static final FormulaAndFunctionEventsDataSource EVENTS =
      new FormulaAndFunctionEventsDataSource("events");
  public static final FormulaAndFunctionEventsDataSource CI_TESTS =
      new FormulaAndFunctionEventsDataSource("ci_tests");
  public static final FormulaAndFunctionEventsDataSource CI_PIPELINES =
      new FormulaAndFunctionEventsDataSource("ci_pipelines");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "logs",
              "spans",
              "network",
              "rum",
              "security_signals",
              "profiles",
              "audit",
              "events",
              "ci_tests",
              "ci_pipelines"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  FormulaAndFunctionEventsDataSource(String value) {
    this.value = value;
  }

  public static class FormulaAndFunctionEventsDataSourceSerializer
      extends StdSerializer<FormulaAndFunctionEventsDataSource> {
    public FormulaAndFunctionEventsDataSourceSerializer(
        Class<FormulaAndFunctionEventsDataSource> t) {
      super(t);
    }

    public FormulaAndFunctionEventsDataSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormulaAndFunctionEventsDataSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
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

  /** Return true if this FormulaAndFunctionEventsDataSource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((FormulaAndFunctionEventsDataSource) o).value);
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
  public static FormulaAndFunctionEventsDataSource fromValue(String value) {
    return new FormulaAndFunctionEventsDataSource(value);
  }
}
