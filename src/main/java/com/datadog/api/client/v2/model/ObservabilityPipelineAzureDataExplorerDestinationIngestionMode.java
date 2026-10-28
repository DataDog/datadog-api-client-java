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
 * The ingestion method used to send data to Azure Data Explorer.
 *
 * <ul>
 *   <li><code>streaming</code>: Sends events directly to the table using streaming ingestion.
 *   <li><code>queue</code>: Sends events through queued (batched) ingestion.
 * </ul>
 *
 * <p>Defaults to <code>streaming</code>.
 */
@JsonSerialize(
    using =
        ObservabilityPipelineAzureDataExplorerDestinationIngestionMode
            .ObservabilityPipelineAzureDataExplorerDestinationIngestionModeSerializer.class)
public class ObservabilityPipelineAzureDataExplorerDestinationIngestionMode
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("streaming", "queue"));

  public static final ObservabilityPipelineAzureDataExplorerDestinationIngestionMode STREAMING =
      new ObservabilityPipelineAzureDataExplorerDestinationIngestionMode("streaming");
  public static final ObservabilityPipelineAzureDataExplorerDestinationIngestionMode QUEUE =
      new ObservabilityPipelineAzureDataExplorerDestinationIngestionMode("queue");

  ObservabilityPipelineAzureDataExplorerDestinationIngestionMode(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineAzureDataExplorerDestinationIngestionModeSerializer
      extends StdSerializer<ObservabilityPipelineAzureDataExplorerDestinationIngestionMode> {
    public ObservabilityPipelineAzureDataExplorerDestinationIngestionModeSerializer(
        Class<ObservabilityPipelineAzureDataExplorerDestinationIngestionMode> t) {
      super(t);
    }

    public ObservabilityPipelineAzureDataExplorerDestinationIngestionModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineAzureDataExplorerDestinationIngestionMode value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineAzureDataExplorerDestinationIngestionMode fromValue(
      String value) {
    return new ObservabilityPipelineAzureDataExplorerDestinationIngestionMode(value);
  }
}
