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

/** Kind of watch condition. */
@JsonSerialize(using = IssueWatchConditionKind.IssueWatchConditionKindSerializer.class)
public class IssueWatchConditionKind extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("OCCURRENCES", "CARDINALITY", "ELAPSED_TIME", "ANY", "ALL"));

  public static final IssueWatchConditionKind OCCURRENCES =
      new IssueWatchConditionKind("OCCURRENCES");
  public static final IssueWatchConditionKind CARDINALITY =
      new IssueWatchConditionKind("CARDINALITY");
  public static final IssueWatchConditionKind ELAPSED_TIME =
      new IssueWatchConditionKind("ELAPSED_TIME");
  public static final IssueWatchConditionKind ANY = new IssueWatchConditionKind("ANY");
  public static final IssueWatchConditionKind ALL = new IssueWatchConditionKind("ALL");

  IssueWatchConditionKind(String value) {
    super(value, allowedValues);
  }

  public static class IssueWatchConditionKindSerializer
      extends StdSerializer<IssueWatchConditionKind> {
    public IssueWatchConditionKindSerializer(Class<IssueWatchConditionKind> t) {
      super(t);
    }

    public IssueWatchConditionKindSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IssueWatchConditionKind value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IssueWatchConditionKind fromValue(String value) {
    return new IssueWatchConditionKind(value);
  }
}
