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

/** Attributes of the RUM configuration to create. */
@JsonPropertyOrder({RumConfigCreateAttributes.JSON_PROPERTY_ENFORCED_APPLICATION_TAGS})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumConfigCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENFORCED_APPLICATION_TAGS = "enforced_application_tags";
  private Boolean enforcedApplicationTags;

  public RumConfigCreateAttributes() {}

  @JsonCreator
  public RumConfigCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENFORCED_APPLICATION_TAGS)
          Boolean enforcedApplicationTags) {
    this.enforcedApplicationTags = enforcedApplicationTags;
  }

  public RumConfigCreateAttributes enforcedApplicationTags(Boolean enforcedApplicationTags) {
    this.enforcedApplicationTags = enforcedApplicationTags;
    return this;
  }

  /**
   * Whether application tags are enforced for the RUM applications in the organization.
   *
   * @return enforcedApplicationTags
   */
  @JsonProperty(JSON_PROPERTY_ENFORCED_APPLICATION_TAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnforcedApplicationTags() {
    return enforcedApplicationTags;
  }

  public void setEnforcedApplicationTags(Boolean enforcedApplicationTags) {
    this.enforcedApplicationTags = enforcedApplicationTags;
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
   * @return RumConfigCreateAttributes
   */
  @JsonAnySetter
  public RumConfigCreateAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumConfigCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumConfigCreateAttributes rumConfigCreateAttributes = (RumConfigCreateAttributes) o;
    return Objects.equals(
            this.enforcedApplicationTags, rumConfigCreateAttributes.enforcedApplicationTags)
        && Objects.equals(
            this.additionalProperties, rumConfigCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enforcedApplicationTags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumConfigCreateAttributes {\n");
    sb.append("    enforcedApplicationTags: ")
        .append(toIndentedString(enforcedApplicationTags))
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
