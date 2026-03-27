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
@JsonSerialize(using = MonitorFormulaAndFunctionEventsDataSource.MonitorFormulaAndFunctionEventsDataSourceSerializer.class)
public class MonitorFormulaAndFunctionEventsDataSource extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("rum", "ci_pipelines", "ci_tests", "audit", "events", "logs", "spans", "database_queries", "network", "network_path"));

  public static final MonitorFormulaAndFunctionEventsDataSource RUM = new MonitorFormulaAndFunctionEventsDataSource("rum");
  public static final MonitorFormulaAndFunctionEventsDataSource CI_PIPELINES = new MonitorFormulaAndFunctionEventsDataSource("ci_pipelines");
  public static final MonitorFormulaAndFunctionEventsDataSource CI_TESTS = new MonitorFormulaAndFunctionEventsDataSource("ci_tests");
  public static final MonitorFormulaAndFunctionEventsDataSource AUDIT = new MonitorFormulaAndFunctionEventsDataSource("audit");
  public static final MonitorFormulaAndFunctionEventsDataSource EVENTS = new MonitorFormulaAndFunctionEventsDataSource("events");
  public static final MonitorFormulaAndFunctionEventsDataSource LOGS = new MonitorFormulaAndFunctionEventsDataSource("logs");
  public static final MonitorFormulaAndFunctionEventsDataSource SPANS = new MonitorFormulaAndFunctionEventsDataSource("spans");
  public static final MonitorFormulaAndFunctionEventsDataSource DATABASE_QUERIES = new MonitorFormulaAndFunctionEventsDataSource("database_queries");
  public static final MonitorFormulaAndFunctionEventsDataSource NETWORK = new MonitorFormulaAndFunctionEventsDataSource("network");
  public static final MonitorFormulaAndFunctionEventsDataSource NETWORK_PATH = new MonitorFormulaAndFunctionEventsDataSource("network_path");


  MonitorFormulaAndFunctionEventsDataSource(String value) {
    super(value, allowedValues);
  }

  public static class MonitorFormulaAndFunctionEventsDataSourceSerializer extends StdSerializer<MonitorFormulaAndFunctionEventsDataSource> {
      public MonitorFormulaAndFunctionEventsDataSourceSerializer(Class<MonitorFormulaAndFunctionEventsDataSource> t) {
          super(t);
      }

      public MonitorFormulaAndFunctionEventsDataSourceSerializer() {
          this(null);
      }

      @Override
      public void serialize(MonitorFormulaAndFunctionEventsDataSource value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static MonitorFormulaAndFunctionEventsDataSource fromValue(String value) {
    return new MonitorFormulaAndFunctionEventsDataSource(value);
  }
}
