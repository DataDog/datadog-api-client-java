/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Wrapper object that contains the details of a batch. */
@JsonPropertyOrder({
  SyntheticsBatchDetailsData.JSON_PROPERTY_METADATA,
  SyntheticsBatchDetailsData.JSON_PROPERTY_RESULTS,
  SyntheticsBatchDetailsData.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsBatchDetailsData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private SyntheticsCIBatchMetadata metadata;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<SyntheticsBatchResult> results = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SyntheticsBatchStatus status;

  public SyntheticsBatchDetailsData metadata(SyntheticsCIBatchMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * Metadata for the Synthetic tests run.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsCIBatchMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(SyntheticsCIBatchMetadata metadata) {
    this.metadata = metadata;
  }

  public SyntheticsBatchDetailsData results(List<SyntheticsBatchResult> results) {
    this.results = results;
    for (SyntheticsBatchResult item : results) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsBatchDetailsData addResultsItem(SyntheticsBatchResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    this.unparsed |= resultsItem.unparsed;
    return this;
  }

  /**
   * List of results for the batch.
   *
   * @return results
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESULTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsBatchResult> getResults() {
    return results;
  }

  public void setResults(List<SyntheticsBatchResult> results) {
    this.results = results;
  }

  public SyntheticsBatchDetailsData status(SyntheticsBatchStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Determines whether the batch has passed, failed, or is in progress.
   *
   * @return status
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsBatchStatus getStatus() {
    return status;
  }

  public void setStatus(SyntheticsBatchStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
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
   * @return SyntheticsBatchDetailsData
   */
  @JsonAnySetter
  public SyntheticsBatchDetailsData putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsBatchDetailsData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBatchDetailsData syntheticsBatchDetailsData = (SyntheticsBatchDetailsData) o;
    return Objects.equals(this.metadata, syntheticsBatchDetailsData.metadata)
        && Objects.equals(this.results, syntheticsBatchDetailsData.results)
        && Objects.equals(this.status, syntheticsBatchDetailsData.status)
        && Objects.equals(
            this.additionalProperties, syntheticsBatchDetailsData.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, results, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBatchDetailsData {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
