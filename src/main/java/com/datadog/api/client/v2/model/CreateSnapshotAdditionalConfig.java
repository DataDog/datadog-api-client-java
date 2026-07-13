/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Additional configuration options for snapshot creation. */
@JsonPropertyOrder({
  CreateSnapshotAdditionalConfig.JSON_PROPERTY_TEMPLATE_VARIABLES,
  CreateSnapshotAdditionalConfig.JSON_PROPERTY_TIMESERIES_LEGEND_TYPE,
  CreateSnapshotAdditionalConfig.JSON_PROPERTY_TIMEZONE_OFFSET_MINUTES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateSnapshotAdditionalConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TEMPLATE_VARIABLES = "template_variables";
  private List<CreateSnapshotTemplateVariable> templateVariables = null;

  public static final String JSON_PROPERTY_TIMESERIES_LEGEND_TYPE = "timeseries_legend_type";
  private CreateSnapshotTimeseriesLegendType timeseriesLegendType;

  public static final String JSON_PROPERTY_TIMEZONE_OFFSET_MINUTES = "timezone_offset_minutes";
  private Long timezoneOffsetMinutes;

  public CreateSnapshotAdditionalConfig templateVariables(
      List<CreateSnapshotTemplateVariable> templateVariables) {
    this.templateVariables = templateVariables;
    for (CreateSnapshotTemplateVariable item : templateVariables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CreateSnapshotAdditionalConfig addTemplateVariablesItem(
      CreateSnapshotTemplateVariable templateVariablesItem) {
    if (this.templateVariables == null) {
      this.templateVariables = new ArrayList<>();
    }
    this.templateVariables.add(templateVariablesItem);
    this.unparsed |= templateVariablesItem.unparsed;
    return this;
  }

  /**
   * List of template variable definitions for snapshot rendering.
   *
   * @return templateVariables
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<CreateSnapshotTemplateVariable> getTemplateVariables() {
    return templateVariables;
  }

  public void setTemplateVariables(List<CreateSnapshotTemplateVariable> templateVariables) {
    this.templateVariables = templateVariables;
    if (templateVariables != null) {
      for (CreateSnapshotTemplateVariable item : templateVariables) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public CreateSnapshotAdditionalConfig timeseriesLegendType(
      CreateSnapshotTimeseriesLegendType timeseriesLegendType) {
    this.timeseriesLegendType = timeseriesLegendType;
    this.unparsed |= !timeseriesLegendType.isValid();
    return this;
  }

  /**
   * The legend display type for timeseries widgets. A value of <code>none</code> hides the legend
   * entirely; omitting the field lets the frontend choose automatically.
   *
   * @return timeseriesLegendType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMESERIES_LEGEND_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CreateSnapshotTimeseriesLegendType getTimeseriesLegendType() {
    return timeseriesLegendType;
  }

  public void setTimeseriesLegendType(CreateSnapshotTimeseriesLegendType timeseriesLegendType) {
    if (!timeseriesLegendType.isValid()) {
      this.unparsed = true;
    }
    this.timeseriesLegendType = timeseriesLegendType;
  }

  public CreateSnapshotAdditionalConfig timezoneOffsetMinutes(Long timezoneOffsetMinutes) {
    this.timezoneOffsetMinutes = timezoneOffsetMinutes;
    return this;
  }

  /**
   * Timezone offset in minutes from UTC. Positive values are west of UTC (for example, <code>300
   * </code> for UTC-5). Use <code>0</code> for UTC.
   *
   * @return timezoneOffsetMinutes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE_OFFSET_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTimezoneOffsetMinutes() {
    return timezoneOffsetMinutes;
  }

  public void setTimezoneOffsetMinutes(Long timezoneOffsetMinutes) {
    this.timezoneOffsetMinutes = timezoneOffsetMinutes;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return CreateSnapshotAdditionalConfig
   */
  @JsonAnySetter
  public CreateSnapshotAdditionalConfig putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this CreateSnapshotAdditionalConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSnapshotAdditionalConfig createSnapshotAdditionalConfig =
        (CreateSnapshotAdditionalConfig) o;
    return Objects.equals(this.templateVariables, createSnapshotAdditionalConfig.templateVariables)
        && Objects.equals(
            this.timeseriesLegendType, createSnapshotAdditionalConfig.timeseriesLegendType)
        && Objects.equals(
            this.timezoneOffsetMinutes, createSnapshotAdditionalConfig.timezoneOffsetMinutes)
        && Objects.equals(
            this.additionalProperties, createSnapshotAdditionalConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        templateVariables, timeseriesLegendType, timezoneOffsetMinutes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSnapshotAdditionalConfig {\n");
    sb.append("    templateVariables: ").append(toIndentedString(templateVariables)).append("\n");
    sb.append("    timeseriesLegendType: ")
        .append(toIndentedString(timeseriesLegendType))
        .append("\n");
    sb.append("    timezoneOffsetMinutes: ")
        .append(toIndentedString(timezoneOffsetMinutes))
        .append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
