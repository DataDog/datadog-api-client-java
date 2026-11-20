/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.datadog.api.client.AbstractOpenApiSchema;
import com.datadog.api.client.JSON;
import com.datadog.api.client.UnparsedObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import jakarta.ws.rs.core.GenericType;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(using = ListStreamRequest.ListStreamRequestDeserializer.class)
@JsonSerialize(using = ListStreamRequest.ListStreamRequestSerializer.class)
public class ListStreamRequest extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(ListStreamRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class ListStreamRequestSerializer extends StdSerializer<ListStreamRequest> {
    public ListStreamRequestSerializer(Class<ListStreamRequest> t) {
      super(t);
    }

    public ListStreamRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(ListStreamRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class ListStreamRequestDeserializer extends StdDeserializer<ListStreamRequest> {
    public ListStreamRequestDeserializer() {
      this(ListStreamRequest.class);
    }

    public ListStreamRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public ListStreamRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize EventsListStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (EventsListStreamRequest.class.equals(Integer.class)
            || EventsListStreamRequest.class.equals(Long.class)
            || EventsListStreamRequest.class.equals(Float.class)
            || EventsListStreamRequest.class.equals(Double.class)
            || EventsListStreamRequest.class.equals(Boolean.class)
            || EventsListStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((EventsListStreamRequest.class.equals(Integer.class)
                        || EventsListStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((EventsListStreamRequest.class.equals(Float.class)
                        || EventsListStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (EventsListStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (EventsListStreamRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(EventsListStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((EventsListStreamRequest) tmp).unparsed
              && !(((EventsListStreamRequest) tmp).getActualInstance() instanceof UnparsedObject)) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'EventsListStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'EventsListStreamRequest'", e);
      }

      // deserialize IssueStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (IssueStreamRequest.class.equals(Integer.class)
            || IssueStreamRequest.class.equals(Long.class)
            || IssueStreamRequest.class.equals(Float.class)
            || IssueStreamRequest.class.equals(Double.class)
            || IssueStreamRequest.class.equals(Boolean.class)
            || IssueStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((IssueStreamRequest.class.equals(Integer.class)
                        || IssueStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((IssueStreamRequest.class.equals(Float.class)
                        || IssueStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (IssueStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (IssueStreamRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(IssueStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((IssueStreamRequest) tmp).unparsed
              && !(((IssueStreamRequest) tmp).getActualInstance() instanceof UnparsedObject)) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'IssueStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'IssueStreamRequest'", e);
      }

      // deserialize CaseStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (CaseStreamRequest.class.equals(Integer.class)
            || CaseStreamRequest.class.equals(Long.class)
            || CaseStreamRequest.class.equals(Float.class)
            || CaseStreamRequest.class.equals(Double.class)
            || CaseStreamRequest.class.equals(Boolean.class)
            || CaseStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((CaseStreamRequest.class.equals(Integer.class)
                        || CaseStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((CaseStreamRequest.class.equals(Float.class)
                        || CaseStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (CaseStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (CaseStreamRequest.class.equals(String.class) && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(CaseStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((CaseStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'CaseStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'CaseStreamRequest'", e);
      }

      // deserialize WatchdogAlertsRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (WatchdogAlertsRequest.class.equals(Integer.class)
            || WatchdogAlertsRequest.class.equals(Long.class)
            || WatchdogAlertsRequest.class.equals(Float.class)
            || WatchdogAlertsRequest.class.equals(Double.class)
            || WatchdogAlertsRequest.class.equals(Boolean.class)
            || WatchdogAlertsRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((WatchdogAlertsRequest.class.equals(Integer.class)
                        || WatchdogAlertsRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((WatchdogAlertsRequest.class.equals(Float.class)
                        || WatchdogAlertsRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (WatchdogAlertsRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (WatchdogAlertsRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(WatchdogAlertsRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((WatchdogAlertsRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'WatchdogAlertsRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'WatchdogAlertsRequest'", e);
      }

      // deserialize IncidentsStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (IncidentsStreamRequest.class.equals(Integer.class)
            || IncidentsStreamRequest.class.equals(Long.class)
            || IncidentsStreamRequest.class.equals(Float.class)
            || IncidentsStreamRequest.class.equals(Double.class)
            || IncidentsStreamRequest.class.equals(Boolean.class)
            || IncidentsStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((IncidentsStreamRequest.class.equals(Integer.class)
                        || IncidentsStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((IncidentsStreamRequest.class.equals(Float.class)
                        || IncidentsStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (IncidentsStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (IncidentsStreamRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(IncidentsStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((IncidentsStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'IncidentsStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'IncidentsStreamRequest'", e);
      }

      // deserialize DatabaseRecommendationsStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DatabaseRecommendationsStreamRequest.class.equals(Integer.class)
            || DatabaseRecommendationsStreamRequest.class.equals(Long.class)
            || DatabaseRecommendationsStreamRequest.class.equals(Float.class)
            || DatabaseRecommendationsStreamRequest.class.equals(Double.class)
            || DatabaseRecommendationsStreamRequest.class.equals(Boolean.class)
            || DatabaseRecommendationsStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DatabaseRecommendationsStreamRequest.class.equals(Integer.class)
                        || DatabaseRecommendationsStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DatabaseRecommendationsStreamRequest.class.equals(Float.class)
                        || DatabaseRecommendationsStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DatabaseRecommendationsStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DatabaseRecommendationsStreamRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec()).readValueAs(DatabaseRecommendationsStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DatabaseRecommendationsStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DatabaseRecommendationsStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DatabaseRecommendationsStreamRequest'",
            e);
      }

      // deserialize ApmRecommendationsStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (ApmRecommendationsStreamRequest.class.equals(Integer.class)
            || ApmRecommendationsStreamRequest.class.equals(Long.class)
            || ApmRecommendationsStreamRequest.class.equals(Float.class)
            || ApmRecommendationsStreamRequest.class.equals(Double.class)
            || ApmRecommendationsStreamRequest.class.equals(Boolean.class)
            || ApmRecommendationsStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((ApmRecommendationsStreamRequest.class.equals(Integer.class)
                        || ApmRecommendationsStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((ApmRecommendationsStreamRequest.class.equals(Float.class)
                        || ApmRecommendationsStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (ApmRecommendationsStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (ApmRecommendationsStreamRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(ApmRecommendationsStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((ApmRecommendationsStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'ApmRecommendationsStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'ApmRecommendationsStreamRequest'", e);
      }

      // deserialize DetectionRuleStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DetectionRuleStreamRequest.class.equals(Integer.class)
            || DetectionRuleStreamRequest.class.equals(Long.class)
            || DetectionRuleStreamRequest.class.equals(Float.class)
            || DetectionRuleStreamRequest.class.equals(Double.class)
            || DetectionRuleStreamRequest.class.equals(Boolean.class)
            || DetectionRuleStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DetectionRuleStreamRequest.class.equals(Integer.class)
                        || DetectionRuleStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DetectionRuleStreamRequest.class.equals(Float.class)
                        || DetectionRuleStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DetectionRuleStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DetectionRuleStreamRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DetectionRuleStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DetectionRuleStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DetectionRuleStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DetectionRuleStreamRequest'", e);
      }

      // deserialize DataObservabilityAssetsRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DataObservabilityAssetsRequest.class.equals(Integer.class)
            || DataObservabilityAssetsRequest.class.equals(Long.class)
            || DataObservabilityAssetsRequest.class.equals(Float.class)
            || DataObservabilityAssetsRequest.class.equals(Double.class)
            || DataObservabilityAssetsRequest.class.equals(Boolean.class)
            || DataObservabilityAssetsRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DataObservabilityAssetsRequest.class.equals(Integer.class)
                        || DataObservabilityAssetsRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DataObservabilityAssetsRequest.class.equals(Float.class)
                        || DataObservabilityAssetsRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DataObservabilityAssetsRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DataObservabilityAssetsRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DataObservabilityAssetsRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DataObservabilityAssetsRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DataObservabilityAssetsRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER, "Input data does not match schema 'DataObservabilityAssetsRequest'", e);
      }

      // deserialize DoraListStreamRequest
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DoraListStreamRequest.class.equals(Integer.class)
            || DoraListStreamRequest.class.equals(Long.class)
            || DoraListStreamRequest.class.equals(Float.class)
            || DoraListStreamRequest.class.equals(Double.class)
            || DoraListStreamRequest.class.equals(Boolean.class)
            || DoraListStreamRequest.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DoraListStreamRequest.class.equals(Integer.class)
                        || DoraListStreamRequest.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DoraListStreamRequest.class.equals(Float.class)
                        || DoraListStreamRequest.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DoraListStreamRequest.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DoraListStreamRequest.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp = tree.traverse(jp.getCodec()).readValueAs(DoraListStreamRequest.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DoraListStreamRequest) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(Level.FINER, "Input data matches schema 'DoraListStreamRequest'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(Level.FINER, "Input data does not match schema 'DoraListStreamRequest'", e);
      }

      ListStreamRequest ret = new ListStreamRequest();
      if (match == 1) {
        ret.setActualInstance(deserialized);
      } else {
        Map<String, Object> res =
            new ObjectMapper()
                .readValue(
                    tree.traverse(jp.getCodec()).readValueAsTree().toString(),
                    new TypeReference<Map<String, Object>>() {});
        ret.setActualInstance(new UnparsedObject(res));
      }
      return ret;
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public ListStreamRequest getNullValue(DeserializationContext ctxt) throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "ListStreamRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public ListStreamRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public ListStreamRequest(EventsListStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ListStreamRequest(IssueStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ListStreamRequest(CaseStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ListStreamRequest(WatchdogAlertsRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ListStreamRequest(IncidentsStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ListStreamRequest(DatabaseRecommendationsStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ListStreamRequest(ApmRecommendationsStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ListStreamRequest(DetectionRuleStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ListStreamRequest(DataObservabilityAssetsRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public ListStreamRequest(DoraListStreamRequest o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put("EventsListStreamRequest", new GenericType<EventsListStreamRequest>() {});
    schemas.put("IssueStreamRequest", new GenericType<IssueStreamRequest>() {});
    schemas.put("CaseStreamRequest", new GenericType<CaseStreamRequest>() {});
    schemas.put("WatchdogAlertsRequest", new GenericType<WatchdogAlertsRequest>() {});
    schemas.put("IncidentsStreamRequest", new GenericType<IncidentsStreamRequest>() {});
    schemas.put(
        "DatabaseRecommendationsStreamRequest",
        new GenericType<DatabaseRecommendationsStreamRequest>() {});
    schemas.put(
        "ApmRecommendationsStreamRequest", new GenericType<ApmRecommendationsStreamRequest>() {});
    schemas.put("DetectionRuleStreamRequest", new GenericType<DetectionRuleStreamRequest>() {});
    schemas.put(
        "DataObservabilityAssetsRequest", new GenericType<DataObservabilityAssetsRequest>() {});
    schemas.put("DoraListStreamRequest", new GenericType<DoraListStreamRequest>() {});
    JSON.registerDescendants(ListStreamRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return ListStreamRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: EventsListStreamRequest, IssueStreamRequest,
   * CaseStreamRequest, WatchdogAlertsRequest, IncidentsStreamRequest,
   * DatabaseRecommendationsStreamRequest, ApmRecommendationsStreamRequest,
   * DetectionRuleStreamRequest, DataObservabilityAssetsRequest, DoraListStreamRequest
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(EventsListStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(IssueStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(CaseStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(WatchdogAlertsRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(IncidentsStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DatabaseRecommendationsStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        ApmRecommendationsStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(DetectionRuleStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DataObservabilityAssetsRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(DoraListStreamRequest.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be EventsListStreamRequest, IssueStreamRequest,"
            + " CaseStreamRequest, WatchdogAlertsRequest, IncidentsStreamRequest,"
            + " DatabaseRecommendationsStreamRequest, ApmRecommendationsStreamRequest,"
            + " DetectionRuleStreamRequest, DataObservabilityAssetsRequest, DoraListStreamRequest");
  }

  /**
   * Get the actual instance, which can be the following: EventsListStreamRequest,
   * IssueStreamRequest, CaseStreamRequest, WatchdogAlertsRequest, IncidentsStreamRequest,
   * DatabaseRecommendationsStreamRequest, ApmRecommendationsStreamRequest,
   * DetectionRuleStreamRequest, DataObservabilityAssetsRequest, DoraListStreamRequest
   *
   * @return The actual instance (EventsListStreamRequest, IssueStreamRequest, CaseStreamRequest,
   *     WatchdogAlertsRequest, IncidentsStreamRequest, DatabaseRecommendationsStreamRequest,
   *     ApmRecommendationsStreamRequest, DetectionRuleStreamRequest,
   *     DataObservabilityAssetsRequest, DoraListStreamRequest)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `EventsListStreamRequest`. If the actual instance is not
   * `EventsListStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `EventsListStreamRequest`
   * @throws ClassCastException if the instance is not `EventsListStreamRequest`
   */
  public EventsListStreamRequest getEventsListStreamRequest() throws ClassCastException {
    return (EventsListStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `IssueStreamRequest`. If the actual instance is not
   * `IssueStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `IssueStreamRequest`
   * @throws ClassCastException if the instance is not `IssueStreamRequest`
   */
  public IssueStreamRequest getIssueStreamRequest() throws ClassCastException {
    return (IssueStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `CaseStreamRequest`. If the actual instance is not
   * `CaseStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `CaseStreamRequest`
   * @throws ClassCastException if the instance is not `CaseStreamRequest`
   */
  public CaseStreamRequest getCaseStreamRequest() throws ClassCastException {
    return (CaseStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `WatchdogAlertsRequest`. If the actual instance is not
   * `WatchdogAlertsRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `WatchdogAlertsRequest`
   * @throws ClassCastException if the instance is not `WatchdogAlertsRequest`
   */
  public WatchdogAlertsRequest getWatchdogAlertsRequest() throws ClassCastException {
    return (WatchdogAlertsRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `IncidentsStreamRequest`. If the actual instance is not
   * `IncidentsStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `IncidentsStreamRequest`
   * @throws ClassCastException if the instance is not `IncidentsStreamRequest`
   */
  public IncidentsStreamRequest getIncidentsStreamRequest() throws ClassCastException {
    return (IncidentsStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DatabaseRecommendationsStreamRequest`. If the actual instance is
   * not `DatabaseRecommendationsStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DatabaseRecommendationsStreamRequest`
   * @throws ClassCastException if the instance is not `DatabaseRecommendationsStreamRequest`
   */
  public DatabaseRecommendationsStreamRequest getDatabaseRecommendationsStreamRequest()
      throws ClassCastException {
    return (DatabaseRecommendationsStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `ApmRecommendationsStreamRequest`. If the actual instance is not
   * `ApmRecommendationsStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `ApmRecommendationsStreamRequest`
   * @throws ClassCastException if the instance is not `ApmRecommendationsStreamRequest`
   */
  public ApmRecommendationsStreamRequest getApmRecommendationsStreamRequest()
      throws ClassCastException {
    return (ApmRecommendationsStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DetectionRuleStreamRequest`. If the actual instance is not
   * `DetectionRuleStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DetectionRuleStreamRequest`
   * @throws ClassCastException if the instance is not `DetectionRuleStreamRequest`
   */
  public DetectionRuleStreamRequest getDetectionRuleStreamRequest() throws ClassCastException {
    return (DetectionRuleStreamRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DataObservabilityAssetsRequest`. If the actual instance is not
   * `DataObservabilityAssetsRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DataObservabilityAssetsRequest`
   * @throws ClassCastException if the instance is not `DataObservabilityAssetsRequest`
   */
  public DataObservabilityAssetsRequest getDataObservabilityAssetsRequest()
      throws ClassCastException {
    return (DataObservabilityAssetsRequest) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DoraListStreamRequest`. If the actual instance is not
   * `DoraListStreamRequest`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DoraListStreamRequest`
   * @throws ClassCastException if the instance is not `DoraListStreamRequest`
   */
  public DoraListStreamRequest getDoraListStreamRequest() throws ClassCastException {
    return (DoraListStreamRequest) super.getActualInstance();
  }
}
