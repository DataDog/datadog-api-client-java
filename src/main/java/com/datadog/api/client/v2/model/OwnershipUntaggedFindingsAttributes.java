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

/** The counts of findings without a team tag by ownership confidence. */
@JsonPropertyOrder({
  OwnershipUntaggedFindingsAttributes.JSON_PROPERTY_HIGH_CONFIDENCE,
  OwnershipUntaggedFindingsAttributes.JSON_PROPERTY_LOW_CONFIDENCE,
  OwnershipUntaggedFindingsAttributes.JSON_PROPERTY_MEDIUM_CONFIDENCE,
  OwnershipUntaggedFindingsAttributes.JSON_PROPERTY_TOTAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OwnershipUntaggedFindingsAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_HIGH_CONFIDENCE = "high_confidence";
  private Long highConfidence;

  public static final String JSON_PROPERTY_LOW_CONFIDENCE = "low_confidence";
  private Long lowConfidence;

  public static final String JSON_PROPERTY_MEDIUM_CONFIDENCE = "medium_confidence";
  private Long mediumConfidence;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public OwnershipUntaggedFindingsAttributes() {}

  @JsonCreator
  public OwnershipUntaggedFindingsAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_HIGH_CONFIDENCE) Long highConfidence,
      @JsonProperty(required = true, value = JSON_PROPERTY_LOW_CONFIDENCE) Long lowConfidence,
      @JsonProperty(required = true, value = JSON_PROPERTY_MEDIUM_CONFIDENCE) Long mediumConfidence,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL) Long total) {
    this.highConfidence = highConfidence;
    this.lowConfidence = lowConfidence;
    this.mediumConfidence = mediumConfidence;
    this.total = total;
  }

  public OwnershipUntaggedFindingsAttributes highConfidence(Long highConfidence) {
    this.highConfidence = highConfidence;
    return this;
  }

  /**
   * The number of high confidence findings without a team tag.
   *
   * @return highConfidence
   */
  @JsonProperty(JSON_PROPERTY_HIGH_CONFIDENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getHighConfidence() {
    return highConfidence;
  }

  public void setHighConfidence(Long highConfidence) {
    this.highConfidence = highConfidence;
  }

  public OwnershipUntaggedFindingsAttributes lowConfidence(Long lowConfidence) {
    this.lowConfidence = lowConfidence;
    return this;
  }

  /**
   * The number of low confidence findings without a team tag.
   *
   * @return lowConfidence
   */
  @JsonProperty(JSON_PROPERTY_LOW_CONFIDENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getLowConfidence() {
    return lowConfidence;
  }

  public void setLowConfidence(Long lowConfidence) {
    this.lowConfidence = lowConfidence;
  }

  public OwnershipUntaggedFindingsAttributes mediumConfidence(Long mediumConfidence) {
    this.mediumConfidence = mediumConfidence;
    return this;
  }

  /**
   * The number of medium confidence findings without a team tag.
   *
   * @return mediumConfidence
   */
  @JsonProperty(JSON_PROPERTY_MEDIUM_CONFIDENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getMediumConfidence() {
    return mediumConfidence;
  }

  public void setMediumConfidence(Long mediumConfidence) {
    this.mediumConfidence = mediumConfidence;
  }

  public OwnershipUntaggedFindingsAttributes total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * The total number of findings without a team tag.
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
   * @return OwnershipUntaggedFindingsAttributes
   */
  @JsonAnySetter
  public OwnershipUntaggedFindingsAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OwnershipUntaggedFindingsAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnershipUntaggedFindingsAttributes ownershipUntaggedFindingsAttributes =
        (OwnershipUntaggedFindingsAttributes) o;
    return Objects.equals(this.highConfidence, ownershipUntaggedFindingsAttributes.highConfidence)
        && Objects.equals(this.lowConfidence, ownershipUntaggedFindingsAttributes.lowConfidence)
        && Objects.equals(
            this.mediumConfidence, ownershipUntaggedFindingsAttributes.mediumConfidence)
        && Objects.equals(this.total, ownershipUntaggedFindingsAttributes.total)
        && Objects.equals(
            this.additionalProperties, ownershipUntaggedFindingsAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        highConfidence, lowConfidence, mediumConfidence, total, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnershipUntaggedFindingsAttributes {\n");
    sb.append("    highConfidence: ").append(toIndentedString(highConfidence)).append("\n");
    sb.append("    lowConfidence: ").append(toIndentedString(lowConfidence)).append("\n");
    sb.append("    mediumConfidence: ").append(toIndentedString(mediumConfidence)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
