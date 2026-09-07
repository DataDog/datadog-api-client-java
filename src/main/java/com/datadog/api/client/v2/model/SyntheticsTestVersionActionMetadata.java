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
import org.openapitools.jackson.nullable.JsonNullable;

/** Object containing metadata about a change action. */
@JsonPropertyOrder({
  SyntheticsTestVersionActionMetadata.JSON_PROPERTY_AFTER_VALUE,
  SyntheticsTestVersionActionMetadata.JSON_PROPERTY_BEFORE_VALUE,
  SyntheticsTestVersionActionMetadata.JSON_PROPERTY_DIFF_PATCHES,
  SyntheticsTestVersionActionMetadata.JSON_PROPERTY_PROPERTY_PATH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestVersionActionMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AFTER_VALUE = "after_value";
  private Object afterValue = null;

  public static final String JSON_PROPERTY_BEFORE_VALUE = "before_value";
  private Object beforeValue = null;

  public static final String JSON_PROPERTY_DIFF_PATCHES = "diff_patches";
  private JsonNullable<List<SyntheticsTestVersionDiffPatches>> diffPatches =
      JsonNullable.<List<SyntheticsTestVersionDiffPatches>>undefined();

  public static final String JSON_PROPERTY_PROPERTY_PATH = "property_path";
  private String propertyPath;

  public SyntheticsTestVersionActionMetadata afterValue(Object afterValue) {
    this.afterValue = afterValue;
    return this;
  }

  /**
   * The value of the property after the change.
   *
   * @return afterValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AFTER_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getAfterValue() {
    return afterValue;
  }

  public void setAfterValue(Object afterValue) {
    this.afterValue = afterValue;
  }

  public SyntheticsTestVersionActionMetadata beforeValue(Object beforeValue) {
    this.beforeValue = beforeValue;
    return this;
  }

  /**
   * The value of the property before the change.
   *
   * @return beforeValue
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BEFORE_VALUE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getBeforeValue() {
    return beforeValue;
  }

  public void setBeforeValue(Object beforeValue) {
    this.beforeValue = beforeValue;
  }

  public SyntheticsTestVersionActionMetadata diffPatches(
      List<SyntheticsTestVersionDiffPatches> diffPatches) {
    this.diffPatches = JsonNullable.<List<SyntheticsTestVersionDiffPatches>>of(diffPatches);
    return this;
  }

  public SyntheticsTestVersionActionMetadata addDiffPatchesItem(
      SyntheticsTestVersionDiffPatches diffPatchesItem) {
    if (this.diffPatches == null || !this.diffPatches.isPresent()) {
      this.diffPatches = JsonNullable.<List<SyntheticsTestVersionDiffPatches>>of(new ArrayList<>());
    }
    try {
      this.diffPatches.get().add(diffPatchesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * List of diff patches for text changes.
   *
   * @return diffPatches
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<SyntheticsTestVersionDiffPatches> getDiffPatches() {
    return diffPatches.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DIFF_PATCHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<SyntheticsTestVersionDiffPatches>> getDiffPatches_JsonNullable() {
    return diffPatches;
  }

  @JsonProperty(JSON_PROPERTY_DIFF_PATCHES)
  public void setDiffPatches_JsonNullable(
      JsonNullable<List<SyntheticsTestVersionDiffPatches>> diffPatches) {
    this.diffPatches = diffPatches;
  }

  public void setDiffPatches(List<SyntheticsTestVersionDiffPatches> diffPatches) {
    this.diffPatches = JsonNullable.<List<SyntheticsTestVersionDiffPatches>>of(diffPatches);
  }

  public SyntheticsTestVersionActionMetadata propertyPath(String propertyPath) {
    this.propertyPath = propertyPath;
    return this;
  }

  /**
   * The dot-separated path of the property that was changed.
   *
   * @return propertyPath
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTY_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPropertyPath() {
    return propertyPath;
  }

  public void setPropertyPath(String propertyPath) {
    this.propertyPath = propertyPath;
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
   * @return SyntheticsTestVersionActionMetadata
   */
  @JsonAnySetter
  public SyntheticsTestVersionActionMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestVersionActionMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestVersionActionMetadata syntheticsTestVersionActionMetadata =
        (SyntheticsTestVersionActionMetadata) o;
    return Objects.equals(this.afterValue, syntheticsTestVersionActionMetadata.afterValue)
        && Objects.equals(this.beforeValue, syntheticsTestVersionActionMetadata.beforeValue)
        && Objects.equals(this.diffPatches, syntheticsTestVersionActionMetadata.diffPatches)
        && Objects.equals(this.propertyPath, syntheticsTestVersionActionMetadata.propertyPath)
        && Objects.equals(
            this.additionalProperties, syntheticsTestVersionActionMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(afterValue, beforeValue, diffPatches, propertyPath, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestVersionActionMetadata {\n");
    sb.append("    afterValue: ").append(toIndentedString(afterValue)).append("\n");
    sb.append("    beforeValue: ").append(toIndentedString(beforeValue)).append("\n");
    sb.append("    diffPatches: ").append(toIndentedString(diffPatches)).append("\n");
    sb.append("    propertyPath: ").append(toIndentedString(propertyPath)).append("\n");
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
