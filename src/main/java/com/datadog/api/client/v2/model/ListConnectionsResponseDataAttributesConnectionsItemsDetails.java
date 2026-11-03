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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Type-specific configuration of the connection. Only the field matching the connection type is
 * set.
 */
@JsonPropertyOrder({
  ListConnectionsResponseDataAttributesConnectionsItemsDetails.JSON_PROPERTY_REF_TABLE,
  ListConnectionsResponseDataAttributesConnectionsItemsDetails.JSON_PROPERTY_SNOWFLAKE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListConnectionsResponseDataAttributesConnectionsItemsDetails {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_REF_TABLE = "ref_table";
  private ListConnectionsResponseDataAttributesConnectionsItemsDetailsRefTable refTable;

  public static final String JSON_PROPERTY_SNOWFLAKE = "snowflake";
  private ListConnectionsResponseDataAttributesConnectionsItemsDetailsSnowflake snowflake;

  public ListConnectionsResponseDataAttributesConnectionsItemsDetails refTable(
      ListConnectionsResponseDataAttributesConnectionsItemsDetailsRefTable refTable) {
    this.refTable = refTable;
    this.unparsed |= refTable.unparsed;
    return this;
  }

  /**
   * Configuration of a reference table connection.
   *
   * @return refTable
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REF_TABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ListConnectionsResponseDataAttributesConnectionsItemsDetailsRefTable getRefTable() {
    return refTable;
  }

  public void setRefTable(
      ListConnectionsResponseDataAttributesConnectionsItemsDetailsRefTable refTable) {
    this.refTable = refTable;
    if (refTable != null) {
      this.unparsed |= refTable.unparsed;
    }
  }

  public ListConnectionsResponseDataAttributesConnectionsItemsDetails snowflake(
      ListConnectionsResponseDataAttributesConnectionsItemsDetailsSnowflake snowflake) {
    this.snowflake = snowflake;
    this.unparsed |= snowflake.unparsed;
    return this;
  }

  /**
   * Configuration of a Snowflake connection.
   *
   * @return snowflake
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SNOWFLAKE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ListConnectionsResponseDataAttributesConnectionsItemsDetailsSnowflake getSnowflake() {
    return snowflake;
  }

  public void setSnowflake(
      ListConnectionsResponseDataAttributesConnectionsItemsDetailsSnowflake snowflake) {
    this.snowflake = snowflake;
    if (snowflake != null) {
      this.unparsed |= snowflake.unparsed;
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
   * @return ListConnectionsResponseDataAttributesConnectionsItemsDetails
   */
  @JsonAnySetter
  public ListConnectionsResponseDataAttributesConnectionsItemsDetails putAdditionalProperty(
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
   * Return true if this ListConnectionsResponseDataAttributesConnectionsItemsDetails object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListConnectionsResponseDataAttributesConnectionsItemsDetails
        listConnectionsResponseDataAttributesConnectionsItemsDetails =
            (ListConnectionsResponseDataAttributesConnectionsItemsDetails) o;
    return Objects.equals(
            this.refTable, listConnectionsResponseDataAttributesConnectionsItemsDetails.refTable)
        && Objects.equals(
            this.snowflake, listConnectionsResponseDataAttributesConnectionsItemsDetails.snowflake)
        && Objects.equals(
            this.additionalProperties,
            listConnectionsResponseDataAttributesConnectionsItemsDetails.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refTable, snowflake, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListConnectionsResponseDataAttributesConnectionsItemsDetails {\n");
    sb.append("    refTable: ").append(toIndentedString(refTable)).append("\n");
    sb.append("    snowflake: ").append(toIndentedString(snowflake)).append("\n");
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
