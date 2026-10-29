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

/** The reason no rule could be generated. Only present when the status is <code>failed</code>. */
@JsonPropertyOrder({
  SecurityMonitoringRuleProposalError.JSON_PROPERTY_KIND,
  SecurityMonitoringRuleProposalError.JSON_PROPERTY_MESSAGE,
  SecurityMonitoringRuleProposalError.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringRuleProposalError {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_KIND = "kind";
  private String kind;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public SecurityMonitoringRuleProposalError() {}

  @JsonCreator
  public SecurityMonitoringRuleProposalError(
      @JsonProperty(required = true, value = JSON_PROPERTY_KIND) String kind) {
    this.kind = kind;
  }

  public SecurityMonitoringRuleProposalError kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The kind of failure. - <code>translation_error</code>: no rule could be generated from the
   * input. Reword the input or add details, then start a new rule proposal. - <code>internal_error
   * </code>: the proposal failed because of an internal error. Start a new rule proposal to try
   * again.
   *
   * @return kind
   */
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public SecurityMonitoringRuleProposalError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A human-readable explanation of why no rule could be generated, when available.
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SecurityMonitoringRuleProposalError type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of failure within its kind, such as <code>NoRuleProduced</code>.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
   * @return SecurityMonitoringRuleProposalError
   */
  @JsonAnySetter
  public SecurityMonitoringRuleProposalError putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringRuleProposalError object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleProposalError securityMonitoringRuleProposalError =
        (SecurityMonitoringRuleProposalError) o;
    return Objects.equals(this.kind, securityMonitoringRuleProposalError.kind)
        && Objects.equals(this.message, securityMonitoringRuleProposalError.message)
        && Objects.equals(this.type, securityMonitoringRuleProposalError.type)
        && Objects.equals(
            this.additionalProperties, securityMonitoringRuleProposalError.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(kind, message, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleProposalError {\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
