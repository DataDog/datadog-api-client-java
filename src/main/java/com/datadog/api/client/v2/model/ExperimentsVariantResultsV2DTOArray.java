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

/** List of variant result resources. */
@JsonPropertyOrder({
  ExperimentsVariantResultsV2DTOArray.JSON_PROPERTY_DATA,
  ExperimentsVariantResultsV2DTOArray.JSON_PROPERTY_META
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsVariantResultsV2DTOArray {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<ExperimentsVariantResultsV2DTOData> data = new ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private ExperimentsExperimentResultsV2MetaDTO meta;

  public ExperimentsVariantResultsV2DTOArray() {}

  @JsonCreator
  public ExperimentsVariantResultsV2DTOArray(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          List<ExperimentsVariantResultsV2DTOData> data) {
    this.data = data;
    for (ExperimentsVariantResultsV2DTOData item : data) {
      this.unparsed |= item.unparsed;
    }
  }

  public ExperimentsVariantResultsV2DTOArray data(List<ExperimentsVariantResultsV2DTOData> data) {
    this.data = data;
    for (ExperimentsVariantResultsV2DTOData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ExperimentsVariantResultsV2DTOArray addDataItem(
      ExperimentsVariantResultsV2DTOData dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * Resources returned in this response.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ExperimentsVariantResultsV2DTOData> getData() {
    return data;
  }

  public void setData(List<ExperimentsVariantResultsV2DTOData> data) {
    this.data = data;
    if (data != null) {
      for (ExperimentsVariantResultsV2DTOData item : data) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsVariantResultsV2DTOArray meta(ExperimentsExperimentResultsV2MetaDTO meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Information about when experiment results were updated and whether they are stale.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsExperimentResultsV2MetaDTO getMeta() {
    return meta;
  }

  public void setMeta(ExperimentsExperimentResultsV2MetaDTO meta) {
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
   * @return ExperimentsVariantResultsV2DTOArray
   */
  @JsonAnySetter
  public ExperimentsVariantResultsV2DTOArray putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsVariantResultsV2DTOArray object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsVariantResultsV2DTOArray experimentsVariantResultsV2DtoArray =
        (ExperimentsVariantResultsV2DTOArray) o;
    return Objects.equals(this.data, experimentsVariantResultsV2DtoArray.data)
        && Objects.equals(this.meta, experimentsVariantResultsV2DtoArray.meta)
        && Objects.equals(
            this.additionalProperties, experimentsVariantResultsV2DtoArray.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, meta, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsVariantResultsV2DTOArray {\n");
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
