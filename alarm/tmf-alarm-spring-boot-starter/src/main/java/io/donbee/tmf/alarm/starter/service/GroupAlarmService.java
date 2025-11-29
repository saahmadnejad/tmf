package io.donbee.tmf.alarm.starter.service;

import io.donbee.tmf.alarm.common.model.GroupAlarm;
import io.donbee.tmf.alarm.common.model.GroupAlarmFVO;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Service interface for GroupAlarm (Alarm Grouping) operations.
 * <p>
 * All methods have corresponding REST endpoints defined in
 * {@link io.donbee.tmf.alarm.starter.controller.GroupAlarmApi}.
 */
public interface GroupAlarmService {

    /**
     * Creates a new alarm group.
     *
     * @param groupAlarmFVO the group payload
     * @param fields        comma-separated list of fields to return (optional)
     * @return created GroupAlarm with HTTP 201
     * @see io.donbee.tmf.alarm.starter.controller.GroupAlarmApi#createGroupAlarm(GroupAlarmFVO, String)
     */
    ResponseEntity<GroupAlarm> createGroupAlarm(GroupAlarmFVO groupAlarmFVO, String fields);

    /**
     * Lists or searches alarm groups.
     *
     * @param fields comma-separated list of fields to return (optional)
     * @param offset requested index for start of page (optional)
     * @param limit  requested page size (optional)
     * @return list of GroupAlarm objects
     * @see io.donbee.tmf.alarm.starter.controller.GroupAlarmApi#listGroupAlarm(String, Integer, Integer)
     */
    ResponseEntity<List<GroupAlarm>> listGroupAlarm(String fields, Integer offset, Integer limit);

    /**
     * Retrieves a single alarm group by its identifier.
     *
     * @param id     identifier of the group
     * @param fields comma-separated list of fields to return (optional)
     * @return the GroupAlarm object
     * @see io.donbee.tmf.alarm.starter.controller.GroupAlarmApi#retrieveGroupAlarm(String, String)
     */
    ResponseEntity<GroupAlarm> retrieveGroupAlarm(String id, String fields);
}
