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
import org.openapitools.jackson.nullable.JsonNullable;

/** Update rule response. */
@JsonPropertyOrder({
  SensitiveDataScannerRuleUpdateResponse.JSON_PROPERTY_DATA,
  SensitiveDataScannerRuleUpdateResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SensitiveDataScannerRuleUpdateResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private JsonNullable<Map<String, Object>> data = JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_META = "meta";
  private Map<String, Object> meta = null;

  public SensitiveDataScannerRuleUpdateResponse data(Map<String, Object> data) {
    this.data = JsonNullable.<Map<String, Object>>of(data);
    return this;
  }

  public SensitiveDataScannerRuleUpdateResponse putDataItem(String key, Object dataItem) {
    if (this.data == null || !this.data.isPresent()) {
      this.data = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.data.get().put(key, dataItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Always <code>null</code>.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, Object> getData() {
    return data.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, Object>> getData_JsonNullable() {
    return data;
  }

  @JsonProperty(JSON_PROPERTY_DATA)
  public void setData_JsonNullable(JsonNullable<Map<String, Object>> data) {
    this.data = data;
  }

  public void setData(Map<String, Object> data) {
    this.data = JsonNullable.<Map<String, Object>>of(data);
  }

  public SensitiveDataScannerRuleUpdateResponse meta(Map<String, Object> meta) {
    this.meta = meta;
    return this;
  }

  public SensitiveDataScannerRuleUpdateResponse putMetaItem(String key, Object metaItem) {
    if (this.meta == null) {
      this.meta = new HashMap<>();
    }
    this.meta.put(key, metaItem);
    return this;
  }

  /**
   * Meta response. Always an empty object.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getMeta() {
    return meta;
  }

  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
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
   * @return SensitiveDataScannerRuleUpdateResponse
   */
  @JsonAnySetter
  public SensitiveDataScannerRuleUpdateResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SensitiveDataScannerRuleUpdateResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SensitiveDataScannerRuleUpdateResponse sensitiveDataScannerRuleUpdateResponse =
        (SensitiveDataScannerRuleUpdateResponse) o;
    return Objects.equals(this.data, sensitiveDataScannerRuleUpdateResponse.data)
        && Objects.equals(this.meta, sensitiveDataScannerRuleUpdateResponse.meta)
        && Objects.equals(
            this.additionalProperties, sensitiveDataScannerRuleUpdateResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SensitiveDataScannerRuleUpdateResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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
