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
   * <p>Payload to test a rule query with the expected result.</p>
 */
@JsonPropertyOrder({
  SecurityMonitoringRuleQueryPayload.JSON_PROPERTY_EXPECTED_RESULT,
  SecurityMonitoringRuleQueryPayload.JSON_PROPERTY_INDEX,
  SecurityMonitoringRuleQueryPayload.JSON_PROPERTY_PAYLOAD
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringRuleQueryPayload {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_EXPECTED_RESULT = "expectedResult";
  private Boolean expectedResult;

  public static final String JSON_PROPERTY_INDEX = "index";
  private Long index;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private SecurityMonitoringRuleQueryPayloadData payload;

  public SecurityMonitoringRuleQueryPayload expectedResult(Boolean expectedResult) {
    this.expectedResult = expectedResult;
    return this;
  }

  /**
   * <p>Expected result of the test.</p>
   * @return expectedResult
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXPECTED_RESULT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getExpectedResult() {
        return expectedResult;
      }
  public void setExpectedResult(Boolean expectedResult) {
    this.expectedResult = expectedResult;
  }
  public SecurityMonitoringRuleQueryPayload index(Long index) {
    this.index = index;
    return this;
  }

  /**
   * <p>Index of the query under test.</p>
   * minimum: 0
   * @return index
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_INDEX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getIndex() {
        return index;
      }
  public void setIndex(Long index) {
    this.index = index;
  }
  public SecurityMonitoringRuleQueryPayload payload(SecurityMonitoringRuleQueryPayloadData payload) {
    this.payload = payload;
    this.unparsed |= payload.unparsed;
    return this;
  }

  /**
   * <p>Payload used to test the rule query.</p>
   * @return payload
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PAYLOAD)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringRuleQueryPayloadData getPayload() {
        return payload;
      }
  public void setPayload(SecurityMonitoringRuleQueryPayloadData payload) {
    this.payload = payload;
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
   * @return SecurityMonitoringRuleQueryPayload
   */
  @JsonAnySetter
  public SecurityMonitoringRuleQueryPayload putAdditionalProperty(String key, Object value) {
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
   * Return true if this SecurityMonitoringRuleQueryPayload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleQueryPayload securityMonitoringRuleQueryPayload = (SecurityMonitoringRuleQueryPayload) o;
    return Objects.equals(this.expectedResult, securityMonitoringRuleQueryPayload.expectedResult) && Objects.equals(this.index, securityMonitoringRuleQueryPayload.index) && Objects.equals(this.payload, securityMonitoringRuleQueryPayload.payload) && Objects.equals(this.additionalProperties, securityMonitoringRuleQueryPayload.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(expectedResult,index,payload, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleQueryPayload {\n");
    sb.append("    expectedResult: ").append(toIndentedString(expectedResult)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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
