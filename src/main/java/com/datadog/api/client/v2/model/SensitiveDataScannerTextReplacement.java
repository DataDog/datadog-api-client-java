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

/** Object describing how the scanned event will be replaced. */
@JsonPropertyOrder({
  SensitiveDataScannerTextReplacement.JSON_PROPERTY_NUMBER_OF_CHARS,
  SensitiveDataScannerTextReplacement.JSON_PROPERTY_REPLACEMENT_STRING,
  SensitiveDataScannerTextReplacement.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerTextReplacement {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NUMBER_OF_CHARS = "number_of_chars";
  private Long numberOfChars;

  public static final String JSON_PROPERTY_REPLACEMENT_STRING = "replacement_string";
  private String replacementString;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SensitiveDataScannerTextReplacementType type =
      SensitiveDataScannerTextReplacementType.NONE;

  public SensitiveDataScannerTextReplacement numberOfChars(Long numberOfChars) {
    this.numberOfChars = numberOfChars;
    return this;
  }

  /**
   * Required if type == 'partial_replacement_from_beginning' or 'partial_replacement_from_end'. It
   * must be &gt; 0. minimum: 0
   *
   * @return numberOfChars
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_CHARS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNumberOfChars() {
    return numberOfChars;
  }

  public void setNumberOfChars(Long numberOfChars) {
    this.numberOfChars = numberOfChars;
  }

  public SensitiveDataScannerTextReplacement replacementString(String replacementString) {
    this.replacementString = replacementString;
    return this;
  }

  /**
   * Required if type == 'replacement_string'.
   *
   * @return replacementString
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REPLACEMENT_STRING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReplacementString() {
    return replacementString;
  }

  public void setReplacementString(String replacementString) {
    this.replacementString = replacementString;
  }

  public SensitiveDataScannerTextReplacement type(SensitiveDataScannerTextReplacementType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the replacement text. None means no replacement. hash means the data will be stubbed.
   * replacement_string means that one can chose a text to replace the data.
   * partial_replacement_from_beginning allows a user to partially replace the data from the
   * beginning, and partial_replacement_from_end on the other hand, allows to replace data from the
   * end.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SensitiveDataScannerTextReplacementType getType() {
    return type;
  }

  public void setType(SensitiveDataScannerTextReplacementType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return SensitiveDataScannerTextReplacement
   */
  @JsonAnySetter
  public SensitiveDataScannerTextReplacement putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SensitiveDataScannerTextReplacement object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerTextReplacement sensitiveDataScannerTextReplacement =
        (SensitiveDataScannerTextReplacement) o;
    return Objects.equals(this.numberOfChars, sensitiveDataScannerTextReplacement.numberOfChars)
        && Objects.equals(
            this.replacementString, sensitiveDataScannerTextReplacement.replacementString)
        && Objects.equals(this.type, sensitiveDataScannerTextReplacement.type)
        && Objects.equals(
            this.additionalProperties, sensitiveDataScannerTextReplacement.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfChars, replacementString, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerTextReplacement {\n");
    sb.append("    numberOfChars: ").append(toIndentedString(numberOfChars)).append("\n");
    sb.append("    replacementString: ").append(toIndentedString(replacementString)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
