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
   * <p>Update an existing rule.</p>
 */
@JsonPropertyOrder({
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_CASES,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_COMPLIANCE_SIGNAL_OPTIONS,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_FILTERS,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_HAS_EXTENDED_TITLE,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_IS_ENABLED,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_MESSAGE,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_NAME,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_OPTIONS,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_QUERIES,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_TAGS,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringRuleUpdatePayload {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CASES = "cases";
  private List<SecurityMonitoringRuleCase> cases = null;

  public static final String JSON_PROPERTY_COMPLIANCE_SIGNAL_OPTIONS = "complianceSignalOptions";
  private CloudConfigurationRuleComplianceSignalOptions complianceSignalOptions;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<SecurityMonitoringFilter> filters = null;

  public static final String JSON_PROPERTY_HAS_EXTENDED_TITLE = "hasExtendedTitle";
  private Boolean hasExtendedTitle;

  public static final String JSON_PROPERTY_IS_ENABLED = "isEnabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private SecurityMonitoringRuleOptions options;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<SecurityMonitoringRuleQuery> queries = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public SecurityMonitoringRuleUpdatePayload cases(List<SecurityMonitoringRuleCase> cases) {
    this.cases = cases;
    for (SecurityMonitoringRuleCase item : cases) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SecurityMonitoringRuleUpdatePayload addCasesItem(SecurityMonitoringRuleCase casesItem) {
    if (this.cases == null) {
      this.cases = new ArrayList<>();
    }
    this.cases.add(casesItem);
    this.unparsed |= casesItem.unparsed;
    return this;
  }

  /**
   * <p>Cases for generating signals.</p>
   * @return cases
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CASES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SecurityMonitoringRuleCase> getCases() {
        return cases;
      }
  public void setCases(List<SecurityMonitoringRuleCase> cases) {
    this.cases = cases;
  }
  public SecurityMonitoringRuleUpdatePayload complianceSignalOptions(CloudConfigurationRuleComplianceSignalOptions complianceSignalOptions) {
    this.complianceSignalOptions = complianceSignalOptions;
    this.unparsed |= complianceSignalOptions.unparsed;
    return this;
  }

  /**
   * <p>How to generate compliance signals. Useful for cloud_configuration rules only.</p>
   * @return complianceSignalOptions
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COMPLIANCE_SIGNAL_OPTIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CloudConfigurationRuleComplianceSignalOptions getComplianceSignalOptions() {
        return complianceSignalOptions;
      }
  public void setComplianceSignalOptions(CloudConfigurationRuleComplianceSignalOptions complianceSignalOptions) {
    this.complianceSignalOptions = complianceSignalOptions;
  }
  public SecurityMonitoringRuleUpdatePayload filters(List<SecurityMonitoringFilter> filters) {
    this.filters = filters;
    for (SecurityMonitoringFilter item : filters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SecurityMonitoringRuleUpdatePayload addFiltersItem(SecurityMonitoringFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    this.unparsed |= filtersItem.unparsed;
    return this;
  }

  /**
   * <p>Additional queries to filter matched events before they are processed.</p>
   * @return filters
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SecurityMonitoringFilter> getFilters() {
        return filters;
      }
  public void setFilters(List<SecurityMonitoringFilter> filters) {
    this.filters = filters;
  }
  public SecurityMonitoringRuleUpdatePayload hasExtendedTitle(Boolean hasExtendedTitle) {
    this.hasExtendedTitle = hasExtendedTitle;
    return this;
  }

  /**
   * <p>Whether the notifications include the triggering group-by values in their title.</p>
   * @return hasExtendedTitle
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HAS_EXTENDED_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getHasExtendedTitle() {
        return hasExtendedTitle;
      }
  public void setHasExtendedTitle(Boolean hasExtendedTitle) {
    this.hasExtendedTitle = hasExtendedTitle;
  }
  public SecurityMonitoringRuleUpdatePayload isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * <p>Whether the rule is enabled.</p>
   * @return isEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsEnabled() {
        return isEnabled;
      }
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }
  public SecurityMonitoringRuleUpdatePayload message(String message) {
    this.message = message;
    return this;
  }

  /**
   * <p>Message for generated signals.</p>
   * @return message
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MESSAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getMessage() {
        return message;
      }
  public void setMessage(String message) {
    this.message = message;
  }
  public SecurityMonitoringRuleUpdatePayload name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>Name of the rule.</p>
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
  public SecurityMonitoringRuleUpdatePayload options(SecurityMonitoringRuleOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * <p>Options on rules.</p>
   * @return options
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OPTIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringRuleOptions getOptions() {
        return options;
      }
  public void setOptions(SecurityMonitoringRuleOptions options) {
    this.options = options;
  }
  public SecurityMonitoringRuleUpdatePayload queries(List<SecurityMonitoringRuleQuery> queries) {
    this.queries = queries;
    for (SecurityMonitoringRuleQuery item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SecurityMonitoringRuleUpdatePayload addQueriesItem(SecurityMonitoringRuleQuery queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * <p>Queries for selecting logs which are part of the rule.</p>
   * @return queries
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERIES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SecurityMonitoringRuleQuery> getQueries() {
        return queries;
      }
  public void setQueries(List<SecurityMonitoringRuleQuery> queries) {
    this.queries = queries;
  }
  public SecurityMonitoringRuleUpdatePayload tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public SecurityMonitoringRuleUpdatePayload addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>Tags for generated signals.</p>
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
  public SecurityMonitoringRuleUpdatePayload version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * <p>The version of the rule being updated.</p>
   * maximum: 2147483647
   * @return version
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getVersion() {
        return version;
      }
  public void setVersion(Integer version) {
    this.version = version;
  }

  /**
   * Return true if this SecurityMonitoringRuleUpdatePayload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleUpdatePayload securityMonitoringRuleUpdatePayload = (SecurityMonitoringRuleUpdatePayload) o;
    return Objects.equals(this.cases, securityMonitoringRuleUpdatePayload.cases) && Objects.equals(this.complianceSignalOptions, securityMonitoringRuleUpdatePayload.complianceSignalOptions) && Objects.equals(this.filters, securityMonitoringRuleUpdatePayload.filters) && Objects.equals(this.hasExtendedTitle, securityMonitoringRuleUpdatePayload.hasExtendedTitle) && Objects.equals(this.isEnabled, securityMonitoringRuleUpdatePayload.isEnabled) && Objects.equals(this.message, securityMonitoringRuleUpdatePayload.message) && Objects.equals(this.name, securityMonitoringRuleUpdatePayload.name) && Objects.equals(this.options, securityMonitoringRuleUpdatePayload.options) && Objects.equals(this.queries, securityMonitoringRuleUpdatePayload.queries) && Objects.equals(this.tags, securityMonitoringRuleUpdatePayload.tags) && Objects.equals(this.version, securityMonitoringRuleUpdatePayload.version);
  }


  @Override
  public int hashCode() {
    return Objects.hash(cases,complianceSignalOptions,filters,hasExtendedTitle,isEnabled,message,name,options,queries,tags,version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleUpdatePayload {\n");
    sb.append("    cases: ").append(toIndentedString(cases)).append("\n");
    sb.append("    complianceSignalOptions: ").append(toIndentedString(complianceSignalOptions)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    hasExtendedTitle: ").append(toIndentedString(hasExtendedTitle)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("}");
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
