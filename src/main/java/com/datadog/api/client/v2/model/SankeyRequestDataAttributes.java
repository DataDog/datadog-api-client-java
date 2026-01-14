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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** */
@JsonPropertyOrder({
  SankeyRequestDataAttributes.JSON_PROPERTY_DATA_SOURCE,
  SankeyRequestDataAttributes.JSON_PROPERTY_DEFINITION,
  SankeyRequestDataAttributes.JSON_PROPERTY_ENFORCED_EXECUTION_TYPE,
  SankeyRequestDataAttributes.JSON_PROPERTY_REQUEST_ID,
  SankeyRequestDataAttributes.JSON_PROPERTY_SAMPLING,
  SankeyRequestDataAttributes.JSON_PROPERTY_SEARCH,
  SankeyRequestDataAttributes.JSON_PROPERTY_TIME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SankeyRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private String dataSource;

  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private SankeyRequestDataAttributesDefinition definition;

  public static final String JSON_PROPERTY_ENFORCED_EXECUTION_TYPE = "enforced_execution_type";
  private String enforcedExecutionType;

  public static final String JSON_PROPERTY_REQUEST_ID = "request_id";
  private String requestId;

  public static final String JSON_PROPERTY_SAMPLING = "sampling";
  private SankeyRequestDataAttributesSampling sampling;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private SankeyRequestDataAttributesSearch search;

  public static final String JSON_PROPERTY_TIME = "time";
  private SankeyRequestDataAttributesTime time;

  public SankeyRequestDataAttributes dataSource(String dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  /**
   * GetdataSource
   *
   * @return dataSource
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDataSource() {
    return dataSource;
  }

  public void setDataSource(String dataSource) {
    this.dataSource = dataSource;
  }

  public SankeyRequestDataAttributes definition(SankeyRequestDataAttributesDefinition definition) {
    this.definition = definition;
    this.unparsed |= definition.unparsed;
    return this;
  }

  /**
   * Getdefinition
   *
   * @return definition
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SankeyRequestDataAttributesDefinition getDefinition() {
    return definition;
  }

  public void setDefinition(SankeyRequestDataAttributesDefinition definition) {
    this.definition = definition;
  }

  public SankeyRequestDataAttributes enforcedExecutionType(String enforcedExecutionType) {
    this.enforcedExecutionType = enforcedExecutionType;
    return this;
  }

  /**
   * GetenforcedExecutionType
   *
   * @return enforcedExecutionType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENFORCED_EXECUTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnforcedExecutionType() {
    return enforcedExecutionType;
  }

  public void setEnforcedExecutionType(String enforcedExecutionType) {
    this.enforcedExecutionType = enforcedExecutionType;
  }

  public SankeyRequestDataAttributes requestId(String requestId) {
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

  public SankeyRequestDataAttributes sampling(SankeyRequestDataAttributesSampling sampling) {
    this.sampling = sampling;
    this.unparsed |= sampling.unparsed;
    return this;
  }

  /**
   * Getsampling
   *
   * @return sampling
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAMPLING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SankeyRequestDataAttributesSampling getSampling() {
    return sampling;
  }

  public void setSampling(SankeyRequestDataAttributesSampling sampling) {
    this.sampling = sampling;
  }

  public SankeyRequestDataAttributes search(SankeyRequestDataAttributesSearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * Getsearch
   *
   * @return search
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SankeyRequestDataAttributesSearch getSearch() {
    return search;
  }

  public void setSearch(SankeyRequestDataAttributesSearch search) {
    this.search = search;
  }

  public SankeyRequestDataAttributes time(SankeyRequestDataAttributesTime time) {
    this.time = time;
    this.unparsed |= time.unparsed;
    return this;
  }

  /**
   * Gettime
   *
   * @return time
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SankeyRequestDataAttributesTime getTime() {
    return time;
  }

  public void setTime(SankeyRequestDataAttributesTime time) {
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
   * @return SankeyRequestDataAttributes
   */
  @JsonAnySetter
  public SankeyRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SankeyRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SankeyRequestDataAttributes sankeyRequestDataAttributes = (SankeyRequestDataAttributes) o;
    return Objects.equals(this.dataSource, sankeyRequestDataAttributes.dataSource)
        && Objects.equals(this.definition, sankeyRequestDataAttributes.definition)
        && Objects.equals(
            this.enforcedExecutionType, sankeyRequestDataAttributes.enforcedExecutionType)
        && Objects.equals(this.requestId, sankeyRequestDataAttributes.requestId)
        && Objects.equals(this.sampling, sankeyRequestDataAttributes.sampling)
        && Objects.equals(this.search, sankeyRequestDataAttributes.search)
        && Objects.equals(this.time, sankeyRequestDataAttributes.time)
        && Objects.equals(
            this.additionalProperties, sankeyRequestDataAttributes.additionalProperties);
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
    sb.append("class SankeyRequestDataAttributes {\n");
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
