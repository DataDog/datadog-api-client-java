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
   * <p>Advisory.</p>
 */
@JsonPropertyOrder({
  Advisory.JSON_PROPERTY_BASE_SEVERITY,
  Advisory.JSON_PROPERTY_ID,
  Advisory.JSON_PROPERTY_SEVERITY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Advisory {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BASE_SEVERITY = "base_severity";
  private String baseSeverity;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private String severity;

  public Advisory() {}

  @JsonCreator
  public Advisory(
            @JsonProperty(required=true, value=JSON_PROPERTY_BASE_SEVERITY)String baseSeverity,
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id) {
        this.baseSeverity = baseSeverity;
        this.id = id;
  }
  public Advisory baseSeverity(String baseSeverity) {
    this.baseSeverity = baseSeverity;
    return this;
  }

  /**
   * <p>Advisory base severity.</p>
   * @return baseSeverity
  **/
      @JsonProperty(JSON_PROPERTY_BASE_SEVERITY)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getBaseSeverity() {
        return baseSeverity;
      }
  public void setBaseSeverity(String baseSeverity) {
    this.baseSeverity = baseSeverity;
  }
  public Advisory id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>Advisory id.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public Advisory severity(String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * <p>Advisory Datadog severity.</p>
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
   * @return Advisory
   */
  @JsonAnySetter
  public Advisory putAdditionalProperty(String key, Object value) {
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
   * Return true if this Advisory object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Advisory advisory = (Advisory) o;
    return Objects.equals(this.baseSeverity, advisory.baseSeverity) && Objects.equals(this.id, advisory.id) && Objects.equals(this.severity, advisory.severity) && Objects.equals(this.additionalProperties, advisory.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(baseSeverity,id,severity, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Advisory {\n");
    sb.append("    baseSeverity: ").append(toIndentedString(baseSeverity)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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
