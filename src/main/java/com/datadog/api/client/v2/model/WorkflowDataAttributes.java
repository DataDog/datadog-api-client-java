/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>The definition of <code>WorkflowDataAttributes</code> object.</p>
 */
@JsonPropertyOrder({
  WorkflowDataAttributes.JSON_PROPERTY_CREATED_AT,
  WorkflowDataAttributes.JSON_PROPERTY_DESCRIPTION,
  WorkflowDataAttributes.JSON_PROPERTY_NAME,
  WorkflowDataAttributes.JSON_PROPERTY_PUBLISHED,
  WorkflowDataAttributes.JSON_PROPERTY_SPEC,
  WorkflowDataAttributes.JSON_PROPERTY_TAGS,
  WorkflowDataAttributes.JSON_PROPERTY_UPDATED_AT,
  WorkflowDataAttributes.JSON_PROPERTY_WEBHOOK_SECRET
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WorkflowDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PUBLISHED = "published";
  private Boolean published;

  public static final String JSON_PROPERTY_SPEC = "spec";
  private Spec spec;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_WEBHOOK_SECRET = "webhookSecret";
  private String webhookSecret;

  public WorkflowDataAttributes() {}

  @JsonCreator
  public WorkflowDataAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_SPEC)Spec spec) {
        this.name = name;
        this.spec = spec;
        this.unparsed |= spec.unparsed;
  }

  /**
   * <p>When the workflow was created.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }
  public WorkflowDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Description of the workflow.</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public WorkflowDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the workflow.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public WorkflowDataAttributes published(Boolean published) {
    this.published = published;
    return this;
  }

  /**
   * <p>Set the workflow to published or unpublished. Workflows in an unpublished state will only be executable via manual runs. Automatic triggers such as Schedule will not execute the workflow until it is published.</p>
   * @return published
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PUBLISHED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getPublished() {
        return published;
      }
  public void setPublished(Boolean published) {
    this.published = published;
  }
  public WorkflowDataAttributes spec(Spec spec) {
    this.spec = spec;
    this.unparsed |= spec.unparsed;
    return this;
  }

  /**
   * <p>The spec defines what the workflow does.</p>
   * @return spec
  **/
      @JsonProperty(JSON_PROPERTY_SPEC)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Spec getSpec() {
        return spec;
      }
  public void setSpec(Spec spec) {
    this.spec = spec;
  }
  public WorkflowDataAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public WorkflowDataAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>Tags of the workflow.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  /**
   * <p>When the workflow was last updated.</p>
   * @return updatedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getUpdatedAt() {
        return updatedAt;
      }
  public WorkflowDataAttributes webhookSecret(String webhookSecret) {
    this.webhookSecret = webhookSecret;
    return this;
  }

  /**
   * <p>If a Webhook trigger is defined on this workflow, a webhookSecret is required and should be provided here.</p>
   * @return webhookSecret
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_WEBHOOK_SECRET)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getWebhookSecret() {
        return webhookSecret;
      }
  public void setWebhookSecret(String webhookSecret) {
    this.webhookSecret = webhookSecret;
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
   * @return WorkflowDataAttributes
   */
  @JsonAnySetter
  public WorkflowDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this WorkflowDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkflowDataAttributes workflowDataAttributes = (WorkflowDataAttributes) o;
    return Objects.equals(this.createdAt, workflowDataAttributes.createdAt) && Objects.equals(this.description, workflowDataAttributes.description) && Objects.equals(this.name, workflowDataAttributes.name) && Objects.equals(this.published, workflowDataAttributes.published) && Objects.equals(this.spec, workflowDataAttributes.spec) && Objects.equals(this.tags, workflowDataAttributes.tags) && Objects.equals(this.updatedAt, workflowDataAttributes.updatedAt) && Objects.equals(this.webhookSecret, workflowDataAttributes.webhookSecret) && Objects.equals(this.additionalProperties, workflowDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,description,name,published,spec,tags,updatedAt,webhookSecret, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkflowDataAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    webhookSecret: ").append(toIndentedString(webhookSecret)).append("\n");
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
