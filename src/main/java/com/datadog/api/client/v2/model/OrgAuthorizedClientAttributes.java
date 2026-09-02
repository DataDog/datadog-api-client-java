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

/** Attributes of an org authorized client. */
@JsonPropertyOrder({
  OrgAuthorizedClientAttributes.JSON_PROPERTY_DISABLED,
  OrgAuthorizedClientAttributes.JSON_PROPERTY_LAST_EXERCISED,
  OrgAuthorizedClientAttributes.JSON_PROPERTY_USER_COUNT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OrgAuthorizedClientAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_LAST_EXERCISED = "last_exercised";
  private OffsetDateTime lastExercised;

  public static final String JSON_PROPERTY_USER_COUNT = "user_count";
  private Long userCount;

  public OrgAuthorizedClientAttributes() {}

  @JsonCreator
  public OrgAuthorizedClientAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DISABLED) Boolean disabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_EXERCISED)
          OffsetDateTime lastExercised,
      @JsonProperty(required = true, value = JSON_PROPERTY_USER_COUNT) Long userCount) {
    this.disabled = disabled;
    this.lastExercised = lastExercised;
    if (lastExercised != null) {}
    this.userCount = userCount;
  }

  public OrgAuthorizedClientAttributes disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Whether the organization has disabled this client.
   *
   * @return disabled
   */
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public OrgAuthorizedClientAttributes lastExercised(OffsetDateTime lastExercised) {
    this.lastExercised = lastExercised;
    if (lastExercised != null) {}
    return this;
  }

  /**
   * The date and time this client was last exercised.
   *
   * @return lastExercised
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_EXERCISED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getLastExercised() {
    return lastExercised;
  }

  public void setLastExercised(OffsetDateTime lastExercised) {
    this.lastExercised = lastExercised;
  }

  public OrgAuthorizedClientAttributes userCount(Long userCount) {
    this.userCount = userCount;
    return this;
  }

  /**
   * The number of users in the organization who have authorized this client.
   *
   * @return userCount
   */
  @JsonProperty(JSON_PROPERTY_USER_COUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getUserCount() {
    return userCount;
  }

  public void setUserCount(Long userCount) {
    this.userCount = userCount;
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
   * @return OrgAuthorizedClientAttributes
   */
  @JsonAnySetter
  public OrgAuthorizedClientAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OrgAuthorizedClientAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgAuthorizedClientAttributes orgAuthorizedClientAttributes = (OrgAuthorizedClientAttributes) o;
    return Objects.equals(this.disabled, orgAuthorizedClientAttributes.disabled)
        && Objects.equals(this.lastExercised, orgAuthorizedClientAttributes.lastExercised)
        && Objects.equals(this.userCount, orgAuthorizedClientAttributes.userCount)
        && Objects.equals(
            this.additionalProperties, orgAuthorizedClientAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, lastExercised, userCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgAuthorizedClientAttributes {\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    lastExercised: ").append(toIndentedString(lastExercised)).append("\n");
    sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
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
