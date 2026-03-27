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

/** The expected response schema when listing assets SBOMs. */
@JsonPropertyOrder({
  ListAssetsSBOMsResponse.JSON_PROPERTY_DATA,
  ListAssetsSBOMsResponse.JSON_PROPERTY_LINKS,
  ListAssetsSBOMsResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListAssetsSBOMsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<SBOM> data = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "links";
  private Links links;

  public static final String JSON_PROPERTY_META = "meta";
  private Metadata meta;

  public ListAssetsSBOMsResponse() {}

  @JsonCreator
  public ListAssetsSBOMsResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA) List<SBOM> data) {
    this.data = data;
  }

  public ListAssetsSBOMsResponse data(List<SBOM> data) {
    this.data = data;
    for (SBOM item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ListAssetsSBOMsResponse addDataItem(SBOM dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * List of assets SBOMs.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SBOM> getData() {
    return data;
  }

  public void setData(List<SBOM> data) {
    this.data = data;
  }

  public ListAssetsSBOMsResponse links(Links links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * The JSON:API links related to pagination.
   *
   * @return links
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Links getLinks() {
    return links;
  }

  public void setLinks(Links links) {
    this.links = links;
  }

  public ListAssetsSBOMsResponse meta(Metadata meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * The metadata related to this request.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Metadata getMeta() {
    return meta;
  }

  public void setMeta(Metadata meta) {
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
   * @return ListAssetsSBOMsResponse
   */
  @JsonAnySetter
  public ListAssetsSBOMsResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ListAssetsSBOMsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListAssetsSBOMsResponse listAssetsSboMsResponse = (ListAssetsSBOMsResponse) o;
    return Objects.equals(this.data, listAssetsSboMsResponse.data)
        && Objects.equals(this.links, listAssetsSboMsResponse.links)
        && Objects.equals(this.meta, listAssetsSboMsResponse.meta)
        && Objects.equals(this.additionalProperties, listAssetsSboMsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListAssetsSBOMsResponse {\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
