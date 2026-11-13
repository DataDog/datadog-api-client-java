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
import org.openapitools.jackson.nullable.JsonNullable;

/** Coverage statistics for a specific flag. */
@JsonPropertyOrder({
  CoverageSummaryFlagStats.JSON_PROPERTY_PATCH_COVERAGE,
  CoverageSummaryFlagStats.JSON_PROPERTY_TOTAL_COVERAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CoverageSummaryFlagStats {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PATCH_COVERAGE = "patch_coverage";
  private JsonNullable<Double> patchCoverage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_TOTAL_COVERAGE = "total_coverage";
  private JsonNullable<Double> totalCoverage = JsonNullable.<Double>undefined();

  public CoverageSummaryFlagStats patchCoverage(Double patchCoverage) {
    this.patchCoverage = JsonNullable.<Double>of(patchCoverage);
    return this;
  }

  /**
   * Patch coverage percentage for the flag.
   *
   * @return patchCoverage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getPatchCoverage() {
    return patchCoverage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PATCH_COVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getPatchCoverage_JsonNullable() {
    return patchCoverage;
  }

  @JsonProperty(JSON_PROPERTY_PATCH_COVERAGE)
  public void setPatchCoverage_JsonNullable(JsonNullable<Double> patchCoverage) {
    this.patchCoverage = patchCoverage;
  }

  public void setPatchCoverage(Double patchCoverage) {
    this.patchCoverage = JsonNullable.<Double>of(patchCoverage);
  }

  public CoverageSummaryFlagStats totalCoverage(Double totalCoverage) {
    this.totalCoverage = JsonNullable.<Double>of(totalCoverage);
    return this;
  }

  /**
   * Total coverage percentage for the flag.
   *
   * @return totalCoverage
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Double getTotalCoverage() {
    return totalCoverage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TOTAL_COVERAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getTotalCoverage_JsonNullable() {
    return totalCoverage;
  }

  @JsonProperty(JSON_PROPERTY_TOTAL_COVERAGE)
  public void setTotalCoverage_JsonNullable(JsonNullable<Double> totalCoverage) {
    this.totalCoverage = totalCoverage;
  }

  public void setTotalCoverage(Double totalCoverage) {
    this.totalCoverage = JsonNullable.<Double>of(totalCoverage);
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
   * @return CoverageSummaryFlagStats
   */
  @JsonAnySetter
  public CoverageSummaryFlagStats putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CoverageSummaryFlagStats object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoverageSummaryFlagStats coverageSummaryFlagStats = (CoverageSummaryFlagStats) o;
    return Objects.equals(this.patchCoverage, coverageSummaryFlagStats.patchCoverage)
        && Objects.equals(this.totalCoverage, coverageSummaryFlagStats.totalCoverage)
        && Objects.equals(this.additionalProperties, coverageSummaryFlagStats.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(patchCoverage, totalCoverage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoverageSummaryFlagStats {\n");
    sb.append("    patchCoverage: ").append(toIndentedString(patchCoverage)).append("\n");
    sb.append("    totalCoverage: ").append(toIndentedString(totalCoverage)).append("\n");
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
