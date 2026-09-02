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
 * Object describing the suppressions for a rule. There are three types of suppressions, <code>
 * starts_with</code>, <code>ends_with</code>, and <code>exact_match</code>. Suppressed matches are
 * not obfuscated, counted in metrics, or displayed in the Findings page.
 */
@JsonPropertyOrder({
  SensitiveDataScannerSuppressions.JSON_PROPERTY_ENDS_WITH,
  SensitiveDataScannerSuppressions.JSON_PROPERTY_EXACT_MATCH,
  SensitiveDataScannerSuppressions.JSON_PROPERTY_STARTS_WITH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerSuppressions {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENDS_WITH = "ends_with";
  private List<String> endsWith = null;

  public static final String JSON_PROPERTY_EXACT_MATCH = "exact_match";
  private List<String> exactMatch = null;

  public static final String JSON_PROPERTY_STARTS_WITH = "starts_with";
  private List<String> startsWith = null;

  public SensitiveDataScannerSuppressions endsWith(List<String> endsWith) {
    this.endsWith = endsWith;
    return this;
  }

  public SensitiveDataScannerSuppressions addEndsWithItem(String endsWithItem) {
    if (this.endsWith == null) {
      this.endsWith = new ArrayList<>();
    }
    this.endsWith.add(endsWithItem);
    return this;
  }

  /**
   * List of strings to use for suppression of matches ending with these strings.
   *
   * @return endsWith
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDS_WITH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEndsWith() {
    return endsWith;
  }

  public void setEndsWith(List<String> endsWith) {
    this.endsWith = endsWith;
  }

  public SensitiveDataScannerSuppressions exactMatch(List<String> exactMatch) {
    this.exactMatch = exactMatch;
    return this;
  }

  public SensitiveDataScannerSuppressions addExactMatchItem(String exactMatchItem) {
    if (this.exactMatch == null) {
      this.exactMatch = new ArrayList<>();
    }
    this.exactMatch.add(exactMatchItem);
    return this;
  }

  /**
   * List of strings to use for suppression of matches exactly matching these strings.
   *
   * @return exactMatch
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXACT_MATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getExactMatch() {
    return exactMatch;
  }

  public void setExactMatch(List<String> exactMatch) {
    this.exactMatch = exactMatch;
  }

  public SensitiveDataScannerSuppressions startsWith(List<String> startsWith) {
    this.startsWith = startsWith;
    return this;
  }

  public SensitiveDataScannerSuppressions addStartsWithItem(String startsWithItem) {
    if (this.startsWith == null) {
      this.startsWith = new ArrayList<>();
    }
    this.startsWith.add(startsWithItem);
    return this;
  }

  /**
   * List of strings to use for suppression of matches starting with these strings.
   *
   * @return startsWith
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STARTS_WITH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getStartsWith() {
    return startsWith;
  }

  public void setStartsWith(List<String> startsWith) {
    this.startsWith = startsWith;
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
   * @return SensitiveDataScannerSuppressions
   */
  @JsonAnySetter
  public SensitiveDataScannerSuppressions putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SensitiveDataScannerSuppressions object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerSuppressions sensitiveDataScannerSuppressions =
        (SensitiveDataScannerSuppressions) o;
    return Objects.equals(this.endsWith, sensitiveDataScannerSuppressions.endsWith)
        && Objects.equals(this.exactMatch, sensitiveDataScannerSuppressions.exactMatch)
        && Objects.equals(this.startsWith, sensitiveDataScannerSuppressions.startsWith)
        && Objects.equals(
            this.additionalProperties, sensitiveDataScannerSuppressions.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endsWith, exactMatch, startsWith, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerSuppressions {\n");
    sb.append("    endsWith: ").append(toIndentedString(endsWith)).append("\n");
    sb.append("    exactMatch: ").append(toIndentedString(exactMatch)).append("\n");
    sb.append("    startsWith: ").append(toIndentedString(startsWith)).append("\n");
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
