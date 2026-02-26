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

/** */
@JsonPropertyOrder({
  SecretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems.JSON_PROPERTY_END,
  SecretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems.JSON_PROPERTY_START
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_END = "end";
  private Long end;

  public static final String JSON_PROPERTY_START = "start";
  private Long start;

  public SecretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems end(Long end) {
    this.end = end;
    return this;
  }

  /**
   * Getend minimum: 0 maximum: 1.8446744073709552e+19
   *
   * @return end
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEnd() {
    return end;
  }

  public void setEnd(Long end) {
    this.end = end;
  }

  public SecretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems start(Long start) {
    this.start = start;
    return this;
  }

  /**
   * Getstart minimum: 0 maximum: 1.8446744073709552e+19
   *
   * @return start
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
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
   * @return SecretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems
   */
  @JsonAnySetter
  public SecretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems putAdditionalProperty(
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

  /**
   * Return true if this SecretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems
        secretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems =
            (SecretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems) o;
    return Objects.equals(
            this.end, secretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems.end)
        && Objects.equals(
            this.start, secretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems.start)
        && Objects.equals(
            this.additionalProperties,
            secretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, start, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretRuleDataAttributesMatchValidationInvalidHttpStatusCodeItems {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
