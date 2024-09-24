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

/** The definition of <code>UserOrgsSerializableAttributes</code> object. */
@JsonPropertyOrder({
  UserOrgsSerializableAttributes.JSON_PROPERTY_DISABLED,
  UserOrgsSerializableAttributes.JSON_PROPERTY_EMAIL,
  UserOrgsSerializableAttributes.JSON_PROPERTY_NAME,
  UserOrgsSerializableAttributes.JSON_PROPERTY_ORG_ID,
  UserOrgsSerializableAttributes.JSON_PROPERTY_TITLE,
  UserOrgsSerializableAttributes.JSON_PROPERTY_VERIFIED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UserOrgsSerializableAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private String orgId;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_VERIFIED = "verified";
  private Boolean verified;

  public UserOrgsSerializableAttributes disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * The <code>UserOrgsSerializableAttributes</code> <code>disabled</code>.
   *
   * @return disabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public UserOrgsSerializableAttributes email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The <code>UserOrgsSerializableAttributes</code> <code>email</code>.
   *
   * @return email
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public UserOrgsSerializableAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The <code>UserOrgsSerializableAttributes</code> <code>name</code>.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UserOrgsSerializableAttributes orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * The <code>UserOrgsSerializableAttributes</code> <code>org_id</code>.
   *
   * @return orgId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public UserOrgsSerializableAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The <code>UserOrgsSerializableAttributes</code> <code>title</code>.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public UserOrgsSerializableAttributes verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  /**
   * The <code>UserOrgsSerializableAttributes</code> <code>verified</code>.
   *
   * @return verified
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
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
   * @return UserOrgsSerializableAttributes
   */
  @JsonAnySetter
  public UserOrgsSerializableAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UserOrgsSerializableAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserOrgsSerializableAttributes userOrgsSerializableAttributes =
        (UserOrgsSerializableAttributes) o;
    return Objects.equals(this.disabled, userOrgsSerializableAttributes.disabled)
        && Objects.equals(this.email, userOrgsSerializableAttributes.email)
        && Objects.equals(this.name, userOrgsSerializableAttributes.name)
        && Objects.equals(this.orgId, userOrgsSerializableAttributes.orgId)
        && Objects.equals(this.title, userOrgsSerializableAttributes.title)
        && Objects.equals(this.verified, userOrgsSerializableAttributes.verified)
        && Objects.equals(
            this.additionalProperties, userOrgsSerializableAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disabled, email, name, orgId, title, verified, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserOrgsSerializableAttributes {\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
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
