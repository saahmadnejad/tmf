package io.donbee.tmf.alarm.starter.service;

import io.donbee.tmf.alarm.common.model.Alarm;
import io.donbee.tmf.alarm.common.model.AlarmFVO;
import io.donbee.tmf.alarm.common.model.AlarmMVO;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Service interface for Alarm management operations.
 * <p>
 * All methods correspond to the REST endpoints defined in
 * {@link io.donbee.tmf.alarm.starter.controller.AlarmApi}.
 */
public interface AlarmService {

    /**
     * Creates a new Alarm.
     *
     * @param alarmFVO the alarm payload to create
     * @param fields   comma-separated list of fields to return (optional)
     * @return created Alarm with HTTP 201
     * @see io.donbee.tmf.alarm.starter.controller.AlarmApi#createAlarm(AlarmFVO, String)
     */
    ResponseEntity<Alarm> createAlarm(AlarmFVO alarmFVO, String fields);

    /**
     * Deletes an existing Alarm by its identifier.
     *
     * @param id identifier of the alarm to delete
     * @return no content (204) or accepted (202)
     * @see io.donbee.tmf.alarm.starter.controller.AlarmApi#deleteAlarm(String)
     */
    ResponseEntity<Void> deleteAlarm(String id);

    /**
     * Lists or searches Alarm objects with optional filtering and pagination.
     *
     * @param fields comma-separated fields to include in response (optional)
     * @param offset pagination offset (optional)
     * @param limit  maximum number of items to return (optional)
     * @return list of Alarm objects
     * @see io.donbee.tmf.alarm.starter.controller.AlarmApi#listAlarm(String, Integer, Integer)
     */
    ResponseEntity<List<Alarm>> listAlarm(String fields, Integer offset, Integer limit);

    /**
     * Partially updates an existing Alarm (PATCH).
     *
     * @param id       identifier of the alarm to update
     * @param alarmMVO partial update payload
     * @param fields   comma-separated fields to return (optional)
     * @return updated Alarm
     * @see io.donbee.tmf.alarm.starter.controller.AlarmApi#patchAlarm(String, AlarmMVO, String)
     */
    ResponseEntity<Alarm> patchAlarm(String id, AlarmMVO alarmMVO, String fields);

    /**
     * Retrieves a single Alarm by its identifier.
     *
     * @param id     identifier of the alarm
     * @param fields comma-separated fields to include (optional, supports field filtering)
     * @return the Alarm object
     * @see io.donbee.tmf.alarm.starter.controller.AlarmApi#retrieveAlarm(String, String)
     */
    ResponseEntity<Alarm> retrieveAlarm(String id, String fields);
}
