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
 * The status of your Synthetic monitor. * <code>O</code> for not triggered * <code>1</code> for
 * triggered * <code>2</code> for no data
 */
@JsonSerialize(using = SyntheticsTestMonitorStatus.SyntheticsTestMonitorStatusSerializer.class)
public class SyntheticsTestMonitorStatus extends ModelEnum<Long> {

  private static final Set<Long> allowedValues = new HashSet<Long>(Arrays.asList(0l, 1l, 2l));

  public static final SyntheticsTestMonitorStatus UNTRIGGERED = new SyntheticsTestMonitorStatus(0l);
  public static final SyntheticsTestMonitorStatus TRIGGERED = new SyntheticsTestMonitorStatus(1l);
  public static final SyntheticsTestMonitorStatus NO_DATA = new SyntheticsTestMonitorStatus(2l);

  SyntheticsTestMonitorStatus(Long value) {
    super(value, allowedValues);
  }

  public static class SyntheticsTestMonitorStatusSerializer
      extends StdSerializer<SyntheticsTestMonitorStatus> {
    public SyntheticsTestMonitorStatusSerializer(Class<SyntheticsTestMonitorStatus> t) {
      super(t);
    }

    public SyntheticsTestMonitorStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsTestMonitorStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsTestMonitorStatus fromValue(Long value) {
    return new SyntheticsTestMonitorStatus(value);
  }
}
