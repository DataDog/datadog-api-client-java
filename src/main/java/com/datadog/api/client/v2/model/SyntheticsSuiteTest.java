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
   * <p>Object containing details about a Synthetic test included in a Synthetic suite.</p>
 */
@JsonPropertyOrder({
  SyntheticsSuiteTest.JSON_PROPERTY_ALERTING_CRITICALITY,
  SyntheticsSuiteTest.JSON_PROPERTY_PUBLIC_ID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsSuiteTest {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ALERTING_CRITICALITY = "alerting_criticality";
  private SyntheticsSuiteTestAlertingCriticality alertingCriticality;

  public static final String JSON_PROPERTY_PUBLIC_ID = "public_id";
  private String publicId;

  public SyntheticsSuiteTest() {}

  @JsonCreator
  public SyntheticsSuiteTest(
            @JsonProperty(required=true, value=JSON_PROPERTY_PUBLIC_ID)String publicId) {
        this.publicId = publicId;
  }
  public SyntheticsSuiteTest alertingCriticality(SyntheticsSuiteTestAlertingCriticality alertingCriticality) {
    this.alertingCriticality = alertingCriticality;
    this.unparsed |= !alertingCriticality.isValid();
    return this;
  }

  /**
   * <p>Alerting criticality for each the test.</p>
   * @return alertingCriticality
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ALERTING_CRITICALITY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsSuiteTestAlertingCriticality getAlertingCriticality() {
        return alertingCriticality;
      }
  public void setAlertingCriticality(SyntheticsSuiteTestAlertingCriticality alertingCriticality) {
    if (!alertingCriticality.isValid()) {
        this.unparsed = true;
    }
    this.alertingCriticality = alertingCriticality;
  }
  public SyntheticsSuiteTest publicId(String publicId) {
    this.publicId = publicId;
    return this;
  }

  /**
   * <p>GetpublicId</p>
   * @return publicId
  **/
      @JsonProperty(JSON_PROPERTY_PUBLIC_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getPublicId() {
        return publicId;
      }
  public void setPublicId(String publicId) {
    this.publicId = publicId;
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
   * @return SyntheticsSuiteTest
   */
  @JsonAnySetter
  public SyntheticsSuiteTest putAdditionalProperty(String key, Object value) {
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
   * Return true if this SyntheticsSuiteTest object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsSuiteTest syntheticsSuiteTest = (SyntheticsSuiteTest) o;
    return Objects.equals(this.alertingCriticality, syntheticsSuiteTest.alertingCriticality) && Objects.equals(this.publicId, syntheticsSuiteTest.publicId) && Objects.equals(this.additionalProperties, syntheticsSuiteTest.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(alertingCriticality,publicId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsSuiteTest {\n");
    sb.append("    alertingCriticality: ").append(toIndentedString(alertingCriticality)).append("\n");
    sb.append("    publicId: ").append(toIndentedString(publicId)).append("\n");
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
