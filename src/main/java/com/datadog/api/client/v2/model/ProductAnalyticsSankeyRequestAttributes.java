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

/** Attributes for a Sankey request. */
@JsonPropertyOrder({
  ProductAnalyticsSankeyRequestAttributes.JSON_PROPERTY_DATA_SOURCE,
  ProductAnalyticsSankeyRequestAttributes.JSON_PROPERTY_DEFINITION,
  ProductAnalyticsSankeyRequestAttributes.JSON_PROPERTY_ENFORCED_EXECUTION_TYPE,
  ProductAnalyticsSankeyRequestAttributes.JSON_PROPERTY_REQUEST_ID,
  ProductAnalyticsSankeyRequestAttributes.JSON_PROPERTY_SAMPLING,
  ProductAnalyticsSankeyRequestAttributes.JSON_PROPERTY_SEARCH,
  ProductAnalyticsSankeyRequestAttributes.JSON_PROPERTY_TIME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsSankeyRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private String dataSource;

  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private ProductAnalyticsSankeyDefinition definition;

  public static final String JSON_PROPERTY_ENFORCED_EXECUTION_TYPE = "enforced_execution_type";
  private ProductAnalyticsExecutionType enforcedExecutionType;

  public static final String JSON_PROPERTY_REQUEST_ID = "request_id";
  private String requestId;

  public static final String JSON_PROPERTY_SAMPLING = "sampling";
  private ProductAnalyticsSampling sampling;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private ProductAnalyticsSankeySearch search;

  public static final String JSON_PROPERTY_TIME = "time";
  private ProductAnalyticsSankeyTime time;

  public ProductAnalyticsSankeyRequestAttributes() {}

  @JsonCreator
  public ProductAnalyticsSankeyRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE) String dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFINITION)
          ProductAnalyticsSankeyDefinition definition,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH)
          ProductAnalyticsSankeySearch search,
      @JsonProperty(required = true, value = JSON_PROPERTY_TIME) ProductAnalyticsSankeyTime time) {
    this.dataSource = dataSource;
    this.definition = definition;
    this.unparsed |= definition.unparsed;
    this.search = search;
    this.unparsed |= search.unparsed;
    this.time = time;
    this.unparsed |= time.unparsed;
  }

  public ProductAnalyticsSankeyRequestAttributes dataSource(String dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  /**
   * The data source for the Sankey query.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDataSource() {
    return dataSource;
  }

  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }

  public ProductAnalyticsSankeyRequestAttributes definition(
      ProductAnalyticsSankeyDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
    return this;
  }

  /**
   * Sankey visualization definition. Set either <code>source</code> or <code>target</code>, not
   * both. Use <code>source</code> for forward flow (where do users go after this page?) or <code>
   * target</code> for backward flow (where did users come from?).
   *
   * @return definition
   */
  @JsonProperty(JSON_PROPERTY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsSankeyDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(ProductAnalyticsSankeyDefinition definition) {
    this.definition = definition;
  }

  public ProductAnalyticsSankeyRequestAttributes enforcedExecutionType(
      ProductAnalyticsExecutionType enforcedExecutionType) {
    this.enforcedExecutionType = enforcedExecutionType;
    this.unparsed |= !enforcedExecutionType.isValid();
    return this;
  }

  /**
   * Override the query execution strategy.
   *
   * @return enforcedExecutionType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENFORCED_EXECUTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsExecutionType getEnforcedExecutionType() {
    return enforcedExecutionType;
  }

  public void setEnforcedExecutionType(ProductAnalyticsExecutionType enforcedExecutionType) {
    if (!enforcedExecutionType.isValid()) {
      this.unparsed = true;
    }
    this.enforcedExecutionType = enforcedExecutionType;
  }

  public ProductAnalyticsSankeyRequestAttributes requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * GetrequestId
   *
   * @return requestId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public ProductAnalyticsSankeyRequestAttributes sampling(ProductAnalyticsSampling sampling) {
    this.sampling = sampling;
    this.unparsed |= sampling.unparsed;
    return this;
  }

  /**
   * Sampling configuration.
   *
   * @return sampling
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAMPLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsSampling getSampling() {
    return sampling;
  }

  public void setSampling(ProductAnalyticsSampling sampling) {
    this.sampling = sampling;
  }

  public ProductAnalyticsSankeyRequestAttributes search(ProductAnalyticsSankeySearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Search parameters for a Sankey query.
   *
   * @return search
   */
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsSankeySearch getSearch() {
    return search;
  }

  public void setSearch(ProductAnalyticsSankeySearch search) {
    this.search = search;
  }

  public ProductAnalyticsSankeyRequestAttributes time(ProductAnalyticsSankeyTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Time range for the Sankey query.
   *
   * @return time
   */
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsSankeyTime getTime() {
    return time;
  }

  public void setTime(ProductAnalyticsSankeyTime time) {
    this.time = time;
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
   * @return ProductAnalyticsSankeyRequestAttributes
   */
  @JsonAnySetter
  public ProductAnalyticsSankeyRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsSankeyRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsSankeyRequestAttributes productAnalyticsSankeyRequestAttributes =
        (ProductAnalyticsSankeyRequestAttributes) o;
    return Objects.equals(this.dataSource, productAnalyticsSankeyRequestAttributes.dataSource)
        && Objects.equals(this.definition, productAnalyticsSankeyRequestAttributes.definition)
        && Objects.equals(
            this.enforcedExecutionType,
            productAnalyticsSankeyRequestAttributes.enforcedExecutionType)
        && Objects.equals(this.requestId, productAnalyticsSankeyRequestAttributes.requestId)
        && Objects.equals(this.sampling, productAnalyticsSankeyRequestAttributes.sampling)
        && Objects.equals(this.search, productAnalyticsSankeyRequestAttributes.search)
        && Objects.equals(this.time, productAnalyticsSankeyRequestAttributes.time)
        && Objects.equals(
            this.additionalProperties,
            productAnalyticsSankeyRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dataSource,
        definition,
        enforcedExecutionType,
        requestId,
        sampling,
        search,
        time,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsSankeyRequestAttributes {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    enforcedExecutionType: ")
        .append(toIndentedString(enforcedExecutionType))
        .append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    sampling: ").append(toIndentedString(sampling)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
