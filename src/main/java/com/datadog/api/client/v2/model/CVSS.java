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

/** Vulnerability severity. */
@JsonPropertyOrder({
  CVSS.JSON_PROPERTY_SCORE,
  CVSS.JSON_PROPERTY_SEVERITY,
  CVSS.JSON_PROPERTY_VECTOR
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CVSS {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SCORE = "score";
  private Double score;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private VulnerabilitySeverity severity;

  public static final String JSON_PROPERTY_VECTOR = "vector";
  private String vector;

  public CVSS() {}

  @JsonCreator
  public CVSS(
      @JsonProperty(required = true, value = JSON_PROPERTY_SCORE) Double score,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEVERITY) VulnerabilitySeverity severity,
      @JsonProperty(required = true, value = JSON_PROPERTY_VECTOR) String vector) {
    this.score = score;
    this.severity = severity;
    this.unparsed |= !severity.isValid();
    this.vector = vector;
  }

  public CVSS score(Double score) {
    this.score = score;
    return this;
  }

  /**
   * Vulnerability severity score.
   *
   * @return score
   */
  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public CVSS severity(VulnerabilitySeverity severity) {
    this.severity = severity;
    this.unparsed |= !severity.isValid();
    return this;
  }

  /**
   * The vulnerability severity.
   *
   * @return severity
   */
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public VulnerabilitySeverity getSeverity() {
    return severity;
  }

  public void setSeverity(VulnerabilitySeverity severity) {
    if (!severity.isValid()) {
      this.unparsed = true;
    }
    this.severity = severity;
  }

  public CVSS vector(String vector) {
    this.vector = vector;
    return this;
  }

  /**
   * Vulnerability CVSS vector.
   *
   * @return vector
   */
  @JsonProperty(JSON_PROPERTY_VECTOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getVector() {
    return vector;
  }

  public void setVector(String vector) {
    this.vector = vector;
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
   * @return CVSS
   */
  @JsonAnySetter
  public CVSS putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CVSS object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CVSS cvss = (CVSS) o;
    return Objects.equals(this.score, cvss.score)
        && Objects.equals(this.severity, cvss.severity)
        && Objects.equals(this.vector, cvss.vector)
        && Objects.equals(this.additionalProperties, cvss.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, severity, vector, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CVSS {\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    vector: ").append(toIndentedString(vector)).append("\n");
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
