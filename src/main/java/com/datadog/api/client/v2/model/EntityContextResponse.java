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

/**
 * Response from the entity context endpoint, containing the matching entities and pagination
 * metadata.
 */
@JsonPropertyOrder({
  EntityContextResponse.JSON_PROPERTY_DATA,
  EntityContextResponse.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityContextResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<EntityContextEntity> data = new ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private EntityContextResponseMeta meta;

  public EntityContextResponse() {}

  @JsonCreator
  public EntityContextResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA) List<EntityContextEntity> data,
      @JsonProperty(required = true, value = JSON_PROPERTY_META) EntityContextResponseMeta meta) {
    this.data = data;
    this.meta = meta;
    this.unparsed |= meta.unparsed;
  }

  public EntityContextResponse data(List<EntityContextEntity> data) {
    this.data = data;
    for (EntityContextEntity item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public EntityContextResponse addDataItem(EntityContextEntity dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * The list of entities matching the query.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<EntityContextEntity> getData() {
    return data;
  }

  public void setData(List<EntityContextEntity> data) {
    this.data = data;
  }

  public EntityContextResponse meta(EntityContextResponseMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Metadata returned alongside the entity context response.
   *
   * @return meta
   */
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public EntityContextResponseMeta getMeta() {
    return meta;
  }

  public void setMeta(EntityContextResponseMeta meta) {
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
   * @return EntityContextResponse
   */
  @JsonAnySetter
  public EntityContextResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this EntityContextResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityContextResponse entityContextResponse = (EntityContextResponse) o;
    return Objects.equals(this.data, entityContextResponse.data)
        && Objects.equals(this.meta, entityContextResponse.meta)
        && Objects.equals(this.additionalProperties, entityContextResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityContextResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
