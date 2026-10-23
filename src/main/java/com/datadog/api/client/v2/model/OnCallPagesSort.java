/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** Sorting options for pages. Prefix a field with <code>-</code> to sort in descending order. */
@JsonSerialize(using = OnCallPagesSort.OnCallPagesSortSerializer.class)
public class OnCallPagesSort extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "created_at",
              "-created_at",
              "modified_at",
              "-modified_at",
              "status",
              "-status",
              "priority",
              "-priority"));

  public static final OnCallPagesSort CREATED_AT_ASCENDING = new OnCallPagesSort("created_at");
  public static final OnCallPagesSort CREATED_AT_DESCENDING = new OnCallPagesSort("-created_at");
  public static final OnCallPagesSort MODIFIED_AT_ASCENDING = new OnCallPagesSort("modified_at");
  public static final OnCallPagesSort MODIFIED_AT_DESCENDING = new OnCallPagesSort("-modified_at");
  public static final OnCallPagesSort STATUS_ASCENDING = new OnCallPagesSort("status");
  public static final OnCallPagesSort STATUS_DESCENDING = new OnCallPagesSort("-status");
  public static final OnCallPagesSort PRIORITY_ASCENDING = new OnCallPagesSort("priority");
  public static final OnCallPagesSort PRIORITY_DESCENDING = new OnCallPagesSort("-priority");

  OnCallPagesSort(String value) {
    super(value, allowedValues);
  }

  public static class OnCallPagesSortSerializer extends StdSerializer<OnCallPagesSort> {
    public OnCallPagesSortSerializer(Class<OnCallPagesSort> t) {
      super(t);
    }

    public OnCallPagesSortSerializer() {
      this(null);
    }

    @Override
    public void serialize(OnCallPagesSort value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OnCallPagesSort fromValue(String value) {
    return new OnCallPagesSort(value);
  }
}
