/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The response from a monitor search. */
@JsonPropertyOrder({
  MonitorSearchResponse.JSON_PROPERTY_COUNTS,
  MonitorSearchResponse.JSON_PROPERTY_METADATA,
  MonitorSearchResponse.JSON_PROPERTY_MONITORS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorSearchResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNTS = "counts";
  private MonitorSearchResponseCounts counts;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private MonitorSearchResponseMetadata metadata;

  public static final String JSON_PROPERTY_MONITORS = "monitors";
  private List<MonitorSearchResult> monitors = null;

  /**
   * The counts of monitors per different criteria.
   *
   * @return counts
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorSearchResponseCounts getCounts() {
    return counts;
  }

  public MonitorSearchResponse metadata(MonitorSearchResponseMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * Metadata about the response.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorSearchResponseMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(MonitorSearchResponseMetadata metadata) {
    this.metadata = metadata;
  }

  /**
   * The list of found monitors.
   *
   * @return monitors
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<MonitorSearchResult> getMonitors() {
    return monitors;
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
   * @return MonitorSearchResponse
   */
  @JsonAnySetter
  public MonitorSearchResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this MonitorSearchResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorSearchResponse monitorSearchResponse = (MonitorSearchResponse) o;
    return Objects.equals(this.counts, monitorSearchResponse.counts)
        && Objects.equals(this.metadata, monitorSearchResponse.metadata)
        && Objects.equals(this.monitors, monitorSearchResponse.monitors)
        && Objects.equals(this.additionalProperties, monitorSearchResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counts, metadata, monitors, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorSearchResponse {\n");
    sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
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
