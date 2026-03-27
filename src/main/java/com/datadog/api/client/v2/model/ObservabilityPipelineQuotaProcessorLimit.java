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
   * <p>The maximum amount of data or number of events allowed before the quota is enforced. Can be specified in bytes or events.</p>
 */
@JsonPropertyOrder({
  ObservabilityPipelineQuotaProcessorLimit.JSON_PROPERTY_ENFORCE,
  ObservabilityPipelineQuotaProcessorLimit.JSON_PROPERTY_LIMIT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineQuotaProcessorLimit {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENFORCE = "enforce";
  private ObservabilityPipelineQuotaProcessorLimitEnforceType enforce;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Long limit;

  public ObservabilityPipelineQuotaProcessorLimit() {}

  @JsonCreator
  public ObservabilityPipelineQuotaProcessorLimit(
            @JsonProperty(required=true, value=JSON_PROPERTY_ENFORCE)ObservabilityPipelineQuotaProcessorLimitEnforceType enforce,
            @JsonProperty(required=true, value=JSON_PROPERTY_LIMIT)Long limit) {
        this.enforce = enforce;
        this.unparsed |= !enforce.isValid();
        this.limit = limit;
  }
  public ObservabilityPipelineQuotaProcessorLimit enforce(ObservabilityPipelineQuotaProcessorLimitEnforceType enforce) {
    this.enforce = enforce;
    this.unparsed |= !enforce.isValid();
    return this;
  }

  /**
   * <p>Unit for quota enforcement in bytes for data size or events for count.</p>
   * @return enforce
  **/
      @JsonProperty(JSON_PROPERTY_ENFORCE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ObservabilityPipelineQuotaProcessorLimitEnforceType getEnforce() {
        return enforce;
      }
  public void setEnforce(ObservabilityPipelineQuotaProcessorLimitEnforceType enforce) {
    if (!enforce.isValid()) {
        this.unparsed = true;
    }
    this.enforce = enforce;
  }
  public ObservabilityPipelineQuotaProcessorLimit limit(Long limit) {
    this.limit = limit;
    return this;
  }

  /**
   * <p>The limit for quota enforcement.</p>
   * @return limit
  **/
      @JsonProperty(JSON_PROPERTY_LIMIT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getLimit() {
        return limit;
      }
  public void setLimit(Long limit) {
    this.limit = limit;
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
   * @return ObservabilityPipelineQuotaProcessorLimit
   */
  @JsonAnySetter
  public ObservabilityPipelineQuotaProcessorLimit putAdditionalProperty(String key, Object value) {
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
   * Return true if this ObservabilityPipelineQuotaProcessorLimit object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineQuotaProcessorLimit observabilityPipelineQuotaProcessorLimit = (ObservabilityPipelineQuotaProcessorLimit) o;
    return Objects.equals(this.enforce, observabilityPipelineQuotaProcessorLimit.enforce) && Objects.equals(this.limit, observabilityPipelineQuotaProcessorLimit.limit) && Objects.equals(this.additionalProperties, observabilityPipelineQuotaProcessorLimit.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(enforce,limit, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineQuotaProcessorLimit {\n");
    sb.append("    enforce: ").append(toIndentedString(enforce)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
