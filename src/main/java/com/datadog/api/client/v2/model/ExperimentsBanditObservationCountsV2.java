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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * How many observations the latest saved refresh saw, whatever the range. Null when its counts
 * can't be read.
 */
@JsonPropertyOrder({
  ExperimentsBanditObservationCountsV2.JSON_PROPERTY_INVALID,
  ExperimentsBanditObservationCountsV2.JSON_PROPERTY_TOTAL,
  ExperimentsBanditObservationCountsV2.JSON_PROPERTY_VALID_IMMATURE,
  ExperimentsBanditObservationCountsV2.JSON_PROPERTY_VALID_MATURE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditObservationCountsV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INVALID = "invalid";
  private Long invalid;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public static final String JSON_PROPERTY_VALID_IMMATURE = "valid_immature";
  private Long validImmature;

  public static final String JSON_PROPERTY_VALID_MATURE = "valid_mature";
  private Long validMature;

  public ExperimentsBanditObservationCountsV2() {}

  @JsonCreator
  public ExperimentsBanditObservationCountsV2(
      @JsonProperty(required = true, value = JSON_PROPERTY_INVALID) Long invalid,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL) Long total,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALID_IMMATURE) Long validImmature,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALID_MATURE) Long validMature) {
    this.invalid = invalid;
    this.total = total;
    this.validImmature = validImmature;
    this.validMature = validMature;
  }

  public ExperimentsBanditObservationCountsV2 invalid(Long invalid) {
    this.invalid = invalid;
    return this;
  }

  /**
   * Observations the refresh couldn't use.
   *
   * @return invalid
   */
  @JsonProperty(JSON_PROPERTY_INVALID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getInvalid() {
    return invalid;
  }

  public void setInvalid(Long invalid) {
    this.invalid = invalid;
  }

  public ExperimentsBanditObservationCountsV2 total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Every observation. The sum of the other three.
   *
   * @return total
   */
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public ExperimentsBanditObservationCountsV2 validImmature(Long validImmature) {
    this.validImmature = validImmature;
    return this;
  }

  /**
   * Valid observations whose aggregation window is still open.
   *
   * @return validImmature
   */
  @JsonProperty(JSON_PROPERTY_VALID_IMMATURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getValidImmature() {
    return validImmature;
  }

  public void setValidImmature(Long validImmature) {
    this.validImmature = validImmature;
  }

  public ExperimentsBanditObservationCountsV2 validMature(Long validMature) {
    this.validMature = validMature;
    return this;
  }

  /**
   * Valid observations whose aggregation window has closed. The estimates use these.
   *
   * @return validMature
   */
  @JsonProperty(JSON_PROPERTY_VALID_MATURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getValidMature() {
    return validMature;
  }

  public void setValidMature(Long validMature) {
    this.validMature = validMature;
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
   * @return ExperimentsBanditObservationCountsV2
   */
  @JsonAnySetter
  public ExperimentsBanditObservationCountsV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsBanditObservationCountsV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditObservationCountsV2 experimentsBanditObservationCountsV2 =
        (ExperimentsBanditObservationCountsV2) o;
    return Objects.equals(this.invalid, experimentsBanditObservationCountsV2.invalid)
        && Objects.equals(this.total, experimentsBanditObservationCountsV2.total)
        && Objects.equals(this.validImmature, experimentsBanditObservationCountsV2.validImmature)
        && Objects.equals(this.validMature, experimentsBanditObservationCountsV2.validMature)
        && Objects.equals(
            this.additionalProperties, experimentsBanditObservationCountsV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invalid, total, validImmature, validMature, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditObservationCountsV2 {\n");
    sb.append("    invalid: ").append(toIndentedString(invalid)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    validImmature: ").append(toIndentedString(validImmature)).append("\n");
    sb.append("    validMature: ").append(toIndentedString(validMature)).append("\n");
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
