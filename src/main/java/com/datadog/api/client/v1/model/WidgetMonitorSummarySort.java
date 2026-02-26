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
   * <p>Widget sorting methods.</p>
 */
@JsonSerialize(using = WidgetMonitorSummarySort.WidgetMonitorSummarySortSerializer.class)
public class WidgetMonitorSummarySort extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("name", "group", "status", "tags", "triggered", "group,asc", "group,desc", "name,asc", "name,desc", "status,asc", "status,desc", "tags,asc", "tags,desc", "triggered,asc", "triggered,desc", "priority,asc", "priority,desc"));

  public static final WidgetMonitorSummarySort NAME = new WidgetMonitorSummarySort("name");
  public static final WidgetMonitorSummarySort GROUP = new WidgetMonitorSummarySort("group");
  public static final WidgetMonitorSummarySort STATUS = new WidgetMonitorSummarySort("status");
  public static final WidgetMonitorSummarySort TAGS = new WidgetMonitorSummarySort("tags");
  public static final WidgetMonitorSummarySort TRIGGERED = new WidgetMonitorSummarySort("triggered");
  public static final WidgetMonitorSummarySort GROUP_ASCENDING = new WidgetMonitorSummarySort("group,asc");
  public static final WidgetMonitorSummarySort GROUP_DESCENDING = new WidgetMonitorSummarySort("group,desc");
  public static final WidgetMonitorSummarySort NAME_ASCENDING = new WidgetMonitorSummarySort("name,asc");
  public static final WidgetMonitorSummarySort NAME_DESCENDING = new WidgetMonitorSummarySort("name,desc");
  public static final WidgetMonitorSummarySort STATUS_ASCENDING = new WidgetMonitorSummarySort("status,asc");
  public static final WidgetMonitorSummarySort STATUS_DESCENDING = new WidgetMonitorSummarySort("status,desc");
  public static final WidgetMonitorSummarySort TAGS_ASCENDING = new WidgetMonitorSummarySort("tags,asc");
  public static final WidgetMonitorSummarySort TAGS_DESCENDING = new WidgetMonitorSummarySort("tags,desc");
  public static final WidgetMonitorSummarySort TRIGGERED_ASCENDING = new WidgetMonitorSummarySort("triggered,asc");
  public static final WidgetMonitorSummarySort TRIGGERED_DESCENDING = new WidgetMonitorSummarySort("triggered,desc");
  public static final WidgetMonitorSummarySort PRIORITY_ASCENDING = new WidgetMonitorSummarySort("priority,asc");
  public static final WidgetMonitorSummarySort PRIORITY_DESCENDING = new WidgetMonitorSummarySort("priority,desc");


  WidgetMonitorSummarySort(String value) {
    super(value, allowedValues);
  }

  public static class WidgetMonitorSummarySortSerializer extends StdSerializer<WidgetMonitorSummarySort> {
      public WidgetMonitorSummarySortSerializer(Class<WidgetMonitorSummarySort> t) {
          super(t);
      }

      public WidgetMonitorSummarySortSerializer() {
          this(null);
      }

      @Override
      public void serialize(WidgetMonitorSummarySort value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static WidgetMonitorSummarySort fromValue(String value) {
    return new WidgetMonitorSummarySort(value);
  }
}
