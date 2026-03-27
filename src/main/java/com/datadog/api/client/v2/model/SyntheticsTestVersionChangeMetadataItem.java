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

/** Object describing a single change within a version. */
@JsonPropertyOrder({
  SyntheticsTestVersionChangeMetadataItem.JSON_PROPERTY_ACTION,
  SyntheticsTestVersionChangeMetadataItem.JSON_PROPERTY_ACTION_METADATA
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestVersionChangeMetadataItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACTION = "action";
  private String action;

  public static final String JSON_PROPERTY_ACTION_METADATA = "action_metadata";
  private SyntheticsTestVersionActionMetadata actionMetadata;

  public SyntheticsTestVersionChangeMetadataItem action(String action) {
    this.action = action;
    return this;
  }

  /**
   * The action that was performed (for example, <code>updated</code> or <code>created</code>).
   *
   * @return action
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public SyntheticsTestVersionChangeMetadataItem actionMetadata(
      SyntheticsTestVersionActionMetadata actionMetadata) {
    this.actionMetadata = actionMetadata;
    this.unparsed |= actionMetadata.unparsed;
    return this;
  }

  /**
   * Object containing metadata about a change action.
   *
   * @return actionMetadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTION_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestVersionActionMetadata getActionMetadata() {
    return actionMetadata;
  }

  public void setActionMetadata(SyntheticsTestVersionActionMetadata actionMetadata) {
    this.actionMetadata = actionMetadata;
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
   * @return SyntheticsTestVersionChangeMetadataItem
   */
  @JsonAnySetter
  public SyntheticsTestVersionChangeMetadataItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestVersionChangeMetadataItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestVersionChangeMetadataItem syntheticsTestVersionChangeMetadataItem =
        (SyntheticsTestVersionChangeMetadataItem) o;
    return Objects.equals(this.action, syntheticsTestVersionChangeMetadataItem.action)
        && Objects.equals(
            this.actionMetadata, syntheticsTestVersionChangeMetadataItem.actionMetadata)
        && Objects.equals(
            this.additionalProperties,
            syntheticsTestVersionChangeMetadataItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, actionMetadata, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestVersionChangeMetadataItem {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actionMetadata: ").append(toIndentedString(actionMetadata)).append("\n");
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
