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

/** Attributes returned after creating an Agent Observability prompt and its first version. */
@JsonPropertyOrder({
  LLMObsCreatePromptResponseDataAttributes.JSON_PROPERTY_AUTHOR,
  LLMObsCreatePromptResponseDataAttributes.JSON_PROPERTY_CONFIG,
  LLMObsCreatePromptResponseDataAttributes.JSON_PROPERTY_CREATED_AT,
  LLMObsCreatePromptResponseDataAttributes.JSON_PROPERTY_CREATED_FROM,
  LLMObsCreatePromptResponseDataAttributes.JSON_PROPERTY_DATASETS,
  LLMObsCreatePromptResponseDataAttributes.JSON_PROPERTY_DESCRIPTION,
  LLMObsCreatePromptResponseDataAttributes.JSON_PROPERTY_EXTRACTED_FROM,
  LLMObsCreatePromptResponseDataAttributes.JSON_PROPERTY_IN_REGISTRY,
  LLMObsCreatePromptResponseDataAttributes.JSON_PROPERTY_LAST_SEEN_AT,
  LLMObsCreatePromptResponseDataAttributes.JSON_PROPERTY_LAST_VERSION_CREATED_AT,
  LLMObsCreatePromptResponseDataAttributes.JSON_PROPERTY_ML_APP,
  LLMObsCreatePromptResponseDataAttributes.JSON_PROPERTY_ML_APPS,
  LLMObsCreatePromptResponseDataAttributes.JSON_PROPERTY_NUM_VERSIONS,
  LLMObsCreatePromptResponseDataAttributes.JSON_PROPERTY_PROMPT_ID,
  LLMObsCreatePromptResponseDataAttributes.JSON_PROPERTY_SOURCE,
  LLMObsCreatePromptResponseDataAttributes.JSON_PROPERTY_TAGS,
  LLMObsCreatePromptResponseDataAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LLMObsCreatePromptResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTHOR = "author";
  private String author;

  public static final String JSON_PROPERTY_CONFIG = "config";
  private Map<String, Object> config = new HashMap<String, Object>();

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_FROM = "created_from";
  private String createdFrom;

  public static final String JSON_PROPERTY_DATASETS = "datasets";
  private List<LLMObsPromptDataset> datasets = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXTRACTED_FROM = "extracted_from";
  private String extractedFrom;

  public static final String JSON_PROPERTY_IN_REGISTRY = "in_registry";
  private Boolean inRegistry;

  public static final String JSON_PROPERTY_LAST_SEEN_AT = "last_seen_at";
  private OffsetDateTime lastSeenAt;

  public static final String JSON_PROPERTY_LAST_VERSION_CREATED_AT = "last_version_created_at";
  private OffsetDateTime lastVersionCreatedAt;

  public static final String JSON_PROPERTY_ML_APP = "ml_app";
  private String mlApp;

  public static final String JSON_PROPERTY_ML_APPS = "ml_apps";
  private List<String> mlApps = null;

  public static final String JSON_PROPERTY_NUM_VERSIONS = "num_versions";
  private Long numVersions;

  public static final String JSON_PROPERTY_PROMPT_ID = "prompt_id";
  private String promptId;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private LLMObsPromptResponseSource source;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public LLMObsCreatePromptResponseDataAttributes() {}

  @JsonCreator
  public LLMObsCreatePromptResponseDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIG) Map<String, Object> config,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_FROM) String createdFrom,
      @JsonProperty(required = true, value = JSON_PROPERTY_IN_REGISTRY) Boolean inRegistry,
      @JsonProperty(required = true, value = JSON_PROPERTY_NUM_VERSIONS) Long numVersions,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROMPT_ID) String promptId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE)
          LLMObsPromptResponseSource source) {
    this.config = config;
    this.createdFrom = createdFrom;
    this.inRegistry = inRegistry;
    this.numVersions = numVersions;
    this.promptId = promptId;
    this.source = source;
    this.unparsed |= !source.isValid();
  }

  public LLMObsCreatePromptResponseDataAttributes author(String author) {
    this.author = author;
    return this;
  }

  /**
   * UUID of the user who authored the prompt.
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

  public LLMObsCreatePromptResponseDataAttributes config(Map<String, Object> config) {
    this.config = config;
    return this;
  }

  public LLMObsCreatePromptResponseDataAttributes putConfigItem(String key, Object configItem) {
    this.config.put(key, configItem);
    return this;
  }

  /**
   * Customer-owned configuration delivered with a prompt version. Datadog stores and returns the
   * object without interpolating it, validating provider-specific keys, or applying it to model
   * calls. Do not include secrets.
   *
   * @return config
   */
  @JsonProperty(JSON_PROPERTY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getConfig() {
    return config;
  }

  public void setConfig(Map<String, Object> config) {
    this.config = config;
  }

  public LLMObsCreatePromptResponseDataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the prompt was created.
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

  public LLMObsCreatePromptResponseDataAttributes createdFrom(String createdFrom) {
    this.createdFrom = createdFrom;
    return this;
  }

  /**
   * Source that created the prompt, such as <code>ui-registry</code>, <code>sdk-registry</code>, or
   * <code>sdk-instrumentation</code>.
   *
   * @return createdFrom
   */
  @JsonProperty(JSON_PROPERTY_CREATED_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedFrom() {
    return createdFrom;
  }

  public void setCreatedFrom(String createdFrom) {
    this.createdFrom = createdFrom;
  }

  public LLMObsCreatePromptResponseDataAttributes datasets(List<LLMObsPromptDataset> datasets) {
    this.datasets = datasets;
    if (datasets != null) {
      for (LLMObsPromptDataset item : datasets) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public LLMObsCreatePromptResponseDataAttributes addDatasetsItem(
      LLMObsPromptDataset datasetsItem) {
    if (this.datasets == null) {
      this.datasets = new ArrayList<>();
    }
    this.datasets.add(datasetsItem);
    this.unparsed |= datasetsItem.unparsed;
    return this;
  }

  /**
   * Datasets observed in runs associated with this prompt.
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

  public LLMObsCreatePromptResponseDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the prompt.
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

  public LLMObsCreatePromptResponseDataAttributes extractedFrom(String extractedFrom) {
    this.extractedFrom = extractedFrom;
    return this;
  }

  /**
   * Source prompt from which this prompt was extracted, when applicable.
   *
   * @return extractedFrom
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTRACTED_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExtractedFrom() {
    return extractedFrom;
  }

  public void setExtractedFrom(String extractedFrom) {
    this.extractedFrom = extractedFrom;
  }

  public LLMObsCreatePromptResponseDataAttributes inRegistry(Boolean inRegistry) {
    this.inRegistry = inRegistry;
    return this;
  }

  /**
   * Whether the prompt is a registry entry (as opposed to a code-discovered prompt).
   *
   * @return inRegistry
   */
  @JsonProperty(JSON_PROPERTY_IN_REGISTRY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getInRegistry() {
    return inRegistry;
  }

  public void setInRegistry(Boolean inRegistry) {
    this.inRegistry = inRegistry;
  }

  public LLMObsCreatePromptResponseDataAttributes lastSeenAt(OffsetDateTime lastSeenAt) {
    this.lastSeenAt = lastSeenAt;
    return this;
  }

  /**
   * Timestamp of the most recent observed run of this prompt.
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

  public LLMObsCreatePromptResponseDataAttributes lastVersionCreatedAt(
      OffsetDateTime lastVersionCreatedAt) {
    this.lastVersionCreatedAt = lastVersionCreatedAt;
    return this;
  }

  /**
   * Timestamp when the most recent version of the prompt was created.
   *
   * @return lastVersionCreatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_VERSION_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getLastVersionCreatedAt() {
    return lastVersionCreatedAt;
  }

  public void setLastVersionCreatedAt(OffsetDateTime lastVersionCreatedAt) {
    this.lastVersionCreatedAt = lastVersionCreatedAt;
  }

  public LLMObsCreatePromptResponseDataAttributes mlApp(String mlApp) {
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

  public LLMObsCreatePromptResponseDataAttributes mlApps(List<String> mlApps) {
    this.mlApps = mlApps;
    return this;
  }

  public LLMObsCreatePromptResponseDataAttributes addMlAppsItem(String mlAppsItem) {
    if (this.mlApps == null) {
      this.mlApps = new ArrayList<>();
    }
    this.mlApps.add(mlAppsItem);
    return this;
  }

  /**
   * ML applications observed running this prompt.
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

  public LLMObsCreatePromptResponseDataAttributes numVersions(Long numVersions) {
    this.numVersions = numVersions;
    return this;
  }

  /**
   * Number of versions of the prompt.
   *
   * @return numVersions
   */
  @JsonProperty(JSON_PROPERTY_NUM_VERSIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getNumVersions() {
    return numVersions;
  }

  public void setNumVersions(Long numVersions) {
    this.numVersions = numVersions;
  }

  public LLMObsCreatePromptResponseDataAttributes promptId(String promptId) {
    this.promptId = promptId;
    return this;
  }

  /**
   * Customer-provided identifier of the prompt.
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

  public LLMObsCreatePromptResponseDataAttributes source(LLMObsPromptResponseSource source) {
    this.source = source;
    this.unparsed |= !source.isValid();
    return this;
  }

  /**
   * Whether the prompt was created from the registry or discovered from observed LLM calls.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public LLMObsPromptResponseSource getSource() {
    return source;
  }

  public void setSource(LLMObsPromptResponseSource source) {
    if (!source.isValid()) {
      this.unparsed = true;
    }
    this.source = source;
  }

  public LLMObsCreatePromptResponseDataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public LLMObsCreatePromptResponseDataAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags observed on runs of this prompt.
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

  public LLMObsCreatePromptResponseDataAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the prompt.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
   * @return LLMObsCreatePromptResponseDataAttributes
   */
  @JsonAnySetter
  public LLMObsCreatePromptResponseDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this LLMObsCreatePromptResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LLMObsCreatePromptResponseDataAttributes llmObsCreatePromptResponseDataAttributes =
        (LLMObsCreatePromptResponseDataAttributes) o;
    return Objects.equals(this.author, llmObsCreatePromptResponseDataAttributes.author)
        && Objects.equals(this.config, llmObsCreatePromptResponseDataAttributes.config)
        && Objects.equals(this.createdAt, llmObsCreatePromptResponseDataAttributes.createdAt)
        && Objects.equals(this.createdFrom, llmObsCreatePromptResponseDataAttributes.createdFrom)
        && Objects.equals(this.datasets, llmObsCreatePromptResponseDataAttributes.datasets)
        && Objects.equals(this.description, llmObsCreatePromptResponseDataAttributes.description)
        && Objects.equals(
            this.extractedFrom, llmObsCreatePromptResponseDataAttributes.extractedFrom)
        && Objects.equals(this.inRegistry, llmObsCreatePromptResponseDataAttributes.inRegistry)
        && Objects.equals(this.lastSeenAt, llmObsCreatePromptResponseDataAttributes.lastSeenAt)
        && Objects.equals(
            this.lastVersionCreatedAt,
            llmObsCreatePromptResponseDataAttributes.lastVersionCreatedAt)
        && Objects.equals(this.mlApp, llmObsCreatePromptResponseDataAttributes.mlApp)
        && Objects.equals(this.mlApps, llmObsCreatePromptResponseDataAttributes.mlApps)
        && Objects.equals(this.numVersions, llmObsCreatePromptResponseDataAttributes.numVersions)
        && Objects.equals(this.promptId, llmObsCreatePromptResponseDataAttributes.promptId)
        && Objects.equals(this.source, llmObsCreatePromptResponseDataAttributes.source)
        && Objects.equals(this.tags, llmObsCreatePromptResponseDataAttributes.tags)
        && Objects.equals(this.title, llmObsCreatePromptResponseDataAttributes.title)
        && Objects.equals(
            this.additionalProperties,
            llmObsCreatePromptResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        author,
        config,
        createdAt,
        createdFrom,
        datasets,
        description,
        extractedFrom,
        inRegistry,
        lastSeenAt,
        lastVersionCreatedAt,
        mlApp,
        mlApps,
        numVersions,
        promptId,
        source,
        tags,
        title,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LLMObsCreatePromptResponseDataAttributes {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdFrom: ").append(toIndentedString(createdFrom)).append("\n");
    sb.append("    datasets: ").append(toIndentedString(datasets)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    extractedFrom: ").append(toIndentedString(extractedFrom)).append("\n");
    sb.append("    inRegistry: ").append(toIndentedString(inRegistry)).append("\n");
    sb.append("    lastSeenAt: ").append(toIndentedString(lastSeenAt)).append("\n");
    sb.append("    lastVersionCreatedAt: ")
        .append(toIndentedString(lastVersionCreatedAt))
        .append("\n");
    sb.append("    mlApp: ").append(toIndentedString(mlApp)).append("\n");
    sb.append("    mlApps: ").append(toIndentedString(mlApps)).append("\n");
    sb.append("    numVersions: ").append(toIndentedString(numVersions)).append("\n");
    sb.append("    promptId: ").append(toIndentedString(promptId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
