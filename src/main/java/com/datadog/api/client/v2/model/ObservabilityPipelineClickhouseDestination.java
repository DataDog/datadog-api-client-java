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
 * The <code>clickhouse</code> destination sends log events to a ClickHouse database table over
 * HTTP.
 *
 * <p><strong>Supported pipeline types:</strong> logs.
 */
@JsonPropertyOrder({
  ObservabilityPipelineClickhouseDestination.JSON_PROPERTY_AUTH,
  ObservabilityPipelineClickhouseDestination.JSON_PROPERTY_BATCH,
  ObservabilityPipelineClickhouseDestination.JSON_PROPERTY_BATCH_ENCODING,
  ObservabilityPipelineClickhouseDestination.JSON_PROPERTY_COMPRESSION,
  ObservabilityPipelineClickhouseDestination.JSON_PROPERTY_DATABASE,
  ObservabilityPipelineClickhouseDestination.JSON_PROPERTY_DATE_TIME_BEST_EFFORT,
  ObservabilityPipelineClickhouseDestination.JSON_PROPERTY_ENDPOINT_URL_KEY,
  ObservabilityPipelineClickhouseDestination.JSON_PROPERTY_FORMAT,
  ObservabilityPipelineClickhouseDestination.JSON_PROPERTY_ID,
  ObservabilityPipelineClickhouseDestination.JSON_PROPERTY_INPUTS,
  ObservabilityPipelineClickhouseDestination.JSON_PROPERTY_SKIP_UNKNOWN_FIELDS,
  ObservabilityPipelineClickhouseDestination.JSON_PROPERTY_TABLE,
  ObservabilityPipelineClickhouseDestination.JSON_PROPERTY_TLS,
  ObservabilityPipelineClickhouseDestination.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineClickhouseDestination {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH = "auth";
  private ObservabilityPipelineClickhouseDestinationAuth auth;

  public static final String JSON_PROPERTY_BATCH = "batch";
  private ObservabilityPipelineClickhouseDestinationBatch batch;

  public static final String JSON_PROPERTY_BATCH_ENCODING = "batch_encoding";
  private ObservabilityPipelineClickhouseDestinationBatchEncoding batchEncoding;

  public static final String JSON_PROPERTY_COMPRESSION = "compression";
  private ObservabilityPipelineClickhouseDestinationCompression compression;

  public static final String JSON_PROPERTY_DATABASE = "database";
  private String database;

  public static final String JSON_PROPERTY_DATE_TIME_BEST_EFFORT = "date_time_best_effort";
  private Boolean dateTimeBestEffort;

  public static final String JSON_PROPERTY_ENDPOINT_URL_KEY = "endpoint_url_key";
  private String endpointUrlKey;

  public static final String JSON_PROPERTY_FORMAT = "format";
  private ObservabilityPipelineClickhouseDestinationFormat format;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_INPUTS = "inputs";
  private List<String> inputs = new ArrayList<>();

  public static final String JSON_PROPERTY_SKIP_UNKNOWN_FIELDS = "skip_unknown_fields";
  private JsonNullable<Boolean> skipUnknownFields = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_TABLE = "table";
  private String table;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineClickhouseDestinationType type =
      ObservabilityPipelineClickhouseDestinationType.CLICKHOUSE;

  public ObservabilityPipelineClickhouseDestination() {}

  @JsonCreator
  public ObservabilityPipelineClickhouseDestination(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_INPUTS) List<String> inputs,
      @JsonProperty(required = true, value = JSON_PROPERTY_TABLE) String table,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineClickhouseDestinationType type) {
    this.id = id;
    this.inputs = inputs;
    this.table = table;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineClickhouseDestination auth(
      ObservabilityPipelineClickhouseDestinationAuth auth) {
    this.auth = auth;
    this.unparsed |= auth.unparsed;
    return this;
  }

  /**
   * HTTP Basic Authentication credentials for the ClickHouse destination. When <code>strategy
   * </code> is <code>basic</code>, provide <code>username_key</code> and <code>password_key</code>
   * that reference environment variables or secrets containing the credentials.
   *
   * @return auth
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineClickhouseDestinationAuth getAuth() {
    return auth;
  }

  public void setAuth(ObservabilityPipelineClickhouseDestinationAuth auth) {
    this.auth = auth;
  }

  public ObservabilityPipelineClickhouseDestination batch(
      ObservabilityPipelineClickhouseDestinationBatch batch) {
    this.batch = batch;
    this.unparsed |= batch.unparsed;
    return this;
  }

  /**
   * Batching configuration for ClickHouse inserts.
   *
   * @return batch
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineClickhouseDestinationBatch getBatch() {
    return batch;
  }

  public void setBatch(ObservabilityPipelineClickhouseDestinationBatch batch) {
    this.batch = batch;
  }

  public ObservabilityPipelineClickhouseDestination batchEncoding(
      ObservabilityPipelineClickhouseDestinationBatchEncoding batchEncoding) {
    this.batchEncoding = batchEncoding;
    this.unparsed |= batchEncoding.unparsed;
    return this;
  }

  /**
   * Batch encoding configuration for the ClickHouse destination. Required when <code>format</code>
   * is <code>arrow_stream</code>. The <code>codec</code> field must be set to <code>arrow_stream
   * </code>.
   *
   * @return batchEncoding
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BATCH_ENCODING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineClickhouseDestinationBatchEncoding getBatchEncoding() {
    return batchEncoding;
  }

  public void setBatchEncoding(
      ObservabilityPipelineClickhouseDestinationBatchEncoding batchEncoding) {
    this.batchEncoding = batchEncoding;
  }

  public ObservabilityPipelineClickhouseDestination compression(
      ObservabilityPipelineClickhouseDestinationCompression compression) {
    this.compression = compression;
    this.unparsed |= compression.unparsed;
    return this;
  }

  /**
   * Compression setting for outbound HTTP requests to ClickHouse. Can be specified as a shorthand
   * string (<code>"gzip"</code> or <code>"none"</code>) or as an object with an <code>algorithm
   * </code> field and an optional <code>level</code> (gzip only, 1–9).
   *
   * @return compression
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineClickhouseDestinationCompression getCompression() {
    return compression;
  }

  public void setCompression(ObservabilityPipelineClickhouseDestinationCompression compression) {
    this.compression = compression;
  }

  public ObservabilityPipelineClickhouseDestination database(String database) {
    this.database = database;
    return this;
  }

  /**
   * Optional ClickHouse database name. If omitted, the user's default database on the ClickHouse
   * server is used.
   *
   * @return database
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATABASE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDatabase() {
    return database;
  }

  public void setDatabase(String database) {
    this.database = database;
  }

  public ObservabilityPipelineClickhouseDestination dateTimeBestEffort(Boolean dateTimeBestEffort) {
    this.dateTimeBestEffort = dateTimeBestEffort;
    return this;
  }

  /**
   * When <code>true</code>, enables flexible DateTime parsing on the ClickHouse server side.
   *
   * @return dateTimeBestEffort
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATE_TIME_BEST_EFFORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDateTimeBestEffort() {
    return dateTimeBestEffort;
  }

  public void setDateTimeBestEffort(Boolean dateTimeBestEffort) {
    this.dateTimeBestEffort = dateTimeBestEffort;
  }

  public ObservabilityPipelineClickhouseDestination endpointUrlKey(String endpointUrlKey) {
    this.endpointUrlKey = endpointUrlKey;
    return this;
  }

  /**
   * Name of the environment variable or secret that contains the ClickHouse HTTP endpoint URL.
   * Defaults to <code>DESTINATION_CLICKHOUSE_ENDPOINT_URL</code> (prefixed with <code>DD_OP_</code>
   * at runtime).
   *
   * @return endpointUrlKey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDPOINT_URL_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEndpointUrlKey() {
    return endpointUrlKey;
  }

  public void setEndpointUrlKey(String endpointUrlKey) {
    this.endpointUrlKey = endpointUrlKey;
  }

  public ObservabilityPipelineClickhouseDestination format(
      ObservabilityPipelineClickhouseDestinationFormat format) {
    this.format = format;
    this.unparsed |= !format.isValid();
    return this;
  }

  /**
   * Insert format for events sent to ClickHouse. - <code>json_each_row</code>: Maps event fields to
   * columns by name (ClickHouse <code>JSONEachRow</code>). - <code>json_as_object</code>: Inserts
   * each event into a single <code>Object('json')</code> / <code>JSON</code> column (ClickHouse
   * <code>JSONAsObject</code>). - <code>json_as_string</code>: Inserts each event into a single
   * <code>String</code>-typed column as raw JSON (ClickHouse <code>JSONAsString</code>). - <code>
   * arrow_stream</code>: Batches events using Apache Arrow IPC streaming format. Requires <code>
   * batch_encoding</code>.
   *
   * @return format
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineClickhouseDestinationFormat getFormat() {
    return format;
  }

  public void setFormat(ObservabilityPipelineClickhouseDestinationFormat format) {
    if (!format.isValid()) {
      this.unparsed = true;
    }
    this.format = format;
  }

  public ObservabilityPipelineClickhouseDestination id(String id) {
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

  public ObservabilityPipelineClickhouseDestination inputs(List<String> inputs) {
    this.inputs = inputs;
    return this;
  }

  public ObservabilityPipelineClickhouseDestination addInputsItem(String inputsItem) {
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

  public ObservabilityPipelineClickhouseDestination skipUnknownFields(Boolean skipUnknownFields) {
    this.skipUnknownFields = JsonNullable.<Boolean>of(skipUnknownFields);
    return this;
  }

  /**
   * When <code>true</code>, fields not present in the target table schema are dropped instead of
   * causing insert errors. When unset, the ClickHouse server's own <code>
   * input_format_skip_unknown_fields</code> setting applies.
   *
   * @return skipUnknownFields
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getSkipUnknownFields() {
    return skipUnknownFields.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SKIP_UNKNOWN_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getSkipUnknownFields_JsonNullable() {
    return skipUnknownFields;
  }

  @JsonProperty(JSON_PROPERTY_SKIP_UNKNOWN_FIELDS)
  public void setSkipUnknownFields_JsonNullable(JsonNullable<Boolean> skipUnknownFields) {
    this.skipUnknownFields = skipUnknownFields;
  }

  public void setSkipUnknownFields(Boolean skipUnknownFields) {
    this.skipUnknownFields = JsonNullable.<Boolean>of(skipUnknownFields);
  }

  public ObservabilityPipelineClickhouseDestination table(String table) {
    this.table = table;
    return this;
  }

  /**
   * Target ClickHouse table name. Events are inserted into this table.
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

  public ObservabilityPipelineClickhouseDestination tls(ObservabilityPipelineTls tls) {
    this.tls = tls;
    this.unparsed |= tls.unparsed;
    return this;
  }

  /**
   * Configuration for enabling TLS encryption between the pipeline component and external services.
   *
   * @return tls
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineTls getTls() {
    return tls;
  }

  public void setTls(ObservabilityPipelineTls tls) {
    this.tls = tls;
  }

  public ObservabilityPipelineClickhouseDestination type(
      ObservabilityPipelineClickhouseDestinationType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The destination type. The value must be <code>clickhouse</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineClickhouseDestinationType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineClickhouseDestinationType type) {
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
   * @return ObservabilityPipelineClickhouseDestination
   */
  @JsonAnySetter
  public ObservabilityPipelineClickhouseDestination putAdditionalProperty(
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

  /** Return true if this ObservabilityPipelineClickhouseDestination object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineClickhouseDestination observabilityPipelineClickhouseDestination =
        (ObservabilityPipelineClickhouseDestination) o;
    return Objects.equals(this.auth, observabilityPipelineClickhouseDestination.auth)
        && Objects.equals(this.batch, observabilityPipelineClickhouseDestination.batch)
        && Objects.equals(
            this.batchEncoding, observabilityPipelineClickhouseDestination.batchEncoding)
        && Objects.equals(this.compression, observabilityPipelineClickhouseDestination.compression)
        && Objects.equals(this.database, observabilityPipelineClickhouseDestination.database)
        && Objects.equals(
            this.dateTimeBestEffort, observabilityPipelineClickhouseDestination.dateTimeBestEffort)
        && Objects.equals(
            this.endpointUrlKey, observabilityPipelineClickhouseDestination.endpointUrlKey)
        && Objects.equals(this.format, observabilityPipelineClickhouseDestination.format)
        && Objects.equals(this.id, observabilityPipelineClickhouseDestination.id)
        && Objects.equals(this.inputs, observabilityPipelineClickhouseDestination.inputs)
        && Objects.equals(
            this.skipUnknownFields, observabilityPipelineClickhouseDestination.skipUnknownFields)
        && Objects.equals(this.table, observabilityPipelineClickhouseDestination.table)
        && Objects.equals(this.tls, observabilityPipelineClickhouseDestination.tls)
        && Objects.equals(this.type, observabilityPipelineClickhouseDestination.type)
        && Objects.equals(
            this.additionalProperties,
            observabilityPipelineClickhouseDestination.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        auth,
        batch,
        batchEncoding,
        compression,
        database,
        dateTimeBestEffort,
        endpointUrlKey,
        format,
        id,
        inputs,
        skipUnknownFields,
        table,
        tls,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineClickhouseDestination {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
    sb.append("    batchEncoding: ").append(toIndentedString(batchEncoding)).append("\n");
    sb.append("    compression: ").append(toIndentedString(compression)).append("\n");
    sb.append("    database: ").append(toIndentedString(database)).append("\n");
    sb.append("    dateTimeBestEffort: ").append(toIndentedString(dateTimeBestEffort)).append("\n");
    sb.append("    endpointUrlKey: ").append(toIndentedString(endpointUrlKey)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    skipUnknownFields: ").append(toIndentedString(skipUnknownFields)).append("\n");
    sb.append("    table: ").append(toIndentedString(table)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
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
