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
   * <p>Attributes of the SPA Recommendation resource. Contains recommendations for both driver and executor components.</p>
 */
@JsonPropertyOrder({
  RecommendationAttributes.JSON_PROPERTY_CONFIDENCE_LEVEL,
  RecommendationAttributes.JSON_PROPERTY_DRIVER,
  RecommendationAttributes.JSON_PROPERTY_EXECUTOR
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RecommendationAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIDENCE_LEVEL = "confidence_level";
  private Double confidenceLevel;

  public static final String JSON_PROPERTY_DRIVER = "driver";
  private ComponentRecommendation driver;

  public static final String JSON_PROPERTY_EXECUTOR = "executor";
  private ComponentRecommendation executor;

  public RecommendationAttributes() {}

  @JsonCreator
  public RecommendationAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_DRIVER)ComponentRecommendation driver,
            @JsonProperty(required=true, value=JSON_PROPERTY_EXECUTOR)ComponentRecommendation executor) {
        this.driver = driver;
        this.unparsed |= driver.unparsed;
        this.executor = executor;
        this.unparsed |= executor.unparsed;
  }
  public RecommendationAttributes confidenceLevel(Double confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
    return this;
  }

  /**
   * <p>GetconfidenceLevel</p>
   * @return confidenceLevel
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CONFIDENCE_LEVEL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Double getConfidenceLevel() {
        return confidenceLevel;
      }
  public void setConfidenceLevel(Double confidenceLevel) {
    this.confidenceLevel = confidenceLevel;
  }
  public RecommendationAttributes driver(ComponentRecommendation driver) {
    this.driver = driver;
    this.unparsed |= driver.unparsed;
    return this;
  }

  /**
   * <p>Resource recommendation for a single Spark component (driver or executor). Contains estimation data used to patch Spark job specs.</p>
   * @return driver
  **/
      @JsonProperty(JSON_PROPERTY_DRIVER)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ComponentRecommendation getDriver() {
        return driver;
      }
  public void setDriver(ComponentRecommendation driver) {
    this.driver = driver;
  }
  public RecommendationAttributes executor(ComponentRecommendation executor) {
    this.executor = executor;
    this.unparsed |= executor.unparsed;
    return this;
  }

  /**
   * <p>Resource recommendation for a single Spark component (driver or executor). Contains estimation data used to patch Spark job specs.</p>
   * @return executor
  **/
      @JsonProperty(JSON_PROPERTY_EXECUTOR)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public ComponentRecommendation getExecutor() {
        return executor;
      }
  public void setExecutor(ComponentRecommendation executor) {
    this.executor = executor;
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
   * @return RecommendationAttributes
   */
  @JsonAnySetter
  public RecommendationAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this RecommendationAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendationAttributes recommendationAttributes = (RecommendationAttributes) o;
    return Objects.equals(this.confidenceLevel, recommendationAttributes.confidenceLevel) && Objects.equals(this.driver, recommendationAttributes.driver) && Objects.equals(this.executor, recommendationAttributes.executor) && Objects.equals(this.additionalProperties, recommendationAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(confidenceLevel,driver,executor, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecommendationAttributes {\n");
    sb.append("    confidenceLevel: ").append(toIndentedString(confidenceLevel)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    executor: ").append(toIndentedString(executor)).append("\n");
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
