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
@JsonSerialize(using = IssuePullRequestType.IssuePullRequestTypeSerializer.class)
public class IssuePullRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("error_tracking_pull_request"));

  public static final IssuePullRequestType ERROR_TRACKING_PULL_REQUEST =
      new IssuePullRequestType("error_tracking_pull_request");

  IssuePullRequestType(String value) {
    super(value, allowedValues);
  }

  public static class IssuePullRequestTypeSerializer extends StdSerializer<IssuePullRequestType> {
    public IssuePullRequestTypeSerializer(Class<IssuePullRequestType> t) {
      super(t);
    }

    public IssuePullRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IssuePullRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IssuePullRequestType fromValue(String value) {
    return new IssuePullRequestType(value);
  }
}
