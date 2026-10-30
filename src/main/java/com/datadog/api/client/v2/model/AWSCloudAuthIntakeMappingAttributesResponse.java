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

/** Attributes for AWS cloud authentication intake mapping response. */
@JsonPropertyOrder({
  AWSCloudAuthIntakeMappingAttributesResponse.JSON_PROPERTY_ARN_PATTERN,
  AWSCloudAuthIntakeMappingAttributesResponse.JSON_PROPERTY_PAR_ENROLLMENT_ENABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSCloudAuthIntakeMappingAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARN_PATTERN = "arn_pattern";
  private String arnPattern;

  public static final String JSON_PROPERTY_PAR_ENROLLMENT_ENABLED = "par_enrollment_enabled";
  private Boolean parEnrollmentEnabled;

  public AWSCloudAuthIntakeMappingAttributesResponse() {}

  @JsonCreator
  public AWSCloudAuthIntakeMappingAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_ARN_PATTERN) String arnPattern) {
    this.arnPattern = arnPattern;
  }

  public AWSCloudAuthIntakeMappingAttributesResponse arnPattern(String arnPattern) {
    this.arnPattern = arnPattern;
    return this;
  }

  /**
   * AWS caller ARN pattern allowed to authenticate for telemetry submission. ARN syntax and AWS
   * integration membership are validated by the server. For an assumed role, use the STS
   * assumed-role ARN with a trailing /* wildcard to match its sessions.
   *
   * @return arnPattern
   */
  @JsonProperty(JSON_PROPERTY_ARN_PATTERN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getArnPattern() {
    return arnPattern;
  }

  public void setArnPattern(String arnPattern) {
    this.arnPattern = arnPattern;
  }

  /**
   * Whether the mapping allows Private Action Runner enrollment. This attribute may be omitted when
   * enrollment is disabled. Enrollment permission is managed separately from the ARN pattern.
   *
   * @return parEnrollmentEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAR_ENROLLMENT_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getParEnrollmentEnabled() {
    return parEnrollmentEnabled;
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
   * @return AWSCloudAuthIntakeMappingAttributesResponse
   */
  @JsonAnySetter
  public AWSCloudAuthIntakeMappingAttributesResponse putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this AWSCloudAuthIntakeMappingAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSCloudAuthIntakeMappingAttributesResponse awsCloudAuthIntakeMappingAttributesResponse =
        (AWSCloudAuthIntakeMappingAttributesResponse) o;
    return Objects.equals(this.arnPattern, awsCloudAuthIntakeMappingAttributesResponse.arnPattern)
        && Objects.equals(
            this.parEnrollmentEnabled,
            awsCloudAuthIntakeMappingAttributesResponse.parEnrollmentEnabled)
        && Objects.equals(
            this.additionalProperties,
            awsCloudAuthIntakeMappingAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arnPattern, parEnrollmentEnabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSCloudAuthIntakeMappingAttributesResponse {\n");
    sb.append("    arnPattern: ").append(toIndentedString(arnPattern)).append("\n");
    sb.append("    parEnrollmentEnabled: ")
        .append(toIndentedString(parEnrollmentEnabled))
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
