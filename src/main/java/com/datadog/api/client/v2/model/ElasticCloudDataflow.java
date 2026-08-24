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

/**
 * An Elastic Cloud monitoring dataflow toggle. The set of dataflow ids is fixed by the interface
 * schema.
 */
@JsonPropertyOrder({
  ElasticCloudDataflow.JSON_PROPERTY_ENABLED,
  ElasticCloudDataflow.JSON_PROPERTY_ID,
  ElasticCloudDataflow.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ElasticCloudDataflow {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_ID = "id";
  private ElasticCloudDataflowId id;

  public static final String JSON_PROPERTY_STATUS = "status";
  private IntegrationAccountDataflowStatus status;

  public ElasticCloudDataflow() {}

  @JsonCreator
  public ElasticCloudDataflow(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) ElasticCloudDataflowId id) {
    this.id = id;
    this.unparsed |= !id.isValid();
  }

  public ElasticCloudDataflow enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the dataflow is enabled.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ElasticCloudDataflow id(ElasticCloudDataflowId id) {
    this.id = id;
    this.unparsed |= !id.isValid();
    return this;
  }

  /**
   * Identifier of an Elastic Cloud monitoring dataflow.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ElasticCloudDataflowId getId() {
    return id;
  }

  public void setId(ElasticCloudDataflowId id) {
    if (!id.isValid()) {
      this.unparsed = true;
    }
    this.id = id;
  }

  /**
   * Read-only, server-computed collection status of a dataflow.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IntegrationAccountDataflowStatus getStatus() {
    return status;
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
   * @return ElasticCloudDataflow
   */
  @JsonAnySetter
  public ElasticCloudDataflow putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ElasticCloudDataflow object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElasticCloudDataflow elasticCloudDataflow = (ElasticCloudDataflow) o;
    return Objects.equals(this.enabled, elasticCloudDataflow.enabled)
        && Objects.equals(this.id, elasticCloudDataflow.id)
        && Objects.equals(this.status, elasticCloudDataflow.status)
        && Objects.equals(this.additionalProperties, elasticCloudDataflow.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, id, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElasticCloudDataflow {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
