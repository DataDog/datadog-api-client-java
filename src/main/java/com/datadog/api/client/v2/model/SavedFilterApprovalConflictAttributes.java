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

/**
 * One or more feature flags that reference this saved filter require approval for the rule update.
 */
@JsonPropertyOrder({
  SavedFilterApprovalConflictAttributes.JSON_PROPERTY_APPROVAL_REQUIRED_FLAGS,
  SavedFilterApprovalConflictAttributes.JSON_PROPERTY_MESSAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SavedFilterApprovalConflictAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_APPROVAL_REQUIRED_FLAGS = "approval_required_flags";
  private List<SavedFilterFlagReference> approvalRequiredFlags = new ArrayList<>();

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public SavedFilterApprovalConflictAttributes() {}

  @JsonCreator
  public SavedFilterApprovalConflictAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_APPROVAL_REQUIRED_FLAGS)
          List<SavedFilterFlagReference> approvalRequiredFlags,
      @JsonProperty(required = true, value = JSON_PROPERTY_MESSAGE) String message) {
    this.approvalRequiredFlags = approvalRequiredFlags;
    for (SavedFilterFlagReference item : approvalRequiredFlags) {
      this.unparsed |= item.unparsed;
    }
    this.message = message;
  }

  public SavedFilterApprovalConflictAttributes approvalRequiredFlags(
      List<SavedFilterFlagReference> approvalRequiredFlags) {
    this.approvalRequiredFlags = approvalRequiredFlags;
    for (SavedFilterFlagReference item : approvalRequiredFlags) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SavedFilterApprovalConflictAttributes addApprovalRequiredFlagsItem(
      SavedFilterFlagReference approvalRequiredFlagsItem) {
    this.approvalRequiredFlags.add(approvalRequiredFlagsItem);
    this.unparsed |= approvalRequiredFlagsItem.unparsed;
    return this;
  }

  /**
   * Feature flags preventing this update.
   *
   * @return approvalRequiredFlags
   */
  @JsonProperty(JSON_PROPERTY_APPROVAL_REQUIRED_FLAGS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SavedFilterFlagReference> getApprovalRequiredFlags() {
    return approvalRequiredFlags;
  }

  public void setApprovalRequiredFlags(List<SavedFilterFlagReference> approvalRequiredFlags) {
    this.approvalRequiredFlags = approvalRequiredFlags;
    if (approvalRequiredFlags != null) {
      for (SavedFilterFlagReference item : approvalRequiredFlags) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SavedFilterApprovalConflictAttributes message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The reason the saved filter update was rejected.
   *
   * @return message
   */
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
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
   * @return SavedFilterApprovalConflictAttributes
   */
  @JsonAnySetter
  public SavedFilterApprovalConflictAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SavedFilterApprovalConflictAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SavedFilterApprovalConflictAttributes savedFilterApprovalConflictAttributes =
        (SavedFilterApprovalConflictAttributes) o;
    return Objects.equals(
            this.approvalRequiredFlags, savedFilterApprovalConflictAttributes.approvalRequiredFlags)
        && Objects.equals(this.message, savedFilterApprovalConflictAttributes.message)
        && Objects.equals(
            this.additionalProperties, savedFilterApprovalConflictAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approvalRequiredFlags, message, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SavedFilterApprovalConflictAttributes {\n");
    sb.append("    approvalRequiredFlags: ")
        .append(toIndentedString(approvalRequiredFlags))
        .append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
