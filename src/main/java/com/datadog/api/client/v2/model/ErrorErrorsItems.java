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

/** The definition of <code>ErrorErrorsItems</code> object. */
@JsonPropertyOrder({
  ErrorErrorsItems.JSON_PROPERTY_CODE,
  ErrorErrorsItems.JSON_PROPERTY_DETAIL,
  ErrorErrorsItems.JSON_PROPERTY_ID,
  ErrorErrorsItems.JSON_PROPERTY_LINKS,
  ErrorErrorsItems.JSON_PROPERTY_META,
  ErrorErrorsItems.JSON_PROPERTY_SOURCE,
  ErrorErrorsItems.JSON_PROPERTY_STATUS,
  ErrorErrorsItems.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ErrorErrorsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_DETAIL = "detail";
  private String detail;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_LINKS = "links";
  private JsonNullable<ErrorErrorsItemsLinks> links =
      JsonNullable.<ErrorErrorsItemsLinks>undefined();

  public static final String JSON_PROPERTY_META = "meta";
  private Object meta = null;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private JsonNullable<ErrorErrorsItemsSource> source =
      JsonNullable.<ErrorErrorsItemsSource>undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  private JsonNullable<Long> status = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public ErrorErrorsItems code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The <code>items</code> <code>code</code>.
   *
   * @return code
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorErrorsItems detail(String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * The <code>items</code> <code>detail</code>.
   *
   * @return detail
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  public ErrorErrorsItems id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The <code>items</code> <code>id</code>.
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

  public ErrorErrorsItems links(ErrorErrorsItemsLinks links) {
    this.links = JsonNullable.<ErrorErrorsItemsLinks>of(links);
    return this;
  }

  /**
   * The definition of <code>ErrorErrorsItemsLinks</code> object.
   *
   * @return links
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ErrorErrorsItemsLinks getLinks() {
    return links.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ErrorErrorsItemsLinks> getLinks_JsonNullable() {
    return links;
  }

  @JsonProperty(JSON_PROPERTY_LINKS)
  public void setLinks_JsonNullable(JsonNullable<ErrorErrorsItemsLinks> links) {
    this.links = links;
  }

  public void setLinks(ErrorErrorsItemsLinks links) {
    this.links = JsonNullable.<ErrorErrorsItemsLinks>of(links);
  }

  public ErrorErrorsItems meta(Object meta) {
    this.meta = meta;
    return this;
  }

  /**
   * The <code>items</code> <code>meta</code>.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Object getMeta() {
    return meta;
  }

  public void setMeta(Object meta) {
    this.meta = meta;
  }

  public ErrorErrorsItems source(ErrorErrorsItemsSource source) {
    this.source = JsonNullable.<ErrorErrorsItemsSource>of(source);
    return this;
  }

  /**
   * The definition of <code>ErrorErrorsItemsSource</code> object.
   *
   * @return source
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ErrorErrorsItemsSource getSource() {
    return source.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ErrorErrorsItemsSource> getSource_JsonNullable() {
    return source;
  }

  @JsonProperty(JSON_PROPERTY_SOURCE)
  public void setSource_JsonNullable(JsonNullable<ErrorErrorsItemsSource> source) {
    this.source = source;
  }

  public void setSource(ErrorErrorsItemsSource source) {
    this.source = JsonNullable.<ErrorErrorsItemsSource>of(source);
  }

  public ErrorErrorsItems status(Long status) {
    this.status = JsonNullable.<Long>of(status);
    return this;
  }

  /**
   * The <code>items</code> <code>status</code>.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getStatus() {
    return status.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getStatus_JsonNullable() {
    return status;
  }

  @JsonProperty(JSON_PROPERTY_STATUS)
  public void setStatus_JsonNullable(JsonNullable<Long> status) {
    this.status = status;
  }

  public void setStatus(Long status) {
    this.status = JsonNullable.<Long>of(status);
  }

  public ErrorErrorsItems title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The <code>items</code> <code>title</code>.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
   * @return ErrorErrorsItems
   */
  @JsonAnySetter
  public ErrorErrorsItems putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ErrorErrorsItems object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorErrorsItems errorErrorsItems = (ErrorErrorsItems) o;
    return Objects.equals(this.code, errorErrorsItems.code)
        && Objects.equals(this.detail, errorErrorsItems.detail)
        && Objects.equals(this.id, errorErrorsItems.id)
        && Objects.equals(this.links, errorErrorsItems.links)
        && Objects.equals(this.meta, errorErrorsItems.meta)
        && Objects.equals(this.source, errorErrorsItems.source)
        && Objects.equals(this.status, errorErrorsItems.status)
        && Objects.equals(this.title, errorErrorsItems.title)
        && Objects.equals(this.additionalProperties, errorErrorsItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, detail, id, links, meta, source, status, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorErrorsItems {\n");
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
