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

/** */
@JsonPropertyOrder({
  WidgetSchemaJSONAPIListDocument.JSON_PROPERTY_DATA,
  WidgetSchemaJSONAPIListDocument.JSON_PROPERTY_ERRORS,
  WidgetSchemaJSONAPIListDocument.JSON_PROPERTY_INCLUDED,
  WidgetSchemaJSONAPIListDocument.JSON_PROPERTY_LINKS,
  WidgetSchemaJSONAPIListDocument.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetSchemaJSONAPIListDocument {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<WidgetSchemaResource> data = new ArrayList<>();

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private JsonNullable<List<WidgetErrorInput>> errors =
      JsonNullable.<List<WidgetErrorInput>>undefined();

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private JsonNullable<List<WidgetResourceObjectOutput>> included =
      JsonNullable.<List<WidgetResourceObjectOutput>>undefined();

  public static final String JSON_PROPERTY_LINKS = "links";
  private WidgetLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private JsonNullable<Map<String, Object>> meta = JsonNullable.<Map<String, Object>>undefined();

  public WidgetSchemaJSONAPIListDocument() {}

  @JsonCreator
  public WidgetSchemaJSONAPIListDocument(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA) List<WidgetSchemaResource> data) {
    this.data = data;
  }

  public WidgetSchemaJSONAPIListDocument data(List<WidgetSchemaResource> data) {
    this.data = data;
    for (WidgetSchemaResource item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public WidgetSchemaJSONAPIListDocument addDataItem(WidgetSchemaResource dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * Getdata
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<WidgetSchemaResource> getData() {
    return data;
  }

  public void setData(List<WidgetSchemaResource> data) {
    this.data = data;
  }

  public WidgetSchemaJSONAPIListDocument errors(List<WidgetErrorInput> errors) {
    this.errors = JsonNullable.<List<WidgetErrorInput>>of(errors);
    return this;
  }

  public WidgetSchemaJSONAPIListDocument addErrorsItem(WidgetErrorInput errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.<List<WidgetErrorInput>>of(new ArrayList<>());
    }
    try {
      this.errors.get().add(errorsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Geterrors
   *
   * @return errors
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<WidgetErrorInput> getErrors() {
    return errors.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<WidgetErrorInput>> getErrors_JsonNullable() {
    return errors;
  }

  @JsonProperty(JSON_PROPERTY_ERRORS)
  public void setErrors_JsonNullable(JsonNullable<List<WidgetErrorInput>> errors) {
    this.errors = errors;
  }

  public void setErrors(List<WidgetErrorInput> errors) {
    this.errors = JsonNullable.<List<WidgetErrorInput>>of(errors);
  }

  public WidgetSchemaJSONAPIListDocument included(List<WidgetResourceObjectOutput> included) {
    this.included = JsonNullable.<List<WidgetResourceObjectOutput>>of(included);
    return this;
  }

  public WidgetSchemaJSONAPIListDocument addIncludedItem(WidgetResourceObjectOutput includedItem) {
    if (this.included == null || !this.included.isPresent()) {
      this.included = JsonNullable.<List<WidgetResourceObjectOutput>>of(new ArrayList<>());
    }
    try {
      this.included.get().add(includedItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Getincluded
   *
   * @return included
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<WidgetResourceObjectOutput> getIncluded() {
    return included.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<WidgetResourceObjectOutput>> getIncluded_JsonNullable() {
    return included;
  }

  @JsonProperty(JSON_PROPERTY_INCLUDED)
  public void setIncluded_JsonNullable(JsonNullable<List<WidgetResourceObjectOutput>> included) {
    this.included = included;
  }

  public void setIncluded(List<WidgetResourceObjectOutput> included) {
    this.included = JsonNullable.<List<WidgetResourceObjectOutput>>of(included);
  }

  public WidgetSchemaJSONAPIListDocument links(WidgetLinks links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * A JSON:API "links" member See: https://jsonapi.org/format/#document-links
   *
   * @return links
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public WidgetLinks getLinks() {
    return links;
  }

  public void setLinks(WidgetLinks links) {
    this.links = links;
  }

  public WidgetSchemaJSONAPIListDocument meta(Map<String, Object> meta) {
    this.meta = JsonNullable.<Map<String, Object>>of(meta);
    return this;
  }

  public WidgetSchemaJSONAPIListDocument putMetaItem(String key, Object metaItem) {
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
   * @return WidgetSchemaJSONAPIListDocument
   */
  @JsonAnySetter
  public WidgetSchemaJSONAPIListDocument putAdditionalProperty(String key, Object value) {
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

  /** Return true if this WidgetSchemaJSONAPIListDocument object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetSchemaJSONAPIListDocument widgetSchemaJsonapiListDocument =
        (WidgetSchemaJSONAPIListDocument) o;
    return Objects.equals(this.data, widgetSchemaJsonapiListDocument.data)
        && Objects.equals(this.errors, widgetSchemaJsonapiListDocument.errors)
        && Objects.equals(this.included, widgetSchemaJsonapiListDocument.included)
        && Objects.equals(this.links, widgetSchemaJsonapiListDocument.links)
        && Objects.equals(this.meta, widgetSchemaJsonapiListDocument.meta)
        && Objects.equals(
            this.additionalProperties, widgetSchemaJsonapiListDocument.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors, included, links, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetSchemaJSONAPIListDocument {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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
