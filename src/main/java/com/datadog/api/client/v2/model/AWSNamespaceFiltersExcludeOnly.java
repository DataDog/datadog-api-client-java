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

/**
 * Exclude only these namespaces from metrics collection. Defaults to <code>
 * ["AWS/SQS", "AWS/ElasticMapReduce", "AWS/Usage"]</code>. <code>AWS/SQS</code>, <code>
 * AWS/ElasticMapReduce</code>, and <code>AWS/Usage</code> are excluded by default to reduce your
 * AWS CloudWatch costs from <code>GetMetricData</code> API calls.
 */
@JsonPropertyOrder({AWSNamespaceFiltersExcludeOnly.JSON_PROPERTY_EXCLUDE_ONLY})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSNamespaceFiltersExcludeOnly {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXCLUDE_ONLY = "exclude_only";
  private List<String> excludeOnly = new ArrayList<>();

  public AWSNamespaceFiltersExcludeOnly() {}

  @JsonCreator
  public AWSNamespaceFiltersExcludeOnly(
      @JsonProperty(required = true, value = JSON_PROPERTY_EXCLUDE_ONLY) List<String> excludeOnly) {
    this.excludeOnly = excludeOnly;
  }

  public AWSNamespaceFiltersExcludeOnly excludeOnly(List<String> excludeOnly) {
    this.excludeOnly = excludeOnly;
    return this;
  }

  public AWSNamespaceFiltersExcludeOnly addExcludeOnlyItem(String excludeOnlyItem) {
    this.excludeOnly.add(excludeOnlyItem);
    return this;
  }

  /**
   * Exclude only these namespaces from metrics collection. Defaults to <code>
   * ["AWS/SQS", "AWS/ElasticMapReduce", "AWS/Usage"]</code>. <code>AWS/SQS</code>, <code>
   * AWS/ElasticMapReduce</code>, and <code>AWS/Usage</code> are excluded by default to reduce your
   * AWS CloudWatch costs from <code>GetMetricData</code> API calls.
   *
   * @return excludeOnly
   */
  @JsonProperty(JSON_PROPERTY_EXCLUDE_ONLY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getExcludeOnly() {
    return excludeOnly;
  }

  public void setExcludeOnly(List<String> excludeOnly) {
    this.excludeOnly = excludeOnly;
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
   * @return AWSNamespaceFiltersExcludeOnly
   */
  @JsonAnySetter
  public AWSNamespaceFiltersExcludeOnly putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AWSNamespaceFiltersExcludeOnly object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSNamespaceFiltersExcludeOnly awsNamespaceFiltersExcludeOnly =
        (AWSNamespaceFiltersExcludeOnly) o;
    return Objects.equals(this.excludeOnly, awsNamespaceFiltersExcludeOnly.excludeOnly)
        && Objects.equals(
            this.additionalProperties, awsNamespaceFiltersExcludeOnly.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludeOnly, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSNamespaceFiltersExcludeOnly {\n");
    sb.append("    excludeOnly: ").append(toIndentedString(excludeOnly)).append("\n");
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
