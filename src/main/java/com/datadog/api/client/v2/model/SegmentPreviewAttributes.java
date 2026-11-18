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

/**
 * Segment definition to preview and the columns to return. Without columns, the response returns
 * the user ID, or the account ID for account segments.
 */
@JsonPropertyOrder({
  SegmentPreviewAttributes.JSON_PROPERTY_ACCOUNT_STORE_COLUMNS,
  SegmentPreviewAttributes.JSON_PROPERTY_DATA_QUERY,
  SegmentPreviewAttributes.JSON_PROPERTY_LIMIT,
  SegmentPreviewAttributes.JSON_PROPERTY_REFERENCE_TABLE_COLUMNS,
  SegmentPreviewAttributes.JSON_PROPERTY_USER_STORE_COLUMNS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SegmentPreviewAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_STORE_COLUMNS = "account_store_columns";
  private List<String> accountStoreColumns = null;

  public static final String JSON_PROPERTY_DATA_QUERY = "data_query";
  private SegmentDataQuery dataQuery;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public static final String JSON_PROPERTY_REFERENCE_TABLE_COLUMNS = "reference_table_columns";
  private List<String> referenceTableColumns = null;

  public static final String JSON_PROPERTY_USER_STORE_COLUMNS = "user_store_columns";
  private List<String> userStoreColumns = null;

  public SegmentPreviewAttributes() {}

  @JsonCreator
  public SegmentPreviewAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_QUERY) SegmentDataQuery dataQuery) {
    this.dataQuery = dataQuery;
    this.unparsed |= dataQuery.unparsed;
  }

  public SegmentPreviewAttributes accountStoreColumns(List<String> accountStoreColumns) {
    this.accountStoreColumns = accountStoreColumns;
    return this;
  }

  public SegmentPreviewAttributes addAccountStoreColumnsItem(String accountStoreColumnsItem) {
    if (this.accountStoreColumns == null) {
      this.accountStoreColumns = new ArrayList<>();
    }
    this.accountStoreColumns.add(accountStoreColumnsItem);
    return this;
  }

  /**
   * Account profile columns to return.
   *
   * @return accountStoreColumns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_STORE_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getAccountStoreColumns() {
    return accountStoreColumns;
  }

  public void setAccountStoreColumns(List<String> accountStoreColumns) {
    this.accountStoreColumns = accountStoreColumns;
  }

  public SegmentPreviewAttributes dataQuery(SegmentDataQuery dataQuery) {
    this.dataQuery = dataQuery;
    this.unparsed |= dataQuery.unparsed;
    return this;
  }

  /**
   * Defines who belongs to the segment. It contains one or more blocks, up to 20 in total. Use
   * <code>combination</code> to combine named blocks with a boolean formula such as <code>
   * A AND NOT B</code>.
   *
   * @return dataQuery
   */
  @JsonProperty(JSON_PROPERTY_DATA_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SegmentDataQuery getDataQuery() {
    return dataQuery;
  }

  public void setDataQuery(SegmentDataQuery dataQuery) {
    this.dataQuery = dataQuery;
    if (dataQuery != null) {
      this.unparsed |= dataQuery.unparsed;
    }
  }

  public SegmentPreviewAttributes limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Maximum number of rows to return, up to 1000. Defaults to 1000. maximum: 1000
   *
   * @return limit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLimit() {
    return limit;
  }

  public void setLimit(Long limit) {
    this.limit = limit;
  }

  public SegmentPreviewAttributes referenceTableColumns(List<String> referenceTableColumns) {
    this.referenceTableColumns = referenceTableColumns;
    return this;
  }

  public SegmentPreviewAttributes addReferenceTableColumnsItem(String referenceTableColumnsItem) {
    if (this.referenceTableColumns == null) {
      this.referenceTableColumns = new ArrayList<>();
    }
    this.referenceTableColumns.add(referenceTableColumnsItem);
    return this;
  }

  /**
   * Reference table columns to return.
   *
   * @return referenceTableColumns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_TABLE_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getReferenceTableColumns() {
    return referenceTableColumns;
  }

  public void setReferenceTableColumns(List<String> referenceTableColumns) {
    this.referenceTableColumns = referenceTableColumns;
  }

  public SegmentPreviewAttributes userStoreColumns(List<String> userStoreColumns) {
    this.userStoreColumns = userStoreColumns;
    return this;
  }

  public SegmentPreviewAttributes addUserStoreColumnsItem(String userStoreColumnsItem) {
    if (this.userStoreColumns == null) {
      this.userStoreColumns = new ArrayList<>();
    }
    this.userStoreColumns.add(userStoreColumnsItem);
    return this;
  }

  /**
   * User profile columns to return.
   *
   * @return userStoreColumns
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_STORE_COLUMNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getUserStoreColumns() {
    return userStoreColumns;
  }

  public void setUserStoreColumns(List<String> userStoreColumns) {
    this.userStoreColumns = userStoreColumns;
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
   * @return SegmentPreviewAttributes
   */
  @JsonAnySetter
  public SegmentPreviewAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SegmentPreviewAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentPreviewAttributes segmentPreviewAttributes = (SegmentPreviewAttributes) o;
    return Objects.equals(this.accountStoreColumns, segmentPreviewAttributes.accountStoreColumns)
        && Objects.equals(this.dataQuery, segmentPreviewAttributes.dataQuery)
        && Objects.equals(this.limit, segmentPreviewAttributes.limit)
        && Objects.equals(
            this.referenceTableColumns, segmentPreviewAttributes.referenceTableColumns)
        && Objects.equals(this.userStoreColumns, segmentPreviewAttributes.userStoreColumns)
        && Objects.equals(this.additionalProperties, segmentPreviewAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountStoreColumns,
        dataQuery,
        limit,
        referenceTableColumns,
        userStoreColumns,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentPreviewAttributes {\n");
    sb.append("    accountStoreColumns: ")
        .append(toIndentedString(accountStoreColumns))
        .append("\n");
    sb.append("    dataQuery: ").append(toIndentedString(dataQuery)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    referenceTableColumns: ")
        .append(toIndentedString(referenceTableColumns))
        .append("\n");
    sb.append("    userStoreColumns: ").append(toIndentedString(userStoreColumns)).append("\n");
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
