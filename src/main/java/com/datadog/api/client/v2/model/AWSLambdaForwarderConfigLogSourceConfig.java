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

/** Log source configuration. */
@JsonPropertyOrder({AWSLambdaForwarderConfigLogSourceConfig.JSON_PROPERTY_TAG_FILTERS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSLambdaForwarderConfigLogSourceConfig {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TAG_FILTERS = "tag_filters";
  private List<AWSLogSourceTagFilter> tagFilters = null;

  public AWSLambdaForwarderConfigLogSourceConfig tagFilters(
      List<AWSLogSourceTagFilter> tagFilters) {
    this.tagFilters = tagFilters;
    for (AWSLogSourceTagFilter item : tagFilters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AWSLambdaForwarderConfigLogSourceConfig addTagFiltersItem(
      AWSLogSourceTagFilter tagFiltersItem) {
    if (this.tagFilters == null) {
      this.tagFilters = new ArrayList<>();
    }
    this.tagFilters.add(tagFiltersItem);
    this.unparsed |= tagFiltersItem.unparsed;
    return this;
  }

  /**
   * List of AWS log source tag filters. Defaults to <code>[]</code>.
   *
   * @return tagFilters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAG_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AWSLogSourceTagFilter> getTagFilters() {
    return tagFilters;
  }

  public void setTagFilters(List<AWSLogSourceTagFilter> tagFilters) {
    this.tagFilters = tagFilters;
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
   * @return AWSLambdaForwarderConfigLogSourceConfig
   */
  @JsonAnySetter
  public AWSLambdaForwarderConfigLogSourceConfig putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AWSLambdaForwarderConfigLogSourceConfig object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSLambdaForwarderConfigLogSourceConfig awsLambdaForwarderConfigLogSourceConfig =
        (AWSLambdaForwarderConfigLogSourceConfig) o;
    return Objects.equals(this.tagFilters, awsLambdaForwarderConfigLogSourceConfig.tagFilters)
        && Objects.equals(
            this.additionalProperties,
            awsLambdaForwarderConfigLogSourceConfig.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tagFilters, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSLambdaForwarderConfigLogSourceConfig {\n");
    sb.append("    tagFilters: ").append(toIndentedString(tagFilters)).append("\n");
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
