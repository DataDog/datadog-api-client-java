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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** Selected experiment result run, its recorded EVSI forecast, and results freshness. */
@JsonPropertyOrder({
  ExperimentsExperimentResultsV2MetaDTO.JSON_PROPERTY_EVSI_CONTEXT,
  ExperimentsExperimentResultsV2MetaDTO.JSON_PROPERTY_IS_STALE,
  ExperimentsExperimentResultsV2MetaDTO.JSON_PROPERTY_RESULT_RUN_ID,
  ExperimentsExperimentResultsV2MetaDTO.JSON_PROPERTY_RESULTS_LAST_UPDATED,
  ExperimentsExperimentResultsV2MetaDTO.JSON_PROPERTY_STALE_REASONS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsExperimentResultsV2MetaDTO {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVSI_CONTEXT = "evsi_context";
  private ExperimentsEVSIContext evsiContext;

  public static final String JSON_PROPERTY_IS_STALE = "is_stale";
  private Boolean isStale;

  public static final String JSON_PROPERTY_RESULT_RUN_ID = "result_run_id";
  private UUID resultRunId;

  public static final String JSON_PROPERTY_RESULTS_LAST_UPDATED = "results_last_updated";
  private JsonNullable<OffsetDateTime> resultsLastUpdated =
      JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_STALE_REASONS = "stale_reasons";
  private List<String> staleReasons = null;

  public ExperimentsExperimentResultsV2MetaDTO() {}

  @JsonCreator
  public ExperimentsExperimentResultsV2MetaDTO(
      @JsonProperty(required = true, value = JSON_PROPERTY_RESULT_RUN_ID) UUID resultRunId) {
    this.resultRunId = resultRunId;
  }

  public ExperimentsExperimentResultsV2MetaDTO evsiContext(ExperimentsEVSIContext evsiContext) {
    this.evsiContext = evsiContext;
    this.unparsed |= evsiContext.unparsed;
    return this;
  }

  /**
   * Forecast horizon and traffic counts used to calculate expected value of sample information
   * (EVSI) for result_run_id. Assumes traffic continues at the rate observed during the lookback
   * window. Omitted if the forecast was not recorded or could not be loaded.
   *
   * @return evsiContext
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVSI_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsEVSIContext getEvsiContext() {
    return evsiContext;
  }

  public void setEvsiContext(ExperimentsEVSIContext evsiContext) {
    this.evsiContext = evsiContext;
    if (evsiContext != null) {
      this.unparsed |= evsiContext.unparsed;
    }
  }

  public ExperimentsExperimentResultsV2MetaDTO isStale(Boolean isStale) {
    this.isStale = isStale;
    return this;
  }

  /**
   * Whether the saved results require a refresh or their freshness cannot be confirmed. See
   * stale_reasons for details.
   *
   * @return isStale
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_STALE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsStale() {
    return isStale;
  }

  public void setIsStale(Boolean isStale) {
    this.isStale = isStale;
  }

  public ExperimentsExperimentResultsV2MetaDTO resultRunId(UUID resultRunId) {
    this.resultRunId = resultRunId;
    return this;
  }

  /**
   * ID of the successful experiment run that produced these results.
   *
   * @return resultRunId
   */
  @JsonProperty(JSON_PROPERTY_RESULT_RUN_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getResultRunId() {
    return resultRunId;
  }

  public void setResultRunId(UUID resultRunId) {
    this.resultRunId = resultRunId;
  }

  public ExperimentsExperimentResultsV2MetaDTO resultsLastUpdated(
      OffsetDateTime resultsLastUpdated) {
    this.resultsLastUpdated = JsonNullable.<OffsetDateTime>of(resultsLastUpdated);
    return this;
  }

  /**
   * Time when the experiment results were last updated.
   *
   * @return resultsLastUpdated
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getResultsLastUpdated() {
    return resultsLastUpdated.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RESULTS_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getResultsLastUpdated_JsonNullable() {
    return resultsLastUpdated;
  }

  @JsonProperty(JSON_PROPERTY_RESULTS_LAST_UPDATED)
  public void setResultsLastUpdated_JsonNullable(JsonNullable<OffsetDateTime> resultsLastUpdated) {
    this.resultsLastUpdated = resultsLastUpdated;
  }

  public void setResultsLastUpdated(OffsetDateTime resultsLastUpdated) {
    this.resultsLastUpdated = JsonNullable.<OffsetDateTime>of(resultsLastUpdated);
  }

  public ExperimentsExperimentResultsV2MetaDTO staleReasons(List<String> staleReasons) {
    this.staleReasons = staleReasons;
    return this;
  }

  public ExperimentsExperimentResultsV2MetaDTO addStaleReasonsItem(String staleReasonsItem) {
    if (this.staleReasons == null) {
      this.staleReasons = new ArrayList<>();
    }
    this.staleReasons.add(staleReasonsItem);
    return this;
  }

  /**
   * Reasons the saved experiment results are stale.
   *
   * @return staleReasons
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STALE_REASONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getStaleReasons() {
    return staleReasons;
  }

  public void setStaleReasons(List<String> staleReasons) {
    this.staleReasons = staleReasons;
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
   * @return ExperimentsExperimentResultsV2MetaDTO
   */
  @JsonAnySetter
  public ExperimentsExperimentResultsV2MetaDTO putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsExperimentResultsV2MetaDTO object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsExperimentResultsV2MetaDTO experimentsExperimentResultsV2MetaDto =
        (ExperimentsExperimentResultsV2MetaDTO) o;
    return Objects.equals(this.evsiContext, experimentsExperimentResultsV2MetaDto.evsiContext)
        && Objects.equals(this.isStale, experimentsExperimentResultsV2MetaDto.isStale)
        && Objects.equals(this.resultRunId, experimentsExperimentResultsV2MetaDto.resultRunId)
        && Objects.equals(
            this.resultsLastUpdated, experimentsExperimentResultsV2MetaDto.resultsLastUpdated)
        && Objects.equals(this.staleReasons, experimentsExperimentResultsV2MetaDto.staleReasons)
        && Objects.equals(
            this.additionalProperties, experimentsExperimentResultsV2MetaDto.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        evsiContext, isStale, resultRunId, resultsLastUpdated, staleReasons, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsExperimentResultsV2MetaDTO {\n");
    sb.append("    evsiContext: ").append(toIndentedString(evsiContext)).append("\n");
    sb.append("    isStale: ").append(toIndentedString(isStale)).append("\n");
    sb.append("    resultRunId: ").append(toIndentedString(resultRunId)).append("\n");
    sb.append("    resultsLastUpdated: ").append(toIndentedString(resultsLastUpdated)).append("\n");
    sb.append("    staleReasons: ").append(toIndentedString(staleReasons)).append("\n");
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
