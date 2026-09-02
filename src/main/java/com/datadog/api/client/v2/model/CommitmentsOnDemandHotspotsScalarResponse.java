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

/** Response containing scalar on-demand hot-spots data for cloud commitment programs. */
@JsonPropertyOrder({
  CommitmentsOnDemandHotspotsScalarResponse.JSON_PROPERTY_COLUMNS,
  CommitmentsOnDemandHotspotsScalarResponse.JSON_PROPERTY_META,
  CommitmentsOnDemandHotspotsScalarResponse.JSON_PROPERTY_TOTAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CommitmentsOnDemandHotspotsScalarResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<CommitmentsScalarColumn> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_META = "meta";
  private CommitmentsOnDemandHotspotsScalarMeta meta;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private List<CommitmentsScalarColumn> total = new ArrayList<>();

  public CommitmentsOnDemandHotspotsScalarResponse() {}

  @JsonCreator
  public CommitmentsOnDemandHotspotsScalarResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMNS)
          List<CommitmentsScalarColumn> columns,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL)
          List<CommitmentsScalarColumn> total) {
    this.columns = columns;
    for (CommitmentsScalarColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    this.total = total;
    for (CommitmentsScalarColumn item : total) {
      this.unparsed |= item.unparsed;
    }
  }

  public CommitmentsOnDemandHotspotsScalarResponse columns(List<CommitmentsScalarColumn> columns) {
    this.columns = columns;
    for (CommitmentsScalarColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CommitmentsOnDemandHotspotsScalarResponse addColumnsItem(
      CommitmentsScalarColumn columnsItem) {
    this.columns.add(columnsItem);
    this.unparsed |= columnsItem.unparsed;
    return this;
  }

  /**
   * Array of scalar columns in the response.
   *
   * @return columns
   */
  @JsonProperty(JSON_PROPERTY_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CommitmentsScalarColumn> getColumns() {
    return columns;
  }

  public void setColumns(List<CommitmentsScalarColumn> columns) {
    this.columns = columns;
    if (columns != null) {
      for (CommitmentsScalarColumn item : columns) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public CommitmentsOnDemandHotspotsScalarResponse meta(
      CommitmentsOnDemandHotspotsScalarMeta meta) {
    this.meta = meta;
    this.unparsed |= meta.unparsed;
    return this;
  }

  /**
   * Metadata for the on-demand hot-spots scalar response.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CommitmentsOnDemandHotspotsScalarMeta getMeta() {
    return meta;
  }

  public void setMeta(CommitmentsOnDemandHotspotsScalarMeta meta) {
    this.meta = meta;
    if (meta != null) {
      this.unparsed |= meta.unparsed;
    }
  }

  public CommitmentsOnDemandHotspotsScalarResponse total(List<CommitmentsScalarColumn> total) {
    this.total = total;
    for (CommitmentsScalarColumn item : total) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CommitmentsOnDemandHotspotsScalarResponse addTotalItem(CommitmentsScalarColumn totalItem) {
    this.total.add(totalItem);
    this.unparsed |= totalItem.unparsed;
    return this;
  }

  /**
   * Array of scalar columns in the response.
   *
   * @return total
   */
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CommitmentsScalarColumn> getTotal() {
    return total;
  }

  public void setTotal(List<CommitmentsScalarColumn> total) {
    this.total = total;
    if (total != null) {
      for (CommitmentsScalarColumn item : total) {
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
   * @return CommitmentsOnDemandHotspotsScalarResponse
   */
  @JsonAnySetter
  public CommitmentsOnDemandHotspotsScalarResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CommitmentsOnDemandHotspotsScalarResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitmentsOnDemandHotspotsScalarResponse commitmentsOnDemandHotspotsScalarResponse =
        (CommitmentsOnDemandHotspotsScalarResponse) o;
    return Objects.equals(this.columns, commitmentsOnDemandHotspotsScalarResponse.columns)
        && Objects.equals(this.meta, commitmentsOnDemandHotspotsScalarResponse.meta)
        && Objects.equals(this.total, commitmentsOnDemandHotspotsScalarResponse.total)
        && Objects.equals(
            this.additionalProperties,
            commitmentsOnDemandHotspotsScalarResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, meta, total, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitmentsOnDemandHotspotsScalarResponse {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
