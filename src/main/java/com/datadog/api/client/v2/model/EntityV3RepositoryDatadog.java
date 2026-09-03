/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Datadog product integrations for the repository entity. */
@JsonPropertyOrder({
  EntityV3RepositoryDatadog.JSON_PROPERTY_CODE_LOCATIONS,
  EntityV3RepositoryDatadog.JSON_PROPERTY_EVENTS,
  EntityV3RepositoryDatadog.JSON_PROPERTY_LOGS,
  EntityV3RepositoryDatadog.JSON_PROPERTY_PERFORMANCE_DATA,
  EntityV3RepositoryDatadog.JSON_PROPERTY_PIPELINES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityV3RepositoryDatadog {
  @JsonIgnore public boolean unparsed = false;
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

  public EntityV3RepositoryDatadog codeLocations(
      List<EntityV3DatadogCodeLocationItem> codeLocations) {
    this.codeLocations = codeLocations;
    if (codeLocations != null) {
      for (EntityV3DatadogCodeLocationItem item : codeLocations) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public EntityV3RepositoryDatadog addCodeLocationsItem(
      EntityV3DatadogCodeLocationItem codeLocationsItem) {
    if (this.codeLocations == null) {
      this.codeLocations = new ArrayList<>();
    }
    this.codeLocations.add(codeLocationsItem);
    this.unparsed |= codeLocationsItem.unparsed;
    return this;
  }

  /**
   * Schema for mapping source code locations to an entity.
   *
   * @return codeLocations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EntityV3DatadogCodeLocationItem> getCodeLocations() {
    return codeLocations;
  }

  public void setCodeLocations(List<EntityV3DatadogCodeLocationItem> codeLocations) {
    this.codeLocations = codeLocations;
    if (codeLocations != null) {
      for (EntityV3DatadogCodeLocationItem item : codeLocations) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public EntityV3RepositoryDatadog events(List<EntityV3DatadogEventItem> events) {
    this.events = events;
    if (events != null) {
      for (EntityV3DatadogEventItem item : events) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public EntityV3RepositoryDatadog addEventsItem(EntityV3DatadogEventItem eventsItem) {
    if (this.events == null) {
      this.events = new ArrayList<>();
    }
    this.events.add(eventsItem);
    this.unparsed |= eventsItem.unparsed;
    return this;
  }

  /**
   * Events associations.
   *
   * @return events
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EntityV3DatadogEventItem> getEvents() {
    return events;
  }

  public void setEvents(List<EntityV3DatadogEventItem> events) {
    this.events = events;
    if (events != null) {
      for (EntityV3DatadogEventItem item : events) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public EntityV3RepositoryDatadog logs(List<EntityV3DatadogLogItem> logs) {
    this.logs = logs;
    if (logs != null) {
      for (EntityV3DatadogLogItem item : logs) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public EntityV3RepositoryDatadog addLogsItem(EntityV3DatadogLogItem logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<>();
    }
    this.logs.add(logsItem);
    this.unparsed |= logsItem.unparsed;
    return this;
  }

  /**
   * Logs association.
   *
   * @return logs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LOGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EntityV3DatadogLogItem> getLogs() {
    return logs;
  }

  public void setLogs(List<EntityV3DatadogLogItem> logs) {
    this.logs = logs;
    if (logs != null) {
      for (EntityV3DatadogLogItem item : logs) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public EntityV3RepositoryDatadog performanceData(EntityV3DatadogPerformance performanceData) {
    this.performanceData = performanceData;
    this.unparsed |= performanceData.unparsed;
    return this;
  }

  /**
   * Performance stats association.
   *
   * @return performanceData
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PERFORMANCE_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityV3DatadogPerformance getPerformanceData() {
    return performanceData;
  }

  public void setPerformanceData(EntityV3DatadogPerformance performanceData) {
    this.performanceData = performanceData;
    if (performanceData != null) {
      this.unparsed |= performanceData.unparsed;
    }
  }

  public EntityV3RepositoryDatadog pipelines(EntityV3DatadogPipelines pipelines) {
    this.pipelines = pipelines;
    this.unparsed |= pipelines.unparsed;
    return this;
  }

  /**
   * CI Pipelines association.
   *
   * @return pipelines
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PIPELINES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityV3DatadogPipelines getPipelines() {
    return pipelines;
  }

  public void setPipelines(EntityV3DatadogPipelines pipelines) {
    this.pipelines = pipelines;
    if (pipelines != null) {
      this.unparsed |= pipelines.unparsed;
    }
  }

  /** Return true if this EntityV3RepositoryDatadog object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityV3RepositoryDatadog entityV3RepositoryDatadog = (EntityV3RepositoryDatadog) o;
    return Objects.equals(this.codeLocations, entityV3RepositoryDatadog.codeLocations)
        && Objects.equals(this.events, entityV3RepositoryDatadog.events)
        && Objects.equals(this.logs, entityV3RepositoryDatadog.logs)
        && Objects.equals(this.performanceData, entityV3RepositoryDatadog.performanceData)
        && Objects.equals(this.pipelines, entityV3RepositoryDatadog.pipelines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeLocations, events, logs, performanceData, pipelines);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityV3RepositoryDatadog {\n");
    sb.append("    codeLocations: ").append(toIndentedString(codeLocations)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    performanceData: ").append(toIndentedString(performanceData)).append("\n");
    sb.append("    pipelines: ").append(toIndentedString(pipelines)).append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
