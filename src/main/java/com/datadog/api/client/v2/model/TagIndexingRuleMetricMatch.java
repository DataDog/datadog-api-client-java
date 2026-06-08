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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Criteria for matching metrics based on query state. */
@JsonPropertyOrder({
  TagIndexingRuleMetricMatch.JSON_PROPERTY_IS_QUERIED,
  TagIndexingRuleMetricMatch.JSON_PROPERTY_NOT_QUERIED,
  TagIndexingRuleMetricMatch.JSON_PROPERTY_NOT_USED_IN_ASSETS,
  TagIndexingRuleMetricMatch.JSON_PROPERTY_QUERIED_WINDOW_SECONDS,
  TagIndexingRuleMetricMatch.JSON_PROPERTY_USED_IN_ASSETS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TagIndexingRuleMetricMatch {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_QUERIED = "is_queried";
  private Boolean isQueried;

  public static final String JSON_PROPERTY_NOT_QUERIED = "not_queried";
  private Boolean notQueried;

  public static final String JSON_PROPERTY_NOT_USED_IN_ASSETS = "not_used_in_assets";
  private Boolean notUsedInAssets;

  public static final String JSON_PROPERTY_QUERIED_WINDOW_SECONDS = "queried_window_seconds";
  private Long queriedWindowSeconds;

  public static final String JSON_PROPERTY_USED_IN_ASSETS = "used_in_assets";
  private Boolean usedInAssets;

  public TagIndexingRuleMetricMatch isQueried(Boolean isQueried) {
    this.isQueried = isQueried;
    return this;
  }

  /**
   * Match metrics that are being queried.
   *
   * @return isQueried
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_QUERIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsQueried() {
    return isQueried;
  }

  public void setIsQueried(Boolean isQueried) {
    this.isQueried = isQueried;
  }

  public TagIndexingRuleMetricMatch notQueried(Boolean notQueried) {
    this.notQueried = notQueried;
    return this;
  }

  /**
   * Match metrics that are not being queried.
   *
   * @return notQueried
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOT_QUERIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNotQueried() {
    return notQueried;
  }

  public void setNotQueried(Boolean notQueried) {
    this.notQueried = notQueried;
  }

  public TagIndexingRuleMetricMatch notUsedInAssets(Boolean notUsedInAssets) {
    this.notUsedInAssets = notUsedInAssets;
    return this;
  }

  /**
   * Match metrics not used in any dashboards or monitors.
   *
   * @return notUsedInAssets
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NOT_USED_IN_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNotUsedInAssets() {
    return notUsedInAssets;
  }

  public void setNotUsedInAssets(Boolean notUsedInAssets) {
    this.notUsedInAssets = notUsedInAssets;
  }

  public TagIndexingRuleMetricMatch queriedWindowSeconds(Long queriedWindowSeconds) {
    this.queriedWindowSeconds = queriedWindowSeconds;
    return this;
  }

  /**
   * Window in seconds for evaluating query state.
   *
   * @return queriedWindowSeconds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERIED_WINDOW_SECONDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getQueriedWindowSeconds() {
    return queriedWindowSeconds;
  }

  public void setQueriedWindowSeconds(Long queriedWindowSeconds) {
    this.queriedWindowSeconds = queriedWindowSeconds;
  }

  public TagIndexingRuleMetricMatch usedInAssets(Boolean usedInAssets) {
    this.usedInAssets = usedInAssets;
    return this;
  }

  /**
   * Match metrics used in dashboards or monitors.
   *
   * @return usedInAssets
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USED_IN_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getUsedInAssets() {
    return usedInAssets;
  }

  public void setUsedInAssets(Boolean usedInAssets) {
    this.usedInAssets = usedInAssets;
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
   * @return TagIndexingRuleMetricMatch
   */
  @JsonAnySetter
  public TagIndexingRuleMetricMatch putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TagIndexingRuleMetricMatch object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagIndexingRuleMetricMatch tagIndexingRuleMetricMatch = (TagIndexingRuleMetricMatch) o;
    return Objects.equals(this.isQueried, tagIndexingRuleMetricMatch.isQueried)
        && Objects.equals(this.notQueried, tagIndexingRuleMetricMatch.notQueried)
        && Objects.equals(this.notUsedInAssets, tagIndexingRuleMetricMatch.notUsedInAssets)
        && Objects.equals(
            this.queriedWindowSeconds, tagIndexingRuleMetricMatch.queriedWindowSeconds)
        && Objects.equals(this.usedInAssets, tagIndexingRuleMetricMatch.usedInAssets)
        && Objects.equals(
            this.additionalProperties, tagIndexingRuleMetricMatch.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        isQueried,
        notQueried,
        notUsedInAssets,
        queriedWindowSeconds,
        usedInAssets,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagIndexingRuleMetricMatch {\n");
    sb.append("    isQueried: ").append(toIndentedString(isQueried)).append("\n");
    sb.append("    notQueried: ").append(toIndentedString(notQueried)).append("\n");
    sb.append("    notUsedInAssets: ").append(toIndentedString(notUsedInAssets)).append("\n");
    sb.append("    queriedWindowSeconds: ")
        .append(toIndentedString(queriedWindowSeconds))
        .append("\n");
    sb.append("    usedInAssets: ").append(toIndentedString(usedInAssets)).append("\n");
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
