/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Version of the query for the logs transaction stream widget. When omitted, v1 query behavior is
 * preserved. Set to <code>sequential_query</code> to use v2 behavior. <strong>This feature is in
 * Preview.</strong>
 */
@JsonSerialize(using = ListStreamQueryVersion.ListStreamQueryVersionSerializer.class)
public class ListStreamQueryVersion extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("sequential_query"));

  public static final ListStreamQueryVersion SEQUENTIAL_QUERY =
      new ListStreamQueryVersion("sequential_query");

  ListStreamQueryVersion(String value) {
    super(value, allowedValues);
  }

  public static class ListStreamQueryVersionSerializer
      extends StdSerializer<ListStreamQueryVersion> {
    public ListStreamQueryVersionSerializer(Class<ListStreamQueryVersion> t) {
      super(t);
    }

    public ListStreamQueryVersionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ListStreamQueryVersion value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ListStreamQueryVersion fromValue(String value) {
    return new ListStreamQueryVersion(value);
  }
}
