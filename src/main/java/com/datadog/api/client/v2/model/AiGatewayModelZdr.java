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
 * The Datadog side of a model's zero data retention eligibility. The customer side is the
 * provider's <code>zdr_eligible</code> setting.
 */
@JsonPropertyOrder({
  AiGatewayModelZdr.JSON_PROPERTY_COVERAGE,
  AiGatewayModelZdr.JSON_PROPERTY_COVERED_OPERATIONS,
  AiGatewayModelZdr.JSON_PROPERTY_UNCOVERED_OPERATIONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelZdr {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COVERAGE = "coverage";
  private AiGatewayModelZdrCoverage coverage;

  public static final String JSON_PROPERTY_COVERED_OPERATIONS = "covered_operations";
  private List<String> coveredOperations = null;

  public static final String JSON_PROPERTY_UNCOVERED_OPERATIONS = "uncovered_operations";
  private List<String> uncoveredOperations = null;

  public AiGatewayModelZdr() {}

  @JsonCreator
  public AiGatewayModelZdr(
      @JsonProperty(required = true, value = JSON_PROPERTY_COVERAGE)
          AiGatewayModelZdrCoverage coverage) {
    this.coverage = coverage;
    this.unparsed |= !coverage.isValid();
  }

  public AiGatewayModelZdr coverage(AiGatewayModelZdrCoverage coverage) {
    this.coverage = coverage;
    this.unparsed |= !coverage.isValid();
    return this;
  }

  /**
   * Datadog's coverage of the model's operations under zero data retention. A model is eligible
   * when coverage is <code>full</code> and its provider's <code>zdr_eligible</code> is <code>true
   * </code>. <code>partial</code> means only the <code>covered_operations</code> can be served:
   * requests on other operations are not dispatched to it.
   *
   * @return coverage
   */
  @JsonProperty(JSON_PROPERTY_COVERAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayModelZdrCoverage getCoverage() {
    return coverage;
  }

  public void setCoverage(AiGatewayModelZdrCoverage coverage) {
    if (!coverage.isValid()) {
      this.unparsed = true;
    }
    this.coverage = coverage;
  }

  public AiGatewayModelZdr coveredOperations(List<String> coveredOperations) {
    this.coveredOperations = coveredOperations;
    return this;
  }

  public AiGatewayModelZdr addCoveredOperationsItem(String coveredOperationsItem) {
    if (this.coveredOperations == null) {
      this.coveredOperations = new ArrayList<>();
    }
    this.coveredOperations.add(coveredOperationsItem);
    return this;
  }

  /**
   * Operations covered by zero data retention.
   *
   * @return coveredOperations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COVERED_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCoveredOperations() {
    return coveredOperations;
  }

  public void setCoveredOperations(List<String> coveredOperations) {
    this.coveredOperations = coveredOperations;
  }

  public AiGatewayModelZdr uncoveredOperations(List<String> uncoveredOperations) {
    this.uncoveredOperations = uncoveredOperations;
    return this;
  }

  public AiGatewayModelZdr addUncoveredOperationsItem(String uncoveredOperationsItem) {
    if (this.uncoveredOperations == null) {
      this.uncoveredOperations = new ArrayList<>();
    }
    this.uncoveredOperations.add(uncoveredOperationsItem);
    return this;
  }

  /**
   * Operations not covered by zero data retention.
   *
   * @return uncoveredOperations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNCOVERED_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getUncoveredOperations() {
    return uncoveredOperations;
  }

  public void setUncoveredOperations(List<String> uncoveredOperations) {
    this.uncoveredOperations = uncoveredOperations;
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
   * @return AiGatewayModelZdr
   */
  @JsonAnySetter
  public AiGatewayModelZdr putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayModelZdr object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelZdr aiGatewayModelZdr = (AiGatewayModelZdr) o;
    return Objects.equals(this.coverage, aiGatewayModelZdr.coverage)
        && Objects.equals(this.coveredOperations, aiGatewayModelZdr.coveredOperations)
        && Objects.equals(this.uncoveredOperations, aiGatewayModelZdr.uncoveredOperations)
        && Objects.equals(this.additionalProperties, aiGatewayModelZdr.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverage, coveredOperations, uncoveredOperations, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelZdr {\n");
    sb.append("    coverage: ").append(toIndentedString(coverage)).append("\n");
    sb.append("    coveredOperations: ").append(toIndentedString(coveredOperations)).append("\n");
    sb.append("    uncoveredOperations: ")
        .append(toIndentedString(uncoveredOperations))
        .append("\n");
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
