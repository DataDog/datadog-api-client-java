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

/** Response containing the holdouts an experiment is attached to. */
@JsonPropertyOrder({ExperimentsExperimentHoldoutV2DTOArray.JSON_PROPERTY_DATA})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsExperimentHoldoutV2DTOArray {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<ExperimentsExperimentHoldoutV2DTOData> data = new ArrayList<>();

  public ExperimentsExperimentHoldoutV2DTOArray() {}

  @JsonCreator
  public ExperimentsExperimentHoldoutV2DTOArray(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          List<ExperimentsExperimentHoldoutV2DTOData> data) {
    this.data = data;
    for (ExperimentsExperimentHoldoutV2DTOData item : data) {
      this.unparsed |= item.unparsed;
    }
  }

  public ExperimentsExperimentHoldoutV2DTOArray data(
      List<ExperimentsExperimentHoldoutV2DTOData> data) {
    this.data = data;
    for (ExperimentsExperimentHoldoutV2DTOData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ExperimentsExperimentHoldoutV2DTOArray addDataItem(
      ExperimentsExperimentHoldoutV2DTOData dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * Holdouts the experiment is attached to, in evaluation order.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ExperimentsExperimentHoldoutV2DTOData> getData() {
    return data;
  }

  public void setData(List<ExperimentsExperimentHoldoutV2DTOData> data) {
    this.data = data;
    if (data != null) {
      for (ExperimentsExperimentHoldoutV2DTOData item : data) {
        this.unparsed |= item.unparsed;
      }
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
   * @return ExperimentsExperimentHoldoutV2DTOArray
   */
  @JsonAnySetter
  public ExperimentsExperimentHoldoutV2DTOArray putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsExperimentHoldoutV2DTOArray object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsExperimentHoldoutV2DTOArray experimentsExperimentHoldoutV2DtoArray =
        (ExperimentsExperimentHoldoutV2DTOArray) o;
    return Objects.equals(this.data, experimentsExperimentHoldoutV2DtoArray.data)
        && Objects.equals(
            this.additionalProperties, experimentsExperimentHoldoutV2DtoArray.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsExperimentHoldoutV2DTOArray {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
