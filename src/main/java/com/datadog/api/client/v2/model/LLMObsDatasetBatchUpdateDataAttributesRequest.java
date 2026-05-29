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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Attributes for batch-updating records in an LLM Observability dataset. */
@JsonPropertyOrder({
  LLMObsDatasetBatchUpdateDataAttributesRequest.JSON_PROPERTY_CREATE_NEW_VERSION,
  LLMObsDatasetBatchUpdateDataAttributesRequest.JSON_PROPERTY_DELETE_RECORDS,
  LLMObsDatasetBatchUpdateDataAttributesRequest.JSON_PROPERTY_INSERT_RECORDS,
  LLMObsDatasetBatchUpdateDataAttributesRequest.JSON_PROPERTY_TAGS,
  LLMObsDatasetBatchUpdateDataAttributesRequest.JSON_PROPERTY_UPDATE_RECORDS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsDatasetBatchUpdateDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATE_NEW_VERSION = "create_new_version";
  private Boolean createNewVersion;

  public static final String JSON_PROPERTY_DELETE_RECORDS = "delete_records";
  private List<String> deleteRecords = null;

  public static final String JSON_PROPERTY_INSERT_RECORDS = "insert_records";
  private List<LLMObsDatasetBatchUpdateInsertRecord> insertRecords = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_UPDATE_RECORDS = "update_records";
  private List<LLMObsDatasetBatchUpdateUpdateRecord> updateRecords = null;

  public LLMObsDatasetBatchUpdateDataAttributesRequest createNewVersion(Boolean createNewVersion) {
    this.createNewVersion = createNewVersion;
    return this;
  }

  /**
   * Whether to create a new dataset version when applying the batch update. Defaults to <code>true
   * </code>.
   *
   * @return createNewVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATE_NEW_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCreateNewVersion() {
    return createNewVersion;
  }

  public void setCreateNewVersion(Boolean createNewVersion) {
    this.createNewVersion = createNewVersion;
  }

  public LLMObsDatasetBatchUpdateDataAttributesRequest deleteRecords(List<String> deleteRecords) {
    this.deleteRecords = deleteRecords;
    return this;
  }

  public LLMObsDatasetBatchUpdateDataAttributesRequest addDeleteRecordsItem(
      String deleteRecordsItem) {
    if (this.deleteRecords == null) {
      this.deleteRecords = new ArrayList<>();
    }
    this.deleteRecords.add(deleteRecordsItem);
    return this;
  }

  /**
   * Record IDs to delete.
   *
   * @return deleteRecords
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETE_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDeleteRecords() {
    return deleteRecords;
  }

  public void setDeleteRecords(List<String> deleteRecords) {
    this.deleteRecords = deleteRecords;
  }

  public LLMObsDatasetBatchUpdateDataAttributesRequest insertRecords(
      List<LLMObsDatasetBatchUpdateInsertRecord> insertRecords) {
    this.insertRecords = insertRecords;
    for (LLMObsDatasetBatchUpdateInsertRecord item : insertRecords) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsDatasetBatchUpdateDataAttributesRequest addInsertRecordsItem(
      LLMObsDatasetBatchUpdateInsertRecord insertRecordsItem) {
    if (this.insertRecords == null) {
      this.insertRecords = new ArrayList<>();
    }
    this.insertRecords.add(insertRecordsItem);
    this.unparsed |= insertRecordsItem.unparsed;
    return this;
  }

  /**
   * Records to insert.
   *
   * @return insertRecords
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INSERT_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsDatasetBatchUpdateInsertRecord> getInsertRecords() {
    return insertRecords;
  }

  public void setInsertRecords(List<LLMObsDatasetBatchUpdateInsertRecord> insertRecords) {
    this.insertRecords = insertRecords;
  }

  public LLMObsDatasetBatchUpdateDataAttributesRequest tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public LLMObsDatasetBatchUpdateDataAttributesRequest addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * List of tag strings.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public LLMObsDatasetBatchUpdateDataAttributesRequest updateRecords(
      List<LLMObsDatasetBatchUpdateUpdateRecord> updateRecords) {
    this.updateRecords = updateRecords;
    for (LLMObsDatasetBatchUpdateUpdateRecord item : updateRecords) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public LLMObsDatasetBatchUpdateDataAttributesRequest addUpdateRecordsItem(
      LLMObsDatasetBatchUpdateUpdateRecord updateRecordsItem) {
    if (this.updateRecords == null) {
      this.updateRecords = new ArrayList<>();
    }
    this.updateRecords.add(updateRecordsItem);
    this.unparsed |= updateRecordsItem.unparsed;
    return this;
  }

  /**
   * Records to update by ID.
   *
   * @return updateRecords
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsDatasetBatchUpdateUpdateRecord> getUpdateRecords() {
    return updateRecords;
  }

  public void setUpdateRecords(List<LLMObsDatasetBatchUpdateUpdateRecord> updateRecords) {
    this.updateRecords = updateRecords;
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
   * @return LLMObsDatasetBatchUpdateDataAttributesRequest
   */
  @JsonAnySetter
  public LLMObsDatasetBatchUpdateDataAttributesRequest putAdditionalProperty(
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

  /** Return true if this LLMObsDatasetBatchUpdateDataAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsDatasetBatchUpdateDataAttributesRequest llmObsDatasetBatchUpdateDataAttributesRequest =
        (LLMObsDatasetBatchUpdateDataAttributesRequest) o;
    return Objects.equals(
            this.createNewVersion, llmObsDatasetBatchUpdateDataAttributesRequest.createNewVersion)
        && Objects.equals(
            this.deleteRecords, llmObsDatasetBatchUpdateDataAttributesRequest.deleteRecords)
        && Objects.equals(
            this.insertRecords, llmObsDatasetBatchUpdateDataAttributesRequest.insertRecords)
        && Objects.equals(this.tags, llmObsDatasetBatchUpdateDataAttributesRequest.tags)
        && Objects.equals(
            this.updateRecords, llmObsDatasetBatchUpdateDataAttributesRequest.updateRecords)
        && Objects.equals(
            this.additionalProperties,
            llmObsDatasetBatchUpdateDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createNewVersion, deleteRecords, insertRecords, tags, updateRecords, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsDatasetBatchUpdateDataAttributesRequest {\n");
    sb.append("    createNewVersion: ").append(toIndentedString(createNewVersion)).append("\n");
    sb.append("    deleteRecords: ").append(toIndentedString(deleteRecords)).append("\n");
    sb.append("    insertRecords: ").append(toIndentedString(insertRecords)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updateRecords: ").append(toIndentedString(updateRecords)).append("\n");
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
