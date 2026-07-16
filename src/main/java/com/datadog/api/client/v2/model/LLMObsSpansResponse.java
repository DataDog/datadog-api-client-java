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

/** Response containing a list of LLM Observability spans. */
@JsonPropertyOrder({
  LLMObsSpansResponse.JSON_PROPERTY_DATA,
  LLMObsSpansResponse.JSON_PROPERTY_LINKS,
  LLMObsSpansResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsSpansResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<LLMObsSpanData> data = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "links";
  private LLMObsSpansResponseLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private LLMObsSpansResponseMeta meta;

  public LLMObsSpansResponse() {}

  @JsonCreator
  public LLMObsSpansResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA) List<LLMObsSpanData> data,
      @JsonProperty(required = true, value = JSON_PROPERTY_META) LLMObsSpansResponseMeta meta) {
    this.data = data;
    for (LLMObsSpanData item : data) {
      this.unparsed |= item.unparsed;
    }
    this.meta = meta;
    this.unparsed |= meta.unparsed;
  }

  public LLMObsSpansResponse data(List<LLMObsSpanData> data) {
    this.data = data;
    for (LLMObsSpanData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsSpansResponse addDataItem(LLMObsSpanData dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * List of spans matching the query.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<LLMObsSpanData> getData() {
    return data;
  }

  public void setData(List<LLMObsSpanData> data) {
    this.data = data;
    if (data != null) {
      for (LLMObsSpanData item : data) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsSpansResponse links(LLMObsSpansResponseLinks links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * Pagination links accompanying the spans response.
   *
   * @return links
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public LLMObsSpansResponseLinks getLinks() {
    return links;
  }

  public void setLinks(LLMObsSpansResponseLinks links) {
    this.links = links;
    if (links != null) {
      this.unparsed |= links.unparsed;
    }
  }

  public LLMObsSpansResponse meta(LLMObsSpansResponseMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Metadata accompanying the spans response.
   *
   * @return meta
   */
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsSpansResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(LLMObsSpansResponseMeta meta) {
    this.meta = meta;
    if (meta != null) {
      this.unparsed |= meta.unparsed;
    }
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
   * @return LLMObsSpansResponse
   */
  @JsonAnySetter
  public LLMObsSpansResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsSpansResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsSpansResponse llmObsSpansResponse = (LLMObsSpansResponse) o;
    return Objects.equals(this.data, llmObsSpansResponse.data)
        && Objects.equals(this.links, llmObsSpansResponse.links)
        && Objects.equals(this.meta, llmObsSpansResponse.meta)
        && Objects.equals(this.additionalProperties, llmObsSpansResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsSpansResponse {\n");
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
