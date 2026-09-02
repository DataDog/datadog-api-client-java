/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Metadata related to paging information that is included in the response when querying the team
 * hierarchy links
 */
@JsonPropertyOrder({
  TeamsHierarchyLinksResponseMetaPage.JSON_PROPERTY_FIRST_NUMBER,
  TeamsHierarchyLinksResponseMetaPage.JSON_PROPERTY_LAST_NUMBER,
  TeamsHierarchyLinksResponseMetaPage.JSON_PROPERTY_NEXT_NUMBER,
  TeamsHierarchyLinksResponseMetaPage.JSON_PROPERTY_NUMBER,
  TeamsHierarchyLinksResponseMetaPage.JSON_PROPERTY_PREV_NUMBER,
  TeamsHierarchyLinksResponseMetaPage.JSON_PROPERTY_SIZE,
  TeamsHierarchyLinksResponseMetaPage.JSON_PROPERTY_TOTAL,
  TeamsHierarchyLinksResponseMetaPage.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TeamsHierarchyLinksResponseMetaPage {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FIRST_NUMBER = "first_number";
  private Long firstNumber;

  public static final String JSON_PROPERTY_LAST_NUMBER = "last_number";
  private Long lastNumber;

  public static final String JSON_PROPERTY_NEXT_NUMBER = "next_number";
  private JsonNullable<Long> nextNumber = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_NUMBER = "number";
  private Long number;

  public static final String JSON_PROPERTY_PREV_NUMBER = "prev_number";
  private JsonNullable<Long> prevNumber = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public TeamsHierarchyLinksResponseMetaPage firstNumber(Long firstNumber) {
    this.firstNumber = firstNumber;
    return this;
  }

  /**
   * First page number.
   *
   * @return firstNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FIRST_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFirstNumber() {
    return firstNumber;
  }

  public void setFirstNumber(Long firstNumber) {
    this.firstNumber = firstNumber;
  }

  public TeamsHierarchyLinksResponseMetaPage lastNumber(Long lastNumber) {
    this.lastNumber = lastNumber;
    return this;
  }

  /**
   * Last page number.
   *
   * @return lastNumber
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLastNumber() {
    return lastNumber;
  }

  public void setLastNumber(Long lastNumber) {
    this.lastNumber = lastNumber;
  }

  public TeamsHierarchyLinksResponseMetaPage nextNumber(Long nextNumber) {
    this.nextNumber = JsonNullable.<Long>of(nextNumber);
    return this;
  }

  /**
   * Next page number.
   *
   * @return nextNumber
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getNextNumber() {
    return nextNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NEXT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getNextNumber_JsonNullable() {
    return nextNumber;
  }

  @JsonProperty(JSON_PROPERTY_NEXT_NUMBER)
  public void setNextNumber_JsonNullable(JsonNullable<Long> nextNumber) {
    this.nextNumber = nextNumber;
  }

  public void setNextNumber(Long nextNumber) {
    this.nextNumber = JsonNullable.<Long>of(nextNumber);
  }

  public TeamsHierarchyLinksResponseMetaPage number(Long number) {
    this.number = number;
    return this;
  }

  /**
   * Page number.
   *
   * @return number
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getNumber() {
    return number;
  }

  public void setNumber(Long number) {
    this.number = number;
  }

  public TeamsHierarchyLinksResponseMetaPage prevNumber(Long prevNumber) {
    this.prevNumber = JsonNullable.<Long>of(prevNumber);
    return this;
  }

  /**
   * Previous page number.
   *
   * @return prevNumber
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getPrevNumber() {
    return prevNumber.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PREV_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getPrevNumber_JsonNullable() {
    return prevNumber;
  }

  @JsonProperty(JSON_PROPERTY_PREV_NUMBER)
  public void setPrevNumber_JsonNullable(JsonNullable<Long> prevNumber) {
    this.prevNumber = prevNumber;
  }

  public void setPrevNumber(Long prevNumber) {
    this.prevNumber = JsonNullable.<Long>of(prevNumber);
  }

  public TeamsHierarchyLinksResponseMetaPage size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Page size.
   *
   * @return size
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public TeamsHierarchyLinksResponseMetaPage total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * Total number of results.
   *
   * @return total
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public TeamsHierarchyLinksResponseMetaPage type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Pagination type.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
   * @return TeamsHierarchyLinksResponseMetaPage
   */
  @JsonAnySetter
  public TeamsHierarchyLinksResponseMetaPage putAdditionalProperty(String key, Object value) {
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

  /** Return true if this TeamsHierarchyLinksResponseMetaPage object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TeamsHierarchyLinksResponseMetaPage teamsHierarchyLinksResponseMetaPage =
        (TeamsHierarchyLinksResponseMetaPage) o;
    return Objects.equals(this.firstNumber, teamsHierarchyLinksResponseMetaPage.firstNumber)
        && Objects.equals(this.lastNumber, teamsHierarchyLinksResponseMetaPage.lastNumber)
        && Objects.equals(this.nextNumber, teamsHierarchyLinksResponseMetaPage.nextNumber)
        && Objects.equals(this.number, teamsHierarchyLinksResponseMetaPage.number)
        && Objects.equals(this.prevNumber, teamsHierarchyLinksResponseMetaPage.prevNumber)
        && Objects.equals(this.size, teamsHierarchyLinksResponseMetaPage.size)
        && Objects.equals(this.total, teamsHierarchyLinksResponseMetaPage.total)
        && Objects.equals(this.type, teamsHierarchyLinksResponseMetaPage.type)
        && Objects.equals(
            this.additionalProperties, teamsHierarchyLinksResponseMetaPage.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        firstNumber,
        lastNumber,
        nextNumber,
        number,
        prevNumber,
        size,
        total,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TeamsHierarchyLinksResponseMetaPage {\n");
    sb.append("    firstNumber: ").append(toIndentedString(firstNumber)).append("\n");
    sb.append("    lastNumber: ").append(toIndentedString(lastNumber)).append("\n");
    sb.append("    nextNumber: ").append(toIndentedString(nextNumber)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    prevNumber: ").append(toIndentedString(prevNumber)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
