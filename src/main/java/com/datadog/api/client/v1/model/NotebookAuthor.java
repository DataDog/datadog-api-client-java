/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of user object returned by the API. */
@JsonPropertyOrder({
  NotebookAuthor.JSON_PROPERTY_CREATED_AT,
  NotebookAuthor.JSON_PROPERTY_DISABLED,
  NotebookAuthor.JSON_PROPERTY_EMAIL,
  NotebookAuthor.JSON_PROPERTY_HANDLE,
  NotebookAuthor.JSON_PROPERTY_ICON,
  NotebookAuthor.JSON_PROPERTY_NAME,
  NotebookAuthor.JSON_PROPERTY_STATUS,
  NotebookAuthor.JSON_PROPERTY_TITLE,
  NotebookAuthor.JSON_PROPERTY_VERIFIED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class NotebookAuthor {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DISABLED = "disabled";
  private Boolean disabled;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_HANDLE = "handle";
  private String handle;

  public static final String JSON_PROPERTY_ICON = "icon";
  private String icon;

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_VERIFIED = "verified";
  private Boolean verified;

  public NotebookAuthor createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation time of the user.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public NotebookAuthor disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Whether the user is disabled.
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

  public NotebookAuthor email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email of the user.
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

  public NotebookAuthor handle(String handle) {
    this.handle = handle;
    return this;
  }

  /**
   * Handle of the user.
   *
   * @return handle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHandle() {
    return handle;
  }

  public void setHandle(String handle) {
    this.handle = handle;
  }

  public NotebookAuthor icon(String icon) {
    this.icon = icon;
    return this;
  }

  /**
   * URL of the user's icon.
   *
   * @return icon
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ICON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }

  public NotebookAuthor name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

  /**
   * Name of the user.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getName() {
    return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }

  public NotebookAuthor status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the user.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public NotebookAuthor title(String title) {
    this.title = JsonNullable.<String>of(title);
    return this;
  }

  /**
   * Title of the user.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getTitle() {
    return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(String title) {
    this.title = JsonNullable.<String>of(title);
  }

  public NotebookAuthor verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  /**
   * Whether the user is verified.
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
   * @return NotebookAuthor
   */
  @JsonAnySetter
  public NotebookAuthor putAdditionalProperty(String key, Object value) {
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

  /** Return true if this NotebookAuthor object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotebookAuthor notebookAuthor = (NotebookAuthor) o;
    return Objects.equals(this.createdAt, notebookAuthor.createdAt)
        && Objects.equals(this.disabled, notebookAuthor.disabled)
        && Objects.equals(this.email, notebookAuthor.email)
        && Objects.equals(this.handle, notebookAuthor.handle)
        && Objects.equals(this.icon, notebookAuthor.icon)
        && Objects.equals(this.name, notebookAuthor.name)
        && Objects.equals(this.status, notebookAuthor.status)
        && Objects.equals(this.title, notebookAuthor.title)
        && Objects.equals(this.verified, notebookAuthor.verified)
        && Objects.equals(this.additionalProperties, notebookAuthor.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        disabled,
        email,
        handle,
        icon,
        name,
        status,
        title,
        verified,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotebookAuthor {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    handle: ").append(toIndentedString(handle)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
