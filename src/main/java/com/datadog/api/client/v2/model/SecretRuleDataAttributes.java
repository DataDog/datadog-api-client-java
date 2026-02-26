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

 */
@JsonPropertyOrder({
  SecretRuleDataAttributes.JSON_PROPERTY_DEFAULT_INCLUDED_KEYWORDS,
  SecretRuleDataAttributes.JSON_PROPERTY_DESCRIPTION,
  SecretRuleDataAttributes.JSON_PROPERTY_LICENSE,
  SecretRuleDataAttributes.JSON_PROPERTY_MATCH_VALIDATION,
  SecretRuleDataAttributes.JSON_PROPERTY_NAME,
  SecretRuleDataAttributes.JSON_PROPERTY_PATTERN,
  SecretRuleDataAttributes.JSON_PROPERTY_PRIORITY,
  SecretRuleDataAttributes.JSON_PROPERTY_SDS_ID,
  SecretRuleDataAttributes.JSON_PROPERTY_VALIDATORS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecretRuleDataAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFAULT_INCLUDED_KEYWORDS = "default_included_keywords";
  private List<String> defaultIncludedKeywords = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_LICENSE = "license";
  private String license;

  public static final String JSON_PROPERTY_MATCH_VALIDATION = "match_validation";
  private SecretRuleDataAttributesMatchValidation matchValidation;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PATTERN = "pattern";
  private String pattern;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private String priority;

  public static final String JSON_PROPERTY_SDS_ID = "sds_id";
  private String sdsId;

  public static final String JSON_PROPERTY_VALIDATORS = "validators";
  private List<String> validators = null;

  public SecretRuleDataAttributes defaultIncludedKeywords(List<String> defaultIncludedKeywords) {
    this.defaultIncludedKeywords = defaultIncludedKeywords;
    return this;
  }
  public SecretRuleDataAttributes addDefaultIncludedKeywordsItem(String defaultIncludedKeywordsItem) {
    if (this.defaultIncludedKeywords == null) {
      this.defaultIncludedKeywords = new ArrayList<>();
    }
    this.defaultIncludedKeywords.add(defaultIncludedKeywordsItem);
    return this;
  }

  /**
   * <p>GetdefaultIncludedKeywords</p>
   * @return defaultIncludedKeywords
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DEFAULT_INCLUDED_KEYWORDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getDefaultIncludedKeywords() {
        return defaultIncludedKeywords;
      }
  public void setDefaultIncludedKeywords(List<String> defaultIncludedKeywords) {
    this.defaultIncludedKeywords = defaultIncludedKeywords;
  }
  public SecretRuleDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>Getdescription</p>
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
  public SecretRuleDataAttributes license(String license) {
    this.license = license;
    return this;
  }

  /**
   * <p>Getlicense</p>
   * @return license
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LICENSE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getLicense() {
        return license;
      }
  public void setLicense(String license) {
    this.license = license;
  }
  public SecretRuleDataAttributes matchValidation(SecretRuleDataAttributesMatchValidation matchValidation) {
    this.matchValidation = matchValidation;
    this.unparsed |= matchValidation.unparsed;
    return this;
  }

  /**
   * <p>GetmatchValidation</p>
   * @return matchValidation
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MATCH_VALIDATION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecretRuleDataAttributesMatchValidation getMatchValidation() {
        return matchValidation;
      }
  public void setMatchValidation(SecretRuleDataAttributesMatchValidation matchValidation) {
    this.matchValidation = matchValidation;
  }
  public SecretRuleDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Getname</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public SecretRuleDataAttributes pattern(String pattern) {
    this.pattern = pattern;
    return this;
  }

  /**
   * <p>Getpattern</p>
   * @return pattern
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PATTERN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPattern() {
        return pattern;
      }
  public void setPattern(String pattern) {
    this.pattern = pattern;
  }
  public SecretRuleDataAttributes priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * <p>Getpriority</p>
   * @return priority
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PRIORITY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getPriority() {
        return priority;
      }
  public void setPriority(String priority) {
    this.priority = priority;
  }
  public SecretRuleDataAttributes sdsId(String sdsId) {
    this.sdsId = sdsId;
    return this;
  }

  /**
   * <p>GetsdsId</p>
   * @return sdsId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SDS_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSdsId() {
        return sdsId;
      }
  public void setSdsId(String sdsId) {
    this.sdsId = sdsId;
  }
  public SecretRuleDataAttributes validators(List<String> validators) {
    this.validators = validators;
    return this;
  }
  public SecretRuleDataAttributes addValidatorsItem(String validatorsItem) {
    if (this.validators == null) {
      this.validators = new ArrayList<>();
    }
    this.validators.add(validatorsItem);
    return this;
  }

  /**
   * <p>Getvalidators</p>
   * @return validators
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VALIDATORS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getValidators() {
        return validators;
      }
  public void setValidators(List<String> validators) {
    this.validators = validators;
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
   * @return SecretRuleDataAttributes
   */
  @JsonAnySetter
  public SecretRuleDataAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this SecretRuleDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecretRuleDataAttributes secretRuleDataAttributes = (SecretRuleDataAttributes) o;
    return Objects.equals(this.defaultIncludedKeywords, secretRuleDataAttributes.defaultIncludedKeywords) && Objects.equals(this.description, secretRuleDataAttributes.description) && Objects.equals(this.license, secretRuleDataAttributes.license) && Objects.equals(this.matchValidation, secretRuleDataAttributes.matchValidation) && Objects.equals(this.name, secretRuleDataAttributes.name) && Objects.equals(this.pattern, secretRuleDataAttributes.pattern) && Objects.equals(this.priority, secretRuleDataAttributes.priority) && Objects.equals(this.sdsId, secretRuleDataAttributes.sdsId) && Objects.equals(this.validators, secretRuleDataAttributes.validators) && Objects.equals(this.additionalProperties, secretRuleDataAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(defaultIncludedKeywords,description,license,matchValidation,name,pattern,priority,sdsId,validators, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretRuleDataAttributes {\n");
    sb.append("    defaultIncludedKeywords: ").append(toIndentedString(defaultIncludedKeywords)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    matchValidation: ").append(toIndentedString(matchValidation)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    sdsId: ").append(toIndentedString(sdsId)).append("\n");
    sb.append("    validators: ").append(toIndentedString(validators)).append("\n");
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
