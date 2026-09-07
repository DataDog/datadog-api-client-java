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

/** Counters describing the result of the STIX ingestion request. */
@JsonPropertyOrder({
  STIXIngestResponseAttributes.JSON_PROPERTY_ACCEPTED,
  STIXIngestResponseAttributes.JSON_PROPERTY_INVALID,
  STIXIngestResponseAttributes.JSON_PROPERTY_UNSUPPORTED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class STIXIngestResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCEPTED = "accepted";
  private Long accepted;

  public static final String JSON_PROPERTY_INVALID = "invalid";
  private Long invalid;

  public static final String JSON_PROPERTY_UNSUPPORTED = "unsupported";
  private Long unsupported;

  public STIXIngestResponseAttributes() {}

  @JsonCreator
  public STIXIngestResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ACCEPTED) Long accepted,
      @JsonProperty(required = true, value = JSON_PROPERTY_INVALID) Long invalid,
      @JsonProperty(required = true, value = JSON_PROPERTY_UNSUPPORTED) Long unsupported) {
    this.accepted = accepted;
    this.invalid = invalid;
    this.unsupported = unsupported;
  }

  public STIXIngestResponseAttributes accepted(Long accepted) {
    this.accepted = accepted;
    return this;
  }

  /**
   * The number of supported indicators accepted. minimum: 0
   *
   * @return accepted
   */
  @JsonProperty(JSON_PROPERTY_ACCEPTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getAccepted() {
    return accepted;
  }

  public void setAccepted(Long accepted) {
    this.accepted = accepted;
  }

  public STIXIngestResponseAttributes invalid(Long invalid) {
    this.invalid = invalid;
    return this;
  }

  /**
   * The number of indicators with patterns that could not be parsed. minimum: 0
   *
   * @return invalid
   */
  @JsonProperty(JSON_PROPERTY_INVALID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getInvalid() {
    return invalid;
  }

  public void setInvalid(Long invalid) {
    this.invalid = invalid;
  }

  public STIXIngestResponseAttributes unsupported(Long unsupported) {
    this.unsupported = unsupported;
    return this;
  }

  /**
   * The number of indicator objects with an unsupported STIX version or a pattern that produced no
   * supported observable values. minimum: 0
   *
   * @return unsupported
   */
  @JsonProperty(JSON_PROPERTY_UNSUPPORTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getUnsupported() {
    return unsupported;
  }

  public void setUnsupported(Long unsupported) {
    this.unsupported = unsupported;
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
   * @return STIXIngestResponseAttributes
   */
  @JsonAnySetter
  public STIXIngestResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this STIXIngestResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    STIXIngestResponseAttributes stixIngestResponseAttributes = (STIXIngestResponseAttributes) o;
    return Objects.equals(this.accepted, stixIngestResponseAttributes.accepted)
        && Objects.equals(this.invalid, stixIngestResponseAttributes.invalid)
        && Objects.equals(this.unsupported, stixIngestResponseAttributes.unsupported)
        && Objects.equals(
            this.additionalProperties, stixIngestResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accepted, invalid, unsupported, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class STIXIngestResponseAttributes {\n");
    sb.append("    accepted: ").append(toIndentedString(accepted)).append("\n");
    sb.append("    invalid: ").append(toIndentedString(invalid)).append("\n");
    sb.append("    unsupported: ").append(toIndentedString(unsupported)).append("\n");
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
