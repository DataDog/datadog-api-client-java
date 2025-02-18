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
 * The action taken when the exclusion filter matches. When set to <code>monitor</code>, security
 * traces are emitted but the requests are not blocked. By default, security traces are not emitted
 * and the requests are not blocked.
 */
@JsonSerialize(
    using =
        ApplicationSecurityExclusionFilterOnMatch
            .ApplicationSecurityExclusionFilterOnMatchSerializer.class)
public class ApplicationSecurityExclusionFilterOnMatch extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("monitor"));

  public static final ApplicationSecurityExclusionFilterOnMatch MONITOR =
      new ApplicationSecurityExclusionFilterOnMatch("monitor");

  ApplicationSecurityExclusionFilterOnMatch(String value) {
    super(value, allowedValues);
  }

  public static class ApplicationSecurityExclusionFilterOnMatchSerializer
      extends StdSerializer<ApplicationSecurityExclusionFilterOnMatch> {
    public ApplicationSecurityExclusionFilterOnMatchSerializer(
        Class<ApplicationSecurityExclusionFilterOnMatch> t) {
      super(t);
    }

    public ApplicationSecurityExclusionFilterOnMatchSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ApplicationSecurityExclusionFilterOnMatch value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApplicationSecurityExclusionFilterOnMatch fromValue(String value) {
    return new ApplicationSecurityExclusionFilterOnMatch(value);
  }
}
