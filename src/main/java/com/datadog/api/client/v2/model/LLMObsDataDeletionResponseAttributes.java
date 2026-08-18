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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of a submitted LLM Observability data deletion request. */
@JsonPropertyOrder({
  LLMObsDataDeletionResponseAttributes.JSON_PROPERTY_CREATED_AT,
  LLMObsDataDeletionResponseAttributes.JSON_PROPERTY_CREATED_BY,
  LLMObsDataDeletionResponseAttributes.JSON_PROPERTY_FROM_TIME,
  LLMObsDataDeletionResponseAttributes.JSON_PROPERTY_ORG_ID,
  LLMObsDataDeletionResponseAttributes.JSON_PROPERTY_PRODUCT,
  LLMObsDataDeletionResponseAttributes.JSON_PROPERTY_QUERY,
  LLMObsDataDeletionResponseAttributes.JSON_PROPERTY_TO_TIME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsDataDeletionResponseAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_FROM_TIME = "from_time";
  private Long fromTime;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_PRODUCT = "product";
  private String product;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_TO_TIME = "to_time";
  private Long toTime;

  public LLMObsDataDeletionResponseAttributes() {}

  @JsonCreator
  public LLMObsDataDeletionResponseAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) String createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM_TIME) Long fromTime,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_ID) Long orgId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PRODUCT) String product,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO_TIME) Long toTime) {
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.fromTime = fromTime;
    this.orgId = orgId;
    this.product = product;
    this.query = query;
    this.toTime = toTime;
  }

  public LLMObsDataDeletionResponseAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the deletion request was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LLMObsDataDeletionResponseAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * UUID of the user who created the deletion request.
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public LLMObsDataDeletionResponseAttributes fromTime(Long fromTime) {
    this.fromTime = fromTime;
    return this;
  }

  /**
   * Start of the deletion time range in milliseconds since Unix epoch.
   *
   * @return fromTime
   */
  @JsonProperty(JSON_PROPERTY_FROM_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFromTime() {
    return fromTime;
  }

  public void setFromTime(Long fromTime) {
    this.fromTime = fromTime;
  }

  public LLMObsDataDeletionResponseAttributes orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * ID of the organization that submitted the deletion request.
   *
   * @return orgId
   */
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public LLMObsDataDeletionResponseAttributes product(String product) {
    this.product = product;
    return this;
  }

  /**
   * Product name for the deletion request.
   *
   * @return product
   */
  @JsonProperty(JSON_PROPERTY_PRODUCT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public LLMObsDataDeletionResponseAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The query string used to select data for deletion.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public LLMObsDataDeletionResponseAttributes toTime(Long toTime) {
    this.toTime = toTime;
    return this;
  }

  /**
   * End of the deletion time range in milliseconds since Unix epoch.
   *
   * @return toTime
   */
  @JsonProperty(JSON_PROPERTY_TO_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getToTime() {
    return toTime;
  }

  public void setToTime(Long toTime) {
    this.toTime = toTime;
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
   * @return LLMObsDataDeletionResponseAttributes
   */
  @JsonAnySetter
  public LLMObsDataDeletionResponseAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsDataDeletionResponseAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsDataDeletionResponseAttributes llmObsDataDeletionResponseAttributes =
        (LLMObsDataDeletionResponseAttributes) o;
    return Objects.equals(this.createdAt, llmObsDataDeletionResponseAttributes.createdAt)
        && Objects.equals(this.createdBy, llmObsDataDeletionResponseAttributes.createdBy)
        && Objects.equals(this.fromTime, llmObsDataDeletionResponseAttributes.fromTime)
        && Objects.equals(this.orgId, llmObsDataDeletionResponseAttributes.orgId)
        && Objects.equals(this.product, llmObsDataDeletionResponseAttributes.product)
        && Objects.equals(this.query, llmObsDataDeletionResponseAttributes.query)
        && Objects.equals(this.toTime, llmObsDataDeletionResponseAttributes.toTime)
        && Objects.equals(
            this.additionalProperties, llmObsDataDeletionResponseAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt, createdBy, fromTime, orgId, product, query, toTime, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsDataDeletionResponseAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    toTime: ").append(toIndentedString(toTime)).append("\n");
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
