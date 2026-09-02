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

/** Trace identifiers associated with a Synthetic test result. */
@JsonPropertyOrder({
  SyntheticsTestResultTrace.JSON_PROPERTY_ID,
  SyntheticsTestResultTrace.JSON_PROPERTY_OTEL_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultTrace {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_OTEL_ID = "otel_id";
  private String otelId;

  public SyntheticsTestResultTrace id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Datadog APM trace identifier.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SyntheticsTestResultTrace otelId(String otelId) {
    this.otelId = otelId;
    return this;
  }

  /**
   * OpenTelemetry trace identifier.
   *
   * @return otelId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OTEL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOtelId() {
    return otelId;
  }

  public void setOtelId(String otelId) {
    this.otelId = otelId;
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
   * @return SyntheticsTestResultTrace
   */
  @JsonAnySetter
  public SyntheticsTestResultTrace putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultTrace object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultTrace syntheticsTestResultTrace = (SyntheticsTestResultTrace) o;
    return Objects.equals(this.id, syntheticsTestResultTrace.id)
        && Objects.equals(this.otelId, syntheticsTestResultTrace.otelId)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultTrace.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, otelId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultTrace {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    otelId: ").append(toIndentedString(otelId)).append("\n");
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
