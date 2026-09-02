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
   * <p>Attributes of a Sankey request.</p>
 */
@JsonPropertyOrder({
  ProductAnalyticsSankeyRequestAttributes.JSON_PROPERTY_DEFINITION,
  ProductAnalyticsSankeyRequestAttributes.JSON_PROPERTY_SEARCH,
  ProductAnalyticsSankeyRequestAttributes.JSON_PROPERTY_TIME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsSankeyRequestAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private ProductAnalyticsSankeyDefinition definition;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private ProductAnalyticsSankeySearch search;

  public static final String JSON_PROPERTY_TIME = "time";
  private ProductAnalyticsSankeyTime time;

  public ProductAnalyticsSankeyRequestAttributes() {}

  @JsonCreator
  public ProductAnalyticsSankeyRequestAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_DEFINITION)ProductAnalyticsSankeyDefinition definition,
            @JsonProperty(required=true, value=JSON_PROPERTY_SEARCH)ProductAnalyticsSankeySearch search,
            @JsonProperty(required=true, value=JSON_PROPERTY_TIME)ProductAnalyticsSankeyTime time) {
        this.definition = definition;
        this.unparsed |= definition.unparsed;
        this.search = search;
        this.unparsed |= search.unparsed;
        this.time = time;
        this.unparsed |= time.unparsed;
  }
  public ProductAnalyticsSankeyRequestAttributes definition(ProductAnalyticsSankeyDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
    return this;
  }

  /**
   * <p>The shape of the Sankey diagram, expressed as the facets to flow between and how many steps to show.</p>
   * @return definition
  **/
      @JsonProperty(JSON_PROPERTY_DEFINITION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ProductAnalyticsSankeyDefinition getDefinition() {
        return definition;
      }
  public void setDefinition(ProductAnalyticsSankeyDefinition definition) {
    this.definition = definition;
    if (definition != null) {
      this.unparsed |= definition.unparsed;
    }
  }
  public ProductAnalyticsSankeyRequestAttributes search(ProductAnalyticsSankeySearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * <p>Selects the sessions a Sankey diagram is built from.</p>
   * @return search
  **/
      @JsonProperty(JSON_PROPERTY_SEARCH)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ProductAnalyticsSankeySearch getSearch() {
        return search;
      }
  public void setSearch(ProductAnalyticsSankeySearch search) {
    this.search = search;
    if (search != null) {
      this.unparsed |= search.unparsed;
    }
  }
  public ProductAnalyticsSankeyRequestAttributes time(ProductAnalyticsSankeyTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * <p>The time window a Sankey query covers.</p>
   * @return time
  **/
      @JsonProperty(JSON_PROPERTY_TIME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ProductAnalyticsSankeyTime getTime() {
        return time;
      }
  public void setTime(ProductAnalyticsSankeyTime time) {
    this.time = time;
    if (time != null) {
      this.unparsed |= time.unparsed;
    }
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

  /**
   * Return true if this ProductAnalyticsSankeyRequestAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsSankeyRequestAttributes productAnalyticsSankeyRequestAttributes = (ProductAnalyticsSankeyRequestAttributes) o;
    return Objects.equals(this.definition, productAnalyticsSankeyRequestAttributes.definition) && Objects.equals(this.search, productAnalyticsSankeyRequestAttributes.search) && Objects.equals(this.time, productAnalyticsSankeyRequestAttributes.time) && Objects.equals(this.additionalProperties, productAnalyticsSankeyRequestAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(definition,search,time, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsSankeyRequestAttributes {\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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
