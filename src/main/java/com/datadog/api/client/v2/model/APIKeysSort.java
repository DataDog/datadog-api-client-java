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
@JsonSerialize(using = APIKeysSort.APIKeysSortSerializer.class)
public class APIKeysSort extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("created_at", "-created_at", "last4", "-last4", "modified_at", "-modified_at", "name", "-name"));

  public static final APIKeysSort CREATED_AT_ASCENDING = new APIKeysSort("created_at");
  public static final APIKeysSort CREATED_AT_DESCENDING = new APIKeysSort("-created_at");
  public static final APIKeysSort LAST4_ASCENDING = new APIKeysSort("last4");
  public static final APIKeysSort LAST4_DESCENDING = new APIKeysSort("-last4");
  public static final APIKeysSort MODIFIED_AT_ASCENDING = new APIKeysSort("modified_at");
  public static final APIKeysSort MODIFIED_AT_DESCENDING = new APIKeysSort("-modified_at");
  public static final APIKeysSort NAME_ASCENDING = new APIKeysSort("name");
  public static final APIKeysSort NAME_DESCENDING = new APIKeysSort("-name");


  APIKeysSort(String value) {
    super(value, allowedValues);
  }

  public static class APIKeysSortSerializer extends StdSerializer<APIKeysSort> {
      public APIKeysSortSerializer(Class<APIKeysSort> t) {
          super(t);
      }

      public APIKeysSortSerializer() {
          this(null);
      }

      @Override
      public void serialize(APIKeysSort value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static APIKeysSort fromValue(String value) {
    return new APIKeysSort(value);
  }
}
