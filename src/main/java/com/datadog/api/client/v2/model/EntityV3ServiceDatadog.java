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
   * <p>Datadog product integrations for the service entity.</p>
 */
@JsonPropertyOrder({
  EntityV3ServiceDatadog.JSON_PROPERTY_CODE_LOCATIONS,
  EntityV3ServiceDatadog.JSON_PROPERTY_EVENTS,
  EntityV3ServiceDatadog.JSON_PROPERTY_LOGS,
  EntityV3ServiceDatadog.JSON_PROPERTY_PERFORMANCE_DATA,
  EntityV3ServiceDatadog.JSON_PROPERTY_PIPELINES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityV3ServiceDatadog {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODE_LOCATIONS = "codeLocations";
  private List<EntityV3DatadogCodeLocationItem> codeLocations = null;

  public static final String JSON_PROPERTY_EVENTS = "events";
  private List<EntityV3DatadogEventItem> events = null;

  public static final String JSON_PROPERTY_LOGS = "logs";
  private List<EntityV3DatadogLogItem> logs = null;

  public static final String JSON_PROPERTY_PERFORMANCE_DATA = "performanceData";
  private EntityV3DatadogPerformance performanceData;

  public static final String JSON_PROPERTY_PIPELINES = "pipelines";
  private EntityV3DatadogPipelines pipelines;

  public EntityV3ServiceDatadog codeLocations(List<EntityV3DatadogCodeLocationItem> codeLocations) {
    this.codeLocations = codeLocations;
    for (EntityV3DatadogCodeLocationItem item : codeLocations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public EntityV3ServiceDatadog addCodeLocationsItem(EntityV3DatadogCodeLocationItem codeLocationsItem) {
    if (this.codeLocations == null) {
      this.codeLocations = new ArrayList<>();
    }
    this.codeLocations.add(codeLocationsItem);
    this.unparsed |= codeLocationsItem.unparsed;
    return this;
  }

  /**
   * <p>Schema for mapping source code locations to an entity.</p>
   * @return codeLocations
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CODE_LOCATIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<EntityV3DatadogCodeLocationItem> getCodeLocations() {
        return codeLocations;
      }
  public void setCodeLocations(List<EntityV3DatadogCodeLocationItem> codeLocations) {
    this.codeLocations = codeLocations;
  }
  public EntityV3ServiceDatadog events(List<EntityV3DatadogEventItem> events) {
    this.events = events;
    for (EntityV3DatadogEventItem item : events) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public EntityV3ServiceDatadog addEventsItem(EntityV3DatadogEventItem eventsItem) {
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
  public EntityV3ServiceDatadog logs(List<EntityV3DatadogLogItem> logs) {
    this.logs = logs;
    for (EntityV3DatadogLogItem item : logs) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public EntityV3ServiceDatadog addLogsItem(EntityV3DatadogLogItem logsItem) {
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
  public EntityV3ServiceDatadog performanceData(EntityV3DatadogPerformance performanceData) {
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
  public EntityV3ServiceDatadog pipelines(EntityV3DatadogPipelines pipelines) {
    this.pipelines = pipelines;
    this.unparsed |= pipelines.unparsed;
    return this;
  }

  /**
   * <p>CI Pipelines association.</p>
   * @return pipelines
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PIPELINES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EntityV3DatadogPipelines getPipelines() {
        return pipelines;
      }
  public void setPipelines(EntityV3DatadogPipelines pipelines) {
    this.pipelines = pipelines;
  }

  /**
   * Return true if this EntityV3ServiceDatadog object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityV3ServiceDatadog entityV3ServiceDatadog = (EntityV3ServiceDatadog) o;
    return Objects.equals(this.codeLocations, entityV3ServiceDatadog.codeLocations) && Objects.equals(this.events, entityV3ServiceDatadog.events) && Objects.equals(this.logs, entityV3ServiceDatadog.logs) && Objects.equals(this.performanceData, entityV3ServiceDatadog.performanceData) && Objects.equals(this.pipelines, entityV3ServiceDatadog.pipelines);
  }


  @Override
  public int hashCode() {
    return Objects.hash(codeLocations,events,logs,performanceData,pipelines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityV3ServiceDatadog {\n");
    sb.append("    codeLocations: ").append(toIndentedString(codeLocations)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    performanceData: ").append(toIndentedString(performanceData)).append("\n");
    sb.append("    pipelines: ").append(toIndentedString(pipelines)).append("\n");
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
