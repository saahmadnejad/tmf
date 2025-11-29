package io.donbee.tmf.alarm.starter.service;

import io.donbee.tmf.alarm.common.model.UnGroupAlarm;
import io.donbee.tmf.alarm.common.model.UnGroupAlarmFVO;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Service interface for UnGroupAlarm (Alarm Un-Grouping) operations.
 * <p>
 * All methods have corresponding REST endpoints defined in
 * {@link io.donbee.tmf.alarm.starter.controller.UnGroupAlarmApi}.
 */
public interface UnGroupAlarmService {

    /**
     * Creates a new un-group alarm request.
     *
     * @param unGroupAlarmFVO the un-group payload
     * @param fields          comma-separated list of fields to return (optional)
     * @return created UnGroupAlarm with HTTP 201
     * @see io.donbee.tmf.alarm.starter.controller.UnGroupAlarmApi#createUnGroupAlarm(UnGroupAlarmFVO, String)
     */
    ResponseEntity<UnGroupAlarm> createUnGroupAlarm(UnGroupAlarmFVO unGroupAlarmFVO, String fields);

    /**
     * Lists or searches un-group alarm requests.
     *
     * @param fields comma-separated list of fields to return (optional)
     * @param offset requested index for start of page (optional)
     * @param limit  requested page size (optional)
     * @return list of UnGroupAlarm objects
     * @see io.donbee.tmf.alarm.starter.controller.UnGroupAlarmApi#listUnGroupAlarm(String, Integer, Integer)
     */
    ResponseEntity<List<UnGroupAlarm>> listUnGroupAlarm(String fields, Integer offset, Integer limit);

    /**
     * Retrieves a single un-group alarm request by its identifier.
     *
     * @param id     identifier of the un-group request
     * @param fields comma-separated list of fields to return (optional)
     * @return the UnGroupAlarm object
     * @see io.donbee.tmf.alarm.starter.controller.UnGroupAlarmApi#retrieveUnGroupAlarm(String, String)
     */
    ResponseEntity<UnGroupAlarm> retrieveUnGroupAlarm(String id, String fields);
}
