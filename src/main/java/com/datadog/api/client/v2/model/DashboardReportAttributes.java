/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.JsonTimeSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes for the dashboard report schema. */
@JsonPropertyOrder({
  DashboardReportAttributes.JSON_PROPERTY_CREATED_AT,
  DashboardReportAttributes.JSON_PROPERTY_DESCRIPTION,
  DashboardReportAttributes.JSON_PROPERTY_DESTINATIONS,
  DashboardReportAttributes.JSON_PROPERTY_MODIFIED_AT,
  DashboardReportAttributes.JSON_PROPERTY_SCHEDULE,
  DashboardReportAttributes.JSON_PROPERTY_TEMPLATE_VARIABLES,
  DashboardReportAttributes.JSON_PROPERTY_TIMEFRAME,
  DashboardReportAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DashboardReportAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DESTINATIONS = "destinations";
  private DashboardReportDestination destinations;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";

  @JsonSerialize(using = JsonTimeSerializer.class)
  private JsonNullable<OffsetDateTime> modifiedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private DashboardReportSchedule schedule;

  public static final String JSON_PROPERTY_TEMPLATE_VARIABLES = "template_variables";
  private Map<String, String> templateVariables = null;

  public static final String JSON_PROPERTY_TIMEFRAME = "timeframe";
  private DashboardReportTimeframe timeframe;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public DashboardReportAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date the report was created.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public DashboardReportAttributes description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * Description of the report used in both the user interface, and as part of the email body for
   * each report sent. Must be a UTF-8 encoded string less than 4 KiB in size.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
    return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public DashboardReportAttributes destinations(DashboardReportDestination destinations) {
    this.destinations = destinations;
    this.unparsed |= destinations.unparsed;
    return this;
  }

  /**
   * Report destination-specific configuration. This determines how reports are sent. Only email
   * destinations are supported.
   *
   * @return destinations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESTINATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DashboardReportDestination getDestinations() {
    return destinations;
  }

  public void setDestinations(DashboardReportDestination destinations) {
    this.destinations = destinations;
  }

  public DashboardReportAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = JsonNullable.<OffsetDateTime>of(modifiedAt);
    return this;
  }

  /**
   * Date the report was most recently modified.
   *
   * @return modifiedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getModifiedAt() {
    return modifiedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getModifiedAt_JsonNullable() {
    return modifiedAt;
  }

  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  public void setModifiedAt_JsonNullable(JsonNullable<OffsetDateTime> modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = JsonNullable.<OffsetDateTime>of(modifiedAt);
  }

  public DashboardReportAttributes schedule(DashboardReportSchedule schedule) {
    this.schedule = schedule;
    this.unparsed |= schedule.unparsed;
    return this;
  }

  /**
   * Report schedule-specific configuration that defines when and how often a report is sent.
   *
   * @return schedule
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DashboardReportSchedule getSchedule() {
    return schedule;
  }

  public void setSchedule(DashboardReportSchedule schedule) {
    this.schedule = schedule;
  }

  public DashboardReportAttributes templateVariables(Map<String, String> templateVariables) {
    this.templateVariables = templateVariables;
    return this;
  }

  public DashboardReportAttributes putTemplateVariablesItem(
      String key, String templateVariablesItem) {
    if (this.templateVariables == null) {
      this.templateVariables = new HashMap<>();
    }
    this.templateVariables.put(key, templateVariablesItem);
    return this;
  }

  /**
   * Template variables used to parameterize the dashboard when generating a report.
   *
   * @return templateVariables
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getTemplateVariables() {
    return templateVariables;
  }

  public void setTemplateVariables(Map<String, String> templateVariables) {
    this.templateVariables = templateVariables;
  }

  public DashboardReportAttributes timeframe(DashboardReportTimeframe timeframe) {
    this.timeframe = timeframe;
    this.unparsed |= !timeframe.isValid();
    return this;
  }

  /**
   * Time period covered by the widgets in the dashboard report, at the time of report generation.
   *
   * @return timeframe
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEFRAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public DashboardReportTimeframe getTimeframe() {
    return timeframe;
  }

  public void setTimeframe(DashboardReportTimeframe timeframe) {
    if (!timeframe.isValid()) {
      this.unparsed = true;
    }
    this.timeframe = timeframe;
  }

  public DashboardReportAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the report in both the user interface, and as part of the email subject for each
   * report sent.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /** Return true if this DashboardReportAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DashboardReportAttributes dashboardReportAttributes = (DashboardReportAttributes) o;
    return Objects.equals(this.createdAt, dashboardReportAttributes.createdAt)
        && Objects.equals(this.description, dashboardReportAttributes.description)
        && Objects.equals(this.destinations, dashboardReportAttributes.destinations)
        && Objects.equals(this.modifiedAt, dashboardReportAttributes.modifiedAt)
        && Objects.equals(this.schedule, dashboardReportAttributes.schedule)
        && Objects.equals(this.templateVariables, dashboardReportAttributes.templateVariables)
        && Objects.equals(this.timeframe, dashboardReportAttributes.timeframe)
        && Objects.equals(this.title, dashboardReportAttributes.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        description,
        destinations,
        modifiedAt,
        schedule,
        templateVariables,
        timeframe,
        title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DashboardReportAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destinations: ").append(toIndentedString(destinations)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    templateVariables: ").append(toIndentedString(templateVariables)).append("\n");
    sb.append("    timeframe: ").append(toIndentedString(timeframe)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("}");
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
