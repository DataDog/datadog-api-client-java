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
import org.openapitools.jackson.nullable.JsonNullable;

/** A single LLM Observability patterns configuration in a list response. */
@JsonPropertyOrder({
  LLMObsPatternsConfigItem.JSON_PROPERTY_ACCOUNT_ID,
  LLMObsPatternsConfigItem.JSON_PROPERTY_CREATED_AT,
  LLMObsPatternsConfigItem.JSON_PROPERTY_EVP_QUERY,
  LLMObsPatternsConfigItem.JSON_PROPERTY_HIERARCHY_DEPTH,
  LLMObsPatternsConfigItem.JSON_PROPERTY_ID,
  LLMObsPatternsConfigItem.JSON_PROPERTY_INTEGRATION_PROVIDER,
  LLMObsPatternsConfigItem.JSON_PROPERTY_MODEL_NAME,
  LLMObsPatternsConfigItem.JSON_PROPERTY_NAME,
  LLMObsPatternsConfigItem.JSON_PROPERTY_NUM_RECORDS,
  LLMObsPatternsConfigItem.JSON_PROPERTY_SAMPLING_RATIO,
  LLMObsPatternsConfigItem.JSON_PROPERTY_SCOPE,
  LLMObsPatternsConfigItem.JSON_PROPERTY_TEMPLATE,
  LLMObsPatternsConfigItem.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsPatternsConfigItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private JsonNullable<String> accountId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_EVP_QUERY = "evp_query";
  private String evpQuery;

  public static final String JSON_PROPERTY_HIERARCHY_DEPTH = "hierarchy_depth";
  private Integer hierarchyDepth;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INTEGRATION_PROVIDER = "integration_provider";
  private JsonNullable<String> integrationProvider = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_MODEL_NAME = "model_name";
  private JsonNullable<String> modelName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NUM_RECORDS = "num_records";
  private Integer numRecords;

  public static final String JSON_PROPERTY_SAMPLING_RATIO = "sampling_ratio";
  private Double samplingRatio;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private JsonNullable<String> template = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public LLMObsPatternsConfigItem() {}

  @JsonCreator
  public LLMObsPatternsConfigItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_EVP_QUERY) String evpQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_HIERARCHY_DEPTH) Integer hierarchyDepth,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_NUM_RECORDS) Integer numRecords,
      @JsonProperty(required = true, value = JSON_PROPERTY_SAMPLING_RATIO) Double samplingRatio,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPE) String scope,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.createdAt = createdAt;
    this.evpQuery = evpQuery;
    this.hierarchyDepth = hierarchyDepth;
    this.id = id;
    this.name = name;
    this.numRecords = numRecords;
    this.samplingRatio = samplingRatio;
    this.scope = scope;
    this.updatedAt = updatedAt;
  }

  public LLMObsPatternsConfigItem accountId(String accountId) {
    this.accountId = JsonNullable.<String>of(accountId);
    return this;
  }

  /**
   * Integration account ID for a bring-your-own-model configuration.
   *
   * @return accountId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getAccountId() {
    return accountId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getAccountId_JsonNullable() {
    return accountId;
  }

  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  public void setAccountId_JsonNullable(JsonNullable<String> accountId) {
    this.accountId = accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = JsonNullable.<String>of(accountId);
  }

  public LLMObsPatternsConfigItem createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the configuration was created.
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

  public LLMObsPatternsConfigItem evpQuery(String evpQuery) {
    this.evpQuery = evpQuery;
    return this;
  }

  /**
   * Query that selects the spans the patterns run analyzes.
   *
   * @return evpQuery
   */
  @JsonProperty(JSON_PROPERTY_EVP_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEvpQuery() {
    return evpQuery;
  }

  public void setEvpQuery(String evpQuery) {
    this.evpQuery = evpQuery;
  }

  public LLMObsPatternsConfigItem hierarchyDepth(Integer hierarchyDepth) {
    this.hierarchyDepth = hierarchyDepth;
    return this;
  }

  /**
   * Depth of the topic hierarchy to generate. maximum: 2147483647
   *
   * @return hierarchyDepth
   */
  @JsonProperty(JSON_PROPERTY_HIERARCHY_DEPTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getHierarchyDepth() {
    return hierarchyDepth;
  }

  public void setHierarchyDepth(Integer hierarchyDepth) {
    this.hierarchyDepth = hierarchyDepth;
  }

  public LLMObsPatternsConfigItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the configuration.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LLMObsPatternsConfigItem integrationProvider(String integrationProvider) {
    this.integrationProvider = JsonNullable.<String>of(integrationProvider);
    return this;
  }

  /**
   * Integration provider for a bring-your-own-model configuration.
   *
   * @return integrationProvider
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getIntegrationProvider() {
    return integrationProvider.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTEGRATION_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getIntegrationProvider_JsonNullable() {
    return integrationProvider;
  }

  @JsonProperty(JSON_PROPERTY_INTEGRATION_PROVIDER)
  public void setIntegrationProvider_JsonNullable(JsonNullable<String> integrationProvider) {
    this.integrationProvider = integrationProvider;
  }

  public void setIntegrationProvider(String integrationProvider) {
    this.integrationProvider = JsonNullable.<String>of(integrationProvider);
  }

  public LLMObsPatternsConfigItem modelName(String modelName) {
    this.modelName = JsonNullable.<String>of(modelName);
    return this;
  }

  /**
   * Model name for a bring-your-own-model configuration.
   *
   * @return modelName
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getModelName() {
    return modelName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MODEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getModelName_JsonNullable() {
    return modelName;
  }

  @JsonProperty(JSON_PROPERTY_MODEL_NAME)
  public void setModelName_JsonNullable(JsonNullable<String> modelName) {
    this.modelName = modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = JsonNullable.<String>of(modelName);
  }

  public LLMObsPatternsConfigItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the configuration.
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

  public LLMObsPatternsConfigItem numRecords(Integer numRecords) {
    this.numRecords = numRecords;
    return this;
  }

  /**
   * Maximum number of records to process for the run. maximum: 2147483647
   *
   * @return numRecords
   */
  @JsonProperty(JSON_PROPERTY_NUM_RECORDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getNumRecords() {
    return numRecords;
  }

  public void setNumRecords(Integer numRecords) {
    this.numRecords = numRecords;
  }

  public LLMObsPatternsConfigItem samplingRatio(Double samplingRatio) {
    this.samplingRatio = samplingRatio;
    return this;
  }

  /**
   * Fraction of matching spans to sample for the run.
   *
   * @return samplingRatio
   */
  @JsonProperty(JSON_PROPERTY_SAMPLING_RATIO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Double getSamplingRatio() {
    return samplingRatio;
  }

  public void setSamplingRatio(Double samplingRatio) {
    this.samplingRatio = samplingRatio;
  }

  public LLMObsPatternsConfigItem scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Scope of the configuration.
   *
   * @return scope
   */
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public LLMObsPatternsConfigItem template(String template) {
    this.template = JsonNullable.<String>of(template);
    return this;
  }

  /**
   * Template used to guide topic generation.
   *
   * @return template
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getTemplate() {
    return template.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTemplate_JsonNullable() {
    return template;
  }

  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  public void setTemplate_JsonNullable(JsonNullable<String> template) {
    this.template = template;
  }

  public void setTemplate(String template) {
    this.template = JsonNullable.<String>of(template);
  }

  public LLMObsPatternsConfigItem updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp when the configuration was last updated.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return LLMObsPatternsConfigItem
   */
  @JsonAnySetter
  public LLMObsPatternsConfigItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsPatternsConfigItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsPatternsConfigItem llmObsPatternsConfigItem = (LLMObsPatternsConfigItem) o;
    return Objects.equals(this.accountId, llmObsPatternsConfigItem.accountId)
        && Objects.equals(this.createdAt, llmObsPatternsConfigItem.createdAt)
        && Objects.equals(this.evpQuery, llmObsPatternsConfigItem.evpQuery)
        && Objects.equals(this.hierarchyDepth, llmObsPatternsConfigItem.hierarchyDepth)
        && Objects.equals(this.id, llmObsPatternsConfigItem.id)
        && Objects.equals(this.integrationProvider, llmObsPatternsConfigItem.integrationProvider)
        && Objects.equals(this.modelName, llmObsPatternsConfigItem.modelName)
        && Objects.equals(this.name, llmObsPatternsConfigItem.name)
        && Objects.equals(this.numRecords, llmObsPatternsConfigItem.numRecords)
        && Objects.equals(this.samplingRatio, llmObsPatternsConfigItem.samplingRatio)
        && Objects.equals(this.scope, llmObsPatternsConfigItem.scope)
        && Objects.equals(this.template, llmObsPatternsConfigItem.template)
        && Objects.equals(this.updatedAt, llmObsPatternsConfigItem.updatedAt)
        && Objects.equals(this.additionalProperties, llmObsPatternsConfigItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        createdAt,
        evpQuery,
        hierarchyDepth,
        id,
        integrationProvider,
        modelName,
        name,
        numRecords,
        samplingRatio,
        scope,
        template,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsPatternsConfigItem {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    evpQuery: ").append(toIndentedString(evpQuery)).append("\n");
    sb.append("    hierarchyDepth: ").append(toIndentedString(hierarchyDepth)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    integrationProvider: ")
        .append(toIndentedString(integrationProvider))
        .append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numRecords: ").append(toIndentedString(numRecords)).append("\n");
    sb.append("    samplingRatio: ").append(toIndentedString(samplingRatio)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
