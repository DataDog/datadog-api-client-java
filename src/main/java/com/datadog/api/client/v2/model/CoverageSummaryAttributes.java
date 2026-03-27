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
   * <p>Attributes object for code coverage summary response.</p>
 */
@JsonPropertyOrder({
  CoverageSummaryAttributes.JSON_PROPERTY_CODEOWNERS,
  CoverageSummaryAttributes.JSON_PROPERTY_EVALUATED_FLAGS_COUNT,
  CoverageSummaryAttributes.JSON_PROPERTY_EVALUATED_REPORTS_COUNT,
  CoverageSummaryAttributes.JSON_PROPERTY_PATCH_COVERAGE,
  CoverageSummaryAttributes.JSON_PROPERTY_SERVICES,
  CoverageSummaryAttributes.JSON_PROPERTY_TOTAL_COVERAGE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CoverageSummaryAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODEOWNERS = "codeowners";
  private JsonNullable<Map<String, CoverageSummaryCodeownerStats>> codeowners = JsonNullable.<Map<String, CoverageSummaryCodeownerStats>>undefined();

  public static final String JSON_PROPERTY_EVALUATED_FLAGS_COUNT = "evaluated_flags_count";
  private Long evaluatedFlagsCount;

  public static final String JSON_PROPERTY_EVALUATED_REPORTS_COUNT = "evaluated_reports_count";
  private Long evaluatedReportsCount;

  public static final String JSON_PROPERTY_PATCH_COVERAGE = "patch_coverage";
  private JsonNullable<Double> patchCoverage = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_SERVICES = "services";
  private JsonNullable<Map<String, CoverageSummaryServiceStats>> services = JsonNullable.<Map<String, CoverageSummaryServiceStats>>undefined();

  public static final String JSON_PROPERTY_TOTAL_COVERAGE = "total_coverage";
  private JsonNullable<Double> totalCoverage = JsonNullable.<Double>undefined();

  public CoverageSummaryAttributes codeowners(Map<String, CoverageSummaryCodeownerStats> codeowners) {
    this.codeowners = JsonNullable.<Map<String, CoverageSummaryCodeownerStats>>of(codeowners);
    return this;
  }
  public CoverageSummaryAttributes putCodeownersItem(String key, CoverageSummaryCodeownerStats codeownersItem) {
    if (this.codeowners == null || !this.codeowners.isPresent()) {
      this.codeowners = JsonNullable.<Map<String, CoverageSummaryCodeownerStats>>of(new HashMap<>());
    }
    try {
      this.codeowners.get().put(key, codeownersItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * <p>Coverage statistics broken down by code owner.</p>
   * @return codeowners
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Map<String, CoverageSummaryCodeownerStats> getCodeowners() {
        return codeowners.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_CODEOWNERS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, CoverageSummaryCodeownerStats>> getCodeowners_JsonNullable() {
    return codeowners;
  }
  @JsonProperty(JSON_PROPERTY_CODEOWNERS)public void setCodeowners_JsonNullable(JsonNullable<Map<String, CoverageSummaryCodeownerStats>> codeowners) {
    this.codeowners = codeowners;
  }
  public void setCodeowners(Map<String, CoverageSummaryCodeownerStats> codeowners) {
    this.codeowners = JsonNullable.<Map<String, CoverageSummaryCodeownerStats>>of(codeowners);
  }
  public CoverageSummaryAttributes evaluatedFlagsCount(Long evaluatedFlagsCount) {
    this.evaluatedFlagsCount = evaluatedFlagsCount;
    return this;
  }

  /**
   * <p>Total number of coverage flags evaluated.</p>
   * @return evaluatedFlagsCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EVALUATED_FLAGS_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getEvaluatedFlagsCount() {
        return evaluatedFlagsCount;
      }
  public void setEvaluatedFlagsCount(Long evaluatedFlagsCount) {
    this.evaluatedFlagsCount = evaluatedFlagsCount;
  }
  public CoverageSummaryAttributes evaluatedReportsCount(Long evaluatedReportsCount) {
    this.evaluatedReportsCount = evaluatedReportsCount;
    return this;
  }

  /**
   * <p>Total number of coverage reports evaluated.</p>
   * @return evaluatedReportsCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EVALUATED_REPORTS_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getEvaluatedReportsCount() {
        return evaluatedReportsCount;
      }
  public void setEvaluatedReportsCount(Long evaluatedReportsCount) {
    this.evaluatedReportsCount = evaluatedReportsCount;
  }
  public CoverageSummaryAttributes patchCoverage(Double patchCoverage) {
    this.patchCoverage = JsonNullable.<Double>of(patchCoverage);
    return this;
  }

  /**
   * <p>Overall patch coverage percentage.</p>
   * @return patchCoverage
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Double getPatchCoverage() {
        return patchCoverage.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_PATCH_COVERAGE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getPatchCoverage_JsonNullable() {
    return patchCoverage;
  }
  @JsonProperty(JSON_PROPERTY_PATCH_COVERAGE)public void setPatchCoverage_JsonNullable(JsonNullable<Double> patchCoverage) {
    this.patchCoverage = patchCoverage;
  }
  public void setPatchCoverage(Double patchCoverage) {
    this.patchCoverage = JsonNullable.<Double>of(patchCoverage);
  }
  public CoverageSummaryAttributes services(Map<String, CoverageSummaryServiceStats> services) {
    this.services = JsonNullable.<Map<String, CoverageSummaryServiceStats>>of(services);
    return this;
  }
  public CoverageSummaryAttributes putServicesItem(String key, CoverageSummaryServiceStats servicesItem) {
    if (this.services == null || !this.services.isPresent()) {
      this.services = JsonNullable.<Map<String, CoverageSummaryServiceStats>>of(new HashMap<>());
    }
    try {
      this.services.get().put(key, servicesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * <p>Coverage statistics broken down by service.</p>
   * @return services
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Map<String, CoverageSummaryServiceStats> getServices() {
        return services.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, CoverageSummaryServiceStats>> getServices_JsonNullable() {
    return services;
  }
  @JsonProperty(JSON_PROPERTY_SERVICES)public void setServices_JsonNullable(JsonNullable<Map<String, CoverageSummaryServiceStats>> services) {
    this.services = services;
  }
  public void setServices(Map<String, CoverageSummaryServiceStats> services) {
    this.services = JsonNullable.<Map<String, CoverageSummaryServiceStats>>of(services);
  }
  public CoverageSummaryAttributes totalCoverage(Double totalCoverage) {
    this.totalCoverage = JsonNullable.<Double>of(totalCoverage);
    return this;
  }

  /**
   * <p>Overall total coverage percentage.</p>
   * @return totalCoverage
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Double getTotalCoverage() {
        return totalCoverage.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_TOTAL_COVERAGE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Double> getTotalCoverage_JsonNullable() {
    return totalCoverage;
  }
  @JsonProperty(JSON_PROPERTY_TOTAL_COVERAGE)public void setTotalCoverage_JsonNullable(JsonNullable<Double> totalCoverage) {
    this.totalCoverage = totalCoverage;
  }
  public void setTotalCoverage(Double totalCoverage) {
    this.totalCoverage = JsonNullable.<Double>of(totalCoverage);
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
   * @return CoverageSummaryAttributes
   */
  @JsonAnySetter
  public CoverageSummaryAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this CoverageSummaryAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CoverageSummaryAttributes coverageSummaryAttributes = (CoverageSummaryAttributes) o;
    return Objects.equals(this.codeowners, coverageSummaryAttributes.codeowners) && Objects.equals(this.evaluatedFlagsCount, coverageSummaryAttributes.evaluatedFlagsCount) && Objects.equals(this.evaluatedReportsCount, coverageSummaryAttributes.evaluatedReportsCount) && Objects.equals(this.patchCoverage, coverageSummaryAttributes.patchCoverage) && Objects.equals(this.services, coverageSummaryAttributes.services) && Objects.equals(this.totalCoverage, coverageSummaryAttributes.totalCoverage) && Objects.equals(this.additionalProperties, coverageSummaryAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(codeowners,evaluatedFlagsCount,evaluatedReportsCount,patchCoverage,services,totalCoverage, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CoverageSummaryAttributes {\n");
    sb.append("    codeowners: ").append(toIndentedString(codeowners)).append("\n");
    sb.append("    evaluatedFlagsCount: ").append(toIndentedString(evaluatedFlagsCount)).append("\n");
    sb.append("    evaluatedReportsCount: ").append(toIndentedString(evaluatedReportsCount)).append("\n");
    sb.append("    patchCoverage: ").append(toIndentedString(patchCoverage)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    totalCoverage: ").append(toIndentedString(totalCoverage)).append("\n");
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
