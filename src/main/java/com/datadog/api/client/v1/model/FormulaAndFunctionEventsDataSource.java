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
import java.util.UUID;
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

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>Data source for event platform-based queries.</p>
 */
@JsonSerialize(using = FormulaAndFunctionEventsDataSource.FormulaAndFunctionEventsDataSourceSerializer.class)
public class FormulaAndFunctionEventsDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("logs", "spans", "network", "rum", "security_signals", "profiles", "audit", "events", "ci_tests", "ci_pipelines", "incident_analytics", "product_analytics", "on_call_events"));

  public static final FormulaAndFunctionEventsDataSource LOGS = new FormulaAndFunctionEventsDataSource("logs");
  public static final FormulaAndFunctionEventsDataSource SPANS = new FormulaAndFunctionEventsDataSource("spans");
  public static final FormulaAndFunctionEventsDataSource NETWORK = new FormulaAndFunctionEventsDataSource("network");
  public static final FormulaAndFunctionEventsDataSource RUM = new FormulaAndFunctionEventsDataSource("rum");
  public static final FormulaAndFunctionEventsDataSource SECURITY_SIGNALS = new FormulaAndFunctionEventsDataSource("security_signals");
  public static final FormulaAndFunctionEventsDataSource PROFILES = new FormulaAndFunctionEventsDataSource("profiles");
  public static final FormulaAndFunctionEventsDataSource AUDIT = new FormulaAndFunctionEventsDataSource("audit");
  public static final FormulaAndFunctionEventsDataSource EVENTS = new FormulaAndFunctionEventsDataSource("events");
  public static final FormulaAndFunctionEventsDataSource CI_TESTS = new FormulaAndFunctionEventsDataSource("ci_tests");
  public static final FormulaAndFunctionEventsDataSource CI_PIPELINES = new FormulaAndFunctionEventsDataSource("ci_pipelines");
  public static final FormulaAndFunctionEventsDataSource INCIDENT_ANALYTICS = new FormulaAndFunctionEventsDataSource("incident_analytics");
  public static final FormulaAndFunctionEventsDataSource PRODUCT_ANALYTICS = new FormulaAndFunctionEventsDataSource("product_analytics");
  public static final FormulaAndFunctionEventsDataSource ON_CALL_EVENTS = new FormulaAndFunctionEventsDataSource("on_call_events");


  FormulaAndFunctionEventsDataSource(String value) {
    super(value, allowedValues);
  }

  public static class FormulaAndFunctionEventsDataSourceSerializer extends StdSerializer<FormulaAndFunctionEventsDataSource> {
      public FormulaAndFunctionEventsDataSourceSerializer(Class<FormulaAndFunctionEventsDataSource> t) {
          super(t);
      }

      public FormulaAndFunctionEventsDataSourceSerializer() {
          this(null);
      }

      @Override
      public void serialize(FormulaAndFunctionEventsDataSource value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static FormulaAndFunctionEventsDataSource fromValue(String value) {
    return new FormulaAndFunctionEventsDataSource(value);
  }
}
