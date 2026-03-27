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
        ApplicationSecurityWafExclusionFilterOnMatch
            .ApplicationSecurityWafExclusionFilterOnMatchSerializer.class)
public class ApplicationSecurityWafExclusionFilterOnMatch extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("monitor"));

  public static final ApplicationSecurityWafExclusionFilterOnMatch MONITOR =
      new ApplicationSecurityWafExclusionFilterOnMatch("monitor");

  ApplicationSecurityWafExclusionFilterOnMatch(String value) {
    super(value, allowedValues);
  }

  public static class ApplicationSecurityWafExclusionFilterOnMatchSerializer
      extends StdSerializer<ApplicationSecurityWafExclusionFilterOnMatch> {
    public ApplicationSecurityWafExclusionFilterOnMatchSerializer(
        Class<ApplicationSecurityWafExclusionFilterOnMatch> t) {
      super(t);
    }

    public ApplicationSecurityWafExclusionFilterOnMatchSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ApplicationSecurityWafExclusionFilterOnMatch value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApplicationSecurityWafExclusionFilterOnMatch fromValue(String value) {
    return new ApplicationSecurityWafExclusionFilterOnMatch(value);
  }
}
