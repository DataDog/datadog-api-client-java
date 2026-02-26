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
   * <p>Attributes for creating a data deletion request.</p>
 */
@JsonPropertyOrder({
  CreateDataDeletionRequestBodyAttributes.JSON_PROPERTY_FROM,
  CreateDataDeletionRequestBodyAttributes.JSON_PROPERTY_INDEXES,
  CreateDataDeletionRequestBodyAttributes.JSON_PROPERTY_QUERY,
  CreateDataDeletionRequestBodyAttributes.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateDataDeletionRequestBodyAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_FROM = "from";
  private Long from;

  public static final String JSON_PROPERTY_INDEXES = "indexes";
  private List<String> indexes = null;

  public static final String JSON_PROPERTY_QUERY = "query";
  private Map<String, String> query = new HashMap<String, String>();

  public static final String JSON_PROPERTY_TO = "to";
  private Long to;

  public CreateDataDeletionRequestBodyAttributes() {}

  @JsonCreator
  public CreateDataDeletionRequestBodyAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_FROM)Long from,
            @JsonProperty(required=true, value=JSON_PROPERTY_QUERY)Map<String, String> query,
            @JsonProperty(required=true, value=JSON_PROPERTY_TO)Long to) {
        this.from = from;
        this.query = query;
        this.to = to;
  }
  public CreateDataDeletionRequestBodyAttributes from(Long from) {
    this.from = from;
    return this;
  }

  /**
   * <p>Start of requested time window, milliseconds since Unix epoch.</p>
   * @return from
  **/
      @JsonProperty(JSON_PROPERTY_FROM)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getFrom() {
        return from;
      }
  public void setFrom(Long from) {
    this.from = from;
  }
  public CreateDataDeletionRequestBodyAttributes indexes(List<String> indexes) {
    this.indexes = indexes;
    return this;
  }
  public CreateDataDeletionRequestBodyAttributes addIndexesItem(String indexesItem) {
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
  public CreateDataDeletionRequestBodyAttributes query(Map<String, String> query) {
    this.query = query;
    return this;
  }
  public CreateDataDeletionRequestBodyAttributes putQueryItem(String key, String queryItem) {
    this.query.put(key, queryItem);
    return this;
  }

  /**
   * <p>Query for creating a data deletion request.</p>
   * @return query
  **/
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Map<String, String> getQuery() {
        return query;
      }
  public void setQuery(Map<String, String> query) {
    this.query = query;
  }
  public CreateDataDeletionRequestBodyAttributes to(Long to) {
    this.to = to;
    return this;
  }

  /**
   * <p>End of requested time window, milliseconds since Unix epoch.</p>
   * @return to
  **/
      @JsonProperty(JSON_PROPERTY_TO)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getTo() {
        return to;
      }
  public void setTo(Long to) {
    this.to = to;
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
   * @return CreateDataDeletionRequestBodyAttributes
   */
  @JsonAnySetter
  public CreateDataDeletionRequestBodyAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this CreateDataDeletionRequestBodyAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateDataDeletionRequestBodyAttributes createDataDeletionRequestBodyAttributes = (CreateDataDeletionRequestBodyAttributes) o;
    return Objects.equals(this.from, createDataDeletionRequestBodyAttributes.from) && Objects.equals(this.indexes, createDataDeletionRequestBodyAttributes.indexes) && Objects.equals(this.query, createDataDeletionRequestBodyAttributes.query) && Objects.equals(this.to, createDataDeletionRequestBodyAttributes.to) && Objects.equals(this.additionalProperties, createDataDeletionRequestBodyAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(from,indexes,query,to, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateDataDeletionRequestBodyAttributes {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    indexes: ").append(toIndentedString(indexes)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
