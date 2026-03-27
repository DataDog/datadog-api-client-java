/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Object containing the uptime for a Synthetic test ID. */
@JsonPropertyOrder({
  SyntheticsTestUptime.JSON_PROPERTY_FROM_TS,
  SyntheticsTestUptime.JSON_PROPERTY_OVERALL,
  SyntheticsTestUptime.JSON_PROPERTY_PUBLIC_ID,
  SyntheticsTestUptime.JSON_PROPERTY_TO_TS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestUptime {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM_TS = "from_ts";
  private Long fromTs;

  public static final String JSON_PROPERTY_OVERALL = "overall";
  private SyntheticsUptime overall;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public static final String JSON_PROPERTY_TO_TS = "to_ts";
  private Long toTs;

  public SyntheticsTestUptime fromTs(Long fromTs) {
    this.fromTs = fromTs;
    return this;
  }

  /**
   * Timestamp in seconds for the start of uptime.
   *
   * @return fromTs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFromTs() {
    return fromTs;
  }

  public void setFromTs(Long fromTs) {
    this.fromTs = fromTs;
  }

  public SyntheticsTestUptime overall(SyntheticsUptime overall) {
    this.overall = overall;
    this.unparsed |= overall.unparsed;
    return this;
  }

  /**
   * Object containing the uptime information.
   *
   * @return overall
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OVERALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsUptime getOverall() {
    return overall;
  }

  public void setOverall(SyntheticsUptime overall) {
    this.overall = overall;
  }

  public SyntheticsTestUptime publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * A Synthetic test ID.
   *
   * @return publicId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPublicId() {
    return publicId;
  }

  public void setPublicId(String publicId) {
    this.publicId = publicId;
  }

  public SyntheticsTestUptime toTs(Long toTs) {
    this.toTs = toTs;
    return this;
  }

  /**
   * Timestamp in seconds for the end of uptime.
   *
   * @return toTs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO_TS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getToTs() {
    return toTs;
  }

  public void setToTs(Long toTs) {
    this.toTs = toTs;
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
   * @return SyntheticsTestUptime
   */
  @JsonAnySetter
  public SyntheticsTestUptime putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestUptime object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestUptime syntheticsTestUptime = (SyntheticsTestUptime) o;
    return Objects.equals(this.fromTs, syntheticsTestUptime.fromTs)
        && Objects.equals(this.overall, syntheticsTestUptime.overall)
        && Objects.equals(this.publicId, syntheticsTestUptime.publicId)
        && Objects.equals(this.toTs, syntheticsTestUptime.toTs)
        && Objects.equals(this.additionalProperties, syntheticsTestUptime.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromTs, overall, publicId, toTs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestUptime {\n");
    sb.append("    fromTs: ").append(toIndentedString(fromTs)).append("\n");
    sb.append("    overall: ").append(toIndentedString(overall)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
    sb.append("    toTs: ").append(toIndentedString(toTs)).append("\n");
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
