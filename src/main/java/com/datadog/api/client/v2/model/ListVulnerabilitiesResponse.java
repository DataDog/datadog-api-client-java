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
   * <p>The expected response schema when listing vulnerabilities.</p>
 */
@JsonPropertyOrder({
  ListVulnerabilitiesResponse.JSON_PROPERTY_DATA,
  ListVulnerabilitiesResponse.JSON_PROPERTY_LINKS,
  ListVulnerabilitiesResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListVulnerabilitiesResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<Vulnerability> data = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "links";
  private Links links;

  public static final String JSON_PROPERTY_META = "meta";
  private Metadata meta;

  public ListVulnerabilitiesResponse() {}

  @JsonCreator
  public ListVulnerabilitiesResponse(
            @JsonProperty(required=true, value=JSON_PROPERTY_DATA)List<Vulnerability> data) {
        this.data = data;
  }
  public ListVulnerabilitiesResponse data(List<Vulnerability> data) {
    this.data = data;
    for (Vulnerability item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public ListVulnerabilitiesResponse addDataItem(Vulnerability dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * <p>List of vulnerabilities.</p>
   * @return data
  **/
      @JsonProperty(JSON_PROPERTY_DATA)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<Vulnerability> getData() {
        return data;
      }
  public void setData(List<Vulnerability> data) {
    this.data = data;
  }
  public ListVulnerabilitiesResponse links(Links links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * <p>The JSON:API links related to pagination.</p>
   * @return links
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LINKS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Links getLinks() {
        return links;
      }
  public void setLinks(Links links) {
    this.links = links;
  }
  public ListVulnerabilitiesResponse meta(Metadata meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * <p>The metadata related to this request.</p>
   * @return meta
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_META)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Metadata getMeta() {
        return meta;
      }
  public void setMeta(Metadata meta) {
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
   * @return ListVulnerabilitiesResponse
   */
  @JsonAnySetter
  public ListVulnerabilitiesResponse putAdditionalProperty(String key, Object value) {
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
   * Return true if this ListVulnerabilitiesResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListVulnerabilitiesResponse listVulnerabilitiesResponse = (ListVulnerabilitiesResponse) o;
    return Objects.equals(this.data, listVulnerabilitiesResponse.data) && Objects.equals(this.links, listVulnerabilitiesResponse.links) && Objects.equals(this.meta, listVulnerabilitiesResponse.meta) && Objects.equals(this.additionalProperties, listVulnerabilitiesResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(data,links,meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListVulnerabilitiesResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
