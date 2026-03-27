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
   * <p>Parameters for updating a deployment rule.</p>
 */
@JsonPropertyOrder({
  UpdateDeploymentRuleParamsDataAttributes.JSON_PROPERTY_DRY_RUN,
  UpdateDeploymentRuleParamsDataAttributes.JSON_PROPERTY_NAME,
  UpdateDeploymentRuleParamsDataAttributes.JSON_PROPERTY_OPTIONS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpdateDeploymentRuleParamsDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DRY_RUN = "dry_run";
  private Boolean dryRun;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private DeploymentRulesOptions options;

  public UpdateDeploymentRuleParamsDataAttributes() {}

  @JsonCreator
  public UpdateDeploymentRuleParamsDataAttributes(
            @JsonProperty(required=true, value=JSON_PROPERTY_DRY_RUN)Boolean dryRun,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_OPTIONS)DeploymentRulesOptions options) {
        this.dryRun = dryRun;
        this.name = name;
        this.options = options;
        this.unparsed |= options.unparsed;
  }
  public UpdateDeploymentRuleParamsDataAttributes dryRun(Boolean dryRun) {
    this.dryRun = dryRun;
    return this;
  }

  /**
   * <p>Whether to run this rule in dry-run mode.</p>
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
  public UpdateDeploymentRuleParamsDataAttributes name(String name) {
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
  public UpdateDeploymentRuleParamsDataAttributes options(DeploymentRulesOptions options) {
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
   * @return UpdateDeploymentRuleParamsDataAttributes
   */
  @JsonAnySetter
  public UpdateDeploymentRuleParamsDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this UpdateDeploymentRuleParamsDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDeploymentRuleParamsDataAttributes updateDeploymentRuleParamsDataAttributes = (UpdateDeploymentRuleParamsDataAttributes) o;
    return Objects.equals(this.dryRun, updateDeploymentRuleParamsDataAttributes.dryRun) && Objects.equals(this.name, updateDeploymentRuleParamsDataAttributes.name) && Objects.equals(this.options, updateDeploymentRuleParamsDataAttributes.options) && Objects.equals(this.additionalProperties, updateDeploymentRuleParamsDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(dryRun,name,options, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDeploymentRuleParamsDataAttributes {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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
