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

/** Attributes for setting the resolution reason on a security case. */
@JsonPropertyOrder({CaseUpdateResolvedReasonAttributes.JSON_PROPERTY_SECURITY_RESOLVED_REASON})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseUpdateResolvedReasonAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SECURITY_RESOLVED_REASON = "security_resolved_reason";
  private String securityResolvedReason;

  public CaseUpdateResolvedReasonAttributes() {}

  @JsonCreator
  public CaseUpdateResolvedReasonAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_SECURITY_RESOLVED_REASON)
          String securityResolvedReason) {
    this.securityResolvedReason = securityResolvedReason;
  }

  public CaseUpdateResolvedReasonAttributes securityResolvedReason(String securityResolvedReason) {
    this.securityResolvedReason = securityResolvedReason;
    return this;
  }

  /**
   * The reason the security case was resolved (for example, <code>FALSE_POSITIVE</code>, <code>
   * TRUE_POSITIVE</code>, <code>BENIGN_POSITIVE</code>).
   *
   * @return securityResolvedReason
   */
  @JsonProperty(JSON_PROPERTY_SECURITY_RESOLVED_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSecurityResolvedReason() {
    return securityResolvedReason;
  }

  public void setSecurityResolvedReason(String securityResolvedReason) {
    this.securityResolvedReason = securityResolvedReason;
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
   * @return CaseUpdateResolvedReasonAttributes
   */
  @JsonAnySetter
  public CaseUpdateResolvedReasonAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CaseUpdateResolvedReasonAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseUpdateResolvedReasonAttributes caseUpdateResolvedReasonAttributes =
        (CaseUpdateResolvedReasonAttributes) o;
    return Objects.equals(
            this.securityResolvedReason, caseUpdateResolvedReasonAttributes.securityResolvedReason)
        && Objects.equals(
            this.additionalProperties, caseUpdateResolvedReasonAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(securityResolvedReason, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseUpdateResolvedReasonAttributes {\n");
    sb.append("    securityResolvedReason: ")
        .append(toIndentedString(securityResolvedReason))
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
