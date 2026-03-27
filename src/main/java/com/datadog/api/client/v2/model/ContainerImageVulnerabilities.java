/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Vulnerability counts associated with the Container Image.</p>
 */
@JsonPropertyOrder({
  ContainerImageVulnerabilities.JSON_PROPERTY_ASSET_ID,
  ContainerImageVulnerabilities.JSON_PROPERTY_CRITICAL,
  ContainerImageVulnerabilities.JSON_PROPERTY_HIGH,
  ContainerImageVulnerabilities.JSON_PROPERTY_LOW,
  ContainerImageVulnerabilities.JSON_PROPERTY_MEDIUM,
  ContainerImageVulnerabilities.JSON_PROPERTY_NONE,
  ContainerImageVulnerabilities.JSON_PROPERTY_UNKNOWN
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ContainerImageVulnerabilities {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSET_ID = "asset_id";
  private String assetId;

  public static final String JSON_PROPERTY_CRITICAL = "critical";
  private Long critical;

  public static final String JSON_PROPERTY_HIGH = "high";
  private Long high;

  public static final String JSON_PROPERTY_LOW = "low";
  private Long low;

  public static final String JSON_PROPERTY_MEDIUM = "medium";
  private Long medium;

  public static final String JSON_PROPERTY_NONE = "none";
  private Long none;

  public static final String JSON_PROPERTY_UNKNOWN = "unknown";
  private Long unknown;

  public ContainerImageVulnerabilities assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

  /**
   * <p>ID of the Container Image.</p>
   * @return assetId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ASSET_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAssetId() {
        return assetId;
      }
  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }
  public ContainerImageVulnerabilities critical(Long critical) {
    this.critical = critical;
    return this;
  }

  /**
   * <p>Number of vulnerabilities with CVSS Critical severity.</p>
   * @return critical
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CRITICAL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getCritical() {
        return critical;
      }
  public void setCritical(Long critical) {
    this.critical = critical;
  }
  public ContainerImageVulnerabilities high(Long high) {
    this.high = high;
    return this;
  }

  /**
   * <p>Number of vulnerabilities with CVSS High severity.</p>
   * @return high
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HIGH)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getHigh() {
        return high;
      }
  public void setHigh(Long high) {
    this.high = high;
  }
  public ContainerImageVulnerabilities low(Long low) {
    this.low = low;
    return this;
  }

  /**
   * <p>Number of vulnerabilities with CVSS Low severity.</p>
   * @return low
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOW)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getLow() {
        return low;
      }
  public void setLow(Long low) {
    this.low = low;
  }
  public ContainerImageVulnerabilities medium(Long medium) {
    this.medium = medium;
    return this;
  }

  /**
   * <p>Number of vulnerabilities with CVSS Medium severity.</p>
   * @return medium
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MEDIUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getMedium() {
        return medium;
      }
  public void setMedium(Long medium) {
    this.medium = medium;
  }
  public ContainerImageVulnerabilities none(Long none) {
    this.none = none;
    return this;
  }

  /**
   * <p>Number of vulnerabilities with CVSS None severity.</p>
   * @return none
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NONE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getNone() {
        return none;
      }
  public void setNone(Long none) {
    this.none = none;
  }
  public ContainerImageVulnerabilities unknown(Long unknown) {
    this.unknown = unknown;
    return this;
  }

  /**
   * <p>Number of vulnerabilities with an unknown CVSS severity.</p>
   * @return unknown
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UNKNOWN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getUnknown() {
        return unknown;
      }
  public void setUnknown(Long unknown) {
    this.unknown = unknown;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ContainerImageVulnerabilities
   */
  @JsonAnySetter
  public ContainerImageVulnerabilities putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this ContainerImageVulnerabilities object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerImageVulnerabilities containerImageVulnerabilities = (ContainerImageVulnerabilities) o;
    return Objects.equals(this.assetId, containerImageVulnerabilities.assetId) && Objects.equals(this.critical, containerImageVulnerabilities.critical) && Objects.equals(this.high, containerImageVulnerabilities.high) && Objects.equals(this.low, containerImageVulnerabilities.low) && Objects.equals(this.medium, containerImageVulnerabilities.medium) && Objects.equals(this.none, containerImageVulnerabilities.none) && Objects.equals(this.unknown, containerImageVulnerabilities.unknown) && Objects.equals(this.additionalProperties, containerImageVulnerabilities.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(assetId,critical,high,low,medium,none,unknown, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerImageVulnerabilities {\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    critical: ").append(toIndentedString(critical)).append("\n");
    sb.append("    high: ").append(toIndentedString(high)).append("\n");
    sb.append("    low: ").append(toIndentedString(low)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
    sb.append("    none: ").append(toIndentedString(none)).append("\n");
    sb.append("    unknown: ").append(toIndentedString(unknown)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
