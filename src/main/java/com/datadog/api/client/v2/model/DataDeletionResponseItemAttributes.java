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
   * <p>Deletion attribute for data deletion response.</p>
 */
@JsonPropertyOrder({
  DataDeletionResponseItemAttributes.JSON_PROPERTY_CREATED_AT,
  DataDeletionResponseItemAttributes.JSON_PROPERTY_CREATED_BY,
  DataDeletionResponseItemAttributes.JSON_PROPERTY_FROM_TIME,
  DataDeletionResponseItemAttributes.JSON_PROPERTY_INDEXES,
  DataDeletionResponseItemAttributes.JSON_PROPERTY_IS_CREATED,
  DataDeletionResponseItemAttributes.JSON_PROPERTY_ORG_ID,
  DataDeletionResponseItemAttributes.JSON_PROPERTY_PRODUCT,
  DataDeletionResponseItemAttributes.JSON_PROPERTY_QUERY,
  DataDeletionResponseItemAttributes.JSON_PROPERTY_STARTING_AT,
  DataDeletionResponseItemAttributes.JSON_PROPERTY_STATUS,
  DataDeletionResponseItemAttributes.JSON_PROPERTY_TO_TIME,
  DataDeletionResponseItemAttributes.JSON_PROPERTY_TOTAL_UNRESTRICTED,
  DataDeletionResponseItemAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DataDeletionResponseItemAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_FROM_TIME = "from_time";
  private Long fromTime;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_IS_CREATED = "is_created";
  private Boolean isCreated;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_PRODUCT = "product";
  private String product;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_STARTING_AT = "starting_at";
  private String startingAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_TO_TIME = "to_time";
  private Long toTime;

  public static final String JSON_PROPERTY_TOTAL_UNRESTRICTED = "total_unrestricted";
  private Long totalUnrestricted;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public DataDeletionResponseItemAttributes() {}

  @JsonCreator
  public DataDeletionResponseItemAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED_AT)String createdAt,
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED_BY)String createdBy,
            @JsonProperty(required=true, value=JSON_PROPERTY_FROM_TIME)Long fromTime,
            @JsonProperty(required=true, value=JSON_PROPERTY_IS_CREATED)Boolean isCreated,
            @JsonProperty(required=true, value=JSON_PROPERTY_ORG_ID)Long orgId,
            @JsonProperty(required=true, value=JSON_PROPERTY_PRODUCT)String product,
            @JsonProperty(required=true, value=JSON_PROPERTY_QUERY)String query,
            @JsonProperty(required=true, value=JSON_PROPERTY_STARTING_AT)String startingAt,
            @JsonProperty(required=true, value=JSON_PROPERTY_STATUS)String status,
            @JsonProperty(required=true, value=JSON_PROPERTY_TO_TIME)Long toTime,
            @JsonProperty(required=true, value=JSON_PROPERTY_TOTAL_UNRESTRICTED)Long totalUnrestricted,
            @JsonProperty(required=true, value=JSON_PROPERTY_UPDATED_AT)String updatedAt) {
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.fromTime = fromTime;
        this.isCreated = isCreated;
        this.orgId = orgId;
        this.product = product;
        this.query = query;
        this.startingAt = startingAt;
        this.status = status;
        this.toTime = toTime;
        this.totalUnrestricted = totalUnrestricted;
        this.updatedAt = updatedAt;
  }
  public DataDeletionResponseItemAttributes createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>Creation time of the deletion request.</p>
   * @return createdAt
  **/
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }
  public DataDeletionResponseItemAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * <p>User who created the deletion request.</p>
   * @return createdBy
  **/
      @JsonProperty(JSON_PROPERTY_CREATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getCreatedBy() {
        return createdBy;
      }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }
  public DataDeletionResponseItemAttributes fromTime(Long fromTime) {
    this.fromTime = fromTime;
    return this;
  }

  /**
   * <p>Start of requested time window, milliseconds since Unix epoch.</p>
   * @return fromTime
  **/
      @JsonProperty(JSON_PROPERTY_FROM_TIME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getFromTime() {
        return fromTime;
      }
  public void setFromTime(Long fromTime) {
    this.fromTime = fromTime;
  }
  public DataDeletionResponseItemAttributes indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }
  public DataDeletionResponseItemAttributes addIndexesItem(String indexesItem) {
    if (this.indexes == null) {
      this.indexes = new ArrayList<>();
    }
    this.indexes.add(indexesItem);
    return this;
  }

  /**
   * <p>List of indexes for the search. If not provided, the search is performed in all indexes.</p>
   * @return indexes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INDEXES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getIndexes() {
        return indexes;
      }
  public void setIndexes(List<String> indexes) {
    this.indexes = indexes;
  }
  public DataDeletionResponseItemAttributes isCreated(Boolean isCreated) {
    this.isCreated = isCreated;
    return this;
  }

  /**
   * <p>Whether the deletion request is fully created or not. It can take several minutes to fully create a deletion request depending on the target query and timeframe.</p>
   * @return isCreated
  **/
      @JsonProperty(JSON_PROPERTY_IS_CREATED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getIsCreated() {
        return isCreated;
      }
  public void setIsCreated(Boolean isCreated) {
    this.isCreated = isCreated;
  }
  public DataDeletionResponseItemAttributes orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * <p>Organization ID.</p>
   * @return orgId
  **/
      @JsonProperty(JSON_PROPERTY_ORG_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getOrgId() {
        return orgId;
      }
  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }
  public DataDeletionResponseItemAttributes product(String product) {
    this.product = product;
    return this;
  }

  /**
   * <p>Product name.</p>
   * @return product
  **/
      @JsonProperty(JSON_PROPERTY_PRODUCT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getProduct() {
        return product;
      }
  public void setProduct(String product) {
    this.product = product;
  }
  public DataDeletionResponseItemAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>Query for creating a data deletion request.</p>
   * @return query
  **/
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getQuery() {
        return query;
      }
  public void setQuery(String query) {
    this.query = query;
  }
  public DataDeletionResponseItemAttributes startingAt(String startingAt) {
    this.startingAt = startingAt;
    return this;
  }

  /**
   * <p>Starting time of the process to delete the requested data.</p>
   * @return startingAt
  **/
      @JsonProperty(JSON_PROPERTY_STARTING_AT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getStartingAt() {
        return startingAt;
      }
  public void setStartingAt(String startingAt) {
    this.startingAt = startingAt;
  }
  public DataDeletionResponseItemAttributes status(String status) {
    this.status = status;
    return this;
  }

  /**
   * <p>Status of the deletion request.</p>
   * @return status
  **/
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getStatus() {
        return status;
      }
  public void setStatus(String status) {
    this.status = status;
  }
  public DataDeletionResponseItemAttributes toTime(Long toTime) {
    this.toTime = toTime;
    return this;
  }

  /**
   * <p>End of requested time window, milliseconds since Unix epoch.</p>
   * @return toTime
  **/
      @JsonProperty(JSON_PROPERTY_TO_TIME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getToTime() {
        return toTime;
      }
  public void setToTime(Long toTime) {
    this.toTime = toTime;
  }
  public DataDeletionResponseItemAttributes totalUnrestricted(Long totalUnrestricted) {
    this.totalUnrestricted = totalUnrestricted;
    return this;
  }

  /**
   * <p>Total number of elements to be deleted. Only the data accessible to the current user that matches the query and timeframe provided will be deleted.</p>
   * @return totalUnrestricted
  **/
      @JsonProperty(JSON_PROPERTY_TOTAL_UNRESTRICTED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getTotalUnrestricted() {
        return totalUnrestricted;
      }
  public void setTotalUnrestricted(Long totalUnrestricted) {
    this.totalUnrestricted = totalUnrestricted;
  }
  public DataDeletionResponseItemAttributes updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>Update time of the deletion request.</p>
   * @return updatedAt
  **/
      @JsonProperty(JSON_PROPERTY_UPDATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getUpdatedAt() {
        return updatedAt;
      }
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return DataDeletionResponseItemAttributes
   */
  @JsonAnySetter
  public DataDeletionResponseItemAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this DataDeletionResponseItemAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataDeletionResponseItemAttributes dataDeletionResponseItemAttributes = (DataDeletionResponseItemAttributes) o;
    return Objects.equals(this.createdAt, dataDeletionResponseItemAttributes.createdAt) && Objects.equals(this.createdBy, dataDeletionResponseItemAttributes.createdBy) && Objects.equals(this.fromTime, dataDeletionResponseItemAttributes.fromTime) && Objects.equals(this.indexes, dataDeletionResponseItemAttributes.indexes) && Objects.equals(this.isCreated, dataDeletionResponseItemAttributes.isCreated) && Objects.equals(this.orgId, dataDeletionResponseItemAttributes.orgId) && Objects.equals(this.product, dataDeletionResponseItemAttributes.product) && Objects.equals(this.query, dataDeletionResponseItemAttributes.query) && Objects.equals(this.startingAt, dataDeletionResponseItemAttributes.startingAt) && Objects.equals(this.status, dataDeletionResponseItemAttributes.status) && Objects.equals(this.toTime, dataDeletionResponseItemAttributes.toTime) && Objects.equals(this.totalUnrestricted, dataDeletionResponseItemAttributes.totalUnrestricted) && Objects.equals(this.updatedAt, dataDeletionResponseItemAttributes.updatedAt) && Objects.equals(this.additionalProperties, dataDeletionResponseItemAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,createdBy,fromTime,indexes,isCreated,orgId,product,query,startingAt,status,toTime,totalUnrestricted,updatedAt, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataDeletionResponseItemAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    isCreated: ").append(toIndentedString(isCreated)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    startingAt: ").append(toIndentedString(startingAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    toTime: ").append(toIndentedString(toTime)).append("\n");
    sb.append("    totalUnrestricted: ").append(toIndentedString(totalUnrestricted)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
