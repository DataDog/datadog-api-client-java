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

/** Attributes of a scalar on-demand hot-spots response. */
@JsonPropertyOrder({
  CommitmentsOnDemandHotspotsScalarResponseAttributes.JSON_PROPERTY_COLUMNS,
  CommitmentsOnDemandHotspotsScalarResponseAttributes.JSON_PROPERTY_QUERY_DEFINITION,
  CommitmentsOnDemandHotspotsScalarResponseAttributes.JSON_PROPERTY_TOTAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CommitmentsOnDemandHotspotsScalarResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMNS = "columns";
  private List<CommitmentsScalarColumn> columns = new ArrayList<>();

  public static final String JSON_PROPERTY_QUERY_DEFINITION = "query_definition";
  private CommitmentsQueryDefinition queryDefinition;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private List<CommitmentsScalarColumn> total = new ArrayList<>();

  public CommitmentsOnDemandHotspotsScalarResponseAttributes() {}

  @JsonCreator
  public CommitmentsOnDemandHotspotsScalarResponseAttributes(
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

  public CommitmentsOnDemandHotspotsScalarResponseAttributes columns(
      List<CommitmentsScalarColumn> columns) {
    this.columns = columns;
    for (CommitmentsScalarColumn item : columns) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CommitmentsOnDemandHotspotsScalarResponseAttributes addColumnsItem(
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

  public CommitmentsOnDemandHotspotsScalarResponseAttributes queryDefinition(
      CommitmentsQueryDefinition queryDefinition) {
    this.queryDefinition = queryDefinition;
    this.unparsed |= queryDefinition.unparsed;
    return this;
  }

  /**
   * The query that produces the response values, in the same format as dashboard and notebook
   * widget requests, so a client can graph the values in a widget. Each formula's <code>id</code>
   * names the response value that it produces.
   *
   * @return queryDefinition
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CommitmentsQueryDefinition getQueryDefinition() {
    return queryDefinition;
  }

  public void setQueryDefinition(CommitmentsQueryDefinition queryDefinition) {
    this.queryDefinition = queryDefinition;
    if (queryDefinition != null) {
      this.unparsed |= queryDefinition.unparsed;
    }
  }

  public CommitmentsOnDemandHotspotsScalarResponseAttributes total(
      List<CommitmentsScalarColumn> total) {
    this.total = total;
    for (CommitmentsScalarColumn item : total) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CommitmentsOnDemandHotspotsScalarResponseAttributes addTotalItem(
      CommitmentsScalarColumn totalItem) {
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
   * @return CommitmentsOnDemandHotspotsScalarResponseAttributes
   */
  @JsonAnySetter
  public CommitmentsOnDemandHotspotsScalarResponseAttributes putAdditionalProperty(
      String key, Object value) {
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
   * Return true if this CommitmentsOnDemandHotspotsScalarResponseAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommitmentsOnDemandHotspotsScalarResponseAttributes
        commitmentsOnDemandHotspotsScalarResponseAttributes =
            (CommitmentsOnDemandHotspotsScalarResponseAttributes) o;
    return Objects.equals(this.columns, commitmentsOnDemandHotspotsScalarResponseAttributes.columns)
        && Objects.equals(
            this.queryDefinition,
            commitmentsOnDemandHotspotsScalarResponseAttributes.queryDefinition)
        && Objects.equals(this.total, commitmentsOnDemandHotspotsScalarResponseAttributes.total)
        && Objects.equals(
            this.additionalProperties,
            commitmentsOnDemandHotspotsScalarResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columns, queryDefinition, total, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommitmentsOnDemandHotspotsScalarResponseAttributes {\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    queryDefinition: ").append(toIndentedString(queryDefinition)).append("\n");
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
