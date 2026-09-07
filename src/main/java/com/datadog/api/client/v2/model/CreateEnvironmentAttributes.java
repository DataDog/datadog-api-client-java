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
   * <p>Attributes for creating a new environment.</p>
 */
@JsonPropertyOrder({
  CreateEnvironmentAttributes.JSON_PROPERTY_IS_PRODUCTION,
  CreateEnvironmentAttributes.JSON_PROPERTY_NAME,
  CreateEnvironmentAttributes.JSON_PROPERTY_QUERIES,
  CreateEnvironmentAttributes.JSON_PROPERTY_REQUIRE_FEATURE_FLAG_APPROVAL
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateEnvironmentAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_IS_PRODUCTION = "is_production";
  private Boolean isProduction = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<String> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_REQUIRE_FEATURE_FLAG_APPROVAL = "require_feature_flag_approval";
  private Boolean requireFeatureFlagApproval = false;

  public CreateEnvironmentAttributes() {}

  @JsonCreator
  public CreateEnvironmentAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_QUERIES)List<String> queries) {
        this.name = name;
        this.queries = queries;
  }
  public CreateEnvironmentAttributes isProduction(Boolean isProduction) {
    this.isProduction = isProduction;
    return this;
  }

  /**
   * <p>Indicates whether this is a production environment.</p>
   * @return isProduction
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_PRODUCTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsProduction() {
        return isProduction;
      }
  public void setIsProduction(Boolean isProduction) {
    this.isProduction = isProduction;
  }
  public CreateEnvironmentAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the environment.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public CreateEnvironmentAttributes queries(List<String> queries) {
    this.queries = queries;
    return this;
  }
  public CreateEnvironmentAttributes addQueriesItem(String queriesItem) {
    this.queries.add(queriesItem);
    return this;
  }

  /**
   * <p>List of queries to define the environment scope.</p>
   * @return queries
  **/
      @JsonProperty(JSON_PROPERTY_QUERIES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getQueries() {
        return queries;
      }
  public void setQueries(List<String> queries) {
    this.queries = queries;
  }
  public CreateEnvironmentAttributes requireFeatureFlagApproval(Boolean requireFeatureFlagApproval) {
    this.requireFeatureFlagApproval = requireFeatureFlagApproval;
    return this;
  }

  /**
   * <p>Indicates whether feature flag changes require approval in this environment.</p>
   * @return requireFeatureFlagApproval
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REQUIRE_FEATURE_FLAG_APPROVAL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getRequireFeatureFlagApproval() {
        return requireFeatureFlagApproval;
      }
  public void setRequireFeatureFlagApproval(Boolean requireFeatureFlagApproval) {
    this.requireFeatureFlagApproval = requireFeatureFlagApproval;
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
   * @return CreateEnvironmentAttributes
   */
  @JsonAnySetter
  public CreateEnvironmentAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this CreateEnvironmentAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateEnvironmentAttributes createEnvironmentAttributes = (CreateEnvironmentAttributes) o;
    return Objects.equals(this.isProduction, createEnvironmentAttributes.isProduction) && Objects.equals(this.name, createEnvironmentAttributes.name) && Objects.equals(this.queries, createEnvironmentAttributes.queries) && Objects.equals(this.requireFeatureFlagApproval, createEnvironmentAttributes.requireFeatureFlagApproval) && Objects.equals(this.additionalProperties, createEnvironmentAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(isProduction,name,queries,requireFeatureFlagApproval, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateEnvironmentAttributes {\n");
    sb.append("    isProduction: ").append(toIndentedString(isProduction)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    requireFeatureFlagApproval: ").append(toIndentedString(requireFeatureFlagApproval)).append("\n");
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
