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
import java.util.UUID;

/**
 * The environment the change applies to. Null for a change to the flag itself rather than to one
 * environment.
 */
@JsonPropertyOrder({
  FeatureFlagChangeEventEnvironment.JSON_PROPERTY_ID,
  FeatureFlagChangeEventEnvironment.JSON_PROPERTY_IS_PRODUCTION,
  FeatureFlagChangeEventEnvironment.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class FeatureFlagChangeEventEnvironment {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_IS_PRODUCTION = "is_production";
  private Boolean isProduction;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public FeatureFlagChangeEventEnvironment() {}

  @JsonCreator
  public FeatureFlagChangeEventEnvironment(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) UUID id,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_PRODUCTION) Boolean isProduction,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.id = id;
    this.isProduction = isProduction;
    this.name = name;
  }

  public FeatureFlagChangeEventEnvironment id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the environment.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public FeatureFlagChangeEventEnvironment isProduction(Boolean isProduction) {
    this.isProduction = isProduction;
    return this;
  }

  /**
   * Whether the environment is a production environment.
   *
   * @return isProduction
   */
  @JsonProperty(JSON_PROPERTY_IS_PRODUCTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsProduction() {
    return isProduction;
  }

  public void setIsProduction(Boolean isProduction) {
    this.isProduction = isProduction;
  }

  public FeatureFlagChangeEventEnvironment name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the environment.
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
   * @return FeatureFlagChangeEventEnvironment
   */
  @JsonAnySetter
  public FeatureFlagChangeEventEnvironment putAdditionalProperty(String key, Object value) {
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

  /** Return true if this FeatureFlagChangeEventEnvironment object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureFlagChangeEventEnvironment featureFlagChangeEventEnvironment =
        (FeatureFlagChangeEventEnvironment) o;
    return Objects.equals(this.id, featureFlagChangeEventEnvironment.id)
        && Objects.equals(this.isProduction, featureFlagChangeEventEnvironment.isProduction)
        && Objects.equals(this.name, featureFlagChangeEventEnvironment.name)
        && Objects.equals(
            this.additionalProperties, featureFlagChangeEventEnvironment.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, isProduction, name, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureFlagChangeEventEnvironment {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isProduction: ").append(toIndentedString(isProduction)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
