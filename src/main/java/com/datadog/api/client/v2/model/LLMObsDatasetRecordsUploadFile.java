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
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Multipart payload for uploading dataset records from a file. */
@JsonPropertyOrder({LLMObsDatasetRecordsUploadFile.JSON_PROPERTY_FILE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsDatasetRecordsUploadFile {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILE = "file";
  private File file;

  public LLMObsDatasetRecordsUploadFile file(File file) {
    this.file = file;
    return this;
  }

  /**
   * The records file to upload. Currently only CSV is supported. The file must include an <code>
   * input</code> column. Optional columns include <code>id</code>, <code>expected_output</code>,
   * <code>metadata</code>, and <code>tags</code>.
   *
   * @return file
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public File getFile() {
    return file;
  }

  public void setFile(File file) {
    this.file = file;
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
   * @return LLMObsDatasetRecordsUploadFile
   */
  @JsonAnySetter
  public LLMObsDatasetRecordsUploadFile putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsDatasetRecordsUploadFile object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsDatasetRecordsUploadFile llmObsDatasetRecordsUploadFile =
        (LLMObsDatasetRecordsUploadFile) o;
    return Objects.equals(this.file, llmObsDatasetRecordsUploadFile.file)
        && Objects.equals(
            this.additionalProperties, llmObsDatasetRecordsUploadFile.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsDatasetRecordsUploadFile {\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
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
