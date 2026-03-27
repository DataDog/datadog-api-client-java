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
   * <p>API error response body</p>
 */
@JsonPropertyOrder({
  JSONAPIErrorItem.JSON_PROPERTY_DETAIL,
  JSONAPIErrorItem.JSON_PROPERTY_META,
  JSONAPIErrorItem.JSON_PROPERTY_SOURCE,
  JSONAPIErrorItem.JSON_PROPERTY_STATUS,
  JSONAPIErrorItem.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JSONAPIErrorItem {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DETAIL = "detail";
  private String detail;

  public static final String JSON_PROPERTY_META = "meta";
  private Map<String, Object> meta = null;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private JSONAPIErrorItemSource source;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public JSONAPIErrorItem detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * <p>A human-readable explanation specific to this occurrence of the error.</p>
   * @return detail
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DETAIL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDetail() {
        return detail;
      }
  public void setDetail(String detail) {
    this.detail = detail;
  }
  public JSONAPIErrorItem meta(Map<String, Object> meta) {
    this.meta = meta;
    return this;
  }
  public JSONAPIErrorItem putMetaItem(String key, Object metaItem) {
    if (this.meta == null) {
      this.meta = new HashMap<>();
    }
    this.meta.put(key, metaItem);
    return this;
  }

  /**
   * <p>Non-standard meta-information about the error</p>
   * @return meta
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_META)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Map<String, Object> getMeta() {
        return meta;
      }
  public void setMeta(Map<String, Object> meta) {
    this.meta = meta;
  }
  public JSONAPIErrorItem source(JSONAPIErrorItemSource source) {
    this.source = source;
    this.unparsed |= source.unparsed;
    return this;
  }

  /**
   * <p>References to the source of the error.</p>
   * @return source
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SOURCE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public JSONAPIErrorItemSource getSource() {
        return source;
      }
  public void setSource(JSONAPIErrorItemSource source) {
    this.source = source;
  }
  public JSONAPIErrorItem status(String status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Status code of the response.</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getStatus() {
        return status;
      }
  public void setStatus(String status) {
    this.status = status;
  }
  public JSONAPIErrorItem title(String title) {
    this.title = title;
    return this;
  }

  /**
   * <p>Short human-readable summary of the error.</p>
   * @return title
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTitle() {
        return title;
      }
  public void setTitle(String title) {
    this.title = title;
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
   * @return JSONAPIErrorItem
   */
  @JsonAnySetter
  public JSONAPIErrorItem putAdditionalProperty(String key, Object value) {
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
   * Return true if this JSONAPIErrorItem object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JSONAPIErrorItem jsonapiErrorItem = (JSONAPIErrorItem) o;
    return Objects.equals(this.detail, jsonapiErrorItem.detail) && Objects.equals(this.meta, jsonapiErrorItem.meta) && Objects.equals(this.source, jsonapiErrorItem.source) && Objects.equals(this.status, jsonapiErrorItem.status) && Objects.equals(this.title, jsonapiErrorItem.title) && Objects.equals(this.additionalProperties, jsonapiErrorItem.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(detail,meta,source,status,title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JSONAPIErrorItem {\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
