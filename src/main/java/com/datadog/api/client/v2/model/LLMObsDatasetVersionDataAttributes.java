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

/** Attributes of an LLM Observability dataset version. */
@JsonPropertyOrder({
  LLMObsDatasetVersionDataAttributes.JSON_PROPERTY_DATASET_ID,
  LLMObsDatasetVersionDataAttributes.JSON_PROPERTY_LAST_USED,
  LLMObsDatasetVersionDataAttributes.JSON_PROPERTY_VERSION_NUMBER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsDatasetVersionDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATASET_ID = "dataset_id";
  private String datasetId;

  public static final String JSON_PROPERTY_LAST_USED = "last_used";
  private OffsetDateTime lastUsed;

  public static final String JSON_PROPERTY_VERSION_NUMBER = "version_number";
  private Integer versionNumber;

  public LLMObsDatasetVersionDataAttributes() {}

  @JsonCreator
  public LLMObsDatasetVersionDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASET_ID) String datasetId,
      @JsonProperty(required = true, value = JSON_PROPERTY_LAST_USED) OffsetDateTime lastUsed,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION_NUMBER) Integer versionNumber) {
    this.datasetId = datasetId;
    this.lastUsed = lastUsed;
    if (lastUsed != null) {}
    this.versionNumber = versionNumber;
  }

  public LLMObsDatasetVersionDataAttributes datasetId(String datasetId) {
    this.datasetId = datasetId;
    return this;
  }

  /**
   * Unique identifier of the dataset this version belongs to.
   *
   * @return datasetId
   */
  @JsonProperty(JSON_PROPERTY_DATASET_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDatasetId() {
    return datasetId;
  }

  public void setDatasetId(String datasetId) {
    this.datasetId = datasetId;
  }

  public LLMObsDatasetVersionDataAttributes lastUsed(OffsetDateTime lastUsed) {
    this.lastUsed = lastUsed;
    if (lastUsed != null) {}
    return this;
  }

  /**
   * Timestamp when this dataset version was last referenced. Null if the version has never been
   * used.
   *
   * @return lastUsed
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_USED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getLastUsed() {
    return lastUsed;
  }

  public void setLastUsed(OffsetDateTime lastUsed) {
    this.lastUsed = lastUsed;
  }

  public LLMObsDatasetVersionDataAttributes versionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
    return this;
  }

  /**
   * Sequential version number for this dataset version. maximum: 2147483647
   *
   * @return versionNumber
   */
  @JsonProperty(JSON_PROPERTY_VERSION_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Integer getVersionNumber() {
    return versionNumber;
  }

  public void setVersionNumber(Integer versionNumber) {
    this.versionNumber = versionNumber;
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
   * @return LLMObsDatasetVersionDataAttributes
   */
  @JsonAnySetter
  public LLMObsDatasetVersionDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsDatasetVersionDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsDatasetVersionDataAttributes llmObsDatasetVersionDataAttributes =
        (LLMObsDatasetVersionDataAttributes) o;
    return Objects.equals(this.datasetId, llmObsDatasetVersionDataAttributes.datasetId)
        && Objects.equals(this.lastUsed, llmObsDatasetVersionDataAttributes.lastUsed)
        && Objects.equals(this.versionNumber, llmObsDatasetVersionDataAttributes.versionNumber)
        && Objects.equals(
            this.additionalProperties, llmObsDatasetVersionDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datasetId, lastUsed, versionNumber, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsDatasetVersionDataAttributes {\n");
    sb.append("    datasetId: ").append(toIndentedString(datasetId)).append("\n");
    sb.append("    lastUsed: ").append(toIndentedString(lastUsed)).append("\n");
    sb.append("    versionNumber: ").append(toIndentedString(versionNumber)).append("\n");
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
