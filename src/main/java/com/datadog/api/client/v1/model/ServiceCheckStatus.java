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
 * The status of a service check. Set to <code>0</code> for OK, <code>1</code> for warning, <code>2
 * </code> for critical, and <code>3</code> for unknown.
 */
@JsonSerialize(using = ServiceCheckStatus.ServiceCheckStatusSerializer.class)
public class ServiceCheckStatus extends ModelEnum<Integer> {

  private static final Set<Integer> allowedValues = new HashSet<Integer>(Arrays.asList(0, 1, 2, 3));

  public static final ServiceCheckStatus OK = new ServiceCheckStatus(0);
  public static final ServiceCheckStatus WARNING = new ServiceCheckStatus(1);
  public static final ServiceCheckStatus CRITICAL = new ServiceCheckStatus(2);
  public static final ServiceCheckStatus UNKNOWN = new ServiceCheckStatus(3);

  ServiceCheckStatus(Integer value) {
    super(value, allowedValues);
  }

  public static class ServiceCheckStatusSerializer extends StdSerializer<ServiceCheckStatus> {
    public ServiceCheckStatusSerializer(Class<ServiceCheckStatus> t) {
      super(t);
    }

    public ServiceCheckStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(ServiceCheckStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceCheckStatus fromValue(Integer value) {
    return new ServiceCheckStatus(value);
  }
}
