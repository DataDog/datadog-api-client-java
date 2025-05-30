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

/**
 * Whether a monitor is in draft or published state. Draft monitors do not notify recipients. Draft
 * monitors are currently in preview and the field is only processed for enabled customers. This
 * accepts the values <code>draft</code> and <code>published</code>. Defaults to published.
 */
@JsonSerialize(using = MonitorDraftStatus.MonitorDraftStatusSerializer.class)
public class MonitorDraftStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("draft", "published"));

  public static final MonitorDraftStatus DRAFT = new MonitorDraftStatus("draft");
  public static final MonitorDraftStatus PUBLISHED = new MonitorDraftStatus("published");

  MonitorDraftStatus(String value) {
    super(value, allowedValues);
  }

  public static class MonitorDraftStatusSerializer extends StdSerializer<MonitorDraftStatus> {
    public MonitorDraftStatusSerializer(Class<MonitorDraftStatus> t) {
      super(t);
    }

    public MonitorDraftStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(MonitorDraftStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MonitorDraftStatus fromValue(String value) {
    return new MonitorDraftStatus(value);
  }
}
