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

/** AWS Metrics namespace filters */
@JsonPropertyOrder({
  AWSNamespacesList.JSON_PROPERTY_EXCLUDE_ALL,
  AWSNamespacesList.JSON_PROPERTY_EXCLUDE_ONLY,
  AWSNamespacesList.JSON_PROPERTY_INCLUDE_ALL,
  AWSNamespacesList.JSON_PROPERTY_INCLUDE_ONLY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSNamespacesList {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXCLUDE_ALL = "exclude_all";
  private Boolean excludeAll;

  public static final String JSON_PROPERTY_EXCLUDE_ONLY = "exclude_only";
  private List<String> excludeOnly = null;

  public static final String JSON_PROPERTY_INCLUDE_ALL = "include_all";
  private Boolean includeAll;

  public static final String JSON_PROPERTY_INCLUDE_ONLY = "include_only";
  private List<String> includeOnly = null;

  public AWSNamespacesList excludeAll(Boolean excludeAll) {
    this.excludeAll = excludeAll;
    return this;
  }

  /**
   * Exclude all namespaces
   *
   * @return excludeAll
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDE_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExcludeAll() {
    return excludeAll;
  }

  public void setExcludeAll(Boolean excludeAll) {
    this.excludeAll = excludeAll;
  }

  public AWSNamespacesList excludeOnly(List<String> excludeOnly) {
    this.excludeOnly = excludeOnly;
    return this;
  }

  public AWSNamespacesList addExcludeOnlyItem(String excludeOnlyItem) {
    if (this.excludeOnly == null) {
      this.excludeOnly = new ArrayList<>();
    }
    this.excludeOnly.add(excludeOnlyItem);
    return this;
  }

  /**
   * Exclude only these namespaces
   *
   * @return excludeOnly
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDE_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getExcludeOnly() {
    return excludeOnly;
  }

  public void setExcludeOnly(List<String> excludeOnly) {
    this.excludeOnly = excludeOnly;
  }

  public AWSNamespacesList includeAll(Boolean includeAll) {
    this.includeAll = includeAll;
    return this;
  }

  /**
   * Include all namespaces
   *
   * @return includeAll
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_ALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIncludeAll() {
    return includeAll;
  }

  public void setIncludeAll(Boolean includeAll) {
    this.includeAll = includeAll;
  }

  public AWSNamespacesList includeOnly(List<String> includeOnly) {
    this.includeOnly = includeOnly;
    return this;
  }

  public AWSNamespacesList addIncludeOnlyItem(String includeOnlyItem) {
    if (this.includeOnly == null) {
      this.includeOnly = new ArrayList<>();
    }
    this.includeOnly.add(includeOnlyItem);
    return this;
  }

  /**
   * Include only these namespaces
   *
   * @return includeOnly
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDE_ONLY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getIncludeOnly() {
    return includeOnly;
  }

  public void setIncludeOnly(List<String> includeOnly) {
    this.includeOnly = includeOnly;
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
   * @return AWSNamespacesList
   */
  @JsonAnySetter
  public AWSNamespacesList putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AWSNamespacesList object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSNamespacesList awsNamespacesList = (AWSNamespacesList) o;
    return Objects.equals(this.excludeAll, awsNamespacesList.excludeAll)
        && Objects.equals(this.excludeOnly, awsNamespacesList.excludeOnly)
        && Objects.equals(this.includeAll, awsNamespacesList.includeAll)
        && Objects.equals(this.includeOnly, awsNamespacesList.includeOnly)
        && Objects.equals(this.additionalProperties, awsNamespacesList.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(excludeAll, excludeOnly, includeAll, includeOnly, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSNamespacesList {\n");
    sb.append("    excludeAll: ").append(toIndentedString(excludeAll)).append("\n");
    sb.append("    excludeOnly: ").append(toIndentedString(excludeOnly)).append("\n");
    sb.append("    includeAll: ").append(toIndentedString(includeAll)).append("\n");
    sb.append("    includeOnly: ").append(toIndentedString(includeOnly)).append("\n");
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
