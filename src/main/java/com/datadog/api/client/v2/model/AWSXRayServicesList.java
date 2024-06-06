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

/** AWS X-Ray services to collect traces from */
@JsonPropertyOrder({
  AWSXRayServicesList.JSON_PROPERTY_INCLUDE_ALL,
  AWSXRayServicesList.JSON_PROPERTY_INCLUDE_ONLY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSXRayServicesList {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INCLUDE_ALL = "include_all";
  private Boolean includeAll;

  public static final String JSON_PROPERTY_INCLUDE_ONLY = "include_only";
  private List<String> includeOnly = null;

  public AWSXRayServicesList includeAll(Boolean includeAll) {
    this.includeAll = includeAll;
    return this;
  }

  /**
   * Include all services
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

  public AWSXRayServicesList includeOnly(List<String> includeOnly) {
    this.includeOnly = includeOnly;
    return this;
  }

  public AWSXRayServicesList addIncludeOnlyItem(String includeOnlyItem) {
    if (this.includeOnly == null) {
      this.includeOnly = new ArrayList<>();
    }
    this.includeOnly.add(includeOnlyItem);
    return this;
  }

  /**
   * Include only these services
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
   * @return AWSXRayServicesList
   */
  @JsonAnySetter
  public AWSXRayServicesList putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AWSXRayServicesList object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSXRayServicesList awsxRayServicesList = (AWSXRayServicesList) o;
    return Objects.equals(this.includeAll, awsxRayServicesList.includeAll)
        && Objects.equals(this.includeOnly, awsxRayServicesList.includeOnly)
        && Objects.equals(this.additionalProperties, awsxRayServicesList.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeAll, includeOnly, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSXRayServicesList {\n");
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
