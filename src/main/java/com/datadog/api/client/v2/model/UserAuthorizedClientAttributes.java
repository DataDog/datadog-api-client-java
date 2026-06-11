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

/** Attributes of a user authorized client. */
@JsonPropertyOrder({
  UserAuthorizedClientAttributes.JSON_PROPERTY_CREATED_AT,
  UserAuthorizedClientAttributes.JSON_PROPERTY_DISABLED,
  UserAuthorizedClientAttributes.JSON_PROPERTY_LAST_EXERCISED,
  UserAuthorizedClientAttributes.JSON_PROPERTY_MODIFIED_AT,
  UserAuthorizedClientAttributes.JSON_PROPERTY_ORG_DISABLED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserAuthorizedClientAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_LAST_EXERCISED = "last_exercised";
  private OffsetDateTime lastExercised;

  public static final String JSON_PROPERTY_MODIFIED_AT = "modified_at";
  private OffsetDateTime modifiedAt;

  public static final String JSON_PROPERTY_ORG_DISABLED = "org_disabled";
  private Boolean orgDisabled;

  public UserAuthorizedClientAttributes() {}

  @JsonCreator
  public UserAuthorizedClientAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DISABLED) Boolean disabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_EXERCISED)
          OffsetDateTime lastExercised,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED_AT) OffsetDateTime modifiedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_DISABLED) Boolean orgDisabled) {
    this.createdAt = createdAt;
    this.disabled = disabled;
    this.lastExercised = lastExercised;
    if (lastExercised != null) {}
    this.modifiedAt = modifiedAt;
    this.orgDisabled = orgDisabled;
  }

  public UserAuthorizedClientAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The date and time this authorization was created.
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

  public UserAuthorizedClientAttributes disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Whether the user has disabled this authorization.
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

  public UserAuthorizedClientAttributes lastExercised(OffsetDateTime lastExercised) {
    this.lastExercised = lastExercised;
    if (lastExercised != null) {}
    return this;
  }

  /**
   * The date and time this authorization was last exercised.
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

  public UserAuthorizedClientAttributes modifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
    return this;
  }

  /**
   * The date and time this authorization was last modified.
   *
   * @return modifiedAt
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModifiedAt() {
    return modifiedAt;
  }

  public void setModifiedAt(OffsetDateTime modifiedAt) {
    this.modifiedAt = modifiedAt;
  }

  public UserAuthorizedClientAttributes orgDisabled(Boolean orgDisabled) {
    this.orgDisabled = orgDisabled;
    return this;
  }

  /**
   * Whether the organization has disabled this authorization.
   *
   * @return orgDisabled
   */
  @JsonProperty(JSON_PROPERTY_ORG_DISABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getOrgDisabled() {
    return orgDisabled;
  }

  public void setOrgDisabled(Boolean orgDisabled) {
    this.orgDisabled = orgDisabled;
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
   * @return UserAuthorizedClientAttributes
   */
  @JsonAnySetter
  public UserAuthorizedClientAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UserAuthorizedClientAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAuthorizedClientAttributes userAuthorizedClientAttributes =
        (UserAuthorizedClientAttributes) o;
    return Objects.equals(this.createdAt, userAuthorizedClientAttributes.createdAt)
        && Objects.equals(this.disabled, userAuthorizedClientAttributes.disabled)
        && Objects.equals(this.lastExercised, userAuthorizedClientAttributes.lastExercised)
        && Objects.equals(this.modifiedAt, userAuthorizedClientAttributes.modifiedAt)
        && Objects.equals(this.orgDisabled, userAuthorizedClientAttributes.orgDisabled)
        && Objects.equals(
            this.additionalProperties, userAuthorizedClientAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt, disabled, lastExercised, modifiedAt, orgDisabled, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAuthorizedClientAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    lastExercised: ").append(toIndentedString(lastExercised)).append("\n");
    sb.append("    modifiedAt: ").append(toIndentedString(modifiedAt)).append("\n");
    sb.append("    orgDisabled: ").append(toIndentedString(orgDisabled)).append("\n");
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
