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
   * <p>The full app definition response object.</p>
 */
@JsonPropertyOrder({
  GetAppResponse.JSON_PROPERTY_DATA,
  GetAppResponse.JSON_PROPERTY_INCLUDED,
  GetAppResponse.JSON_PROPERTY_META,
  GetAppResponse.JSON_PROPERTY_RELATIONSHIP
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GetAppResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private GetAppResponseData data;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<Deployment> included = null;

  public static final String JSON_PROPERTY_META = "meta";
  private AppMeta meta;

  public static final String JSON_PROPERTY_RELATIONSHIP = "relationship";
  private AppRelationship relationship;

  public GetAppResponse data(GetAppResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * <p>The data object containing the app definition.</p>
   * @return data
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public GetAppResponseData getData() {
        return data;
      }
  public void setData(GetAppResponseData data) {
    this.data = data;
  }
  public GetAppResponse included(List<Deployment> included) {
    this.included = included;
    for (Deployment item : included) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public GetAppResponse addIncludedItem(Deployment includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * <p>Data on the version of the app that was published.</p>
   * @return included
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INCLUDED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<Deployment> getIncluded() {
        return included;
      }
  public void setIncluded(List<Deployment> included) {
    this.included = included;
  }
  public GetAppResponse meta(AppMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * <p>Metadata of an app.</p>
   * @return meta
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_META)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AppMeta getMeta() {
        return meta;
      }
  public void setMeta(AppMeta meta) {
    this.meta = meta;
  }
  public GetAppResponse relationship(AppRelationship relationship) {
    this.relationship = relationship;
    this.unparsed |= relationship.unparsed;
    return this;
  }

  /**
   * <p>The app's publication relationship and custom connections.</p>
   * @return relationship
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RELATIONSHIP)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AppRelationship getRelationship() {
        return relationship;
      }
  public void setRelationship(AppRelationship relationship) {
    this.relationship = relationship;
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
   * @return GetAppResponse
   */
  @JsonAnySetter
  public GetAppResponse putAdditionalProperty(String key, Object value) {
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
   * Return true if this GetAppResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAppResponse getAppResponse = (GetAppResponse) o;
    return Objects.equals(this.data, getAppResponse.data) && Objects.equals(this.included, getAppResponse.included) && Objects.equals(this.meta, getAppResponse.meta) && Objects.equals(this.relationship, getAppResponse.relationship) && Objects.equals(this.additionalProperties, getAppResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(data,included,meta,relationship, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAppResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
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
