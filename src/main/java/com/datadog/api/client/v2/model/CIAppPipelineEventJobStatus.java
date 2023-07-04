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

/** The final status of the job. */
@JsonSerialize(using = CIAppPipelineEventJobStatus.CIAppPipelineEventJobStatusSerializer.class)
public class CIAppPipelineEventJobStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("success", "error", "canceled", "skipped"));

  public static final CIAppPipelineEventJobStatus SUCCESS =
      new CIAppPipelineEventJobStatus("success");
  public static final CIAppPipelineEventJobStatus ERROR = new CIAppPipelineEventJobStatus("error");
  public static final CIAppPipelineEventJobStatus CANCELED =
      new CIAppPipelineEventJobStatus("canceled");
  public static final CIAppPipelineEventJobStatus SKIPPED =
      new CIAppPipelineEventJobStatus("skipped");

  CIAppPipelineEventJobStatus(String value) {
    super(value, allowedValues);
  }

  public static class CIAppPipelineEventJobStatusSerializer
      extends StdSerializer<CIAppPipelineEventJobStatus> {
    public CIAppPipelineEventJobStatusSerializer(Class<CIAppPipelineEventJobStatus> t) {
      super(t);
    }

    public CIAppPipelineEventJobStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CIAppPipelineEventJobStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CIAppPipelineEventJobStatus fromValue(String value) {
    return new CIAppPipelineEventJobStatus(value);
  }
}
