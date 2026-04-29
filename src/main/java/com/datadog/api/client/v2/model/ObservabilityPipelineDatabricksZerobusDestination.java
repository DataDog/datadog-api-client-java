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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * The <code>databricks_zerobus</code> destination sends logs to Databricks using the Zerobus
 * ingestion API, streaming data directly into your Databricks Lakehouse.
 *
 * <p><strong>Supported pipeline types:</strong> Logs, rehydration
 */
@JsonPropertyOrder({
  ObservabilityPipelineDatabricksZerobusDestination.JSON_PROPERTY_AUTH,
  ObservabilityPipelineDatabricksZerobusDestination.JSON_PROPERTY_BUFFER,
  ObservabilityPipelineDatabricksZerobusDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineDatabricksZerobusDestination.JSON_PROPERTY_INGESTION_ENDPOINT,
  ObservabilityPipelineDatabricksZerobusDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineDatabricksZerobusDestination.JSON_PROPERTY_TABLE_NAME,
  ObservabilityPipelineDatabricksZerobusDestination.JSON_PROPERTY_TYPE,
  ObservabilityPipelineDatabricksZerobusDestination.JSON_PROPERTY_UNITY_CATALOG_ENDPOINT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineDatabricksZerobusDestination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH = "auth";
  private ObservabilityPipelineDatabricksZerobusDestinationAuth auth;

  public static final String JSON_PROPERTY_BUFFER = "buffer";
  private ObservabilityPipelineBufferOptions buffer;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INGESTION_ENDPOINT = "ingestion_endpoint";
  private String ingestionEndpoint;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_TABLE_NAME = "table_name";
  private String tableName;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineDatabricksZerobusDestinationType type =
      ObservabilityPipelineDatabricksZerobusDestinationType.DATABRICKS_ZEROBUS;

  public static final String JSON_PROPERTY_UNITY_CATALOG_ENDPOINT = "unity_catalog_endpoint";
  private String unityCatalogEndpoint;

  public ObservabilityPipelineDatabricksZerobusDestination() {}

  @JsonCreator
  public ObservabilityPipelineDatabricksZerobusDestination(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH)
          ObservabilityPipelineDatabricksZerobusDestinationAuth auth,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INGESTION_ENDPOINT)
          String ingestionEndpoint,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_TABLE_NAME) String tableName,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineDatabricksZerobusDestinationType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_UNITY_CATALOG_ENDPOINT)
          String unityCatalogEndpoint) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    this.id = id;
    this.ingestionEndpoint = ingestionEndpoint;
    this.inputs = inputs;
    this.tableName = tableName;
    this.type = type;
    this.unparsed |= !type.isValid();
    this.unityCatalogEndpoint = unityCatalogEndpoint;
  }

  public ObservabilityPipelineDatabricksZerobusDestination auth(
      ObservabilityPipelineDatabricksZerobusDestinationAuth auth) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    return this;
  }

  /**
   * OAuth credentials for authenticating with the Databricks Zerobus ingestion API.
   *
   * @return auth
   */
  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineDatabricksZerobusDestinationAuth getAuth() {
    return auth;
  }

  public void setAuth(ObservabilityPipelineDatabricksZerobusDestinationAuth auth) {
    this.auth = auth;
  }

  public ObservabilityPipelineDatabricksZerobusDestination buffer(
      ObservabilityPipelineBufferOptions buffer) {
    this.buffer = buffer;
    this.unparsed |= buffer.unparsed;
    return this;
  }

  /**
   * Configuration for buffer settings on destination components.
   *
   * @return buffer
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BUFFER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineBufferOptions getBuffer() {
    return buffer;
  }

  public void setBuffer(ObservabilityPipelineBufferOptions buffer) {
    this.buffer = buffer;
  }

  public ObservabilityPipelineDatabricksZerobusDestination id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this component.
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

  public ObservabilityPipelineDatabricksZerobusDestination ingestionEndpoint(
      String ingestionEndpoint) {
    this.ingestionEndpoint = ingestionEndpoint;
    return this;
  }

  /**
   * Your Databricks Zerobus ingestion endpoint. This is the endpoint used to stream data directly
   * into your Databricks Lakehouse.
   *
   * @return ingestionEndpoint
   */
  @JsonProperty(JSON_PROPERTY_INGESTION_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIngestionEndpoint() {
    return ingestionEndpoint;
  }

  public void setIngestionEndpoint(String ingestionEndpoint) {
    this.ingestionEndpoint = ingestionEndpoint;
  }

  public ObservabilityPipelineDatabricksZerobusDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineDatabricksZerobusDestination addInputsItem(String inputsItem) {
    this.inputs.add(inputsItem);
    return this;
  }

  /**
   * A list of component IDs whose output is used as the <code>input</code> for this component.
   *
   * @return inputs
   */
  @JsonProperty(JSON_PROPERTY_INPUTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getInputs() {
    return inputs;
  }

  public void setInputs(List<String> inputs) {
    this.inputs = inputs;
  }

  public ObservabilityPipelineDatabricksZerobusDestination tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  /**
   * The fully qualified name of your target Databricks table. Make sure this table already exists
   * in your Databricks workspace before deploying.
   *
   * @return tableName
   */
  @JsonProperty(JSON_PROPERTY_TABLE_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  public ObservabilityPipelineDatabricksZerobusDestination type(
      ObservabilityPipelineDatabricksZerobusDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The destination type. The value must be <code>databricks_zerobus</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineDatabricksZerobusDestinationType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineDatabricksZerobusDestinationType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public ObservabilityPipelineDatabricksZerobusDestination unityCatalogEndpoint(
      String unityCatalogEndpoint) {
    this.unityCatalogEndpoint = unityCatalogEndpoint;
    return this;
  }

  /**
   * Your Databricks workspace URL. This is used to communicate with the Unity Catalog API.
   *
   * @return unityCatalogEndpoint
   */
  @JsonProperty(JSON_PROPERTY_UNITY_CATALOG_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUnityCatalogEndpoint() {
    return unityCatalogEndpoint;
  }

  public void setUnityCatalogEndpoint(String unityCatalogEndpoint) {
    this.unityCatalogEndpoint = unityCatalogEndpoint;
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
   * @return ObservabilityPipelineDatabricksZerobusDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineDatabricksZerobusDestination putAdditionalProperty(
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

  /** Return true if this ObservabilityPipelineDatabricksZerobusDestination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineDatabricksZerobusDestination
        observabilityPipelineDatabricksZerobusDestination =
            (ObservabilityPipelineDatabricksZerobusDestination) o;
    return Objects.equals(this.auth, observabilityPipelineDatabricksZerobusDestination.auth)
        && Objects.equals(this.buffer, observabilityPipelineDatabricksZerobusDestination.buffer)
        && Objects.equals(this.id, observabilityPipelineDatabricksZerobusDestination.id)
        && Objects.equals(
            this.ingestionEndpoint,
            observabilityPipelineDatabricksZerobusDestination.ingestionEndpoint)
        && Objects.equals(this.inputs, observabilityPipelineDatabricksZerobusDestination.inputs)
        && Objects.equals(
            this.tableName, observabilityPipelineDatabricksZerobusDestination.tableName)
        && Objects.equals(this.type, observabilityPipelineDatabricksZerobusDestination.type)
        && Objects.equals(
            this.unityCatalogEndpoint,
            observabilityPipelineDatabricksZerobusDestination.unityCatalogEndpoint)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineDatabricksZerobusDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        auth,
        buffer,
        id,
        ingestionEndpoint,
        inputs,
        tableName,
        type,
        unityCatalogEndpoint,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineDatabricksZerobusDestination {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ingestionEndpoint: ").append(toIndentedString(ingestionEndpoint)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    unityCatalogEndpoint: ")
        .append(toIndentedString(unityCatalogEndpoint))
        .append("\n");
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
