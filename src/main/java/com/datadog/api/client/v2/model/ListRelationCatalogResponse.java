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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** List entity relation response. */
@JsonPropertyOrder({
  ListRelationCatalogResponse.JSON_PROPERTY_DATA,
  ListRelationCatalogResponse.JSON_PROPERTY_INCLUDED,
  ListRelationCatalogResponse.JSON_PROPERTY_LINKS,
  ListRelationCatalogResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListRelationCatalogResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<RelationResponse> data = null;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<EntityData> included = null;

  public static final String JSON_PROPERTY_LINKS = "links";
  private ListRelationCatalogResponseLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private RelationResponseMeta meta;

  public ListRelationCatalogResponse data(List<RelationResponse> data) {
    this.data = data;
    for (RelationResponse item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ListRelationCatalogResponse addDataItem(RelationResponse dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * Array of relation responses
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<RelationResponse> getData() {
    return data;
  }

  public void setData(List<RelationResponse> data) {
    this.data = data;
  }

  public ListRelationCatalogResponse included(List<EntityData> included) {
    this.included = included;
    for (EntityData item : included) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ListRelationCatalogResponse addIncludedItem(EntityData includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * List relation response included entities.
   *
   * @return included
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EntityData> getIncluded() {
    return included;
  }

  public void setIncluded(List<EntityData> included) {
    this.included = included;
  }

  public ListRelationCatalogResponse links(ListRelationCatalogResponseLinks links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * List relation response links.
   *
   * @return links
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ListRelationCatalogResponseLinks getLinks() {
    return links;
  }

  public void setLinks(ListRelationCatalogResponseLinks links) {
    this.links = links;
  }

  public ListRelationCatalogResponse meta(RelationResponseMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Relation response metadata.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public RelationResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(RelationResponseMeta meta) {
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
   * @return ListRelationCatalogResponse
   */
  @JsonAnySetter
  public ListRelationCatalogResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ListRelationCatalogResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRelationCatalogResponse listRelationCatalogResponse = (ListRelationCatalogResponse) o;
    return Objects.equals(this.data, listRelationCatalogResponse.data)
        && Objects.equals(this.included, listRelationCatalogResponse.included)
        && Objects.equals(this.links, listRelationCatalogResponse.links)
        && Objects.equals(this.meta, listRelationCatalogResponse.meta)
        && Objects.equals(
            this.additionalProperties, listRelationCatalogResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, links, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRelationCatalogResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
