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

/** Refresh requirements and warnings returned by an experiment update. */
@JsonPropertyOrder({
  ExperimentsPatchExperimentV2MetaDTO.JSON_PROPERTY_NEEDS_PIPELINE_REFRESH,
  ExperimentsPatchExperimentV2MetaDTO.JSON_PROPERTY_REFRESH_ENDPOINT,
  ExperimentsPatchExperimentV2MetaDTO.JSON_PROPERTY_WARNINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsPatchExperimentV2MetaDTO {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NEEDS_PIPELINE_REFRESH = "needs_pipeline_refresh";
  private Boolean needsPipelineRefresh;

  public static final String JSON_PROPERTY_REFRESH_ENDPOINT = "refresh_endpoint";
  private String refreshEndpoint;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<ExperimentsPatchExperimentV2MetaDTOWarningsItems> warnings = null;

  public ExperimentsPatchExperimentV2MetaDTO() {}

  @JsonCreator
  public ExperimentsPatchExperimentV2MetaDTO(
      @JsonProperty(required = true, value = JSON_PROPERTY_NEEDS_PIPELINE_REFRESH)
          Boolean needsPipelineRefresh) {
    this.needsPipelineRefresh = needsPipelineRefresh;
  }

  public ExperimentsPatchExperimentV2MetaDTO needsPipelineRefresh(Boolean needsPipelineRefresh) {
    this.needsPipelineRefresh = needsPipelineRefresh;
    return this;
  }

  /**
   * Whether this edit needs a full or non-full pipeline run. This operation does not start the run.
   * A later false value does not clear a refresh required by an earlier edit.
   *
   * @return needsPipelineRefresh
   */
  @JsonProperty(JSON_PROPERTY_NEEDS_PIPELINE_REFRESH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getNeedsPipelineRefresh() {
    return needsPipelineRefresh;
  }

  public void setNeedsPipelineRefresh(Boolean needsPipelineRefresh) {
    this.needsPipelineRefresh = needsPipelineRefresh;
  }

  public ExperimentsPatchExperimentV2MetaDTO refreshEndpoint(String refreshEndpoint) {
    this.refreshEndpoint = refreshEndpoint;
    return this;
  }

  /**
   * POST to this endpoint after finishing your edits. The full_refresh query parameter selects the
   * required run type. Across multiple edits any full_refresh=true requirement takes priority.
   *
   * @return refreshEndpoint
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFRESH_ENDPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRefreshEndpoint() {
    return refreshEndpoint;
  }

  public void setRefreshEndpoint(String refreshEndpoint) {
    this.refreshEndpoint = refreshEndpoint;
  }

  public ExperimentsPatchExperimentV2MetaDTO warnings(
      List<ExperimentsPatchExperimentV2MetaDTOWarningsItems> warnings) {
    this.warnings = warnings;
    if (warnings != null) {
      for (ExperimentsPatchExperimentV2MetaDTOWarningsItems item : warnings) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ExperimentsPatchExperimentV2MetaDTO addWarningsItem(
      ExperimentsPatchExperimentV2MetaDTOWarningsItems warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    this.unparsed |= warningsItem.unparsed;
    return this;
  }

  /**
   * Warnings returned after the experiment update.
   *
   * @return warnings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ExperimentsPatchExperimentV2MetaDTOWarningsItems> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<ExperimentsPatchExperimentV2MetaDTOWarningsItems> warnings) {
    this.warnings = warnings;
    if (warnings != null) {
      for (ExperimentsPatchExperimentV2MetaDTOWarningsItems item : warnings) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * @return ExperimentsPatchExperimentV2MetaDTO
   */
  @JsonAnySetter
  public ExperimentsPatchExperimentV2MetaDTO putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsPatchExperimentV2MetaDTO object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsPatchExperimentV2MetaDTO experimentsPatchExperimentV2MetaDto =
        (ExperimentsPatchExperimentV2MetaDTO) o;
    return Objects.equals(
            this.needsPipelineRefresh, experimentsPatchExperimentV2MetaDto.needsPipelineRefresh)
        && Objects.equals(this.refreshEndpoint, experimentsPatchExperimentV2MetaDto.refreshEndpoint)
        && Objects.equals(this.warnings, experimentsPatchExperimentV2MetaDto.warnings)
        && Objects.equals(
            this.additionalProperties, experimentsPatchExperimentV2MetaDto.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(needsPipelineRefresh, refreshEndpoint, warnings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsPatchExperimentV2MetaDTO {\n");
    sb.append("    needsPipelineRefresh: ")
        .append(toIndentedString(needsPipelineRefresh))
        .append("\n");
    sb.append("    refreshEndpoint: ").append(toIndentedString(refreshEndpoint)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
