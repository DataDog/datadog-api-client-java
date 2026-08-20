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

/** Attributes of a retention list response, containing the matching entity rows. */
@JsonPropertyOrder({
  ProductAnalyticsRetentionListResponseAttributes.JSON_PROPERTY_RECORDS,
  ProductAnalyticsRetentionListResponseAttributes.JSON_PROPERTY_RETENTION_ENTITY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsRetentionListResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RECORDS = "records";
  private List<Map<String, Object>> records = null;

  public static final String JSON_PROPERTY_RETENTION_ENTITY = "retention_entity";
  private String retentionEntity;

  public ProductAnalyticsRetentionListResponseAttributes records(
      List<Map<String, Object>> records) {
    this.records = records;
    return this;
  }

  public ProductAnalyticsRetentionListResponseAttributes addRecordsItem(
      Map<String, Object> recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<>();
    }
    this.records.add(recordsItem);
    return this;
  }

  /**
   * The matching entity rows.
   *
   * @return records
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Map<String, Object>> getRecords() {
    return records;
  }

  public void setRecords(List<Map<String, Object>> records) {
    this.records = records;
  }

  public ProductAnalyticsRetentionListResponseAttributes retentionEntity(String retentionEntity) {
    this.retentionEntity = retentionEntity;
    return this;
  }

  /**
   * The entity whose retention was measured.
   *
   * @return retentionEntity
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RETENTION_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRetentionEntity() {
    return retentionEntity;
  }

  public void setRetentionEntity(String retentionEntity) {
    this.retentionEntity = retentionEntity;
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
   * @return ProductAnalyticsRetentionListResponseAttributes
   */
  @JsonAnySetter
  public ProductAnalyticsRetentionListResponseAttributes putAdditionalProperty(
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

  /** Return true if this ProductAnalyticsRetentionListResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsRetentionListResponseAttributes
        productAnalyticsRetentionListResponseAttributes =
            (ProductAnalyticsRetentionListResponseAttributes) o;
    return Objects.equals(this.records, productAnalyticsRetentionListResponseAttributes.records)
        && Objects.equals(
            this.retentionEntity, productAnalyticsRetentionListResponseAttributes.retentionEntity)
        && Objects.equals(
            this.additionalProperties,
            productAnalyticsRetentionListResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(records, retentionEntity, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsRetentionListResponseAttributes {\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    retentionEntity: ").append(toIndentedString(retentionEntity)).append("\n");
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
