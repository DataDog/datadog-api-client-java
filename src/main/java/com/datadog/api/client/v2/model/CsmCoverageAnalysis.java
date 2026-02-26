/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>CSM Coverage Analysis.</p>
 */
@JsonPropertyOrder({
  CsmCoverageAnalysis.JSON_PROPERTY_CONFIGURED_RESOURCES_COUNT,
  CsmCoverageAnalysis.JSON_PROPERTY_COVERAGE,
  CsmCoverageAnalysis.JSON_PROPERTY_PARTIALLY_CONFIGURED_RESOURCES_COUNT,
  CsmCoverageAnalysis.JSON_PROPERTY_TOTAL_RESOURCES_COUNT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CsmCoverageAnalysis {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIGURED_RESOURCES_COUNT = "configured_resources_count";
  private Long configuredResourcesCount;

  public static final String JSON_PROPERTY_COVERAGE = "coverage";
  private Double coverage;

  public static final String JSON_PROPERTY_PARTIALLY_CONFIGURED_RESOURCES_COUNT = "partially_configured_resources_count";
  private Long partiallyConfiguredResourcesCount;

  public static final String JSON_PROPERTY_TOTAL_RESOURCES_COUNT = "total_resources_count";
  private Long totalResourcesCount;

  public CsmCoverageAnalysis configuredResourcesCount(Long configuredResourcesCount) {
    this.configuredResourcesCount = configuredResourcesCount;
    return this;
  }

  /**
   * <p>The number of fully configured resources.</p>
   * @return configuredResourcesCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONFIGURED_RESOURCES_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getConfiguredResourcesCount() {
        return configuredResourcesCount;
      }
  public void setConfiguredResourcesCount(Long configuredResourcesCount) {
    this.configuredResourcesCount = configuredResourcesCount;
  }
  public CsmCoverageAnalysis coverage(Double coverage) {
    this.coverage = coverage;
    return this;
  }

  /**
   * <p>The coverage percentage.</p>
   * @return coverage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COVERAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getCoverage() {
        return coverage;
      }
  public void setCoverage(Double coverage) {
    this.coverage = coverage;
  }
  public CsmCoverageAnalysis partiallyConfiguredResourcesCount(Long partiallyConfiguredResourcesCount) {
    this.partiallyConfiguredResourcesCount = partiallyConfiguredResourcesCount;
    return this;
  }

  /**
   * <p>The number of partially configured resources.</p>
   * @return partiallyConfiguredResourcesCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PARTIALLY_CONFIGURED_RESOURCES_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getPartiallyConfiguredResourcesCount() {
        return partiallyConfiguredResourcesCount;
      }
  public void setPartiallyConfiguredResourcesCount(Long partiallyConfiguredResourcesCount) {
    this.partiallyConfiguredResourcesCount = partiallyConfiguredResourcesCount;
  }
  public CsmCoverageAnalysis totalResourcesCount(Long totalResourcesCount) {
    this.totalResourcesCount = totalResourcesCount;
    return this;
  }

  /**
   * <p>The total number of resources.</p>
   * @return totalResourcesCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TOTAL_RESOURCES_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getTotalResourcesCount() {
        return totalResourcesCount;
      }
  public void setTotalResourcesCount(Long totalResourcesCount) {
    this.totalResourcesCount = totalResourcesCount;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return CsmCoverageAnalysis
   */
  @JsonAnySetter
  public CsmCoverageAnalysis putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this CsmCoverageAnalysis object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CsmCoverageAnalysis csmCoverageAnalysis = (CsmCoverageAnalysis) o;
    return Objects.equals(this.configuredResourcesCount, csmCoverageAnalysis.configuredResourcesCount) && Objects.equals(this.coverage, csmCoverageAnalysis.coverage) && Objects.equals(this.partiallyConfiguredResourcesCount, csmCoverageAnalysis.partiallyConfiguredResourcesCount) && Objects.equals(this.totalResourcesCount, csmCoverageAnalysis.totalResourcesCount) && Objects.equals(this.additionalProperties, csmCoverageAnalysis.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(configuredResourcesCount,coverage,partiallyConfiguredResourcesCount,totalResourcesCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CsmCoverageAnalysis {\n");
    sb.append("    configuredResourcesCount: ").append(toIndentedString(configuredResourcesCount)).append("\n");
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
    sb.append("    partiallyConfiguredResourcesCount: ").append(toIndentedString(partiallyConfiguredResourcesCount)).append("\n");
    sb.append("    totalResourcesCount: ").append(toIndentedString(totalResourcesCount)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
