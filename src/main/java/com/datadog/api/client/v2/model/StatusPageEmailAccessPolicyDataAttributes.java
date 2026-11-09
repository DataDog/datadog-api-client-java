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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of a status page email access policy. */
@JsonPropertyOrder({
  StatusPageEmailAccessPolicyDataAttributes.JSON_PROPERTY_CREATED_AT,
  StatusPageEmailAccessPolicyDataAttributes.JSON_PROPERTY_EFFECT,
  StatusPageEmailAccessPolicyDataAttributes.JSON_PROPERTY_PATTERN
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class StatusPageEmailAccessPolicyDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EFFECT = "effect";
  private AccessPolicyEffect effect;

  public static final String JSON_PROPERTY_PATTERN = "pattern";
  private String pattern;

  public StatusPageEmailAccessPolicyDataAttributes() {}

  @JsonCreator
  public StatusPageEmailAccessPolicyDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_EFFECT) AccessPolicyEffect effect,
      @JsonProperty(required = true, value = JSON_PROPERTY_PATTERN) String pattern) {
    this.createdAt = createdAt;
    this.effect = effect;
    this.unparsed |= !effect.isValid();
    this.pattern = pattern;
  }

  public StatusPageEmailAccessPolicyDataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp of when the email access policy was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public StatusPageEmailAccessPolicyDataAttributes effect(AccessPolicyEffect effect) {
    this.effect = effect;
    this.unparsed |= !effect.isValid();
    return this;
  }

  /**
   * The effect applied when an email address matches the policy. Deny policies take precedence over
   * allow policies.
   *
   * @return effect
   */
  @JsonProperty(JSON_PROPERTY_EFFECT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AccessPolicyEffect getEffect() {
    return effect;
  }

  public void setEffect(AccessPolicyEffect effect) {
    if (!effect.isValid()) {
      this.unparsed = true;
    }
    this.effect = effect;
  }

  public StatusPageEmailAccessPolicyDataAttributes pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * The email address pattern matched by the policy.
   *
   * @return pattern
   */
  @JsonProperty(JSON_PROPERTY_PATTERN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPattern() {
    return pattern;
  }

  public void setPattern(String pattern) {
    this.pattern = pattern;
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
   * @return StatusPageEmailAccessPolicyDataAttributes
   */
  @JsonAnySetter
  public StatusPageEmailAccessPolicyDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this StatusPageEmailAccessPolicyDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusPageEmailAccessPolicyDataAttributes statusPageEmailAccessPolicyDataAttributes =
        (StatusPageEmailAccessPolicyDataAttributes) o;
    return Objects.equals(this.createdAt, statusPageEmailAccessPolicyDataAttributes.createdAt)
        && Objects.equals(this.effect, statusPageEmailAccessPolicyDataAttributes.effect)
        && Objects.equals(this.pattern, statusPageEmailAccessPolicyDataAttributes.pattern)
        && Objects.equals(
            this.additionalProperties,
            statusPageEmailAccessPolicyDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, effect, pattern, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusPageEmailAccessPolicyDataAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    effect: ").append(toIndentedString(effect)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
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
