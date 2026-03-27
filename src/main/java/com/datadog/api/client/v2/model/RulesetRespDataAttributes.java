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
   * <p>The definition of <code>RulesetRespDataAttributes</code> object.</p>
 */
@JsonPropertyOrder({
  RulesetRespDataAttributes.JSON_PROPERTY_CREATED,
  RulesetRespDataAttributes.JSON_PROPERTY_ENABLED,
  RulesetRespDataAttributes.JSON_PROPERTY_LAST_MODIFIED_USER_UUID,
  RulesetRespDataAttributes.JSON_PROPERTY_MODIFIED,
  RulesetRespDataAttributes.JSON_PROPERTY_NAME,
  RulesetRespDataAttributes.JSON_PROPERTY_POSITION,
  RulesetRespDataAttributes.JSON_PROPERTY_PROCESSING_STATUS,
  RulesetRespDataAttributes.JSON_PROPERTY_RULES,
  RulesetRespDataAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RulesetRespDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED = "created";
  private RulesetRespDataAttributesCreated created;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_LAST_MODIFIED_USER_UUID = "last_modified_user_uuid";
  private String lastModifiedUserUuid;

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private RulesetRespDataAttributesModified modified;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_POSITION = "position";
  private Integer position;

  public static final String JSON_PROPERTY_PROCESSING_STATUS = "processing_status";
  private String processingStatus;

  public static final String JSON_PROPERTY_RULES = "rules";
  private List<RulesetRespDataAttributesRulesItems> rules = new ArrayList<>();

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public RulesetRespDataAttributes() {}

  @JsonCreator
  public RulesetRespDataAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED)RulesetRespDataAttributesCreated created,
            @JsonProperty(required=true, value=JSON_PROPERTY_ENABLED)Boolean enabled,
            @JsonProperty(required=true, value=JSON_PROPERTY_LAST_MODIFIED_USER_UUID)String lastModifiedUserUuid,
            @JsonProperty(required=true, value=JSON_PROPERTY_MODIFIED)RulesetRespDataAttributesModified modified,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_POSITION)Integer position,
            @JsonProperty(required=true, value=JSON_PROPERTY_RULES)List<RulesetRespDataAttributesRulesItems> rules,
            @JsonProperty(required=true, value=JSON_PROPERTY_VERSION)Long version) {
        this.created = created;
        this.unparsed |= created.unparsed;
        this.enabled = enabled;
        this.lastModifiedUserUuid = lastModifiedUserUuid;
        this.modified = modified;
        this.unparsed |= modified.unparsed;
        this.name = name;
        this.position = position;
        this.rules = rules;
        this.version = version;
  }
  public RulesetRespDataAttributes created(RulesetRespDataAttributesCreated created) {
    this.created = created;
    this.unparsed |= created.unparsed;
    return this;
  }

  /**
   * <p>The definition of <code>RulesetRespDataAttributesCreated</code> object.</p>
   * @return created
  **/
      @JsonProperty(JSON_PROPERTY_CREATED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public RulesetRespDataAttributesCreated getCreated() {
        return created;
      }
  public void setCreated(RulesetRespDataAttributesCreated created) {
    this.created = created;
  }
  public RulesetRespDataAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>enabled</code>.</p>
   * @return enabled
  **/
      @JsonProperty(JSON_PROPERTY_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getEnabled() {
        return enabled;
      }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  public RulesetRespDataAttributes lastModifiedUserUuid(String lastModifiedUserUuid) {
    this.lastModifiedUserUuid = lastModifiedUserUuid;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>last_modified_user_uuid</code>.</p>
   * @return lastModifiedUserUuid
  **/
      @JsonProperty(JSON_PROPERTY_LAST_MODIFIED_USER_UUID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getLastModifiedUserUuid() {
        return lastModifiedUserUuid;
      }
  public void setLastModifiedUserUuid(String lastModifiedUserUuid) {
    this.lastModifiedUserUuid = lastModifiedUserUuid;
  }
  public RulesetRespDataAttributes modified(RulesetRespDataAttributesModified modified) {
    this.modified = modified;
    this.unparsed |= modified.unparsed;
    return this;
  }

  /**
   * <p>The definition of <code>RulesetRespDataAttributesModified</code> object.</p>
   * @return modified
  **/
      @JsonProperty(JSON_PROPERTY_MODIFIED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public RulesetRespDataAttributesModified getModified() {
        return modified;
      }
  public void setModified(RulesetRespDataAttributesModified modified) {
    this.modified = modified;
  }
  public RulesetRespDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>name</code>.</p>
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
  public RulesetRespDataAttributes position(Integer position) {
    this.position = position;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>position</code>.</p>
   * maximum: 2147483647
   * @return position
  **/
      @JsonProperty(JSON_PROPERTY_POSITION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Integer getPosition() {
        return position;
      }
  public void setPosition(Integer position) {
    this.position = position;
  }
  public RulesetRespDataAttributes processingStatus(String processingStatus) {
    this.processingStatus = processingStatus;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>processing_status</code>.</p>
   * @return processingStatus
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PROCESSING_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getProcessingStatus() {
        return processingStatus;
      }
  public void setProcessingStatus(String processingStatus) {
    this.processingStatus = processingStatus;
  }
  public RulesetRespDataAttributes rules(List<RulesetRespDataAttributesRulesItems> rules) {
    this.rules = rules;
    for (RulesetRespDataAttributesRulesItems item : rules) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public RulesetRespDataAttributes addRulesItem(RulesetRespDataAttributesRulesItems rulesItem) {
    this.rules.add(rulesItem);
    this.unparsed |= rulesItem.unparsed;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>rules</code>.</p>
   * @return rules
  **/
      @JsonProperty(JSON_PROPERTY_RULES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<RulesetRespDataAttributesRulesItems> getRules() {
        return rules;
      }
  public void setRules(List<RulesetRespDataAttributesRulesItems> rules) {
    this.rules = rules;
  }
  public RulesetRespDataAttributes version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * <p>The <code>attributes</code> <code>version</code>.</p>
   * @return version
  **/
      @JsonProperty(JSON_PROPERTY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Long getVersion() {
        return version;
      }
  public void setVersion(Long version) {
    this.version = version;
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
   * @return RulesetRespDataAttributes
   */
  @JsonAnySetter
  public RulesetRespDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this RulesetRespDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RulesetRespDataAttributes rulesetRespDataAttributes = (RulesetRespDataAttributes) o;
    return Objects.equals(this.created, rulesetRespDataAttributes.created) && Objects.equals(this.enabled, rulesetRespDataAttributes.enabled) && Objects.equals(this.lastModifiedUserUuid, rulesetRespDataAttributes.lastModifiedUserUuid) && Objects.equals(this.modified, rulesetRespDataAttributes.modified) && Objects.equals(this.name, rulesetRespDataAttributes.name) && Objects.equals(this.position, rulesetRespDataAttributes.position) && Objects.equals(this.processingStatus, rulesetRespDataAttributes.processingStatus) && Objects.equals(this.rules, rulesetRespDataAttributes.rules) && Objects.equals(this.version, rulesetRespDataAttributes.version) && Objects.equals(this.additionalProperties, rulesetRespDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(created,enabled,lastModifiedUserUuid,modified,name,position,processingStatus,rules,version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RulesetRespDataAttributes {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    lastModifiedUserUuid: ").append(toIndentedString(lastModifiedUserUuid)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    position: ").append(toIndentedString(position)).append("\n");
    sb.append("    processingStatus: ").append(toIndentedString(processingStatus)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
