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
  FunnelRequestDataAttributes.JSON_PROPERTY_DATA_SOURCE,
  FunnelRequestDataAttributes.JSON_PROPERTY_ENFORCED_EXECUTION_TYPE,
  FunnelRequestDataAttributes.JSON_PROPERTY_REQUEST_ID,
  FunnelRequestDataAttributes.JSON_PROPERTY_SEARCH,
  FunnelRequestDataAttributes.JSON_PROPERTY_TIME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FunnelRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private String dataSource;

  public static final String JSON_PROPERTY_ENFORCED_EXECUTION_TYPE = "enforced_execution_type";
  private String enforcedExecutionType;

  public static final String JSON_PROPERTY_REQUEST_ID = "request_id";
  private String requestId;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private FunnelRequestDataAttributesSearch search;

  public static final String JSON_PROPERTY_TIME = "time";
  private FunnelRequestDataAttributesTime time;

  public FunnelRequestDataAttributes dataSource(String dataSource) {
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

  public FunnelRequestDataAttributes enforcedExecutionType(String enforcedExecutionType) {
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

  public FunnelRequestDataAttributes requestId(String requestId) {
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

  public FunnelRequestDataAttributes search(FunnelRequestDataAttributesSearch search) {
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
  public FunnelRequestDataAttributesSearch getSearch() {
    return search;
  }

  public void setSearch(FunnelRequestDataAttributesSearch search) {
    this.search = search;
  }

  public FunnelRequestDataAttributes time(FunnelRequestDataAttributesTime time) {
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
  public FunnelRequestDataAttributesTime getTime() {
    return time;
  }

  public void setTime(FunnelRequestDataAttributesTime time) {
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
   * @return FunnelRequestDataAttributes
   */
  @JsonAnySetter
  public FunnelRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FunnelRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FunnelRequestDataAttributes funnelRequestDataAttributes = (FunnelRequestDataAttributes) o;
    return Objects.equals(this.dataSource, funnelRequestDataAttributes.dataSource)
        && Objects.equals(
            this.enforcedExecutionType, funnelRequestDataAttributes.enforcedExecutionType)
        && Objects.equals(this.requestId, funnelRequestDataAttributes.requestId)
        && Objects.equals(this.search, funnelRequestDataAttributes.search)
        && Objects.equals(this.time, funnelRequestDataAttributes.time)
        && Objects.equals(
            this.additionalProperties, funnelRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dataSource, enforcedExecutionType, requestId, search, time, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunnelRequestDataAttributes {\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    enforcedExecutionType: ")
        .append(toIndentedString(enforcedExecutionType))
        .append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
