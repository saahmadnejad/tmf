package io.donbee.tmf.alarm.starter.service;

import io.donbee.tmf.alarm.common.model.UnAckAlarm;
import io.donbee.tmf.alarm.common.model.UnAckAlarmFVO;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Service interface for UnAckAlarm (Unacknowledged Alarm) operations.
 * <p>
 * All methods have corresponding REST endpoints defined in
 * {@link io.donbee.tmf.alarm.starter.controller.UnAckAlarmApi}.
 */
public interface UnAckAlarmService {

    /**
     * Creates a new unacknowledged alarm entry.
     *
     * @param unAckAlarmFVO the payload for the unacknowledged alarm
     * @param fields        comma-separated list of fields to return (optional)
     * @return created UnAckAlarm with HTTP 201
     * @see io.donbee.tmf.alarm.starter.controller.UnAckAlarmApi#createUnAckAlarm(UnAckAlarmFVO, String)
     */
    ResponseEntity<UnAckAlarm> createUnAckAlarm(UnAckAlarmFVO unAckAlarmFVO, String fields);

    /**
     * Lists or searches unacknowledged alarm entries.
     *
     * @param fields comma-separated list of fields to return (optional)
     * @param offset requested index for start of page (optional)
     * @param limit  requested page size (optional)
     * @return list of UnAckAlarm objects
     * @see io.donbee.tmf.alarm.starter.controller.UnAckAlarmApi#listUnAckAlarm(String, Integer, Integer)
     */
    ResponseEntity<List<UnAckAlarm>> listUnAckAlarm(String fields, Integer offset, Integer limit);

    /**
     * Retrieves a single unacknowledged alarm entry by its identifier.
     *
     * @param id     identifier of the unacknowledged alarm
     * @param fields comma-separated list of fields to return (optional)
     * @return the UnAckAlarm object
     * @see io.donbee.tmf.alarm.starter.controller.UnAckAlarmApi#retrieveUnAckAlarm(String, String)
     */
    ResponseEntity<UnAckAlarm> retrieveUnAckAlarm(String id, String fields);
}
