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

/** Attributes of a tag policy compliance score. */
@JsonPropertyOrder({
  TagPolicyScoreAttributes.JSON_PROPERTY_SCORE,
  TagPolicyScoreAttributes.JSON_PROPERTY_TS_END,
  TagPolicyScoreAttributes.JSON_PROPERTY_TS_START,
  TagPolicyScoreAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TagPolicyScoreAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_SCORE = "score";
  private Double score;

  public static final String JSON_PROPERTY_TS_END = "ts_end";
  private Long tsEnd;

  public static final String JSON_PROPERTY_TS_START = "ts_start";
  private Long tsStart;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public TagPolicyScoreAttributes() {}

  @JsonCreator
  public TagPolicyScoreAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_SCORE) Double score,
      @JsonProperty(required = true, value = JSON_PROPERTY_TS_END) Long tsEnd,
      @JsonProperty(required = true, value = JSON_PROPERTY_TS_START) Long tsStart,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) Long version) {
    this.score = score;
    if (score != null) {}
    this.tsEnd = tsEnd;
    this.tsStart = tsStart;
    this.version = version;
  }

  public TagPolicyScoreAttributes score(Double score) {
    this.score = score;
    if (score != null) {}
    return this;
  }

  /**
   * The compliance score for the policy over the requested time window, as a percentage between 0
   * and 100. <code>null</code> indicates that no relevant telemetry was found.
   *
   * @return score
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCORE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public TagPolicyScoreAttributes tsEnd(Long tsEnd) {
    this.tsEnd = tsEnd;
    return this;
  }

  /**
   * End of the time window the score was computed over, as a Unix timestamp in milliseconds.
   *
   * @return tsEnd
   */
  @JsonProperty(JSON_PROPERTY_TS_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTsEnd() {
    return tsEnd;
  }

  public void setTsEnd(Long tsEnd) {
    this.tsEnd = tsEnd;
  }

  public TagPolicyScoreAttributes tsStart(Long tsStart) {
    this.tsStart = tsStart;
    return this;
  }

  /**
   * Start of the time window the score was computed over, as a Unix timestamp in milliseconds.
   *
   * @return tsStart
   */
  @JsonProperty(JSON_PROPERTY_TS_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTsStart() {
    return tsStart;
  }

  public void setTsStart(Long tsStart) {
    this.tsStart = tsStart;
  }

  public TagPolicyScoreAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the tag policy that the score was computed against.
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
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
   * @return TagPolicyScoreAttributes
   */
  @JsonAnySetter
  public TagPolicyScoreAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TagPolicyScoreAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagPolicyScoreAttributes tagPolicyScoreAttributes = (TagPolicyScoreAttributes) o;
    return Objects.equals(this.score, tagPolicyScoreAttributes.score)
        && Objects.equals(this.tsEnd, tagPolicyScoreAttributes.tsEnd)
        && Objects.equals(this.tsStart, tagPolicyScoreAttributes.tsStart)
        && Objects.equals(this.version, tagPolicyScoreAttributes.version)
        && Objects.equals(this.additionalProperties, tagPolicyScoreAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, tsEnd, tsStart, version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagPolicyScoreAttributes {\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    tsEnd: ").append(toIndentedString(tsEnd)).append("\n");
    sb.append("    tsStart: ").append(toIndentedString(tsStart)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
