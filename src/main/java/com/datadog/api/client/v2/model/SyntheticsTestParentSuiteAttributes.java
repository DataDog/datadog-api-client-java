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

/** Object containing details about a parent suite of a Synthetic test. */
@JsonPropertyOrder({
  SyntheticsTestParentSuiteAttributes.JSON_PROPERTY_CHILD_NAME,
  SyntheticsTestParentSuiteAttributes.JSON_PROPERTY_CHILD_PUBLIC_ID,
  SyntheticsTestParentSuiteAttributes.JSON_PROPERTY_MONITOR_ID,
  SyntheticsTestParentSuiteAttributes.JSON_PROPERTY_NAME,
  SyntheticsTestParentSuiteAttributes.JSON_PROPERTY_OVERALL_STATE,
  SyntheticsTestParentSuiteAttributes.JSON_PROPERTY_OVERALL_STATE_MODIFIED,
  SyntheticsTestParentSuiteAttributes.JSON_PROPERTY_PUBLIC_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestParentSuiteAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHILD_NAME = "child_name";
  private String childName;

  public static final String JSON_PROPERTY_CHILD_PUBLIC_ID = "child_public_id";
  private String childPublicId;

  public static final String JSON_PROPERTY_MONITOR_ID = "monitor_id";
  private Long monitorId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OVERALL_STATE = "overall_state";
  private Long overallState;

  public static final String JSON_PROPERTY_OVERALL_STATE_MODIFIED = "overall_state_modified";
  private String overallStateModified;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public SyntheticsTestParentSuiteAttributes childName(String childName) {
    this.childName = childName;
    return this;
  }

  /**
   * The name of the child test within the suite.
   *
   * @return childName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHILD_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChildName() {
    return childName;
  }

  public void setChildName(String childName) {
    this.childName = childName;
  }

  public SyntheticsTestParentSuiteAttributes childPublicId(String childPublicId) {
    this.childPublicId = childPublicId;
    return this;
  }

  /**
   * The public ID of the child test within the suite.
   *
   * @return childPublicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHILD_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChildPublicId() {
    return childPublicId;
  }

  public void setChildPublicId(String childPublicId) {
    this.childPublicId = childPublicId;
  }

  public SyntheticsTestParentSuiteAttributes monitorId(Long monitorId) {
    this.monitorId = monitorId;
    return this;
  }

  /**
   * The associated monitor ID.
   *
   * @return monitorId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MONITOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getMonitorId() {
    return monitorId;
  }

  public void setMonitorId(Long monitorId) {
    this.monitorId = monitorId;
  }

  public SyntheticsTestParentSuiteAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the parent suite.
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

  public SyntheticsTestParentSuiteAttributes overallState(Long overallState) {
    this.overallState = overallState;
    return this;
  }

  /**
   * The overall state of the parent suite.
   *
   * @return overallState
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERALL_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getOverallState() {
    return overallState;
  }

  public void setOverallState(Long overallState) {
    this.overallState = overallState;
  }

  public SyntheticsTestParentSuiteAttributes overallStateModified(String overallStateModified) {
    this.overallStateModified = overallStateModified;
    return this;
  }

  /**
   * Timestamp of when the overall state was last modified.
   *
   * @return overallStateModified
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERALL_STATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOverallStateModified() {
    return overallStateModified;
  }

  public void setOverallStateModified(String overallStateModified) {
    this.overallStateModified = overallStateModified;
  }

  public SyntheticsTestParentSuiteAttributes publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * The public ID of the parent suite.
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
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
   * @return SyntheticsTestParentSuiteAttributes
   */
  @JsonAnySetter
  public SyntheticsTestParentSuiteAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestParentSuiteAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestParentSuiteAttributes syntheticsTestParentSuiteAttributes =
        (SyntheticsTestParentSuiteAttributes) o;
    return Objects.equals(this.childName, syntheticsTestParentSuiteAttributes.childName)
        && Objects.equals(this.childPublicId, syntheticsTestParentSuiteAttributes.childPublicId)
        && Objects.equals(this.monitorId, syntheticsTestParentSuiteAttributes.monitorId)
        && Objects.equals(this.name, syntheticsTestParentSuiteAttributes.name)
        && Objects.equals(this.overallState, syntheticsTestParentSuiteAttributes.overallState)
        && Objects.equals(
            this.overallStateModified, syntheticsTestParentSuiteAttributes.overallStateModified)
        && Objects.equals(this.publicId, syntheticsTestParentSuiteAttributes.publicId)
        && Objects.equals(
            this.additionalProperties, syntheticsTestParentSuiteAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        childName,
        childPublicId,
        monitorId,
        name,
        overallState,
        overallStateModified,
        publicId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestParentSuiteAttributes {\n");
    sb.append("    childName: ").append(toIndentedString(childName)).append("\n");
    sb.append("    childPublicId: ").append(toIndentedString(childPublicId)).append("\n");
    sb.append("    monitorId: ").append(toIndentedString(monitorId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    overallState: ").append(toIndentedString(overallState)).append("\n");
    sb.append("    overallStateModified: ")
        .append(toIndentedString(overallStateModified))
        .append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
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
