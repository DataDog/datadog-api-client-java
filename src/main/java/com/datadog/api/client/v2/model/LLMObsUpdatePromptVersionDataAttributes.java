/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Attributes for updating an LLM Observability prompt version. At least one of <code>description
 * </code>, <code>labels</code>, or <code>env_ids</code> must be provided; all three attributes are
 * optional individually.
 */
@JsonPropertyOrder({
  LLMObsUpdatePromptVersionDataAttributes.JSON_PROPERTY_DESCRIPTION,
  LLMObsUpdatePromptVersionDataAttributes.JSON_PROPERTY_ENV_IDS,
  LLMObsUpdatePromptVersionDataAttributes.JSON_PROPERTY_LABELS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsUpdatePromptVersionDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENV_IDS = "env_ids";
  private List<String> envIds = null;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<LLMObsPromptVersionLabel> labels = null;

  public LLMObsUpdatePromptVersionDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Optional new description for this version.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LLMObsUpdatePromptVersionDataAttributes envIds(List<String> envIds) {
    this.envIds = envIds;
    return this;
  }

  public LLMObsUpdatePromptVersionDataAttributes addEnvIdsItem(String envIdsItem) {
    if (this.envIds == null) {
      this.envIds = new ArrayList<>();
    }
    this.envIds.add(envIdsItem);
    return this;
  }

  /**
   * Optional feature-flag environment UUIDs the service attempts to enable and configure to use
   * this version as their default.
   *
   * @return envIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENV_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getEnvIds() {
    return envIds;
  }

  public void setEnvIds(List<String> envIds) {
    this.envIds = envIds;
  }

  public LLMObsUpdatePromptVersionDataAttributes labels(List<LLMObsPromptVersionLabel> labels) {
    this.labels = labels;
    return this;
  }

  public LLMObsUpdatePromptVersionDataAttributes addLabelsItem(
      LLMObsPromptVersionLabel labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    this.unparsed |= !labelsItem.isValid();
    return this;
  }

  /**
   * Optional new labels for this version. Do not use this attribute for new integrations.
   *
   * @return labels
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsPromptVersionLabel> getLabels() {
    return labels;
  }

  @Deprecated
  public void setLabels(List<LLMObsPromptVersionLabel> labels) {
    this.labels = labels;
  }

  /** Return true if this LLMObsUpdatePromptVersionDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsUpdatePromptVersionDataAttributes llmObsUpdatePromptVersionDataAttributes =
        (LLMObsUpdatePromptVersionDataAttributes) o;
    return Objects.equals(this.description, llmObsUpdatePromptVersionDataAttributes.description)
        && Objects.equals(this.envIds, llmObsUpdatePromptVersionDataAttributes.envIds)
        && Objects.equals(this.labels, llmObsUpdatePromptVersionDataAttributes.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, envIds, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsUpdatePromptVersionDataAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    envIds: ").append(toIndentedString(envIds)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
