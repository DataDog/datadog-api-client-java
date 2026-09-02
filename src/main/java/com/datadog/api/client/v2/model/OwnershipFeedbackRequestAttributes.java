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
import org.openapitools.jackson.nullable.JsonNullable;

/** The attributes of an ownership feedback request. */
@JsonPropertyOrder({
  OwnershipFeedbackRequestAttributes.JSON_PROPERTY_ACTION,
  OwnershipFeedbackRequestAttributes.JSON_PROPERTY_ACTOR_HANDLE,
  OwnershipFeedbackRequestAttributes.JSON_PROPERTY_ACTOR_TYPE,
  OwnershipFeedbackRequestAttributes.JSON_PROPERTY_CORRECTED_OWNER_HANDLE,
  OwnershipFeedbackRequestAttributes.JSON_PROPERTY_CORRECTED_OWNER_TYPE,
  OwnershipFeedbackRequestAttributes.JSON_PROPERTY_INFERENCE_CHECKSUM,
  OwnershipFeedbackRequestAttributes.JSON_PROPERTY_REASON
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OwnershipFeedbackRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private OwnershipFeedbackAction action;

  public static final String JSON_PROPERTY_ACTOR_HANDLE = "actor_handle";
  private String actorHandle;

  public static final String JSON_PROPERTY_ACTOR_TYPE = "actor_type";
  private String actorType;

  public static final String JSON_PROPERTY_CORRECTED_OWNER_HANDLE = "corrected_owner_handle";
  private JsonNullable<String> correctedOwnerHandle = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CORRECTED_OWNER_TYPE = "corrected_owner_type";
  private JsonNullable<String> correctedOwnerType = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_INFERENCE_CHECKSUM = "inference_checksum";
  private String inferenceChecksum;

  public static final String JSON_PROPERTY_REASON = "reason";
  private JsonNullable<String> reason = JsonNullable.<String>undefined();

  public OwnershipFeedbackRequestAttributes() {}

  @JsonCreator
  public OwnershipFeedbackRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTION) OwnershipFeedbackAction action,
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTOR_HANDLE) String actorHandle,
      @JsonProperty(required = true, value = JSON_PROPERTY_ACTOR_TYPE) String actorType,
      @JsonProperty(required = true, value = JSON_PROPERTY_INFERENCE_CHECKSUM)
          String inferenceChecksum) {
    this.action = action;
    this.unparsed |= !action.isValid();
    this.actorHandle = actorHandle;
    this.actorType = actorType;
    this.inferenceChecksum = inferenceChecksum;
  }

  public OwnershipFeedbackRequestAttributes action(OwnershipFeedbackAction action) {
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

  public OwnershipFeedbackRequestAttributes actorHandle(String actorHandle) {
    this.actorHandle = actorHandle;
    return this;
  }

  /**
   * The handle of the actor submitting the feedback.
   *
   * @return actorHandle
   */
  @JsonProperty(JSON_PROPERTY_ACTOR_HANDLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getActorHandle() {
    return actorHandle;
  }

  public void setActorHandle(String actorHandle) {
    this.actorHandle = actorHandle;
  }

  public OwnershipFeedbackRequestAttributes actorType(String actorType) {
    this.actorType = actorType;
    return this;
  }

  /**
   * The type of actor submitting the feedback, for example <code>user</code> or <code>service
   * </code>.
   *
   * @return actorType
   */
  @JsonProperty(JSON_PROPERTY_ACTOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getActorType() {
    return actorType;
  }

  public void setActorType(String actorType) {
    this.actorType = actorType;
  }

  public OwnershipFeedbackRequestAttributes correctedOwnerHandle(String correctedOwnerHandle) {
    this.correctedOwnerHandle = JsonNullable.<String>of(correctedOwnerHandle);
    return this;
  }

  /**
   * The corrected owner handle. Required when <code>action</code> is <code>correct</code>.
   *
   * @return correctedOwnerHandle
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getCorrectedOwnerHandle() {
    return correctedOwnerHandle.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CORRECTED_OWNER_HANDLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCorrectedOwnerHandle_JsonNullable() {
    return correctedOwnerHandle;
  }

  @JsonProperty(JSON_PROPERTY_CORRECTED_OWNER_HANDLE)
  public void setCorrectedOwnerHandle_JsonNullable(JsonNullable<String> correctedOwnerHandle) {
    this.correctedOwnerHandle = correctedOwnerHandle;
  }

  public void setCorrectedOwnerHandle(String correctedOwnerHandle) {
    this.correctedOwnerHandle = JsonNullable.<String>of(correctedOwnerHandle);
  }

  public OwnershipFeedbackRequestAttributes correctedOwnerType(String correctedOwnerType) {
    this.correctedOwnerType = JsonNullable.<String>of(correctedOwnerType);
    return this;
  }

  /**
   * The corrected owner type. Required when <code>action</code> is <code>correct</code>.
   *
   * @return correctedOwnerType
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getCorrectedOwnerType() {
    return correctedOwnerType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CORRECTED_OWNER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCorrectedOwnerType_JsonNullable() {
    return correctedOwnerType;
  }

  @JsonProperty(JSON_PROPERTY_CORRECTED_OWNER_TYPE)
  public void setCorrectedOwnerType_JsonNullable(JsonNullable<String> correctedOwnerType) {
    this.correctedOwnerType = correctedOwnerType;
  }

  public void setCorrectedOwnerType(String correctedOwnerType) {
    this.correctedOwnerType = JsonNullable.<String>of(correctedOwnerType);
  }

  public OwnershipFeedbackRequestAttributes inferenceChecksum(String inferenceChecksum) {
    this.inferenceChecksum = inferenceChecksum;
    return this;
  }

  /**
   * The checksum of the inference being acted upon. Must match the current inference checksum or
   * the request returns a conflict.
   *
   * @return inferenceChecksum
   */
  @JsonProperty(JSON_PROPERTY_INFERENCE_CHECKSUM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getInferenceChecksum() {
    return inferenceChecksum;
  }

  public void setInferenceChecksum(String inferenceChecksum) {
    this.inferenceChecksum = inferenceChecksum;
  }

  public OwnershipFeedbackRequestAttributes reason(String reason) {
    this.reason = JsonNullable.<String>of(reason);
    return this;
  }

  /**
   * An optional free-form reason explaining the feedback.
   *
   * @return reason
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getReason() {
    return reason.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getReason_JsonNullable() {
    return reason;
  }

  @JsonProperty(JSON_PROPERTY_REASON)
  public void setReason_JsonNullable(JsonNullable<String> reason) {
    this.reason = reason;
  }

  public void setReason(String reason) {
    this.reason = JsonNullable.<String>of(reason);
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
   * @return OwnershipFeedbackRequestAttributes
   */
  @JsonAnySetter
  public OwnershipFeedbackRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this OwnershipFeedbackRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OwnershipFeedbackRequestAttributes ownershipFeedbackRequestAttributes =
        (OwnershipFeedbackRequestAttributes) o;
    return Objects.equals(this.action, ownershipFeedbackRequestAttributes.action)
        && Objects.equals(this.actorHandle, ownershipFeedbackRequestAttributes.actorHandle)
        && Objects.equals(this.actorType, ownershipFeedbackRequestAttributes.actorType)
        && Objects.equals(
            this.correctedOwnerHandle, ownershipFeedbackRequestAttributes.correctedOwnerHandle)
        && Objects.equals(
            this.correctedOwnerType, ownershipFeedbackRequestAttributes.correctedOwnerType)
        && Objects.equals(
            this.inferenceChecksum, ownershipFeedbackRequestAttributes.inferenceChecksum)
        && Objects.equals(this.reason, ownershipFeedbackRequestAttributes.reason)
        && Objects.equals(
            this.additionalProperties, ownershipFeedbackRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        action,
        actorHandle,
        actorType,
        correctedOwnerHandle,
        correctedOwnerType,
        inferenceChecksum,
        reason,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OwnershipFeedbackRequestAttributes {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actorHandle: ").append(toIndentedString(actorHandle)).append("\n");
    sb.append("    actorType: ").append(toIndentedString(actorType)).append("\n");
    sb.append("    correctedOwnerHandle: ")
        .append(toIndentedString(correctedOwnerHandle))
        .append("\n");
    sb.append("    correctedOwnerType: ").append(toIndentedString(correctedOwnerType)).append("\n");
    sb.append("    inferenceChecksum: ").append(toIndentedString(inferenceChecksum)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
