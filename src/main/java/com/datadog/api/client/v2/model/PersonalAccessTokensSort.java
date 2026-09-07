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

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>Sorting options</p>
 */
@JsonSerialize(using = PersonalAccessTokensSort.PersonalAccessTokensSortSerializer.class)
public class PersonalAccessTokensSort extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("name", "-name", "created_at", "-created_at", "expires_at", "-expires_at", "last_used_at", "-last_used_at"));

  public static final PersonalAccessTokensSort NAME_ASCENDING = new PersonalAccessTokensSort("name");
  public static final PersonalAccessTokensSort NAME_DESCENDING = new PersonalAccessTokensSort("-name");
  public static final PersonalAccessTokensSort CREATED_AT_ASCENDING = new PersonalAccessTokensSort("created_at");
  public static final PersonalAccessTokensSort CREATED_AT_DESCENDING = new PersonalAccessTokensSort("-created_at");
  public static final PersonalAccessTokensSort EXPIRES_AT_ASCENDING = new PersonalAccessTokensSort("expires_at");
  public static final PersonalAccessTokensSort EXPIRES_AT_DESCENDING = new PersonalAccessTokensSort("-expires_at");
  public static final PersonalAccessTokensSort LAST_USED_AT_ASCENDING = new PersonalAccessTokensSort("last_used_at");
  public static final PersonalAccessTokensSort LAST_USED_AT_DESCENDING = new PersonalAccessTokensSort("-last_used_at");


  PersonalAccessTokensSort(String value) {
    super(value, allowedValues);
  }

  public static class PersonalAccessTokensSortSerializer extends StdSerializer<PersonalAccessTokensSort> {
      public PersonalAccessTokensSortSerializer(Class<PersonalAccessTokensSort> t) {
          super(t);
      }

      public PersonalAccessTokensSortSerializer() {
          this(null);
      }

      @Override
      public void serialize(PersonalAccessTokensSort value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static PersonalAccessTokensSort fromValue(String value) {
    return new PersonalAccessTokensSort(value);
  }
}
