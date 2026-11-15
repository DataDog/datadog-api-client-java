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
 * Where the digest is sent. <code>slack</code> requires <code>workspace_id</code> and <code>
 * channel_id</code>; <code>teams</code> requires the <code>teams_*</code> attributes. Defaults to
 * <code>slack</code>.
 */
@JsonSerialize(
    using =
        CostRecommendationNotificationRuleDestinationType
            .CostRecommendationNotificationRuleDestinationTypeSerializer.class)
public class CostRecommendationNotificationRuleDestinationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("slack", "teams"));

  public static final CostRecommendationNotificationRuleDestinationType SLACK =
      new CostRecommendationNotificationRuleDestinationType("slack");
  public static final CostRecommendationNotificationRuleDestinationType TEAMS =
      new CostRecommendationNotificationRuleDestinationType("teams");

  CostRecommendationNotificationRuleDestinationType(String value) {
    super(value, allowedValues);
  }

  public static class CostRecommendationNotificationRuleDestinationTypeSerializer
      extends StdSerializer<CostRecommendationNotificationRuleDestinationType> {
    public CostRecommendationNotificationRuleDestinationTypeSerializer(
        Class<CostRecommendationNotificationRuleDestinationType> t) {
      super(t);
    }

    public CostRecommendationNotificationRuleDestinationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CostRecommendationNotificationRuleDestinationType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CostRecommendationNotificationRuleDestinationType fromValue(String value) {
    return new CostRecommendationNotificationRuleDestinationType(value);
  }
}
