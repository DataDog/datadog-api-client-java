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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Parsed stack trace of the error. Only the sample picked by the <code>git_metadata</code> bias has
 * frames.
 */
@JsonPropertyOrder({
  IssueSampleErrorStack.JSON_PROPERTY_FRAMES,
  IssueSampleErrorStack.JSON_PROPERTY_LANGUAGE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IssueSampleErrorStack {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FRAMES = "frames";
  private List<IssueSampleStackFrame> frames = null;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public IssueSampleErrorStack frames(List<IssueSampleStackFrame> frames) {
    this.frames = frames;
    if (frames != null) {
      for (IssueSampleStackFrame item : frames) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public IssueSampleErrorStack addFramesItem(IssueSampleStackFrame framesItem) {
    if (this.frames == null) {
      this.frames = new ArrayList<>();
    }
    this.frames.add(framesItem);
    this.unparsed |= framesItem.unparsed;
    return this;
  }

  /**
   * Stack frames, from the top of the stack.
   *
   * @return frames
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FRAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IssueSampleStackFrame> getFrames() {
    return frames;
  }

  public void setFrames(List<IssueSampleStackFrame> frames) {
    this.frames = frames;
    if (frames != null) {
      for (IssueSampleStackFrame item : frames) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public IssueSampleErrorStack language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Programming language used to parse the stack trace.
   *
   * @return language
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
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
   * @return IssueSampleErrorStack
   */
  @JsonAnySetter
  public IssueSampleErrorStack putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IssueSampleErrorStack object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IssueSampleErrorStack issueSampleErrorStack = (IssueSampleErrorStack) o;
    return Objects.equals(this.frames, issueSampleErrorStack.frames)
        && Objects.equals(this.language, issueSampleErrorStack.language)
        && Objects.equals(this.additionalProperties, issueSampleErrorStack.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frames, language, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IssueSampleErrorStack {\n");
    sb.append("    frames: ").append(toIndentedString(frames)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
