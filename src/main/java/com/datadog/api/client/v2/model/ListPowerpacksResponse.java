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
   * <p>Response object which includes all powerpack configurations.</p>
 */
@JsonPropertyOrder({
  ListPowerpacksResponse.JSON_PROPERTY_DATA,
  ListPowerpacksResponse.JSON_PROPERTY_INCLUDED,
  ListPowerpacksResponse.JSON_PROPERTY_LINKS,
  ListPowerpacksResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListPowerpacksResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<PowerpackData> data = null;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<User> included = null;

  public static final String JSON_PROPERTY_LINKS = "links";
  private PowerpackResponseLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private PowerpacksResponseMeta meta;

  public ListPowerpacksResponse data(List<PowerpackData> data) {
    this.data = data;
    for (PowerpackData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ListPowerpacksResponse addDataItem(PowerpackData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * <p>List of powerpack definitions.</p>
   * @return data
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<PowerpackData> getData() {
        return data;
      }
  public void setData(List<PowerpackData> data) {
    this.data = data;
  }
  public ListPowerpacksResponse included(List<User> included) {
    this.included = included;
    for (User item : included) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ListPowerpacksResponse addIncludedItem(User includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * <p>Array of objects related to the users.</p>
   * @return included
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INCLUDED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<User> getIncluded() {
        return included;
      }
  public void setIncluded(List<User> included) {
    this.included = included;
  }
  public ListPowerpacksResponse links(PowerpackResponseLinks links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * <p>Links attributes.</p>
   * @return links
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LINKS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public PowerpackResponseLinks getLinks() {
        return links;
      }
  public void setLinks(PowerpackResponseLinks links) {
    this.links = links;
  }
  public ListPowerpacksResponse meta(PowerpacksResponseMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * <p>Powerpack response metadata.</p>
   * @return meta
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_META)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public PowerpacksResponseMeta getMeta() {
        return meta;
      }
  public void setMeta(PowerpacksResponseMeta meta) {
    this.meta = meta;
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
   * @return ListPowerpacksResponse
   */
  @JsonAnySetter
  public ListPowerpacksResponse putAdditionalProperty(String key, Object value) {
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
   * Return true if this ListPowerpacksResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPowerpacksResponse listPowerpacksResponse = (ListPowerpacksResponse) o;
    return Objects.equals(this.data, listPowerpacksResponse.data) && Objects.equals(this.included, listPowerpacksResponse.included) && Objects.equals(this.links, listPowerpacksResponse.links) && Objects.equals(this.meta, listPowerpacksResponse.meta) && Objects.equals(this.additionalProperties, listPowerpacksResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(data,included,links,meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPowerpacksResponse {\n");
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
