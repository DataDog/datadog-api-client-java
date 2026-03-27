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
import java.util.UUID;
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
   * <p>Object containing information about the tests triggered.</p>
 */
@JsonPropertyOrder({
  SyntheticsTriggerCITestsResponse.JSON_PROPERTY_BATCH_ID,
  SyntheticsTriggerCITestsResponse.JSON_PROPERTY_LOCATIONS,
  SyntheticsTriggerCITestsResponse.JSON_PROPERTY_RESULTS,
  SyntheticsTriggerCITestsResponse.JSON_PROPERTY_TRIGGERED_CHECK_IDS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTriggerCITestsResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BATCH_ID = "batch_id";
  private JsonNullable<String> batchId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LOCATIONS = "locations";
  private List<SyntheticsTriggerCITestLocation> locations = null;

  public static final String JSON_PROPERTY_RESULTS = "results";
  private List<SyntheticsTriggerCITestRunResult> results = null;

  public static final String JSON_PROPERTY_TRIGGERED_CHECK_IDS = "triggered_check_ids";
  private List<String> triggeredCheckIds = null;

  public SyntheticsTriggerCITestsResponse batchId(String batchId) {
    this.batchId = JsonNullable.<String>of(batchId);
    return this;
  }

  /**
   * <p>The public ID of the batch triggered.</p>
   * @return batchId
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public String getBatchId() {
        return batchId.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_BATCH_ID)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getBatchId_JsonNullable() {
    return batchId;
  }
  @JsonProperty(JSON_PROPERTY_BATCH_ID)public void setBatchId_JsonNullable(JsonNullable<String> batchId) {
    this.batchId = batchId;
  }
  public void setBatchId(String batchId) {
    this.batchId = JsonNullable.<String>of(batchId);
  }
  public SyntheticsTriggerCITestsResponse locations(List<SyntheticsTriggerCITestLocation> locations) {
    this.locations = locations;
    for (SyntheticsTriggerCITestLocation item : locations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SyntheticsTriggerCITestsResponse addLocationsItem(SyntheticsTriggerCITestLocation locationsItem) {
    if (this.locations == null) {
      this.locations = new ArrayList<>();
    }
    this.locations.add(locationsItem);
    this.unparsed |= locationsItem.unparsed;
    return this;
  }

  /**
   * <p>List of Synthetic locations.</p>
   * @return locations
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOCATIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SyntheticsTriggerCITestLocation> getLocations() {
        return locations;
      }
  public void setLocations(List<SyntheticsTriggerCITestLocation> locations) {
    this.locations = locations;
  }
  public SyntheticsTriggerCITestsResponse results(List<SyntheticsTriggerCITestRunResult> results) {
    this.results = results;
    for (SyntheticsTriggerCITestRunResult item : results) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SyntheticsTriggerCITestsResponse addResultsItem(SyntheticsTriggerCITestRunResult resultsItem) {
    if (this.results == null) {
      this.results = new ArrayList<>();
    }
    this.results.add(resultsItem);
    this.unparsed |= resultsItem.unparsed;
    return this;
  }

  /**
   * <p>Information about the tests runs.</p>
   * @return results
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RESULTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SyntheticsTriggerCITestRunResult> getResults() {
        return results;
      }
  public void setResults(List<SyntheticsTriggerCITestRunResult> results) {
    this.results = results;
  }
  public SyntheticsTriggerCITestsResponse triggeredCheckIds(List<String> triggeredCheckIds) {
    this.triggeredCheckIds = triggeredCheckIds;
    return this;
  }
  public SyntheticsTriggerCITestsResponse addTriggeredCheckIdsItem(String triggeredCheckIdsItem) {
    if (this.triggeredCheckIds == null) {
      this.triggeredCheckIds = new ArrayList<>();
    }
    this.triggeredCheckIds.add(triggeredCheckIdsItem);
    return this;
  }

  /**
   * <p>The public IDs of the Synthetic test triggered.</p>
   * @return triggeredCheckIds
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TRIGGERED_CHECK_IDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTriggeredCheckIds() {
        return triggeredCheckIds;
      }
  public void setTriggeredCheckIds(List<String> triggeredCheckIds) {
    this.triggeredCheckIds = triggeredCheckIds;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SyntheticsTriggerCITestsResponse
   */
  @JsonAnySetter
  public SyntheticsTriggerCITestsResponse putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this SyntheticsTriggerCITestsResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTriggerCITestsResponse syntheticsTriggerCiTestsResponse = (SyntheticsTriggerCITestsResponse) o;
    return Objects.equals(this.batchId, syntheticsTriggerCiTestsResponse.batchId) && Objects.equals(this.locations, syntheticsTriggerCiTestsResponse.locations) && Objects.equals(this.results, syntheticsTriggerCiTestsResponse.results) && Objects.equals(this.triggeredCheckIds, syntheticsTriggerCiTestsResponse.triggeredCheckIds) && Objects.equals(this.additionalProperties, syntheticsTriggerCiTestsResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(batchId,locations,results,triggeredCheckIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTriggerCITestsResponse {\n");
    sb.append("    batchId: ").append(toIndentedString(batchId)).append("\n");
    sb.append("    locations: ").append(toIndentedString(locations)).append("\n");
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
    sb.append("    triggeredCheckIds: ").append(toIndentedString(triggeredCheckIds)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
