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

/** The response object after an app is successfully updated. */
@JsonPropertyOrder({
  UpdateAppResponse.JSON_PROPERTY_DATA,
  UpdateAppResponse.JSON_PROPERTY_INCLUDED,
  UpdateAppResponse.JSON_PROPERTY_META,
  UpdateAppResponse.JSON_PROPERTY_RELATIONSHIP
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpdateAppResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private UpdateAppResponseData data;

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<Deployment> included = null;

  public static final String JSON_PROPERTY_META = "meta";
  private AppMeta meta;

  public static final String JSON_PROPERTY_RELATIONSHIP = "relationship";
  private AppRelationship relationship;

  public UpdateAppResponse data(UpdateAppResponseData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * The data object containing the updated app definition.
   *
   * @return data
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public UpdateAppResponseData getData() {
    return data;
  }

  public void setData(UpdateAppResponseData data) {
    this.data = data;
  }

  public UpdateAppResponse included(List<Deployment> included) {
    this.included = included;
    for (Deployment item : included) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public UpdateAppResponse addIncludedItem(Deployment includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * Data on the version of the app that was published.
   *
   * @return included
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Deployment> getIncluded() {
    return included;
  }

  public void setIncluded(List<Deployment> included) {
    this.included = included;
  }

  public UpdateAppResponse meta(AppMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Metadata of an app.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AppMeta getMeta() {
    return meta;
  }

  public void setMeta(AppMeta meta) {
    this.meta = meta;
  }

  public UpdateAppResponse relationship(AppRelationship relationship) {
    this.relationship = relationship;
    this.unparsed |= relationship.unparsed;
    return this;
  }

  /**
   * The app's publication relationship and custom connections.
   *
   * @return relationship
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELATIONSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AppRelationship getRelationship() {
    return relationship;
  }

  public void setRelationship(AppRelationship relationship) {
    this.relationship = relationship;
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
   * @return UpdateAppResponse
   */
  @JsonAnySetter
  public UpdateAppResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UpdateAppResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAppResponse updateAppResponse = (UpdateAppResponse) o;
    return Objects.equals(this.data, updateAppResponse.data)
        && Objects.equals(this.included, updateAppResponse.included)
        && Objects.equals(this.meta, updateAppResponse.meta)
        && Objects.equals(this.relationship, updateAppResponse.relationship)
        && Objects.equals(this.additionalProperties, updateAppResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included, meta, relationship, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAppResponse {\n");
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
