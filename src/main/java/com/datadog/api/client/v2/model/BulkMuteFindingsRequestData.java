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
   * <p>Data object containing the new bulk mute properties of the finding.</p>
 */
@JsonPropertyOrder({
  BulkMuteFindingsRequestData.JSON_PROPERTY_ATTRIBUTES,
  BulkMuteFindingsRequestData.JSON_PROPERTY_ID,
  BulkMuteFindingsRequestData.JSON_PROPERTY_META,
  BulkMuteFindingsRequestData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BulkMuteFindingsRequestData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private BulkMuteFindingsRequestAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_META = "meta";
  private BulkMuteFindingsRequestMeta meta;

  public static final String JSON_PROPERTY_TYPE = "type";
  private FindingType type = FindingType.FINDING;

  public BulkMuteFindingsRequestData() {}

  @JsonCreator
  public BulkMuteFindingsRequestData(
            @JsonProperty(required=true, value=JSON_PROPERTY_ATTRIBUTES)BulkMuteFindingsRequestAttributes attributes,
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_META)BulkMuteFindingsRequestMeta meta,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)FindingType type) {
        this.attributes = attributes;
        this.unparsed |= attributes.unparsed;
        this.id = id;
        this.meta = meta;
        this.unparsed |= meta.unparsed;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public BulkMuteFindingsRequestData attributes(BulkMuteFindingsRequestAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * <p>The mute properties to be updated.</p>
   * @return attributes
  **/
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public BulkMuteFindingsRequestAttributes getAttributes() {
        return attributes;
      }
  public void setAttributes(BulkMuteFindingsRequestAttributes attributes) {
    this.attributes = attributes;
  }
  public BulkMuteFindingsRequestData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>UUID to identify the request</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public BulkMuteFindingsRequestData meta(BulkMuteFindingsRequestMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * <p>Meta object containing the findings to be updated.</p>
   * @return meta
  **/
      @JsonProperty(JSON_PROPERTY_META)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public BulkMuteFindingsRequestMeta getMeta() {
        return meta;
      }
  public void setMeta(BulkMuteFindingsRequestMeta meta) {
    this.meta = meta;
  }
  public BulkMuteFindingsRequestData type(FindingType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The JSON:API type for findings.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public FindingType getType() {
        return type;
      }
  public void setType(FindingType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
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
   * @return BulkMuteFindingsRequestData
   */
  @JsonAnySetter
  public BulkMuteFindingsRequestData putAdditionalProperty(String key, Object value) {
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
   * Return true if this BulkMuteFindingsRequestData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkMuteFindingsRequestData bulkMuteFindingsRequestData = (BulkMuteFindingsRequestData) o;
    return Objects.equals(this.attributes, bulkMuteFindingsRequestData.attributes) && Objects.equals(this.id, bulkMuteFindingsRequestData.id) && Objects.equals(this.meta, bulkMuteFindingsRequestData.meta) && Objects.equals(this.type, bulkMuteFindingsRequestData.type) && Objects.equals(this.additionalProperties, bulkMuteFindingsRequestData.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,id,meta,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkMuteFindingsRequestData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
