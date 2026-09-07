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

/** Snapshot of the configuration used for a patterns run. */
@JsonPropertyOrder({
  LLMObsPatternsConfigSnapshot.JSON_PROPERTY_ACCOUNT_ID,
  LLMObsPatternsConfigSnapshot.JSON_PROPERTY_EVP_QUERY,
  LLMObsPatternsConfigSnapshot.JSON_PROPERTY_HIERARCHY_DEPTH,
  LLMObsPatternsConfigSnapshot.JSON_PROPERTY_INTEGRATION_PROVIDER,
  LLMObsPatternsConfigSnapshot.JSON_PROPERTY_MODEL_NAME,
  LLMObsPatternsConfigSnapshot.JSON_PROPERTY_NUM_RECORDS,
  LLMObsPatternsConfigSnapshot.JSON_PROPERTY_SAMPLING_RATIO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsPatternsConfigSnapshot {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ACCOUNT_ID = "account_id";
  private String accountId;

  public static final String JSON_PROPERTY_EVP_QUERY = "evp_query";
  private String evpQuery;

  public static final String JSON_PROPERTY_HIERARCHY_DEPTH = "hierarchy_depth";
  private Integer hierarchyDepth;

  public static final String JSON_PROPERTY_INTEGRATION_PROVIDER = "integration_provider";
  private String integrationProvider;

  public static final String JSON_PROPERTY_MODEL_NAME = "model_name";
  private String modelName;

  public static final String JSON_PROPERTY_NUM_RECORDS = "num_records";
  private Integer numRecords;

  public static final String JSON_PROPERTY_SAMPLING_RATIO = "sampling_ratio";
  private Double samplingRatio;

  public LLMObsPatternsConfigSnapshot accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

  /**
   * Integration account ID used for a bring-your-own-model run.
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

  public LLMObsPatternsConfigSnapshot evpQuery(String evpQuery) {
    this.evpQuery = evpQuery;
    return this;
  }

  /**
   * Query that selected the spans for the run.
   *
   * @return evpQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVP_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEvpQuery() {
    return evpQuery;
  }

  public void setEvpQuery(String evpQuery) {
    this.evpQuery = evpQuery;
  }

  public LLMObsPatternsConfigSnapshot hierarchyDepth(Integer hierarchyDepth) {
    this.hierarchyDepth = hierarchyDepth;
    return this;
  }

  /**
   * Depth of the topic hierarchy generated. maximum: 2147483647
   *
   * @return hierarchyDepth
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HIERARCHY_DEPTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getHierarchyDepth() {
    return hierarchyDepth;
  }

  public void setHierarchyDepth(Integer hierarchyDepth) {
    this.hierarchyDepth = hierarchyDepth;
  }

  public LLMObsPatternsConfigSnapshot integrationProvider(String integrationProvider) {
    this.integrationProvider = integrationProvider;
    return this;
  }

  /**
   * Integration provider used for a bring-your-own-model run.
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

  public LLMObsPatternsConfigSnapshot modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  /**
   * Model name used for a bring-your-own-model run.
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

  public LLMObsPatternsConfigSnapshot numRecords(Integer numRecords) {
    this.numRecords = numRecords;
    return this;
  }

  /**
   * Maximum number of records processed for the run. maximum: 2147483647
   *
   * @return numRecords
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUM_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getNumRecords() {
    return numRecords;
  }

  public void setNumRecords(Integer numRecords) {
    this.numRecords = numRecords;
  }

  public LLMObsPatternsConfigSnapshot samplingRatio(Double samplingRatio) {
    this.samplingRatio = samplingRatio;
    return this;
  }

  /**
   * Fraction of matching spans sampled for the run.
   *
   * @return samplingRatio
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SAMPLING_RATIO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getSamplingRatio() {
    return samplingRatio;
  }

  public void setSamplingRatio(Double samplingRatio) {
    this.samplingRatio = samplingRatio;
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
   * @return LLMObsPatternsConfigSnapshot
   */
  @JsonAnySetter
  public LLMObsPatternsConfigSnapshot putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsPatternsConfigSnapshot object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsPatternsConfigSnapshot llmObsPatternsConfigSnapshot = (LLMObsPatternsConfigSnapshot) o;
    return Objects.equals(this.accountId, llmObsPatternsConfigSnapshot.accountId)
        && Objects.equals(this.evpQuery, llmObsPatternsConfigSnapshot.evpQuery)
        && Objects.equals(this.hierarchyDepth, llmObsPatternsConfigSnapshot.hierarchyDepth)
        && Objects.equals(
            this.integrationProvider, llmObsPatternsConfigSnapshot.integrationProvider)
        && Objects.equals(this.modelName, llmObsPatternsConfigSnapshot.modelName)
        && Objects.equals(this.numRecords, llmObsPatternsConfigSnapshot.numRecords)
        && Objects.equals(this.samplingRatio, llmObsPatternsConfigSnapshot.samplingRatio)
        && Objects.equals(
            this.additionalProperties, llmObsPatternsConfigSnapshot.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountId,
        evpQuery,
        hierarchyDepth,
        integrationProvider,
        modelName,
        numRecords,
        samplingRatio,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsPatternsConfigSnapshot {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    evpQuery: ").append(toIndentedString(evpQuery)).append("\n");
    sb.append("    hierarchyDepth: ").append(toIndentedString(hierarchyDepth)).append("\n");
    sb.append("    integrationProvider: ")
        .append(toIndentedString(integrationProvider))
        .append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    numRecords: ").append(toIndentedString(numRecords)).append("\n");
    sb.append("    samplingRatio: ").append(toIndentedString(samplingRatio)).append("\n");
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
