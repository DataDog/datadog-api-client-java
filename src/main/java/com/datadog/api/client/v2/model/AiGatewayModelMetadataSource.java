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

/** Provenance for model metadata enrichment. */
@JsonPropertyOrder({
  AiGatewayModelMetadataSource.JSON_PROPERTY_MATCHED_BY,
  AiGatewayModelMetadataSource.JSON_PROPERTY_MODEL_ID,
  AiGatewayModelMetadataSource.JSON_PROPERTY_NAME,
  AiGatewayModelMetadataSource.JSON_PROPERTY_OBSERVED_AT,
  AiGatewayModelMetadataSource.JSON_PROPERTY_PROVIDER,
  AiGatewayModelMetadataSource.JSON_PROPERTY_REVISION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelMetadataSource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MATCHED_BY = "matched_by";
  private AiGatewayModelMetadataSourceMatchedBy matchedBy;

  public static final String JSON_PROPERTY_MODEL_ID = "model_id";
  private String modelId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OBSERVED_AT = "observed_at";
  private OffsetDateTime observedAt;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private String provider;

  public static final String JSON_PROPERTY_REVISION = "revision";
  private String revision;

  public AiGatewayModelMetadataSource() {}

  @JsonCreator
  public AiGatewayModelMetadataSource(
      @JsonProperty(required = true, value = JSON_PROPERTY_MATCHED_BY)
          AiGatewayModelMetadataSourceMatchedBy matchedBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODEL_ID) String modelId,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROVIDER) String provider) {
    this.matchedBy = matchedBy;
    this.unparsed |= !matchedBy.isValid();
    this.modelId = modelId;
    this.name = name;
    this.provider = provider;
  }

  public AiGatewayModelMetadataSource matchedBy(AiGatewayModelMetadataSourceMatchedBy matchedBy) {
    this.matchedBy = matchedBy;
    this.unparsed |= !matchedBy.isValid();
    return this;
  }

  /**
   * Identifier strategy used to match the gateway catalog entry. Date-suffix and shared
   * canonical-model fallback matches produce partial metadata.
   *
   * @return matchedBy
   */
  @JsonProperty(JSON_PROPERTY_MATCHED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayModelMetadataSourceMatchedBy getMatchedBy() {
    return matchedBy;
  }

  public void setMatchedBy(AiGatewayModelMetadataSourceMatchedBy matchedBy) {
    if (!matchedBy.isValid()) {
      this.unparsed = true;
    }
    this.matchedBy = matchedBy;
  }

  public AiGatewayModelMetadataSource modelId(String modelId) {
    this.modelId = modelId;
    return this;
  }

  /**
   * Model identifier in the metadata source provider catalog.
   *
   * @return modelId
   */
  @JsonProperty(JSON_PROPERTY_MODEL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getModelId() {
    return modelId;
  }

  public void setModelId(String modelId) {
    this.modelId = modelId;
  }

  public AiGatewayModelMetadataSource name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Metadata source name.
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

  public AiGatewayModelMetadataSource observedAt(OffsetDateTime observedAt) {
    this.observedAt = observedAt;
    return this;
  }

  /**
   * Last successful observation of this valid source record. Retained invalid entries keep their
   * previous timestamp.
   *
   * @return observedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OBSERVED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getObservedAt() {
    return observedAt;
  }

  public void setObservedAt(OffsetDateTime observedAt) {
    this.observedAt = observedAt;
  }

  public AiGatewayModelMetadataSource provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Provider namespace in the metadata source, or canonical for a shared model record.
   *
   * @return provider
   */
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public AiGatewayModelMetadataSource revision(String revision) {
    this.revision = revision;
    return this;
  }

  /**
   * SHA-256 content revision of the source snapshot that supplied this record.
   *
   * @return revision
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRevision() {
    return revision;
  }

  public void setRevision(String revision) {
    this.revision = revision;
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
   * @return AiGatewayModelMetadataSource
   */
  @JsonAnySetter
  public AiGatewayModelMetadataSource putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayModelMetadataSource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelMetadataSource aiGatewayModelMetadataSource = (AiGatewayModelMetadataSource) o;
    return Objects.equals(this.matchedBy, aiGatewayModelMetadataSource.matchedBy)
        && Objects.equals(this.modelId, aiGatewayModelMetadataSource.modelId)
        && Objects.equals(this.name, aiGatewayModelMetadataSource.name)
        && Objects.equals(this.observedAt, aiGatewayModelMetadataSource.observedAt)
        && Objects.equals(this.provider, aiGatewayModelMetadataSource.provider)
        && Objects.equals(this.revision, aiGatewayModelMetadataSource.revision)
        && Objects.equals(
            this.additionalProperties, aiGatewayModelMetadataSource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        matchedBy, modelId, name, observedAt, provider, revision, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelMetadataSource {\n");
    sb.append("    matchedBy: ").append(toIndentedString(matchedBy)).append("\n");
    sb.append("    modelId: ").append(toIndentedString(modelId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    observedAt: ").append(toIndentedString(observedAt)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
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
