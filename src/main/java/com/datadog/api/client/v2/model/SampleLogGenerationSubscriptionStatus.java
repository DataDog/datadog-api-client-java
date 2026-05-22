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

/** The status of the subscription. */
@JsonSerialize(
    using =
        SampleLogGenerationSubscriptionStatus.SampleLogGenerationSubscriptionStatusSerializer.class)
public class SampleLogGenerationSubscriptionStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "subscribed",
              "renewed",
              "unsubscribed",
              "no_active_subscription",
              "not_available",
              "active",
              "expired"));

  public static final SampleLogGenerationSubscriptionStatus SUBSCRIBED =
      new SampleLogGenerationSubscriptionStatus("subscribed");
  public static final SampleLogGenerationSubscriptionStatus RENEWED =
      new SampleLogGenerationSubscriptionStatus("renewed");
  public static final SampleLogGenerationSubscriptionStatus UNSUBSCRIBED =
      new SampleLogGenerationSubscriptionStatus("unsubscribed");
  public static final SampleLogGenerationSubscriptionStatus NO_ACTIVE_SUBSCRIPTION =
      new SampleLogGenerationSubscriptionStatus("no_active_subscription");
  public static final SampleLogGenerationSubscriptionStatus NOT_AVAILABLE =
      new SampleLogGenerationSubscriptionStatus("not_available");
  public static final SampleLogGenerationSubscriptionStatus ACTIVE =
      new SampleLogGenerationSubscriptionStatus("active");
  public static final SampleLogGenerationSubscriptionStatus EXPIRED =
      new SampleLogGenerationSubscriptionStatus("expired");

  SampleLogGenerationSubscriptionStatus(String value) {
    super(value, allowedValues);
  }

  public static class SampleLogGenerationSubscriptionStatusSerializer
      extends StdSerializer<SampleLogGenerationSubscriptionStatus> {
    public SampleLogGenerationSubscriptionStatusSerializer(
        Class<SampleLogGenerationSubscriptionStatus> t) {
      super(t);
    }

    public SampleLogGenerationSubscriptionStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SampleLogGenerationSubscriptionStatus value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SampleLogGenerationSubscriptionStatus fromValue(String value) {
    return new SampleLogGenerationSubscriptionStatus(value);
  }
}
