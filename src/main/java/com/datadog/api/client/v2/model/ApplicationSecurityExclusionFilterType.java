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

/** The type of the resource. The value should always be <code>exclusion_filter</code>. */
@JsonSerialize(
    using =
        ApplicationSecurityExclusionFilterType.ApplicationSecurityExclusionFilterTypeSerializer
            .class)
public class ApplicationSecurityExclusionFilterType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("exclusion_filter"));

  public static final ApplicationSecurityExclusionFilterType EXCLUSION_FILTER =
      new ApplicationSecurityExclusionFilterType("exclusion_filter");

  ApplicationSecurityExclusionFilterType(String value) {
    super(value, allowedValues);
  }

  public static class ApplicationSecurityExclusionFilterTypeSerializer
      extends StdSerializer<ApplicationSecurityExclusionFilterType> {
    public ApplicationSecurityExclusionFilterTypeSerializer(
        Class<ApplicationSecurityExclusionFilterType> t) {
      super(t);
    }

    public ApplicationSecurityExclusionFilterTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ApplicationSecurityExclusionFilterType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ApplicationSecurityExclusionFilterType fromValue(String value) {
    return new ApplicationSecurityExclusionFilterType(value);
  }
}
