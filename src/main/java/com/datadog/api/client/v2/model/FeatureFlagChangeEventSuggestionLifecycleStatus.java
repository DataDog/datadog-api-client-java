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

/** Where the change request is in its lifecycle. */
@JsonSerialize(
    using =
        FeatureFlagChangeEventSuggestionLifecycleStatus
            .FeatureFlagChangeEventSuggestionLifecycleStatusSerializer.class)
public class FeatureFlagChangeEventSuggestionLifecycleStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pending", "approved", "applied", "rejected", "discarded"));

  public static final FeatureFlagChangeEventSuggestionLifecycleStatus PENDING =
      new FeatureFlagChangeEventSuggestionLifecycleStatus("pending");
  public static final FeatureFlagChangeEventSuggestionLifecycleStatus APPROVED =
      new FeatureFlagChangeEventSuggestionLifecycleStatus("approved");
  public static final FeatureFlagChangeEventSuggestionLifecycleStatus APPLIED =
      new FeatureFlagChangeEventSuggestionLifecycleStatus("applied");
  public static final FeatureFlagChangeEventSuggestionLifecycleStatus REJECTED =
      new FeatureFlagChangeEventSuggestionLifecycleStatus("rejected");
  public static final FeatureFlagChangeEventSuggestionLifecycleStatus DISCARDED =
      new FeatureFlagChangeEventSuggestionLifecycleStatus("discarded");

  FeatureFlagChangeEventSuggestionLifecycleStatus(String value) {
    super(value, allowedValues);
  }

  public static class FeatureFlagChangeEventSuggestionLifecycleStatusSerializer
      extends StdSerializer<FeatureFlagChangeEventSuggestionLifecycleStatus> {
    public FeatureFlagChangeEventSuggestionLifecycleStatusSerializer(
        Class<FeatureFlagChangeEventSuggestionLifecycleStatus> t) {
      super(t);
    }

    public FeatureFlagChangeEventSuggestionLifecycleStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FeatureFlagChangeEventSuggestionLifecycleStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FeatureFlagChangeEventSuggestionLifecycleStatus fromValue(String value) {
    return new FeatureFlagChangeEventSuggestionLifecycleStatus(value);
  }
}
