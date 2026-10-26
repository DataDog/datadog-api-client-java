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

/** Source code location of a stack frame. */
@JsonPropertyOrder({
  IssueSampleFrameLink.JSON_PROPERTY_CODE_LOCATION,
  IssueSampleFrameLink.JSON_PROPERTY_FRAME_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssueSampleFrameLink {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODE_LOCATION = "code_location";
  private IssueSampleGitFileLocation codeLocation;

  public static final String JSON_PROPERTY_FRAME_ID = "frame_id";
  private Long frameId;

  public IssueSampleFrameLink() {}

  @JsonCreator
  public IssueSampleFrameLink(
      @JsonProperty(required = true, value = JSON_PROPERTY_CODE_LOCATION)
          IssueSampleGitFileLocation codeLocation,
      @JsonProperty(required = true, value = JSON_PROPERTY_FRAME_ID) Long frameId) {
    this.codeLocation = codeLocation;
    this.unparsed |= codeLocation.unparsed;
    this.frameId = frameId;
  }

  public IssueSampleFrameLink codeLocation(IssueSampleGitFileLocation codeLocation) {
    this.codeLocation = codeLocation;
    this.unparsed |= codeLocation.unparsed;
    return this;
  }

  /**
   * Location of a stack frame in a repository file. Empty when the source code is unavailable.
   *
   * @return codeLocation
   */
  @JsonProperty(JSON_PROPERTY_CODE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IssueSampleGitFileLocation getCodeLocation() {
    return codeLocation;
  }

  public void setCodeLocation(IssueSampleGitFileLocation codeLocation) {
    this.codeLocation = codeLocation;
    if (codeLocation != null) {
      this.unparsed |= codeLocation.unparsed;
    }
  }

  public IssueSampleFrameLink frameId(Long frameId) {
    this.frameId = frameId;
    return this;
  }

  /**
   * Index of the frame in the stack trace, starting at 0.
   *
   * @return frameId
   */
  @JsonProperty(JSON_PROPERTY_FRAME_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFrameId() {
    return frameId;
  }

  public void setFrameId(Long frameId) {
    this.frameId = frameId;
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
   * @return IssueSampleFrameLink
   */
  @JsonAnySetter
  public IssueSampleFrameLink putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IssueSampleFrameLink object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueSampleFrameLink issueSampleFrameLink = (IssueSampleFrameLink) o;
    return Objects.equals(this.codeLocation, issueSampleFrameLink.codeLocation)
        && Objects.equals(this.frameId, issueSampleFrameLink.frameId)
        && Objects.equals(this.additionalProperties, issueSampleFrameLink.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeLocation, frameId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueSampleFrameLink {\n");
    sb.append("    codeLocation: ").append(toIndentedString(codeLocation)).append("\n");
    sb.append("    frameId: ").append(toIndentedString(frameId)).append("\n");
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
