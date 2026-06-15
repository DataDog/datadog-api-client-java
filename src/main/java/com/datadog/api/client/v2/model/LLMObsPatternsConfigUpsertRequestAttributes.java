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

/** Attributes for creating or updating an LLM Observability patterns configuration. */
@JsonPropertyOrder({
  LLMObsPatternsConfigUpsertRequestAttributes.JSON_PROPERTY_ACCOUNT_ID,
  LLMObsPatternsConfigUpsertRequestAttributes.JSON_PROPERTY_CONFIG_ID,
  LLMObsPatternsConfigUpsertRequestAttributes.JSON_PROPERTY_EVP_QUERY,
  LLMObsPatternsConfigUpsertRequestAttributes.JSON_PROPERTY_HIERARCHY_DEPTH,
  LLMObsPatternsConfigUpsertRequestAttributes.JSON_PROPERTY_INTEGRATION_PROVIDER,
  LLMObsPatternsConfigUpsertRequestAttributes.JSON_PROPERTY_MODEL_NAME,
  LLMObsPatternsConfigUpsertRequestAttributes.JSON_PROPERTY_NAME,
  LLMObsPatternsConfigUpsertRequestAttributes.JSON_PROPERTY_NUM_RECORDS,
  LLMObsPatternsConfigUpsertRequestAttributes.JSON_PROPERTY_SAMPLING_RATIO,
  LLMObsPatternsConfigUpsertRequestAttributes.JSON_PROPERTY_SCOPE,
  LLMObsPatternsConfigUpsertRequestAttributes.JSON_PROPERTY_TEMPLATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsPatternsConfigUpsertRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_CONFIG_ID = "config_id";
  private String configId;

  public static final String JSON_PROPERTY_EVP_QUERY = "evp_query";
  private String evpQuery;

  public static final String JSON_PROPERTY_HIERARCHY_DEPTH = "hierarchy_depth";
  private Integer hierarchyDepth;

  public static final String JSON_PROPERTY_INTEGRATION_PROVIDER = "integration_provider";
  private String integrationProvider;

  public static final String JSON_PROPERTY_MODEL_NAME = "model_name";
  private String modelName;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NUM_RECORDS = "num_records";
  private Integer numRecords;

  public static final String JSON_PROPERTY_SAMPLING_RATIO = "sampling_ratio";
  private Double samplingRatio;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private String scope;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private String template;

  public LLMObsPatternsConfigUpsertRequestAttributes() {}

  @JsonCreator
  public LLMObsPatternsConfigUpsertRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_EVP_QUERY) String evpQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_HIERARCHY_DEPTH) Integer hierarchyDepth,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_NUM_RECORDS) Integer numRecords,
      @JsonProperty(required = true, value = JSON_PROPERTY_SAMPLING_RATIO) Double samplingRatio) {
    this.evpQuery = evpQuery;
    this.hierarchyDepth = hierarchyDepth;
    this.name = name;
    this.numRecords = numRecords;
    this.samplingRatio = samplingRatio;
  }

  public LLMObsPatternsConfigUpsertRequestAttributes accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Integration account ID for a bring-your-own-model configuration.
   *
   * @return accountId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public LLMObsPatternsConfigUpsertRequestAttributes configId(String configId) {
    this.configId = configId;
    return this;
  }

  /**
   * The ID of an existing configuration to update. If omitted, a new configuration is created.
   *
   * @return configId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIG_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getConfigId() {
    return configId;
  }

  public void setConfigId(String configId) {
    this.configId = configId;
  }

  public LLMObsPatternsConfigUpsertRequestAttributes evpQuery(String evpQuery) {
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

  public LLMObsPatternsConfigUpsertRequestAttributes hierarchyDepth(Integer hierarchyDepth) {
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

  public LLMObsPatternsConfigUpsertRequestAttributes integrationProvider(
      String integrationProvider) {
    this.integrationProvider = integrationProvider;
    return this;
  }

  /**
   * Integration provider for a bring-your-own-model configuration.
   *
   * @return integrationProvider
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIntegrationProvider() {
    return integrationProvider;
  }

  public void setIntegrationProvider(String integrationProvider) {
    this.integrationProvider = integrationProvider;
  }

  public LLMObsPatternsConfigUpsertRequestAttributes modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  /**
   * Model name for a bring-your-own-model configuration.
   *
   * @return modelName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public LLMObsPatternsConfigUpsertRequestAttributes name(String name) {
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

  public LLMObsPatternsConfigUpsertRequestAttributes numRecords(Integer numRecords) {
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

  public LLMObsPatternsConfigUpsertRequestAttributes samplingRatio(Double samplingRatio) {
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

  public LLMObsPatternsConfigUpsertRequestAttributes scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Scope of the configuration.
   *
   * @return scope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }

  public LLMObsPatternsConfigUpsertRequestAttributes template(String template) {
    this.template = template;
    return this;
  }

  /**
   * Template used to guide topic generation.
   *
   * @return template
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
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
   * @return LLMObsPatternsConfigUpsertRequestAttributes
   */
  @JsonAnySetter
  public LLMObsPatternsConfigUpsertRequestAttributes putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this LLMObsPatternsConfigUpsertRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsPatternsConfigUpsertRequestAttributes llmObsPatternsConfigUpsertRequestAttributes =
        (LLMObsPatternsConfigUpsertRequestAttributes) o;
    return Objects.equals(this.accountId, llmObsPatternsConfigUpsertRequestAttributes.accountId)
        && Objects.equals(this.configId, llmObsPatternsConfigUpsertRequestAttributes.configId)
        && Objects.equals(this.evpQuery, llmObsPatternsConfigUpsertRequestAttributes.evpQuery)
        && Objects.equals(
            this.hierarchyDepth, llmObsPatternsConfigUpsertRequestAttributes.hierarchyDepth)
        && Objects.equals(
            this.integrationProvider,
            llmObsPatternsConfigUpsertRequestAttributes.integrationProvider)
        && Objects.equals(this.modelName, llmObsPatternsConfigUpsertRequestAttributes.modelName)
        && Objects.equals(this.name, llmObsPatternsConfigUpsertRequestAttributes.name)
        && Objects.equals(this.numRecords, llmObsPatternsConfigUpsertRequestAttributes.numRecords)
        && Objects.equals(
            this.samplingRatio, llmObsPatternsConfigUpsertRequestAttributes.samplingRatio)
        && Objects.equals(this.scope, llmObsPatternsConfigUpsertRequestAttributes.scope)
        && Objects.equals(this.template, llmObsPatternsConfigUpsertRequestAttributes.template)
        && Objects.equals(
            this.additionalProperties,
            llmObsPatternsConfigUpsertRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        configId,
        evpQuery,
        hierarchyDepth,
        integrationProvider,
        modelName,
        name,
        numRecords,
        samplingRatio,
        scope,
        template,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsPatternsConfigUpsertRequestAttributes {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    configId: ").append(toIndentedString(configId)).append("\n");
    sb.append("    evpQuery: ").append(toIndentedString(evpQuery)).append("\n");
    sb.append("    hierarchyDepth: ").append(toIndentedString(hierarchyDepth)).append("\n");
    sb.append("    integrationProvider: ")
        .append(toIndentedString(integrationProvider))
        .append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numRecords: ").append(toIndentedString(numRecords)).append("\n");
    sb.append("    samplingRatio: ").append(toIndentedString(samplingRatio)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
