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
   * <p>Basic information about a deployment rule.</p>
 */
@JsonPropertyOrder({
  DeploymentRuleResponseDataAttributes.JSON_PROPERTY_CREATED_AT,
  DeploymentRuleResponseDataAttributes.JSON_PROPERTY_CREATED_BY,
  DeploymentRuleResponseDataAttributes.JSON_PROPERTY_DRY_RUN,
  DeploymentRuleResponseDataAttributes.JSON_PROPERTY_GATE_ID,
  DeploymentRuleResponseDataAttributes.JSON_PROPERTY_NAME,
  DeploymentRuleResponseDataAttributes.JSON_PROPERTY_OPTIONS,
  DeploymentRuleResponseDataAttributes.JSON_PROPERTY_TYPE,
  DeploymentRuleResponseDataAttributes.JSON_PROPERTY_UPDATED_AT,
  DeploymentRuleResponseDataAttributes.JSON_PROPERTY_UPDATED_BY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeploymentRuleResponseDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private DeploymentRuleResponseDataAttributesCreatedBy createdBy;

  public static final String JSON_PROPERTY_DRY_RUN = "dry_run";
  private Boolean dryRun;

  public static final String JSON_PROPERTY_GATE_ID = "gate_id";
  private String gateId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private DeploymentRulesOptions options;

  public static final String JSON_PROPERTY_TYPE = "type";
  private DeploymentRuleResponseDataAttributesType type;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_UPDATED_BY = "updated_by";
  private DeploymentRuleResponseDataAttributesUpdatedBy updatedBy;

  public DeploymentRuleResponseDataAttributes() {}

  @JsonCreator
  public DeploymentRuleResponseDataAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED_AT)OffsetDateTime createdAt,
            @JsonProperty(required=true, value=JSON_PROPERTY_CREATED_BY)DeploymentRuleResponseDataAttributesCreatedBy createdBy,
            @JsonProperty(required=true, value=JSON_PROPERTY_DRY_RUN)Boolean dryRun,
            @JsonProperty(required=true, value=JSON_PROPERTY_GATE_ID)String gateId,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_OPTIONS)DeploymentRulesOptions options,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)DeploymentRuleResponseDataAttributesType type) {
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.unparsed |= createdBy.unparsed;
        this.dryRun = dryRun;
        this.gateId = gateId;
        this.name = name;
        this.options = options;
        this.unparsed |= options.unparsed;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public DeploymentRuleResponseDataAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>The timestamp when the deployment rule was created.</p>
   * @return createdAt
  **/
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public DeploymentRuleResponseDataAttributes createdBy(DeploymentRuleResponseDataAttributesCreatedBy createdBy) {
    this.createdBy = createdBy;
    this.unparsed |= createdBy.unparsed;
    return this;
  }

  /**
   * <p>Information about the user who created the deployment rule.</p>
   * @return createdBy
  **/
      @JsonProperty(JSON_PROPERTY_CREATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public DeploymentRuleResponseDataAttributesCreatedBy getCreatedBy() {
        return createdBy;
      }
  public void setCreatedBy(DeploymentRuleResponseDataAttributesCreatedBy createdBy) {
    this.createdBy = createdBy;
  }
  public DeploymentRuleResponseDataAttributes dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * <p>Whether this rule is run in dry-run mode.</p>
   * @return dryRun
  **/
      @JsonProperty(JSON_PROPERTY_DRY_RUN)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getDryRun() {
        return dryRun;
      }
  public void setDryRun(Boolean dryRun) {
    this.dryRun = dryRun;
  }
  public DeploymentRuleResponseDataAttributes gateId(String gateId) {
    this.gateId = gateId;
    return this;
  }

  /**
   * <p>The ID of the deployment gate.</p>
   * @return gateId
  **/
      @JsonProperty(JSON_PROPERTY_GATE_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getGateId() {
        return gateId;
      }
  public void setGateId(String gateId) {
    this.gateId = gateId;
  }
  public DeploymentRuleResponseDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the deployment rule.</p>
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
  public DeploymentRuleResponseDataAttributes options(DeploymentRulesOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * <p>Options for deployment rule response representing either faulty deployment detection or monitor options.</p>
   * @return options
  **/
      @JsonProperty(JSON_PROPERTY_OPTIONS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public DeploymentRulesOptions getOptions() {
        return options;
      }
  public void setOptions(DeploymentRulesOptions options) {
    this.options = options;
  }
  public DeploymentRuleResponseDataAttributes type(DeploymentRuleResponseDataAttributesType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The type of the deployment rule.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public DeploymentRuleResponseDataAttributesType getType() {
        return type;
      }
  public void setType(DeploymentRuleResponseDataAttributesType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }
  public DeploymentRuleResponseDataAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>The timestamp when the deployment rule was last updated.</p>
   * @return updatedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getUpdatedAt() {
        return updatedAt;
      }
  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }
  public DeploymentRuleResponseDataAttributes updatedBy(DeploymentRuleResponseDataAttributesUpdatedBy updatedBy) {
    this.updatedBy = updatedBy;
    this.unparsed |= updatedBy.unparsed;
    return this;
  }

  /**
   * <p>Information about the user who updated the deployment rule.</p>
   * @return updatedBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public DeploymentRuleResponseDataAttributesUpdatedBy getUpdatedBy() {
        return updatedBy;
      }
  public void setUpdatedBy(DeploymentRuleResponseDataAttributesUpdatedBy updatedBy) {
    this.updatedBy = updatedBy;
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
   * @return DeploymentRuleResponseDataAttributes
   */
  @JsonAnySetter
  public DeploymentRuleResponseDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this DeploymentRuleResponseDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentRuleResponseDataAttributes deploymentRuleResponseDataAttributes = (DeploymentRuleResponseDataAttributes) o;
    return Objects.equals(this.createdAt, deploymentRuleResponseDataAttributes.createdAt) && Objects.equals(this.createdBy, deploymentRuleResponseDataAttributes.createdBy) && Objects.equals(this.dryRun, deploymentRuleResponseDataAttributes.dryRun) && Objects.equals(this.gateId, deploymentRuleResponseDataAttributes.gateId) && Objects.equals(this.name, deploymentRuleResponseDataAttributes.name) && Objects.equals(this.options, deploymentRuleResponseDataAttributes.options) && Objects.equals(this.type, deploymentRuleResponseDataAttributes.type) && Objects.equals(this.updatedAt, deploymentRuleResponseDataAttributes.updatedAt) && Objects.equals(this.updatedBy, deploymentRuleResponseDataAttributes.updatedBy) && Objects.equals(this.additionalProperties, deploymentRuleResponseDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(createdAt,createdBy,dryRun,gateId,name,options,type,updatedAt,updatedBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentRuleResponseDataAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    gateId: ").append(toIndentedString(gateId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
