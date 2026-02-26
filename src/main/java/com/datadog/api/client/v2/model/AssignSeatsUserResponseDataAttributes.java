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

 */
@JsonPropertyOrder({
  AssignSeatsUserResponseDataAttributes.JSON_PROPERTY_ASSIGNED_IDS,
  AssignSeatsUserResponseDataAttributes.JSON_PROPERTY_PRODUCT_CODE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AssignSeatsUserResponseDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ASSIGNED_IDS = "assigned_ids";
  private List<String> assignedIds = null;

  public static final String JSON_PROPERTY_PRODUCT_CODE = "product_code";
  private String productCode;

  public AssignSeatsUserResponseDataAttributes assignedIds(List<String> assignedIds) {
    this.assignedIds = assignedIds;
    return this;
  }
  public AssignSeatsUserResponseDataAttributes addAssignedIdsItem(String assignedIdsItem) {
    if (this.assignedIds == null) {
      this.assignedIds = new ArrayList<>();
    }
    this.assignedIds.add(assignedIdsItem);
    return this;
  }

  /**
   * <p>The list of user IDs to which the seats were assigned.</p>
   * @return assignedIds
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ASSIGNED_IDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getAssignedIds() {
        return assignedIds;
      }
  public void setAssignedIds(List<String> assignedIds) {
    this.assignedIds = assignedIds;
  }
  public AssignSeatsUserResponseDataAttributes productCode(String productCode) {
    this.productCode = productCode;
    return this;
  }

  /**
   * <p>The product code for which the seats were assigned.</p>
   * @return productCode
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRODUCT_CODE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getProductCode() {
        return productCode;
      }
  public void setProductCode(String productCode) {
    this.productCode = productCode;
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
   * @return AssignSeatsUserResponseDataAttributes
   */
  @JsonAnySetter
  public AssignSeatsUserResponseDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this AssignSeatsUserResponseDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignSeatsUserResponseDataAttributes assignSeatsUserResponseDataAttributes = (AssignSeatsUserResponseDataAttributes) o;
    return Objects.equals(this.assignedIds, assignSeatsUserResponseDataAttributes.assignedIds) && Objects.equals(this.productCode, assignSeatsUserResponseDataAttributes.productCode) && Objects.equals(this.additionalProperties, assignSeatsUserResponseDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(assignedIds,productCode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignSeatsUserResponseDataAttributes {\n");
    sb.append("    assignedIds: ").append(toIndentedString(assignedIds)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
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
