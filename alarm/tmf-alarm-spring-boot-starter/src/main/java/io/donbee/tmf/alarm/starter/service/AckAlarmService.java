package io.donbee.tmf.alarm.starter.service;

import io.donbee.tmf.alarm.common.model.AckAlarm;
import io.donbee.tmf.alarm.common.model.AckAlarmFVO;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Service interface for AckAlarm (Alarm Acknowledgment) operations.
 * <p>
 * All methods have corresponding REST endpoints defined in
 * {@link io.donbee.tmf.alarm.starter.controller.AckAlarmApi}.
 */
public interface AckAlarmService {

    /**
     * Creates a new alarm acknowledgment.
     *
     * @param ackAlarmFVO the acknowledgment payload
     * @param fields      comma-separated list of fields to return (optional)
     * @return created AckAlarm with HTTP 201
     * @see io.donbee.tmf.alarm.starter.controller.AckAlarmApi#createAckAlarm(AckAlarmFVO, String)
     */
    ResponseEntity<AckAlarm> createAckAlarm(AckAlarmFVO ackAlarmFVO, String fields);

    /**
     * Lists or searches alarm acknowledgments.
     *
     * @param fields comma-separated list of fields to return (optional)
     * @param offset requested index for start of page (optional)
     * @param limit  requested page size (optional)
     * @return list of AckAlarm objects
     * @see io.donbee.tmf.alarm.starter.controller.AckAlarmApi#listAckAlarm(String, Integer, Integer)
     */
    ResponseEntity<List<AckAlarm>> listAckAlarm(String fields, Integer offset, Integer limit);

    /**
     * Retrieves a single alarm acknowledgment by its identifier.
     *
     * @param id     identifier of the acknowledgment
     * @param fields comma-separated list of fields to return (optional)
     * @return the AckAlarm object
     * @see io.donbee.tmf.alarm.starter.controller.AckAlarmApi#retrieveAckAlarm(String, String)
     */
    ResponseEntity<AckAlarm> retrieveAckAlarm(String id, String fields);
}
