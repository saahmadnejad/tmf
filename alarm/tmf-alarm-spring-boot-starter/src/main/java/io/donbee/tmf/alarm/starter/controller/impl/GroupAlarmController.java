package io.donbee.tmf.alarm.starter.controller.impl;

import io.donbee.tmf.alarm.starter.controller.GroupAlarmApi;
import io.donbee.tmf.alarm.starter.service.GroupAlarmService;
import io.donbee.tmf.alarm.common.model.GroupAlarm;
import io.donbee.tmf.alarm.common.model.GroupAlarmFVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class GroupAlarmController implements GroupAlarmApi {

    private final GroupAlarmService service;

    @Override
    public ResponseEntity<GroupAlarm> createGroupAlarm(GroupAlarmFVO groupAlarmFVO, String fields) {
        return service.createGroupAlarm(groupAlarmFVO, fields);
    }

    @Override
    public ResponseEntity<List<GroupAlarm>> listGroupAlarm(String fields, Integer offset, Integer limit) {
        return service.listGroupAlarm(fields, offset, limit);
    }

    @Override
    public ResponseEntity<GroupAlarm> retrieveGroupAlarm(String id, String fields) {
        return service.retrieveGroupAlarm(id, fields);
    }
}
