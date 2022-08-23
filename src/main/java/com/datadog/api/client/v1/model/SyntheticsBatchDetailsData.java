/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Wrapper object that contains the details of a batch.</p>
 */
@JsonPropertyOrder({
  SyntheticsBatchDetailsData.JSON_PROPERTY_METADATA,
  SyntheticsBatchDetailsData.JSON_PROPERTY_RESULTS,
  SyntheticsBatchDetailsData.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsBatchDetailsData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private SyntheticsCIBatchMetadata metadata;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<SyntheticsBatchResult> results = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SyntheticsStatus status;

  public SyntheticsBatchDetailsData metadata(SyntheticsCIBatchMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * <p>Metadata for the Synthetics tests run.</p>
   * @return metadata
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METADATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>List of results for the batch.</p>
   * @return results
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESULTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SyntheticsBatchResult> getResults() {
        return results;
      }
  public void setResults(List<SyntheticsBatchResult> results) {
    this.results = results;
  }
  public SyntheticsBatchDetailsData status(SyntheticsStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * <p>Determines whether or not the batch has passed, failed, or is in progress.</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SyntheticsStatus getStatus() {
        return status;
      }
  public void setStatus(SyntheticsStatus status) {
    if (!status.isValid()) {
        this.unparsed = true;
    }
    this.status = status;
  }

  /**
   * Return true if this SyntheticsBatchDetailsData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsBatchDetailsData syntheticsBatchDetailsData = (SyntheticsBatchDetailsData) o;
    return Objects.equals(this.metadata, syntheticsBatchDetailsData.metadata) && Objects.equals(this.results, syntheticsBatchDetailsData.results) && Objects.equals(this.status, syntheticsBatchDetailsData.status);
  }


  @Override
  public int hashCode() {
    return Objects.hash(metadata,results,status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsBatchDetailsData {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
