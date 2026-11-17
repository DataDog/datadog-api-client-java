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

/** Response containing a page of bandit summaries. */
@JsonPropertyOrder({
  ExperimentsBanditV2ListDTOArray.JSON_PROPERTY_DATA,
  ExperimentsBanditV2ListDTOArray.JSON_PROPERTY_LINKS,
  ExperimentsBanditV2ListDTOArray.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditV2ListDTOArray {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<ExperimentsBanditV2ListDTOData> data = new ArrayList<>();

  public static final String JSON_PROPERTY_LINKS = "links";
  private ExperimentsOffsetLinks links;

  public static final String JSON_PROPERTY_META = "meta";
  private ExperimentsOffsetMeta meta;

  public ExperimentsBanditV2ListDTOArray() {}

  @JsonCreator
  public ExperimentsBanditV2ListDTOArray(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          List<ExperimentsBanditV2ListDTOData> data,
      @JsonProperty(required = true, value = JSON_PROPERTY_LINKS) ExperimentsOffsetLinks links,
      @JsonProperty(required = true, value = JSON_PROPERTY_META) ExperimentsOffsetMeta meta) {
    this.data = data;
    for (ExperimentsBanditV2ListDTOData item : data) {
      this.unparsed |= item.unparsed;
    }
    this.links = links;
    this.unparsed |= links.unparsed;
    this.meta = meta;
    this.unparsed |= meta.unparsed;
  }

  public ExperimentsBanditV2ListDTOArray data(List<ExperimentsBanditV2ListDTOData> data) {
    this.data = data;
    for (ExperimentsBanditV2ListDTOData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ExperimentsBanditV2ListDTOArray addDataItem(ExperimentsBanditV2ListDTOData dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * Bandits on this page.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ExperimentsBanditV2ListDTOData> getData() {
    return data;
  }

  public void setData(List<ExperimentsBanditV2ListDTOData> data) {
    this.data = data;
    if (data != null) {
      for (ExperimentsBanditV2ListDTOData item : data) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsBanditV2ListDTOArray links(ExperimentsOffsetLinks links) {
    this.links = links;
    this.unparsed |= links.unparsed;
    return this;
  }

  /**
   * Links for navigating a paginated result set.
   *
   * @return links
   */
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsOffsetLinks getLinks() {
    return links;
  }

  public void setLinks(ExperimentsOffsetLinks links) {
    this.links = links;
    if (links != null) {
      this.unparsed |= links.unparsed;
    }
  }

  public ExperimentsBanditV2ListDTOArray meta(ExperimentsOffsetMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Pagination information for a list response.
   *
   * @return meta
   */
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsOffsetMeta getMeta() {
    return meta;
  }

  public void setMeta(ExperimentsOffsetMeta meta) {
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
   * @return ExperimentsBanditV2ListDTOArray
   */
  @JsonAnySetter
  public ExperimentsBanditV2ListDTOArray putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsBanditV2ListDTOArray object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditV2ListDTOArray experimentsBanditV2ListDtoArray =
        (ExperimentsBanditV2ListDTOArray) o;
    return Objects.equals(this.data, experimentsBanditV2ListDtoArray.data)
        && Objects.equals(this.links, experimentsBanditV2ListDtoArray.links)
        && Objects.equals(this.meta, experimentsBanditV2ListDtoArray.meta)
        && Objects.equals(
            this.additionalProperties, experimentsBanditV2ListDtoArray.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditV2ListDTOArray {\n");
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
