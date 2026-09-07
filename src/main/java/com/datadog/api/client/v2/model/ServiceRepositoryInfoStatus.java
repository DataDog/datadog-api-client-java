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

/** The status of the service repository info lookup. */
@JsonSerialize(using = ServiceRepositoryInfoStatus.ServiceRepositoryInfoStatusSerializer.class)
public class ServiceRepositoryInfoStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("success", "not_found", "no_repository", "internal_error", "unknown"));

  public static final ServiceRepositoryInfoStatus SUCCESS =
      new ServiceRepositoryInfoStatus("success");
  public static final ServiceRepositoryInfoStatus NOT_FOUND =
      new ServiceRepositoryInfoStatus("not_found");
  public static final ServiceRepositoryInfoStatus NO_REPOSITORY =
      new ServiceRepositoryInfoStatus("no_repository");
  public static final ServiceRepositoryInfoStatus INTERNAL_ERROR =
      new ServiceRepositoryInfoStatus("internal_error");
  public static final ServiceRepositoryInfoStatus UNKNOWN =
      new ServiceRepositoryInfoStatus("unknown");

  ServiceRepositoryInfoStatus(String value) {
    super(value, allowedValues);
  }

  public static class ServiceRepositoryInfoStatusSerializer
      extends StdSerializer<ServiceRepositoryInfoStatus> {
    public ServiceRepositoryInfoStatusSerializer(Class<ServiceRepositoryInfoStatus> t) {
      super(t);
    }

    public ServiceRepositoryInfoStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ServiceRepositoryInfoStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ServiceRepositoryInfoStatus fromValue(String value) {
    return new ServiceRepositoryInfoStatus(value);
  }
}
