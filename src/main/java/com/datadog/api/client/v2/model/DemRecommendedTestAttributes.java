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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes of an AI-recommended synthetic test for a DEM journey. */
@JsonPropertyOrder({
  DemRecommendedTestAttributes.JSON_PROPERTY_CONFIG,
  DemRecommendedTestAttributes.JSON_PROPERTY_CREATED_AT,
  DemRecommendedTestAttributes.JSON_PROPERTY_NAME,
  DemRecommendedTestAttributes.JSON_PROPERTY_RESULT_ID,
  DemRecommendedTestAttributes.JSON_PROPERTY_SESSION_ID,
  DemRecommendedTestAttributes.JSON_PROPERTY_SOURCE,
  DemRecommendedTestAttributes.JSON_PROPERTY_TYPE,
  DemRecommendedTestAttributes.JSON_PROPERTY_VARIANT_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DemRecommendedTestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIG = "config";
  private Map<String, Object> config = new HashMap<String, Object>();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RESULT_ID = "result_id";
  private String resultId;

  public static final String JSON_PROPERTY_SESSION_ID = "session_id";
  private String sessionId;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private String source;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_VARIANT_ID = "variant_id";
  private String variantId;

  public DemRecommendedTestAttributes() {}

  @JsonCreator
  public DemRecommendedTestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIG) Map<String, Object> config,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) String source,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) String type) {
    this.config = config;
    this.createdAt = createdAt;
    this.name = name;
    this.source = source;
    this.type = type;
  }

  public DemRecommendedTestAttributes config(Map<String, Object> config) {
    this.config = config;
    return this;
  }

  public DemRecommendedTestAttributes putConfigItem(String key, Object configItem) {
    this.config.put(key, configItem);
    return this;
  }

  /**
   * The browser test configuration that can be used to create the recommended test.
   *
   * @return config
   */
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getConfig() {
    return config;
  }

  public void setConfig(Map<String, Object> config) {
    this.config = config;
  }

  public DemRecommendedTestAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time when the recommendation was generated.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public DemRecommendedTestAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The display name of the recommended test.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DemRecommendedTestAttributes resultId(String resultId) {
    this.resultId = resultId;
    return this;
  }

  /**
   * The identifier of the validating sample run, when available.
   *
   * @return resultId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getResultId() {
    return resultId;
  }

  public void setResultId(String resultId) {
    this.resultId = resultId;
  }

  public DemRecommendedTestAttributes sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

  /**
   * The RUM session identifier for the validating sample run, when available.
   *
   * @return sessionId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public DemRecommendedTestAttributes source(String source) {
    this.source = source;
    return this;
  }

  /**
   * The pipeline that produced the recommendation.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public DemRecommendedTestAttributes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of synthetic test.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DemRecommendedTestAttributes variantId(String variantId) {
    this.variantId = variantId;
    return this;
  }

  /**
   * The variant associated with the recommendation, when applicable.
   *
   * @return variantId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VARIANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVariantId() {
    return variantId;
  }

  public void setVariantId(String variantId) {
    this.variantId = variantId;
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
   * @return DemRecommendedTestAttributes
   */
  @JsonAnySetter
  public DemRecommendedTestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DemRecommendedTestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemRecommendedTestAttributes demRecommendedTestAttributes = (DemRecommendedTestAttributes) o;
    return Objects.equals(this.config, demRecommendedTestAttributes.config)
        && Objects.equals(this.createdAt, demRecommendedTestAttributes.createdAt)
        && Objects.equals(this.name, demRecommendedTestAttributes.name)
        && Objects.equals(this.resultId, demRecommendedTestAttributes.resultId)
        && Objects.equals(this.sessionId, demRecommendedTestAttributes.sessionId)
        && Objects.equals(this.source, demRecommendedTestAttributes.source)
        && Objects.equals(this.type, demRecommendedTestAttributes.type)
        && Objects.equals(this.variantId, demRecommendedTestAttributes.variantId)
        && Objects.equals(
            this.additionalProperties, demRecommendedTestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        config,
        createdAt,
        name,
        resultId,
        sessionId,
        source,
        type,
        variantId,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemRecommendedTestAttributes {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    variantId: ").append(toIndentedString(variantId)).append("\n");
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
