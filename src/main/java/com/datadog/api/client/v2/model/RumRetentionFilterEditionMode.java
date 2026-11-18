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
 * The types of changes the retention filter accepts. <code>complete</code> filters can be updated
 * and deleted. <code>limited</code> filters are default retention filters that can't be deleted.
 */
@JsonSerialize(using = RumRetentionFilterEditionMode.RumRetentionFilterEditionModeSerializer.class)
public class RumRetentionFilterEditionMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("unknown", "complete", "limited"));

  public static final RumRetentionFilterEditionMode UNKNOWN =
      new RumRetentionFilterEditionMode("unknown");
  public static final RumRetentionFilterEditionMode COMPLETE =
      new RumRetentionFilterEditionMode("complete");
  public static final RumRetentionFilterEditionMode LIMITED =
      new RumRetentionFilterEditionMode("limited");

  RumRetentionFilterEditionMode(String value) {
    super(value, allowedValues);
  }

  public static class RumRetentionFilterEditionModeSerializer
      extends StdSerializer<RumRetentionFilterEditionMode> {
    public RumRetentionFilterEditionModeSerializer(Class<RumRetentionFilterEditionMode> t) {
      super(t);
    }

    public RumRetentionFilterEditionModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RumRetentionFilterEditionMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RumRetentionFilterEditionMode fromValue(String value) {
    return new RumRetentionFilterEditionMode(value);
  }
}
