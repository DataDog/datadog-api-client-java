/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Object of the monitor tags. */
@JsonPropertyOrder({DowntimeMonitorIdentifierTags.JSON_PROPERTY_MONITOR_TAGS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DowntimeMonitorIdentifierTags {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MONITOR_TAGS = "monitor_tags";
  private List<String> monitorTags = new ArrayList<>();

  public DowntimeMonitorIdentifierTags() {}

  @JsonCreator
  public DowntimeMonitorIdentifierTags(
      @JsonProperty(required = true, value = JSON_PROPERTY_MONITOR_TAGS) List<String> monitorTags) {
    this.monitorTags = monitorTags;
  }

  public DowntimeMonitorIdentifierTags monitorTags(List<String> monitorTags) {
    this.monitorTags = monitorTags;
    return this;
  }

  public DowntimeMonitorIdentifierTags addMonitorTagsItem(String monitorTagsItem) {
    this.monitorTags.add(monitorTagsItem);
    return this;
  }

  /**
   * A list of monitor tags. For example, tags that are applied directly to monitors, not tags that
   * are used in monitor queries (which are filtered by the scope parameter), to which the downtime
   * applies. The resulting downtime applies to monitors that match <strong>all</strong> provided
   * monitor tags. Setting <code>monitor_tags</code> to <code>[*]</code> configures the downtime to
   * mute all monitors for the given scope.
   *
   * @return monitorTags
   */
  @JsonProperty(JSON_PROPERTY_MONITOR_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getMonitorTags() {
    return monitorTags;
  }

  public void setMonitorTags(List<String> monitorTags) {
    this.monitorTags = monitorTags;
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
   * @return DowntimeMonitorIdentifierTags
   */
  @JsonAnySetter
  public DowntimeMonitorIdentifierTags putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DowntimeMonitorIdentifierTags object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DowntimeMonitorIdentifierTags downtimeMonitorIdentifierTags = (DowntimeMonitorIdentifierTags) o;
    return Objects.equals(this.monitorTags, downtimeMonitorIdentifierTags.monitorTags)
        && Objects.equals(
            this.additionalProperties, downtimeMonitorIdentifierTags.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(monitorTags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DowntimeMonitorIdentifierTags {\n");
    sb.append("    monitorTags: ").append(toIndentedString(monitorTags)).append("\n");
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
