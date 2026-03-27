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
  CustomDestinationForwardDestinationElasticsearch.JSON_PROPERTY_AUTH,
  CustomDestinationForwardDestinationElasticsearch.JSON_PROPERTY_ENDPOINT,
  CustomDestinationForwardDestinationElasticsearch.JSON_PROPERTY_INDEX_NAME,
  CustomDestinationForwardDestinationElasticsearch.JSON_PROPERTY_INDEX_ROTATION,
  CustomDestinationForwardDestinationElasticsearch.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomDestinationForwardDestinationElasticsearch {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH = "auth";
  private CustomDestinationElasticsearchDestinationAuth auth;

  public static final String JSON_PROPERTY_ENDPOINT = "endpoint";
  private String endpoint;

  public static final String JSON_PROPERTY_INDEX_NAME = "index_name";
  private String indexName;

  public static final String JSON_PROPERTY_INDEX_ROTATION = "index_rotation";
  private String indexRotation;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CustomDestinationForwardDestinationElasticsearchType type =
      CustomDestinationForwardDestinationElasticsearchType.ELASTICSEARCH;

  public CustomDestinationForwardDestinationElasticsearch() {}

  @JsonCreator
  public CustomDestinationForwardDestinationElasticsearch(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH)
          CustomDestinationElasticsearchDestinationAuth auth,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENDPOINT) String endpoint,
      @JsonProperty(required = true, value = JSON_PROPERTY_INDEX_NAME) String indexName,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          CustomDestinationForwardDestinationElasticsearchType type) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    this.endpoint = endpoint;
    this.indexName = indexName;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CustomDestinationForwardDestinationElasticsearch auth(
      CustomDestinationElasticsearchDestinationAuth auth) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    return this;
  }

  /**
   * Basic access authentication.
   *
   * @return auth
   */
  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CustomDestinationElasticsearchDestinationAuth getAuth() {
    return auth;
  }

  public void setAuth(CustomDestinationElasticsearchDestinationAuth auth) {
    this.auth = auth;
  }

  public CustomDestinationForwardDestinationElasticsearch endpoint(String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * The destination for which logs will be forwarded to. Must have HTTPS scheme and forwarding back
   * to Datadog is not allowed.
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

  public CustomDestinationForwardDestinationElasticsearch indexName(String indexName) {
    this.indexName = indexName;
    return this;
  }

  /**
   * Name of the Elasticsearch index (must follow <a
   * href="https://www.elastic.co/guide/en/elasticsearch/reference/8.11/indices-create-index.html#indices-create-api-path-params">Elasticsearch's
   * criteria</a>).
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

  public CustomDestinationForwardDestinationElasticsearch indexRotation(String indexRotation) {
    this.indexRotation = indexRotation;
    return this;
  }

  /**
   * Date pattern with US locale and UTC timezone to be appended to the index name after adding
   * <code>-</code> (that is, <code>${index_name}-${indexPattern}</code>). You can customize the
   * index rotation naming pattern by choosing one of these options: - Hourly: <code>yyyy-MM-dd-HH
   * </code> (as an example, it would render: <code>2022-10-19-09</code>) - Daily: <code>yyyy-MM-dd
   * </code> (as an example, it would render: <code>2022-10-19</code>) - Weekly: <code>yyyy-'W'ww
   * </code> (as an example, it would render: <code>2022-W42</code>) - Monthly: <code>yyyy-MM</code>
   * (as an example, it would render: <code>2022-10</code>)
   *
   * <p>If this field is missing or is blank, it means that the index name will always be the same
   * (that is, no rotation).
   *
   * @return indexRotation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INDEX_ROTATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIndexRotation() {
    return indexRotation;
  }

  public void setIndexRotation(String indexRotation) {
    this.indexRotation = indexRotation;
  }

  public CustomDestinationForwardDestinationElasticsearch type(
      CustomDestinationForwardDestinationElasticsearchType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Type of the Elasticsearch destination.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CustomDestinationForwardDestinationElasticsearchType getType() {
    return type;
  }

  public void setType(CustomDestinationForwardDestinationElasticsearchType type) {
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
   * @return CustomDestinationForwardDestinationElasticsearch
   */
  @JsonAnySetter
  public CustomDestinationForwardDestinationElasticsearch putAdditionalProperty(
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

  /** Return true if this CustomDestinationForwardDestinationElasticsearch object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomDestinationForwardDestinationElasticsearch
        customDestinationForwardDestinationElasticsearch =
            (CustomDestinationForwardDestinationElasticsearch) o;
    return Objects.equals(this.auth, customDestinationForwardDestinationElasticsearch.auth)
        && Objects.equals(this.endpoint, customDestinationForwardDestinationElasticsearch.endpoint)
        && Objects.equals(
            this.indexName, customDestinationForwardDestinationElasticsearch.indexName)
        && Objects.equals(
            this.indexRotation, customDestinationForwardDestinationElasticsearch.indexRotation)
        && Objects.equals(this.type, customDestinationForwardDestinationElasticsearch.type)
        && Objects.equals(
            this.additionalProperties,
            customDestinationForwardDestinationElasticsearch.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, endpoint, indexName, indexRotation, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomDestinationForwardDestinationElasticsearch {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    indexName: ").append(toIndentedString(indexName)).append("\n");
    sb.append("    indexRotation: ").append(toIndentedString(indexRotation)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
