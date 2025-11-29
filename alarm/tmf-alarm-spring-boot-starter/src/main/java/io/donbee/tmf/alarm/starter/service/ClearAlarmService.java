package io.donbee.tmf.alarm.starter.service;

import io.donbee.tmf.alarm.common.model.ClearAlarm;
import io.donbee.tmf.alarm.common.model.ClearAlarmFVO;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Service interface for ClearAlarm (Alarm Clearing) operations.
 * <p>
 * All methods have corresponding REST endpoints defined in
 * {@link io.donbee.tmf.alarm.starter.controller.ClearAlarmApi}.
 */
public interface ClearAlarmService {

    /**
     * Creates a new alarm clearing.
     *
     * @param clearAlarmFVO the clearing payload
     * @param fields        comma-separated list of fields to return (optional)
     * @return created ClearAlarm with HTTP 201
     * @see io.donbee.tmf.alarm.starter.controller.ClearAlarmApi#createClearAlarm(ClearAlarmFVO, String)
     */
    ResponseEntity<ClearAlarm> createClearAlarm(ClearAlarmFVO clearAlarmFVO, String fields);

    /**
     * Lists or searches alarm clearings.
     *
     * @param fields comma-separated list of fields to return (optional)
     * @param offset requested index for start of page (optional)
     * @param limit  requested page size (optional)
     * @return list of ClearAlarm objects
     * @see io.donbee.tmf.alarm.starter.controller.ClearAlarmApi#listClearAlarm(String, Integer, Integer)
     */
    ResponseEntity<List<ClearAlarm>> listClearAlarm(String fields, Integer offset, Integer limit);

    /**
     * Retrieves a single alarm clearing by its identifier.
     *
     * @param id     identifier of the clearing
     * @param fields comma-separated list of fields to return (optional)
     * @return the ClearAlarm object
     * @see io.donbee.tmf.alarm.starter.controller.ClearAlarmApi#retrieveClearAlarm(String, String)
     */
    ResponseEntity<ClearAlarm> retrieveClearAlarm(String id, String fields);
}
