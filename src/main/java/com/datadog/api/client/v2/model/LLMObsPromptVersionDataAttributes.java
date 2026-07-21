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

/** Attributes of a specific version of an LLM Observability prompt. */
@JsonPropertyOrder({
  LLMObsPromptVersionDataAttributes.JSON_PROPERTY_AUTHOR,
  LLMObsPromptVersionDataAttributes.JSON_PROPERTY_CREATED_AT,
  LLMObsPromptVersionDataAttributes.JSON_PROPERTY_DATASETS,
  LLMObsPromptVersionDataAttributes.JSON_PROPERTY_DESCRIPTION,
  LLMObsPromptVersionDataAttributes.JSON_PROPERTY_LABELS,
  LLMObsPromptVersionDataAttributes.JSON_PROPERTY_LAST_SEEN_AT,
  LLMObsPromptVersionDataAttributes.JSON_PROPERTY_ML_APP,
  LLMObsPromptVersionDataAttributes.JSON_PROPERTY_ML_APPS,
  LLMObsPromptVersionDataAttributes.JSON_PROPERTY_PROMPT_ID,
  LLMObsPromptVersionDataAttributes.JSON_PROPERTY_PROMPT_UUID,
  LLMObsPromptVersionDataAttributes.JSON_PROPERTY_TAGS,
  LLMObsPromptVersionDataAttributes.JSON_PROPERTY_TEMPLATE,
  LLMObsPromptVersionDataAttributes.JSON_PROPERTY_USER_VERSION,
  LLMObsPromptVersionDataAttributes.JSON_PROPERTY_VERSION,
  LLMObsPromptVersionDataAttributes.JSON_PROPERTY_VERSION_CREATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsPromptVersionDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private String author;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DATASETS = "datasets";
  private List<LLMObsPromptDataset> datasets = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LABELS = "labels";
  private List<String> labels = null;

  public static final String JSON_PROPERTY_LAST_SEEN_AT = "last_seen_at";
  private OffsetDateTime lastSeenAt;

  public static final String JSON_PROPERTY_ML_APP = "ml_app";
  private String mlApp;

  public static final String JSON_PROPERTY_ML_APPS = "ml_apps";
  private List<String> mlApps = null;

  public static final String JSON_PROPERTY_PROMPT_ID = "prompt_id";
  private String promptId;

  public static final String JSON_PROPERTY_PROMPT_UUID = "prompt_uuid";
  private String promptUuid;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TEMPLATE = "template";
  private LLMObsPromptTemplate template;

  public static final String JSON_PROPERTY_USER_VERSION = "user_version";
  private String userVersion;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public static final String JSON_PROPERTY_VERSION_CREATED_AT = "version_created_at";
  private OffsetDateTime versionCreatedAt;

  public LLMObsPromptVersionDataAttributes() {}

  @JsonCreator
  public LLMObsPromptVersionDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_PROMPT_ID) String promptId,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROMPT_UUID) String promptUuid,
      @JsonProperty(required = true, value = JSON_PROPERTY_TEMPLATE) LLMObsPromptTemplate template,
      @JsonProperty(required = true, value = JSON_PROPERTY_VERSION) Long version) {
    this.promptId = promptId;
    this.promptUuid = promptUuid;
    this.template = template;
    this.unparsed |= template.unparsed;
    this.version = version;
  }

  public LLMObsPromptVersionDataAttributes author(String author) {
    this.author = author;
    return this;
  }

  /**
   * UUID of the user who authored this version.
   *
   * @return author
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTHOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public LLMObsPromptVersionDataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp stored on this prompt version.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public LLMObsPromptVersionDataAttributes datasets(List<LLMObsPromptDataset> datasets) {
    this.datasets = datasets;
    if (datasets != null) {
      for (LLMObsPromptDataset item : datasets) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public LLMObsPromptVersionDataAttributes addDatasetsItem(LLMObsPromptDataset datasetsItem) {
    if (this.datasets == null) {
      this.datasets = new ArrayList<>();
    }
    this.datasets.add(datasetsItem);
    this.unparsed |= datasetsItem.unparsed;
    return this;
  }

  /**
   * Datasets observed in runs associated with this prompt version.
   *
   * @return datasets
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATASETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<LLMObsPromptDataset> getDatasets() {
    return datasets;
  }

  public void setDatasets(List<LLMObsPromptDataset> datasets) {
    this.datasets = datasets;
    if (datasets != null) {
      for (LLMObsPromptDataset item : datasets) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public LLMObsPromptVersionDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of this version.
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

  public LLMObsPromptVersionDataAttributes labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public LLMObsPromptVersionDataAttributes addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * Labels attached to this version (for example <code>development</code>, <code>staging</code>,
   * <code>production</code>).
   *
   * @return labels
   * @deprecated
   */
  @Deprecated
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LABELS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getLabels() {
    return labels;
  }

  @Deprecated
  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public LLMObsPromptVersionDataAttributes lastSeenAt(OffsetDateTime lastSeenAt) {
    this.lastSeenAt = lastSeenAt;
    return this;
  }

  /**
   * Timestamp of the most recent observed run of this prompt version.
   *
   * @return lastSeenAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_SEEN_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getLastSeenAt() {
    return lastSeenAt;
  }

  public void setLastSeenAt(OffsetDateTime lastSeenAt) {
    this.lastSeenAt = lastSeenAt;
  }

  public LLMObsPromptVersionDataAttributes mlApp(String mlApp) {
    this.mlApp = mlApp;
    return this;
  }

  /**
   * The ML application this prompt is associated with.
   *
   * @return mlApp
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ML_APP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMlApp() {
    return mlApp;
  }

  public void setMlApp(String mlApp) {
    this.mlApp = mlApp;
  }

  public LLMObsPromptVersionDataAttributes mlApps(List<String> mlApps) {
    this.mlApps = mlApps;
    return this;
  }

  public LLMObsPromptVersionDataAttributes addMlAppsItem(String mlAppsItem) {
    if (this.mlApps == null) {
      this.mlApps = new ArrayList<>();
    }
    this.mlApps.add(mlAppsItem);
    return this;
  }

  /**
   * ML applications observed running this prompt version.
   *
   * @return mlApps
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ML_APPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getMlApps() {
    return mlApps;
  }

  public void setMlApps(List<String> mlApps) {
    this.mlApps = mlApps;
  }

  public LLMObsPromptVersionDataAttributes promptId(String promptId) {
    this.promptId = promptId;
    return this;
  }

  /**
   * Customer-provided identifier of the parent prompt.
   *
   * @return promptId
   */
  @JsonProperty(JSON_PROPERTY_PROMPT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPromptId() {
    return promptId;
  }

  public void setPromptId(String promptId) {
    this.promptId = promptId;
  }

  public LLMObsPromptVersionDataAttributes promptUuid(String promptUuid) {
    this.promptUuid = promptUuid;
    return this;
  }

  /**
   * Unique identifier of the parent prompt.
   *
   * @return promptUuid
   */
  @JsonProperty(JSON_PROPERTY_PROMPT_UUID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getPromptUuid() {
    return promptUuid;
  }

  public void setPromptUuid(String promptUuid) {
    this.promptUuid = promptUuid;
  }

  public LLMObsPromptVersionDataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public LLMObsPromptVersionDataAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags observed on runs of this prompt version.
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

  public LLMObsPromptVersionDataAttributes template(LLMObsPromptTemplate template) {
    this.template = template;
    this.unparsed |= template.unparsed;
    return this;
  }

  /**
   * A text template or a list of chat messages.
   *
   * @return template
   */
  @JsonProperty(JSON_PROPERTY_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsPromptTemplate getTemplate() {
    return template;
  }

  public void setTemplate(LLMObsPromptTemplate template) {
    this.template = template;
    if (template != null) {
      this.unparsed |= template.unparsed;
    }
  }

  public LLMObsPromptVersionDataAttributes userVersion(String userVersion) {
    this.userVersion = userVersion;
    return this;
  }

  /**
   * User-supplied identifier for this version.
   *
   * @return userVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USER_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUserVersion() {
    return userVersion;
  }

  public void setUserVersion(String userVersion) {
    this.userVersion = userVersion;
  }

  public LLMObsPromptVersionDataAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * Sequential version number. minimum: 1
   *
   * @return version
   */
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
  }

  public LLMObsPromptVersionDataAttributes versionCreatedAt(OffsetDateTime versionCreatedAt) {
    this.versionCreatedAt = versionCreatedAt;
    return this;
  }

  /**
   * Timestamp when this version was created.
   *
   * @return versionCreatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getVersionCreatedAt() {
    return versionCreatedAt;
  }

  public void setVersionCreatedAt(OffsetDateTime versionCreatedAt) {
    this.versionCreatedAt = versionCreatedAt;
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
   * @return LLMObsPromptVersionDataAttributes
   */
  @JsonAnySetter
  public LLMObsPromptVersionDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsPromptVersionDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsPromptVersionDataAttributes llmObsPromptVersionDataAttributes =
        (LLMObsPromptVersionDataAttributes) o;
    return Objects.equals(this.author, llmObsPromptVersionDataAttributes.author)
        && Objects.equals(this.createdAt, llmObsPromptVersionDataAttributes.createdAt)
        && Objects.equals(this.datasets, llmObsPromptVersionDataAttributes.datasets)
        && Objects.equals(this.description, llmObsPromptVersionDataAttributes.description)
        && Objects.equals(this.labels, llmObsPromptVersionDataAttributes.labels)
        && Objects.equals(this.lastSeenAt, llmObsPromptVersionDataAttributes.lastSeenAt)
        && Objects.equals(this.mlApp, llmObsPromptVersionDataAttributes.mlApp)
        && Objects.equals(this.mlApps, llmObsPromptVersionDataAttributes.mlApps)
        && Objects.equals(this.promptId, llmObsPromptVersionDataAttributes.promptId)
        && Objects.equals(this.promptUuid, llmObsPromptVersionDataAttributes.promptUuid)
        && Objects.equals(this.tags, llmObsPromptVersionDataAttributes.tags)
        && Objects.equals(this.template, llmObsPromptVersionDataAttributes.template)
        && Objects.equals(this.userVersion, llmObsPromptVersionDataAttributes.userVersion)
        && Objects.equals(this.version, llmObsPromptVersionDataAttributes.version)
        && Objects.equals(this.versionCreatedAt, llmObsPromptVersionDataAttributes.versionCreatedAt)
        && Objects.equals(
            this.additionalProperties, llmObsPromptVersionDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        author,
        createdAt,
        datasets,
        description,
        labels,
        lastSeenAt,
        mlApp,
        mlApps,
        promptId,
        promptUuid,
        tags,
        template,
        userVersion,
        version,
        versionCreatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsPromptVersionDataAttributes {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    lastSeenAt: ").append(toIndentedString(lastSeenAt)).append("\n");
    sb.append("    mlApp: ").append(toIndentedString(mlApp)).append("\n");
    sb.append("    mlApps: ").append(toIndentedString(mlApps)).append("\n");
    sb.append("    promptId: ").append(toIndentedString(promptId)).append("\n");
    sb.append("    promptUuid: ").append(toIndentedString(promptUuid)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    userVersion: ").append(toIndentedString(userVersion)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    versionCreatedAt: ").append(toIndentedString(versionCreatedAt)).append("\n");
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
