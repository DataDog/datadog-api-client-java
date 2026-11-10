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

/**
 * Directory information about the employee associated with the device, sourced from a customer
 * reference table. Absent when no reference table is configured or the device has no match.
 */
@JsonPropertyOrder({
  DeviceEmployee.JSON_PROPERTY_CITY,
  DeviceEmployee.JSON_PROPERTY_COUNTRY,
  DeviceEmployee.JSON_PROPERTY_DEPARTMENT,
  DeviceEmployee.JSON_PROPERTY_EMAIL,
  DeviceEmployee.JSON_PROPERTY_NAME,
  DeviceEmployee.JSON_PROPERTY_OFFICE,
  DeviceEmployee.JSON_PROPERTY_TEAM
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class DeviceEmployee {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_DEPARTMENT = "department";
  private String department;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OFFICE = "office";
  private String office;

  public static final String JSON_PROPERTY_TEAM = "team";
  private String team;

  public DeviceEmployee city(String city) {
    this.city = city;
    return this;
  }

  /**
   * City where the employee is based.
   *
   * @return city
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public DeviceEmployee country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Country where the employee is based.
   *
   * @return country
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public DeviceEmployee department(String department) {
    this.department = department;
    return this;
  }

  /**
   * Department the employee belongs to.
   *
   * @return department
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPARTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public DeviceEmployee email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email address of the employee.
   *
   * @return email
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public DeviceEmployee name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Full name of the employee.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DeviceEmployee office(String office) {
    this.office = office;
    return this;
  }

  /**
   * Office the employee is assigned to.
   *
   * @return office
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OFFICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOffice() {
    return office;
  }

  public void setOffice(String office) {
    this.office = office;
  }

  public DeviceEmployee team(String team) {
    this.team = team;
    return this;
  }

  /**
   * Team the employee belongs to.
   *
   * @return team
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEAM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTeam() {
    return team;
  }

  public void setTeam(String team) {
    this.team = team;
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
   * @return DeviceEmployee
   */
  @JsonAnySetter
  public DeviceEmployee putAdditionalProperty(String key, Object value) {
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

  /** Return true if this DeviceEmployee object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceEmployee deviceEmployee = (DeviceEmployee) o;
    return Objects.equals(this.city, deviceEmployee.city)
        && Objects.equals(this.country, deviceEmployee.country)
        && Objects.equals(this.department, deviceEmployee.department)
        && Objects.equals(this.email, deviceEmployee.email)
        && Objects.equals(this.name, deviceEmployee.name)
        && Objects.equals(this.office, deviceEmployee.office)
        && Objects.equals(this.team, deviceEmployee.team)
        && Objects.equals(this.additionalProperties, deviceEmployee.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(city, country, department, email, name, office, team, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceEmployee {\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    office: ").append(toIndentedString(office)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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
