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
@JsonSerialize(using = IssueWatchType.IssueWatchTypeSerializer.class)
public class IssueWatchType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("error_tracking_issue_watch"));

  public static final IssueWatchType ERROR_TRACKING_ISSUE_WATCH =
      new IssueWatchType("error_tracking_issue_watch");

  IssueWatchType(String value) {
    super(value, allowedValues);
  }

  public static class IssueWatchTypeSerializer extends StdSerializer<IssueWatchType> {
    public IssueWatchTypeSerializer(Class<IssueWatchType> t) {
      super(t);
    }

    public IssueWatchTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(IssueWatchType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IssueWatchType fromValue(String value) {
    return new IssueWatchType(value);
  }
}
