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
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_ARGUMENTS,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_CATEGORY,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_CHECKSUM,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_CODE,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_CREATED_AT,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_CREATED_BY,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_CVE,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_CWE,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_DATA,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_DESCRIPTION,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_DOCUMENTATION_URL,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_ENTITY_CHECKED,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_IS_PUBLISHED,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_IS_TESTING,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_LANGUAGE,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_LAST_UPDATED_AT,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_LAST_UPDATED_BY,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_NAME,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_REGEX,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_SEVERITY,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_SHORT_DESCRIPTION,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_SHOULD_USE_AI_FIX,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_TESTS,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_TREE_SITTER_QUERY,
  GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ARGUMENTS = "arguments";
  private List<GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsArgumentsItems> arguments = null;

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private String category;

  public static final String JSON_PROPERTY_CHECKSUM = "checksum";
  private String checksum;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_CVE = "cve";
  private String cve;

  public static final String JSON_PROPERTY_CWE = "cwe";
  private String cwe;

  public static final String JSON_PROPERTY_DATA = "data";
  private GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsData data;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DOCUMENTATION_URL = "documentation_url";
  private String documentationUrl;

  public static final String JSON_PROPERTY_ENTITY_CHECKED = "entity_checked";
  private String entityChecked;

  public static final String JSON_PROPERTY_IS_PUBLISHED = "is_published";
  private Boolean isPublished;

  public static final String JSON_PROPERTY_IS_TESTING = "is_testing";
  private Boolean isTesting;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_LAST_UPDATED_AT = "last_updated_at";
  private OffsetDateTime lastUpdatedAt;

  public static final String JSON_PROPERTY_LAST_UPDATED_BY = "last_updated_by";
  private String lastUpdatedBy;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REGEX = "regex";
  private String regex;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private String severity;

  public static final String JSON_PROPERTY_SHORT_DESCRIPTION = "short_description";
  private String shortDescription;

  public static final String JSON_PROPERTY_SHOULD_USE_AI_FIX = "should_use_ai_fix";
  private Boolean shouldUseAiFix;

  public static final String JSON_PROPERTY_TESTS = "tests";
  private List<GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems> tests = null;

  public static final String JSON_PROPERTY_TREE_SITTER_QUERY = "tree_sitter_query";
  private String treeSitterQuery;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems() {}

  @JsonCreator
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems(
            @JsonProperty(required=true, value=JSON_PROPERTY_DATA)GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsData data) {
        this.data = data;
        this.unparsed |= data.unparsed;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems arguments(List<GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsArgumentsItems> arguments) {
    this.arguments = arguments;
    for (GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsArgumentsItems item : arguments) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems addArgumentsItem(GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsArgumentsItems argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new ArrayList<>();
    }
    this.arguments.add(argumentsItem);
    this.unparsed |= argumentsItem.unparsed;
    return this;
  }

  /**
   * <p>Getarguments</p>
   * @return arguments
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ARGUMENTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsArgumentsItems> getArguments() {
        return arguments;
      }
  public void setArguments(List<GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsArgumentsItems> arguments) {
    this.arguments = arguments;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems category(String category) {
    this.category = category;
    return this;
  }

  /**
   * <p>Getcategory</p>
   * @return category
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CATEGORY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCategory() {
        return category;
      }
  public void setCategory(String category) {
    this.category = category;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }

  /**
   * <p>Getchecksum</p>
   * @return checksum
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHECKSUM)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getChecksum() {
        return checksum;
      }
  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems code(String code) {
    this.code = code;
    return this;
  }

  /**
   * <p>Getcode</p>
   * @return code
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CODE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCode() {
        return code;
      }
  public void setCode(String code) {
    this.code = code;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>GetcreatedAt</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getCreatedAt() {
        return createdAt;
      }
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * <p>GetcreatedBy</p>
   * @return createdBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCreatedBy() {
        return createdBy;
      }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems cve(String cve) {
    this.cve = cve;
    return this;
  }

  /**
   * <p>Getcve</p>
   * @return cve
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CVE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCve() {
        return cve;
      }
  public void setCve(String cve) {
    this.cve = cve;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems cwe(String cwe) {
    this.cwe = cwe;
    return this;
  }

  /**
   * <p>Getcwe</p>
   * @return cwe
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CWE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCwe() {
        return cwe;
      }
  public void setCwe(String cwe) {
    this.cwe = cwe;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems data(GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsData data) {
    this.data = data;
    this.unparsed |= data.unparsed;
    return this;
  }

  /**
   * <p>Getdata</p>
   * @return data
  **/
      @JsonProperty(JSON_PROPERTY_DATA)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsData getData() {
        return data;
      }
  public void setData(GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsData data) {
    this.data = data;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems description(String description) {
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
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems documentationUrl(String documentationUrl) {
    this.documentationUrl = documentationUrl;
    return this;
  }

  /**
   * <p>GetdocumentationUrl</p>
   * @return documentationUrl
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DOCUMENTATION_URL)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDocumentationUrl() {
        return documentationUrl;
      }
  public void setDocumentationUrl(String documentationUrl) {
    this.documentationUrl = documentationUrl;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems entityChecked(String entityChecked) {
    this.entityChecked = entityChecked;
    return this;
  }

  /**
   * <p>GetentityChecked</p>
   * @return entityChecked
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENTITY_CHECKED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getEntityChecked() {
        return entityChecked;
      }
  public void setEntityChecked(String entityChecked) {
    this.entityChecked = entityChecked;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems isPublished(Boolean isPublished) {
    this.isPublished = isPublished;
    return this;
  }

  /**
   * <p>GetisPublished</p>
   * @return isPublished
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_PUBLISHED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsPublished() {
        return isPublished;
      }
  public void setIsPublished(Boolean isPublished) {
    this.isPublished = isPublished;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems isTesting(Boolean isTesting) {
    this.isTesting = isTesting;
    return this;
  }

  /**
   * <p>GetisTesting</p>
   * @return isTesting
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_TESTING)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsTesting() {
        return isTesting;
      }
  public void setIsTesting(Boolean isTesting) {
    this.isTesting = isTesting;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems language(String language) {
    this.language = language;
    return this;
  }

  /**
   * <p>Getlanguage</p>
   * @return language
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LANGUAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getLanguage() {
        return language;
      }
  public void setLanguage(String language) {
    this.language = language;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems lastUpdatedAt(OffsetDateTime lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

  /**
   * <p>GetlastUpdatedAt</p>
   * @return lastUpdatedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getLastUpdatedAt() {
        return lastUpdatedAt;
      }
  public void setLastUpdatedAt(OffsetDateTime lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems lastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

  /**
   * <p>GetlastUpdatedBy</p>
   * @return lastUpdatedBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LAST_UPDATED_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getLastUpdatedBy() {
        return lastUpdatedBy;
      }
  public void setLastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems name(String name) {
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
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems regex(String regex) {
    this.regex = regex;
    return this;
  }

  /**
   * <p>Getregex</p>
   * @return regex
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REGEX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRegex() {
        return regex;
      }
  public void setRegex(String regex) {
    this.regex = regex;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems severity(String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * <p>Getseverity</p>
   * @return severity
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SEVERITY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSeverity() {
        return severity;
      }
  public void setSeverity(String severity) {
    this.severity = severity;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems shortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
    return this;
  }

  /**
   * <p>GetshortDescription</p>
   * @return shortDescription
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHORT_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getShortDescription() {
        return shortDescription;
      }
  public void setShortDescription(String shortDescription) {
    this.shortDescription = shortDescription;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems shouldUseAiFix(Boolean shouldUseAiFix) {
    this.shouldUseAiFix = shouldUseAiFix;
    return this;
  }

  /**
   * <p>GetshouldUseAiFix</p>
   * @return shouldUseAiFix
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SHOULD_USE_AI_FIX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getShouldUseAiFix() {
        return shouldUseAiFix;
      }
  public void setShouldUseAiFix(Boolean shouldUseAiFix) {
    this.shouldUseAiFix = shouldUseAiFix;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems tests(List<GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems> tests) {
    this.tests = tests;
    for (GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems item : tests) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems addTestsItem(GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems testsItem) {
    if (this.tests == null) {
      this.tests = new ArrayList<>();
    }
    this.tests.add(testsItem);
    this.unparsed |= testsItem.unparsed;
    return this;
  }

  /**
   * <p>Gettests</p>
   * @return tests
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TESTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems> getTests() {
        return tests;
      }
  public void setTests(List<GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItemsTestsItems> tests) {
    this.tests = tests;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems treeSitterQuery(String treeSitterQuery) {
    this.treeSitterQuery = treeSitterQuery;
    return this;
  }

  /**
   * <p>GettreeSitterQuery</p>
   * @return treeSitterQuery
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TREE_SITTER_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getTreeSitterQuery() {
        return treeSitterQuery;
      }
  public void setTreeSitterQuery(String treeSitterQuery) {
    this.treeSitterQuery = treeSitterQuery;
  }
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>Gettype</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getType() {
        return type;
      }
  public void setType(String type) {
    this.type = type;
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
   * @return GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems
   */
  @JsonAnySetter
  public GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems putAdditionalProperty(String key, Object value) {
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
   * Return true if this GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems = (GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems) o;
    return Objects.equals(this.arguments, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.arguments) && Objects.equals(this.category, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.category) && Objects.equals(this.checksum, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.checksum) && Objects.equals(this.code, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.code) && Objects.equals(this.createdAt, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.createdAt) && Objects.equals(this.createdBy, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.createdBy) && Objects.equals(this.cve, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.cve) && Objects.equals(this.cwe, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.cwe) && Objects.equals(this.data, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.data) && Objects.equals(this.description, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.description) && Objects.equals(this.documentationUrl, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.documentationUrl) && Objects.equals(this.entityChecked, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.entityChecked) && Objects.equals(this.isPublished, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.isPublished) && Objects.equals(this.isTesting, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.isTesting) && Objects.equals(this.language, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.language) && Objects.equals(this.lastUpdatedAt, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.lastUpdatedAt) && Objects.equals(this.lastUpdatedBy, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.lastUpdatedBy) && Objects.equals(this.name, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.name) && Objects.equals(this.regex, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.regex) && Objects.equals(this.severity, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.severity) && Objects.equals(this.shortDescription, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.shortDescription) && Objects.equals(this.shouldUseAiFix, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.shouldUseAiFix) && Objects.equals(this.tests, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.tests) && Objects.equals(this.treeSitterQuery, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.treeSitterQuery) && Objects.equals(this.type, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.type) && Objects.equals(this.additionalProperties, getMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(arguments,category,checksum,code,createdAt,createdBy,cve,cwe,data,description,documentationUrl,entityChecked,isPublished,isTesting,language,lastUpdatedAt,lastUpdatedBy,name,regex,severity,shortDescription,shouldUseAiFix,tests,treeSitterQuery,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetMultipleRulesetsResponseDataAttributesRulesetsItemsRulesItems {\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    cve: ").append(toIndentedString(cve)).append("\n");
    sb.append("    cwe: ").append(toIndentedString(cwe)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    documentationUrl: ").append(toIndentedString(documentationUrl)).append("\n");
    sb.append("    entityChecked: ").append(toIndentedString(entityChecked)).append("\n");
    sb.append("    isPublished: ").append(toIndentedString(isPublished)).append("\n");
    sb.append("    isTesting: ").append(toIndentedString(isTesting)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    regex: ").append(toIndentedString(regex)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    shortDescription: ").append(toIndentedString(shortDescription)).append("\n");
    sb.append("    shouldUseAiFix: ").append(toIndentedString(shouldUseAiFix)).append("\n");
    sb.append("    tests: ").append(toIndentedString(tests)).append("\n");
    sb.append("    treeSitterQuery: ").append(toIndentedString(treeSitterQuery)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
