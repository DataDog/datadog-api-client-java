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

/** Upsert entity response. */
@JsonPropertyOrder({
  UpsertCatalogEntityResponse.JSON_PROPERTY_DATA,
  UpsertCatalogEntityResponse.JSON_PROPERTY_INCLUDED,
  UpsertCatalogEntityResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpsertCatalogEntityResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<EntityData> data = null;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<UpsertCatalogEntityResponseIncludedItem> included = null;

  public static final String JSON_PROPERTY_META = "meta";
  private EntityResponseMeta meta;

  public UpsertCatalogEntityResponse data(List<EntityData> data) {
    this.data = data;
    for (EntityData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public UpsertCatalogEntityResponse addDataItem(EntityData dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * List of entity data.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EntityData> getData() {
    return data;
  }

  public void setData(List<EntityData> data) {
    this.data = data;
  }

  public UpsertCatalogEntityResponse included(
      List<UpsertCatalogEntityResponseIncludedItem> included) {
    this.included = included;
    for (UpsertCatalogEntityResponseIncludedItem item : included) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public UpsertCatalogEntityResponse addIncludedItem(
      UpsertCatalogEntityResponseIncludedItem includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * Upsert entity response included.
   *
   * @return included
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<UpsertCatalogEntityResponseIncludedItem> getIncluded() {
    return included;
  }

  public void setIncluded(List<UpsertCatalogEntityResponseIncludedItem> included) {
    this.included = included;
  }

  public UpsertCatalogEntityResponse meta(EntityResponseMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Entity metadata.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EntityResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(EntityResponseMeta meta) {
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
   * @return UpsertCatalogEntityResponse
   */
  @JsonAnySetter
  public UpsertCatalogEntityResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UpsertCatalogEntityResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpsertCatalogEntityResponse upsertCatalogEntityResponse = (UpsertCatalogEntityResponse) o;
    return Objects.equals(this.data, upsertCatalogEntityResponse.data)
        && Objects.equals(this.included, upsertCatalogEntityResponse.included)
        && Objects.equals(this.meta, upsertCatalogEntityResponse.meta)
        && Objects.equals(
            this.additionalProperties, upsertCatalogEntityResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpsertCatalogEntityResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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
