/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(using = IssueStreamOrderingKey.IssueStreamOrderingKeySerializer.class)
public class IssueStreamOrderingKey extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "TOTAL_COUNT", "FIRST_SEEN", "IMPACTED_SESSIONS", "IMPACTED_ACCOUNTS", "PRIORITY"));

  public static final IssueStreamOrderingKey TOTAL_COUNT =
      new IssueStreamOrderingKey("TOTAL_COUNT");
  public static final IssueStreamOrderingKey FIRST_SEEN = new IssueStreamOrderingKey("FIRST_SEEN");
  public static final IssueStreamOrderingKey IMPACTED_SESSIONS =
      new IssueStreamOrderingKey("IMPACTED_SESSIONS");
  public static final IssueStreamOrderingKey IMPACTED_ACCOUNTS =
      new IssueStreamOrderingKey("IMPACTED_ACCOUNTS");
  public static final IssueStreamOrderingKey PRIORITY = new IssueStreamOrderingKey("PRIORITY");

  IssueStreamOrderingKey(String value) {
    super(value, allowedValues);
  }

  public static class IssueStreamOrderingKeySerializer
      extends StdSerializer<IssueStreamOrderingKey> {
    public IssueStreamOrderingKeySerializer(Class<IssueStreamOrderingKey> t) {
      super(t);
    }

    public IssueStreamOrderingKeySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IssueStreamOrderingKey value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IssueStreamOrderingKey fromValue(String value) {
    return new IssueStreamOrderingKey(value);
  }
}
