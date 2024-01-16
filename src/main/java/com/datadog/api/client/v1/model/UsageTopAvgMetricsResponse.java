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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Response containing the number of hourly recorded custom metrics for a given organization. */
@JsonPropertyOrder({
  UsageTopAvgMetricsResponse.JSON_PROPERTY_METADATA,
  UsageTopAvgMetricsResponse.JSON_PROPERTY_USAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageTopAvgMetricsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private UsageTopAvgMetricsMetadata metadata;

  public static final String JSON_PROPERTY_USAGE = "usage";
  private List<UsageTopAvgMetricsHour> usage = null;

  public UsageTopAvgMetricsResponse metadata(UsageTopAvgMetricsMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * The object containing document metadata.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UsageTopAvgMetricsMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(UsageTopAvgMetricsMetadata metadata) {
    this.metadata = metadata;
  }

  public UsageTopAvgMetricsResponse usage(List<UsageTopAvgMetricsHour> usage) {
    this.usage = usage;
    for (UsageTopAvgMetricsHour item : usage) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public UsageTopAvgMetricsResponse addUsageItem(UsageTopAvgMetricsHour usageItem) {
    if (this.usage == null) {
      this.usage = new ArrayList<>();
    }
    this.usage.add(usageItem);
    this.unparsed |= usageItem.unparsed;
    return this;
  }

  /**
   * Number of hourly recorded custom metrics for a given organization.
   *
   * @return usage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<UsageTopAvgMetricsHour> getUsage() {
    return usage;
  }

  public void setUsage(List<UsageTopAvgMetricsHour> usage) {
    this.usage = usage;
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
   * @return UsageTopAvgMetricsResponse
   */
  @JsonAnySetter
  public UsageTopAvgMetricsResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UsageTopAvgMetricsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageTopAvgMetricsResponse usageTopAvgMetricsResponse = (UsageTopAvgMetricsResponse) o;
    return Objects.equals(this.metadata, usageTopAvgMetricsResponse.metadata)
        && Objects.equals(this.usage, usageTopAvgMetricsResponse.usage)
        && Objects.equals(
            this.additionalProperties, usageTopAvgMetricsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, usage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageTopAvgMetricsResponse {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
