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

/** The status of the campaign. */
@JsonSerialize(using = CampaignStatus.CampaignStatusSerializer.class)
public class CampaignStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("in_progress", "not_started", "completed"));

  public static final CampaignStatus IN_PROGRESS = new CampaignStatus("in_progress");
  public static final CampaignStatus NOT_STARTED = new CampaignStatus("not_started");
  public static final CampaignStatus COMPLETED = new CampaignStatus("completed");

  CampaignStatus(String value) {
    super(value, allowedValues);
  }

  public static class CampaignStatusSerializer extends StdSerializer<CampaignStatus> {
    public CampaignStatusSerializer(Class<CampaignStatus> t) {
      super(t);
    }

    public CampaignStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(CampaignStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CampaignStatus fromValue(String value) {
    return new CampaignStatus(value);
  }
}
