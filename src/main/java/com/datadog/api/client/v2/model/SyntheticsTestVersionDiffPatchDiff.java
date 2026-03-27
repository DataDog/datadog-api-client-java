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

/** Object describing a single text diff operation. */
@JsonPropertyOrder({
  SyntheticsTestVersionDiffPatchDiff.JSON_PROPERTY_CHANGE_TEXT,
  SyntheticsTestVersionDiffPatchDiff.JSON_PROPERTY_OPERATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestVersionDiffPatchDiff {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANGE_TEXT = "change_text";
  private String changeText;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private String operation;

  public SyntheticsTestVersionDiffPatchDiff changeText(String changeText) {
    this.changeText = changeText;
    return this;
  }

  /**
   * The text that was changed.
   *
   * @return changeText
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CHANGE_TEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getChangeText() {
    return changeText;
  }

  public void setChangeText(String changeText) {
    this.changeText = changeText;
  }

  public SyntheticsTestVersionDiffPatchDiff operation(String operation) {
    this.operation = operation;
    return this;
  }

  /**
   * The diff operation applied.
   *
   * @return operation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
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
   * @return SyntheticsTestVersionDiffPatchDiff
   */
  @JsonAnySetter
  public SyntheticsTestVersionDiffPatchDiff putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestVersionDiffPatchDiff object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestVersionDiffPatchDiff syntheticsTestVersionDiffPatchDiff =
        (SyntheticsTestVersionDiffPatchDiff) o;
    return Objects.equals(this.changeText, syntheticsTestVersionDiffPatchDiff.changeText)
        && Objects.equals(this.operation, syntheticsTestVersionDiffPatchDiff.operation)
        && Objects.equals(
            this.additionalProperties, syntheticsTestVersionDiffPatchDiff.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeText, operation, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestVersionDiffPatchDiff {\n");
    sb.append("    changeText: ").append(toIndentedString(changeText)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
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
