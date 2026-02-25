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

/** A JSON:API "error object". See: https://jsonapi.org/format/1.0/#error-objects */
@JsonPropertyOrder({
  WidgetErrorInput.JSON_PROPERTY_CODE,
  WidgetErrorInput.JSON_PROPERTY_DETAIL,
  WidgetErrorInput.JSON_PROPERTY_ID,
  WidgetErrorInput.JSON_PROPERTY_LINKS,
  WidgetErrorInput.JSON_PROPERTY_META,
  WidgetErrorInput.JSON_PROPERTY_SOURCE,
  WidgetErrorInput.JSON_PROPERTY_STATUS,
  WidgetErrorInput.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetErrorInput {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODE = "code";
  private JsonNullable<String> code = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_DETAIL = "detail";
  private JsonNullable<String> detail = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_ID = "id";
  private JsonNullable<String> id = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LINKS = "links";
  private ErrorLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private JsonNullable<Map<String, Object>> meta = JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_SOURCE = "source";
  private ErrorSource source;

  public static final String JSON_PROPERTY_STATUS = "status";
  private JsonNullable<String> status = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public WidgetErrorInput code(String code) {
    this.code = JsonNullable.<String>of(code);
    return this;
  }

  /**
   * Getcode
   *
   * @return code
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getCode() {
    return code.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getCode_JsonNullable() {
    return code;
  }

  @JsonProperty(JSON_PROPERTY_CODE)
  public void setCode_JsonNullable(JsonNullable<String> code) {
    this.code = code;
  }

  public void setCode(String code) {
    this.code = JsonNullable.<String>of(code);
  }

  public WidgetErrorInput detail(String detail) {
    this.detail = JsonNullable.<String>of(detail);
    return this;
  }

  /**
   * Getdetail
   *
   * @return detail
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDetail() {
    return detail.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDetail_JsonNullable() {
    return detail;
  }

  @JsonProperty(JSON_PROPERTY_DETAIL)
  public void setDetail_JsonNullable(JsonNullable<String> detail) {
    this.detail = detail;
  }

  public void setDetail(String detail) {
    this.detail = JsonNullable.<String>of(detail);
  }

  public WidgetErrorInput id(String id) {
    this.id = JsonNullable.<String>of(id);
    return this;
  }

  /**
   * Getid
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getId() {
    return id.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getId_JsonNullable() {
    return id;
  }

  @JsonProperty(JSON_PROPERTY_ID)
  public void setId_JsonNullable(JsonNullable<String> id) {
    this.id = id;
  }

  public void setId(String id) {
    this.id = JsonNullable.<String>of(id);
  }

  public WidgetErrorInput links(ErrorLinks links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * Getlinks
   *
   * @return links
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ErrorLinks getLinks() {
    return links;
  }

  public void setLinks(ErrorLinks links) {
    this.links = links;
  }

  public WidgetErrorInput meta(Map<String, Object> meta) {
    this.meta = JsonNullable.<Map<String, Object>>of(meta);
    return this;
  }

  public WidgetErrorInput putMetaItem(String key, Object metaItem) {
    if (this.meta == null || !this.meta.isPresent()) {
      this.meta = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.meta.get().put(key, metaItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Getmeta
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, Object> getMeta() {
    return meta.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, Object>> getMeta_JsonNullable() {
    return meta;
  }

  @JsonProperty(JSON_PROPERTY_META)
  public void setMeta_JsonNullable(JsonNullable<Map<String, Object>> meta) {
    this.meta = meta;
  }

  public void setMeta(Map<String, Object> meta) {
    this.meta = JsonNullable.<Map<String, Object>>of(meta);
  }

  public WidgetErrorInput source(ErrorSource source) {
    this.source = source;
    this.unparsed |= source.unparsed;
    return this;
  }

  /**
   * An object containing references to the primary source of the error. See:
   * https://jsonapi.org/format/#error-objects
   *
   * @return source
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ErrorSource getSource() {
    return source;
  }

  public void setSource(ErrorSource source) {
    this.source = source;
  }

  public WidgetErrorInput status(String status) {
    this.status = JsonNullable.<String>of(status);
    return this;
  }

  /**
   * Getstatus
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getStatus() {
    return status.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getStatus_JsonNullable() {
    return status;
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  public void setStatus_JsonNullable(JsonNullable<String> status) {
    this.status = status;
  }

  public void setStatus(String status) {
    this.status = JsonNullable.<String>of(status);
  }

  public WidgetErrorInput title(String title) {
    this.title = JsonNullable.<String>of(title);
    return this;
  }

  /**
   * Gettitle
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getTitle() {
    return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(String title) {
    this.title = JsonNullable.<String>of(title);
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
   * @return WidgetErrorInput
   */
  @JsonAnySetter
  public WidgetErrorInput putAdditionalProperty(String key, Object value) {
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

  /** Return true if this WidgetErrorInput object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetErrorInput widgetErrorInput = (WidgetErrorInput) o;
    return Objects.equals(this.code, widgetErrorInput.code)
        && Objects.equals(this.detail, widgetErrorInput.detail)
        && Objects.equals(this.id, widgetErrorInput.id)
        && Objects.equals(this.links, widgetErrorInput.links)
        && Objects.equals(this.meta, widgetErrorInput.meta)
        && Objects.equals(this.source, widgetErrorInput.source)
        && Objects.equals(this.status, widgetErrorInput.status)
        && Objects.equals(this.title, widgetErrorInput.title)
        && Objects.equals(this.additionalProperties, widgetErrorInput.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, detail, id, links, meta, source, status, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetErrorInput {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
