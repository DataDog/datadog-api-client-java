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
import org.openapitools.jackson.nullable.JsonNullable;

/** A JSON:API "link object" See: https://jsonapi.org/format/#auto-id--link-objects */
@JsonPropertyOrder({
  LinkObject.JSON_PROPERTY_DESCRIBEDBY,
  LinkObject.JSON_PROPERTY_HREF,
  LinkObject.JSON_PROPERTY_HREFLANG,
  LinkObject.JSON_PROPERTY_META,
  LinkObject.JSON_PROPERTY_REL,
  LinkObject.JSON_PROPERTY_TITLE,
  LinkObject.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LinkObject {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIBEDBY = "describedby";
  private JsonNullable<String> describedby = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_HREF = "href";
  private String href;

  public static final String JSON_PROPERTY_HREFLANG = "hreflang";
  private JsonNullable<List<String>> hreflang = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_META = "meta";
  private JsonNullable<Map<String, Object>> meta = JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_REL = "rel";
  private JsonNullable<String> rel = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TYPE = "type";
  private JsonNullable<String> type = JsonNullable.<String>undefined();

  public LinkObject() {}

  @JsonCreator
  public LinkObject(@JsonProperty(required = true, value = JSON_PROPERTY_HREF) String href) {
    this.href = href;
  }

  public LinkObject describedby(String describedby) {
    this.describedby = JsonNullable.<String>of(describedby);
    return this;
  }

  /**
   * Getdescribedby
   *
   * @return describedby
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDescribedby() {
    return describedby.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIBEDBY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescribedby_JsonNullable() {
    return describedby;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIBEDBY)
  public void setDescribedby_JsonNullable(JsonNullable<String> describedby) {
    this.describedby = describedby;
  }

  public void setDescribedby(String describedby) {
    this.describedby = JsonNullable.<String>of(describedby);
  }

  public LinkObject href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Gethref
   *
   * @return href
   */
  @JsonProperty(JSON_PROPERTY_HREF)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public LinkObject hreflang(List<String> hreflang) {
    this.hreflang = JsonNullable.<List<String>>of(hreflang);
    return this;
  }

  public LinkObject addHreflangItem(String hreflangItem) {
    if (this.hreflang == null || !this.hreflang.isPresent()) {
      this.hreflang = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.hreflang.get().add(hreflangItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Gethreflang
   *
   * @return hreflang
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getHreflang() {
    return hreflang.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HREFLANG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getHreflang_JsonNullable() {
    return hreflang;
  }

  @JsonProperty(JSON_PROPERTY_HREFLANG)
  public void setHreflang_JsonNullable(JsonNullable<List<String>> hreflang) {
    this.hreflang = hreflang;
  }

  public void setHreflang(List<String> hreflang) {
    this.hreflang = JsonNullable.<List<String>>of(hreflang);
  }

  public LinkObject meta(Map<String, Object> meta) {
    this.meta = JsonNullable.<Map<String, Object>>of(meta);
    return this;
  }

  public LinkObject putMetaItem(String key, Object metaItem) {
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

  public LinkObject rel(String rel) {
    this.rel = JsonNullable.<String>of(rel);
    return this;
  }

  /**
   * Getrel
   *
   * @return rel
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getRel() {
    return rel.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getRel_JsonNullable() {
    return rel;
  }

  @JsonProperty(JSON_PROPERTY_REL)
  public void setRel_JsonNullable(JsonNullable<String> rel) {
    this.rel = rel;
  }

  public void setRel(String rel) {
    this.rel = JsonNullable.<String>of(rel);
  }

  public LinkObject title(String title) {
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

  public LinkObject type(String type) {
    this.type = JsonNullable.<String>of(type);
    return this;
  }

  /**
   * Gettype
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getType() {
    return type.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getType_JsonNullable() {
    return type;
  }

  @JsonProperty(JSON_PROPERTY_TYPE)
  public void setType_JsonNullable(JsonNullable<String> type) {
    this.type = type;
  }

  public void setType(String type) {
    this.type = JsonNullable.<String>of(type);
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
   * @return LinkObject
   */
  @JsonAnySetter
  public LinkObject putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LinkObject object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkObject linkObject = (LinkObject) o;
    return Objects.equals(this.describedby, linkObject.describedby)
        && Objects.equals(this.href, linkObject.href)
        && Objects.equals(this.hreflang, linkObject.hreflang)
        && Objects.equals(this.meta, linkObject.meta)
        && Objects.equals(this.rel, linkObject.rel)
        && Objects.equals(this.title, linkObject.title)
        && Objects.equals(this.type, linkObject.type)
        && Objects.equals(this.additionalProperties, linkObject.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(describedby, href, hreflang, meta, rel, title, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkObject {\n");
    sb.append("    describedby: ").append(toIndentedString(describedby)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    hreflang: ").append(toIndentedString(hreflang)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    rel: ").append(toIndentedString(rel)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
