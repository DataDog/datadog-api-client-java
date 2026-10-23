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

/** A stack frame. */
@JsonPropertyOrder({
  IssueSampleStackFrame.JSON_PROPERTY_CODE_SNIPPET,
  IssueSampleStackFrame.JSON_PROPERTY_GIT_FILE_LOCATION,
  IssueSampleStackFrame.JSON_PROPERTY_TEXT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssueSampleStackFrame {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODE_SNIPPET = "code_snippet";
  private IssueSampleCodeSnippet codeSnippet;

  public static final String JSON_PROPERTY_GIT_FILE_LOCATION = "git_file_location";
  private IssueSampleGitFileLocation gitFileLocation;

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public IssueSampleStackFrame codeSnippet(IssueSampleCodeSnippet codeSnippet) {
    this.codeSnippet = codeSnippet;
    this.unparsed |= codeSnippet.unparsed;
    return this;
  }

  /**
   * Source code around a stack frame. Empty when the source code is unavailable.
   *
   * @return codeSnippet
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE_SNIPPET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IssueSampleCodeSnippet getCodeSnippet() {
    return codeSnippet;
  }

  public void setCodeSnippet(IssueSampleCodeSnippet codeSnippet) {
    this.codeSnippet = codeSnippet;
    if (codeSnippet != null) {
      this.unparsed |= codeSnippet.unparsed;
    }
  }

  public IssueSampleStackFrame gitFileLocation(IssueSampleGitFileLocation gitFileLocation) {
    this.gitFileLocation = gitFileLocation;
    this.unparsed |= gitFileLocation.unparsed;
    return this;
  }

  /**
   * Location of a stack frame in a repository file. Empty when the source code is unavailable.
   *
   * @return gitFileLocation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GIT_FILE_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IssueSampleGitFileLocation getGitFileLocation() {
    return gitFileLocation;
  }

  public void setGitFileLocation(IssueSampleGitFileLocation gitFileLocation) {
    this.gitFileLocation = gitFileLocation;
    if (gitFileLocation != null) {
      this.unparsed |= gitFileLocation.unparsed;
    }
  }

  public IssueSampleStackFrame text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Text of the frame, as it appears in the stack trace.
   *
   * @return text
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
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
   * @return IssueSampleStackFrame
   */
  @JsonAnySetter
  public IssueSampleStackFrame putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IssueSampleStackFrame object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueSampleStackFrame issueSampleStackFrame = (IssueSampleStackFrame) o;
    return Objects.equals(this.codeSnippet, issueSampleStackFrame.codeSnippet)
        && Objects.equals(this.gitFileLocation, issueSampleStackFrame.gitFileLocation)
        && Objects.equals(this.text, issueSampleStackFrame.text)
        && Objects.equals(this.additionalProperties, issueSampleStackFrame.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codeSnippet, gitFileLocation, text, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueSampleStackFrame {\n");
    sb.append("    codeSnippet: ").append(toIndentedString(codeSnippet)).append("\n");
    sb.append("    gitFileLocation: ").append(toIndentedString(gitFileLocation)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
