/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** Sorting options for AuthN Mappings. */
@JsonSerialize(using = AuthNMappingsSort.AuthNMappingsSortSerializer.class)
public class AuthNMappingsSort {

  public static final AuthNMappingsSort CREATED_AT_ASCENDING = new AuthNMappingsSort("created_at");
  public static final AuthNMappingsSort CREATED_AT_DESCENDING =
      new AuthNMappingsSort("-created_at");
  public static final AuthNMappingsSort ROLE_ID_ASCENDING = new AuthNMappingsSort("role_id");
  public static final AuthNMappingsSort ROLE_ID_DESCENDING = new AuthNMappingsSort("-role_id");
  public static final AuthNMappingsSort SAML_ASSERTION_ATTRIBUTE_ID_ASCENDING =
      new AuthNMappingsSort("saml_assertion_attribute_id");
  public static final AuthNMappingsSort SAML_ASSERTION_ATTRIBUTE_ID_DESCENDING =
      new AuthNMappingsSort("-saml_assertion_attribute_id");
  public static final AuthNMappingsSort ROLE_NAME_ASCENDING = new AuthNMappingsSort("role.name");
  public static final AuthNMappingsSort ROLE_NAME_DESCENDING = new AuthNMappingsSort("-role.name");
  public static final AuthNMappingsSort SAML_ASSERTION_ATTRIBUTE_KEY_ASCENDING =
      new AuthNMappingsSort("saml_assertion_attribute.attribute_key");
  public static final AuthNMappingsSort SAML_ASSERTION_ATTRIBUTE_KEY_DESCENDING =
      new AuthNMappingsSort("-saml_assertion_attribute.attribute_key");
  public static final AuthNMappingsSort SAML_ASSERTION_ATTRIBUTE_VALUE_ASCENDING =
      new AuthNMappingsSort("saml_assertion_attribute.attribute_value");
  public static final AuthNMappingsSort SAML_ASSERTION_ATTRIBUTE_VALUE_DESCENDING =
      new AuthNMappingsSort("-saml_assertion_attribute.attribute_value");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "created_at",
              "-created_at",
              "role_id",
              "-role_id",
              "saml_assertion_attribute_id",
              "-saml_assertion_attribute_id",
              "role.name",
              "-role.name",
              "saml_assertion_attribute.attribute_key",
              "-saml_assertion_attribute.attribute_key",
              "saml_assertion_attribute.attribute_value",
              "-saml_assertion_attribute.attribute_value"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  AuthNMappingsSort(String value) {
    this.value = value;
  }

  public static class AuthNMappingsSortSerializer extends StdSerializer<AuthNMappingsSort> {
    public AuthNMappingsSortSerializer(Class<AuthNMappingsSort> t) {
      super(t);
    }

    public AuthNMappingsSortSerializer() {
      this(null);
    }

    @Override
    public void serialize(AuthNMappingsSort value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this AuthNMappingsSort object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((AuthNMappingsSort) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static AuthNMappingsSort fromValue(String value) {
    return new AuthNMappingsSort(value);
  }
}
