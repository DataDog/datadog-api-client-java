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

/** The lifecycle status of the suggestion. */
@JsonSerialize(
    using =
        FeatureFlagSuggestionAttributesLifecycleStatus
            .FeatureFlagSuggestionAttributesLifecycleStatusSerializer.class)
public class FeatureFlagSuggestionAttributesLifecycleStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pending", "approved", "applied", "rejected", "discarded"));

  public static final FeatureFlagSuggestionAttributesLifecycleStatus PENDING =
      new FeatureFlagSuggestionAttributesLifecycleStatus("pending");
  public static final FeatureFlagSuggestionAttributesLifecycleStatus APPROVED =
      new FeatureFlagSuggestionAttributesLifecycleStatus("approved");
  public static final FeatureFlagSuggestionAttributesLifecycleStatus APPLIED =
      new FeatureFlagSuggestionAttributesLifecycleStatus("applied");
  public static final FeatureFlagSuggestionAttributesLifecycleStatus REJECTED =
      new FeatureFlagSuggestionAttributesLifecycleStatus("rejected");
  public static final FeatureFlagSuggestionAttributesLifecycleStatus DISCARDED =
      new FeatureFlagSuggestionAttributesLifecycleStatus("discarded");

  FeatureFlagSuggestionAttributesLifecycleStatus(String value) {
    super(value, allowedValues);
  }

  public static class FeatureFlagSuggestionAttributesLifecycleStatusSerializer
      extends StdSerializer<FeatureFlagSuggestionAttributesLifecycleStatus> {
    public FeatureFlagSuggestionAttributesLifecycleStatusSerializer(
        Class<FeatureFlagSuggestionAttributesLifecycleStatus> t) {
      super(t);
    }

    public FeatureFlagSuggestionAttributesLifecycleStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FeatureFlagSuggestionAttributesLifecycleStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FeatureFlagSuggestionAttributesLifecycleStatus fromValue(String value) {
    return new FeatureFlagSuggestionAttributesLifecycleStatus(value);
  }
}
