/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Mobile application for mobile synthetics test. */
@JsonPropertyOrder({
  SyntheticsMobileTestsMobileApplication.JSON_PROPERTY_APPLICATION_ID,
  SyntheticsMobileTestsMobileApplication.JSON_PROPERTY_REFERENCE_ID,
  SyntheticsMobileTestsMobileApplication.JSON_PROPERTY_REFERENCE_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsMobileTestsMobileApplication {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPLICATION_ID = "applicationId";
  private String applicationId;

  public static final String JSON_PROPERTY_REFERENCE_ID = "referenceId";
  private String referenceId;

  public static final String JSON_PROPERTY_REFERENCE_TYPE = "referenceType";
  private SyntheticsMobileTestsMobileApplicationReferenceType referenceType;

  public SyntheticsMobileTestsMobileApplication() {}

  @JsonCreator
  public SyntheticsMobileTestsMobileApplication(
      @JsonProperty(required = true, value = JSON_PROPERTY_APPLICATION_ID) String applicationId,
      @JsonProperty(required = true, value = JSON_PROPERTY_REFERENCE_ID) String referenceId,
      @JsonProperty(required = true, value = JSON_PROPERTY_REFERENCE_TYPE)
          SyntheticsMobileTestsMobileApplicationReferenceType referenceType) {
    this.applicationId = applicationId;
    this.referenceId = referenceId;
    this.referenceType = referenceType;
    this.unparsed |= !referenceType.isValid();
  }

  public SyntheticsMobileTestsMobileApplication applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

  /**
   * Application ID of the mobile application.
   *
   * @return applicationId
   */
  @JsonProperty(JSON_PROPERTY_APPLICATION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public SyntheticsMobileTestsMobileApplication referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

  /**
   * Reference ID of the mobile application.
   *
   * @return referenceId
   */
  @JsonProperty(JSON_PROPERTY_REFERENCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public SyntheticsMobileTestsMobileApplication referenceType(
      SyntheticsMobileTestsMobileApplicationReferenceType referenceType) {
    this.referenceType = referenceType;
    this.unparsed |= !referenceType.isValid();
    return this;
  }

  /**
   * Reference type for the mobile application for a mobile synthetics test.
   *
   * @return referenceType
   */
  @JsonProperty(JSON_PROPERTY_REFERENCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SyntheticsMobileTestsMobileApplicationReferenceType getReferenceType() {
    return referenceType;
  }

  public void setReferenceType(SyntheticsMobileTestsMobileApplicationReferenceType referenceType) {
    if (!referenceType.isValid()) {
      this.unparsed = true;
    }
    this.referenceType = referenceType;
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
   * @return SyntheticsMobileTestsMobileApplication
   */
  @JsonAnySetter
  public SyntheticsMobileTestsMobileApplication putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsMobileTestsMobileApplication object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsMobileTestsMobileApplication syntheticsMobileTestsMobileApplication =
        (SyntheticsMobileTestsMobileApplication) o;
    return Objects.equals(this.applicationId, syntheticsMobileTestsMobileApplication.applicationId)
        && Objects.equals(this.referenceId, syntheticsMobileTestsMobileApplication.referenceId)
        && Objects.equals(this.referenceType, syntheticsMobileTestsMobileApplication.referenceType)
        && Objects.equals(
            this.additionalProperties, syntheticsMobileTestsMobileApplication.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, referenceId, referenceType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsMobileTestsMobileApplication {\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    referenceType: ").append(toIndentedString(referenceType)).append("\n");
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
