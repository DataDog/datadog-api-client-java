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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Metadata for the last successful scan of an asset. */
@JsonPropertyOrder({
  ScannedAssetMetadataLastSuccess.JSON_PROPERTY_ENV,
  ScannedAssetMetadataLastSuccess.JSON_PROPERTY_ORIGIN,
  ScannedAssetMetadataLastSuccess.JSON_PROPERTY_TIMESTAMP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ScannedAssetMetadataLastSuccess {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENV = "env";
  private String env;

  public static final String JSON_PROPERTY_ORIGIN = "origin";
  private List<String> origin = null;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private String timestamp;

  public ScannedAssetMetadataLastSuccess() {}

  @JsonCreator
  public ScannedAssetMetadataLastSuccess(
      @JsonProperty(required = true, value = JSON_PROPERTY_TIMESTAMP) String timestamp) {
    this.timestamp = timestamp;
  }

  public ScannedAssetMetadataLastSuccess env(String env) {
    this.env = env;
    return this;
  }

  /**
   * The environment of the last success scan of the asset.
   *
   * @return env
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENV)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnv() {
    return env;
  }

  public void setEnv(String env) {
    this.env = env;
  }

  public ScannedAssetMetadataLastSuccess origin(List<String> origin) {
    this.origin = origin;
    return this;
  }

  public ScannedAssetMetadataLastSuccess addOriginItem(String originItem) {
    if (this.origin == null) {
      this.origin = new ArrayList<>();
    }
    this.origin.add(originItem);
    return this;
  }

  /**
   * The list of origins of the last success scan of the asset.
   *
   * @return origin
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ORIGIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getOrigin() {
    return origin;
  }

  public void setOrigin(List<String> origin) {
    this.origin = origin;
  }

  public ScannedAssetMetadataLastSuccess timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The timestamp of the last success scan of the asset.
   *
   * @return timestamp
   */
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
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
   * @return ScannedAssetMetadataLastSuccess
   */
  @JsonAnySetter
  public ScannedAssetMetadataLastSuccess putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ScannedAssetMetadataLastSuccess object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScannedAssetMetadataLastSuccess scannedAssetMetadataLastSuccess =
        (ScannedAssetMetadataLastSuccess) o;
    return Objects.equals(this.env, scannedAssetMetadataLastSuccess.env)
        && Objects.equals(this.origin, scannedAssetMetadataLastSuccess.origin)
        && Objects.equals(this.timestamp, scannedAssetMetadataLastSuccess.timestamp)
        && Objects.equals(
            this.additionalProperties, scannedAssetMetadataLastSuccess.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(env, origin, timestamp, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScannedAssetMetadataLastSuccess {\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
