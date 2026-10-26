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

/** Response containing a page of tag indexing rule exemptions. */
@JsonPropertyOrder({
  TagIndexingRuleExemptionsResponse.JSON_PROPERTY_DATA,
  TagIndexingRuleExemptionsResponse.JSON_PROPERTY_LINKS,
  TagIndexingRuleExemptionsResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TagIndexingRuleExemptionsResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<TagIndexingRuleExemptionData> data = null;

  public static final String JSON_PROPERTY_LINKS = "links";
  private MetricsListResponseLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private MetricPaginationMeta meta;

  public TagIndexingRuleExemptionsResponse data(List<TagIndexingRuleExemptionData> data) {
    this.data = data;
    if (data != null) {
      for (TagIndexingRuleExemptionData item : data) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public TagIndexingRuleExemptionsResponse addDataItem(TagIndexingRuleExemptionData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * Array of tag indexing rule exemption objects.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<TagIndexingRuleExemptionData> getData() {
    return data;
  }

  public void setData(List<TagIndexingRuleExemptionData> data) {
    this.data = data;
    if (data != null) {
      for (TagIndexingRuleExemptionData item : data) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public TagIndexingRuleExemptionsResponse links(MetricsListResponseLinks links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * Pagination links. Only present if pagination query parameters were provided.
   *
   * @return links
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MetricsListResponseLinks getLinks() {
    return links;
  }

  public void setLinks(MetricsListResponseLinks links) {
    this.links = links;
    if (links != null) {
      this.unparsed |= links.unparsed;
    }
  }

  public TagIndexingRuleExemptionsResponse meta(MetricPaginationMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Response metadata object.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MetricPaginationMeta getMeta() {
    return meta;
  }

  public void setMeta(MetricPaginationMeta meta) {
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
   * @return TagIndexingRuleExemptionsResponse
   */
  @JsonAnySetter
  public TagIndexingRuleExemptionsResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TagIndexingRuleExemptionsResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagIndexingRuleExemptionsResponse tagIndexingRuleExemptionsResponse =
        (TagIndexingRuleExemptionsResponse) o;
    return Objects.equals(this.data, tagIndexingRuleExemptionsResponse.data)
        && Objects.equals(this.links, tagIndexingRuleExemptionsResponse.links)
        && Objects.equals(this.meta, tagIndexingRuleExemptionsResponse.meta)
        && Objects.equals(
            this.additionalProperties, tagIndexingRuleExemptionsResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagIndexingRuleExemptionsResponse {\n");
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
