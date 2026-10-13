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
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The <code>azure_data_explorer</code> destination sends log events to an Azure Data Explorer
 * table.
 *
 * <p><strong>Supported pipeline types:</strong> logs
 */
@JsonPropertyOrder({
  ObservabilityPipelineAzureDataExplorerDestination.JSON_PROPERTY_AUTH,
  ObservabilityPipelineAzureDataExplorerDestination.JSON_PROPERTY_BATCH,
  ObservabilityPipelineAzureDataExplorerDestination.JSON_PROPERTY_BUFFER,
  ObservabilityPipelineAzureDataExplorerDestination.JSON_PROPERTY_COMPRESSION,
  ObservabilityPipelineAzureDataExplorerDestination.JSON_PROPERTY_DATABASE,
  ObservabilityPipelineAzureDataExplorerDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineAzureDataExplorerDestination.JSON_PROPERTY_INGESTION_ENDPOINT_KEY,
  ObservabilityPipelineAzureDataExplorerDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineAzureDataExplorerDestination.JSON_PROPERTY_MAPPING_REFERENCE,
  ObservabilityPipelineAzureDataExplorerDestination.JSON_PROPERTY_TABLE,
  ObservabilityPipelineAzureDataExplorerDestination.JSON_PROPERTY_TOKEN_SCOPE,
  ObservabilityPipelineAzureDataExplorerDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineAzureDataExplorerDestination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH = "auth";
  private ObservabilityPipelineAzureDataExplorerDestinationAuth auth;

  public static final String JSON_PROPERTY_BATCH = "batch";
  private ObservabilityPipelineAzureDataExplorerDestinationBatch batch;

  public static final String JSON_PROPERTY_BUFFER = "buffer";
  private ObservabilityPipelineBufferOptions buffer;

  public static final String JSON_PROPERTY_COMPRESSION = "compression";
  private ObservabilityPipelineAzureStorageDestinationCompressionGzip compression;

  public static final String JSON_PROPERTY_DATABASE = "database";
  private String database;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INGESTION_ENDPOINT_KEY = "ingestion_endpoint_key";
  private String ingestionEndpointKey;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_MAPPING_REFERENCE = "mapping_reference";
  private JsonNullable<String> mappingReference = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_TABLE = "table";
  private String table;

  public static final String JSON_PROPERTY_TOKEN_SCOPE = "token_scope";
  private String tokenScope;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineAzureDataExplorerDestinationType type =
      ObservabilityPipelineAzureDataExplorerDestinationType.AZURE_DATA_EXPLORER;

  public ObservabilityPipelineAzureDataExplorerDestination() {}

  @JsonCreator
  public ObservabilityPipelineAzureDataExplorerDestination(
      @JsonProperty(required = true, value = JSON_PROPERTY_AUTH)
          ObservabilityPipelineAzureDataExplorerDestinationAuth auth,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATABASE) String database,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_TABLE) String table,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineAzureDataExplorerDestinationType type) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    this.database = database;
    this.id = id;
    this.inputs = inputs;
    this.table = table;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineAzureDataExplorerDestination auth(
      ObservabilityPipelineAzureDataExplorerDestinationAuth auth) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    return this;
  }

  /**
   * Authentication configuration for Azure Data Explorer. The <code>azure_credential_kind</code>
   * field selects the credential type.
   *
   * @return auth
   */
  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineAzureDataExplorerDestinationAuth getAuth() {
    return auth;
  }

  public void setAuth(ObservabilityPipelineAzureDataExplorerDestinationAuth auth) {
    this.auth = auth;
    if (auth != null) {
      this.unparsed |= auth.unparsed;
    }
  }

  public ObservabilityPipelineAzureDataExplorerDestination batch(
      ObservabilityPipelineAzureDataExplorerDestinationBatch batch) {
    this.batch = batch;
    this.unparsed |= batch.unparsed;
    return this;
  }

  /**
   * Event batching settings for Azure Data Explorer ingestion.
   *
   * @return batch
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineAzureDataExplorerDestinationBatch getBatch() {
    return batch;
  }

  public void setBatch(ObservabilityPipelineAzureDataExplorerDestinationBatch batch) {
    this.batch = batch;
    if (batch != null) {
      this.unparsed |= batch.unparsed;
    }
  }

  public ObservabilityPipelineAzureDataExplorerDestination buffer(
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
    if (buffer != null) {
      this.unparsed |= buffer.unparsed;
    }
  }

  public ObservabilityPipelineAzureDataExplorerDestination compression(
      ObservabilityPipelineAzureStorageDestinationCompressionGzip compression) {
    this.compression = compression;
    this.unparsed |= compression.unparsed;
    return this;
  }

  /**
   * Gzip compression.
   *
   * @return compression
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineAzureStorageDestinationCompressionGzip getCompression() {
    return compression;
  }

  public void setCompression(
      ObservabilityPipelineAzureStorageDestinationCompressionGzip compression) {
    this.compression = compression;
    if (compression != null) {
      this.unparsed |= compression.unparsed;
    }
  }

  public ObservabilityPipelineAzureDataExplorerDestination database(String database) {
    this.database = database;
    return this;
  }

  /**
   * The name of the Azure Data Explorer database to ingest into. Supports template syntax.
   *
   * @return database
   */
  @JsonProperty(JSON_PROPERTY_DATABASE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDatabase() {
    return database;
  }

  public void setDatabase(String database) {
    this.database = database;
  }

  public ObservabilityPipelineAzureDataExplorerDestination id(String id) {
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

  public ObservabilityPipelineAzureDataExplorerDestination ingestionEndpointKey(
      String ingestionEndpointKey) {
    this.ingestionEndpointKey = ingestionEndpointKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that holds the Azure Data Explorer ingestion
   * endpoint URL. Defaults to <code>DESTINATION_AZURE_DATA_EXPLORER_INGESTION_ENDPOINT</code>
   * (prefixed with <code>DD_OP_</code> at runtime).
   *
   * @return ingestionEndpointKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INGESTION_ENDPOINT_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIngestionEndpointKey() {
    return ingestionEndpointKey;
  }

  public void setIngestionEndpointKey(String ingestionEndpointKey) {
    this.ingestionEndpointKey = ingestionEndpointKey;
  }

  public ObservabilityPipelineAzureDataExplorerDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineAzureDataExplorerDestination addInputsItem(String inputsItem) {
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

  public ObservabilityPipelineAzureDataExplorerDestination mappingReference(
      String mappingReference) {
    this.mappingReference = JsonNullable.<String>of(mappingReference);
    return this;
  }

  /**
   * The name of a pre-created ingestion mapping on the table used to map incoming events to
   * columns. Supports template syntax.
   *
   * @return mappingReference
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getMappingReference() {
    return mappingReference.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MAPPING_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getMappingReference_JsonNullable() {
    return mappingReference;
  }

  @JsonProperty(JSON_PROPERTY_MAPPING_REFERENCE)
  public void setMappingReference_JsonNullable(JsonNullable<String> mappingReference) {
    this.mappingReference = mappingReference;
  }

  public void setMappingReference(String mappingReference) {
    this.mappingReference = JsonNullable.<String>of(mappingReference);
  }

  public ObservabilityPipelineAzureDataExplorerDestination table(String table) {
    this.table = table;
    return this;
  }

  /**
   * The name of the Azure Data Explorer table to ingest into. Supports template syntax.
   *
   * @return table
   */
  @JsonProperty(JSON_PROPERTY_TABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTable() {
    return table;
  }

  public void setTable(String table) {
    this.table = table;
  }

  public ObservabilityPipelineAzureDataExplorerDestination tokenScope(String tokenScope) {
    this.tokenScope = tokenScope;
    return this;
  }

  /**
   * The OAuth scope requested when acquiring an access token for Azure Data Explorer. Defaults to
   * <code>https://kusto.kusto.windows.net/.default</code>.
   *
   * @return tokenScope
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKEN_SCOPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTokenScope() {
    return tokenScope;
  }

  public void setTokenScope(String tokenScope) {
    this.tokenScope = tokenScope;
  }

  public ObservabilityPipelineAzureDataExplorerDestination type(
      ObservabilityPipelineAzureDataExplorerDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The destination type. The value should always be <code>azure_data_explorer</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineAzureDataExplorerDestinationType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineAzureDataExplorerDestinationType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return ObservabilityPipelineAzureDataExplorerDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineAzureDataExplorerDestination putAdditionalProperty(
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

  /** Return true if this ObservabilityPipelineAzureDataExplorerDestination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineAzureDataExplorerDestination
        observabilityPipelineAzureDataExplorerDestination =
            (ObservabilityPipelineAzureDataExplorerDestination) o;
    return Objects.equals(this.auth, observabilityPipelineAzureDataExplorerDestination.auth)
        && Objects.equals(this.batch, observabilityPipelineAzureDataExplorerDestination.batch)
        && Objects.equals(this.buffer, observabilityPipelineAzureDataExplorerDestination.buffer)
        && Objects.equals(
            this.compression, observabilityPipelineAzureDataExplorerDestination.compression)
        && Objects.equals(this.database, observabilityPipelineAzureDataExplorerDestination.database)
        && Objects.equals(this.id, observabilityPipelineAzureDataExplorerDestination.id)
        && Objects.equals(
            this.ingestionEndpointKey,
            observabilityPipelineAzureDataExplorerDestination.ingestionEndpointKey)
        && Objects.equals(this.inputs, observabilityPipelineAzureDataExplorerDestination.inputs)
        && Objects.equals(
            this.mappingReference,
            observabilityPipelineAzureDataExplorerDestination.mappingReference)
        && Objects.equals(this.table, observabilityPipelineAzureDataExplorerDestination.table)
        && Objects.equals(
            this.tokenScope, observabilityPipelineAzureDataExplorerDestination.tokenScope)
        && Objects.equals(this.type, observabilityPipelineAzureDataExplorerDestination.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineAzureDataExplorerDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        auth,
        batch,
        buffer,
        compression,
        database,
        id,
        ingestionEndpointKey,
        inputs,
        mappingReference,
        table,
        tokenScope,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineAzureDataExplorerDestination {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
    sb.append("    buffer: ").append(toIndentedString(buffer)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ingestionEndpointKey: ")
        .append(toIndentedString(ingestionEndpointKey))
        .append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    mappingReference: ").append(toIndentedString(mappingReference)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    tokenScope: ").append(toIndentedString(tokenScope)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
