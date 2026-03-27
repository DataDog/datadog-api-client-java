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
   * <p>Vulnerability remediation.</p>
 */
@JsonPropertyOrder({
  Remediation.JSON_PROPERTY_AUTO_SOLVABLE,
  Remediation.JSON_PROPERTY_AVOIDED_ADVISORIES,
  Remediation.JSON_PROPERTY_FIXED_ADVISORIES,
  Remediation.JSON_PROPERTY_LIBRARY_NAME,
  Remediation.JSON_PROPERTY_LIBRARY_VERSION,
  Remediation.JSON_PROPERTY_NEW_ADVISORIES,
  Remediation.JSON_PROPERTY_REMAINING_ADVISORIES,
  Remediation.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Remediation {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTO_SOLVABLE = "auto_solvable";
  private Boolean autoSolvable;

  public static final String JSON_PROPERTY_AVOIDED_ADVISORIES = "avoided_advisories";
  private List<Advisory> avoidedAdvisories = new ArrayList<>();

  public static final String JSON_PROPERTY_FIXED_ADVISORIES = "fixed_advisories";
  private List<Advisory> fixedAdvisories = new ArrayList<>();

  public static final String JSON_PROPERTY_LIBRARY_NAME = "library_name";
  private String libraryName;

  public static final String JSON_PROPERTY_LIBRARY_VERSION = "library_version";
  private String libraryVersion;

  public static final String JSON_PROPERTY_NEW_ADVISORIES = "new_advisories";
  private List<Advisory> newAdvisories = new ArrayList<>();

  public static final String JSON_PROPERTY_REMAINING_ADVISORIES = "remaining_advisories";
  private List<Advisory> remainingAdvisories = new ArrayList<>();

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public Remediation() {}

  @JsonCreator
  public Remediation(
            @JsonProperty(required=true, value=JSON_PROPERTY_AUTO_SOLVABLE)Boolean autoSolvable,
            @JsonProperty(required=true, value=JSON_PROPERTY_AVOIDED_ADVISORIES)List<Advisory> avoidedAdvisories,
            @JsonProperty(required=true, value=JSON_PROPERTY_FIXED_ADVISORIES)List<Advisory> fixedAdvisories,
            @JsonProperty(required=true, value=JSON_PROPERTY_LIBRARY_NAME)String libraryName,
            @JsonProperty(required=true, value=JSON_PROPERTY_LIBRARY_VERSION)String libraryVersion,
            @JsonProperty(required=true, value=JSON_PROPERTY_NEW_ADVISORIES)List<Advisory> newAdvisories,
            @JsonProperty(required=true, value=JSON_PROPERTY_REMAINING_ADVISORIES)List<Advisory> remainingAdvisories,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)String type) {
        this.autoSolvable = autoSolvable;
        this.avoidedAdvisories = avoidedAdvisories;
        this.fixedAdvisories = fixedAdvisories;
        this.libraryName = libraryName;
        this.libraryVersion = libraryVersion;
        this.newAdvisories = newAdvisories;
        this.remainingAdvisories = remainingAdvisories;
        this.type = type;
  }
  public Remediation autoSolvable(Boolean autoSolvable) {
    this.autoSolvable = autoSolvable;
    return this;
  }

  /**
   * <p>Whether the vulnerability can be resolved when recompiling the package or not.</p>
   * @return autoSolvable
  **/
      @JsonProperty(JSON_PROPERTY_AUTO_SOLVABLE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getAutoSolvable() {
        return autoSolvable;
      }
  public void setAutoSolvable(Boolean autoSolvable) {
    this.autoSolvable = autoSolvable;
  }
  public Remediation avoidedAdvisories(List<Advisory> avoidedAdvisories) {
    this.avoidedAdvisories = avoidedAdvisories;
    for (Advisory item : avoidedAdvisories) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public Remediation addAvoidedAdvisoriesItem(Advisory avoidedAdvisoriesItem) {
    this.avoidedAdvisories.add(avoidedAdvisoriesItem);
    this.unparsed |= avoidedAdvisoriesItem.unparsed;
    return this;
  }

  /**
   * <p>Avoided advisories.</p>
   * @return avoidedAdvisories
  **/
      @JsonProperty(JSON_PROPERTY_AVOIDED_ADVISORIES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<Advisory> getAvoidedAdvisories() {
        return avoidedAdvisories;
      }
  public void setAvoidedAdvisories(List<Advisory> avoidedAdvisories) {
    this.avoidedAdvisories = avoidedAdvisories;
  }
  public Remediation fixedAdvisories(List<Advisory> fixedAdvisories) {
    this.fixedAdvisories = fixedAdvisories;
    for (Advisory item : fixedAdvisories) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public Remediation addFixedAdvisoriesItem(Advisory fixedAdvisoriesItem) {
    this.fixedAdvisories.add(fixedAdvisoriesItem);
    this.unparsed |= fixedAdvisoriesItem.unparsed;
    return this;
  }

  /**
   * <p>Remediation fixed advisories.</p>
   * @return fixedAdvisories
  **/
      @JsonProperty(JSON_PROPERTY_FIXED_ADVISORIES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<Advisory> getFixedAdvisories() {
        return fixedAdvisories;
      }
  public void setFixedAdvisories(List<Advisory> fixedAdvisories) {
    this.fixedAdvisories = fixedAdvisories;
  }
  public Remediation libraryName(String libraryName) {
    this.libraryName = libraryName;
    return this;
  }

  /**
   * <p>Library name remediating the vulnerability.</p>
   * @return libraryName
  **/
      @JsonProperty(JSON_PROPERTY_LIBRARY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getLibraryName() {
        return libraryName;
      }
  public void setLibraryName(String libraryName) {
    this.libraryName = libraryName;
  }
  public Remediation libraryVersion(String libraryVersion) {
    this.libraryVersion = libraryVersion;
    return this;
  }

  /**
   * <p>Library version remediating the vulnerability.</p>
   * @return libraryVersion
  **/
      @JsonProperty(JSON_PROPERTY_LIBRARY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getLibraryVersion() {
        return libraryVersion;
      }
  public void setLibraryVersion(String libraryVersion) {
    this.libraryVersion = libraryVersion;
  }
  public Remediation newAdvisories(List<Advisory> newAdvisories) {
    this.newAdvisories = newAdvisories;
    for (Advisory item : newAdvisories) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public Remediation addNewAdvisoriesItem(Advisory newAdvisoriesItem) {
    this.newAdvisories.add(newAdvisoriesItem);
    this.unparsed |= newAdvisoriesItem.unparsed;
    return this;
  }

  /**
   * <p>New advisories.</p>
   * @return newAdvisories
  **/
      @JsonProperty(JSON_PROPERTY_NEW_ADVISORIES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<Advisory> getNewAdvisories() {
        return newAdvisories;
      }
  public void setNewAdvisories(List<Advisory> newAdvisories) {
    this.newAdvisories = newAdvisories;
  }
  public Remediation remainingAdvisories(List<Advisory> remainingAdvisories) {
    this.remainingAdvisories = remainingAdvisories;
    for (Advisory item : remainingAdvisories) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public Remediation addRemainingAdvisoriesItem(Advisory remainingAdvisoriesItem) {
    this.remainingAdvisories.add(remainingAdvisoriesItem);
    this.unparsed |= remainingAdvisoriesItem.unparsed;
    return this;
  }

  /**
   * <p>Remaining advisories.</p>
   * @return remainingAdvisories
  **/
      @JsonProperty(JSON_PROPERTY_REMAINING_ADVISORIES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<Advisory> getRemainingAdvisories() {
        return remainingAdvisories;
      }
  public void setRemainingAdvisories(List<Advisory> remainingAdvisories) {
    this.remainingAdvisories = remainingAdvisories;
  }
  public Remediation type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>Remediation type.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
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
   * @return Remediation
   */
  @JsonAnySetter
  public Remediation putAdditionalProperty(String key, Object value) {
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
   * Return true if this Remediation object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Remediation remediation = (Remediation) o;
    return Objects.equals(this.autoSolvable, remediation.autoSolvable) && Objects.equals(this.avoidedAdvisories, remediation.avoidedAdvisories) && Objects.equals(this.fixedAdvisories, remediation.fixedAdvisories) && Objects.equals(this.libraryName, remediation.libraryName) && Objects.equals(this.libraryVersion, remediation.libraryVersion) && Objects.equals(this.newAdvisories, remediation.newAdvisories) && Objects.equals(this.remainingAdvisories, remediation.remainingAdvisories) && Objects.equals(this.type, remediation.type) && Objects.equals(this.additionalProperties, remediation.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(autoSolvable,avoidedAdvisories,fixedAdvisories,libraryName,libraryVersion,newAdvisories,remainingAdvisories,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Remediation {\n");
    sb.append("    autoSolvable: ").append(toIndentedString(autoSolvable)).append("\n");
    sb.append("    avoidedAdvisories: ").append(toIndentedString(avoidedAdvisories)).append("\n");
    sb.append("    fixedAdvisories: ").append(toIndentedString(fixedAdvisories)).append("\n");
    sb.append("    libraryName: ").append(toIndentedString(libraryName)).append("\n");
    sb.append("    libraryVersion: ").append(toIndentedString(libraryVersion)).append("\n");
    sb.append("    newAdvisories: ").append(toIndentedString(newAdvisories)).append("\n");
    sb.append("    remainingAdvisories: ").append(toIndentedString(remainingAdvisories)).append("\n");
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
