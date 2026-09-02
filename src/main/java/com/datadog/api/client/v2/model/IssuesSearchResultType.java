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

/** Type of the object. */
@JsonSerialize(using = IssuesSearchResultType.IssuesSearchResultTypeSerializer.class)
public class IssuesSearchResultType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("error_tracking_search_result"));

  public static final IssuesSearchResultType ERROR_TRACKING_SEARCH_RESULT =
      new IssuesSearchResultType("error_tracking_search_result");

  IssuesSearchResultType(String value) {
    super(value, allowedValues);
  }

  public static class IssuesSearchResultTypeSerializer
      extends StdSerializer<IssuesSearchResultType> {
    public IssuesSearchResultTypeSerializer(Class<IssuesSearchResultType> t) {
      super(t);
    }

    public IssuesSearchResultTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IssuesSearchResultType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IssuesSearchResultType fromValue(String value) {
    return new IssuesSearchResultType(value);
  }
}
