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
import org.openapitools.jackson.nullable.JsonNullable;

/** The attributes of an ownership feedback result. */
@JsonPropertyOrder({
  OwnershipFeedbackResultAttributes.JSON_PROPERTY_ACTION,
  OwnershipFeedbackResultAttributes.JSON_PROPERTY_CHECKSUM,
  OwnershipFeedbackResultAttributes.JSON_PROPERTY_NEW_STATUS,
  OwnershipFeedbackResultAttributes.JSON_PROPERTY_OWNER_TYPE,
  OwnershipFeedbackResultAttributes.JSON_PROPERTY_PREVIOUS_STATUS,
  OwnershipFeedbackResultAttributes.JSON_PROPERTY_PRIMARY_CONTACT_REF,
  OwnershipFeedbackResultAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OwnershipFeedbackResultAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private OwnershipFeedbackAction action;

  public static final String JSON_PROPERTY_CHECKSUM = "checksum";
  private String checksum;

  public static final String JSON_PROPERTY_NEW_STATUS = "new_status";
  private OwnershipInferenceStatus newStatus;

  public static final String JSON_PROPERTY_OWNER_TYPE = "owner_type";
  private OwnershipOwnerType ownerType;

  public static final String JSON_PROPERTY_PREVIOUS_STATUS = "previous_status";
  private OwnershipInferenceStatus previousStatus;

  public static final String JSON_PROPERTY_PRIMARY_CONTACT_REF = "primary_contact_ref";
  private JsonNullable<String> primaryContactRef = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public OwnershipFeedbackResultAttributes() {}

  @JsonCreator
  public OwnershipFeedbackResultAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION) OwnershipFeedbackAction action,
      @JsonProperty(required = true, value = JSON_PROPERTY_CHECKSUM) String checksum,
      @JsonProperty(required = true, value = JSON_PROPERTY_NEW_STATUS)
          OwnershipInferenceStatus newStatus,
      @JsonProperty(required = true, value = JSON_PROPERTY_OWNER_TYPE) OwnershipOwnerType ownerType,
      @JsonProperty(required = true, value = JSON_PROPERTY_PREVIOUS_STATUS)
          OwnershipInferenceStatus previousStatus,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.action = action;
    this.unparsed |= !action.isValid();
    this.checksum = checksum;
    this.newStatus = newStatus;
    this.unparsed |= !newStatus.isValid();
    this.ownerType = ownerType;
    this.unparsed |= !ownerType.isValid();
    this.previousStatus = previousStatus;
    this.unparsed |= !previousStatus.isValid();
    this.updatedAt = updatedAt;
  }

  public OwnershipFeedbackResultAttributes action(OwnershipFeedbackAction action) {
    this.action = action;
    this.unparsed |= !action.isValid();
    return this;
  }

  /**
   * The feedback action to apply to an inference.
   *
   * @return action
   */
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OwnershipFeedbackAction getAction() {
    return action;
  }

  public void setAction(OwnershipFeedbackAction action) {
    if (!action.isValid()) {
      this.unparsed = true;
    }
    this.action = action;
  }

  public OwnershipFeedbackResultAttributes checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * The checksum of the inference after the feedback was applied.
   *
   * @return checksum
   */
  @JsonProperty(JSON_PROPERTY_CHECKSUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  public OwnershipFeedbackResultAttributes newStatus(OwnershipInferenceStatus newStatus) {
    this.newStatus = newStatus;
    this.unparsed |= !newStatus.isValid();
    return this;
  }

  /**
   * The lifecycle status of an ownership inference.
   *
   * @return newStatus
   */
  @JsonProperty(JSON_PROPERTY_NEW_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OwnershipInferenceStatus getNewStatus() {
    return newStatus;
  }

  public void setNewStatus(OwnershipInferenceStatus newStatus) {
    if (!newStatus.isValid()) {
      this.unparsed = true;
    }
    this.newStatus = newStatus;
  }

  public OwnershipFeedbackResultAttributes ownerType(OwnershipOwnerType ownerType) {
    this.ownerType = ownerType;
    this.unparsed |= !ownerType.isValid();
    return this;
  }

  /**
   * The owner type for an ownership inference.
   *
   * @return ownerType
   */
  @JsonProperty(JSON_PROPERTY_OWNER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OwnershipOwnerType getOwnerType() {
    return ownerType;
  }

  public void setOwnerType(OwnershipOwnerType ownerType) {
    if (!ownerType.isValid()) {
      this.unparsed = true;
    }
    this.ownerType = ownerType;
  }

  public OwnershipFeedbackResultAttributes previousStatus(OwnershipInferenceStatus previousStatus) {
    this.previousStatus = previousStatus;
    this.unparsed |= !previousStatus.isValid();
    return this;
  }

  /**
   * The lifecycle status of an ownership inference.
   *
   * @return previousStatus
   */
  @JsonProperty(JSON_PROPERTY_PREVIOUS_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OwnershipInferenceStatus getPreviousStatus() {
    return previousStatus;
  }

  public void setPreviousStatus(OwnershipInferenceStatus previousStatus) {
    if (!previousStatus.isValid()) {
      this.unparsed = true;
    }
    this.previousStatus = previousStatus;
  }

  public OwnershipFeedbackResultAttributes primaryContactRef(String primaryContactRef) {
    this.primaryContactRef = JsonNullable.<String>of(primaryContactRef);
    return this;
  }

  /**
   * The primary contact reference for the inferred owner after the feedback was applied, formatted
   * as <code>ref:handle/&lt;owner_handle&gt;</code>.
   *
   * @return primaryContactRef
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getPrimaryContactRef() {
    return primaryContactRef.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_CONTACT_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getPrimaryContactRef_JsonNullable() {
    return primaryContactRef;
  }

  @JsonProperty(JSON_PROPERTY_PRIMARY_CONTACT_REF)
  public void setPrimaryContactRef_JsonNullable(JsonNullable<String> primaryContactRef) {
    this.primaryContactRef = primaryContactRef;
  }

  public void setPrimaryContactRef(String primaryContactRef) {
    this.primaryContactRef = JsonNullable.<String>of(primaryContactRef);
  }

  public OwnershipFeedbackResultAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The time when the inference was updated by the feedback.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
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
   * @return OwnershipFeedbackResultAttributes
   */
  @JsonAnySetter
  public OwnershipFeedbackResultAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OwnershipFeedbackResultAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnershipFeedbackResultAttributes ownershipFeedbackResultAttributes =
        (OwnershipFeedbackResultAttributes) o;
    return Objects.equals(this.action, ownershipFeedbackResultAttributes.action)
        && Objects.equals(this.checksum, ownershipFeedbackResultAttributes.checksum)
        && Objects.equals(this.newStatus, ownershipFeedbackResultAttributes.newStatus)
        && Objects.equals(this.ownerType, ownershipFeedbackResultAttributes.ownerType)
        && Objects.equals(this.previousStatus, ownershipFeedbackResultAttributes.previousStatus)
        && Objects.equals(
            this.primaryContactRef, ownershipFeedbackResultAttributes.primaryContactRef)
        && Objects.equals(this.updatedAt, ownershipFeedbackResultAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties, ownershipFeedbackResultAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        action,
        checksum,
        newStatus,
        ownerType,
        previousStatus,
        primaryContactRef,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnershipFeedbackResultAttributes {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    newStatus: ").append(toIndentedString(newStatus)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    previousStatus: ").append(toIndentedString(previousStatus)).append("\n");
    sb.append("    primaryContactRef: ").append(toIndentedString(primaryContactRef)).append("\n");
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
