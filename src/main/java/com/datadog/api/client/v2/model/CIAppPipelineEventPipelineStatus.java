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

/** The final status of the pipeline. */
@JsonSerialize(
    using = CIAppPipelineEventPipelineStatus.CIAppPipelineEventPipelineStatusSerializer.class)
public class CIAppPipelineEventPipelineStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("success", "error", "canceled", "skipped", "blocked"));

  public static final CIAppPipelineEventPipelineStatus SUCCESS =
      new CIAppPipelineEventPipelineStatus("success");
  public static final CIAppPipelineEventPipelineStatus ERROR =
      new CIAppPipelineEventPipelineStatus("error");
  public static final CIAppPipelineEventPipelineStatus CANCELED =
      new CIAppPipelineEventPipelineStatus("canceled");
  public static final CIAppPipelineEventPipelineStatus SKIPPED =
      new CIAppPipelineEventPipelineStatus("skipped");
  public static final CIAppPipelineEventPipelineStatus BLOCKED =
      new CIAppPipelineEventPipelineStatus("blocked");

  CIAppPipelineEventPipelineStatus(String value) {
    super(value, allowedValues);
  }

  public static class CIAppPipelineEventPipelineStatusSerializer
      extends StdSerializer<CIAppPipelineEventPipelineStatus> {
    public CIAppPipelineEventPipelineStatusSerializer(Class<CIAppPipelineEventPipelineStatus> t) {
      super(t);
    }

    public CIAppPipelineEventPipelineStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CIAppPipelineEventPipelineStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CIAppPipelineEventPipelineStatus fromValue(String value) {
    return new CIAppPipelineEventPipelineStatus(value);
  }
}
