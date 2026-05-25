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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** The attributes of the analysis request, containing the source code and rules to apply. */
@JsonPropertyOrder({
  AnalysisRequestDataAttributes.JSON_PROPERTY_CODE,
  AnalysisRequestDataAttributes.JSON_PROPERTY_FILE_ENCODING,
  AnalysisRequestDataAttributes.JSON_PROPERTY_FILENAME,
  AnalysisRequestDataAttributes.JSON_PROPERTY_LANGUAGE,
  AnalysisRequestDataAttributes.JSON_PROPERTY_RULES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AnalysisRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_FILE_ENCODING = "file_encoding";
  private String fileEncoding;

  public static final String JSON_PROPERTY_FILENAME = "filename";
  private String filename;

  public static final String JSON_PROPERTY_LANGUAGE = "language";
  private String language;

  public static final String JSON_PROPERTY_RULES = "rules";
  private List<AnalysisRequestRule> rules = new ArrayList<>();

  public AnalysisRequestDataAttributes() {}

  @JsonCreator
  public AnalysisRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CODE) String code,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILE_ENCODING) String fileEncoding,
      @JsonProperty(required = true, value = JSON_PROPERTY_FILENAME) String filename,
      @JsonProperty(required = true, value = JSON_PROPERTY_LANGUAGE) String language,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULES) List<AnalysisRequestRule> rules) {
    this.code = code;
    this.fileEncoding = fileEncoding;
    this.filename = filename;
    this.language = language;
    this.rules = rules;
  }

  public AnalysisRequestDataAttributes code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The base64-encoded source code to analyze.
   *
   * @return code
   */
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public AnalysisRequestDataAttributes fileEncoding(String fileEncoding) {
    this.fileEncoding = fileEncoding;
    return this;
  }

  /**
   * The encoding of the source code file (must be <code>utf-8</code>).
   *
   * @return fileEncoding
   */
  @JsonProperty(JSON_PROPERTY_FILE_ENCODING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFileEncoding() {
    return fileEncoding;
  }

  public void setFileEncoding(String fileEncoding) {
    this.fileEncoding = fileEncoding;
  }

  public AnalysisRequestDataAttributes filename(String filename) {
    this.filename = filename;
    return this;
  }

  /**
   * The name of the file being analyzed.
   *
   * @return filename
   */
  @JsonProperty(JSON_PROPERTY_FILENAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getFilename() {
    return filename;
  }

  public void setFilename(String filename) {
    this.filename = filename;
  }

  public AnalysisRequestDataAttributes language(String language) {
    this.language = language;
    return this;
  }

  /**
   * The programming language of the source code.
   *
   * @return language
   */
  @JsonProperty(JSON_PROPERTY_LANGUAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public AnalysisRequestDataAttributes rules(List<AnalysisRequestRule> rules) {
    this.rules = rules;
    for (AnalysisRequestRule item : rules) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AnalysisRequestDataAttributes addRulesItem(AnalysisRequestRule rulesItem) {
    this.rules.add(rulesItem);
    this.unparsed |= rulesItem.unparsed;
    return this;
  }

  /**
   * The list of static analysis rules to apply during analysis.
   *
   * @return rules
   */
  @JsonProperty(JSON_PROPERTY_RULES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AnalysisRequestRule> getRules() {
    return rules;
  }

  public void setRules(List<AnalysisRequestRule> rules) {
    this.rules = rules;
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
   * @return AnalysisRequestDataAttributes
   */
  @JsonAnySetter
  public AnalysisRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AnalysisRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalysisRequestDataAttributes analysisRequestDataAttributes = (AnalysisRequestDataAttributes) o;
    return Objects.equals(this.code, analysisRequestDataAttributes.code)
        && Objects.equals(this.fileEncoding, analysisRequestDataAttributes.fileEncoding)
        && Objects.equals(this.filename, analysisRequestDataAttributes.filename)
        && Objects.equals(this.language, analysisRequestDataAttributes.language)
        && Objects.equals(this.rules, analysisRequestDataAttributes.rules)
        && Objects.equals(
            this.additionalProperties, analysisRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, fileEncoding, filename, language, rules, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalysisRequestDataAttributes {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    fileEncoding: ").append(toIndentedString(fileEncoding)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
