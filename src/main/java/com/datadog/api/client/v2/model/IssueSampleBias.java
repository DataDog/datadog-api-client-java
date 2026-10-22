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

/**
 * Criterion used to pick a sample. <code>latest</code> picks the most recent error. <code>
 * git_metadata</code> picks the most recent error with source code metadata, whose stack trace is
 * parsed. <code>trace</code> picks the most recent error with an APM trace. <code>session_replay
 * </code> picks the most recent error with a RUM session replay. <code>exception_replay</code>
 * picks the most recent error with an Exception Replay snapshot.
 */
@JsonSerialize(using = IssueSampleBias.IssueSampleBiasSerializer.class)
public class IssueSampleBias extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("latest", "git_metadata", "trace", "session_replay", "exception_replay"));

  public static final IssueSampleBias LATEST = new IssueSampleBias("latest");
  public static final IssueSampleBias GIT_METADATA = new IssueSampleBias("git_metadata");
  public static final IssueSampleBias TRACE = new IssueSampleBias("trace");
  public static final IssueSampleBias SESSION_REPLAY = new IssueSampleBias("session_replay");
  public static final IssueSampleBias EXCEPTION_REPLAY = new IssueSampleBias("exception_replay");

  IssueSampleBias(String value) {
    super(value, allowedValues);
  }

  public static class IssueSampleBiasSerializer extends StdSerializer<IssueSampleBias> {
    public IssueSampleBiasSerializer(Class<IssueSampleBias> t) {
      super(t);
    }

    public IssueSampleBiasSerializer() {
      this(null);
    }

    @Override
    public void serialize(IssueSampleBias value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IssueSampleBias fromValue(String value) {
    return new IssueSampleBias(value);
  }
}
