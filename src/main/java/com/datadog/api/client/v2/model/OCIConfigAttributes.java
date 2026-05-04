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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes for an OCI config. */
@JsonPropertyOrder({
  OCIConfigAttributes.JSON_PROPERTY_ACCOUNT_ID,
  OCIConfigAttributes.JSON_PROPERTY_CREATED_AT,
  OCIConfigAttributes.JSON_PROPERTY_ERROR_MESSAGES,
  OCIConfigAttributes.JSON_PROPERTY_STATUS,
  OCIConfigAttributes.JSON_PROPERTY_STATUS_UPDATED_AT,
  OCIConfigAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OCIConfigAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_ERROR_MESSAGES = "error_messages";
  private JsonNullable<List<String>> errorMessages = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_STATUS_UPDATED_AT = "status_updated_at";
  private String statusUpdatedAt;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public OCIConfigAttributes() {}

  @JsonCreator
  public OCIConfigAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCOUNT_ID) String accountId,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) String createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS) String status,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS_UPDATED_AT)
          String statusUpdatedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) String updatedAt) {
    this.accountId = accountId;
    this.createdAt = createdAt;
    this.status = status;
    this.statusUpdatedAt = statusUpdatedAt;
    this.updatedAt = updatedAt;
  }

  public OCIConfigAttributes accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * The OCID of the OCI tenancy.
   *
   * @return accountId
   */
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public OCIConfigAttributes createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the OCI config was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public OCIConfigAttributes errorMessages(List<String> errorMessages) {
    this.errorMessages = JsonNullable.<List<String>>of(errorMessages);
    return this;
  }

  public OCIConfigAttributes addErrorMessagesItem(String errorMessagesItem) {
    if (this.errorMessages == null || !this.errorMessages.isPresent()) {
      this.errorMessages = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.errorMessages.get().add(errorMessagesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * The error messages for the OCI config.
   *
   * @return errorMessages
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getErrorMessages() {
    return errorMessages.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getErrorMessages_JsonNullable() {
    return errorMessages;
  }

  @JsonProperty(JSON_PROPERTY_ERROR_MESSAGES)
  public void setErrorMessages_JsonNullable(JsonNullable<List<String>> errorMessages) {
    this.errorMessages = errorMessages;
  }

  public void setErrorMessages(List<String> errorMessages) {
    this.errorMessages = JsonNullable.<List<String>>of(errorMessages);
  }

  public OCIConfigAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the OCI config.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public OCIConfigAttributes statusUpdatedAt(String statusUpdatedAt) {
    this.statusUpdatedAt = statusUpdatedAt;
    return this;
  }

  /**
   * The timestamp when the OCI config status was last updated.
   *
   * @return statusUpdatedAt
   */
  @JsonProperty(JSON_PROPERTY_STATUS_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getStatusUpdatedAt() {
    return statusUpdatedAt;
  }

  public void setStatusUpdatedAt(String statusUpdatedAt) {
    this.statusUpdatedAt = statusUpdatedAt;
  }

  public OCIConfigAttributes updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The timestamp when the OCI config was last updated.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return OCIConfigAttributes
   */
  @JsonAnySetter
  public OCIConfigAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OCIConfigAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OCIConfigAttributes ociConfigAttributes = (OCIConfigAttributes) o;
    return Objects.equals(this.accountId, ociConfigAttributes.accountId)
        && Objects.equals(this.createdAt, ociConfigAttributes.createdAt)
        && Objects.equals(this.errorMessages, ociConfigAttributes.errorMessages)
        && Objects.equals(this.status, ociConfigAttributes.status)
        && Objects.equals(this.statusUpdatedAt, ociConfigAttributes.statusUpdatedAt)
        && Objects.equals(this.updatedAt, ociConfigAttributes.updatedAt)
        && Objects.equals(this.additionalProperties, ociConfigAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        createdAt,
        errorMessages,
        status,
        statusUpdatedAt,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OCIConfigAttributes {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    errorMessages: ").append(toIndentedString(errorMessages)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusUpdatedAt: ").append(toIndentedString(statusUpdatedAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
