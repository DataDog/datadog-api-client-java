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

/** The type of the suggested action resource. */
@JsonSerialize(
    using =
        SecurityMonitoringSignalSuggestedActionType
            .SecurityMonitoringSignalSuggestedActionTypeSerializer.class)
public class SecurityMonitoringSignalSuggestedActionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("investigation_log_queries", "recommended_blog_posts"));

  public static final SecurityMonitoringSignalSuggestedActionType INVESTIGATION_LOG_QUERIES =
      new SecurityMonitoringSignalSuggestedActionType("investigation_log_queries");
  public static final SecurityMonitoringSignalSuggestedActionType RECOMMENDED_BLOG_POSTS =
      new SecurityMonitoringSignalSuggestedActionType("recommended_blog_posts");

  SecurityMonitoringSignalSuggestedActionType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringSignalSuggestedActionTypeSerializer
      extends StdSerializer<SecurityMonitoringSignalSuggestedActionType> {
    public SecurityMonitoringSignalSuggestedActionTypeSerializer(
        Class<SecurityMonitoringSignalSuggestedActionType> t) {
      super(t);
    }

    public SecurityMonitoringSignalSuggestedActionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringSignalSuggestedActionType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringSignalSuggestedActionType fromValue(String value) {
    return new SecurityMonitoringSignalSuggestedActionType(value);
  }
}
