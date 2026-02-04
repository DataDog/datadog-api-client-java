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

/** Count of integrations by type. */
@JsonPropertyOrder({
  IntegrationCounts.JSON_PROPERTY_FILTERED_COUNT,
  IntegrationCounts.JSON_PROPERTY_INTEGRATION_TYPE,
  IntegrationCounts.JSON_PROPERTY_TOTAL_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IntegrationCounts {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILTERED_COUNT = "filtered_count";
  private Long filteredCount;

  public static final String JSON_PROPERTY_INTEGRATION_TYPE = "integration_type";
  private String integrationType;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private Long totalCount;

  public IntegrationCounts filteredCount(Long filteredCount) {
    this.filteredCount = filteredCount;
    return this;
  }

  /**
   * The filtered count of integrations.
   *
   * @return filteredCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERED_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFilteredCount() {
    return filteredCount;
  }

  public void setFilteredCount(Long filteredCount) {
    this.filteredCount = filteredCount;
  }

  public IntegrationCounts integrationType(String integrationType) {
    this.integrationType = integrationType;
    return this;
  }

  /**
   * The integration type.
   *
   * @return integrationType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIntegrationType() {
    return integrationType;
  }

  public void setIntegrationType(String integrationType) {
    this.integrationType = integrationType;
  }

  public IntegrationCounts totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }

  /**
   * The total count of integrations.
   *
   * @return totalCount
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
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
   * @return IntegrationCounts
   */
  @JsonAnySetter
  public IntegrationCounts putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IntegrationCounts object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationCounts integrationCounts = (IntegrationCounts) o;
    return Objects.equals(this.filteredCount, integrationCounts.filteredCount)
        && Objects.equals(this.integrationType, integrationCounts.integrationType)
        && Objects.equals(this.totalCount, integrationCounts.totalCount)
        && Objects.equals(this.additionalProperties, integrationCounts.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filteredCount, integrationType, totalCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationCounts {\n");
    sb.append("    filteredCount: ").append(toIndentedString(filteredCount)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
