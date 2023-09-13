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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** The Elasticsearch destination. */
@JsonPropertyOrder({
  ElasticsearchDestination.JSON_PROPERTY_AUTH,
  ElasticsearchDestination.JSON_PROPERTY_ENDPOINT,
  ElasticsearchDestination.JSON_PROPERTY_INDEX_NAME,
  ElasticsearchDestination.JSON_PROPERTY_INDEX_ROTATION,
  ElasticsearchDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ElasticsearchDestination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH = "auth";
  private HttpDestinationBasicAuth auth;

  public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
  private String endpoint;

  public static final String JSON_PROPERTY_INDEX_NAME = "indexName";
  private String indexName;

  public static final String JSON_PROPERTY_INDEX_ROTATION = "indexRotation";
  private String indexRotation;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ElasticsearchDestinationType type = ElasticsearchDestinationType.ELASTICSEARCH;

  public ElasticsearchDestination() {}

  @JsonCreator
  public ElasticsearchDestination(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENDPOINT) String endpoint,
      @JsonProperty(required = true, value = JSON_PROPERTY_INDEX_NAME) String indexName,
      @JsonProperty(required = true, value = JSON_PROPERTY_INDEX_ROTATION) String indexRotation,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ElasticsearchDestinationType type) {
    this.endpoint = endpoint;
    this.indexName = indexName;
    this.indexRotation = indexRotation;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ElasticsearchDestination auth(HttpDestinationBasicAuth auth) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    return this;
  }

  /**
   * The HTTP destination basic username and password auth.
   *
   * @return auth
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HttpDestinationBasicAuth getAuth() {
    return auth;
  }

  public void setAuth(HttpDestinationBasicAuth auth) {
    this.auth = auth;
  }

  public ElasticsearchDestination endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * The intake URL to forward events to.
   *
   * @return endpoint
   */
  @JsonProperty(JSON_PROPERTY_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(String endpoint) {
    this.endpoint = endpoint;
  }

  public ElasticsearchDestination indexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  /**
   * The Elasticsearch index name.
   *
   * @return indexName
   */
  @JsonProperty(JSON_PROPERTY_INDEX_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIndexName() {
    return indexName;
  }

  public void setIndexName(String indexName) {
    this.indexName = indexName;
  }

  public ElasticsearchDestination indexRotation(String indexRotation) {
    this.indexRotation = indexRotation;
    return this;
  }

  /**
   * The pattern to append to the index name for rotation in Elasticsearch.
   *
   * @return indexRotation
   */
  @JsonProperty(JSON_PROPERTY_INDEX_ROTATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIndexRotation() {
    return indexRotation;
  }

  public void setIndexRotation(String indexRotation) {
    this.indexRotation = indexRotation;
  }

  public ElasticsearchDestination type(ElasticsearchDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The Elasticsearch destination type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ElasticsearchDestinationType getType() {
    return type;
  }

  public void setType(ElasticsearchDestinationType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return ElasticsearchDestination
   */
  @JsonAnySetter
  public ElasticsearchDestination putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ElasticsearchDestination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticsearchDestination elasticsearchDestination = (ElasticsearchDestination) o;
    return Objects.equals(this.auth, elasticsearchDestination.auth)
        && Objects.equals(this.endpoint, elasticsearchDestination.endpoint)
        && Objects.equals(this.indexName, elasticsearchDestination.indexName)
        && Objects.equals(this.indexRotation, elasticsearchDestination.indexRotation)
        && Objects.equals(this.type, elasticsearchDestination.type)
        && Objects.equals(this.additionalProperties, elasticsearchDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, endpoint, indexName, indexRotation, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticsearchDestination {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
    sb.append("    indexRotation: ").append(toIndentedString(indexRotation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append("}");
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
