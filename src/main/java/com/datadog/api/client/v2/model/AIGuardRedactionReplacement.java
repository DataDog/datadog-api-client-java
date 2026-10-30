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

/** The fully redacted content for one path in the request. */
@JsonPropertyOrder({
  AIGuardRedactionReplacement.JSON_PROPERTY_PATH,
  AIGuardRedactionReplacement.JSON_PROPERTY_REPLACEMENT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AIGuardRedactionReplacement {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_PATH = "path";
  private String path;

  public static final String JSON_PROPERTY_REPLACEMENT = "replacement";
  private String replacement;

  public AIGuardRedactionReplacement() {}

  @JsonCreator
  public AIGuardRedactionReplacement(
      @JsonProperty(required = true, value = JSON_PROPERTY_PATH) String path,
      @JsonProperty(required = true, value = JSON_PROPERTY_REPLACEMENT) String replacement) {
    this.path = path;
    this.replacement = replacement;
  }

  public AIGuardRedactionReplacement path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The path of the redacted content relative to the request attributes.
   *
   * @return path
   */
  @JsonProperty(JSON_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public AIGuardRedactionReplacement replacement(String replacement) {
    this.replacement = replacement;
    return this;
  }

  /**
   * The redacted replacement content.
   *
   * @return replacement
   */
  @JsonProperty(JSON_PROPERTY_REPLACEMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getReplacement() {
    return replacement;
  }

  public void setReplacement(String replacement) {
    this.replacement = replacement;
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
   * @return AIGuardRedactionReplacement
   */
  @JsonAnySetter
  public AIGuardRedactionReplacement putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AIGuardRedactionReplacement object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AIGuardRedactionReplacement aiGuardRedactionReplacement = (AIGuardRedactionReplacement) o;
    return Objects.equals(this.path, aiGuardRedactionReplacement.path)
        && Objects.equals(this.replacement, aiGuardRedactionReplacement.replacement)
        && Objects.equals(
            this.additionalProperties, aiGuardRedactionReplacement.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, replacement, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AIGuardRedactionReplacement {\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    replacement: ").append(toIndentedString(replacement)).append("\n");
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
