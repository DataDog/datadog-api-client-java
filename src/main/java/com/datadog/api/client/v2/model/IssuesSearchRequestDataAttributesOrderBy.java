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
   * <p>The attribute to sort the search results by.</p>
 */
@JsonSerialize(using = IssuesSearchRequestDataAttributesOrderBy.IssuesSearchRequestDataAttributesOrderBySerializer.class)
public class IssuesSearchRequestDataAttributesOrderBy extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("TOTAL_COUNT", "FIRST_SEEN", "IMPACTED_SESSIONS", "PRIORITY"));

  public static final IssuesSearchRequestDataAttributesOrderBy TOTAL_COUNT = new IssuesSearchRequestDataAttributesOrderBy("TOTAL_COUNT");
  public static final IssuesSearchRequestDataAttributesOrderBy FIRST_SEEN = new IssuesSearchRequestDataAttributesOrderBy("FIRST_SEEN");
  public static final IssuesSearchRequestDataAttributesOrderBy IMPACTED_SESSIONS = new IssuesSearchRequestDataAttributesOrderBy("IMPACTED_SESSIONS");
  public static final IssuesSearchRequestDataAttributesOrderBy PRIORITY = new IssuesSearchRequestDataAttributesOrderBy("PRIORITY");


  IssuesSearchRequestDataAttributesOrderBy(String value) {
    super(value, allowedValues);
  }

  public static class IssuesSearchRequestDataAttributesOrderBySerializer extends StdSerializer<IssuesSearchRequestDataAttributesOrderBy> {
      public IssuesSearchRequestDataAttributesOrderBySerializer(Class<IssuesSearchRequestDataAttributesOrderBy> t) {
          super(t);
      }

      public IssuesSearchRequestDataAttributesOrderBySerializer() {
          this(null);
      }

      @Override
      public void serialize(IssuesSearchRequestDataAttributesOrderBy value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static IssuesSearchRequestDataAttributesOrderBy fromValue(String value) {
    return new IssuesSearchRequestDataAttributesOrderBy(value);
  }
}
