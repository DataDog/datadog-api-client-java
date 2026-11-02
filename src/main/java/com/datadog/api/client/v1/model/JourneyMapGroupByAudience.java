/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Audience the group by facet is read from. */
@JsonSerialize(using = JourneyMapGroupByAudience.JourneyMapGroupByAudienceSerializer.class)
public class JourneyMapGroupByAudience extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "product_analytics_audience_filters.users",
              "product_analytics_audience_filters.accounts"));

  public static final JourneyMapGroupByAudience USERS =
      new JourneyMapGroupByAudience("product_analytics_audience_filters.users");
  public static final JourneyMapGroupByAudience ACCOUNTS =
      new JourneyMapGroupByAudience("product_analytics_audience_filters.accounts");

  JourneyMapGroupByAudience(String value) {
    super(value, allowedValues);
  }

  public static class JourneyMapGroupByAudienceSerializer
      extends StdSerializer<JourneyMapGroupByAudience> {
    public JourneyMapGroupByAudienceSerializer(Class<JourneyMapGroupByAudience> t) {
      super(t);
    }

    public JourneyMapGroupByAudienceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        JourneyMapGroupByAudience value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static JourneyMapGroupByAudience fromValue(String value) {
    return new JourneyMapGroupByAudience(value);
  }
}
