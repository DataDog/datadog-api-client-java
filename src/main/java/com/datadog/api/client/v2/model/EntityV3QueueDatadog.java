/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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


/**
   * <p>Datadog product integrations for the datastore entity.</p>
 */
@JsonPropertyOrder({
  EntityV3QueueDatadog.JSON_PROPERTY_EVENTS,
  EntityV3QueueDatadog.JSON_PROPERTY_LOGS,
  EntityV3QueueDatadog.JSON_PROPERTY_PERFORMANCE_DATA
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityV3QueueDatadog {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<EntityV3DatadogEventItem> events = null;

  public static final String JSON_PROPERTY_LOGS = "logs";
  private List<EntityV3DatadogLogItem> logs = null;

  public static final String JSON_PROPERTY_PERFORMANCE_DATA = "performanceData";
  private EntityV3DatadogPerformance performanceData;

  public EntityV3QueueDatadog events(List<EntityV3DatadogEventItem> events) {
    this.events = events;
    for (EntityV3DatadogEventItem item : events) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public EntityV3QueueDatadog addEventsItem(EntityV3DatadogEventItem eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    this.unparsed |= eventsItem.unparsed;
    return this;
  }

  /**
   * <p>Events associations.</p>
   * @return events
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EVENTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<EntityV3DatadogEventItem> getEvents() {
        return events;
      }
  public void setEvents(List<EntityV3DatadogEventItem> events) {
    this.events = events;
  }
  public EntityV3QueueDatadog logs(List<EntityV3DatadogLogItem> logs) {
    this.logs = logs;
    for (EntityV3DatadogLogItem item : logs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public EntityV3QueueDatadog addLogsItem(EntityV3DatadogLogItem logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<>();
    }
    this.logs.add(logsItem);
    this.unparsed |= logsItem.unparsed;
    return this;
  }

  /**
   * <p>Logs association.</p>
   * @return logs
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<EntityV3DatadogLogItem> getLogs() {
        return logs;
      }
  public void setLogs(List<EntityV3DatadogLogItem> logs) {
    this.logs = logs;
  }
  public EntityV3QueueDatadog performanceData(EntityV3DatadogPerformance performanceData) {
    this.performanceData = performanceData;
    this.unparsed |= performanceData.unparsed;
    return this;
  }

  /**
   * <p>Performance stats association.</p>
   * @return performanceData
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PERFORMANCE_DATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EntityV3DatadogPerformance getPerformanceData() {
        return performanceData;
      }
  public void setPerformanceData(EntityV3DatadogPerformance performanceData) {
    this.performanceData = performanceData;
  }

  /**
   * Return true if this EntityV3QueueDatadog object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityV3QueueDatadog entityV3QueueDatadog = (EntityV3QueueDatadog) o;
    return Objects.equals(this.events, entityV3QueueDatadog.events) && Objects.equals(this.logs, entityV3QueueDatadog.logs) && Objects.equals(this.performanceData, entityV3QueueDatadog.performanceData);
  }


  @Override
  public int hashCode() {
    return Objects.hash(events,logs,performanceData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityV3QueueDatadog {\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    performanceData: ").append(toIndentedString(performanceData)).append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
