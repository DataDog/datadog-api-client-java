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

/** The attributes of a blueprint resource. */
@JsonPropertyOrder({
  BlueprintAttributes.JSON_PROPERTY_CREATED_AT,
  BlueprintAttributes.JSON_PROPERTY_DEFINITION,
  BlueprintAttributes.JSON_PROPERTY_DESCRIPTION,
  BlueprintAttributes.JSON_PROPERTY_EMBEDDED_DATASTORE_BLUEPRINTS,
  BlueprintAttributes.JSON_PROPERTY_EMBEDDED_NATIVE_ACTIONS,
  BlueprintAttributes.JSON_PROPERTY_EMBEDDED_WORKFLOW_BLUEPRINTS,
  BlueprintAttributes.JSON_PROPERTY_INTEGRATION_ID,
  BlueprintAttributes.JSON_PROPERTY_MOCKED_OUTPUTS,
  BlueprintAttributes.JSON_PROPERTY_NAME,
  BlueprintAttributes.JSON_PROPERTY_SLUG,
  BlueprintAttributes.JSON_PROPERTY_TAGS,
  BlueprintAttributes.JSON_PROPERTY_TILE_BACKGROUND,
  BlueprintAttributes.JSON_PROPERTY_TILE_ICON_ACTION_FQN,
  BlueprintAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class BlueprintAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DEFINITION = "definition";
  private AppDefinitionType definition = AppDefinitionType.APPDEFINITIONS;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EMBEDDED_DATASTORE_BLUEPRINTS =
      "embedded_datastore_blueprints";
  private Map<String, Object> embeddedDatastoreBlueprints = null;

  public static final String JSON_PROPERTY_EMBEDDED_NATIVE_ACTIONS = "embedded_native_actions";
  private List<Map<String, Object>> embeddedNativeActions = null;

  public static final String JSON_PROPERTY_EMBEDDED_WORKFLOW_BLUEPRINTS =
      "embedded_workflow_blueprints";
  private Map<String, Object> embeddedWorkflowBlueprints = null;

  public static final String JSON_PROPERTY_INTEGRATION_ID = "integration_id";
  private String integrationId;

  public static final String JSON_PROPERTY_MOCKED_OUTPUTS = "mocked_outputs";
  private Map<String, Object> mockedOutputs = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SLUG = "slug";
  private String slug;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TILE_BACKGROUND = "tile_background";
  private String tileBackground;

  public static final String JSON_PROPERTY_TILE_ICON_ACTION_FQN = "tile_icon_action_fqn";
  private String tileIconActionFqn;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public BlueprintAttributes() {}

  @JsonCreator
  public BlueprintAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFINITION) AppDefinitionType definition,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SLUG) String slug,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.createdAt = createdAt;
    this.definition = definition;
    this.unparsed |= !definition.isValid();
    this.description = description;
    this.name = name;
    this.slug = slug;
    this.updatedAt = updatedAt;
  }

  public BlueprintAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The timestamp when the blueprint was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public BlueprintAttributes definition(AppDefinitionType definition) {
    this.definition = definition;
    this.unparsed |= !definition.isValid();
    return this;
  }

  /**
   * The app definition type.
   *
   * @return definition
   */
  @JsonProperty(JSON_PROPERTY_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AppDefinitionType getDefinition() {
    return definition;
  }

  public void setDefinition(AppDefinitionType definition) {
    if (!definition.isValid()) {
      this.unparsed = true;
    }
    this.definition = definition;
  }

  public BlueprintAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of what the blueprint does.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BlueprintAttributes embeddedDatastoreBlueprints(
      Map<String, Object> embeddedDatastoreBlueprints) {
    this.embeddedDatastoreBlueprints = embeddedDatastoreBlueprints;
    return this;
  }

  public BlueprintAttributes putEmbeddedDatastoreBlueprintsItem(
      String key, Object embeddedDatastoreBlueprintsItem) {
    if (this.embeddedDatastoreBlueprints == null) {
      this.embeddedDatastoreBlueprints = new HashMap<>();
    }
    this.embeddedDatastoreBlueprints.put(key, embeddedDatastoreBlueprintsItem);
    return this;
  }

  /**
   * Embedded datastore blueprints.
   *
   * @return embeddedDatastoreBlueprints
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMBEDDED_DATASTORE_BLUEPRINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getEmbeddedDatastoreBlueprints() {
    return embeddedDatastoreBlueprints;
  }

  public void setEmbeddedDatastoreBlueprints(Map<String, Object> embeddedDatastoreBlueprints) {
    this.embeddedDatastoreBlueprints = embeddedDatastoreBlueprints;
  }

  public BlueprintAttributes embeddedNativeActions(
      List<Map<String, Object>> embeddedNativeActions) {
    this.embeddedNativeActions = embeddedNativeActions;
    return this;
  }

  public BlueprintAttributes addEmbeddedNativeActionsItem(
      Map<String, Object> embeddedNativeActionsItem) {
    if (this.embeddedNativeActions == null) {
      this.embeddedNativeActions = new ArrayList<>();
    }
    this.embeddedNativeActions.add(embeddedNativeActionsItem);
    return this;
  }

  /**
   * Embedded native actions.
   *
   * @return embeddedNativeActions
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMBEDDED_NATIVE_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Map<String, Object>> getEmbeddedNativeActions() {
    return embeddedNativeActions;
  }

  public void setEmbeddedNativeActions(List<Map<String, Object>> embeddedNativeActions) {
    this.embeddedNativeActions = embeddedNativeActions;
  }

  public BlueprintAttributes embeddedWorkflowBlueprints(
      Map<String, Object> embeddedWorkflowBlueprints) {
    this.embeddedWorkflowBlueprints = embeddedWorkflowBlueprints;
    return this;
  }

  public BlueprintAttributes putEmbeddedWorkflowBlueprintsItem(
      String key, Object embeddedWorkflowBlueprintsItem) {
    if (this.embeddedWorkflowBlueprints == null) {
      this.embeddedWorkflowBlueprints = new HashMap<>();
    }
    this.embeddedWorkflowBlueprints.put(key, embeddedWorkflowBlueprintsItem);
    return this;
  }

  /**
   * Embedded workflow blueprints.
   *
   * @return embeddedWorkflowBlueprints
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMBEDDED_WORKFLOW_BLUEPRINTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getEmbeddedWorkflowBlueprints() {
    return embeddedWorkflowBlueprints;
  }

  public void setEmbeddedWorkflowBlueprints(Map<String, Object> embeddedWorkflowBlueprints) {
    this.embeddedWorkflowBlueprints = embeddedWorkflowBlueprints;
  }

  public BlueprintAttributes integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

  /**
   * The integration ID associated with the blueprint.
   *
   * @return integrationId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INTEGRATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIntegrationId() {
    return integrationId;
  }

  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }

  public BlueprintAttributes mockedOutputs(Map<String, Object> mockedOutputs) {
    this.mockedOutputs = mockedOutputs;
    return this;
  }

  public BlueprintAttributes putMockedOutputsItem(String key, Object mockedOutputsItem) {
    if (this.mockedOutputs == null) {
      this.mockedOutputs = new HashMap<>();
    }
    this.mockedOutputs.put(key, mockedOutputsItem);
    return this;
  }

  /**
   * Mocked outputs for testing the blueprint.
   *
   * @return mockedOutputs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MOCKED_OUTPUTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getMockedOutputs() {
    return mockedOutputs;
  }

  public void setMockedOutputs(Map<String, Object> mockedOutputs) {
    this.mockedOutputs = mockedOutputs;
  }

  public BlueprintAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The human-readable name of the blueprint.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BlueprintAttributes slug(String slug) {
    this.slug = slug;
    return this;
  }

  /**
   * The unique slug identifier of the blueprint.
   *
   * @return slug
   */
  @JsonProperty(JSON_PROPERTY_SLUG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public BlueprintAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public BlueprintAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags associated with the blueprint.
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

  public BlueprintAttributes tileBackground(String tileBackground) {
    this.tileBackground = tileBackground;
    return this;
  }

  /**
   * The background style of the blueprint tile.
   *
   * @return tileBackground
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TILE_BACKGROUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTileBackground() {
    return tileBackground;
  }

  public void setTileBackground(String tileBackground) {
    this.tileBackground = tileBackground;
  }

  public BlueprintAttributes tileIconActionFqn(String tileIconActionFqn) {
    this.tileIconActionFqn = tileIconActionFqn;
    return this;
  }

  /**
   * The fully qualified name of the action used as the tile icon.
   *
   * @return tileIconActionFqn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TILE_ICON_ACTION_FQN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTileIconActionFqn() {
    return tileIconActionFqn;
  }

  public void setTileIconActionFqn(String tileIconActionFqn) {
    this.tileIconActionFqn = tileIconActionFqn;
  }

  public BlueprintAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The timestamp when the blueprint was last updated.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
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
   * @return BlueprintAttributes
   */
  @JsonAnySetter
  public BlueprintAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this BlueprintAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlueprintAttributes blueprintAttributes = (BlueprintAttributes) o;
    return Objects.equals(this.createdAt, blueprintAttributes.createdAt)
        && Objects.equals(this.definition, blueprintAttributes.definition)
        && Objects.equals(this.description, blueprintAttributes.description)
        && Objects.equals(
            this.embeddedDatastoreBlueprints, blueprintAttributes.embeddedDatastoreBlueprints)
        && Objects.equals(this.embeddedNativeActions, blueprintAttributes.embeddedNativeActions)
        && Objects.equals(
            this.embeddedWorkflowBlueprints, blueprintAttributes.embeddedWorkflowBlueprints)
        && Objects.equals(this.integrationId, blueprintAttributes.integrationId)
        && Objects.equals(this.mockedOutputs, blueprintAttributes.mockedOutputs)
        && Objects.equals(this.name, blueprintAttributes.name)
        && Objects.equals(this.slug, blueprintAttributes.slug)
        && Objects.equals(this.tags, blueprintAttributes.tags)
        && Objects.equals(this.tileBackground, blueprintAttributes.tileBackground)
        && Objects.equals(this.tileIconActionFqn, blueprintAttributes.tileIconActionFqn)
        && Objects.equals(this.updatedAt, blueprintAttributes.updatedAt)
        && Objects.equals(this.additionalProperties, blueprintAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        definition,
        description,
        embeddedDatastoreBlueprints,
        embeddedNativeActions,
        embeddedWorkflowBlueprints,
        integrationId,
        mockedOutputs,
        name,
        slug,
        tags,
        tileBackground,
        tileIconActionFqn,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlueprintAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    embeddedDatastoreBlueprints: ")
        .append(toIndentedString(embeddedDatastoreBlueprints))
        .append("\n");
    sb.append("    embeddedNativeActions: ")
        .append(toIndentedString(embeddedNativeActions))
        .append("\n");
    sb.append("    embeddedWorkflowBlueprints: ")
        .append(toIndentedString(embeddedWorkflowBlueprints))
        .append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    mockedOutputs: ").append(toIndentedString(mockedOutputs)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    tileBackground: ").append(toIndentedString(tileBackground)).append("\n");
    sb.append("    tileIconActionFqn: ").append(toIndentedString(tileIconActionFqn)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
